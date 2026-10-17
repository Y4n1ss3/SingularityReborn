package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class l3 implements iy {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ un e;
    public final /* synthetic */ MutableState f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ l3(c3 c3Var, un unVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, String str) {
        this.e = unVar;
        this.f = mutableState;
        this.g = mutableState2;
        this.h = mutableState3;
        this.k = mutableState4;
        this.i = c3Var;
        this.j = str;
        this.l = mutableState5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iy
    public final Object invoke() {
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj = this.j;
        Object obj2 = this.i;
        Object obj3 = this.l;
        Object obj4 = this.k;
        un unVar = this.e;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj4;
                c3 c3Var = (c3) obj2;
                String str = (String) obj;
                MutableState mutableState2 = (MutableState) obj3;
                MutableState mutableState3 = this.f;
                if (!j4.b(mutableState3)) {
                    String obj5 = ds0.E0((String) this.g.getValue()).toString();
                    String obj6 = ds0.E0((String) this.h.getValue()).toString();
                    if (obj5.length() != 0 && obj6.length() != 0) {
                        mutableState3.setValue(Boolean.TRUE);
                        p01.t(unVar, null, null, new s3(c3Var, obj5, obj6, str, mutableState, mutableState3, mutableState2, (hm) null), 3);
                        break;
                    } else {
                        j4.e(mutableState, "Error: Please enter both the pairing port and code.");
                        break;
                    }
                }
                break;
            case 1:
                c3 c3Var2 = (c3) obj2;
                String str2 = (String) obj;
                SharedPreferences sharedPreferences = (SharedPreferences) obj4;
                iy iyVar = (iy) obj3;
                MutableState mutableState4 = this.f;
                if (!j4.b(mutableState4)) {
                    MutableState mutableState5 = this.g;
                    int length = ds0.E0((String) mutableState5.getValue()).toString().length();
                    MutableState mutableState6 = this.h;
                    if (length != 0) {
                        mutableState4.setValue(Boolean.TRUE);
                        p01.t(unVar, null, null, new t3(c3Var2, str2, sharedPreferences, iyVar, mutableState6, mutableState4, mutableState5, (hm) null), 3);
                        break;
                    } else {
                        j4.e(mutableState6, "Error: Please enter the Connection Port from the Wireless debugging screen first.");
                        break;
                    }
                }
                break;
            case 2:
                c3 c3Var3 = (c3) obj2;
                String str3 = (String) obj;
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj3;
                MutableState mutableState7 = (MutableState) obj4;
                MutableState mutableState8 = this.f;
                if (!j4.b(mutableState8)) {
                    MutableState mutableState9 = this.g;
                    int length2 = ds0.E0((String) mutableState9.getValue()).toString().length();
                    MutableState mutableState10 = this.h;
                    if (length2 != 0) {
                        mutableState8.setValue(Boolean.TRUE);
                        p01.t(unVar, null, null, new t3(c3Var3, str3, sharedPreferences2, mutableState10, mutableState8, mutableState9, mutableState7, (hm) null), 3);
                        break;
                    } else {
                        j4.e(mutableState10, "Error: Please enter the Connection Port from the Wireless debugging screen first.");
                        break;
                    }
                }
                break;
            default:
                p01.t(unVar, null, null, new mz0((Context) obj4, (rw0) obj3, (SharedPreferences) obj2, (ky) obj, this.f, this.g, this.h, null), 3);
                break;
        }
        return w01Var;
    }

    public /* synthetic */ l3(un unVar, Context context, rw0 rw0Var, SharedPreferences sharedPreferences, ky kyVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.e = unVar;
        this.k = context;
        this.l = rw0Var;
        this.i = sharedPreferences;
        this.j = kyVar;
        this.f = mutableState;
        this.g = mutableState2;
        this.h = mutableState3;
    }

    public /* synthetic */ l3(un unVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, c3 c3Var, String str, SharedPreferences sharedPreferences, iy iyVar) {
        this.e = unVar;
        this.f = mutableState;
        this.g = mutableState2;
        this.h = mutableState3;
        this.i = c3Var;
        this.j = str;
        this.k = sharedPreferences;
        this.l = iyVar;
    }

    public /* synthetic */ l3(un unVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, c3 c3Var, String str, SharedPreferences sharedPreferences, MutableState mutableState4) {
        this.e = unVar;
        this.f = mutableState;
        this.g = mutableState2;
        this.h = mutableState3;
        this.i = c3Var;
        this.j = str;
        this.l = sharedPreferences;
        this.k = mutableState4;
    }
}
