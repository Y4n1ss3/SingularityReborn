package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class rr extends d20 {
    public final qr h;

    public rr(qr qrVar) {
        this.h = qrVar;
    }

    @Override // defpackage.d20
    public final boolean k() {
        return false;
    }

    @Override // defpackage.d20
    public final void l(Throwable th) {
        this.h.dispose();
    }
}
