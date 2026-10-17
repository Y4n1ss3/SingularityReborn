package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class kz0 extends us0 implements my {
    public int d;
    public int e;
    public final /* synthetic */ SharedPreferences f;
    public final /* synthetic */ rw0 g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ ky j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz0(SharedPreferences sharedPreferences, rw0 rw0Var, MutableState mutableState, MutableState mutableState2, ky kyVar, String str, hm hmVar) {
        super(2, hmVar);
        this.f = sharedPreferences;
        this.g = rw0Var;
        this.h = mutableState;
        this.i = mutableState2;
        this.j = kyVar;
        this.k = str;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new kz0(this.f, this.g, this.h, this.i, this.j, this.k, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((kz0) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        if (defpackage.p01.H(r12, r2, r11) == r10) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        Exception exc2;
        int i;
        MutableState mutableState = this.i;
        int i2 = this.e;
        SharedPreferences sharedPreferences = this.f;
        MutableState mutableState2 = this.h;
        if (i2 == 0) {
            p10.Q(obj);
            boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
            boolean z = !booleanValue;
            mutableState2.setValue(Boolean.valueOf(z));
            ky kyVar = this.j;
            rw0 rw0Var = this.g;
            hm hmVar = null;
            vn vnVar = vn.d;
            try {
                try {
                    if (booleanValue) {
                        rw0.a(rw0Var, "com.lumi.singularity.STOP_FAN_OVERRIDE");
                        nq nqVar = nr.a;
                        rz rzVar = f80.a;
                        z60 z60Var = new z60(2, null, kyVar);
                        this.d = z ? 1 : 0;
                        this.e = 2;
                    } else {
                        try {
                            sharedPreferences.edit().putInt("fan_override_target_rpm", ((Number) mutableState.getValue()).intValue()).apply();
                            rw0.a(rw0Var, "com.lumi.singularity.START_FAN_OVERRIDE");
                            nq nqVar2 = nr.a;
                            rz rzVar2 = f80.a;
                            f4 f4Var = new f4(kyVar, (Object) this.k, mutableState, hmVar, 6);
                            this.d = z ? 1 : 0;
                            this.e = 1;
                            if (p01.H(rzVar2, f4Var, this) == vnVar) {
                                return vnVar;
                            }
                            i = z ? 1 : 0;
                        } catch (Exception e) {
                            exc2 = e;
                            exc = exc2;
                            i = z ? 1 : 0;
                            Log.e("TweaksActivity", "Failed to toggle Fan Override", exc);
                            mutableState2.setValue(Boolean.valueOf(i == 0));
                            return w01.a;
                        }
                    }
                } catch (Exception e2) {
                    exc2 = e2;
                }
            } catch (Exception e3) {
                exc = e3;
                i = z ? 1 : 0;
                Log.e("TweaksActivity", "Failed to toggle Fan Override", exc);
                mutableState2.setValue(Boolean.valueOf(i == 0));
                return w01.a;
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.d;
            try {
                p10.Q(obj);
            } catch (Exception e4) {
                exc = e4;
                Log.e("TweaksActivity", "Failed to toggle Fan Override", exc);
                mutableState2.setValue(Boolean.valueOf(i == 0));
                return w01.a;
            }
        }
        sharedPreferences.edit().putBoolean("fan_override_is_running", ((Boolean) mutableState2.getValue()).booleanValue()).apply();
        return w01.a;
    }
}
