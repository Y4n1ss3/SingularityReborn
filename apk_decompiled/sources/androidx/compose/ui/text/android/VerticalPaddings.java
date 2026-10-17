package androidx.compose.ui.text.android;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class VerticalPaddings {
    private final long packedValue;

    private /* synthetic */ VerticalPaddings(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VerticalPaddings m7107boximpl(long j) {
        return new VerticalPaddings(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7109equalsimpl(long j, Object obj) {
        return (obj instanceof VerticalPaddings) && j == ((VerticalPaddings) obj).m7115unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7110equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getBottomPadding-impl, reason: not valid java name */
    public static final int m7111getBottomPaddingimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getTopPadding-impl, reason: not valid java name */
    public static final int m7112getTopPaddingimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7113hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7114toStringimpl(long j) {
        return "VerticalPaddings(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m7109equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m7113hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m7114toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7115unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7108constructorimpl(long j) {
        return j;
    }
}
