package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.material3.SnackbarHostState;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class d01 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d01(boolean z, Context context, boolean z2, SharedPreferences sharedPreferences, SnackbarHostState snackbarHostState, hm hmVar) {
        super(2, hmVar);
        this.d = 2;
        this.f = z;
        this.i = context;
        this.g = z2;
        this.h = sharedPreferences;
        this.j = snackbarHostState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.j;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                return new d01(this.f, this.g, (rw0) obj3, this.i, (ky) obj2, hmVar, 0);
            case 1:
                return new d01(this.f, this.g, (rw0) obj3, this.i, (ky) obj2, hmVar, 1);
            default:
                return new d01(this.f, this.i, this.g, (SharedPreferences) obj3, (SnackbarHostState) obj2, hmVar);
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
        return ((d01) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        if (r1 == r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r1 == r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        if (defpackage.zj0.c("\n        update_engine_client --cancel\n        update_engine_client --reset_status\n        sleep 3\n        mount -o bind /data/adb/singularity/update_engine.rc /system/etc/init/update_engine.rc\n        mount -o bind /data/adb/singularity/update_verifier.rc /system/etc/init/update_verifier.rc\n        mount -o bind /data/adb/singularity/update_noop /system/bin/update_engine\n        mount -o bind /data/adb/singularity/update_noop /system/bin/update_engine_client\n        mount -o bind /data/adb/singularity/update_noop /system/bin/update_verifier\n        stop update_engine\n        stop update_verifier_nonencrypted\n        stop update_verifier\n    ", true, r22) == r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ed, code lost:
    
        if (r1 == r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011b, code lost:
    
        if (defpackage.zj0.c("\n            umount -l /system/etc/init/update_engine.rc || true\n            umount -l /system/etc/init/update_verifier.rc || true\n            umount -l /system/bin/update_engine || true\n            umount -l /system/bin/update_engine_client || true\n            umount -l /system/bin/update_verifier || true\n            sleep 1\n            start update_engine\n            start update_verifier_nonencrypted\n            start update_verifier\n        ", true, r22) == r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0183, code lost:
    
        if (defpackage.zj0.c("\n        mount -o bind /data/adb/singularity/telemetry /system_ext/bin/crashtelemetry\n        mount -o bind /data/adb/singularity/telemetry /system_ext/bin/telemetry\n        mount -o bind /data/adb/singularity/telemetry /system_ext/bin/wifitelemetry\n        mount -o bind /data/adb/singularity/telemetry.rc /system_ext/etc/init/crashtelemetry.rc\n        mount -o bind /data/adb/singularity/telemetry.rc /system_ext/etc/init/telemetry.rc\n        mount -o bind /data/adb/singularity/telemetry.rc /system_ext/etc/init/wifitelemetry.rc\n        mount -o bind /data/adb/singularity/telemetry.rc /system_ext/etc/init/vendor.oculus.hardware.telemetry@1.0-service.rc\n        setprop ctl.stop crashtelemetry\n        setprop ctl.stop telemetry\n        setprop ctl.stop wifitelemetry\n        setprop ctl.stop oculus-hardware-telemetry-1-0\n        stop crashtelemetry\n        stop telemetry\n        stop wifitelemetry\n        stop oculus-hardware-telemetry-1-0\n        cp /data/adb/singularity/fflogger_event_store.sql /data/oculus/telemetry/fflogger_event_store.sql\n        chmod 400 /data/oculus/telemetry/fflogger_event_store.sql\n    ", true, r22) == r8) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0176, code lost:
    
        if (r1 == r8) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a4, code lost:
    
        if (defpackage.zj0.c("\n    \tumount -l /system_ext/bin/crashtelemetry || true\n    \tumount -l /system_ext/bin/telemetry || true\n        umount -l /system_ext/bin/wifitelemetry || true\n    \tumount -l /system_ext/etc/init/crashtelemetry.rc || true\n    \tumount -l /system_ext/etc/init/telemetry.rc || true\n    \tumount -l /system_ext/etc/init/wifitelemetry.rc || true\n    \tumount -l /system_ext/etc/init/vendor.oculus.hardware.telemetry@1.0-service.rc || true\n    \tchmod 600 /data/oculus/telemetry/fflogger_event_store.sql\n    ", true, r22) == r8) goto L96;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object H;
        Object c;
        int i = this.d;
        w01 w01Var = w01.a;
        boolean z = this.g;
        boolean z2 = this.f;
        vn vnVar = vn.d;
        Context context = this.i;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                ky kyVar = (ky) obj2;
                int i2 = this.e;
                if (i2 == 0) {
                    p10.Q(obj);
                    if (z2) {
                        if (!z) {
                            zj0 zj0Var = zj0.a;
                            this.e = 4;
                            break;
                        } else {
                            this.e = 1;
                            nq nqVar = nr.a;
                            Object H2 = p01.H(hq.d, new e4(context, null, 16), this);
                            if (H2 != vnVar) {
                                H2 = w01Var;
                                break;
                            }
                        }
                    }
                } else if (i2 == 1) {
                    p10.Q(obj);
                    zj0 zj0Var2 = zj0.a;
                    this.e = 2;
                    break;
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            p10.Q(obj);
                            nq nqVar2 = nr.a;
                            rz rzVar = f80.a;
                            z60 z60Var = new z60(13, null, kyVar);
                            this.e = 5;
                            if (p01.H(rzVar, z60Var, this) != vnVar) {
                            }
                        } else if (i2 != 5) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    }
                    p10.Q(obj);
                    break;
                } else {
                    p10.Q(obj);
                    nq nqVar3 = nr.a;
                    rz rzVar2 = f80.a;
                    z60 z60Var2 = new z60(12, null, kyVar);
                    this.e = 3;
                    if (p01.H(rzVar2, z60Var2, this) != vnVar) {
                    }
                }
                break;
            case 1:
                ky kyVar2 = (ky) obj2;
                int i3 = this.e;
                if (i3 == 0) {
                    p10.Q(obj);
                    if (z2) {
                        if (!z) {
                            zj0 zj0Var3 = zj0.a;
                            this.e = 4;
                            break;
                        } else {
                            this.e = 1;
                            nq nqVar4 = nr.a;
                            Object H3 = p01.H(hq.d, new e4(context, null, 17), this);
                            if (H3 != vnVar) {
                                H3 = w01Var;
                                break;
                            }
                        }
                    }
                } else if (i3 == 1) {
                    p10.Q(obj);
                    zj0 zj0Var4 = zj0.a;
                    this.e = 2;
                    break;
                } else if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            p10.Q(obj);
                            nq nqVar5 = nr.a;
                            rz rzVar3 = f80.a;
                            z60 z60Var3 = new z60(15, null, kyVar2);
                            this.e = 5;
                            if (p01.H(rzVar3, z60Var3, this) != vnVar) {
                            }
                        } else if (i3 != 5) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    }
                    p10.Q(obj);
                    break;
                } else {
                    p10.Q(obj);
                    nq nqVar6 = nr.a;
                    rz rzVar4 = f80.a;
                    z60 z60Var4 = new z60(14, null, kyVar2);
                    this.e = 3;
                    if (p01.H(rzVar4, z60Var4, this) != vnVar) {
                    }
                }
                break;
            default:
                int i4 = this.e;
                if (i4 == 0) {
                    p10.Q(obj);
                    if (!z2) {
                        Map map = hs.a;
                        this.e = 3;
                        nq nqVar7 = nr.a;
                        H = p01.H(hq.d, new e4(context, null, 13), this);
                        break;
                    } else {
                        Map map2 = hs.a;
                        this.e = 1;
                        c = hs.c(context, this);
                        break;
                    }
                } else if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            p10.Q(obj);
                            H = obj;
                            boolean booleanValue = ((Boolean) H).booleanValue();
                            nq nqVar8 = nr.a;
                            rz rzVar5 = f80.a;
                            ds dsVar = new ds(booleanValue, z, (SnackbarHostState) obj2, null);
                            this.e = 4;
                            if (p01.H(rzVar5, dsVar, this) != vnVar) {
                            }
                        } else if (i4 != 4) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    }
                    p10.Q(obj);
                    break;
                } else {
                    p10.Q(obj);
                    c = obj;
                    boolean booleanValue2 = ((Boolean) c).booleanValue();
                    nq nqVar9 = nr.a;
                    rz rzVar6 = f80.a;
                    pe peVar = new pe(booleanValue2, this.g, (SharedPreferences) this.h, (SnackbarHostState) obj2, null, 1);
                    this.e = 2;
                    if (p01.H(rzVar6, peVar, this) != vnVar) {
                    }
                }
                break;
        }
        return vnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d01(boolean z, boolean z2, rw0 rw0Var, Context context, ky kyVar, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = z;
        this.g = z2;
        this.h = rw0Var;
        this.i = context;
        this.j = kyVar;
    }
}
