package androidx.compose.ui.focus;

import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import defpackage.dq;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Focusability {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Always = m4444constructorimpl(1);
    private static final int SystemDefined = m4444constructorimpl(0);
    private static final int Never = m4444constructorimpl(2);

    private /* synthetic */ Focusability(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Focusability m4442boximpl(int i) {
        return new Focusability(i);
    }

    /* renamed from: canFocus-impl$ui, reason: not valid java name */
    public static final boolean m4443canFocusimpl$ui(int i, CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        if (m4446equalsimpl0(i, Always)) {
            return true;
        }
        if (m4446equalsimpl0(i, SystemDefined)) {
            return !InputMode.m5569equalsimpl0(((InputModeManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(compositionLocalConsumerModifierNode, CompositionLocalsKt.getLocalInputModeManager())).mo5576getInputModeaOaMEAU(), InputMode.Companion.m5574getTouchaOaMEAU());
        }
        if (m4446equalsimpl0(i, Never)) {
            return false;
        }
        o.f("Unknown Focusability");
        return false;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4445equalsimpl(int i, Object obj) {
        return (obj instanceof Focusability) && i == ((Focusability) obj).m4449unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4446equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4447hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4448toStringimpl(int i) {
        if (m4446equalsimpl0(i, Always)) {
            return "Always";
        }
        if (m4446equalsimpl0(i, SystemDefined)) {
            return "SystemDefined";
        }
        if (m4446equalsimpl0(i, Never)) {
            return "Never";
        }
        o.f("Unknown Focusability");
        return null;
    }

    public boolean equals(Object obj) {
        return m4445equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4447hashCodeimpl(this.value);
    }

    public String toString() {
        return m4448toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4449unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getAlways-LCbbffg, reason: not valid java name */
        public final int m4450getAlwaysLCbbffg() {
            return Focusability.Always;
        }

        /* renamed from: getNever-LCbbffg, reason: not valid java name */
        public final int m4451getNeverLCbbffg() {
            return Focusability.Never;
        }

        /* renamed from: getSystemDefined-LCbbffg, reason: not valid java name */
        public final int m4452getSystemDefinedLCbbffg() {
            return Focusability.SystemDefined;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4444constructorimpl(int i) {
        return i;
    }
}
