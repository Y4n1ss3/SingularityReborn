package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class g70 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ un e;
    public final /* synthetic */ MutableState f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ g70(y40 y40Var, un unVar, MutableState mutableState, MutableState mutableState2, Context context, MutableState mutableState3) {
        this.d = 0;
        this.g = y40Var;
        this.e = unVar;
        this.f = mutableState;
        this.h = mutableState2;
        this.j = context;
        this.i = mutableState3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [p70, x40] */
    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        MutableState mutableState = this.f;
        un unVar = this.e;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                y40 y40Var = (y40) obj5;
                final MutableState mutableState2 = (MutableState) obj4;
                final Context context = (Context) obj2;
                final MutableState mutableState3 = (MutableState) obj3;
                ((DisposableEffectScope) obj).getClass();
                final un unVar2 = this.e;
                final MutableState mutableState4 = this.f;
                ?? r1 = new w40() { // from class: p70
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.w40
                    public final void onStateChanged(y40 y40Var2, q40 q40Var) {
                        if (q40Var == q40.ON_RESUME && ((Boolean) mutableState4.getValue()).booleanValue() && !e80.f(mutableState2)) {
                            p01.t(un.this, null, null, new o3(context, mutableState3, (hm) null), 3);
                        }
                    }
                };
                y40Var.getLifecycle().a(r1);
                break;
            case 1:
                AtomicLong atomicLong = (AtomicLong) obj5;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                mutableState.setValue(Integer.valueOf(booleanValue ? 1 : 0));
                atomicLong.set(SystemClock.elapsedRealtime());
                ((SharedPreferences) obj4).edit().putInt("ui_switch_state", booleanValue ? 1 : 0).apply();
                nq nqVar = nr.a;
                p01.t(unVar, hq.d, null, new vz0((my) obj3, booleanValue, atomicLong, (ky) obj2, (hm) null), 2);
                break;
            default:
                AtomicLong atomicLong2 = (AtomicLong) obj5;
                Boolean bool = (Boolean) obj;
                boolean booleanValue2 = bool.booleanValue();
                mutableState.setValue(bool);
                atomicLong2.set(SystemClock.elapsedRealtime());
                ((SharedPreferences) obj4).edit().putBoolean("usb_interceptor_running", booleanValue2).putBoolean("usb_interceptor_on_boot", booleanValue2).apply();
                nq nqVar2 = nr.a;
                p01.t(unVar, hq.d, null, new vz0(booleanValue2, (rw0) obj3, atomicLong2, (ky) obj2, (hm) null), 2);
                break;
        }
        return w01Var;
    }

    public /* synthetic */ g70(AtomicLong atomicLong, SharedPreferences sharedPreferences, un unVar, MutableState mutableState, Object obj, ky kyVar, int i) {
        this.d = i;
        this.g = atomicLong;
        this.h = sharedPreferences;
        this.e = unVar;
        this.f = mutableState;
        this.i = obj;
        this.j = kyVar;
    }
}
