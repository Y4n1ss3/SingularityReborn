package androidx.compose.ui.unit;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Velocity {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m7843constructorimpl(0);
    private final long packedValue;

    private /* synthetic */ Velocity(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Velocity m7840boximpl(long j) {
        return new Velocity(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m7841component1impl(long j) {
        return m7849getXimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m7842component2impl(long j) {
        return m7850getYimpl(j);
    }

    /* renamed from: copy-OhffZ5M, reason: not valid java name */
    public static final long m7844copyOhffZ5M(long j, float f, float f2) {
        return m7843constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: copy-OhffZ5M$default, reason: not valid java name */
    public static /* synthetic */ long m7845copyOhffZ5M$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return m7844copyOhffZ5M(j, f, f2);
    }

    /* renamed from: div-adjELrA, reason: not valid java name */
    public static final long m7846divadjELrA(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        return m7843constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7847equalsimpl(long j, Object obj) {
        return (obj instanceof Velocity) && j == ((Velocity) obj).m7858unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7848equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m7849getXimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m7850getYimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7851hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: minus-AH228Gc, reason: not valid java name */
    public static final long m7852minusAH228Gc(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return m7843constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: plus-AH228Gc, reason: not valid java name */
    public static final long m7853plusAH228Gc(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
        return m7843constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    /* renamed from: rem-adjELrA, reason: not valid java name */
    public static final long m7854remadjELrA(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) % f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) % f;
        return m7843constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: times-adjELrA, reason: not valid java name */
    public static final long m7855timesadjELrA(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return m7843constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7856toStringimpl(long j) {
        return "(" + m7849getXimpl(j) + ", " + m7850getYimpl(j) + ") px/sec";
    }

    /* renamed from: unaryMinus-9UxMQ8M, reason: not valid java name */
    public static final long m7857unaryMinus9UxMQ8M(long j) {
        return m7843constructorimpl(j ^ (-9223372034707292160L));
    }

    public boolean equals(Object obj) {
        return m7847equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m7851hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m7856toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7858unboximpl() {
        return this.packedValue;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getZero-9UxMQ8M, reason: not valid java name */
        public final long m7860getZero9UxMQ8M() {
            return Velocity.Zero;
        }

        private Companion() {
        }

        /* renamed from: getZero-9UxMQ8M$annotations, reason: not valid java name */
        public static /* synthetic */ void m7859getZero9UxMQ8M$annotations() {
        }
    }

    public static /* synthetic */ void getX$annotations() {
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7843constructorimpl(long j) {
        return j;
    }
}
