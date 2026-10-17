package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class t40 implements w40, un {
    public final s40 d;
    public final kn e;

    public t40(s40 s40Var, kn knVar) {
        z10 z10Var;
        knVar.getClass();
        this.d = s40Var;
        this.e = knVar;
        if (((a50) s40Var).d != r40.d || (z10Var = (z10) knVar.get(ts.l)) == null) {
            return;
        }
        z10Var.cancel(null);
    }

    @Override // defpackage.un
    public final kn getCoroutineContext() {
        return this.e;
    }

    @Override // defpackage.w40
    public final void onStateChanged(y40 y40Var, q40 q40Var) {
        s40 s40Var = this.d;
        if (((a50) s40Var).d.compareTo(r40.d) <= 0) {
            s40Var.b(this);
            z10 z10Var = (z10) this.e.get(ts.l);
            if (z10Var != null) {
                z10Var.cancel(null);
            }
        }
    }
}
