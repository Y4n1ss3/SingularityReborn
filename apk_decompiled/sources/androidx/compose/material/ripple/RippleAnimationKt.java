package androidx.compose.material.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RippleAnimationKt {
    private static final float BoundedRippleExtraRadius = Dp.m7611constructorimpl(10.0f);
    private static final int FadeInDuration = 75;
    private static final int FadeOutDuration = 150;
    private static final int RadiusDuration = 225;

    /* renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m1577getRippleEndRadiuscSwnlzA(Density density, boolean z, long j) {
        float m4514getDistanceimpl = Offset.m4514getDistanceimpl(OffsetKt.Offset(Size.m4585getWidthimpl(j), Size.m4582getHeightimpl(j))) / 2.0f;
        return z ? density.mo367toPx0680j_4(BoundedRippleExtraRadius) + m4514getDistanceimpl : m4514getDistanceimpl;
    }

    /* renamed from: getRippleStartRadius-uvyYCjk, reason: not valid java name */
    public static final float m1578getRippleStartRadiusuvyYCjk(long j) {
        return Math.max(Size.m4585getWidthimpl(j), Size.m4582getHeightimpl(j)) * 0.3f;
    }
}
