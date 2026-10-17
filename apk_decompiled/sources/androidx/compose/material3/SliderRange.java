package androidx.compose.material3;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SliderRange {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = SliderKt.SliderRange(Float.NaN, Float.NaN);
    private final long packedValue;

    private /* synthetic */ SliderRange(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SliderRange m2435boximpl(long j) {
        return new SliderRange(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2437equalsimpl(long j, Object obj) {
        return (obj instanceof SliderRange) && j == ((SliderRange) obj).m2443unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2438equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getEndInclusive-impl, reason: not valid java name */
    public static final float m2439getEndInclusiveimpl(long j) {
        if (j != Unspecified) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        defpackage.o.f("SliderRange is unspecified");
        return 0.0f;
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final float m2440getStartimpl(long j) {
        if (j != Unspecified) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        defpackage.o.f("SliderRange is unspecified");
        return 0.0f;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2441hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2442toStringimpl(long j) {
        if (!SliderKt.m2430isSpecifiedIf1S1O4(j)) {
            return "FloatRange.Unspecified";
        }
        return m2440getStartimpl(j) + ".." + m2439getEndInclusiveimpl(j);
    }

    public boolean equals(Object obj) {
        return m2437equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m2441hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m2442toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2443unboximpl() {
        return this.packedValue;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getUnspecified-FYbKRX4, reason: not valid java name */
        public final long m2445getUnspecifiedFYbKRX4() {
            return SliderRange.Unspecified;
        }

        private Companion() {
        }

        /* renamed from: getUnspecified-FYbKRX4$annotations, reason: not valid java name */
        public static /* synthetic */ void m2444getUnspecifiedFYbKRX4$annotations() {
        }
    }

    public static /* synthetic */ void getEndInclusive$annotations() {
    }

    public static /* synthetic */ void getStart$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2436constructorimpl(long j) {
        return j;
    }
}
