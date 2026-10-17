package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OffsetKt {
    public static final long Offset(float f, float f2) {
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: isFinite-k-4lQ0M, reason: not valid java name */
    public static final boolean m4533isFinitek4lQ0M(long j) {
        return ((((j & InlineClassHelperKt.DualFloatInfinityBase) ^ InlineClassHelperKt.DualFloatInfinityBase) - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0;
    }

    /* renamed from: isSpecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m4535isSpecifiedk4lQ0M(long j) {
        return (j & InlineClassHelperKt.DualUnsignedFloatMask) != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m4537isUnspecifiedk4lQ0M(long j) {
        return (j & InlineClassHelperKt.DualUnsignedFloatMask) == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: lerp-Wko1d7g, reason: not valid java name */
    public static final long m4539lerpWko1d7g(long j, long j2, float f) {
        float lerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float lerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(lerp) << 32) | (Float.floatToRawIntBits(lerp2) & 4294967295L));
    }

    /* renamed from: takeOrElse-3MmeM6k, reason: not valid java name */
    public static final long m4540takeOrElse3MmeM6k(long j, iy iyVar) {
        return (InlineClassHelperKt.DualUnsignedFloatMask & j) != InlineClassHelperKt.UnspecifiedPackedFloats ? j : ((Offset) iyVar.invoke()).m4526unboximpl();
    }

    /* renamed from: isFinite-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m4534isFinitek4lQ0M$annotations(long j) {
    }

    /* renamed from: isSpecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m4536isSpecifiedk4lQ0M$annotations(long j) {
    }

    /* renamed from: isUnspecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m4538isUnspecifiedk4lQ0M$annotations(long j) {
    }
}
