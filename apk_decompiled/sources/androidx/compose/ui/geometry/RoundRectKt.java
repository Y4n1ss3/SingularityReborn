package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RoundRectKt {
    public static final RoundRect RoundRect(float f, float f2, float f3, float f4, float f5, float f6) {
        long m4470constructorimpl = CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
        return new RoundRect(f, f2, f3, f4, m4470constructorimpl, m4470constructorimpl, m4470constructorimpl, m4470constructorimpl, null);
    }

    /* renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m4568RoundRectZAM2FJo(Rect rect, long j, long j2, long j3, long j4) {
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j, j2, j3, j4, null);
    }

    /* renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m4570RoundRectgG7oq9Y(float f, float f2, float f3, float f4, long j) {
        return RoundRect(f, f2, f3, f4, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m4571RoundRectsniSvfs(Rect rect, long j) {
        return RoundRect(rect, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final Rect getBoundingRect(RoundRect roundRect) {
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(RoundRect roundRect) {
        float width = (roundRect.getWidth() / 2.0f) + roundRect.getLeft();
        float height = (roundRect.getHeight() / 2.0f) + roundRect.getTop();
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L));
    }

    public static final float getMaxDimension(RoundRect roundRect) {
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(RoundRect roundRect) {
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final Rect getSafeInnerRect(RoundRect roundRect) {
        float max = Math.max(Float.intBitsToFloat((int) (roundRect.m4564getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (roundRect.m4566getTopLeftCornerRadiuskKHJgLs() >> 32)));
        float max2 = Math.max(Float.intBitsToFloat((int) (roundRect.m4566getTopLeftCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (roundRect.m4567getTopRightCornerRadiuskKHJgLs() & 4294967295L)));
        return new Rect((max * 0.29289323f) + roundRect.getLeft(), (max2 * 0.29289323f) + roundRect.getTop(), roundRect.getRight() - (Math.max(Float.intBitsToFloat((int) (roundRect.m4567getTopRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (roundRect.m4565getBottomRightCornerRadiuskKHJgLs() >> 32))) * 0.29289323f), roundRect.getBottom() - (Math.max(Float.intBitsToFloat((int) (roundRect.m4565getBottomRightCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (roundRect.m4564getBottomLeftCornerRadiuskKHJgLs() & 4294967295L))) * 0.29289323f));
    }

    public static final boolean isCircle(RoundRect roundRect) {
        return roundRect.getWidth() == roundRect.getHeight() && isEllipse(roundRect);
    }

    public static final boolean isEllipse(RoundRect roundRect) {
        return roundRect.m4566getTopLeftCornerRadiuskKHJgLs() == roundRect.m4567getTopRightCornerRadiuskKHJgLs() && roundRect.m4567getTopRightCornerRadiuskKHJgLs() == roundRect.m4565getBottomRightCornerRadiuskKHJgLs() && roundRect.m4565getBottomRightCornerRadiuskKHJgLs() == roundRect.m4564getBottomLeftCornerRadiuskKHJgLs() && ((double) roundRect.getWidth()) <= ((double) Float.intBitsToFloat((int) (roundRect.m4566getTopLeftCornerRadiuskKHJgLs() >> 32))) * 2.0d && ((double) roundRect.getHeight()) <= ((double) Float.intBitsToFloat((int) (roundRect.m4566getTopLeftCornerRadiuskKHJgLs() & 4294967295L))) * 2.0d;
    }

    public static final boolean isEmpty(RoundRect roundRect) {
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(RoundRect roundRect) {
        return (Float.floatToRawIntBits(roundRect.getLeft()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getTop()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getRight()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getBottom()) & Integer.MAX_VALUE) < 2139095040;
    }

    public static final boolean isRect(RoundRect roundRect) {
        long m4566getTopLeftCornerRadiuskKHJgLs = roundRect.m4566getTopLeftCornerRadiuskKHJgLs() & InlineClassHelperKt.DualUnsignedFloatMask;
        if (((~m4566getTopLeftCornerRadiuskKHJgLs) & (m4566getTopLeftCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long m4567getTopRightCornerRadiuskKHJgLs = roundRect.m4567getTopRightCornerRadiuskKHJgLs() & InlineClassHelperKt.DualUnsignedFloatMask;
        if (((~m4567getTopRightCornerRadiuskKHJgLs) & (m4567getTopRightCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long m4564getBottomLeftCornerRadiuskKHJgLs = roundRect.m4564getBottomLeftCornerRadiuskKHJgLs() & InlineClassHelperKt.DualUnsignedFloatMask;
        if (((~m4564getBottomLeftCornerRadiuskKHJgLs) & (m4564getBottomLeftCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long m4565getBottomRightCornerRadiuskKHJgLs = roundRect.m4565getBottomRightCornerRadiuskKHJgLs() & InlineClassHelperKt.DualUnsignedFloatMask;
        return (((~m4565getBottomRightCornerRadiuskKHJgLs) & (m4565getBottomRightCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) != 0;
    }

    public static final boolean isSimple(RoundRect roundRect) {
        long m4566getTopLeftCornerRadiuskKHJgLs = roundRect.m4566getTopLeftCornerRadiuskKHJgLs();
        return (m4566getTopLeftCornerRadiuskKHJgLs >>> 32) == (m4566getTopLeftCornerRadiuskKHJgLs & 4294967295L) && roundRect.m4566getTopLeftCornerRadiuskKHJgLs() == roundRect.m4567getTopRightCornerRadiuskKHJgLs() && roundRect.m4566getTopLeftCornerRadiuskKHJgLs() == roundRect.m4565getBottomRightCornerRadiuskKHJgLs() && roundRect.m4566getTopLeftCornerRadiuskKHJgLs() == roundRect.m4564getBottomLeftCornerRadiuskKHJgLs();
    }

    public static final RoundRect lerp(RoundRect roundRect, RoundRect roundRect2, float f) {
        return new RoundRect(MathHelpersKt.lerp(roundRect.getLeft(), roundRect2.getLeft(), f), MathHelpersKt.lerp(roundRect.getTop(), roundRect2.getTop(), f), MathHelpersKt.lerp(roundRect.getRight(), roundRect2.getRight(), f), MathHelpersKt.lerp(roundRect.getBottom(), roundRect2.getBottom(), f), CornerRadiusKt.m4489lerp3Ry4LBc(roundRect.m4566getTopLeftCornerRadiuskKHJgLs(), roundRect2.m4566getTopLeftCornerRadiuskKHJgLs(), f), CornerRadiusKt.m4489lerp3Ry4LBc(roundRect.m4567getTopRightCornerRadiuskKHJgLs(), roundRect2.m4567getTopRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m4489lerp3Ry4LBc(roundRect.m4565getBottomRightCornerRadiuskKHJgLs(), roundRect2.m4565getBottomRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m4489lerp3Ry4LBc(roundRect.m4564getBottomLeftCornerRadiuskKHJgLs(), roundRect2.m4564getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }

    /* renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m4572translateUv8p0NA(RoundRect roundRect, long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (4294967295L & j);
        return new RoundRect(roundRect.getLeft() + Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + roundRect.getTop(), roundRect.getRight() + Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + roundRect.getBottom(), roundRect.m4566getTopLeftCornerRadiuskKHJgLs(), roundRect.m4567getTopRightCornerRadiuskKHJgLs(), roundRect.m4565getBottomRightCornerRadiuskKHJgLs(), roundRect.m4564getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    public static final RoundRect RoundRect(Rect rect, float f, float f2) {
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2);
    }
}
