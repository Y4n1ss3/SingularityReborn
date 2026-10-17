package androidx.compose.ui.input.pointer;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m6172constructorimpl(0);
    private static final int Touch = m6172constructorimpl(1);
    private static final int Mouse = m6172constructorimpl(2);
    private static final int Stylus = m6172constructorimpl(3);
    private static final int Eraser = m6172constructorimpl(4);

    private /* synthetic */ PointerType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerType m6171boximpl(int i) {
        return new PointerType(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6173equalsimpl(int i, Object obj) {
        return (obj instanceof PointerType) && i == ((PointerType) obj).m6177unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6174equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6175hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6176toStringimpl(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public boolean equals(Object obj) {
        return m6173equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6175hashCodeimpl(this.value);
    }

    public String toString() {
        return m6176toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6177unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getEraser-T8wyACA, reason: not valid java name */
        public final int m6178getEraserT8wyACA() {
            return PointerType.Eraser;
        }

        /* renamed from: getMouse-T8wyACA, reason: not valid java name */
        public final int m6179getMouseT8wyACA() {
            return PointerType.Mouse;
        }

        /* renamed from: getStylus-T8wyACA, reason: not valid java name */
        public final int m6180getStylusT8wyACA() {
            return PointerType.Stylus;
        }

        /* renamed from: getTouch-T8wyACA, reason: not valid java name */
        public final int m6181getTouchT8wyACA() {
            return PointerType.Touch;
        }

        /* renamed from: getUnknown-T8wyACA, reason: not valid java name */
        public final int m6182getUnknownT8wyACA() {
            return PointerType.Unknown;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m6172constructorimpl(int i) {
        return i;
    }
}
