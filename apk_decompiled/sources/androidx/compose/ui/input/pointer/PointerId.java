package androidx.compose.ui.input.pointer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerId {
    private final long value;

    private /* synthetic */ PointerId(long j) {
        this.value = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerId m6077boximpl(long j) {
        return new PointerId(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6079equalsimpl(long j, Object obj) {
        return (obj instanceof PointerId) && j == ((PointerId) obj).m6083unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6080equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6081hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6082toStringimpl(long j) {
        return "PointerId(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m6079equalsimpl(this.value, obj);
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m6081hashCodeimpl(this.value);
    }

    public String toString() {
        return m6082toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6083unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6078constructorimpl(long j) {
        return j;
    }
}
