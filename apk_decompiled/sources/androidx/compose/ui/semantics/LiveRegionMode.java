package androidx.compose.ui.semantics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LiveRegionMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Polite = m6813constructorimpl(0);
    private static final int Assertive = m6813constructorimpl(1);

    private /* synthetic */ LiveRegionMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LiveRegionMode m6812boximpl(int i) {
        return new LiveRegionMode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6814equalsimpl(int i, Object obj) {
        return (obj instanceof LiveRegionMode) && i == ((LiveRegionMode) obj).m6818unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6815equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6816hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6817toStringimpl(int i) {
        return m6815equalsimpl0(i, Polite) ? "Polite" : m6815equalsimpl0(i, Assertive) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m6814equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6816hashCodeimpl(this.value);
    }

    public String toString() {
        return m6817toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6818unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getAssertive-0phEisY, reason: not valid java name */
        public final int m6819getAssertive0phEisY() {
            return LiveRegionMode.Assertive;
        }

        /* renamed from: getPolite-0phEisY, reason: not valid java name */
        public final int m6820getPolite0phEisY() {
            return LiveRegionMode.Polite;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m6813constructorimpl(int i) {
        return i;
    }
}
