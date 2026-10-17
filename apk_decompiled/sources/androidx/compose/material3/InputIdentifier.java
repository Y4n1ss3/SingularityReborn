package androidx.compose.material3;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InputIdentifier {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int SingleDateInput = m2079constructorimpl(0);
    private static final int StartDateInput = m2079constructorimpl(1);
    private static final int EndDateInput = m2079constructorimpl(2);

    private /* synthetic */ InputIdentifier(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InputIdentifier m2078boximpl(int i) {
        return new InputIdentifier(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2080equalsimpl(int i, Object obj) {
        return (obj instanceof InputIdentifier) && i == ((InputIdentifier) obj).m2084unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2081equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2082hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2083toStringimpl(int i) {
        return m2081equalsimpl0(i, SingleDateInput) ? "SingleDateInput" : m2081equalsimpl0(i, StartDateInput) ? "StartDateInput" : m2081equalsimpl0(i, EndDateInput) ? "EndDateInput" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m2080equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2082hashCodeimpl(this.value);
    }

    public String toString() {
        return m2083toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2084unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getEndDateInput-J2x2o4M, reason: not valid java name */
        public final int m2085getEndDateInputJ2x2o4M() {
            return InputIdentifier.EndDateInput;
        }

        /* renamed from: getSingleDateInput-J2x2o4M, reason: not valid java name */
        public final int m2086getSingleDateInputJ2x2o4M() {
            return InputIdentifier.SingleDateInput;
        }

        /* renamed from: getStartDateInput-J2x2o4M, reason: not valid java name */
        public final int m2087getStartDateInputJ2x2o4M() {
            return InputIdentifier.StartDateInput;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2079constructorimpl(int i) {
        return i;
    }
}
