package androidx.compose.ui.input.nestedscroll;

import defpackage.dq;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NestedScrollSource {
    public static final Companion Companion = new Companion(null);
    private static final int Drag;
    private static final int Fling;
    private static final int Relocate;
    private static final int SideEffect;
    private static final int UserInput;
    private static final int Wheel;
    private final int value;

    static {
        int m5955constructorimpl = m5955constructorimpl(1);
        UserInput = m5955constructorimpl;
        int m5955constructorimpl2 = m5955constructorimpl(2);
        SideEffect = m5955constructorimpl2;
        Drag = m5955constructorimpl;
        Fling = m5955constructorimpl2;
        Relocate = m5955constructorimpl(3);
        Wheel = m5955constructorimpl;
    }

    private /* synthetic */ NestedScrollSource(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NestedScrollSource m5954boximpl(int i) {
        return new NestedScrollSource(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5956equalsimpl(int i, Object obj) {
        return (obj instanceof NestedScrollSource) && i == ((NestedScrollSource) obj).m5960unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5957equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5958hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5959toStringimpl(int i) {
        return m5957equalsimpl0(i, UserInput) ? "UserInput" : m5957equalsimpl0(i, SideEffect) ? "SideEffect" : m5957equalsimpl0(i, Relocate) ? "Relocate" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m5956equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5958hashCodeimpl(this.value);
    }

    public String toString() {
        return m5959toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5960unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getDrag-WNlRxjI, reason: not valid java name */
        public final int m5965getDragWNlRxjI() {
            return NestedScrollSource.Drag;
        }

        /* renamed from: getFling-WNlRxjI, reason: not valid java name */
        public final int m5966getFlingWNlRxjI() {
            return NestedScrollSource.Fling;
        }

        /* renamed from: getRelocate-WNlRxjI, reason: not valid java name */
        public final int m5967getRelocateWNlRxjI() {
            return NestedScrollSource.Relocate;
        }

        /* renamed from: getSideEffect-WNlRxjI, reason: not valid java name */
        public final int m5968getSideEffectWNlRxjI() {
            return NestedScrollSource.SideEffect;
        }

        /* renamed from: getUserInput-WNlRxjI, reason: not valid java name */
        public final int m5969getUserInputWNlRxjI() {
            return NestedScrollSource.UserInput;
        }

        /* renamed from: getWheel-WNlRxjI, reason: not valid java name */
        public final int m5970getWheelWNlRxjI() {
            return NestedScrollSource.Wheel;
        }

        private Companion() {
        }

        @er
        /* renamed from: getDrag-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m5961getDragWNlRxjI$annotations() {
        }

        @er
        /* renamed from: getFling-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m5962getFlingWNlRxjI$annotations() {
        }

        @er
        /* renamed from: getRelocate-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m5963getRelocateWNlRxjI$annotations() {
        }

        @er
        /* renamed from: getWheel-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m5964getWheelWNlRxjI$annotations() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5955constructorimpl(int i) {
        return i;
    }
}
