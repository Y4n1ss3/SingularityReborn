package com.lumi.singularity.system;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.VpnService;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.lumi.singularity.R;
import defpackage.g30;
import defpackage.i2;
import defpackage.xc0;
import defpackage.yr;
import defpackage.ys0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DnsBlockerService extends VpnService {
    public static final int $stable = 8;
    public static final String ACTION_START = "com.lumi.singularity.START_KILL_SWITCH";
    public static final String ACTION_STOP = "com.lumi.singularity.STOP_KILL_SWITCH";
    public static final yr Companion = new yr();
    private static final String NOTIFICATION_CHANNEL_ID = "kill_switch_channel";
    private static final int NOTIFICATION_ID = 4;
    private static final String TAG = "KillSwitchVpnService";
    private final g30 sharedPrefs$delegate = new ys0(new i2(this, 14));
    private ParcelFileDescriptor vpnInterface;

    private final Notification buildNotification() {
        createNotificationChannel();
        xc0 xc0Var = new xc0(this, NOTIFICATION_CHANNEL_ID);
        xc0Var.e = xc0.b("Singularity Kill Switch");
        xc0Var.f = xc0.b("Internet access is temporarily blocked.");
        xc0Var.l.icon = R.drawable.ic_launcher_foreground;
        xc0Var.g = -1;
        xc0Var.c();
        Notification a = xc0Var.a();
        a.getClass();
        return a;
    }

    private final void createNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, "Kill Switch Service", 2);
        Object systemService = getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
    }

    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.sharedPrefs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences sharedPrefs_delegate$lambda$0(DnsBlockerService dnsBlockerService) {
        return dnsBlockerService.getSharedPreferences("singularity_prefs", 0);
    }

    private final void startKillSwitch() {
        if (this.vpnInterface != null) {
            Log.d(TAG, "Kill switch is already running.");
            return;
        }
        startForeground(4, buildNotification());
        VpnService.Builder addRoute = new VpnService.Builder(this).setSession(getString(R.string.app_name) + " Kill Switch").addAddress("10.8.0.2", 24).addRoute("0.0.0.0", 0);
        addRoute.getClass();
        ParcelFileDescriptor establish = addRoute.establish();
        this.vpnInterface = establish;
        if (establish == null) {
            Log.e(TAG, "Failed to establish VPN interface for kill switch.");
            stopKillSwitch();
        } else {
            Log.i(TAG, "Internet kill switch is now ACTIVE.");
            getSharedPrefs().edit().putBoolean("blocker_is_running", true).apply();
        }
    }

    private final void stopKillSwitch() {
        Log.i(TAG, "Internet kill switch is being deactivated.");
        getSharedPrefs().edit().putBoolean("blocker_is_running", false).apply();
        try {
            ParcelFileDescriptor parcelFileDescriptor = this.vpnInterface;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
        } catch (Exception e) {
            Log.e(TAG, "Error closing VPN interface.", e);
        }
        this.vpnInterface = null;
        stopForeground(true);
        stopSelf();
    }

    @Override // android.net.VpnService
    public void onRevoke() {
        Log.w(TAG, "VPN revoked by system!");
        getSharedPrefs().edit().putBoolean("blocker_is_running", false).apply();
        stopKillSwitch();
        super.onRevoke();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String action = intent != null ? intent.getAction() : null;
        if (action == null) {
            return 1;
        }
        int hashCode = action.hashCode();
        if (hashCode == 52401669) {
            if (!action.equals(ACTION_START)) {
                return 1;
            }
            startKillSwitch();
            return 1;
        }
        if (hashCode != 382741899 || !action.equals(ACTION_STOP)) {
            return 1;
        }
        stopKillSwitch();
        return 1;
    }
}
