package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class x01 extends mn {
    public static final x01 d = new x01();

    @Override // defpackage.mn
    public final void dispatch(kn knVar, Runnable runnable) {
        nq.e.d.b(runnable, true, false);
    }

    @Override // defpackage.mn
    public final void dispatchYield(kn knVar, Runnable runnable) {
        nq.e.d.b(runnable, true, true);
    }

    @Override // defpackage.mn
    public final mn limitedParallelism(int i, String str) {
        cq.e(i);
        return i >= nt0.d ? str != null ? new pb0(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // defpackage.mn
    public final String toString() {
        return "Dispatchers.IO";
    }
}
