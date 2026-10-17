package defpackage;

import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class oe extends us0 implements my {
    public final /* synthetic */ int d = 1;
    public boolean e;
    public int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(String str, boolean z, hm hmVar) {
        super(2, hmVar);
        this.g = str;
        this.e = z;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return new oe(this.e, (Context) obj2, hmVar);
            case 1:
                return new oe((Context) obj2, hmVar);
            default:
                return new oe((String) obj2, this.e, hmVar);
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
        return ((oe) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
    
        if (r10 == r5) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0099, code lost:
    
        if (r10 == r5) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
    
        if (r10 == r5) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0131, code lost:
    
        if (defpackage.j4.i((android.content.Context) r2, r10, r9) == r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010d, code lost:
    
        if (defpackage.y80.p(8000, r9) == r5) goto L61;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i = this.d;
        Object obj2 = this.g;
        vn vnVar = vn.d;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    p10.Q(obj);
                    this.f = 1;
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            p10.Q(obj);
                            return w01.a;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                String concat = this.e ? "oculuspreferences --getc passthrough_on_demand_enabled | grep -q ': false' && oculuspreferences --setc passthrough_on_demand_enabled true\n".concat("cmd sensorservice set-uid-state com.oculus.vrshell ".concat("active")) : "cmd sensorservice set-uid-state com.oculus.vrshell ".concat("idle");
                this.f = 2;
                break;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    p10.Q(obj);
                    z = ((Context) obj2).getSharedPreferences("singularity_prefs", 0).getBoolean("is_unlocked_bootloader", false);
                    if (!z) {
                        zj0 zj0Var = zj0.a;
                        this.e = z;
                        this.f = 3;
                        obj = zj0.c("mount | grep /system/etc/hosts", true, this);
                        break;
                    } else {
                        zj0 zj0Var2 = zj0.a;
                        this.e = z;
                        this.f = 1;
                        obj = zj0.c("[ -d /data/adb/modules/singularity-hosts ] && echo 1 || echo 0", true, this);
                        break;
                    }
                    return vnVar;
                }
                if (i3 == 1) {
                    z = this.e;
                    p10.Q(obj);
                    if (!q10.b(ds0.E0((String) obj).toString(), "1")) {
                        return Boolean.FALSE;
                    }
                    zj0 zj0Var3 = zj0.a;
                    this.e = z;
                    this.f = 2;
                    obj = zj0.c("[ -f /data/adb/modules/singularity-hosts/disable ] && echo 1 || echo 0", true, this);
                    break;
                } else {
                    if (i3 == 2) {
                        p10.Q(obj);
                        return Boolean.valueOf(!q10.b(ds0.E0((String) obj).toString(), "1"));
                    }
                    if (i3 == 3) {
                        p10.Q(obj);
                        return Boolean.valueOf(!ds0.n0((String) obj));
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i4 = this.f;
                try {
                    if (i4 == 0) {
                        p10.Q(obj);
                        wj0 wj0Var = wj0.d;
                        boolean z2 = this.e;
                        this.f = 1;
                        obj = zj0.a.e((String) obj2, wj0Var, z2, this);
                        if (obj == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i4 != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                    }
                    return (String) obj;
                } catch (Exception e) {
                    Log.e("RootUtils", "runAsRoot failed: " + e.getMessage());
                    return uo.c("Execution failed: ", e.getMessage());
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(Context context, hm hmVar) {
        super(2, hmVar);
        this.g = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(boolean z, Context context, hm hmVar) {
        super(2, hmVar);
        this.e = z;
        this.g = context;
    }
}
