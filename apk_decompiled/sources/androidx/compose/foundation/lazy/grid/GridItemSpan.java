package androidx.compose.foundation.lazy.grid;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GridItemSpan {
    private final long packedValue;

    private /* synthetic */ GridItemSpan(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GridItemSpan m878boximpl(long j) {
        return new GridItemSpan(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m880equalsimpl(long j, Object obj) {
        return (obj instanceof GridItemSpan) && j == ((GridItemSpan) obj).m885unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m881equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getCurrentLineSpan-impl, reason: not valid java name */
    public static final int m882getCurrentLineSpanimpl(long j) {
        return (int) j;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m883hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m884toStringimpl(long j) {
        return "GridItemSpan(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m880equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m883hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m884toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m885unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m879constructorimpl(long j) {
        return j;
    }
}
