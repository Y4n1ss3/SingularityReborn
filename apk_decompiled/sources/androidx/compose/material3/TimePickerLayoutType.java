package androidx.compose.material3;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimePickerLayoutType {
    public static final Companion Companion = new Companion(null);
    private static final int Horizontal = m2662constructorimpl(0);
    private static final int Vertical = m2662constructorimpl(1);
    private final int value;

    private /* synthetic */ TimePickerLayoutType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TimePickerLayoutType m2661boximpl(int i) {
        return new TimePickerLayoutType(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2663equalsimpl(int i, Object obj) {
        return (obj instanceof TimePickerLayoutType) && i == ((TimePickerLayoutType) obj).m2667unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2664equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2665hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2666toStringimpl(int i) {
        return m2664equalsimpl0(i, Horizontal) ? "Horizontal" : m2664equalsimpl0(i, Vertical) ? "Vertical" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m2663equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2665hashCodeimpl(this.value);
    }

    public String toString() {
        return m2666toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2667unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getHorizontal-QJTpgSE, reason: not valid java name */
        public final int m2668getHorizontalQJTpgSE() {
            return TimePickerLayoutType.Horizontal;
        }

        /* renamed from: getVertical-QJTpgSE, reason: not valid java name */
        public final int m2669getVerticalQJTpgSE() {
            return TimePickerLayoutType.Vertical;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2662constructorimpl(int i) {
        return i;
    }
}
