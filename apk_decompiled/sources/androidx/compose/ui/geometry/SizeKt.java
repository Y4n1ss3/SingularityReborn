package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SizeKt {
    public static final long Size(float f, float f2) {
        return Size.m4576constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m4595getCenteruvyYCjk(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    /* renamed from: isSpecified-uvyYCjk, reason: not valid java name */
    public static final boolean m4597isSpecifieduvyYCjk(long j) {
        return j != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-uvyYCjk, reason: not valid java name */
    public static final boolean m4599isUnspecifieduvyYCjk(long j) {
        return j == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: lerp-VgWVRYQ, reason: not valid java name */
    public static final long m4601lerpVgWVRYQ(long j, long j2, float f) {
        float lerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float lerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return Size.m4576constructorimpl((Float.floatToRawIntBits(lerp) << 32) | (Float.floatToRawIntBits(lerp2) & 4294967295L));
    }

    /* renamed from: takeOrElse-TmRCtEA, reason: not valid java name */
    public static final long m4602takeOrElseTmRCtEA(long j, iy iyVar) {
        return j != InlineClassHelperKt.UnspecifiedPackedFloats ? j : ((Size) iyVar.invoke()).m4590unboximpl();
    }

    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m4605timesd16Qtg0(int i, long j) {
        return Size.m4588times7Ah8Wj8(j, i);
    }

    /* renamed from: toRect-uvyYCjk, reason: not valid java name */
    public static final Rect m4606toRectuvyYCjk(long j) {
        return RectKt.m4556Recttz77jQw(Offset.Companion.m4532getZeroF1C5BW0(), j);
    }

    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m4603timesd16Qtg0(double d, long j) {
        return Size.m4588times7Ah8Wj8(j, (float) d);
    }

    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m4604timesd16Qtg0(float f, long j) {
        return Size.m4588times7Ah8Wj8(j, f);
    }

    /* renamed from: getCenter-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m4596getCenteruvyYCjk$annotations(long j) {
    }

    /* renamed from: isSpecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m4598isSpecifieduvyYCjk$annotations(long j) {
    }

    /* renamed from: isUnspecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m4600isUnspecifieduvyYCjk$annotations(long j) {
    }
}
