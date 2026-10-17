package androidx.compose.foundation;

import defpackage.dq;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MarqueeAnimationMode {
    public static final Companion Companion = new Companion(null);
    private static final int Immediately = m298constructorimpl(0);
    private static final int WhileFocused = m298constructorimpl(1);
    private final int value;

    private /* synthetic */ MarqueeAnimationMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MarqueeAnimationMode m297boximpl(int i) {
        return new MarqueeAnimationMode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m299equalsimpl(int i, Object obj) {
        return (obj instanceof MarqueeAnimationMode) && i == ((MarqueeAnimationMode) obj).m303unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m300equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m301hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m302toStringimpl(int i) {
        if (m300equalsimpl0(i, Immediately)) {
            return "Immediately";
        }
        if (m300equalsimpl0(i, WhileFocused)) {
            return "WhileFocused";
        }
        o.b(i, "invalid value: ");
        return null;
    }

    public boolean equals(Object obj) {
        return m299equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m301hashCodeimpl(this.value);
    }

    public String toString() {
        return m302toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m303unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getImmediately-ZbEOnfQ, reason: not valid java name */
        public final int m304getImmediatelyZbEOnfQ() {
            return MarqueeAnimationMode.Immediately;
        }

        /* renamed from: getWhileFocused-ZbEOnfQ, reason: not valid java name */
        public final int m305getWhileFocusedZbEOnfQ() {
            return MarqueeAnimationMode.WhileFocused;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m298constructorimpl(int i) {
        return i;
    }
}
