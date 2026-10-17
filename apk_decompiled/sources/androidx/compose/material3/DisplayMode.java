package androidx.compose.material3;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DisplayMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Picker = m1924constructorimpl(0);
    private static final int Input = m1924constructorimpl(1);

    private /* synthetic */ DisplayMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DisplayMode m1923boximpl(int i) {
        return new DisplayMode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1925equalsimpl(int i, Object obj) {
        return (obj instanceof DisplayMode) && i == ((DisplayMode) obj).m1929unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1926equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1927hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1928toStringimpl(int i) {
        return m1926equalsimpl0(i, Picker) ? "Picker" : m1926equalsimpl0(i, Input) ? "Input" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m1925equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1927hashCodeimpl(this.value);
    }

    public String toString() {
        return m1928toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1929unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getInput-jFl-4v0, reason: not valid java name */
        public final int m1930getInputjFl4v0() {
            return DisplayMode.Input;
        }

        /* renamed from: getPicker-jFl-4v0, reason: not valid java name */
        public final int m1931getPickerjFl4v0() {
            return DisplayMode.Picker;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1924constructorimpl(int i) {
        return i;
    }
}
