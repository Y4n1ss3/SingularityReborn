package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class e20 extends gg {
    public final i20 l;

    public e20(hm hmVar, i20 i20Var) {
        super(1, hmVar);
        this.l = i20Var;
    }

    @Override // defpackage.gg
    public final Throwable r(i20 i20Var) {
        Throwable c;
        Object E = this.l.E();
        return (!(E instanceof g20) || (c = ((g20) E).c()) == null) ? E instanceof sj ? ((sj) E).a : i20Var.f() : c;
    }

    @Override // defpackage.gg
    public final String z() {
        return "AwaitContinuation";
    }
}
