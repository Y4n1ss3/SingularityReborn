package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class pb0 extends mn implements yq {
    public final /* synthetic */ yq d;
    public final mn e;
    public final String f;

    /* JADX WARN: Multi-variable type inference failed */
    public pb0(mn mnVar, String str) {
        yq yqVar = mnVar instanceof yq ? (yq) mnVar : null;
        this.d = yqVar == null ? fq.a : yqVar;
        this.e = mnVar;
        this.f = str;
    }

    @Override // defpackage.yq
    public final qr c(long j, Runnable runnable, kn knVar) {
        return this.d.c(j, runnable, knVar);
    }

    @Override // defpackage.yq
    public final void d(long j, gg ggVar) {
        this.d.d(j, ggVar);
    }

    @Override // defpackage.mn
    public final void dispatch(kn knVar, Runnable runnable) {
        this.e.dispatch(knVar, runnable);
    }

    @Override // defpackage.mn
    public final void dispatchYield(kn knVar, Runnable runnable) {
        this.e.dispatchYield(knVar, runnable);
    }

    @Override // defpackage.mn
    public final boolean isDispatchNeeded(kn knVar) {
        return this.e.isDispatchNeeded(knVar);
    }

    @Override // defpackage.mn
    public final String toString() {
        return this.f;
    }
}
