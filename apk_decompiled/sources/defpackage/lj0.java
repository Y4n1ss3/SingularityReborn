package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class lj0 extends d20 {
    public final e20 h;

    public lj0(e20 e20Var) {
        this.h = e20Var;
    }

    @Override // defpackage.d20
    public final boolean k() {
        return false;
    }

    @Override // defpackage.d20
    public final void l(Throwable th) {
        Object E = j().E();
        boolean z = E instanceof sj;
        e20 e20Var = this.h;
        if (z) {
            e20Var.resumeWith(p10.p(((sj) E).a));
        } else {
            e20Var.resumeWith(d41.N(E));
        }
    }
}
