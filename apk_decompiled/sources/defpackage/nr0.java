package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class nr0<T> {
    public static final mr0 Companion = new mr0();
    public static final g30[] c = {y80.B(g40.d, new sn0(5)), null};
    public static final qf0 d;
    public final List a;
    public final List b;

    static {
        qf0 qf0Var = new qf0("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
        qf0Var.i("keys");
        qf0Var.i("values");
        d = qf0Var;
    }

    public nr0(List list, List list2, int i) {
        if (3 == (i & 3)) {
            this.a = list;
            this.b = list2;
            return;
        }
        qf0 qf0Var = d;
        qf0Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = (~i) & 3;
        for (int i3 = 0; i3 < 32; i3++) {
            if ((i2 & 1) != 0) {
                arrayList.add(qf0Var.e[i3]);
            }
            i2 >>>= 1;
        }
        String str = qf0Var.a;
        throw new g90(arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + str + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing", null);
    }

    public nr0(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }
}
