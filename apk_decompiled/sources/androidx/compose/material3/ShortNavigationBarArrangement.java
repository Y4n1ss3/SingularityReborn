package androidx.compose.material3;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShortNavigationBarArrangement {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int EqualWeight = m2375constructorimpl(0);
    private static final int Centered = m2375constructorimpl(1);

    private /* synthetic */ ShortNavigationBarArrangement(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ShortNavigationBarArrangement m2374boximpl(int i) {
        return new ShortNavigationBarArrangement(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2376equalsimpl(int i, Object obj) {
        return (obj instanceof ShortNavigationBarArrangement) && i == ((ShortNavigationBarArrangement) obj).m2380unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2377equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2378hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2379toStringimpl(int i) {
        return m2377equalsimpl0(i, EqualWeight) ? "EqualWeight" : m2377equalsimpl0(i, Centered) ? "Centered" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m2376equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2378hashCodeimpl(this.value);
    }

    public String toString() {
        return m2379toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2380unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getCentered-LnnQw40, reason: not valid java name */
        public final int m2381getCenteredLnnQw40() {
            return ShortNavigationBarArrangement.Centered;
        }

        /* renamed from: getEqualWeight-LnnQw40, reason: not valid java name */
        public final int m2382getEqualWeightLnnQw40() {
            return ShortNavigationBarArrangement.EqualWeight;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m2375constructorimpl(int i) {
        return i;
    }
}
