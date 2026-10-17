package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class n8 implements ky {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ SharedPreferences e;
    public final /* synthetic */ un f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ n8(un unVar, ky kyVar, rw0 rw0Var, SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2, String str) {
        this.e = sharedPreferences;
        this.f = unVar;
        this.i = kyVar;
        this.j = str;
        this.g = mutableState;
        this.h = mutableState2;
        this.k = rw0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        un unVar = this.f;
        hm hmVar = null;
        switch (i) {
            case 0:
                Context context = (Context) obj3;
                MutableState mutableState = (MutableState) obj4;
                PackageManager packageManager = (PackageManager) obj2;
                q90 q90Var = (q90) obj;
                q90Var.getClass();
                MutableState mutableState2 = this.g;
                List<sa> list = (List) mutableState2.getValue();
                ArrayList arrayList = new ArrayList(zi.a0(list, 10));
                for (sa saVar : list) {
                    if (saVar.a.a.equals(q90Var.a)) {
                        saVar = sa.a(saVar, "Starting...", false, false, null, 505);
                    }
                    arrayList.add(saVar);
                }
                mutableState2.setValue(arrayList);
                nq nqVar = nr.a;
                p01.t(unVar, hq.d, null, new s3(context, q90Var, mutableState2, this.e, this.h, mutableState, packageManager, (hm) null), 2);
                break;
            default:
                ky kyVar = (ky) obj4;
                String str = (String) obj3;
                rw0 rw0Var = (rw0) obj2;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                r6.f(this.g, bool, this.e, "fan_sleep_lower_enabled", booleanValue);
                if (((Boolean) this.h.getValue()).booleanValue()) {
                    nq nqVar2 = nr.a;
                    p01.t(unVar, hq.d, null, new z2(rw0Var, hmVar, 8), 2);
                }
                kyVar.invoke(booleanValue ? "System will take over fan control while asleep" : uo.d("Manual ", str, " will hold while asleep"));
                break;
        }
        return w01Var;
    }

    public /* synthetic */ n8(un unVar, Context context, SharedPreferences sharedPreferences, PackageManager packageManager, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.f = unVar;
        this.g = mutableState;
        this.j = context;
        this.e = sharedPreferences;
        this.h = mutableState2;
        this.i = mutableState3;
        this.k = packageManager;
    }
}
