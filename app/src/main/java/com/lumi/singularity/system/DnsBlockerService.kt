package com.lumi.singularity.system

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Intent
import android.content.SharedPreferences
import android.net.VpnService
import android.os.ParcelFileDescriptor
import android.util.Log
import com.lumi.singularity.R
import kotlinx.coroutines.*

class DnsBlockerService : VpnService() {

    private val sharedPrefs: SharedPreferences by lazy {
        getSharedPreferences("singularity_prefs", MODE_PRIVATE)
    }

    private var vpnInterface: ParcelFileDescriptor? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val action = intent?.action ?: return START_STICKY

        when (action) {
            ACTION_START -> startKillSwitch()
            ACTION_STOP -> stopKillSwitch()
        }

        return START_STICKY
    }

    private fun startKillSwitch() {
        if (vpnInterface != null) {
            Log.d(TAG, "Kill switch is already running.")
            return
        }

        startForeground(NOTIFICATION_ID, buildNotification())

        val builder = Builder()
            .setSession("${getString(R.string.app_name)} Kill Switch")
            .addAddress("10.8.0.2", 24)
            .addRoute("0.0.0.0", 0)

        val vpnInterface = builder.establish()
        this.vpnInterface = vpnInterface

        if (vpnInterface == null) {
            Log.e(TAG, "Failed to establish VPN interface for kill switch.")
            stopKillSwitch()
        } else {
            Log.i(TAG, "Internet kill switch is now ACTIVE.")
            sharedPrefs.edit().putBoolean("blocker_is_running", true).apply()
        }
    }

    private fun stopKillSwitch() {
        Log.i(TAG, "Internet kill switch is being deactivated.")
        sharedPrefs.edit().putBoolean("blocker_is_running", false).apply()

        try {
            vpnInterface?.close()
        } catch (e: Exception) {
            Log.e(TAG, "Error closing VPN interface.", e)
        }

        vpnInterface = null
        stopForeground(true)
        stopSelf()
    }

    override fun onRevoke() {
        Log.w(TAG, "VPN revoked by system!")
        sharedPrefs.edit().putBoolean("blocker_is_running", false).apply()
        stopKillSwitch()
        super.onRevoke()
    }

    private fun buildNotification(): Notification {
        createNotificationChannel()

        return Notification.Builder(this, NOTIFICATION_CHANNEL_ID)
            .setContentTitle("Singularity Kill Switch")
            .setContentText("Internet access is temporarily blocked.")
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setOngoing(true)
            .build()
    }

    private fun createNotificationChannel() {
        val channel = NotificationChannel(
            NOTIFICATION_CHANNEL_ID,
            "Kill Switch Service",
            NotificationManager.IMPORTANCE_LOW
        ).apply {
            description = "Kill switch notification channel"
        }

        val notificationManager = getSystemService(NotificationManager::class.java)
        notificationManager.createNotificationChannel(channel)
    }

    companion object {
        const val ACTION_START = "com.lumi.singularity.START_KILL_SWITCH"
        const val ACTION_STOP = "com.lumi.singularity.STOP_KILL_SWITCH"
        private const val TAG = "KillSwitchVpnService"
        private const val NOTIFICATION_CHANNEL_ID = "kill_switch_channel"
        private const val NOTIFICATION_ID = 4
    }
}
