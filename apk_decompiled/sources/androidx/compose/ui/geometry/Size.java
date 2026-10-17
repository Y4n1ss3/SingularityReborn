package androidx.compose.ui.geometry;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Size {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m4576constructorimpl(0);
    private static final long Unspecified = m4576constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    private /* synthetic */ Size(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Size m4573boximpl(long j) {
        return new Size(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m4574component1impl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m4575component2impl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: copy-xjbvk4A, reason: not valid java name */
    public static final long m4577copyxjbvk4A(long j, float f, float f2) {
        return m4576constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static /* synthetic */ long m4578copyxjbvk4A$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return m4577copyxjbvk4A(j, f, f2);
    }

    /* renamed from: div-7Ah8Wj8, reason: not valid java name */
    public static final long m4579div7Ah8Wj8(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        return m4576constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4580equalsimpl(long j, Object obj) {
        return (obj instanceof Size) && j == ((Size) obj).m4590unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4581equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final float m4582getHeightimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m4583getMaxDimensionimpl(long j) {
        return Math.max(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    /* renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m4584getMinDimensionimpl(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final float m4585getWidthimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4586hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m4587isEmptyimpl(long j) {
        return (j == InlineClassHelperKt.UnspecifiedPackedFloats) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    /* renamed from: times-7Ah8Wj8, reason: not valid java name */
    public static final long m4588times7Ah8Wj8(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return m4576constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4589toStringimpl(long j) {
        if (j == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "Size.Unspecified";
        }
        return "Size(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j >> 32)), 1) + ", " + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j & 4294967295L)), 1) + ')';
    }

    public boolean equals(Object obj) {
        return m4580equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m4586hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m4589toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4590unboximpl() {
        return this.packedValue;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getUnspecified-NH-jbRc, reason: not valid java name */
        public final long m4593getUnspecifiedNHjbRc() {
            return Size.Unspecified;
        }

        /* renamed from: getZero-NH-jbRc, reason: not valid java name */
        public final long m4594getZeroNHjbRc() {
            return Size.Zero;
        }

        private Companion() {
        }

        /* renamed from: getUnspecified-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4591getUnspecifiedNHjbRc$annotations() {
        }

        /* renamed from: getZero-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4592getZeroNHjbRc$annotations() {
        }
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    public static /* synthetic */ void getMinDimension$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4576constructorimpl(long j) {
        return j;
    }
}
