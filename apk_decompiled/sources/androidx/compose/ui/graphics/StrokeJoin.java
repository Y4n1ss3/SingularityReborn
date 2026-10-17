package androidx.compose.ui.graphics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StrokeJoin {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Miter = m5139constructorimpl(0);
    private static final int Round = m5139constructorimpl(1);
    private static final int Bevel = m5139constructorimpl(2);

    private /* synthetic */ StrokeJoin(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StrokeJoin m5138boximpl(int i) {
        return new StrokeJoin(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5140equalsimpl(int i, Object obj) {
        return (obj instanceof StrokeJoin) && i == ((StrokeJoin) obj).m5144unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5141equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5142hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5143toStringimpl(int i) {
        return m5141equalsimpl0(i, Miter) ? "Miter" : m5141equalsimpl0(i, Round) ? "Round" : m5141equalsimpl0(i, Bevel) ? "Bevel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5140equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5142hashCodeimpl(this.value);
    }

    public String toString() {
        return m5143toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5144unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getBevel-LxFBmk8, reason: not valid java name */
        public final int m5145getBevelLxFBmk8() {
            return StrokeJoin.Bevel;
        }

        /* renamed from: getMiter-LxFBmk8, reason: not valid java name */
        public final int m5146getMiterLxFBmk8() {
            return StrokeJoin.Miter;
        }

        /* renamed from: getRound-LxFBmk8, reason: not valid java name */
        public final int m5147getRoundLxFBmk8() {
            return StrokeJoin.Round;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5139constructorimpl(int i) {
        return i;
    }
}
