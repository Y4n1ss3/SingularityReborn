package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class u01 extends tl0 {
    public final ThreadLocal h;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u01(hm hmVar, kn knVar) {
        super(hmVar, knVar.get(r0) == null ? knVar.plus(r0) : knVar);
        v01 v01Var = v01.d;
        this.h = new ThreadLocal();
        if (hmVar.getContext().get(ts.i) instanceof mn) {
            return;
        }
        Object X = y80.X(knVar, null);
        y80.N(knVar, X);
        b0(knVar, X);
    }

    public final boolean a0() {
        boolean z = this.threadLocalIsSet && this.h.get() == null;
        this.h.remove();
        return !z;
    }

    public final void b0(kn knVar, Object obj) {
        this.threadLocalIsSet = true;
        this.h.set(new xe0(knVar, obj));
    }

    @Override // defpackage.tl0, defpackage.i20
    public final void q(Object obj) {
        if (this.threadLocalIsSet) {
            xe0 xe0Var = (xe0) this.h.get();
            if (xe0Var != null) {
                y80.N((kn) xe0Var.d, xe0Var.e);
            }
            this.h.remove();
        }
        Object F = d41.F(obj);
        hm hmVar = this.g;
        kn context = hmVar.getContext();
        Object X = y80.X(context, null);
        u01 G = X != y80.i ? p01.G(hmVar, context, X) : null;
        try {
            this.g.resumeWith(F);
            if (G == null || G.a0()) {
                y80.N(context, X);
            }
        } catch (Throwable th) {
            if (G == null || G.a0()) {
                y80.N(context, X);
            }
            throw th;
        }
    }
}
