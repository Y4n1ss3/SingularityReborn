package androidx.compose.material3;

import defpackage.dq;
import defpackage.q10;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ListItemType implements Comparable<ListItemType> {
    private final int lines;
    public static final Companion Companion = new Companion(null);
    private static final int OneLine = m2118constructorimpl(1);
    private static final int TwoLine = m2118constructorimpl(2);
    private static final int ThreeLine = m2118constructorimpl(3);

    private /* synthetic */ ListItemType(int i) {
        this.lines = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ListItemType m2116boximpl(int i) {
        return new ListItemType(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2119equalsimpl(int i, Object obj) {
        return (obj instanceof ListItemType) && i == ((ListItemType) obj).m2124unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2120equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2121hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2122toStringimpl(int i) {
        return r6.b("ListItemType(lines=", i, ')');
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ListItemType listItemType) {
        return m2123compareToyh95HIg(listItemType.m2124unboximpl());
    }

    /* renamed from: compareTo-yh95HIg, reason: not valid java name */
    public int m2123compareToyh95HIg(int i) {
        return m2117compareToyh95HIg(this.lines, i);
    }

    public boolean equals(Object obj) {
        return m2119equalsimpl(this.lines, obj);
    }

    public int hashCode() {
        return m2121hashCodeimpl(this.lines);
    }

    public String toString() {
        return m2122toStringimpl(this.lines);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2124unboximpl() {
        return this.lines;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getOneLine-AlXitO8, reason: not valid java name */
        public final int m2125getOneLineAlXitO8() {
            return ListItemType.OneLine;
        }

        /* renamed from: getThreeLine-AlXitO8, reason: not valid java name */
        public final int m2126getThreeLineAlXitO8() {
            return ListItemType.ThreeLine;
        }

        /* renamed from: getTwoLine-AlXitO8, reason: not valid java name */
        public final int m2127getTwoLineAlXitO8() {
            return ListItemType.TwoLine;
        }

        /* renamed from: invoke-Z-LSjz4$material3, reason: not valid java name */
        public final int m2128invokeZLSjz4$material3(boolean z, boolean z2, boolean z3) {
            return ((z && z2) || z3) ? m2126getThreeLineAlXitO8() : (z || z2) ? m2127getTwoLineAlXitO8() : m2125getOneLineAlXitO8();
        }

        private Companion() {
        }
    }

    /* renamed from: compareTo-yh95HIg, reason: not valid java name */
    public static int m2117compareToyh95HIg(int i, int i2) {
        return q10.h(i, i2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m2118constructorimpl(int i) {
        return i;
    }
}
