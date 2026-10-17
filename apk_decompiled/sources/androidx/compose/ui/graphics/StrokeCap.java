package androidx.compose.ui.graphics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StrokeCap {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Butt = m5129constructorimpl(0);
    private static final int Round = m5129constructorimpl(1);
    private static final int Square = m5129constructorimpl(2);

    private /* synthetic */ StrokeCap(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StrokeCap m5128boximpl(int i) {
        return new StrokeCap(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5130equalsimpl(int i, Object obj) {
        return (obj instanceof StrokeCap) && i == ((StrokeCap) obj).m5134unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5131equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5132hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5133toStringimpl(int i) {
        return m5131equalsimpl0(i, Butt) ? "Butt" : m5131equalsimpl0(i, Round) ? "Round" : m5131equalsimpl0(i, Square) ? "Square" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5130equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5132hashCodeimpl(this.value);
    }

    public String toString() {
        return m5133toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5134unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getButt-KaPHkGw, reason: not valid java name */
        public final int m5135getButtKaPHkGw() {
            return StrokeCap.Butt;
        }

        /* renamed from: getRound-KaPHkGw, reason: not valid java name */
        public final int m5136getRoundKaPHkGw() {
            return StrokeCap.Round;
        }

        /* renamed from: getSquare-KaPHkGw, reason: not valid java name */
        public final int m5137getSquareKaPHkGw() {
            return StrokeCap.Square;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5129constructorimpl(int i) {
        return i;
    }
}
