package androidx.compose.ui.unit;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IntOffset {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m7733constructorimpl(0);
    private static final long Max = m7733constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask);

    private /* synthetic */ IntOffset(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntOffset m7730boximpl(long j) {
        return new IntOffset(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m7731component1impl(long j) {
        return m7739getXimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m7732component2impl(long j) {
        return m7740getYimpl(j);
    }

    /* renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m7734copyiSbpLlY(long j, int i, int i2) {
        return m7733constructorimpl((i << 32) | (i2 & 4294967295L));
    }

    /* renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m7735copyiSbpLlY$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (4294967295L & j);
        }
        return m7734copyiSbpLlY(j, i, i2);
    }

    /* renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m7736divBjo55l4(long j, float f) {
        return m7733constructorimpl((Math.round(((int) (j >> 32)) / f) << 32) | (Math.round(((int) (j & 4294967295L)) / f) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7737equalsimpl(long j, Object obj) {
        return (obj instanceof IntOffset) && j == ((IntOffset) obj).m7748unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7738equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final int m7739getXimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final int m7740getYimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7741hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m7742minusqkQi6aY(long j, long j2) {
        return m7733constructorimpl(((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L));
    }

    /* renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m7743plusqkQi6aY(long j, long j2) {
        return m7733constructorimpl(((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L));
    }

    /* renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m7744remBjo55l4(long j, int i) {
        return m7733constructorimpl(((((int) (j >> 32)) % i) << 32) | ((((int) (j & 4294967295L)) % i) & 4294967295L));
    }

    /* renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m7745timesBjo55l4(long j, float f) {
        return m7733constructorimpl((Math.round(((int) (j >> 32)) * f) << 32) | (Math.round(((int) (j & 4294967295L)) * f) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7746toStringimpl(long j) {
        return "(" + m7739getXimpl(j) + ", " + m7740getYimpl(j) + ')';
    }

    /* renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m7747unaryMinusnOccac(long j) {
        return m7733constructorimpl(((-((int) (j & 4294967295L))) & 4294967295L) | ((-((int) (j >> 32))) << 32));
    }

    public boolean equals(Object obj) {
        return m7737equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m7741hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m7746toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7748unboximpl() {
        return this.packedValue;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getMax-nOcc-ac, reason: not valid java name */
        public final long m7749getMaxnOccac() {
            return IntOffset.Max;
        }

        /* renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m7750getZeronOccac() {
            return IntOffset.Zero;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getX$annotations() {
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7733constructorimpl(long j) {
        return j;
    }
}
