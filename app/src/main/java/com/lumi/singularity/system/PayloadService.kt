package com.lumi.singularity.system

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.IBinder
import androidx.core.app.NotificationCompat
import com.lumi.singularity.utils.AssetUtils
import com.lumi.singularity.utils.RootUtils
import kotlinx.coroutines.*
import java.io.File

class PayloadService : Service() {

    private val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val payloads = intent?.getStringArrayListExtra("payloads") ?: return START_NOT_STICKY
        
        createNotificationChannel()
        val notification = createNotification("Executing ${payloads.size} payload(s)...")
        startForeground(NOTIFICATION_ID, notification)

        scope.launch {
            try {
                executePayloads(payloads)
            } catch (e: Exception) {
                android.util.Log.e(TAG, "Payload execution failed", e)
            } finally {
                stopSelf()
            }
        }

        return START_NOT_STICKY
    }

    private suspend fun executePayloads(payloads: List<String>) {
        // Extract payload scripts from APK
        val payloadsDir = AssetUtils.extractPayloadAssets(applicationContext)
        val exploitDir = AssetUtils.extractExploitAssets(applicationContext)
        
        // Push payloads to /data/local/tmp/payloads
        val tmpDir = File("/data/local/tmp/payloads")
        RootUtils.executeRootCommand("rm -rf $tmpDir")
        RootUtils.executeRootCommand("mkdir -p $tmpDir")
        
        // Copy all payload scripts
        payloadsDir.walkTopDown().forEach { file ->
            if (file.isFile) {
                val destFile = File(tmpDir, file.name)
                RootUtils.executeRootCommand("cp '${file.absolutePath}' '${destFile.absolutePath}'")
                RootUtils.executeRootCommand("chmod 755 '${destFile.absolutePath}'")
            }
        }

        // Copy additional payload files (magisk.apk, Zygisk.ko, etc.)
        exploitDir.walkTopDown().forEach { file ->
            if (file.isFile && (file.name.endsWith(".apk") || file.name.endsWith(".ko"))) {
                val destFile = File(tmpDir, file.name)
                RootUtils.executeRootCommand("cp '${file.absolutePath}' '${destFile.absolutePath}'")
                RootUtils.executeRootCommand("chmod 644 '${destFile.absolutePath}'")
                android.util.Log.i(TAG, "Copied payload file: ${file.name}")
            }
        }

        // Copy bootanimation assets if bootanimation payload is selected
        if ("bootanimation" in payloads) {
            val bootanimDir = File(applicationContext.filesDir, "bootanimation")
            AssetUtils.extractAssetDirectory(applicationContext, "bootanimation", bootanimDir)
            
            // Copy the custom animation to /data/local/tmp/meta-horizonos.glb
            val customAnim = File(bootanimDir, "singularity-blackhole.glb")
            if (customAnim.exists()) {
                RootUtils.executeRootCommand("cp '${customAnim.absolutePath}' /data/local/tmp/meta-horizonos.glb")
                RootUtils.executeRootCommand("chmod 644 /data/local/tmp/meta-horizonos.glb")
                android.util.Log.i(TAG, "Copied bootanimation asset")
            }
            
            // Copy sound overlay if present
            val soundOverlay = File(bootanimDir, "StartupSoundOverlay.apk")
            if (soundOverlay.exists()) {
                RootUtils.executeRootCommand("cp '${soundOverlay.absolutePath}' /data/local/tmp/StartupSoundOverlay.apk")
                RootUtils.executeRootCommand("chmod 644 /data/local/tmp/StartupSoundOverlay.apk")
                android.util.Log.i(TAG, "Copied sound overlay")
            }
        }

        // Copy Magisk APK if singularity_magisk payload is selected
        if ("singularity_magisk" in payloads) {
            val magiskApk = File(exploitDir, "magisk.apk")
            if (magiskApk.exists()) {
                RootUtils.executeRootCommand("cp '${magiskApk.absolutePath}' /data/local/tmp/singularity-Magisk.apk")
                RootUtils.executeRootCommand("chmod 644 /data/local/tmp/singularity-Magisk.apk")
                android.util.Log.i(TAG, "Copied Magisk APK")
            }
        }

        // Always run wake.sh first if it exists
        val wakeScript = File(tmpDir, "wake.sh")
        if (wakeScript.exists()) {
            android.util.Log.i(TAG, "Running wake.sh")
            RootUtils.executeRootCommand("cd $tmpDir && sh wake.sh")
        }

        // Execute each selected payload
        payloads.forEach { payload ->
            android.util.Log.i(TAG, "Executing payload: $payload")
            val scriptFile = File(tmpDir, "$payload.sh")
            if (scriptFile.exists()) {
                val result = RootUtils.executeRootCommand("cd $tmpDir && sh ${scriptFile.name}")
                android.util.Log.i(TAG, "Payload $payload result: ${result.output}")
                if (!result.success) {
                    android.util.Log.e(TAG, "Payload $payload failed: ${result.error}")
                }
            } else {
                android.util.Log.w(TAG, "Payload script not found: ${scriptFile.absolutePath}")
            }
        }

        android.util.Log.i(TAG, "All payloads executed")
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                "Payload Service",
                NotificationManager.IMPORTANCE_LOW
            ).apply {
                description = "Executing root payloads"
            }
            val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel)
        }
    }

    private fun createNotification(text: String): Notification {
        return NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("Singularity")
            .setContentText(text)
            .setSmallIcon(android.R.drawable.ic_menu_manage)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setOngoing(true)
            .build()
    }

    override fun onDestroy() {
        super.onDestroy()
        scope.cancel()
    }

    companion object {
        private const val TAG = "PayloadService"
        private const val CHANNEL_ID = "payload_channel"
        private const val NOTIFICATION_ID = 1002
    }
}