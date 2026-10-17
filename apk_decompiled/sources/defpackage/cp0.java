package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class cp0 extends m0 {
    public long a;
    public gg b;

    @Override // defpackage.m0
    public final boolean a(l0 l0Var) {
        bp0 bp0Var = (bp0) l0Var;
        if (this.a >= 0) {
            return false;
        }
        long j = bp0Var.l;
        if (j < bp0Var.m) {
            bp0Var.m = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.m0
    public final hm[] b(l0 l0Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((bp0) l0Var).u(j);
    }
}
