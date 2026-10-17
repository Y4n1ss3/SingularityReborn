package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class sc0 extends l implements z10 {
    public static final sc0 d = new sc0(ts.l);

    @Override // defpackage.z10
    public final yh b(i20 i20Var) {
        return tc0.d;
    }

    @Override // defpackage.z10
    public final qr e(boolean z, boolean z2, c20 c20Var) {
        return tc0.d;
    }

    @Override // defpackage.z10
    public final CancellationException f() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.z10
    public final qr h(ky kyVar) {
        return tc0.d;
    }

    @Override // defpackage.z10
    public final boolean isActive() {
        return true;
    }

    @Override // defpackage.z10
    public final Object n(im imVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.z10
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.z10, defpackage.zg
    public final void cancel(CancellationException cancellationException) {
    }
}
