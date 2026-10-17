package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Matrix;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class c70 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ SharedPreferences e;
    public final /* synthetic */ MutableState f;

    public /* synthetic */ c70(SharedPreferences sharedPreferences, MutableState mutableState, int i) {
        this.d = i;
        this.e = sharedPreferences;
        this.f = mutableState;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        MutableState mutableState = this.f;
        SharedPreferences sharedPreferences = this.e;
        switch (i) {
            case 0:
                ku kuVar = (ku) obj;
                kuVar.getClass();
                mutableState.setValue(kuVar);
                sharedPreferences.edit().putString("selected_exploit_binary", kuVar.name()).apply();
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                r6.f(mutableState, bool, sharedPreferences, "payload_singularity_magisk", bool.booleanValue());
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                r6.f(mutableState, bool2, sharedPreferences, "payload_persistent_port", bool2.booleanValue());
                break;
            case 3:
                Boolean bool3 = (Boolean) obj;
                r6.f(mutableState, bool3, sharedPreferences, "payload_soft_reboot", bool3.booleanValue());
                break;
            case 4:
                Boolean bool4 = (Boolean) obj;
                r6.f(mutableState, bool4, sharedPreferences, "payload_disable_ota", bool4.booleanValue());
                break;
            case 5:
                Boolean bool5 = (Boolean) obj;
                r6.f(mutableState, bool5, sharedPreferences, "payload_bootanimation", bool5.booleanValue());
                break;
            case 6:
                ie ieVar = (ie) obj;
                ieVar.getClass();
                mutableState.setValue(ieVar);
                sharedPreferences.edit().putString("payload_bootanimation_choice", ieVar.name()).apply();
                break;
            case 7:
                Boolean bool6 = (Boolean) obj;
                r6.f(mutableState, bool6, sharedPreferences, "auto_reboot_on_exploit_fail", bool6.booleanValue());
                break;
            case 8:
                String str = (String) obj;
                str.getClass();
                mutableState.setValue(str);
                sharedPreferences.edit().putString("update_channel", str).apply();
                break;
            case 9:
                Boolean bool7 = (Boolean) obj;
                r6.f(mutableState, bool7, sharedPreferences, "auto_check_updates", bool7.booleanValue());
                break;
            case 10:
                Boolean bool8 = (Boolean) obj;
                r6.f(mutableState, bool8, sharedPreferences, "root_on_boot", bool8.booleanValue());
                break;
            case 11:
                float P = y80.P(((Float) obj).floatValue() * 10.0f) / 10.0f;
                mutableState.setValue(Float.valueOf(P));
                sharedPreferences.edit().putFloat("payload_settle_sec", P).apply();
                break;
            case Matrix.TranslateX /* 12 */:
                Boolean bool9 = (Boolean) obj;
                r6.f(mutableState, bool9, sharedPreferences, "temp_unit_is_fahrenheit", bool9.booleanValue());
                break;
            default:
                Boolean bool10 = (Boolean) obj;
                r6.f(mutableState, bool10, sharedPreferences, "temp_unit_is_fahrenheit", bool10.booleanValue());
                break;
        }
        return w01Var;
    }
}
