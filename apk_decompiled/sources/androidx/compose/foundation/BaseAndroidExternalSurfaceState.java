package androidx.compose.foundation;

import android.view.Surface;
import defpackage.ky;
import defpackage.ny;
import defpackage.p01;
import defpackage.py;
import defpackage.un;
import defpackage.xn;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
abstract class BaseAndroidExternalSurfaceState implements AndroidExternalSurfaceScope, SurfaceScope {
    private z10 job;
    private py onSurface;
    private ny onSurfaceChanged;
    private ky onSurfaceDestroyed;
    private final un scope;

    public BaseAndroidExternalSurfaceState(un unVar) {
        this.scope = unVar;
    }

    public final void dispatchSurfaceChanged(Surface surface, int i, int i2) {
        ny nyVar = this.onSurfaceChanged;
        if (nyVar != null) {
            nyVar.invoke(surface, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public final void dispatchSurfaceCreated(Surface surface, int i, int i2) {
        if (this.onSurface != null) {
            this.job = p01.t(this.scope, null, xn.g, new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(this, surface, i, i2, null), 1);
        }
    }

    public final void dispatchSurfaceDestroyed(Surface surface) {
        ky kyVar = this.onSurfaceDestroyed;
        if (kyVar != null) {
            kyVar.invoke(surface);
        }
        z10 z10Var = this.job;
        if (z10Var != null) {
            z10Var.cancel(null);
        }
    }

    public final un getScope() {
        return this.scope;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onChanged(Surface surface, ny nyVar) {
        this.onSurfaceChanged = nyVar;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(Surface surface, ky kyVar) {
        this.onSurfaceDestroyed = kyVar;
    }

    @Override // androidx.compose.foundation.AndroidExternalSurfaceScope
    public void onSurface(py pyVar) {
        this.onSurface = pyVar;
    }
}
