package androidx.compose.material3;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationItemIconPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Top = m2198constructorimpl(0);
    private static final int Start = m2198constructorimpl(1);

    private /* synthetic */ NavigationItemIconPosition(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NavigationItemIconPosition m2197boximpl(int i) {
        return new NavigationItemIconPosition(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2199equalsimpl(int i, Object obj) {
        return (obj instanceof NavigationItemIconPosition) && i == ((NavigationItemIconPosition) obj).m2203unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2200equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2201hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2202toStringimpl(int i) {
        return m2200equalsimpl0(i, Top) ? "Top" : m2200equalsimpl0(i, Start) ? "Start" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m2199equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2201hashCodeimpl(this.value);
    }

    public String toString() {
        return m2202toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2203unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getStart--xw1Ddg, reason: not valid java name */
        public final int m2204getStartxw1Ddg() {
            return NavigationItemIconPosition.Start;
        }

        /* renamed from: getTop--xw1Ddg, reason: not valid java name */
        public final int m2205getTopxw1Ddg() {
            return NavigationItemIconPosition.Top;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m2198constructorimpl(int i) {
        return i;
    }
}
