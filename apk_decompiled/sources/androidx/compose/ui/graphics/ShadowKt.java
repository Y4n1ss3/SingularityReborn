package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ShadowKt {
    public static final Shadow lerp(Shadow shadow, Shadow shadow2, float f) {
        return new Shadow(ColorKt.m4812lerpjxsXWHM(shadow.m5105getColor0d7_KjU(), shadow2.m5105getColor0d7_KjU(), f), OffsetKt.m4539lerpWko1d7g(shadow.m5106getOffsetF1C5BW0(), shadow2.m5106getOffsetF1C5BW0(), f), MathHelpersKt.lerp(shadow.getBlurRadius(), shadow2.getBlurRadius(), f), null);
    }
}
