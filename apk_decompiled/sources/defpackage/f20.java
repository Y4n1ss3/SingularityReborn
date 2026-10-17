package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class f20 extends d20 {
    public final i20 h;
    public final g20 i;
    public final zh j;
    public final Object k;

    public f20(i20 i20Var, g20 g20Var, zh zhVar, Object obj) {
        this.h = i20Var;
        this.i = g20Var;
        this.j = zhVar;
        this.k = obj;
    }

    @Override // defpackage.d20
    public final boolean k() {
        return false;
    }

    @Override // defpackage.d20
    public final void l(Throwable th) {
        zh zhVar = this.j;
        zh N = i20.N(zhVar);
        i20 i20Var = this.h;
        g20 g20Var = this.i;
        Object obj = this.k;
        if (N == null || !i20Var.W(g20Var, N, obj)) {
            g20Var.d.c(new n50(2), 2);
            zh N2 = i20.N(zhVar);
            if (N2 == null || !i20Var.W(g20Var, N2, obj)) {
                i20Var.p(i20Var.z(g20Var, obj));
            }
        }
    }
}
