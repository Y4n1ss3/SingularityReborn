package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class bx0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ SharedPreferences e;
    public final /* synthetic */ ky f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;

    public /* synthetic */ bx0(SharedPreferences sharedPreferences, ky kyVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, int i) {
        this.d = i;
        this.e = sharedPreferences;
        this.f = kyVar;
        this.g = mutableState;
        this.h = mutableState2;
        this.i = mutableState3;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        MutableState mutableState = this.i;
        MutableState mutableState2 = this.h;
        MutableState mutableState3 = this.g;
        ky kyVar = this.f;
        SharedPreferences sharedPreferences = this.e;
        Boolean bool = (Boolean) obj;
        switch (i) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                mutableState3.setValue(bool);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean("custom_led_on_boot", booleanValue);
                if (booleanValue) {
                    edit.putBoolean("rgb_on_boot", false);
                    edit.putBoolean("power_led_on_boot", false);
                    Boolean bool2 = Boolean.FALSE;
                    mutableState2.setValue(bool2);
                    mutableState.setValue(bool2);
                }
                edit.apply();
                kyVar.invoke(booleanValue ? "Custom LED on Boot Enabled" : "Custom LED on Boot Disabled");
                break;
            case 1:
                boolean booleanValue2 = bool.booleanValue();
                mutableState3.setValue(bool);
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putBoolean("power_led_on_boot", booleanValue2);
                if (booleanValue2) {
                    edit2.putBoolean("rgb_on_boot", false);
                    edit2.putBoolean("custom_led_on_boot", false);
                    Boolean bool3 = Boolean.FALSE;
                    mutableState2.setValue(bool3);
                    mutableState.setValue(bool3);
                }
                edit2.apply();
                kyVar.invoke(booleanValue2 ? "Power LED on Boot Enabled" : "Power LED on Boot Disabled");
                break;
            default:
                boolean booleanValue3 = bool.booleanValue();
                mutableState3.setValue(bool);
                SharedPreferences.Editor edit3 = sharedPreferences.edit();
                edit3.putBoolean("rgb_on_boot", booleanValue3);
                if (booleanValue3) {
                    edit3.putBoolean("custom_led_on_boot", false);
                    edit3.putBoolean("power_led_on_boot", false);
                    Boolean bool4 = Boolean.FALSE;
                    mutableState2.setValue(bool4);
                    mutableState.setValue(bool4);
                }
                edit3.apply();
                kyVar.invoke(booleanValue3 ? "Rainbow LED on Boot Enabled" : "Rainbow LED on Boot Disabled");
                break;
        }
        return w01Var;
    }
}
