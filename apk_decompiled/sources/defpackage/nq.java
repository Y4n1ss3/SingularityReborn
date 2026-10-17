package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class nq extends ju {
    public static final nq e;
    public tn d;

    static {
        int i = nt0.c;
        int i2 = nt0.d;
        long j = nt0.e;
        String str = nt0.a;
        nq nqVar = new nq();
        nqVar.d = new tn(i, i2, j, str);
        e = nqVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.mn
    public final void dispatch(kn knVar, Runnable runnable) {
        tn.c(this.d, runnable, 6);
    }

    @Override // defpackage.mn
    public final void dispatchYield(kn knVar, Runnable runnable) {
        tn.c(this.d, runnable, 2);
    }

    @Override // defpackage.mn
    public final mn limitedParallelism(int i, String str) {
        cq.e(i);
        return i >= nt0.c ? str != null ? new pb0(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // defpackage.mn
    public final String toString() {
        return "Dispatchers.Default";
    }
}
