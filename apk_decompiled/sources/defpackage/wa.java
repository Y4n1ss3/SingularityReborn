package defpackage;

import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class wa implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ q90 f;

    public /* synthetic */ wa(MutableState mutableState, q90 q90Var, int i) {
        this.d = i;
        this.e = mutableState;
        this.f = q90Var;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        q90 q90Var = this.f;
        MutableState mutableState = this.e;
        switch (i) {
            case 0:
                String str = (String) obj;
                ni0 ni0Var = kb.a;
                List<sa> list = (List) mutableState.getValue();
                ArrayList arrayList = new ArrayList(zi.a0(list, 10));
                for (sa saVar : list) {
                    if (saVar.a.a.equals(q90Var.a)) {
                        saVar = sa.a(saVar, str, false, false, null, 505);
                    }
                    arrayList.add(saVar);
                }
                mutableState.setValue(arrayList);
                break;
            default:
                String str2 = (String) obj;
                ni0 ni0Var2 = kb.a;
                List<sa> list2 = (List) mutableState.getValue();
                ArrayList arrayList2 = new ArrayList(zi.a0(list2, 10));
                for (sa saVar2 : list2) {
                    if (saVar2.a.a.equals(q90Var.a)) {
                        saVar2 = sa.a(saVar2, str2, false, false, null, 505);
                    }
                    arrayList2.add(saVar2);
                }
                mutableState.setValue(arrayList2);
                break;
        }
        return w01Var;
    }
}
