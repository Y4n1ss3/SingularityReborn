package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class vw0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ SharedPreferences e;
    public final /* synthetic */ un f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ ky i;

    public /* synthetic */ vw0(un unVar, ky kyVar, Context context, SharedPreferences sharedPreferences, MutableState mutableState) {
        this.d = 2;
        this.f = unVar;
        this.h = context;
        this.e = sharedPreferences;
        this.i = kyVar;
        this.g = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = this.f;
        Boolean bool = (Boolean) obj;
        switch (i) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                MutableState mutableState = this.g;
                SharedPreferences sharedPreferences = this.e;
                r6.f(mutableState, bool, sharedPreferences, "captive_portal_disabled", booleanValue);
                nq nqVar = nr.a;
                p01.t(unVar, hq.d, null, new uz0(booleanValue, this.h, this.i, sharedPreferences, mutableState, null), 2);
                break;
            case 1:
                boolean booleanValue2 = bool.booleanValue();
                MutableState mutableState2 = this.g;
                boolean booleanValue3 = ((Boolean) mutableState2.getValue()).booleanValue();
                SharedPreferences sharedPreferences2 = this.e;
                r6.f(mutableState2, bool, sharedPreferences2, "fps_display_scaling", booleanValue2);
                nq nqVar2 = nr.a;
                p01.t(unVar, hq.d, null, new fz0(this.h, booleanValue2, this.i, booleanValue3, sharedPreferences2, mutableState2, null), 2);
                break;
            case 2:
                boolean booleanValue4 = bool.booleanValue();
                nq nqVar3 = nr.a;
                p01.t(unVar, hq.d, null, new tz0(booleanValue4, this.h, this.e, this.i, this.g, (hm) null), 2);
                break;
            default:
                boolean booleanValue5 = bool.booleanValue();
                MutableState mutableState3 = this.g;
                SharedPreferences sharedPreferences3 = this.e;
                r6.f(mutableState3, bool, sharedPreferences3, "guardian_disabled", booleanValue5);
                nq nqVar4 = nr.a;
                p01.t(unVar, hq.d, null, new tz0(booleanValue5, this.h, this.i, sharedPreferences3, mutableState3, (hm) null), 2);
                break;
        }
        return w01Var;
    }

    public /* synthetic */ vw0(int i, un unVar, ky kyVar, Context context, SharedPreferences sharedPreferences, MutableState mutableState) {
        this.d = i;
        this.e = sharedPreferences;
        this.f = unVar;
        this.g = mutableState;
        this.h = context;
        this.i = kyVar;
    }
}
