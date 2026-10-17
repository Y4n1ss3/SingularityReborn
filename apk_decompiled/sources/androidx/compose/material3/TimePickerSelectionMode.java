package androidx.compose.material3;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimePickerSelectionMode {
    public static final Companion Companion = new Companion(null);
    private static final int Hour = m2671constructorimpl(0);
    private static final int Minute = m2671constructorimpl(1);
    private final int value;

    private /* synthetic */ TimePickerSelectionMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TimePickerSelectionMode m2670boximpl(int i) {
        return new TimePickerSelectionMode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2672equalsimpl(int i, Object obj) {
        return (obj instanceof TimePickerSelectionMode) && i == ((TimePickerSelectionMode) obj).m2676unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2673equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2674hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2675toStringimpl(int i) {
        return m2673equalsimpl0(i, Hour) ? "Hour" : m2673equalsimpl0(i, Minute) ? "Minute" : "";
    }

    public boolean equals(Object obj) {
        return m2672equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m2674hashCodeimpl(this.value);
    }

    public String toString() {
        return m2675toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2676unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getHour-yecRtBI, reason: not valid java name */
        public final int m2677getHouryecRtBI() {
            return TimePickerSelectionMode.Hour;
        }

        /* renamed from: getMinute-yecRtBI, reason: not valid java name */
        public final int m2678getMinuteyecRtBI() {
            return TimePickerSelectionMode.Minute;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m2671constructorimpl(int i) {
        return i;
    }
}
