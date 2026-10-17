package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class sy0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ SharedPreferences e;
    public final /* synthetic */ un f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ rw0 j;
    public final /* synthetic */ ky k;

    public /* synthetic */ sy0(un unVar, ky kyVar, rw0 rw0Var, Context context, SharedPreferences sharedPreferences, MutableState mutableState, boolean z) {
        this.d = 1;
        this.e = sharedPreferences;
        this.f = unVar;
        this.g = mutableState;
        this.h = z;
        this.i = context;
        this.j = rw0Var;
        this.k = kyVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        MutableState mutableState = this.g;
        SharedPreferences sharedPreferences = this.e;
        w01 w01Var = w01.a;
        un unVar = this.f;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                r6.f(mutableState, bool, sharedPreferences, "update_engine_toggle_enabled", booleanValue);
                nq nqVar = nr.a;
                p01.t(unVar, hq.d, null, new d01(this.h, booleanValue, this.j, this.i, this.k, null, 1), 2);
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue2 = bool2.booleanValue();
                MutableState mutableState2 = this.g;
                SharedPreferences sharedPreferences2 = this.e;
                r6.f(mutableState2, bool2, sharedPreferences2, "prox_sensor_disabled", booleanValue2);
                nq nqVar2 = nr.a;
                p01.t(unVar, hq.d, null, new rz0(booleanValue2, this.h, this.i, this.j, this.k, sharedPreferences2, mutableState2, null), 2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                boolean booleanValue3 = bool3.booleanValue();
                r6.f(mutableState, bool3, sharedPreferences, "telemetry_toggle_enabled", booleanValue3);
                nq nqVar3 = nr.a;
                p01.t(unVar, hq.d, null, new d01(this.h, booleanValue3, this.j, this.i, this.k, null, 0), 2);
                break;
        }
        return w01Var;
    }

    public /* synthetic */ sy0(int i, un unVar, ky kyVar, rw0 rw0Var, Context context, SharedPreferences sharedPreferences, MutableState mutableState, boolean z) {
        this.d = i;
        this.e = sharedPreferences;
        this.f = unVar;
        this.g = mutableState;
        this.h = z;
        this.j = rw0Var;
        this.i = context;
        this.k = kyVar;
    }
}
