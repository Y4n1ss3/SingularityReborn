package androidx.compose.ui.text.input;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class KeyboardCapitalization {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m7262constructorimpl(-1);
    private static final int None = m7262constructorimpl(0);
    private static final int Characters = m7262constructorimpl(1);
    private static final int Words = m7262constructorimpl(2);
    private static final int Sentences = m7262constructorimpl(3);

    private /* synthetic */ KeyboardCapitalization(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardCapitalization m7261boximpl(int i) {
        return new KeyboardCapitalization(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7263equalsimpl(int i, Object obj) {
        return (obj instanceof KeyboardCapitalization) && i == ((KeyboardCapitalization) obj).m7267unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7264equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7265hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7266toStringimpl(int i) {
        return m7264equalsimpl0(i, Unspecified) ? "Unspecified" : m7264equalsimpl0(i, None) ? "None" : m7264equalsimpl0(i, Characters) ? "Characters" : m7264equalsimpl0(i, Words) ? "Words" : m7264equalsimpl0(i, Sentences) ? "Sentences" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m7263equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7265hashCodeimpl(this.value);
    }

    public String toString() {
        return m7266toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7267unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getCharacters-IUNYP9k, reason: not valid java name */
        public final int m7273getCharactersIUNYP9k() {
            return KeyboardCapitalization.Characters;
        }

        /* renamed from: getNone-IUNYP9k, reason: not valid java name */
        public final int m7274getNoneIUNYP9k() {
            return KeyboardCapitalization.None;
        }

        /* renamed from: getSentences-IUNYP9k, reason: not valid java name */
        public final int m7275getSentencesIUNYP9k() {
            return KeyboardCapitalization.Sentences;
        }

        /* renamed from: getUnspecified-IUNYP9k, reason: not valid java name */
        public final int m7276getUnspecifiedIUNYP9k() {
            return KeyboardCapitalization.Unspecified;
        }

        /* renamed from: getWords-IUNYP9k, reason: not valid java name */
        public final int m7277getWordsIUNYP9k() {
            return KeyboardCapitalization.Words;
        }

        private Companion() {
        }

        /* renamed from: getCharacters-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m7268getCharactersIUNYP9k$annotations() {
        }

        /* renamed from: getNone-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m7269getNoneIUNYP9k$annotations() {
        }

        /* renamed from: getSentences-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m7270getSentencesIUNYP9k$annotations() {
        }

        /* renamed from: getUnspecified-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m7271getUnspecifiedIUNYP9k$annotations() {
        }

        /* renamed from: getWords-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m7272getWordsIUNYP9k$annotations() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m7262constructorimpl(int i) {
        return i;
    }
}
