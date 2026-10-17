package androidx.compose.ui.unit;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class IntSize {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m7777constructorimpl(0);
    private final long packedValue;

    private /* synthetic */ IntSize(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntSize m7774boximpl(long j) {
        return new IntSize(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m7775component1impl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m7776component2impl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: div-YEO4UFw, reason: not valid java name */
    public static final long m7778divYEO4UFw(long j, int i) {
        return m7777constructorimpl(((((int) (j >> 32)) / i) << 32) | ((((int) (j & 4294967295L)) / i) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7779equalsimpl(long j, Object obj) {
        return (obj instanceof IntSize) && j == ((IntSize) obj).m7786unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7780equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final int m7781getHeightimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final int m7782getWidthimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7783hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: times-YEO4UFw, reason: not valid java name */
    public static final long m7784timesYEO4UFw(long j, int i) {
        return m7777constructorimpl(((((int) (j >> 32)) * i) << 32) | ((((int) (j & 4294967295L)) * i) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7785toStringimpl(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public boolean equals(Object obj) {
        return m7779equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m7783hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m7785toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7786unboximpl() {
        return this.packedValue;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getZero-YbymL2g, reason: not valid java name */
        public final long m7787getZeroYbymL2g() {
            return IntSize.Zero;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7777constructorimpl(long j) {
        return j;
    }
}
