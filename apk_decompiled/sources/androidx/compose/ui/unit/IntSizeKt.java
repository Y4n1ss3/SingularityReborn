package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Size;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IntSizeKt {
    public static final long IntSize(int i, int i2) {
        return IntSize.m7777constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* renamed from: getCenter-ozmzZPI, reason: not valid java name */
    public static final long m7788getCenterozmzZPI(long j) {
        return IntOffset.m7733constructorimpl((((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32));
    }

    /* renamed from: roundToIntSize-uvyYCjk, reason: not valid java name */
    public static final long m7790roundToIntSizeuvyYCjk(long j) {
        return IntSize.m7777constructorimpl((Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32));
    }

    /* renamed from: times-O0kMr_c, reason: not valid java name */
    public static final long m7791timesO0kMr_c(int i, long j) {
        return IntSize.m7784timesYEO4UFw(j, i);
    }

    /* renamed from: toIntRect-ozmzZPI, reason: not valid java name */
    public static final IntRect m7792toIntRectozmzZPI(long j) {
        return IntRectKt.m7772IntRectVbeCjmY(IntOffset.Companion.m7750getZeronOccac(), j);
    }

    /* renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m7793toIntSizeuvyYCjk(long j) {
        return IntSize.m7777constructorimpl((((int) Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (j >> 32))) << 32));
    }

    /* renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final long m7794toSizeozmzZPI(long j) {
        return Size.m4576constructorimpl((Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
    }

    /* renamed from: getCenter-ozmzZPI$annotations, reason: not valid java name */
    public static /* synthetic */ void m7789getCenterozmzZPI$annotations(long j) {
    }
}
