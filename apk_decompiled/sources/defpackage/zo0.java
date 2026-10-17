package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class zo0 implements qr {
    public final bp0 d;
    public final long e;
    public final Object f;
    public final gg g;

    public zo0(bp0 bp0Var, long j, Object obj, gg ggVar) {
        this.d = bp0Var;
        this.e = j;
        this.f = obj;
        this.g = ggVar;
    }

    @Override // defpackage.qr
    public final void dispose() {
        bp0 bp0Var = this.d;
        synchronized (bp0Var) {
            if (this.e < bp0Var.o()) {
                return;
            }
            Object[] objArr = bp0Var.k;
            objArr.getClass();
            long j = this.e;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            p01.B(objArr, j, p01.e);
            bp0Var.j();
        }
    }
}
