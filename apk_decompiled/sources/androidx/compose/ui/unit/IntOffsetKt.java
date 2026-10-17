package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.util.MathHelpersKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class IntOffsetKt {
    public static final long IntOffset(int i, int i2) {
        return IntOffset.m7733constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m7751lerp81ZRxRo(long j, long j2, float f) {
        return IntOffset.m7733constructorimpl((MathHelpersKt.lerp(IntOffset.m7739getXimpl(j), IntOffset.m7739getXimpl(j2), f) << 32) | (MathHelpersKt.lerp(IntOffset.m7740getYimpl(j), IntOffset.m7740getYimpl(j2), f) & 4294967295L));
    }

    /* renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m7752minusNvtHpc(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - IntOffset.m7739getXimpl(j2);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - IntOffset.m7740getYimpl(j2);
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m7753minusoCl6YwE(long j, long j2) {
        float m7739getXimpl = IntOffset.m7739getXimpl(j) - Float.intBitsToFloat((int) (j2 >> 32));
        float m7740getYimpl = IntOffset.m7740getYimpl(j) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(m7739getXimpl) << 32) | (Float.floatToRawIntBits(m7740getYimpl) & 4294967295L));
    }

    /* renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m7754plusNvtHpc(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + IntOffset.m7739getXimpl(j2);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + IntOffset.m7740getYimpl(j2);
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m7755plusoCl6YwE(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + IntOffset.m7739getXimpl(j);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + IntOffset.m7740getYimpl(j);
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    /* renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m7756roundk4lQ0M(long j) {
        return IntOffset.m7733constructorimpl((Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32));
    }

    /* renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m7757toOffsetgyyYBs(long j) {
        float m7739getXimpl = IntOffset.m7739getXimpl(j);
        float m7740getYimpl = IntOffset.m7740getYimpl(j);
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(m7740getYimpl) & 4294967295L) | (Float.floatToRawIntBits(m7739getXimpl) << 32));
    }
}
