package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class ax0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ un e;
    public final /* synthetic */ SharedPreferences f;
    public final /* synthetic */ ky g;
    public final /* synthetic */ MutableState h;

    public /* synthetic */ ax0(un unVar, SharedPreferences sharedPreferences, ky kyVar, MutableState mutableState, int i) {
        this.d = i;
        this.e = unVar;
        this.f = sharedPreferences;
        this.g = kyVar;
        this.h = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        ky kyVar = this.g;
        MutableState mutableState = this.h;
        SharedPreferences sharedPreferences = this.f;
        w01 w01Var = w01.a;
        un unVar = this.e;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                nq nqVar = nr.a;
                p01.t(unVar, hq.d, null, new az0(booleanValue, this.f, this.g, this.h, null, 0), 2);
                break;
            case 1:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                nq nqVar2 = nr.a;
                p01.t(unVar, hq.d, null, new az0(booleanValue2, this.f, this.g, this.h, null, 1), 2);
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                boolean booleanValue3 = bool.booleanValue();
                MutableState mutableState2 = this.h;
                SharedPreferences sharedPreferences2 = this.f;
                r6.f(mutableState2, bool, sharedPreferences2, "meta_backdoor_toggle_enabled", booleanValue3);
                nq nqVar3 = nr.a;
                p01.t(unVar, hq.d, null, new az0(booleanValue3, sharedPreferences2, this.g, mutableState2, null, 2), 2);
                break;
            case 3:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue4 = bool2.booleanValue();
                mutableState.setValue(bool2);
                sharedPreferences.edit().putBoolean("wireless_adb_is_running", ((Boolean) mutableState.getValue()).booleanValue()).apply();
                nq nqVar4 = nr.a;
                p01.t(unVar, hq.d, null, new cz0(0, null, kyVar, booleanValue4), 2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                boolean booleanValue5 = bool3.booleanValue();
                r6.f(mutableState, bool3, sharedPreferences, "teleport_limit_disabled", booleanValue5);
                nq nqVar5 = nr.a;
                p01.t(unVar, hq.d, null, new cz0(1, null, kyVar, booleanValue5), 2);
                break;
        }
        return w01Var;
    }

    public /* synthetic */ ax0(SharedPreferences sharedPreferences, un unVar, MutableState mutableState, ky kyVar, int i) {
        this.d = i;
        this.f = sharedPreferences;
        this.e = unVar;
        this.h = mutableState;
        this.g = kyVar;
    }
}
