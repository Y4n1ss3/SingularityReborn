package androidx.compose.ui.input.key;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class KeyEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m5923constructorimpl(0);
    private static final int KeyUp = m5923constructorimpl(1);
    private static final int KeyDown = m5923constructorimpl(2);

    private /* synthetic */ KeyEventType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyEventType m5922boximpl(int i) {
        return new KeyEventType(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5924equalsimpl(int i, Object obj) {
        return (obj instanceof KeyEventType) && i == ((KeyEventType) obj).m5928unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5925equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5926hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5927toStringimpl(int i) {
        return m5925equalsimpl0(i, KeyUp) ? "KeyUp" : m5925equalsimpl0(i, KeyDown) ? "KeyDown" : m5925equalsimpl0(i, Unknown) ? "Unknown" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m5924equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5926hashCodeimpl(this.value);
    }

    public String toString() {
        return m5927toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5928unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getKeyDown-CS__XNY, reason: not valid java name */
        public final int m5929getKeyDownCS__XNY() {
            return KeyEventType.KeyDown;
        }

        /* renamed from: getKeyUp-CS__XNY, reason: not valid java name */
        public final int m5930getKeyUpCS__XNY() {
            return KeyEventType.KeyUp;
        }

        /* renamed from: getUnknown-CS__XNY, reason: not valid java name */
        public final int m5931getUnknownCS__XNY() {
            return KeyEventType.Unknown;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5923constructorimpl(int i) {
        return i;
    }
}
