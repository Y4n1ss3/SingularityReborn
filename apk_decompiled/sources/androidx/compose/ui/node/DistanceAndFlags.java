package androidx.compose.ui.node;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DistanceAndFlags {
    private final long packedValue;

    private /* synthetic */ DistanceAndFlags(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DistanceAndFlags m6431boximpl(long j) {
        return new DistanceAndFlags(j);
    }

    /* renamed from: compareTo-9YPOF3E, reason: not valid java name */
    public static final int m6432compareTo9YPOF3E(long j, long j2) {
        boolean m6439isInLayerimpl = m6439isInLayerimpl(j);
        if (m6439isInLayerimpl != m6439isInLayerimpl(j2)) {
            return m6439isInLayerimpl ? -1 : 1;
        }
        return (Math.min(m6436getDistanceimpl(j), m6436getDistanceimpl(j2)) >= 0.0f && m6438isInExpandedBoundsimpl(j) != m6438isInExpandedBoundsimpl(j2)) ? m6438isInExpandedBoundsimpl(j) ? -1 : 1 : (int) Math.signum(m6436getDistanceimpl(j) - m6436getDistanceimpl(j2));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6434equalsimpl(long j, Object obj) {
        return (obj instanceof DistanceAndFlags) && j == ((DistanceAndFlags) obj).m6441unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6435equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m6436getDistanceimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6437hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isInExpandedBounds-impl, reason: not valid java name */
    public static final boolean m6438isInExpandedBoundsimpl(long j) {
        return (j & 2) != 0;
    }

    /* renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m6439isInLayerimpl(long j) {
        return (j & 1) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6440toStringimpl(long j) {
        return "DistanceAndFlags(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m6434equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m6437hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m6440toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6441unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6433constructorimpl(long j) {
        return j;
    }
}
