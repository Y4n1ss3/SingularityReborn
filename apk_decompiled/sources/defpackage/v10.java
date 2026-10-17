package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class v10 extends d20 {
    public static final /* synthetic */ long i = dc.a.objectFieldOffset(v10.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final c20 h;

    public v10(c20 c20Var) {
        this.h = c20Var;
    }

    @Override // defpackage.d20
    public final boolean k() {
        return true;
    }

    @Override // defpackage.d20
    public final void l(Throwable th) {
        if (dc.a.compareAndSwapInt(this, i, 0, 1)) {
            this.h.invoke(th);
        }
    }
}
