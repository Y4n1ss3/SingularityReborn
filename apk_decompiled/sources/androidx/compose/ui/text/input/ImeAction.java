package androidx.compose.ui.text.input;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ImeAction {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m7226constructorimpl(-1);
    private static final int Default = m7226constructorimpl(1);
    private static final int None = m7226constructorimpl(0);
    private static final int Go = m7226constructorimpl(2);
    private static final int Search = m7226constructorimpl(3);
    private static final int Send = m7226constructorimpl(4);
    private static final int Previous = m7226constructorimpl(5);
    private static final int Next = m7226constructorimpl(6);
    private static final int Done = m7226constructorimpl(7);

    private /* synthetic */ ImeAction(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImeAction m7225boximpl(int i) {
        return new ImeAction(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7227equalsimpl(int i, Object obj) {
        return (obj instanceof ImeAction) && i == ((ImeAction) obj).m7231unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7228equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7229hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7230toStringimpl(int i) {
        return m7228equalsimpl0(i, Unspecified) ? "Unspecified" : m7228equalsimpl0(i, None) ? "None" : m7228equalsimpl0(i, Default) ? "Default" : m7228equalsimpl0(i, Go) ? "Go" : m7228equalsimpl0(i, Search) ? "Search" : m7228equalsimpl0(i, Send) ? "Send" : m7228equalsimpl0(i, Previous) ? "Previous" : m7228equalsimpl0(i, Next) ? "Next" : m7228equalsimpl0(i, Done) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m7227equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7229hashCodeimpl(this.value);
    }

    public String toString() {
        return m7230toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7231unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getDefault-eUduSuo, reason: not valid java name */
        public final int m7241getDefaulteUduSuo() {
            return ImeAction.Default;
        }

        /* renamed from: getDone-eUduSuo, reason: not valid java name */
        public final int m7242getDoneeUduSuo() {
            return ImeAction.Done;
        }

        /* renamed from: getGo-eUduSuo, reason: not valid java name */
        public final int m7243getGoeUduSuo() {
            return ImeAction.Go;
        }

        /* renamed from: getNext-eUduSuo, reason: not valid java name */
        public final int m7244getNexteUduSuo() {
            return ImeAction.Next;
        }

        /* renamed from: getNone-eUduSuo, reason: not valid java name */
        public final int m7245getNoneeUduSuo() {
            return ImeAction.None;
        }

        /* renamed from: getPrevious-eUduSuo, reason: not valid java name */
        public final int m7246getPreviouseUduSuo() {
            return ImeAction.Previous;
        }

        /* renamed from: getSearch-eUduSuo, reason: not valid java name */
        public final int m7247getSearcheUduSuo() {
            return ImeAction.Search;
        }

        /* renamed from: getSend-eUduSuo, reason: not valid java name */
        public final int m7248getSendeUduSuo() {
            return ImeAction.Send;
        }

        /* renamed from: getUnspecified-eUduSuo, reason: not valid java name */
        public final int m7249getUnspecifiedeUduSuo() {
            return ImeAction.Unspecified;
        }

        private Companion() {
        }

        /* renamed from: getDefault-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m7232getDefaulteUduSuo$annotations() {
        }

        /* renamed from: getDone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m7233getDoneeUduSuo$annotations() {
        }

        /* renamed from: getGo-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m7234getGoeUduSuo$annotations() {
        }

        /* renamed from: getNext-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m7235getNexteUduSuo$annotations() {
        }

        /* renamed from: getNone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m7236getNoneeUduSuo$annotations() {
        }

        /* renamed from: getPrevious-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m7237getPreviouseUduSuo$annotations() {
        }

        /* renamed from: getSearch-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m7238getSearcheUduSuo$annotations() {
        }

        /* renamed from: getSend-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m7239getSendeUduSuo$annotations() {
        }

        /* renamed from: getUnspecified-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m7240getUnspecifiedeUduSuo$annotations() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m7226constructorimpl(int i) {
        return i;
    }
}
