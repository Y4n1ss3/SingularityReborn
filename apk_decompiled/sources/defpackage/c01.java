package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class c01 extends us0 implements my {
    public int d;
    public int e;
    public final /* synthetic */ SharedPreferences f;
    public final /* synthetic */ rw0 g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ ky j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c01(SharedPreferences sharedPreferences, rw0 rw0Var, MutableState mutableState, MutableState mutableState2, ky kyVar, hm hmVar) {
        super(2, hmVar);
        this.f = sharedPreferences;
        this.g = rw0Var;
        this.h = mutableState;
        this.i = mutableState2;
        this.j = kyVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new c01(this.f, this.g, this.h, this.i, this.j, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((c01) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        if (defpackage.p01.H(r12, r0, r11) == r9) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Exception e;
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
            vn vnVar = vn.d;
            try {
                try {
                    if (booleanValue) {
                        rw0.a(rw0Var, "com.lumi.singularity.STOP_GPU_MAX_FREQ");
                        nq nqVar = nr.a;
                        rz rzVar = f80.a;
                        z60 z60Var = new z60(11, null, kyVar);
                        this.d = z ? 1 : 0;
                        this.e = 2;
                    } else {
                        sharedPreferences.edit().putString("gpu_max_freq_selection", (String) mutableState.getValue()).apply();
                        rw0.a(rw0Var, "com.lumi.singularity.START_GPU_MAX_FREQ");
                        nq nqVar2 = nr.a;
                        rz rzVar2 = f80.a;
                        w3 w3Var = new w3(kyVar, mutableState, null, 6);
                        this.d = z ? 1 : 0;
                        this.e = 1;
                        if (p01.H(rzVar2, w3Var, this) == vnVar) {
                            return vnVar;
                        }
                        i = z ? 1 : 0;
                    }
                } catch (Exception e2) {
                    e = e2;
                    i = z ? 1 : 0;
                    Log.e("TweaksActivity", "Failed to toggle GPU Max Freq script", e);
                    mutableState2.setValue(Boolean.valueOf(i == 0));
                    return w01.a;
                }
            } catch (Exception e3) {
                e = e3;
                i = z ? 1 : 0;
                Log.e("TweaksActivity", "Failed to toggle GPU Max Freq script", e);
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
                e = e4;
                Log.e("TweaksActivity", "Failed to toggle GPU Max Freq script", e);
                mutableState2.setValue(Boolean.valueOf(i == 0));
                return w01.a;
            }
        }
        sharedPreferences.edit().putBoolean("gpu_max_freq_is_running", ((Boolean) mutableState2.getValue()).booleanValue()).apply();
        return w01.a;
    }
}
