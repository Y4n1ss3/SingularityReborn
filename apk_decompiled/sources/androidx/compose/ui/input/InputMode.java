package androidx.compose.ui.input;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class InputMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Touch = m5567constructorimpl(1);
    private static final int Keyboard = m5567constructorimpl(2);

    private /* synthetic */ InputMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InputMode m5566boximpl(int i) {
        return new InputMode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5568equalsimpl(int i, Object obj) {
        return (obj instanceof InputMode) && i == ((InputMode) obj).m5572unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5569equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5570hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5571toStringimpl(int i) {
        return m5569equalsimpl0(i, Touch) ? "Touch" : m5569equalsimpl0(i, Keyboard) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return m5568equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5570hashCodeimpl(this.value);
    }

    public String toString() {
        return m5571toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5572unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getKeyboard-aOaMEAU, reason: not valid java name */
        public final int m5573getKeyboardaOaMEAU() {
            return InputMode.Keyboard;
        }

        /* renamed from: getTouch-aOaMEAU, reason: not valid java name */
        public final int m5574getTouchaOaMEAU() {
            return InputMode.Touch;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5567constructorimpl(int i) {
        return i;
    }
}
