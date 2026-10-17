package androidx.compose.ui.text.font;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FontLoadingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Blocking = m7157constructorimpl(0);
    private static final int OptionalLocal = m7157constructorimpl(1);
    private static final int Async = m7157constructorimpl(2);

    private /* synthetic */ FontLoadingStrategy(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontLoadingStrategy m7156boximpl(int i) {
        return new FontLoadingStrategy(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7158equalsimpl(int i, Object obj) {
        return (obj instanceof FontLoadingStrategy) && i == ((FontLoadingStrategy) obj).m7162unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7159equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7160hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7161toStringimpl(int i) {
        return m7159equalsimpl0(i, Blocking) ? "Blocking" : m7159equalsimpl0(i, OptionalLocal) ? "Optional" : m7159equalsimpl0(i, Async) ? "Async" : r6.b("Invalid(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m7158equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m7160hashCodeimpl(this.value);
    }

    public String toString() {
        return m7161toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7162unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getAsync-PKNRLFQ, reason: not valid java name */
        public final int m7163getAsyncPKNRLFQ() {
            return FontLoadingStrategy.Async;
        }

        /* renamed from: getBlocking-PKNRLFQ, reason: not valid java name */
        public final int m7164getBlockingPKNRLFQ() {
            return FontLoadingStrategy.Blocking;
        }

        /* renamed from: getOptionalLocal-PKNRLFQ, reason: not valid java name */
        public final int m7165getOptionalLocalPKNRLFQ() {
            return FontLoadingStrategy.OptionalLocal;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m7157constructorimpl(int i) {
        return i;
    }
}
