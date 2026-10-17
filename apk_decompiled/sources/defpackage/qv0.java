package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class qv0 extends tl0 implements Runnable {
    public final long h;

    public qv0(long j, im imVar) {
        super(imVar, imVar.getContext());
        this.h = j;
    }

    @Override // defpackage.i20
    public final String M() {
        return super.M() + "(timeMillis=" + this.h + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        y80.u(this.f);
        s(new pv0("Timed out waiting for " + this.h + " ms", this));
    }
}
