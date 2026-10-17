package androidx.compose.ui.platform;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AutoClearFocusBehavior {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m6712constructorimpl(0);
    private static final int CursorBased = m6712constructorimpl(1);

    private /* synthetic */ AutoClearFocusBehavior(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AutoClearFocusBehavior m6711boximpl(int i) {
        return new AutoClearFocusBehavior(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6713equalsimpl(int i, Object obj) {
        return (obj instanceof AutoClearFocusBehavior) && i == ((AutoClearFocusBehavior) obj).m6717unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6714equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6715hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6716toStringimpl(int i) {
        return r6.b("AutoClearFocusBehavior(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m6713equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6715hashCodeimpl(this.value);
    }

    public String toString() {
        return m6716toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6717unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getCursorBased-4UtRPd4, reason: not valid java name */
        public final int m6718getCursorBased4UtRPd4() {
            return AutoClearFocusBehavior.CursorBased;
        }

        /* renamed from: getDefault-4UtRPd4, reason: not valid java name */
        public final int m6719getDefault4UtRPd4() {
            return m6718getCursorBased4UtRPd4();
        }

        /* renamed from: getNone-4UtRPd4, reason: not valid java name */
        public final int m6720getNone4UtRPd4() {
            return AutoClearFocusBehavior.None;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m6712constructorimpl(int i) {
        return i;
    }
}
