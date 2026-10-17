package androidx.compose.ui.graphics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FilterQuality {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m4854constructorimpl(0);
    private static final int Low = m4854constructorimpl(1);
    private static final int Medium = m4854constructorimpl(2);
    private static final int High = m4854constructorimpl(3);

    private /* synthetic */ FilterQuality(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FilterQuality m4853boximpl(int i) {
        return new FilterQuality(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4855equalsimpl(int i, Object obj) {
        return (obj instanceof FilterQuality) && i == ((FilterQuality) obj).m4859unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4856equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4857hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4858toStringimpl(int i) {
        return m4856equalsimpl0(i, None) ? "None" : m4856equalsimpl0(i, Low) ? "Low" : m4856equalsimpl0(i, Medium) ? "Medium" : m4856equalsimpl0(i, High) ? "High" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m4855equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m4857hashCodeimpl(this.value);
    }

    public String toString() {
        return m4858toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4859unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getHigh-f-v9h1I, reason: not valid java name */
        public final int m4860getHighfv9h1I() {
            return FilterQuality.High;
        }

        /* renamed from: getLow-f-v9h1I, reason: not valid java name */
        public final int m4861getLowfv9h1I() {
            return FilterQuality.Low;
        }

        /* renamed from: getMedium-f-v9h1I, reason: not valid java name */
        public final int m4862getMediumfv9h1I() {
            return FilterQuality.Medium;
        }

        /* renamed from: getNone-f-v9h1I, reason: not valid java name */
        public final int m4863getNonefv9h1I() {
            return FilterQuality.None;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4854constructorimpl(int i) {
        return i;
    }
}
