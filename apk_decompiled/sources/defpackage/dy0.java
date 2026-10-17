package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class dy0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ SharedPreferences e;
    public final /* synthetic */ ky f;
    public final /* synthetic */ MutableState g;

    public /* synthetic */ dy0(SharedPreferences sharedPreferences, ky kyVar, MutableState mutableState, int i) {
        this.d = i;
        this.e = sharedPreferences;
        this.f = kyVar;
        this.g = mutableState;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        MutableState mutableState = this.g;
        ky kyVar = this.f;
        SharedPreferences sharedPreferences = this.e;
        Boolean bool = (Boolean) obj;
        switch (i) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                r6.f(mutableState, bool, sharedPreferences, "fix_controllers_on_boot", booleanValue);
                kyVar.invoke(booleanValue ? "Controller Fix on Boot Enabled" : "Controller Fix on Boot Disabled");
                break;
            case 1:
                boolean booleanValue2 = bool.booleanValue();
                r6.f(mutableState, bool, sharedPreferences, "charge_limit_on_boot", booleanValue2);
                kyVar.invoke(booleanValue2 ? "Charge Limit on Boot Enabled" : "Charge Limit on Boot Disabled");
                break;
            case 2:
                boolean booleanValue3 = bool.booleanValue();
                r6.f(mutableState, bool, sharedPreferences, "wireless_adb_on_boot", booleanValue3);
                kyVar.invoke(booleanValue3 ? "Wireless ADB on Boot Enabled" : "Wireless ADB on Boot Disabled");
                break;
            case 3:
                boolean booleanValue4 = bool.booleanValue();
                r6.f(mutableState, bool, sharedPreferences, "gpu_max_freq_on_boot", booleanValue4);
                kyVar.invoke(booleanValue4 ? "GPU Max Freq on Boot Enabled" : "GPU Max Freq on Boot Disabled");
                break;
            case 4:
                boolean booleanValue5 = bool.booleanValue();
                r6.f(mutableState, bool, sharedPreferences, "gpu_min_freq_on_boot", booleanValue5);
                kyVar.invoke(booleanValue5 ? "GPU Min Freq on Boot Enabled" : "GPU Min Freq on Boot Disabled");
                break;
            case 5:
                boolean booleanValue6 = bool.booleanValue();
                r6.f(mutableState, bool, sharedPreferences, "min_freq_on_boot", booleanValue6);
                kyVar.invoke(booleanValue6 ? "CPU Min Freq on Boot Enabled" : "CPU Min Freq on Boot Disabled");
                break;
            case 6:
                boolean booleanValue7 = bool.booleanValue();
                r6.f(mutableState, bool, sharedPreferences, "max_freq_on_boot", booleanValue7);
                kyVar.invoke(booleanValue7 ? "CPU Max Freq on Boot Enabled" : "CPU Max Freq on Boot Disabled");
                break;
            case 7:
                boolean booleanValue8 = bool.booleanValue();
                r6.f(mutableState, bool, sharedPreferences, "cycle_wifi_on_boot", booleanValue8);
                kyVar.invoke(booleanValue8 ? "Wi-Fi Cycle on Boot Enabled" : "Wi-Fi Cycle on Boot Disabled");
                break;
            case 8:
                boolean booleanValue9 = bool.booleanValue();
                r6.f(mutableState, bool, sharedPreferences, "blocker_on_boot", booleanValue9);
                kyVar.invoke(booleanValue9 ? "Blocker on Boot Enabled" : "Blocker on Boot Disabled");
                break;
            case 9:
                boolean booleanValue10 = bool.booleanValue();
                r6.f(mutableState, bool, sharedPreferences, "passthrough_fix_on_boot", booleanValue10);
                kyVar.invoke(booleanValue10 ? "Passthrough Fix on Boot Enabled" : "Passthrough Fix on Boot Disabled");
                break;
            case 10:
                boolean booleanValue11 = bool.booleanValue();
                r6.f(mutableState, bool, sharedPreferences, "root_blocker_on_boot", booleanValue11);
                kyVar.invoke(booleanValue11 ? "Blocker on Boot Enabled" : "Blocker on Boot Disabled");
                break;
            default:
                boolean booleanValue12 = bool.booleanValue();
                r6.f(mutableState, bool, sharedPreferences, "fan_override_on_boot", booleanValue12);
                kyVar.invoke(booleanValue12 ? "Fan Override on Boot Enabled" : "Fan Override on Boot Disabled");
                break;
        }
        return w01Var;
    }
}
