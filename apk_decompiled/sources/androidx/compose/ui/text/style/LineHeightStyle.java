package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LineHeightStyle {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final LineHeightStyle Default;
    private final float alignment;
    private final int mode;
    private final int trim;

    static {
        dq dqVar = null;
        Companion = new Companion(dqVar);
        Default = new LineHeightStyle(Alignment.Companion.m7457getProportionalPIaL0Z0(), Trim.Companion.m7478getBothEVpEnUU(), Mode.Companion.m7466getFixedlzQqcRY(), dqVar);
    }

    private LineHeightStyle(float f, int i) {
        this(f, i, Mode.Companion.m7466getFixedlzQqcRY(), null);
    }

    /* renamed from: copy-38bxuX8$default, reason: not valid java name */
    public static /* synthetic */ LineHeightStyle m7443copy38bxuX8$default(LineHeightStyle lineHeightStyle, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f = lineHeightStyle.alignment;
        }
        if ((i3 & 2) != 0) {
            i = lineHeightStyle.trim;
        }
        if ((i3 & 4) != 0) {
            i2 = lineHeightStyle.mode;
        }
        return lineHeightStyle.m7444copy38bxuX8(f, i, i2);
    }

    /* renamed from: copy-38bxuX8, reason: not valid java name */
    public final LineHeightStyle m7444copy38bxuX8(float f, int i, int i2) {
        return new LineHeightStyle(f, i, i2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) obj;
        return Alignment.m7451equalsimpl0(this.alignment, lineHeightStyle.alignment) && Trim.m7472equalsimpl0(this.trim, lineHeightStyle.trim) && Mode.m7462equalsimpl0(this.mode, lineHeightStyle.mode);
    }

    /* renamed from: getAlignment-PIaL0Z0, reason: not valid java name */
    public final float m7445getAlignmentPIaL0Z0() {
        return this.alignment;
    }

    /* renamed from: getMode-lzQqcRY, reason: not valid java name */
    public final int m7446getModelzQqcRY() {
        return this.mode;
    }

    /* renamed from: getTrim-EVpEnUU, reason: not valid java name */
    public final int m7447getTrimEVpEnUU() {
        return this.trim;
    }

    public int hashCode() {
        return Mode.m7463hashCodeimpl(this.mode) + ((Trim.m7473hashCodeimpl(this.trim) + (Alignment.m7452hashCodeimpl(this.alignment) * 31)) * 31);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.m7453toStringimpl(this.alignment)) + ", trim=" + ((Object) Trim.m7476toStringimpl(this.trim)) + ",mode=" + ((Object) Mode.m7464toStringimpl(this.mode)) + ')';
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Alignment {
        private final float topRatio;
        public static final Companion Companion = new Companion(null);
        private static final float Top = m7449constructorimpl(0.0f);
        private static final float Center = m7449constructorimpl(0.5f);
        private static final float Proportional = m7449constructorimpl(-1.0f);
        private static final float Bottom = m7449constructorimpl(1.0f);

        private /* synthetic */ Alignment(float f) {
            this.topRatio = f;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Alignment m7448boximpl(float f) {
            return new Alignment(f);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static float m7449constructorimpl(float f) {
            if (!((0.0f <= f && f <= 1.0f) || f == -1.0f)) {
                InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
            }
            return f;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7450equalsimpl(float f, Object obj) {
            return (obj instanceof Alignment) && Float.compare(f, ((Alignment) obj).m7454unboximpl()) == 0;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7451equalsimpl0(float f, float f2) {
            return Float.compare(f, f2) == 0;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7452hashCodeimpl(float f) {
            return Float.hashCode(f);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7453toStringimpl(float f) {
            if (f == Top) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f == Center) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f == Proportional) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f == Bottom) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
        }

        public boolean equals(Object obj) {
            return m7450equalsimpl(this.topRatio, obj);
        }

        public int hashCode() {
            return m7452hashCodeimpl(this.topRatio);
        }

        public String toString() {
            return m7453toStringimpl(this.topRatio);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ float m7454unboximpl() {
            return this.topRatio;
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            /* renamed from: getBottom-PIaL0Z0, reason: not valid java name */
            public final float m7455getBottomPIaL0Z0() {
                return Alignment.Bottom;
            }

            /* renamed from: getCenter-PIaL0Z0, reason: not valid java name */
            public final float m7456getCenterPIaL0Z0() {
                return Alignment.Center;
            }

            /* renamed from: getProportional-PIaL0Z0, reason: not valid java name */
            public final float m7457getProportionalPIaL0Z0() {
                return Alignment.Proportional;
            }

            /* renamed from: getTop-PIaL0Z0, reason: not valid java name */
            public final float m7458getTopPIaL0Z0() {
                return Alignment.Top;
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Mode {
        public static final Companion Companion = new Companion(null);
        private static final int Fixed = m7460constructorimpl(0);
        private static final int Minimum = m7460constructorimpl(1);
        private static final int Tight = m7460constructorimpl(2);
        private final int value;

        private /* synthetic */ Mode(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Mode m7459boximpl(int i) {
            return new Mode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7461equalsimpl(int i, Object obj) {
            return (obj instanceof Mode) && i == ((Mode) obj).m7465unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7462equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7463hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7464toStringimpl(int i) {
            return m7462equalsimpl0(i, Fixed) ? "LineHeightStyle.Mode.Fixed" : m7462equalsimpl0(i, Minimum) ? "LineHeightStyle.Mode.Minimum" : m7462equalsimpl0(i, Tight) ? "LineHeightStyle.Mode.Tight" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m7461equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m7463hashCodeimpl(this.value);
        }

        public String toString() {
            return m7464toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m7465unboximpl() {
            return this.value;
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            /* renamed from: getFixed-lzQqcRY, reason: not valid java name */
            public final int m7466getFixedlzQqcRY() {
                return Mode.Fixed;
            }

            /* renamed from: getMinimum-lzQqcRY, reason: not valid java name */
            public final int m7467getMinimumlzQqcRY() {
                return Mode.Minimum;
            }

            /* renamed from: getTight-lzQqcRY, reason: not valid java name */
            public final int m7468getTightlzQqcRY() {
                return Mode.Tight;
            }

            private Companion() {
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m7460constructorimpl(int i) {
            return i;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Trim {
        private static final int FlagTrimBottom = 16;
        private static final int FlagTrimTop = 1;
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int FirstLineTop = m7470constructorimpl(1);
        private static final int LastLineBottom = m7470constructorimpl(16);
        private static final int Both = m7470constructorimpl(17);
        private static final int None = m7470constructorimpl(0);

        private /* synthetic */ Trim(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Trim m7469boximpl(int i) {
            return new Trim(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7471equalsimpl(int i, Object obj) {
            return (obj instanceof Trim) && i == ((Trim) obj).m7477unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7472equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7473hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: isTrimFirstLineTop-impl$ui_text, reason: not valid java name */
        public static final boolean m7474isTrimFirstLineTopimpl$ui_text(int i) {
            return (i & 1) > 0;
        }

        /* renamed from: isTrimLastLineBottom-impl$ui_text, reason: not valid java name */
        public static final boolean m7475isTrimLastLineBottomimpl$ui_text(int i) {
            return (i & 16) > 0;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7476toStringimpl(int i) {
            return i == FirstLineTop ? "LineHeightStyle.Trim.FirstLineTop" : i == LastLineBottom ? "LineHeightStyle.Trim.LastLineBottom" : i == Both ? "LineHeightStyle.Trim.Both" : i == None ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m7471equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m7473hashCodeimpl(this.value);
        }

        public String toString() {
            return m7476toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m7477unboximpl() {
            return this.value;
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            /* renamed from: getBoth-EVpEnUU, reason: not valid java name */
            public final int m7478getBothEVpEnUU() {
                return Trim.Both;
            }

            /* renamed from: getFirstLineTop-EVpEnUU, reason: not valid java name */
            public final int m7479getFirstLineTopEVpEnUU() {
                return Trim.FirstLineTop;
            }

            /* renamed from: getLastLineBottom-EVpEnUU, reason: not valid java name */
            public final int m7480getLastLineBottomEVpEnUU() {
                return Trim.LastLineBottom;
            }

            /* renamed from: getNone-EVpEnUU, reason: not valid java name */
            public final int m7481getNoneEVpEnUU() {
                return Trim.None;
            }

            private Companion() {
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m7470constructorimpl(int i) {
            return i;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final LineHeightStyle getDefault() {
            return LineHeightStyle.Default;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LineHeightStyle(float f, int i, dq dqVar) {
        this(f, i);
    }

    private LineHeightStyle(float f, int i, int i2) {
        this.alignment = f;
        this.trim = i;
        this.mode = i2;
    }

    public /* synthetic */ LineHeightStyle(float f, int i, int i2, dq dqVar) {
        this(f, i, i2);
    }
}
