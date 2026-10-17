package androidx.compose.foundation.text;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MenuItemsAvailability {
    private static final int AUTO_FILL = 16;
    private static final int COPY = 1;
    private static final int CUT = 4;
    private static final int NONE = 0;
    private static final int PASTE = 2;
    private static final int SELECT_ALL = 8;
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m1144constructorimpl(0);

    private /* synthetic */ MenuItemsAvailability(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MenuItemsAvailability m1143boximpl(int i) {
        return new MenuItemsAvailability(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1145constructorimpl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return m1144constructorimpl((z ? 1 : 0) | (z2 ? 2 : 0) | (z3 ? 4 : 0) | (z4 ? 8 : 0) | (z5 ? 16 : 0));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1146equalsimpl(int i, Object obj) {
        return (obj instanceof MenuItemsAvailability) && i == ((MenuItemsAvailability) obj).m1155unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1147equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: getCanAutofill-impl, reason: not valid java name */
    public static final boolean m1148getCanAutofillimpl(int i) {
        return (i & 16) == 16;
    }

    /* renamed from: getCanCopy-impl, reason: not valid java name */
    public static final boolean m1149getCanCopyimpl(int i) {
        return (i & 1) == 1;
    }

    /* renamed from: getCanCut-impl, reason: not valid java name */
    public static final boolean m1150getCanCutimpl(int i) {
        return (i & 4) == 4;
    }

    /* renamed from: getCanPaste-impl, reason: not valid java name */
    public static final boolean m1151getCanPasteimpl(int i) {
        return (i & 2) == 2;
    }

    /* renamed from: getCanSelectAll-impl, reason: not valid java name */
    public static final boolean m1152getCanSelectAllimpl(int i) {
        return (i & 8) == 8;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1153hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1154toStringimpl(int i) {
        return r6.b("MenuItemsAvailability(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m1146equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1153hashCodeimpl(this.value);
    }

    public String toString() {
        return m1154toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1155unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getNone-JKCFgKw, reason: not valid java name */
        public final int m1156getNoneJKCFgKw() {
            return MenuItemsAvailability.None;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m1144constructorimpl(int i) {
        return i;
    }
}
