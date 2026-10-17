package androidx.compose.foundation;

import android.view.Surface;
import defpackage.kn;
import defpackage.ky;
import defpackage.ny;
import defpackage.un;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 implements SurfaceCoroutineScope, SurfaceScope, un {
    private final /* synthetic */ BaseAndroidExternalSurfaceState $$delegate_0;
    private final /* synthetic */ un $$delegate_1;

    public BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1(BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, un unVar) {
        this.$$delegate_0 = baseAndroidExternalSurfaceState;
        this.$$delegate_1 = unVar;
    }

    @Override // androidx.compose.foundation.SurfaceCoroutineScope, defpackage.un
    public kn getCoroutineContext() {
        return this.$$delegate_1.getCoroutineContext();
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onChanged(Surface surface, ny nyVar) {
        this.$$delegate_0.onChanged(surface, nyVar);
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(Surface surface, ky kyVar) {
        this.$$delegate_0.onDestroyed(surface, kyVar);
    }
}
