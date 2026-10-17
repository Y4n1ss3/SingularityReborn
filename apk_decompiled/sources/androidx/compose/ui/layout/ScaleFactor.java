package androidx.compose.ui.layout;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ScaleFactor {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m6347constructorimpl((Float.floatToRawIntBits(Float.NaN) << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L));
    private final long packedValue;

    private /* synthetic */ ScaleFactor(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ScaleFactor m6344boximpl(long j) {
        return new ScaleFactor(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m6345component1impl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m6346component2impl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: copy-8GGzs04, reason: not valid java name */
    public static final long m6348copy8GGzs04(long j, float f, float f2) {
        return m6347constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: copy-8GGzs04$default, reason: not valid java name */
    public static /* synthetic */ long m6349copy8GGzs04$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return m6348copy8GGzs04(j, f, f2);
    }

    /* renamed from: div-44nBxM0, reason: not valid java name */
    public static final long m6350div44nBxM0(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        return m6347constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6351equalsimpl(long j, Object obj) {
        return (obj instanceof ScaleFactor) && j == ((ScaleFactor) obj).m6358unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6352equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getScaleX-impl, reason: not valid java name */
    public static final float m6353getScaleXimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getScaleY-impl, reason: not valid java name */
    public static final float m6354getScaleYimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6355hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: times-44nBxM0, reason: not valid java name */
    public static final long m6356times44nBxM0(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return m6347constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6357toStringimpl(long j) {
        return "ScaleFactor(" + Float.intBitsToFloat((int) (j >> 32)) + ", " + Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }

    public boolean equals(Object obj) {
        return m6351equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m6355hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m6357toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6358unboximpl() {
        return this.packedValue;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getUnspecified-_hLwfpc, reason: not valid java name */
        public final long m6360getUnspecified_hLwfpc() {
            return ScaleFactor.Unspecified;
        }

        private Companion() {
        }

        /* renamed from: getUnspecified-_hLwfpc$annotations, reason: not valid java name */
        public static /* synthetic */ void m6359getUnspecified_hLwfpc$annotations() {
        }
    }

    public static /* synthetic */ void getScaleX$annotations() {
    }

    public static /* synthetic */ void getScaleY$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6347constructorimpl(long j) {
        return j;
    }
}
