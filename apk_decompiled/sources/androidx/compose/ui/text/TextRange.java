package androidx.compose.ui.text;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextRange {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    private /* synthetic */ TextRange(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextRange m7048boximpl(long j) {
        return new TextRange(j);
    }

    /* renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m7050contains5zctL8(long j, long j2) {
        return (m7058getMinimpl(j) <= m7058getMinimpl(j2)) & (m7057getMaximpl(j2) <= m7057getMaximpl(j));
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m7051containsimpl(long j, int i) {
        return i < m7057getMaximpl(j) && m7058getMinimpl(j) <= i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7052equalsimpl(long j, Object obj) {
        return (obj instanceof TextRange) && j == ((TextRange) obj).m7064unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7053equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m7054getCollapsedimpl(long j) {
        return m7060getStartimpl(j) == m7055getEndimpl(j);
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m7055getEndimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getLength-impl, reason: not valid java name */
    public static final int m7056getLengthimpl(long j) {
        return m7057getMaximpl(j) - m7058getMinimpl(j);
    }

    /* renamed from: getMax-impl, reason: not valid java name */
    public static final int m7057getMaximpl(long j) {
        return Math.max(m7060getStartimpl(j), m7055getEndimpl(j));
    }

    /* renamed from: getMin-impl, reason: not valid java name */
    public static final int m7058getMinimpl(long j) {
        return Math.min(m7060getStartimpl(j), m7055getEndimpl(j));
    }

    /* renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m7059getReversedimpl(long j) {
        return m7060getStartimpl(j) > m7055getEndimpl(j);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m7060getStartimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7061hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m7062intersects5zctL8(long j, long j2) {
        return (m7058getMinimpl(j) < m7057getMaximpl(j2)) & (m7058getMinimpl(j2) < m7057getMaximpl(j));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7063toStringimpl(long j) {
        return "TextRange(" + m7060getStartimpl(j) + ", " + m7055getEndimpl(j) + ')';
    }

    public boolean equals(Object obj) {
        return m7052equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m7061hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m7063toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7064unboximpl() {
        return this.packedValue;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m7065getZerod9O1mEE() {
            return TextRange.Zero;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7049constructorimpl(long j) {
        return j;
    }
}
