package androidx.compose.ui.text;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PlaceholderVerticalAlign {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int AboveBaseline = m6975constructorimpl(1);
    private static final int Top = m6975constructorimpl(2);
    private static final int Bottom = m6975constructorimpl(3);
    private static final int Center = m6975constructorimpl(4);
    private static final int TextTop = m6975constructorimpl(5);
    private static final int TextBottom = m6975constructorimpl(6);
    private static final int TextCenter = m6975constructorimpl(7);

    private /* synthetic */ PlaceholderVerticalAlign(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PlaceholderVerticalAlign m6974boximpl(int i) {
        return new PlaceholderVerticalAlign(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6976equalsimpl(int i, Object obj) {
        return (obj instanceof PlaceholderVerticalAlign) && i == ((PlaceholderVerticalAlign) obj).m6980unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6977equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6978hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6979toStringimpl(int i) {
        return m6977equalsimpl0(i, AboveBaseline) ? "AboveBaseline" : m6977equalsimpl0(i, Top) ? "Top" : m6977equalsimpl0(i, Bottom) ? "Bottom" : m6977equalsimpl0(i, Center) ? "Center" : m6977equalsimpl0(i, TextTop) ? "TextTop" : m6977equalsimpl0(i, TextBottom) ? "TextBottom" : m6977equalsimpl0(i, TextCenter) ? "TextCenter" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m6976equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6978hashCodeimpl(this.value);
    }

    public String toString() {
        return m6979toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6980unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getAboveBaseline-J6kI3mc, reason: not valid java name */
        public final int m6981getAboveBaselineJ6kI3mc() {
            return PlaceholderVerticalAlign.AboveBaseline;
        }

        /* renamed from: getBottom-J6kI3mc, reason: not valid java name */
        public final int m6982getBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.Bottom;
        }

        /* renamed from: getCenter-J6kI3mc, reason: not valid java name */
        public final int m6983getCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.Center;
        }

        /* renamed from: getTextBottom-J6kI3mc, reason: not valid java name */
        public final int m6984getTextBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.TextBottom;
        }

        /* renamed from: getTextCenter-J6kI3mc, reason: not valid java name */
        public final int m6985getTextCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.TextCenter;
        }

        /* renamed from: getTextTop-J6kI3mc, reason: not valid java name */
        public final int m6986getTextTopJ6kI3mc() {
            return PlaceholderVerticalAlign.TextTop;
        }

        /* renamed from: getTop-J6kI3mc, reason: not valid java name */
        public final int m6987getTopJ6kI3mc() {
            return PlaceholderVerticalAlign.Top;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6975constructorimpl(int i) {
        return i;
    }
}
