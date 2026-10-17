package androidx.compose.ui.input.pointer;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m6039constructorimpl(0);
    private static final int Press = m6039constructorimpl(1);
    private static final int Release = m6039constructorimpl(2);
    private static final int Move = m6039constructorimpl(3);
    private static final int Enter = m6039constructorimpl(4);
    private static final int Exit = m6039constructorimpl(5);
    private static final int Scroll = m6039constructorimpl(6);
    private static final int ScaleStart = m6039constructorimpl(7);
    private static final int ScaleChange = m6039constructorimpl(8);
    private static final int ScaleEnd = m6039constructorimpl(9);
    private static final int PanStart = m6039constructorimpl(10);
    private static final int PanMove = m6039constructorimpl(11);
    private static final int PanEnd = m6039constructorimpl(12);

    private /* synthetic */ PointerEventType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerEventType m6038boximpl(int i) {
        return new PointerEventType(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6040equalsimpl(int i, Object obj) {
        return (obj instanceof PointerEventType) && i == ((PointerEventType) obj).m6044unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6041equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6042hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6043toStringimpl(int i) {
        return m6041equalsimpl0(i, Press) ? "Press" : m6041equalsimpl0(i, Release) ? "Release" : m6041equalsimpl0(i, Move) ? "Move" : m6041equalsimpl0(i, Enter) ? "Enter" : m6041equalsimpl0(i, Exit) ? "Exit" : m6041equalsimpl0(i, Scroll) ? "Scroll" : m6041equalsimpl0(i, ScaleStart) ? "ScaleStart" : m6041equalsimpl0(i, ScaleChange) ? "ScaleChange" : m6041equalsimpl0(i, ScaleEnd) ? "ScaleFinish" : m6041equalsimpl0(i, PanStart) ? "PanStart" : m6041equalsimpl0(i, PanMove) ? "Pan" : m6041equalsimpl0(i, PanEnd) ? "PanEnd" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m6040equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6042hashCodeimpl(this.value);
    }

    public String toString() {
        return m6043toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6044unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getEnter-7fucELk, reason: not valid java name */
        public final int m6045getEnter7fucELk() {
            return PointerEventType.Enter;
        }

        /* renamed from: getExit-7fucELk, reason: not valid java name */
        public final int m6046getExit7fucELk() {
            return PointerEventType.Exit;
        }

        /* renamed from: getMove-7fucELk, reason: not valid java name */
        public final int m6047getMove7fucELk() {
            return PointerEventType.Move;
        }

        /* renamed from: getPanEnd-7fucELk, reason: not valid java name */
        public final int m6048getPanEnd7fucELk() {
            return PointerEventType.PanEnd;
        }

        /* renamed from: getPanMove-7fucELk, reason: not valid java name */
        public final int m6049getPanMove7fucELk() {
            return PointerEventType.PanMove;
        }

        /* renamed from: getPanStart-7fucELk, reason: not valid java name */
        public final int m6050getPanStart7fucELk() {
            return PointerEventType.PanStart;
        }

        /* renamed from: getPress-7fucELk, reason: not valid java name */
        public final int m6051getPress7fucELk() {
            return PointerEventType.Press;
        }

        /* renamed from: getRelease-7fucELk, reason: not valid java name */
        public final int m6052getRelease7fucELk() {
            return PointerEventType.Release;
        }

        /* renamed from: getScaleChange-7fucELk, reason: not valid java name */
        public final int m6053getScaleChange7fucELk() {
            return PointerEventType.ScaleChange;
        }

        /* renamed from: getScaleEnd-7fucELk, reason: not valid java name */
        public final int m6054getScaleEnd7fucELk() {
            return PointerEventType.ScaleEnd;
        }

        /* renamed from: getScaleStart-7fucELk, reason: not valid java name */
        public final int m6055getScaleStart7fucELk() {
            return PointerEventType.ScaleStart;
        }

        /* renamed from: getScroll-7fucELk, reason: not valid java name */
        public final int m6056getScroll7fucELk() {
            return PointerEventType.Scroll;
        }

        /* renamed from: getUnknown-7fucELk, reason: not valid java name */
        public final int m6057getUnknown7fucELk() {
            return PointerEventType.Unknown;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m6039constructorimpl(int i) {
        return i;
    }
}
