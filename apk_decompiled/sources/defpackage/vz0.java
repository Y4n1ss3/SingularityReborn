package defpackage;

import android.content.SharedPreferences;
import android.os.SystemClock;
import androidx.compose.runtime.MutableState;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class vz0 extends us0 implements my {
    public final /* synthetic */ int d = 1;
    public int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz0(my myVar, boolean z, AtomicLong atomicLong, ky kyVar, hm hmVar) {
        super(2, hmVar);
        this.i = myVar;
        this.f = z;
        this.g = atomicLong;
        this.h = kyVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                return new vz0(this.f, (rw0) this.i, (AtomicLong) obj3, (ky) obj2, hmVar);
            case 1:
                return new vz0((my) this.i, this.f, (AtomicLong) obj3, (ky) obj2, hmVar);
            case 2:
                return new vz0(this.f, (ky) obj2, (MutableState) obj3, hmVar);
            default:
                rw0 rw0Var = (rw0) this.i;
                return new vz0(this.f, (SharedPreferences) obj3, (MutableState) obj2, rw0Var, hmVar);
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
        return ((vz0) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0090, code lost:
    
        if (defpackage.p01.H(defpackage.hq.d, new defpackage.qe(r14, r9, r8), r13) == r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00eb, code lost:
    
        if (r14.invoke(r0, r13) == r6) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        int i = this.d;
        int i2 = 2;
        w01 w01Var = w01.a;
        Object obj2 = this.h;
        boolean z = this.f;
        vn vnVar = vn.d;
        Object obj3 = this.g;
        int i3 = 1;
        hm hmVar = null;
        switch (i) {
            case 0:
                int i4 = this.e;
                if (i4 != 0) {
                    if (i4 == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                rw0 rw0Var = (rw0) this.i;
                if (z) {
                    rw0.a(rw0Var, "com.lumi.singularity.START_USB_INTERCEPTOR");
                } else {
                    rw0.a(rw0Var, "com.lumi.singularity.STOP_USB_INTERCEPTOR");
                }
                ((AtomicLong) obj3).set(SystemClock.elapsedRealtime());
                nq nqVar = nr.a;
                rz rzVar = f80.a;
                bz0 bz0Var = new bz0(i3, hmVar, (ky) obj2, z);
                this.e = 1;
                return p01.H(rzVar, bz0Var, this) == vnVar ? vnVar : w01Var;
            case 1:
                int i5 = this.e;
                if (i5 == 0) {
                    p10.Q(obj);
                    my myVar = (my) this.i;
                    Boolean valueOf = Boolean.valueOf(z);
                    this.e = 1;
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            p10.Q(obj);
                            return w01Var;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                ((AtomicLong) obj3).set(SystemClock.elapsedRealtime());
                nq nqVar2 = nr.a;
                rz rzVar2 = f80.a;
                bz0 bz0Var2 = new bz0(3, hmVar, (ky) obj2, z);
                this.e = 2;
                if (p01.H(rzVar2, bz0Var2, this) != vnVar) {
                    return w01Var;
                }
                return vnVar;
            case 2:
                int i6 = this.e;
                if (i6 == 0) {
                    p10.Q(obj);
                    String str = z ? "performance" : "schedutil";
                    ro roVar = ro.a;
                    this.e = 1;
                    nq nqVar3 = nr.a;
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutableState = (MutableState) this.i;
                        p10.Q(obj);
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        mutableState.setValue(bool);
                        ((ky) obj2).invoke(!z ? "CPU set to performance mode" : "CPU set to schedutil mode");
                        return w01Var;
                    }
                    p10.Q(obj);
                }
                MutableState mutableState2 = (MutableState) obj3;
                ro roVar2 = ro.a;
                this.i = mutableState2;
                this.e = 2;
                nq nqVar4 = nr.a;
                Object H = p01.H(hq.d, new mo(i2, hmVar), this);
                if (H != vnVar) {
                    obj = H;
                    mutableState = mutableState2;
                    Boolean bool2 = (Boolean) obj;
                    bool2.getClass();
                    mutableState.setValue(bool2);
                    ((ky) obj2).invoke(!z ? "CPU set to performance mode" : "CPU set to schedutil mode");
                    return w01Var;
                }
                return vnVar;
            default:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                int i7 = this.e;
                if (i7 != 0) {
                    if (i7 == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                if (!z || sharedPreferences.contains("persist_protect_toggle_enabled")) {
                    return w01Var;
                }
                sharedPreferences.edit().putBoolean("persist_protect_toggle_enabled", true).apply();
                ((MutableState) obj2).setValue(Boolean.TRUE);
                nq nqVar5 = nr.a;
                hq hqVar = hq.d;
                y9 y9Var = new y9((rw0) this.i, hmVar, 5);
                this.e = 1;
                return p01.H(hqVar, y9Var, this) == vnVar ? vnVar : w01Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz0(boolean z, ky kyVar, MutableState mutableState, hm hmVar) {
        super(2, hmVar);
        this.f = z;
        this.h = kyVar;
        this.g = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz0(boolean z, rw0 rw0Var, AtomicLong atomicLong, ky kyVar, hm hmVar) {
        super(2, hmVar);
        this.f = z;
        this.i = rw0Var;
        this.g = atomicLong;
        this.h = kyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz0(boolean z, SharedPreferences sharedPreferences, MutableState mutableState, rw0 rw0Var, hm hmVar) {
        super(2, hmVar);
        this.f = z;
        this.g = sharedPreferences;
        this.h = mutableState;
        this.i = rw0Var;
    }
}
