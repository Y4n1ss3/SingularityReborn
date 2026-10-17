package androidx.compose.foundation.text;

import android.R;
import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContextMenuStrings {
    public static final Companion Companion = new Companion(null);
    private final int value;

    private /* synthetic */ ContextMenuStrings(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ContextMenuStrings m1099boximpl(int i) {
        return new ContextMenuStrings(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1101equalsimpl(int i, Object obj) {
        return (obj instanceof ContextMenuStrings) && i == ((ContextMenuStrings) obj).m1105unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1102equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1103hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1104toStringimpl(int i) {
        return r6.b("ContextMenuStrings(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m1101equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1103hashCodeimpl(this.value);
    }

    public String toString() {
        return m1104toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1105unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getAutofill-9Hzcbyc, reason: not valid java name */
        public final int m1106getAutofill9Hzcbyc() {
            return ContextMenuStrings.m1100constructorimpl(R.string.autofill);
        }

        /* renamed from: getCopy-9Hzcbyc, reason: not valid java name */
        public final int m1107getCopy9Hzcbyc() {
            return ContextMenuStrings.m1100constructorimpl(R.string.copy);
        }

        /* renamed from: getCut-9Hzcbyc, reason: not valid java name */
        public final int m1108getCut9Hzcbyc() {
            return ContextMenuStrings.m1100constructorimpl(R.string.cut);
        }

        /* renamed from: getPaste-9Hzcbyc, reason: not valid java name */
        public final int m1109getPaste9Hzcbyc() {
            return ContextMenuStrings.m1100constructorimpl(R.string.paste);
        }

        /* renamed from: getSelectAll-9Hzcbyc, reason: not valid java name */
        public final int m1110getSelectAll9Hzcbyc() {
            return ContextMenuStrings.m1100constructorimpl(R.string.selectAll);
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1100constructorimpl(int i) {
        return i;
    }
}
