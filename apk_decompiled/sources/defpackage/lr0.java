package defpackage;

import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class lr0 implements a30 {
    public final /* synthetic */ a30 a;
    private final go0 descriptor;

    public lr0(a30 a30Var) {
        qf0 qf0Var = new qf0("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
        qf0Var.i("keys");
        qf0Var.i("values");
        this.descriptor = qf0Var;
        this.a = a30Var;
    }

    @Override // defpackage.a30
    public final void a(uk0 uk0Var, Object obj) {
        nr0 nr0Var = (nr0) obj;
        nr0Var.getClass();
        go0 go0Var = this.descriptor;
        uk0 a = uk0Var.a(go0Var);
        a.i(go0Var, 0, (a30) nr0.c[0].getValue(), nr0Var.a);
        a.i(go0Var, 1, new sb(this.a), nr0Var.b);
    }

    @Override // defpackage.a30
    public final Object b(d41 d41Var) {
        go0 go0Var = this.descriptor;
        d41 d = d41Var.d(go0Var);
        g30[] g30VarArr = nr0.c;
        List list = null;
        boolean z = true;
        int i = 0;
        List list2 = null;
        while (z) {
            int k = d.k(go0Var);
            if (k == -1) {
                z = false;
            } else if (k == 0) {
                a30 a30Var = (a30) g30VarArr[0].getValue();
                a30Var.getClass();
                list = (List) d.q(a30Var);
                i |= 1;
            } else {
                if (k != 1) {
                    throw new g90(j50.h(k, "An unknown field for index "));
                }
                list2 = (List) d.q(new sb(this.a));
                i |= 2;
            }
        }
        return new nr0(list, list2, i);
    }

    @Override // defpackage.a30
    public final go0 c() {
        return this.descriptor;
    }
}
