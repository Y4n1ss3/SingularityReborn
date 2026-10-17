package androidx.compose.foundation.lazy.staggeredgrid;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SpanRange {
    private final long packedValue;

    private /* synthetic */ SpanRange(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SpanRange m984boximpl(long j) {
        return new SpanRange(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m985constructorimpl(int i, int i2) {
        return m986constructorimpl(((i2 + i) & 4294967295L) | (i << 32));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m987equalsimpl(long j, Object obj) {
        return (obj instanceof SpanRange) && j == ((SpanRange) obj).m994unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m988equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m989getEndimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m990getSizeimpl(long j) {
        return ((int) (4294967295L & j)) - ((int) (j >> 32));
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m991getStartimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m992hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m993toStringimpl(long j) {
        return "SpanRange(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m987equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m992hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m993toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m994unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m986constructorimpl(long j) {
        return j;
    }
}
