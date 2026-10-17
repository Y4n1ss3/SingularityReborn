package androidx.compose.material3;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimePickerDisplayMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Picker = m2639constructorimpl(0);
    private static final int Input = m2639constructorimpl(1);

    private /* synthetic */ TimePickerDisplayMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TimePickerDisplayMode m2638boximpl(int i) {
        return new TimePickerDisplayMode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2640equalsimpl(int i, Object obj) {
        return (obj instanceof TimePickerDisplayMode) && i == ((TimePickerDisplayMode) obj).m2644unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2641equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2642hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2643toStringimpl(int i) {
        return m2641equalsimpl0(i, Picker) ? "Picker" : m2641equalsimpl0(i, Input) ? "Input" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m2640equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2642hashCodeimpl(this.value);
    }

    public String toString() {
        return m2643toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2644unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getInput--ONbchU, reason: not valid java name */
        public final int m2645getInputONbchU() {
            return TimePickerDisplayMode.Input;
        }

        /* renamed from: getPicker--ONbchU, reason: not valid java name */
        public final int m2646getPickerONbchU() {
            return TimePickerDisplayMode.Picker;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2639constructorimpl(int i) {
        return i;
    }
}
