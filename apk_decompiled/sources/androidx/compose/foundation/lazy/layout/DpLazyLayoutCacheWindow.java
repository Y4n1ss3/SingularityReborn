package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DpLazyLayoutCacheWindow implements LazyLayoutCacheWindow {
    private final float ahead;
    private final float behind;

    private DpLazyLayoutCacheWindow(float f, float f2) {
        this.ahead = f;
        this.behind = f2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
    public int calculateAheadWindow(Density density, int i) {
        return density.mo361roundToPx0680j_4(this.ahead);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
    public int calculateBehindWindow(Density density, int i) {
        return density.mo361roundToPx0680j_4(this.behind);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DpLazyLayoutCacheWindow) {
            DpLazyLayoutCacheWindow dpLazyLayoutCacheWindow = (DpLazyLayoutCacheWindow) obj;
            if (Dp.m7616equalsimpl0(dpLazyLayoutCacheWindow.ahead, this.ahead) && Dp.m7616equalsimpl0(dpLazyLayoutCacheWindow.behind, this.behind)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getAhead-D9Ej5fM, reason: not valid java name */
    public final float m902getAheadD9Ej5fM() {
        return this.ahead;
    }

    /* renamed from: getBehind-D9Ej5fM, reason: not valid java name */
    public final float m903getBehindD9Ej5fM() {
        return this.behind;
    }

    public int hashCode() {
        return Dp.m7617hashCodeimpl(this.behind) + (Dp.m7617hashCodeimpl(this.ahead) * 31);
    }

    public /* synthetic */ DpLazyLayoutCacheWindow(float f, float f2, dq dqVar) {
        this(f, f2);
    }
}
