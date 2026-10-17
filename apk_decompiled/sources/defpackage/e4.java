package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.nsd.NsdManager;
import android.util.Log;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.graphics.Matrix;
import com.lumi.singularity.system.BootReceiver;
import com.lumi.singularity.ui.activities.MainActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class e4 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ Context f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4(Context context, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = context;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Context context = this.f;
        switch (i) {
            case 0:
                return new e4(context, hmVar, 0);
            case 1:
                return new e4(context, hmVar, 1);
            case 2:
                return new e4(context, hmVar, 2);
            case 3:
                return new e4(context, hmVar, 3);
            case 4:
                return new e4(context, hmVar, 4);
            case 5:
                return new e4(context, hmVar, 5);
            case 6:
                return new e4(context, hmVar, 6);
            case 7:
                return new e4(context, hmVar, 7);
            case 8:
                return new e4(context, hmVar, 8);
            case 9:
                return new e4(context, hmVar, 9);
            case 10:
                return new e4(context, hmVar, 10);
            case 11:
                return new e4(context, hmVar, 11);
            case Matrix.TranslateX /* 12 */:
                return new e4(context, hmVar, 12);
            case Matrix.TranslateY /* 13 */:
                return new e4(context, hmVar, 13);
            case Matrix.TranslateZ /* 14 */:
                return new e4(context, hmVar, 14);
            case 15:
                return new e4(context, hmVar, 15);
            case 16:
                return new e4(context, hmVar, 16);
            default:
                return new e4(context, hmVar, 17);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = (un) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
        }
        return ((e4) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:358:0x06c7, code lost:
    
        if (defpackage.y80.p(8000, r22) == r7) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0735, code lost:
    
        if (r0 == r7) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0729, code lost:
    
        if (defpackage.y80.p(5000, r22) == r7) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x07b8, code lost:
    
        if (defpackage.p01.H(defpackage.hq.d, new defpackage.e4(r6, null, 8), r22) == r7) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0798, code lost:
    
        if (r0 == r7) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0819, code lost:
    
        if (defpackage.p01.H(defpackage.hq.d, new defpackage.e4(r6, null, 7), r22) == r7) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x07fa, code lost:
    
        if (r0 == r7) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0875, code lost:
    
        if (defpackage.y80.p(8000, r22) == r7) goto L372;
     */
    /* JADX WARN: Removed duplicated region for block: B:475:0x08ae  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NsdManager nsdManager;
        Object R;
        Object systemService;
        Object b;
        Object b2;
        Object b3;
        Context context;
        InputStream open;
        FileOutputStream fileOutputStream;
        Object H;
        Object H2;
        boolean booleanValue;
        Object H3;
        Object H4;
        boolean booleanValue2;
        boolean z;
        int i = this.d;
        w01 w01Var = w01.a;
        Context context2 = this.f;
        vn vnVar = vn.d;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 != 0) {
                    if (i2 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    R = obj;
                    return (Integer) R;
                }
                p10.Q(obj);
                try {
                    systemService = context2.getSystemService("servicediscovery");
                } catch (SecurityException unused) {
                }
                if (systemService instanceof NsdManager) {
                    nsdManager = (NsdManager) systemService;
                    if (nsdManager != null) {
                        d4 d4Var = new d4(nsdManager, null, 0);
                        this.e = 1;
                        R = d41.R(4000L, d4Var, this);
                        if (R == vnVar) {
                            return vnVar;
                        }
                        return (Integer) R;
                    }
                    return null;
                }
                nsdManager = null;
                if (nsdManager != null) {
                }
                return null;
            case 1:
                int i3 = this.e;
                if (i3 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            p10.Q(obj);
                            return w01Var;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                this.e = 2;
                if (j4.i(context2, "am broadcast -a com.oculus.vrpowermanager.automation_disable", this) != vnVar) {
                    return w01Var;
                }
                return vnVar;
            case 2:
                int i4 = this.e;
                if (i4 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    return j4.i(context2, "setprop debug.oculus.guardian_pause 1", this) == vnVar ? vnVar : w01Var;
                }
                if (i4 == 1) {
                    p10.Q(obj);
                    return w01Var;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                int i5 = this.e;
                if (i5 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var = zj0.a;
                    this.e = 1;
                    b = zj0.b(this);
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                p10.Q(obj);
                                return w01Var;
                            }
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        zj0 zj0Var2 = zj0.a;
                        this.e = 3;
                        if (zj0.c("\n        mount -o bind /data/adb/singularity/telemetry /system_ext/bin/crashtelemetry\n        mount -o bind /data/adb/singularity/telemetry /system_ext/bin/telemetry\n        mount -o bind /data/adb/singularity/telemetry /system_ext/bin/wifitelemetry\n        mount -o bind /data/adb/singularity/telemetry.rc /system_ext/etc/init/crashtelemetry.rc\n        mount -o bind /data/adb/singularity/telemetry.rc /system_ext/etc/init/telemetry.rc\n        mount -o bind /data/adb/singularity/telemetry.rc /system_ext/etc/init/wifitelemetry.rc\n        mount -o bind /data/adb/singularity/telemetry.rc /system_ext/etc/init/vendor.oculus.hardware.telemetry@1.0-service.rc\n        setprop ctl.stop crashtelemetry\n        setprop ctl.stop telemetry\n        setprop ctl.stop wifitelemetry\n        setprop ctl.stop oculus-hardware-telemetry-1-0\n        stop crashtelemetry\n        stop telemetry\n        stop wifitelemetry\n        stop oculus-hardware-telemetry-1-0\n        cp /data/adb/singularity/fflogger_event_store.sql /data/oculus/telemetry/fflogger_event_store.sql\n        chmod 400 /data/oculus/telemetry/fflogger_event_store.sql\n    ", true, this) != vnVar) {
                            return w01Var;
                        }
                        return vnVar;
                    }
                    p10.Q(obj);
                    b = obj;
                }
                if (!((Boolean) b).booleanValue()) {
                    return w01Var;
                }
                this.e = 2;
                int i6 = BootReceiver.a;
                nq nqVar = nr.a;
                break;
            case 4:
                int i7 = this.e;
                if (i7 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var3 = zj0.a;
                    this.e = 1;
                    b2 = zj0.b(this);
                    break;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                p10.Q(obj);
                                return w01Var;
                            }
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        zj0 zj0Var4 = zj0.a;
                        this.e = 3;
                        if (zj0.c("\n        update_engine_client --cancel\n        update_engine_client --reset_status\n        sleep 3\n        mount -o bind /data/adb/singularity/update_engine.rc /system/etc/init/update_engine.rc\n        mount -o bind /data/adb/singularity/update_verifier.rc /system/etc/init/update_verifier.rc\n        mount -o bind /data/adb/singularity/update_noop /system/bin/update_engine\n        mount -o bind /data/adb/singularity/update_noop /system/bin/update_engine_client\n        mount -o bind /data/adb/singularity/update_noop /system/bin/update_verifier\n        stop update_engine\n        stop update_verifier_nonencrypted\n        stop update_verifier\n    ", true, this) != vnVar) {
                            return w01Var;
                        }
                        return vnVar;
                    }
                    p10.Q(obj);
                    b2 = obj;
                }
                if (!((Boolean) b2).booleanValue()) {
                    return w01Var;
                }
                this.e = 2;
                int i8 = BootReceiver.a;
                nq nqVar2 = nr.a;
                break;
            case 5:
                int i9 = this.e;
                if (i9 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    break;
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        b3 = obj;
                        if (((Boolean) b3).booleanValue()) {
                            q10.c(Log.i("BootReceiver", "Root available — no-root VPN kill switch not applicable, skipped"));
                            return w01Var;
                        }
                        Log.i("BootReceiver", "No root available — delegating VPN kill switch to MainActivity");
                        Intent intent = new Intent(context2, (Class<?>) MainActivity.class);
                        intent.addFlags(GroupFlagsKt.IsMovableContentFlag);
                        intent.putExtra("start_dns_blocker", true);
                        context2.startActivity(intent);
                        return w01Var;
                    }
                    p10.Q(obj);
                }
                zj0 zj0Var5 = zj0.a;
                this.e = 2;
                b3 = zj0.b(this);
                break;
            case 6:
                int i10 = this.e;
                if (i10 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            p10.Q(obj);
                            return w01Var;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                if (hr.b() == rh0.f) {
                    context = context2;
                    Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    if (((registerReceiver != null ? registerReceiver.getIntExtra("plugged", 0) : 0) & 12) != 0) {
                        return w01Var;
                    }
                } else {
                    context = context2;
                }
                this.e = 2;
                if (j4.i(context, "am broadcast -a com.oculus.vrpowermanager.prox_close", this) != vnVar) {
                    return w01Var;
                }
                return vnVar;
            case 7:
                int i11 = this.e;
                if (i11 != 0) {
                    if (i11 == 1) {
                        p10.Q(obj);
                        return obj;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                StringBuilder sb = new StringBuilder("mkdir -p /data/adb/singularity\n");
                Iterator it = y80.E("telemetry", "telemetry.rc", "fflogger_event_store.sql").iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String c = uo.c("telemetry/", str);
                    Iterator it2 = it;
                    vn vnVar2 = vnVar;
                    File file = new File(context2.getCacheDir(), str + "_temp");
                    try {
                        open = context2.getAssets().open(c);
                        try {
                            fileOutputStream = new FileOutputStream(file);
                            try {
                                open.getClass();
                                q10.k(open, fileOutputStream);
                                fileOutputStream.close();
                                open.close();
                                sb.append("cp " + file.getAbsolutePath() + " /data/adb/singularity/" + str + "\n");
                                String absolutePath = file.getAbsolutePath();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("rm -f ");
                                sb2.append(absolutePath);
                                sb2.append("\n");
                                sb.append(sb2.toString());
                                sb.append("chmod " + (q10.b(str, "telemetry") ? "755" : "644") + " /data/adb/singularity/" + str + "\n");
                            } finally {
                                try {
                                    throw th;
                                    break;
                                } finally {
                                }
                            }
                        } finally {
                            try {
                                throw th;
                                break;
                            } finally {
                            }
                        }
                    } catch (Exception e) {
                        Log.e("Telemetry", "Failed to extract asset: " + str, e);
                    }
                    it = it2;
                    vnVar = vnVar2;
                }
                zj0 zj0Var6 = zj0.a;
                String sb3 = sb.toString();
                this.e = 1;
                Object c2 = zj0.c(sb3, true, this);
                return c2 == vnVar ? vnVar : c2;
            case 8:
                int i12 = this.e;
                if (i12 != 0) {
                    if (i12 == 1) {
                        p10.Q(obj);
                        return obj;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                StringBuilder sb4 = new StringBuilder("mkdir -p /data/adb/singularity\n");
                Iterator it3 = y80.E("update_engine.rc", "update_verifier.rc", "update_noop").iterator();
                while (it3.hasNext()) {
                    String str2 = (String) it3.next();
                    String c3 = uo.c("update_engine/", str2);
                    Iterator it4 = it3;
                    vn vnVar3 = vnVar;
                    File file2 = new File(context2.getCacheDir(), str2 + "_temp");
                    try {
                        open = context2.getAssets().open(c3);
                        try {
                            fileOutputStream = new FileOutputStream(file2);
                            try {
                                open.getClass();
                                q10.k(open, fileOutputStream);
                                fileOutputStream.close();
                                open.close();
                                sb4.append("cp " + file2.getAbsolutePath() + " /data/adb/singularity/" + str2 + "\n");
                                String absolutePath2 = file2.getAbsolutePath();
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("rm -f ");
                                sb5.append(absolutePath2);
                                sb5.append("\n");
                                sb4.append(sb5.toString());
                                sb4.append("chmod " + (ks0.Z(str2, ".rc", false) ? "644" : "755") + " /data/adb/singularity/" + str2 + "\n");
                            } finally {
                                try {
                                    throw th;
                                    break;
                                } finally {
                                }
                            }
                        } finally {
                            try {
                                throw th;
                                break;
                            } finally {
                            }
                        }
                    } catch (Exception e2) {
                        Log.e("UpdateEngine", "Failed to extract asset: " + str2, e2);
                    }
                    it3 = it4;
                    vnVar = vnVar3;
                }
                zj0 zj0Var7 = zj0.a;
                String sb6 = sb4.toString();
                this.e = 1;
                Object c4 = zj0.c(sb6, true, this);
                return c4 == vnVar ? vnVar : c4;
            case 9:
                int i13 = this.e;
                if (i13 != 0) {
                    if (i13 == 1) {
                        p10.Q(obj);
                        return obj;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                Map map = hs.a;
                this.e = 1;
                nq nqVar3 = nr.a;
                Object H5 = p01.H(hq.d, new oe(context2, null), this);
                return H5 == vnVar ? vnVar : H5;
            case 10:
                int i14 = this.e;
                if (i14 == 0) {
                    p10.Q(obj);
                    Map map2 = hs.a;
                    this.e = 1;
                    return hs.c(context2, this) == vnVar ? vnVar : w01Var;
                }
                if (i14 == 1) {
                    p10.Q(obj);
                    return w01Var;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                int i15 = this.e;
                if (i15 == 0) {
                    p10.Q(obj);
                    Map map3 = hs.a;
                    this.e = 1;
                    return hs.c(context2, this) == vnVar ? vnVar : w01Var;
                }
                if (i15 == 1) {
                    p10.Q(obj);
                    return w01Var;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            case Matrix.TranslateX /* 12 */:
                int i16 = this.e;
                if (i16 == 0) {
                    p10.Q(obj);
                    Map map4 = hs.a;
                    this.e = 1;
                    return hs.c(context2, this) == vnVar ? vnVar : w01Var;
                }
                if (i16 == 1) {
                    p10.Q(obj);
                    return w01Var;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            case Matrix.TranslateY /* 13 */:
                int i17 = this.e;
                if (i17 == 0) {
                    p10.Q(obj);
                    if (context2.getSharedPreferences("singularity_prefs", 0).getBoolean("is_unlocked_bootloader", false)) {
                        Map map5 = hs.a;
                        this.e = 1;
                        nq nqVar4 = nr.a;
                        int i18 = 2;
                        H2 = p01.H(hq.d, new qe(i18, i18, (hm) null), this);
                        if (H2 == vnVar) {
                            return vnVar;
                        }
                        booleanValue = ((Boolean) H2).booleanValue();
                    } else {
                        Map map6 = hs.a;
                        this.e = 2;
                        nq nqVar5 = nr.a;
                        H = p01.H(hq.d, new z9(2, 22, null), this);
                        if (H == vnVar) {
                            return vnVar;
                        }
                        booleanValue = ((Boolean) H).booleanValue();
                    }
                } else if (i17 == 1) {
                    p10.Q(obj);
                    H2 = obj;
                    booleanValue = ((Boolean) H2).booleanValue();
                } else {
                    if (i17 != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    H = obj;
                    booleanValue = ((Boolean) H).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            case Matrix.TranslateZ /* 14 */:
                int i19 = this.e;
                if (i19 == 0) {
                    p10.Q(obj);
                    if (context2.getSharedPreferences("singularity_prefs", 0).getBoolean("is_unlocked_bootloader", false)) {
                        Map map7 = hs.a;
                        this.e = 1;
                        nq nqVar6 = nr.a;
                        H4 = p01.H(hq.d, new ba(context2, null), this);
                        if (H4 == vnVar) {
                            return vnVar;
                        }
                        booleanValue2 = ((Boolean) H4).booleanValue();
                    } else {
                        Map map8 = hs.a;
                        this.e = 2;
                        nq nqVar7 = nr.a;
                        H3 = p01.H(hq.d, new e4(context2, null, 15), this);
                        if (H3 == vnVar) {
                            return vnVar;
                        }
                        booleanValue2 = ((Boolean) H3).booleanValue();
                    }
                } else if (i19 == 1) {
                    p10.Q(obj);
                    H4 = obj;
                    booleanValue2 = ((Boolean) H4).booleanValue();
                } else {
                    if (i19 != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    H3 = obj;
                    booleanValue2 = ((Boolean) H3).booleanValue();
                }
                return Boolean.valueOf(booleanValue2);
            case 15:
                int i20 = this.e;
                try {
                    if (i20 == 0) {
                        p10.Q(obj);
                        File file3 = new File(context2.getCacheDir(), "hosts_temp");
                        uv.M(file3, hs.a(context2));
                        String W = es0.W("\n                mkdir -p /data/adb/singularity\n                cp " + file3.getAbsolutePath() + " /data/adb/singularity/hosts\n                rm -f " + file3.getAbsolutePath() + "\n                chmod 644 /data/adb/singularity/hosts\n                umount -l /system/etc/hosts\n                mount -o bind /data/adb/singularity/hosts /system/etc/hosts\n                settings put global airplane_mode_on 1\n                am broadcast -a android.intent.action.AIRPLANE_MODE --ez state true\n                sleep 4\n                settings put global airplane_mode_on 0\n                am broadcast -a android.intent.action.AIRPLANE_MODE --ez state false\n            ");
                        zj0 zj0Var8 = zj0.a;
                        this.e = 1;
                        if (zj0.c(W, true, this) == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i20 != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                    }
                    try {
                        z = ds0.g0(uv.L(new File("/system/etc/hosts")), "Blocked domains by Singularity", false);
                    } catch (Exception unused2) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                } catch (Exception e3) {
                    Log.e("DomainBlockerManager", "Error applying hosts file (bind-mount)", e3);
                    return Boolean.FALSE;
                }
            case 16:
                int i21 = this.e;
                if (i21 != 0) {
                    if (i21 == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                StringBuilder sb7 = new StringBuilder("mkdir -p /data/adb/singularity\n");
                Iterator it5 = y80.E("telemetry", "telemetry.rc", "fflogger_event_store.sql").iterator();
                while (it5.hasNext()) {
                    String str3 = (String) it5.next();
                    String c5 = uo.c("telemetry/", str3);
                    Iterator it6 = it5;
                    vn vnVar4 = vnVar;
                    File file4 = new File(context2.getCacheDir(), str3 + "_temp");
                    try {
                        open = context2.getAssets().open(c5);
                    } catch (Exception e4) {
                        Log.e("Telemetry", "Failed to extract asset: " + str3, e4);
                    }
                    try {
                        fileOutputStream = new FileOutputStream(file4);
                        try {
                            open.getClass();
                            q10.k(open, fileOutputStream);
                            fileOutputStream.close();
                            open.close();
                            sb7.append("cp " + file4.getAbsolutePath() + " /data/adb/singularity/" + str3 + "\n");
                            String absolutePath3 = file4.getAbsolutePath();
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append("rm -f ");
                            sb8.append(absolutePath3);
                            sb8.append("\n");
                            sb7.append(sb8.toString());
                            sb7.append("chmod " + (q10.b(str3, "telemetry") ? "755" : "644") + " /data/adb/singularity/" + str3 + "\n");
                            it5 = it6;
                            vnVar = vnVar4;
                        } finally {
                            try {
                                throw th;
                                break;
                            } finally {
                            }
                        }
                    } finally {
                        try {
                            throw th;
                            break;
                        } finally {
                        }
                    }
                }
                zj0 zj0Var9 = zj0.a;
                String sb9 = sb7.toString();
                this.e = 1;
                return zj0.c(sb9, true, this) == vnVar ? vnVar : w01Var;
            default:
                int i22 = this.e;
                if (i22 != 0) {
                    if (i22 == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                StringBuilder sb10 = new StringBuilder("mkdir -p /data/adb/singularity\n");
                Iterator it7 = y80.E("update_engine.rc", "update_verifier.rc", "update_noop").iterator();
                while (it7.hasNext()) {
                    String str4 = (String) it7.next();
                    String c6 = uo.c("update_engine/", str4);
                    Iterator it8 = it7;
                    vn vnVar5 = vnVar;
                    File file5 = new File(context2.getCacheDir(), str4 + "_temp");
                    try {
                        open = context2.getAssets().open(c6);
                    } catch (Exception e5) {
                        Log.e("UpdateEngine", "Failed to extract asset: " + str4, e5);
                    }
                    try {
                        fileOutputStream = new FileOutputStream(file5);
                        try {
                            open.getClass();
                            q10.k(open, fileOutputStream);
                            fileOutputStream.close();
                            open.close();
                            sb10.append("cp " + file5.getAbsolutePath() + " /data/adb/singularity/" + str4 + "\n");
                            String absolutePath4 = file5.getAbsolutePath();
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append("rm -f ");
                            sb11.append(absolutePath4);
                            sb11.append("\n");
                            sb10.append(sb11.toString());
                            sb10.append("chmod " + (ks0.Z(str4, ".rc", false) ? "644" : "755") + " /data/adb/singularity/" + str4 + "\n");
                            it7 = it8;
                            vnVar = vnVar5;
                        } finally {
                            try {
                                break;
                            } finally {
                            }
                        }
                    } finally {
                        try {
                            break;
                        } finally {
                        }
                    }
                }
                zj0 zj0Var10 = zj0.a;
                String sb12 = sb10.toString();
                this.e = 1;
                return zj0.c(sb12, true, this) == vnVar ? vnVar : w01Var;
        }
    }
}
