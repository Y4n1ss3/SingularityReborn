package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class l8 implements ky {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ SharedPreferences e;
    public final /* synthetic */ un f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;

    public /* synthetic */ l8(un unVar, MutableState mutableState, Context context, SharedPreferences sharedPreferences, MutableState mutableState2, MutableState mutableState3) {
        this.f = unVar;
        this.g = mutableState;
        this.h = context;
        this.e = sharedPreferences;
        this.i = mutableState2;
        this.j = mutableState3;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                q90 q90Var = (q90) obj;
                q90Var.getClass();
                MutableState mutableState = this.g;
                List<sa> list = (List) mutableState.getValue();
                ArrayList arrayList = new ArrayList(zi.a0(list, 10));
                for (sa saVar : list) {
                    if (saVar.a.a.equals(q90Var.a)) {
                        saVar = sa.a(saVar, "Starting...", false, false, null, 505);
                    }
                    arrayList.add(saVar);
                }
                mutableState.setValue(arrayList);
                nq nqVar = nr.a;
                p01.t(this.f, hq.d, null, new a3(this.h, q90Var, mutableState, this.e, this.i, this.j, null, 5), 2);
                break;
            default:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                r6.f(this.g, bool, this.e, "prevent_auto_install", booleanValue);
                nq nqVar2 = nr.a;
                hq hqVar = hq.d;
                un unVar = this.f;
                p01.t(unVar, hqVar, null, new ba(booleanValue, unVar, this.h, this.i, this.j, null, 0), 2);
                break;
        }
        return w01Var;
    }

    public /* synthetic */ l8(SharedPreferences sharedPreferences, un unVar, MutableState mutableState, Context context, MutableState mutableState2, MutableState mutableState3) {
        this.e = sharedPreferences;
        this.f = unVar;
        this.g = mutableState;
        this.h = context;
        this.i = mutableState2;
        this.j = mutableState3;
    }
}
