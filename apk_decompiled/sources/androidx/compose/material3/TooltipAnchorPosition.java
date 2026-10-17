package androidx.compose.material3;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TooltipAnchorPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Above = m2767constructorimpl(1);
    private static final int Below = m2767constructorimpl(2);
    private static final int Left = m2767constructorimpl(3);
    private static final int Right = m2767constructorimpl(4);
    private static final int Start = m2767constructorimpl(5);
    private static final int End = m2767constructorimpl(6);

    private /* synthetic */ TooltipAnchorPosition(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TooltipAnchorPosition m2766boximpl(int i) {
        return new TooltipAnchorPosition(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2768equalsimpl(int i, Object obj) {
        return (obj instanceof TooltipAnchorPosition) && i == ((TooltipAnchorPosition) obj).m2772unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2769equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2770hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2771toStringimpl(int i) {
        return m2769equalsimpl0(i, Above) ? "Above" : m2769equalsimpl0(i, Below) ? "Below" : m2769equalsimpl0(i, Left) ? "Left" : m2769equalsimpl0(i, Right) ? "Right" : m2769equalsimpl0(i, Start) ? "Start" : m2769equalsimpl0(i, End) ? "End" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m2768equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2770hashCodeimpl(this.value);
    }

    public String toString() {
        return m2771toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2772unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getAbove-lOKsHw4, reason: not valid java name */
        public final int m2773getAbovelOKsHw4() {
            return TooltipAnchorPosition.Above;
        }

        /* renamed from: getBelow-lOKsHw4, reason: not valid java name */
        public final int m2774getBelowlOKsHw4() {
            return TooltipAnchorPosition.Below;
        }

        /* renamed from: getEnd-lOKsHw4, reason: not valid java name */
        public final int m2775getEndlOKsHw4() {
            return TooltipAnchorPosition.End;
        }

        /* renamed from: getLeft-lOKsHw4, reason: not valid java name */
        public final int m2776getLeftlOKsHw4() {
            return TooltipAnchorPosition.Left;
        }

        /* renamed from: getRight-lOKsHw4, reason: not valid java name */
        public final int m2777getRightlOKsHw4() {
            return TooltipAnchorPosition.Right;
        }

        /* renamed from: getStart-lOKsHw4, reason: not valid java name */
        public final int m2778getStartlOKsHw4() {
            return TooltipAnchorPosition.Start;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m2767constructorimpl(int i) {
        return i;
    }
}
