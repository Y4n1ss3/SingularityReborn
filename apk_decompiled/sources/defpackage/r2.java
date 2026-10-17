package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class r2 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ un e;
    public final /* synthetic */ MutableState f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ r2(un unVar, ky kyVar, rw0 rw0Var, SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2) {
        this.d = 6;
        this.e = unVar;
        this.j = sharedPreferences;
        this.h = rw0Var;
        this.f = mutableState;
        this.g = mutableState2;
        this.i = kyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iy
    public final Object invoke() {
        ArrayList B0;
        int i = this.d;
        int i2 = 0;
        MutableState mutableState = this.g;
        MutableState mutableState2 = this.f;
        w01 w01Var = w01.a;
        Object obj = this.h;
        Object obj2 = this.j;
        Object obj3 = this.i;
        un unVar = this.e;
        switch (i) {
            case 0:
                MutableState mutableState3 = (MutableState) obj;
                SharedPreferences sharedPreferences = (SharedPreferences) obj2;
                MutableState mutableState4 = (MutableState) obj3;
                MutableState mutableState5 = this.f;
                if (!((Boolean) mutableState5.getValue()).booleanValue() && !((Boolean) mutableState.getValue()).booleanValue()) {
                    mutableState5.setValue(Boolean.TRUE);
                    mutableState3.setValue(Boolean.FALSE);
                    p01.t(unVar, null, null, new x2(sharedPreferences, mutableState4, mutableState3, mutableState5, null, 0), 3);
                    break;
                }
                break;
            case 1:
                MutableState mutableState6 = (MutableState) obj;
                ky kyVar = (ky) obj2;
                MutableState mutableState7 = (MutableState) obj3;
                if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                    MutableState mutableState8 = this.g;
                    if (!((Boolean) mutableState8.getValue()).booleanValue() && ((Boolean) mutableState6.getValue()).booleanValue()) {
                        mutableState8.setValue(Boolean.TRUE);
                        p01.t(unVar, null, null, new a3(kyVar, mutableState7, mutableState6, mutableState8, (hm) null), 3);
                        break;
                    }
                }
                break;
            case 2:
                c3 c3Var = (c3) obj3;
                String str = (String) obj2;
                MutableState mutableState9 = (MutableState) obj;
                MutableState mutableState10 = this.f;
                if (!j4.b(mutableState10)) {
                    mutableState10.setValue(Boolean.TRUE);
                    p01.t(unVar, null, null, new u3(c3Var, str, this.g, mutableState10, mutableState9, null, 0), 3);
                    break;
                }
                break;
            case 3:
                Context context = (Context) obj2;
                MutableState mutableState11 = (MutableState) obj;
                MutableState mutableState12 = (MutableState) obj3;
                String obj4 = ds0.E0((String) mutableState2.getValue()).toString();
                if (obj4.length() > 0) {
                    Map map = hs.a;
                    context.getClass();
                    String lowerCase = ds0.E0(obj4).toString().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    String A0 = ds0.A0(ds0.G0(ds0.t0(ds0.t0(lowerCase, "https://"), "http://"), '/'), '/');
                    if (A0.length() == 0) {
                        B0 = hs.d(context);
                    } else {
                        ArrayList d = hs.d(context);
                        if (d.contains(A0)) {
                            B0 = d;
                        } else {
                            B0 = yi.B0(d, A0);
                            hs.f(context, B0);
                        }
                    }
                    mutableState.setValue(B0);
                    mutableState2.setValue("");
                    if (gs.b(mutableState11) && ((Boolean) mutableState12.getValue()).booleanValue()) {
                        p01.t(unVar, null, null, new e4(context, null, 12), 3);
                        break;
                    }
                }
                break;
            case 4:
                Context context2 = (Context) obj3;
                String str2 = (String) obj2;
                MutableState mutableState13 = (MutableState) obj;
                Map map2 = hs.a;
                context2.getClass();
                str2.getClass();
                ArrayList d2 = hs.d(context2);
                ArrayList arrayList = new ArrayList();
                int size = d2.size();
                while (i2 < size) {
                    Object obj5 = d2.get(i2);
                    i2++;
                    if (!q10.b((String) obj5, str2)) {
                        arrayList.add(obj5);
                    }
                }
                hs.f(context2, arrayList);
                mutableState2.setValue(arrayList);
                if (gs.b(mutableState) && ((Boolean) mutableState13.getValue()).booleanValue()) {
                    p01.t(unVar, null, null, new e4(context2, null, 12), 3);
                    break;
                }
                break;
            case 5:
                p01.t(unVar, null, null, new u3((Context) obj3, (a11) obj2, this.f, this.g, (MutableState) obj, null, 7), 3);
                break;
            case 6:
                nq nqVar = nr.a;
                p01.t(unVar, hq.d, null, new c01((SharedPreferences) obj2, (rw0) obj, this.f, this.g, (ky) obj3, null), 2);
                break;
            default:
                p01.t(unVar, null, null, new u3(this.f, this.g, (Context) obj3, (yz0) obj2, (MutableState) obj, (hm) null), 3);
                break;
        }
        return w01Var;
    }

    public /* synthetic */ r2(un unVar, Context context, a11 a11Var, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.d = 5;
        this.e = unVar;
        this.i = context;
        this.j = a11Var;
        this.f = mutableState;
        this.g = mutableState2;
        this.h = mutableState3;
    }

    public /* synthetic */ r2(un unVar, MutableState mutableState, c3 c3Var, String str, MutableState mutableState2, MutableState mutableState3) {
        this.d = 2;
        this.e = unVar;
        this.f = mutableState;
        this.i = c3Var;
        this.j = str;
        this.g = mutableState2;
        this.h = mutableState3;
    }

    public /* synthetic */ r2(un unVar, MutableState mutableState, MutableState mutableState2, Context context, yz0 yz0Var, MutableState mutableState3) {
        this.d = 7;
        this.e = unVar;
        this.f = mutableState;
        this.g = mutableState2;
        this.i = context;
        this.j = yz0Var;
        this.h = mutableState3;
    }

    public /* synthetic */ r2(un unVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Object obj, MutableState mutableState4, int i) {
        this.d = i;
        this.e = unVar;
        this.f = mutableState;
        this.g = mutableState2;
        this.h = mutableState3;
        this.j = obj;
        this.i = mutableState4;
    }

    public /* synthetic */ r2(Context context, MutableState mutableState, MutableState mutableState2, un unVar, MutableState mutableState3, MutableState mutableState4) {
        this.d = 3;
        this.j = context;
        this.f = mutableState;
        this.g = mutableState2;
        this.e = unVar;
        this.h = mutableState3;
        this.i = mutableState4;
    }

    public /* synthetic */ r2(Context context, String str, MutableState mutableState, un unVar, MutableState mutableState2, MutableState mutableState3) {
        this.d = 4;
        this.i = context;
        this.j = str;
        this.f = mutableState;
        this.e = unVar;
        this.g = mutableState2;
        this.h = mutableState3;
    }
}
