package androidx.compose.foundation.text;

import android.R;
import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContextMenuIcons {
    public static final Companion Companion = new Companion(null);
    private final int value;

    private /* synthetic */ ContextMenuIcons(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ContextMenuIcons m1087boximpl(int i) {
        return new ContextMenuIcons(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1089equalsimpl(int i, Object obj) {
        return (obj instanceof ContextMenuIcons) && i == ((ContextMenuIcons) obj).m1093unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1090equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1091hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1092toStringimpl(int i) {
        return r6.b("ContextMenuIcons(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m1089equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1091hashCodeimpl(this.value);
    }

    public String toString() {
        return m1092toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1093unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getActionModeCopyDrawable-3I4p1mQ, reason: not valid java name */
        public final int m1094getActionModeCopyDrawable3I4p1mQ() {
            return ContextMenuIcons.m1088constructorimpl(R.attr.actionModeCopyDrawable);
        }

        /* renamed from: getActionModeCutDrawable-3I4p1mQ, reason: not valid java name */
        public final int m1095getActionModeCutDrawable3I4p1mQ() {
            return ContextMenuIcons.m1088constructorimpl(R.attr.actionModeCutDrawable);
        }

        /* renamed from: getActionModePasteDrawable-3I4p1mQ, reason: not valid java name */
        public final int m1096getActionModePasteDrawable3I4p1mQ() {
            return ContextMenuIcons.m1088constructorimpl(R.attr.actionModePasteDrawable);
        }

        /* renamed from: getActionModeSelectAllDrawable-3I4p1mQ, reason: not valid java name */
        public final int m1097getActionModeSelectAllDrawable3I4p1mQ() {
            return ContextMenuIcons.m1088constructorimpl(R.attr.actionModeSelectAllDrawable);
        }

        /* renamed from: getID_NULL-3I4p1mQ, reason: not valid java name */
        public final int m1098getID_NULL3I4p1mQ() {
            return ContextMenuIcons.m1088constructorimpl(0);
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1088constructorimpl(int i) {
        return i;
    }
}
