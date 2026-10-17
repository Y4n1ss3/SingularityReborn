package androidx.compose.foundation.layout;

import defpackage.c21;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WindowInsetsSides {
    private static final int AllowLeftInLtr;
    private static final int AllowLeftInRtl;
    private static final int AllowRightInLtr;
    private static final int AllowRightInRtl;
    private static final int Bottom;
    public static final Companion Companion = new Companion(null);
    private static final int End;
    private static final int Horizontal;
    private static final int Left;
    private static final int Right;
    private static final int Start;
    private static final int Top;
    private static final int Vertical;
    private final int value;

    static {
        int m840constructorimpl = m840constructorimpl(8);
        AllowLeftInLtr = m840constructorimpl;
        int m840constructorimpl2 = m840constructorimpl(4);
        AllowRightInLtr = m840constructorimpl2;
        int m840constructorimpl3 = m840constructorimpl(2);
        AllowLeftInRtl = m840constructorimpl3;
        int m840constructorimpl4 = m840constructorimpl(1);
        AllowRightInRtl = m840constructorimpl4;
        Start = m845plusgK_yJZ4(m840constructorimpl, m840constructorimpl4);
        End = m845plusgK_yJZ4(m840constructorimpl2, m840constructorimpl3);
        int m840constructorimpl5 = m840constructorimpl(16);
        Top = m840constructorimpl5;
        int m840constructorimpl6 = m840constructorimpl(32);
        Bottom = m840constructorimpl6;
        int m845plusgK_yJZ4 = m845plusgK_yJZ4(m840constructorimpl, m840constructorimpl3);
        Left = m845plusgK_yJZ4;
        int m845plusgK_yJZ42 = m845plusgK_yJZ4(m840constructorimpl2, m840constructorimpl4);
        Right = m845plusgK_yJZ42;
        Horizontal = m845plusgK_yJZ4(m845plusgK_yJZ4, m845plusgK_yJZ42);
        Vertical = m845plusgK_yJZ4(m840constructorimpl5, m840constructorimpl6);
    }

    private /* synthetic */ WindowInsetsSides(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ WindowInsetsSides m839boximpl(int i) {
        return new WindowInsetsSides(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m841equalsimpl(int i, Object obj) {
        return (obj instanceof WindowInsetsSides) && i == ((WindowInsetsSides) obj).m848unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m842equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hasAny-bkgdKaI$foundation_layout, reason: not valid java name */
    public static final boolean m843hasAnybkgdKaI$foundation_layout(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m844hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: plus-gK_yJZ4, reason: not valid java name */
    public static final int m845plusgK_yJZ4(int i, int i2) {
        return m840constructorimpl(i | i2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m846toStringimpl(int i) {
        return c21.a(new StringBuilder("WindowInsetsSides("), m847valueToStringimpl(i), ')');
    }

    /* renamed from: valueToString-impl, reason: not valid java name */
    private static final String m847valueToStringimpl(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = Start;
        if ((i & i2) == i2) {
            valueToString_impl$lambda$0$appendPlus(sb, "Start");
        }
        int i3 = Left;
        if ((i & i3) == i3) {
            valueToString_impl$lambda$0$appendPlus(sb, "Left");
        }
        int i4 = Top;
        if ((i & i4) == i4) {
            valueToString_impl$lambda$0$appendPlus(sb, "Top");
        }
        int i5 = End;
        if ((i & i5) == i5) {
            valueToString_impl$lambda$0$appendPlus(sb, "End");
        }
        int i6 = Right;
        if ((i & i6) == i6) {
            valueToString_impl$lambda$0$appendPlus(sb, "Right");
        }
        int i7 = Bottom;
        if ((i & i7) == i7) {
            valueToString_impl$lambda$0$appendPlus(sb, "Bottom");
        }
        return sb.toString();
    }

    private static final void valueToString_impl$lambda$0$appendPlus(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public boolean equals(Object obj) {
        return m841equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m844hashCodeimpl(this.value);
    }

    public String toString() {
        return m846toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m848unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getAllowLeftInLtr-JoeWqyM$foundation_layout, reason: not valid java name */
        public final int m849getAllowLeftInLtrJoeWqyM$foundation_layout() {
            return WindowInsetsSides.AllowLeftInLtr;
        }

        /* renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout, reason: not valid java name */
        public final int m850getAllowLeftInRtlJoeWqyM$foundation_layout() {
            return WindowInsetsSides.AllowLeftInRtl;
        }

        /* renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout, reason: not valid java name */
        public final int m851getAllowRightInLtrJoeWqyM$foundation_layout() {
            return WindowInsetsSides.AllowRightInLtr;
        }

        /* renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout, reason: not valid java name */
        public final int m852getAllowRightInRtlJoeWqyM$foundation_layout() {
            return WindowInsetsSides.AllowRightInRtl;
        }

        /* renamed from: getBottom-JoeWqyM, reason: not valid java name */
        public final int m853getBottomJoeWqyM() {
            return WindowInsetsSides.Bottom;
        }

        /* renamed from: getEnd-JoeWqyM, reason: not valid java name */
        public final int m854getEndJoeWqyM() {
            return WindowInsetsSides.End;
        }

        /* renamed from: getHorizontal-JoeWqyM, reason: not valid java name */
        public final int m855getHorizontalJoeWqyM() {
            return WindowInsetsSides.Horizontal;
        }

        /* renamed from: getLeft-JoeWqyM, reason: not valid java name */
        public final int m856getLeftJoeWqyM() {
            return WindowInsetsSides.Left;
        }

        /* renamed from: getRight-JoeWqyM, reason: not valid java name */
        public final int m857getRightJoeWqyM() {
            return WindowInsetsSides.Right;
        }

        /* renamed from: getStart-JoeWqyM, reason: not valid java name */
        public final int m858getStartJoeWqyM() {
            return WindowInsetsSides.Start;
        }

        /* renamed from: getTop-JoeWqyM, reason: not valid java name */
        public final int m859getTopJoeWqyM() {
            return WindowInsetsSides.Top;
        }

        /* renamed from: getVertical-JoeWqyM, reason: not valid java name */
        public final int m860getVerticalJoeWqyM() {
            return WindowInsetsSides.Vertical;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m840constructorimpl(int i) {
        return i;
    }
}
