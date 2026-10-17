package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import com.lumi.singularity.ui.activities.LedColorActivity;
import com.lumi.singularity.ui.activities.TweaksActivity;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class uw0 implements iy {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ Object e;
    public final /* synthetic */ SharedPreferences f;
    public final /* synthetic */ rw0 g;
    public final /* synthetic */ ky h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ Object k;

    public /* synthetic */ uw0(un unVar, ky kyVar, rw0 rw0Var, SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2, String str) {
        this.k = unVar;
        this.f = sharedPreferences;
        this.g = rw0Var;
        this.i = mutableState;
        this.j = mutableState2;
        this.h = kyVar;
        this.e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iy
    public final Object invoke() {
        int i = this.d;
        MutableState mutableState = this.j;
        MutableState mutableState2 = this.i;
        ky kyVar = this.h;
        rw0 rw0Var = this.g;
        SharedPreferences sharedPreferences = this.f;
        w01 w01Var = w01.a;
        Object obj = this.e;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                nq nqVar = nr.a;
                p01.t((un) obj2, hq.d, null, new kz0(this.f, this.g, this.i, this.j, this.h, (String) obj, null), 2);
                break;
            case 1:
                String str = (String) obj;
                mutableState2.setValue(str);
                sharedPreferences.edit().putString("gpu_max_freq_selection", str).apply();
                mutableState.setValue(Boolean.FALSE);
                if (!((Boolean) ((MutableState) obj2).getValue()).booleanValue()) {
                    kyVar.invoke("GPU Max Freq selection saved");
                    break;
                } else {
                    rw0.a(rw0Var, "com.lumi.singularity.START_GPU_MAX_FREQ");
                    kyVar.invoke("GPU Max Freq lock updated to " + str + " MHz");
                    break;
                }
            default:
                un unVar = (un) obj2;
                MutableState mutableState3 = (MutableState) obj;
                if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                    mutableState2.setValue(Boolean.TRUE);
                    Boolean bool = Boolean.FALSE;
                    mutableState.setValue(bool);
                    mutableState3.setValue(bool);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putBoolean("custom_led_is_running", true);
                    edit.putBoolean("rgb_led_is_running", false);
                    edit.putBoolean("power_led_is_running", false);
                    edit.apply();
                    TweaksActivity tweaksActivity = (TweaksActivity) rw0Var;
                    tweaksActivity.z = true;
                    tweaksActivity.B.J(new Intent(tweaksActivity, (Class<?>) LedColorActivity.class));
                    nq nqVar2 = nr.a;
                    p01.t(unVar, hq.d, null, new b80(2, 12, null), 2);
                    break;
                } else {
                    r6.f(mutableState2, Boolean.FALSE, sharedPreferences, "custom_led_is_running", false);
                    rw0.a(rw0Var, "com.lumi.singularity.STOP_CUSTOM_LED");
                    kyVar.invoke("Custom LED stopped");
                    break;
                }
        }
        return w01Var;
    }

    public /* synthetic */ uw0(SharedPreferences sharedPreferences, rw0 rw0Var, ky kyVar, un unVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.f = sharedPreferences;
        this.g = rw0Var;
        this.h = kyVar;
        this.k = unVar;
        this.i = mutableState;
        this.j = mutableState2;
        this.e = mutableState3;
    }

    public /* synthetic */ uw0(String str, SharedPreferences sharedPreferences, rw0 rw0Var, ky kyVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.e = str;
        this.f = sharedPreferences;
        this.g = rw0Var;
        this.h = kyVar;
        this.i = mutableState;
        this.j = mutableState2;
        this.k = mutableState3;
    }
}
