package androidx.compose.ui.text.style;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextMotion {
    public static final int $stable = 0;
    private static final TextMotion Animated;
    public static final Companion Companion;
    private static final TextMotion Static;
    private final int linearity;
    private final boolean subpixelTextPositioning;

    static {
        dq dqVar = null;
        Companion = new Companion(dqVar);
        Linearity.Companion companion = Linearity.Companion;
        Static = new TextMotion(companion.m7531getFontHinting4e0Vf04(), false, dqVar);
        Animated = new TextMotion(companion.m7532getLinear4e0Vf04(), true, dqVar);
    }

    private TextMotion(int i, boolean z) {
        this.linearity = i;
        this.subpixelTextPositioning = z;
    }

    /* renamed from: copy-JdDtMQo$ui_text$default, reason: not valid java name */
    public static /* synthetic */ TextMotion m7521copyJdDtMQo$ui_text$default(TextMotion textMotion, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = textMotion.linearity;
        }
        if ((i2 & 2) != 0) {
            z = textMotion.subpixelTextPositioning;
        }
        return textMotion.m7522copyJdDtMQo$ui_text(i, z);
    }

    /* renamed from: copy-JdDtMQo$ui_text, reason: not valid java name */
    public final TextMotion m7522copyJdDtMQo$ui_text(int i, boolean z) {
        return new TextMotion(i, z, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMotion)) {
            return false;
        }
        TextMotion textMotion = (TextMotion) obj;
        return Linearity.m7527equalsimpl0(this.linearity, textMotion.linearity) && this.subpixelTextPositioning == textMotion.subpixelTextPositioning;
    }

    /* renamed from: getLinearity-4e0Vf04$ui_text, reason: not valid java name */
    public final int m7523getLinearity4e0Vf04$ui_text() {
        return this.linearity;
    }

    public final boolean getSubpixelTextPositioning$ui_text() {
        return this.subpixelTextPositioning;
    }

    public int hashCode() {
        return Boolean.hashCode(this.subpixelTextPositioning) + (Linearity.m7528hashCodeimpl(this.linearity) * 31);
    }

    public String toString() {
        return equals(Static) ? "TextMotion.Static" : equals(Animated) ? "TextMotion.Animated" : "Invalid";
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Linearity {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Linear = m7525constructorimpl(1);
        private static final int FontHinting = m7525constructorimpl(2);
        private static final int None = m7525constructorimpl(3);

        private /* synthetic */ Linearity(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Linearity m7524boximpl(int i) {
            return new Linearity(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7526equalsimpl(int i, Object obj) {
            return (obj instanceof Linearity) && i == ((Linearity) obj).m7530unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7527equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7528hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7529toStringimpl(int i) {
            return m7527equalsimpl0(i, Linear) ? "Linearity.Linear" : m7527equalsimpl0(i, FontHinting) ? "Linearity.FontHinting" : m7527equalsimpl0(i, None) ? "Linearity.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m7526equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m7528hashCodeimpl(this.value);
        }

        public String toString() {
            return m7529toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m7530unboximpl() {
            return this.value;
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            /* renamed from: getFontHinting-4e0Vf04, reason: not valid java name */
            public final int m7531getFontHinting4e0Vf04() {
                return Linearity.FontHinting;
            }

            /* renamed from: getLinear-4e0Vf04, reason: not valid java name */
            public final int m7532getLinear4e0Vf04() {
                return Linearity.Linear;
            }

            /* renamed from: getNone-4e0Vf04, reason: not valid java name */
            public final int m7533getNone4e0Vf04() {
                return Linearity.None;
            }

            private Companion() {
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m7525constructorimpl(int i) {
            return i;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final TextMotion getAnimated() {
            return TextMotion.Animated;
        }

        public final TextMotion getStatic() {
            return TextMotion.Static;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextMotion(int i, boolean z, dq dqVar) {
        this(i, z);
    }
}
