package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class zh extends d20 implements yh {
    public final i20 h;

    public zh(i20 i20Var) {
        this.h = i20Var;
    }

    @Override // defpackage.yh
    public final boolean a(Throwable th) {
        return j().w(th);
    }

    @Override // defpackage.d20
    public final boolean k() {
        return true;
    }

    @Override // defpackage.d20
    public final void l(Throwable th) {
        this.h.s(j());
    }
}
