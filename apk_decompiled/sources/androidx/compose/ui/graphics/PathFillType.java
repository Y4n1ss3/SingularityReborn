package androidx.compose.ui.graphics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PathFillType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int NonZero = m5051constructorimpl(0);
    private static final int EvenOdd = m5051constructorimpl(1);

    private /* synthetic */ PathFillType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathFillType m5050boximpl(int i) {
        return new PathFillType(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5052equalsimpl(int i, Object obj) {
        return (obj instanceof PathFillType) && i == ((PathFillType) obj).m5056unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5053equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5054hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5055toStringimpl(int i) {
        return m5053equalsimpl0(i, NonZero) ? "NonZero" : m5053equalsimpl0(i, EvenOdd) ? "EvenOdd" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5052equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5054hashCodeimpl(this.value);
    }

    public String toString() {
        return m5055toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5056unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getEvenOdd-Rg-k1Os, reason: not valid java name */
        public final int m5057getEvenOddRgk1Os() {
            return PathFillType.EvenOdd;
        }

        /* renamed from: getNonZero-Rg-k1Os, reason: not valid java name */
        public final int m5058getNonZeroRgk1Os() {
            return PathFillType.NonZero;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5051constructorimpl(int i) {
        return i;
    }
}
