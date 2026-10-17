package androidx.compose.animation.core;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Motion {
    private final long packedValue;

    private /* synthetic */ Motion(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Motion m156boximpl(long j) {
        return new Motion(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m158equalsimpl(long j, Object obj) {
        return (obj instanceof Motion) && j == ((Motion) obj).m164unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m159equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m160getValueimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getVelocity-impl, reason: not valid java name */
    public static final float m161getVelocityimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m162hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m163toStringimpl(long j) {
        return "Motion(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m158equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m162hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m163toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m164unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m157constructorimpl(long j) {
        return j;
    }
}
