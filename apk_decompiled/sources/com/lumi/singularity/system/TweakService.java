package com.lumi.singularity.system;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.IBinder;
import android.util.Log;
import defpackage.b20;
import defpackage.b80;
import defpackage.bg;
import defpackage.cq;
import defpackage.d4;
import defpackage.d41;
import defpackage.hm;
import defpackage.hm0;
import defpackage.hq;
import defpackage.hr;
import defpackage.im;
import defpackage.kh0;
import defpackage.mw0;
import defpackage.nq;
import defpackage.nr;
import defpackage.o;
import defpackage.o3;
import defpackage.of;
import defpackage.p01;
import defpackage.p10;
import defpackage.qs0;
import defpackage.qw0;
import defpackage.rh0;
import defpackage.rr0;
import defpackage.u3;
import defpackage.u50;
import defpackage.us0;
import defpackage.uv;
import defpackage.v50;
import defpackage.vn;
import defpackage.w01;
import defpackage.w50;
import defpackage.wc0;
import defpackage.xc0;
import defpackage.y80;
import defpackage.ys0;
import defpackage.zl;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TweakService extends Service {
    public static final /* synthetic */ int T = 0;
    public boolean A;
    public boolean B;
    public rr0 C;
    public kh0 D;
    public File E;
    public File F;
    public File G;
    public File H;
    public File I;
    public File J;
    public File K;
    public File L;
    public File M;
    public File N;
    public File O;
    public File P;
    public File Q;
    public File R;
    public File S;
    public final b20 d;
    public final zl e;
    public final zl f;
    public final String g;
    public final ys0 h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public TweakService() {
        b20 b20Var = new b20(null);
        this.d = b20Var;
        nq nqVar = nr.a;
        hq hqVar = hq.d;
        this.e = p10.a(hqVar.plus(b20Var));
        this.f = p10.a(y80.I(new qs0(null), hqVar));
        this.g = "TweakService";
        this.h = new ys0(new hm0(this, 17));
        this.i = "#!/system/bin/sh\n\nlogcat -c\n\n# Background watcher: switch to MTP when Steam Link / Virtual Desktop closes while USB is active\n(\n    was_visible=false\n    while true; do\n        if dumpsys activity activities 2>/dev/null | grep -E \"com.valvesoftware.steamlinkvr|VirtualDesktop.Android\" | grep -q \"visible=true\"; then\n            was_visible=true\n        else\n            if [ \"$was_visible\" = \"true\" ]; then\n                usb_state=$(dumpsys usb 2>/dev/null | awk -F= '/kernel_state=/{print $2; exit}')\n                if [ \"$usb_state\" = \"CONFIGURED\" ]; then\n                    svc usb setFunctions mtp\n                    am force-stop com.oculus.notification_proxy\n                fi\n            fi\n            was_visible=false\n        fi\n        sleep 2\n    done\n) &\n\nlogcat -T 0 OculusNotificationListenerService:D *:S | while read -r line; do\n    case \"$line\" in\n        *\"Notification posted:\"*\"usb_connect_enable_mtp\"*)\n            if dumpsys activity activities 2>/dev/null | grep -E \"com.valvesoftware.steamlinkvr|VirtualDesktop.Android\" | grep -q \"visible=true\"; then\n                : # Steam Link VR or Virtual Desktop is visible — skip MTP override\n            else\n                svc usb setFunctions mtp\n                am force-stop com.oculus.notification_proxy\n            fi\n            ;;\n    esac\ndone";
        this.j = "#!/system/bin/sh\nSTATUS_FILE=\"/data/adb/singularity/sl_ota_status.txt\"\n\ntouch \"$STATUS_FILE\"\nchmod 666 \"$STATUS_FILE\"\necho \"Listening...\" > \"$STATUS_FILE\"\n\nFAIL_COUNT=0\nwhile true; do\n    CLIENT=$(command -v update_engine_client 2>/dev/null)\n    if [ -z \"$CLIENT\" ] || [ ! -x \"$CLIENT\" ]; then\n        echo \"update_engine_client not available - monitor stopped\" > \"$STATUS_FILE\"\n        break\n    fi\n\n    START_TS=$(date +%s)\n    # Redirecting stderr to stdout (2>&1) so the loop can read the INFO logs\n    update_engine_client --follow 2>&1 | while read -r line; do\n        case \"$line\" in\n            *\"UPDATE_AVAILABLE\"*|*\"DOWNLOADING\"*|*\"VERIFYING\"*|*\"FINALIZING\"*)\n                echo \"Action detected: Canceling...\" > \"$STATUS_FILE\"\n                update_engine_client --cancel\n                ;;\n            *\"UPDATED_NEED_REBOOT\"*)\n                echo \"Reboot pending: Resetting...\" > \"$STATUS_FILE\"\n                update_engine_client --reset_status\n                ;;\n            *\"IDLE\"*)\n                echo \"Idle\" > \"$STATUS_FILE\"\n                ;;\n        esac\n    done\n    END_TS=$(date +%s)\n\n    # update_engine_client exiting almost instantly (broken/replaced\n    # binary, linker error, daemon killed, etc.) means it isn't doing\n    # any real monitoring. Back off instead of respawning it every\n    # 5s forever and flooding logcat/CPU.\n    if [ $((END_TS - START_TS)) -lt 2 ]; then\n        FAIL_COUNT=$((FAIL_COUNT + 1))\n    else\n        FAIL_COUNT=0\n    fi\n\n    if [ \"$FAIL_COUNT\" -ge 5 ]; then\n        echo \"update_engine_client failing repeatedly - monitor stopped\" > \"$STATUS_FILE\"\n        break\n    fi\n\n    sleep 5\ndone";
        this.k = "#!/system/bin/sh\nPERSIST_PATH=\"/dev/block/bootdevice/by-name/persist\"\n\nwhile true; do\n    ro=$(blockdev --getro \"$PERSIST_PATH\" 2>/dev/null)\n    if [ \"$ro\" != \"1\" ]; then\n        blockdev --setro \"$PERSIST_PATH\" 2>/dev/null\n    fi\n    sleep 15\ndone";
        this.l = "#!/system/bin/sh\nPKG=com.oculus.xrstreamingclient\nLIB=/odm/lib64/libmc2.so\nEMPTY=/data/local/tmp/empty_mc2.so\nLOG=/data/local/tmp/hide_mc2.log\n\nlog() { echo \"$(date '+%m-%d %T') $*\" >> \"$LOG\"; }\n\nuntil [ \"$(getprop sys.boot_completed)\" = \"1\" ]; do sleep 2; done\n\nif [ -x /data/adb/magisk/busybox ] && /data/adb/magisk/busybox --list | grep -qx nsenter; then\n  NSENTER=\"/data/adb/magisk/busybox nsenter\"\nelif command -v nsenter >/dev/null 2>&1; then\n  NSENTER=nsenter\nelse\n  log \"ERROR: no nsenter found\"; exit 1\nfi\n\n[ -f \"$EMPTY\" ] || : > \"$EMPTY\"\nchmod 644 \"$EMPTY\"\n\nPIDFILE=/data/local/tmp/hide_mc2.pid\nif [ -f \"$PIDFILE\" ] && kill -0 \"$(cat $PIDFILE)\" 2>/dev/null; then\n  log \"already running as $(cat $PIDFILE), exiting\"; exit 0\nfi\necho $$ > \"$PIDFILE\"\n\nlog \"started (lib=$LIB, nsenter=$NSENTER)\"\nlast=\"\"; failpid=\"\"; fails=0\nwhile true; do\n  pid=$(pidof $PKG | awk '{print $1}')\n  if [ -n \"$pid\" ] && [ \"$pid\" != \"$last\" ] && [ -e \"/proc/$pid/ns/mnt\" ]; then\n    if err=$($NSENTER --mount=/proc/$pid/ns/mnt -- /system/bin/mount -o bind \"$EMPTY\" \"$LIB\" 2>&1); then\n      last=$pid; fails=0\n      if grep -q libmc2 /proc/$pid/maps 2>/dev/null; then\n        log \"pid $pid: hidden, but libmc2 was ALREADY loaded (too late) - restart Link\"\n      else\n        log \"pid $pid: libmc2.so hidden\"\n      fi\n    else\n      [ \"$pid\" != \"$failpid\" ] && fails=0 && failpid=$pid\n      fails=$((fails+1))\n      [ $fails -eq 1 ] || [ $((fails % 100)) -eq 0 ] && log \"pid $pid: mount failed ($fails): $err\"\n      [ $fails -ge 300 ] && { log \"pid $pid: giving up on this pid\"; last=$pid; }\n    fi\n  fi\n  sleep 0.05\ndone";
    }

    public static void b(File file, String str) {
        if (file.exists() && uv.L(file).equals(str)) {
            return;
        }
        uv.M(file, str);
        file.setExecutable(true, false);
    }

    public final Notification a() {
        NotificationChannel notificationChannel = new NotificationChannel("tweak_service_channel", "Singularity Background Tweaks", 2);
        notificationChannel.setDescription("Runs persistent root tweaks like LED, CPU frequency locks, and app interception.");
        Object systemService = getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        Intent intent = new Intent(this, (Class<?>) TweakService.class);
        intent.setAction("com.lumi.singularity.STOP_ALL");
        PendingIntent service = PendingIntent.getService(this, 0, intent, 201326592);
        xc0 xc0Var = new xc0(this, "tweak_service_channel");
        xc0Var.e = xc0.b("Singularity Tweaks Active");
        xc0Var.f = xc0.b("Persistent tweaks are being managed.");
        xc0Var.l.icon = R.drawable.ic_lock_power_off;
        xc0Var.g = -1;
        xc0Var.b.add(new wc0(service));
        xc0Var.c();
        xc0Var.h = "singularity_tweaks";
        xc0Var.i = "service";
        Notification a = xc0Var.a();
        a.getClass();
        a.flags |= 32;
        return a;
    }

    public final SharedPreferences c() {
        return (SharedPreferences) this.h.getValue();
    }

    public final boolean d() {
        return this.m || this.n || this.o || this.p || this.q || this.r || this.t || this.v || this.w || this.x || this.y || this.z || this.A || this.D != null;
    }

    public final void e() {
        if (hr.b() == rh0.f && this.D == null) {
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            zl zlVar = this.e;
            kh0 kh0Var = new kh0(applicationContext, zlVar);
            if (!kh0Var.d) {
                of b = d41.b(Integer.MAX_VALUE, 6, null);
                kh0Var.f = b;
                p01.t(zlVar, null, null, new u3(b, kh0Var, (hm) null, 9), 3);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                cq.C(applicationContext, kh0Var.h, intentFilter, 4);
                kh0Var.d = true;
                Intent registerReceiver = applicationContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (((registerReceiver != null ? registerReceiver.getIntExtra("plugged", 0) : 0) & 12) != 0) {
                    kh0Var.e = true;
                    of ofVar = kh0Var.f;
                    if (ofVar != null) {
                        ofVar.m("am broadcast -a com.oculus.vrpowermanager.automation_disable");
                    }
                }
            }
            this.D = kh0Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0113, code lost:
    
        if (r1 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00f9, code lost:
    
        if (r1 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00de, code lost:
    
        if (defpackage.p01.H(defpackage.hq.d, new defpackage.mw0(r17, r6, 18), r2) == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00c8, code lost:
    
        if (r1 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00ad, code lost:
    
        if (r1 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0092, code lost:
    
        if (r1 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0077, code lost:
    
        if (r1 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015d, code lost:
    
        if (r1 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0142, code lost:
    
        if (defpackage.p01.H(defpackage.hq.d, new defpackage.mw0(r17, r6, 16), r2) == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x012c, code lost:
    
        if (r1 == r3) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(im imVar) {
        qw0 qw0Var;
        int i;
        if (imVar instanceof qw0) {
            qw0Var = (qw0) imVar;
            int i2 = qw0Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qw0Var.f = i2 - Integer.MIN_VALUE;
                Object obj = qw0Var.d;
                Object obj2 = vn.d;
                hm hmVar = null;
                switch (qw0Var.f) {
                    case 0:
                        p10.Q(obj);
                        qw0Var.f = 1;
                        nq nqVar = nr.a;
                        Object H = p01.H(hq.d, new mw0(this, hmVar, 14), qw0Var);
                        if (H != obj2) {
                            H = w01.a;
                            break;
                        }
                        break;
                    case 1:
                        p10.Q(obj);
                        qw0Var.f = 2;
                        nq nqVar2 = nr.a;
                        Object H2 = p01.H(hq.d, new mw0(this, hmVar, 22), qw0Var);
                        if (H2 != obj2) {
                            H2 = w01.a;
                            break;
                        }
                        break;
                    case 2:
                        p10.Q(obj);
                        qw0Var.f = 3;
                        nq nqVar3 = nr.a;
                        Object H3 = p01.H(hq.d, new mw0(this, hmVar, 21), qw0Var);
                        if (H3 != obj2) {
                            H3 = w01.a;
                            break;
                        }
                        break;
                    case 3:
                        p10.Q(obj);
                        qw0Var.f = 4;
                        nq nqVar4 = nr.a;
                        Object H4 = p01.H(hq.d, new mw0(this, hmVar, 19), qw0Var);
                        if (H4 != obj2) {
                            H4 = w01.a;
                            break;
                        }
                        break;
                    case 4:
                        p10.Q(obj);
                        qw0Var.f = 5;
                        nq nqVar5 = nr.a;
                        break;
                    case 5:
                        p10.Q(obj);
                        qw0Var.f = 6;
                        nq nqVar6 = nr.a;
                        Object H5 = p01.H(hq.d, new mw0(this, hmVar, 27), qw0Var);
                        if (H5 != obj2) {
                            H5 = w01.a;
                            break;
                        }
                        break;
                    case 6:
                        p10.Q(obj);
                        qw0Var.f = 7;
                        nq nqVar7 = nr.a;
                        Object H6 = p01.H(hq.d, new mw0(this, hmVar, 23), qw0Var);
                        if (H6 != obj2) {
                            H6 = w01.a;
                            break;
                        }
                        break;
                    case 7:
                        p10.Q(obj);
                        qw0Var.f = 8;
                        nq nqVar8 = nr.a;
                        Object H7 = p01.H(hq.d, new mw0(this, hmVar, 17), qw0Var);
                        if (H7 != obj2) {
                            H7 = w01.a;
                            break;
                        }
                        break;
                    case 8:
                        p10.Q(obj);
                        qw0Var.f = 9;
                        nq nqVar9 = nr.a;
                        break;
                    case 9:
                        p10.Q(obj);
                        qw0Var.f = 10;
                        nq nqVar10 = nr.a;
                        Object H8 = p01.H(hq.d, new mw0(this, hmVar, 20), qw0Var);
                        if (H8 != obj2) {
                            H8 = w01.a;
                            break;
                        }
                        break;
                    case 10:
                        p10.Q(obj);
                        Intent intent = new Intent("com.lumi.singularity.TWEAKS_STOPPED");
                        w50 a = w50.a(this);
                        synchronized (((HashMap) a.b)) {
                            try {
                                String action = intent.getAction();
                                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(((Context) a.a).getContentResolver());
                                Uri data = intent.getData();
                                String scheme = intent.getScheme();
                                Set<String> categories = intent.getCategories();
                                boolean z = (8 & intent.getFlags()) != 0;
                                if (z) {
                                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                                }
                                ArrayList arrayList = (ArrayList) ((HashMap) a.c).get(intent.getAction());
                                if (arrayList != null) {
                                    if (z) {
                                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                                    }
                                    int i3 = 0;
                                    ArrayList arrayList2 = null;
                                    while (i3 < arrayList.size()) {
                                        v50 v50Var = (v50) arrayList.get(i3);
                                        if (z) {
                                            Log.v("LocalBroadcastManager", "Matching against filter " + v50Var.a);
                                        }
                                        if (v50Var.c) {
                                            if (z) {
                                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                                            }
                                            i = i3;
                                        } else {
                                            int match = v50Var.a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                                            if (match >= 0) {
                                                if (z) {
                                                    StringBuilder sb = new StringBuilder();
                                                    i = i3;
                                                    sb.append("  Filter matched!  match=0x");
                                                    sb.append(Integer.toHexString(match));
                                                    Log.v("LocalBroadcastManager", sb.toString());
                                                } else {
                                                    i = i3;
                                                }
                                                if (arrayList2 == null) {
                                                    arrayList2 = new ArrayList();
                                                }
                                                arrayList2.add(v50Var);
                                                v50Var.c = true;
                                            } else {
                                                i = i3;
                                                if (z) {
                                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                                                }
                                            }
                                        }
                                        i3 = i + 1;
                                    }
                                    if (arrayList2 != null) {
                                        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                            ((v50) arrayList2.get(i4)).c = false;
                                        }
                                        ((ArrayList) a.d).add(new bg(intent, arrayList2));
                                        if (!((u50) a.e).hasMessages(1)) {
                                            ((u50) a.e).sendEmptyMessage(1);
                                        }
                                    }
                                }
                            } finally {
                            }
                        }
                        stopSelf();
                        return w01.a;
                    default:
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        qw0Var = new qw0(this, imVar);
        Object obj3 = qw0Var.d;
        Object obj22 = vn.d;
        hm hmVar2 = null;
        switch (qw0Var.f) {
        }
    }

    public final void g() {
        kh0 kh0Var = this.D;
        if (kh0Var != null && kh0Var.d) {
            kh0Var.c.removeCallbacks(kh0Var.g);
            try {
                kh0Var.a.unregisterReceiver(kh0Var.h);
            } catch (IllegalArgumentException unused) {
            }
            kh0Var.d = false;
            kh0Var.e = false;
            of ofVar = kh0Var.f;
            if (ofVar != null) {
                cq.g(ofVar);
            }
            kh0Var.f = null;
        }
        this.D = null;
    }

    public final Object h(us0 us0Var) {
        nq nqVar = nr.a;
        Object H = p01.H(hq.d, new mw0(this, null, 28), us0Var);
        return H == vn.d ? H : w01.a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.E = new File(getFilesDir(), "rgb_led.sh");
        this.F = new File(getFilesDir(), "custom_led.sh");
        this.G = new File(getFilesDir(), "power_led.sh");
        this.H = new File(getFilesDir(), "min_freq_lock.sh");
        this.I = new File(getFilesDir(), "max_freq_lock.sh");
        this.J = new File(getFilesDir(), "usb_interceptor.sh");
        this.K = new File(getFilesDir(), "ota_blocker.sh");
        new File(getFilesDir(), "ovr_loader_override.sh");
        this.L = new File(getFilesDir(), "persist_protect.sh");
        this.M = new File(getFilesDir(), "gpu_min_freq_lock.sh");
        this.N = new File(getFilesDir(), "gpu_max_freq_lock.sh");
        this.O = new File(getFilesDir(), "fan_override.sh");
        this.P = new File(getFilesDir(), "fan_target_rpm");
        this.Q = new File(getFilesDir(), "fan_sleep_enabled");
        this.R = new File(getFilesDir(), "charge_limit.sh");
        this.S = new File(getFilesDir(), "hide_mc2.sh");
        startForeground(2, a());
        if (c().getBoolean("prox_sensor_disabled", false)) {
            e();
        }
        if (!c().getBoolean("charge_notif_enabled", false) || this.B) {
            return;
        }
        this.B = true;
        this.C = p01.t(this.e, null, null, new d4(this, null, 8), 3);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        g();
        this.d.cancel(null);
        SharedPreferences.Editor edit = c().edit();
        edit.putBoolean("rgb_led_is_running", false);
        edit.putBoolean("custom_led_is_running", false);
        edit.putBoolean("power_led_is_running", false);
        edit.putBoolean("usb_interceptor_running", false);
        edit.putBoolean("ota_blocker_running", false);
        edit.putBoolean("ovr_loader_override_running", false);
        edit.putBoolean("min_freq_is_running", false);
        edit.putBoolean("max_freq_is_running", false);
        edit.putBoolean("gpu_min_freq_is_running", false);
        edit.putBoolean("gpu_max_freq_is_running", false);
        edit.putBoolean("fan_override_is_running", false);
        edit.putBoolean("charge_limit_is_running", false);
        edit.putBoolean("frida_is_running", false);
        edit.putBoolean("link_fix_running", false);
        edit.apply();
        p01.t(this.f, null, null, new b80(2, 8, null), 3);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        hm hmVar = null;
        String action = intent != null ? intent.getAction() : null;
        zl zlVar = this.e;
        if (action == null) {
            p01.t(zlVar, null, null, new mw0(this, hmVar, 2), 3);
            return 1;
        }
        p01.t(zlVar, null, null, new o3(action, this, intent, hmVar, 10), 3);
        return 1;
    }
}
