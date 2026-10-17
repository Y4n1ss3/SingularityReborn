package androidx.compose.ui.text.style;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LineBreak {
    public static final Companion Companion = new Companion(null);
    private static final int Heading;
    private static final int Paragraph;
    private static final int Simple;
    private static final int Unspecified;
    private final int mask;

    static {
        int packBytes;
        int packBytes2;
        int packBytes3;
        Strategy.Companion companion = Strategy.Companion;
        int m7417getSimplefcGXIks = companion.m7417getSimplefcGXIks();
        Strictness.Companion companion2 = Strictness.Companion;
        int m7428getNormalusljTpc = companion2.m7428getNormalusljTpc();
        WordBreak.Companion companion3 = WordBreak.Companion;
        packBytes = LineBreak_androidKt.packBytes(m7417getSimplefcGXIks, m7428getNormalusljTpc, companion3.m7438getDefaultjp8hJ3c());
        Simple = m7388constructorimpl(packBytes);
        packBytes2 = LineBreak_androidKt.packBytes(companion.m7415getBalancedfcGXIks(), companion2.m7427getLooseusljTpc(), companion3.m7439getPhrasejp8hJ3c());
        Heading = m7388constructorimpl(packBytes2);
        packBytes3 = LineBreak_androidKt.packBytes(companion.m7416getHighQualityfcGXIks(), companion2.m7429getStrictusljTpc(), companion3.m7438getDefaultjp8hJ3c());
        Paragraph = m7388constructorimpl(packBytes3);
        Unspecified = m7388constructorimpl(0);
    }

    private /* synthetic */ LineBreak(int i) {
        this.mask = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineBreak m7387boximpl(int i) {
        return new LineBreak(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7389constructorimpl(int i, int i2, int i3) {
        int packBytes;
        packBytes = LineBreak_androidKt.packBytes(i, i2, i3);
        return m7388constructorimpl(packBytes);
    }

    /* renamed from: copy-gijOMQM, reason: not valid java name */
    public static final int m7390copygijOMQM(int i, int i2, int i3, int i4) {
        return m7389constructorimpl(i2, i3, i4);
    }

    /* renamed from: copy-gijOMQM$default, reason: not valid java name */
    public static /* synthetic */ int m7391copygijOMQM$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = m7394getStrategyfcGXIks(i);
        }
        if ((i5 & 2) != 0) {
            i3 = m7395getStrictnessusljTpc(i);
        }
        if ((i5 & 4) != 0) {
            i4 = m7396getWordBreakjp8hJ3c(i);
        }
        return m7390copygijOMQM(i, i2, i3, i4);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7392equalsimpl(int i, Object obj) {
        return (obj instanceof LineBreak) && i == ((LineBreak) obj).m7399unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7393equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: getStrategy-fcGXIks, reason: not valid java name */
    public static final int m7394getStrategyfcGXIks(int i) {
        int unpackByte1;
        unpackByte1 = LineBreak_androidKt.unpackByte1(i);
        return Strategy.m7409constructorimpl(unpackByte1);
    }

    /* renamed from: getStrictness-usljTpc, reason: not valid java name */
    public static final int m7395getStrictnessusljTpc(int i) {
        int unpackByte2;
        unpackByte2 = LineBreak_androidKt.unpackByte2(i);
        return Strictness.m7420constructorimpl(unpackByte2);
    }

    /* renamed from: getWordBreak-jp8hJ3c, reason: not valid java name */
    public static final int m7396getWordBreakjp8hJ3c(int i) {
        int unpackByte3;
        unpackByte3 = LineBreak_androidKt.unpackByte3(i);
        return WordBreak.m7432constructorimpl(unpackByte3);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7397hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7398toStringimpl(int i) {
        return "LineBreak(strategy=" + ((Object) Strategy.m7413toStringimpl(m7394getStrategyfcGXIks(i))) + ", strictness=" + ((Object) Strictness.m7424toStringimpl(m7395getStrictnessusljTpc(i))) + ", wordBreak=" + ((Object) WordBreak.m7436toStringimpl(m7396getWordBreakjp8hJ3c(i))) + ')';
    }

    public boolean equals(Object obj) {
        return m7392equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m7397hashCodeimpl(this.mask);
    }

    public String toString() {
        return m7398toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7399unboximpl() {
        return this.mask;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Strategy {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Simple = m7409constructorimpl(1);
        private static final int HighQuality = m7409constructorimpl(2);
        private static final int Balanced = m7409constructorimpl(3);
        private static final int Unspecified = m7409constructorimpl(0);

        private /* synthetic */ Strategy(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strategy m7408boximpl(int i) {
            return new Strategy(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7410equalsimpl(int i, Object obj) {
            return (obj instanceof Strategy) && i == ((Strategy) obj).m7414unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7411equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7412hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7413toStringimpl(int i) {
            return m7411equalsimpl0(i, Simple) ? "Strategy.Simple" : m7411equalsimpl0(i, HighQuality) ? "Strategy.HighQuality" : m7411equalsimpl0(i, Balanced) ? "Strategy.Balanced" : m7411equalsimpl0(i, Unspecified) ? "Strategy.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m7410equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m7412hashCodeimpl(this.value);
        }

        public String toString() {
            return m7413toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m7414unboximpl() {
            return this.value;
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            /* renamed from: getBalanced-fcGXIks, reason: not valid java name */
            public final int m7415getBalancedfcGXIks() {
                return Strategy.Balanced;
            }

            /* renamed from: getHighQuality-fcGXIks, reason: not valid java name */
            public final int m7416getHighQualityfcGXIks() {
                return Strategy.HighQuality;
            }

            /* renamed from: getSimple-fcGXIks, reason: not valid java name */
            public final int m7417getSimplefcGXIks() {
                return Strategy.Simple;
            }

            /* renamed from: getUnspecified-fcGXIks, reason: not valid java name */
            public final int m7418getUnspecifiedfcGXIks() {
                return Strategy.Unspecified;
            }

            private Companion() {
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m7409constructorimpl(int i) {
            return i;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Strictness {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m7420constructorimpl(1);
        private static final int Loose = m7420constructorimpl(2);
        private static final int Normal = m7420constructorimpl(3);
        private static final int Strict = m7420constructorimpl(4);
        private static final int Unspecified = m7420constructorimpl(0);
        private final int value;

        private /* synthetic */ Strictness(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strictness m7419boximpl(int i) {
            return new Strictness(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7421equalsimpl(int i, Object obj) {
            return (obj instanceof Strictness) && i == ((Strictness) obj).m7425unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7422equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7423hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7424toStringimpl(int i) {
            return m7422equalsimpl0(i, Default) ? "Strictness.None" : m7422equalsimpl0(i, Loose) ? "Strictness.Loose" : m7422equalsimpl0(i, Normal) ? "Strictness.Normal" : m7422equalsimpl0(i, Strict) ? "Strictness.Strict" : m7422equalsimpl0(i, Unspecified) ? "Strictness.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m7421equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m7423hashCodeimpl(this.value);
        }

        public String toString() {
            return m7424toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m7425unboximpl() {
            return this.value;
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            /* renamed from: getDefault-usljTpc, reason: not valid java name */
            public final int m7426getDefaultusljTpc() {
                return Strictness.Default;
            }

            /* renamed from: getLoose-usljTpc, reason: not valid java name */
            public final int m7427getLooseusljTpc() {
                return Strictness.Loose;
            }

            /* renamed from: getNormal-usljTpc, reason: not valid java name */
            public final int m7428getNormalusljTpc() {
                return Strictness.Normal;
            }

            /* renamed from: getStrict-usljTpc, reason: not valid java name */
            public final int m7429getStrictusljTpc() {
                return Strictness.Strict;
            }

            /* renamed from: getUnspecified-usljTpc, reason: not valid java name */
            public final int m7430getUnspecifiedusljTpc() {
                return Strictness.Unspecified;
            }

            private Companion() {
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m7420constructorimpl(int i) {
            return i;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class WordBreak {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m7432constructorimpl(1);
        private static final int Phrase = m7432constructorimpl(2);
        private static final int Unspecified = m7432constructorimpl(0);
        private final int value;

        private /* synthetic */ WordBreak(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WordBreak m7431boximpl(int i) {
            return new WordBreak(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7433equalsimpl(int i, Object obj) {
            return (obj instanceof WordBreak) && i == ((WordBreak) obj).m7437unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7434equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7435hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7436toStringimpl(int i) {
            return m7434equalsimpl0(i, Default) ? "WordBreak.None" : m7434equalsimpl0(i, Phrase) ? "WordBreak.Phrase" : m7434equalsimpl0(i, Unspecified) ? "WordBreak.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m7433equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m7435hashCodeimpl(this.value);
        }

        public String toString() {
            return m7436toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m7437unboximpl() {
            return this.value;
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            /* renamed from: getDefault-jp8hJ3c, reason: not valid java name */
            public final int m7438getDefaultjp8hJ3c() {
                return WordBreak.Default;
            }

            /* renamed from: getPhrase-jp8hJ3c, reason: not valid java name */
            public final int m7439getPhrasejp8hJ3c() {
                return WordBreak.Phrase;
            }

            /* renamed from: getUnspecified-jp8hJ3c, reason: not valid java name */
            public final int m7440getUnspecifiedjp8hJ3c() {
                return WordBreak.Unspecified;
            }

            private Companion() {
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m7432constructorimpl(int i) {
            return i;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getHeading-rAG3T2k, reason: not valid java name */
        public final int m7404getHeadingrAG3T2k() {
            return LineBreak.Heading;
        }

        /* renamed from: getParagraph-rAG3T2k, reason: not valid java name */
        public final int m7405getParagraphrAG3T2k() {
            return LineBreak.Paragraph;
        }

        /* renamed from: getSimple-rAG3T2k, reason: not valid java name */
        public final int m7406getSimplerAG3T2k() {
            return LineBreak.Simple;
        }

        /* renamed from: getUnspecified-rAG3T2k, reason: not valid java name */
        public final int m7407getUnspecifiedrAG3T2k() {
            return LineBreak.Unspecified;
        }

        private Companion() {
        }

        /* renamed from: getHeading-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m7400getHeadingrAG3T2k$annotations() {
        }

        /* renamed from: getParagraph-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m7401getParagraphrAG3T2k$annotations() {
        }

        /* renamed from: getSimple-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m7402getSimplerAG3T2k$annotations() {
        }

        /* renamed from: getUnspecified-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m7403getUnspecifiedrAG3T2k$annotations() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7388constructorimpl(int i) {
        return i;
    }
}
