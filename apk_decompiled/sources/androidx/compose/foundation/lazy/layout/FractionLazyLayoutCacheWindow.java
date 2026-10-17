package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.unit.Density;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FractionLazyLayoutCacheWindow implements LazyLayoutCacheWindow {
    private final float aheadFraction;
    private final float behindFraction;

    public FractionLazyLayoutCacheWindow(float f, float f2) {
        this.aheadFraction = f;
        this.behindFraction = f2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
    public int calculateAheadWindow(Density density, int i) {
        return y80.P(i * this.aheadFraction);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
    public int calculateBehindWindow(Density density, int i) {
        return y80.P(i * this.behindFraction);
    }

    public boolean equals(Object obj) {
        if (obj instanceof FractionLazyLayoutCacheWindow) {
            FractionLazyLayoutCacheWindow fractionLazyLayoutCacheWindow = (FractionLazyLayoutCacheWindow) obj;
            if (fractionLazyLayoutCacheWindow.aheadFraction == this.aheadFraction && fractionLazyLayoutCacheWindow.behindFraction == this.behindFraction) {
                return true;
            }
        }
        return false;
    }

    public final float getAheadFraction() {
        return this.aheadFraction;
    }

    public final float getBehindFraction() {
        return this.behindFraction;
    }

    public int hashCode() {
        return Float.hashCode(this.behindFraction) + (Float.hashCode(this.aheadFraction) * 31);
    }
}
