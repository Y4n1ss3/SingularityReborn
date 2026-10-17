package androidx.compose.ui.geometry;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CornerRadius {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m4470constructorimpl(0);
    private final long packedValue;

    private /* synthetic */ CornerRadius(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CornerRadius m4467boximpl(long j) {
        return new CornerRadius(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m4468component1impl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m4469component2impl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: copy-OHQCggk, reason: not valid java name */
    public static final long m4471copyOHQCggk(long j, float f, float f2) {
        return m4470constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: copy-OHQCggk$default, reason: not valid java name */
    public static /* synthetic */ long m4472copyOHQCggk$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return m4471copyOHQCggk(j, f, f2);
    }

    /* renamed from: div-Bz7bX_o, reason: not valid java name */
    public static final long m4473divBz7bX_o(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        return m4470constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4474equalsimpl(long j, Object obj) {
        return (obj instanceof CornerRadius) && j == ((CornerRadius) obj).m4486unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4475equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m4476getXimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m4477getYimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4478hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isCircular-impl, reason: not valid java name */
    public static final boolean m4479isCircularimpl(long j) {
        return (j >>> 32) == (j & 4294967295L);
    }

    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m4480isZeroimpl(long j) {
        long j2 = j & InlineClassHelperKt.DualUnsignedFloatMask;
        return (((~j2) & (j2 - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) != 0;
    }

    /* renamed from: minus-vF7b-mM, reason: not valid java name */
    public static final long m4481minusvF7bmM(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return m4470constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: plus-vF7b-mM, reason: not valid java name */
    public static final long m4482plusvF7bmM(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
        return m4470constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    /* renamed from: times-Bz7bX_o, reason: not valid java name */
    public static final long m4483timesBz7bX_o(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return m4470constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4484toStringimpl(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i), 1) + ')';
        }
        return "CornerRadius.elliptical(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i), 1) + ", " + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i2), 1) + ')';
    }

    /* renamed from: unaryMinus-kKHJgLs, reason: not valid java name */
    public static final long m4485unaryMinuskKHJgLs(long j) {
        return m4470constructorimpl(j ^ (-9223372034707292160L));
    }

    public boolean equals(Object obj) {
        return m4474equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m4478hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m4484toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4486unboximpl() {
        return this.packedValue;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getZero-kKHJgLs, reason: not valid java name */
        public final long m4488getZerokKHJgLs() {
            return CornerRadius.Zero;
        }

        private Companion() {
        }

        /* renamed from: getZero-kKHJgLs$annotations, reason: not valid java name */
        public static /* synthetic */ void m4487getZerokKHJgLs$annotations() {
        }
    }

    public static /* synthetic */ void getX$annotations() {
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4470constructorimpl(long j) {
        return j;
    }
}
