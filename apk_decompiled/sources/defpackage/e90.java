package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class e90 {
    public final SparseArray a;
    public r01 b;

    public e90(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(r01 r01Var, int i, int i2) {
        int a = r01Var.a(i);
        SparseArray sparseArray = this.a;
        e90 e90Var = (e90) sparseArray.get(a);
        if (e90Var == null) {
            e90Var = new e90(1);
            sparseArray.put(r01Var.a(i), e90Var);
        }
        if (i2 > i) {
            e90Var.a(r01Var, i + 1, i2);
        } else {
            e90Var.b = r01Var;
        }
    }
}
