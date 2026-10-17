package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.graphics.Fields;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class u0 {
    public static final u0 d;
    public static final u0 e;
    public static final u0 f;
    public static final u0 g;
    public static final u0 h;
    public static final u0 i;
    public static final u0 j;
    public static final u0 k;
    public final Object a;
    public final int b;
    public final Class c;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        new u0(1, (String) null);
        new u0(2, (String) null);
        new u0(4, (String) null);
        new u0(8, (String) null);
        new u0(16, (String) null);
        new u0(32, (String) null);
        d = new u0(64, (String) null);
        e = new u0(Fields.SpotShadowColor, (String) null);
        new u0(Fields.RotationX, j1.class);
        new u0(Fields.RotationY, j1.class);
        new u0(Fields.RotationZ, k1.class);
        new u0(Fields.CameraDistance, k1.class);
        f = new u0(Fields.TransformOrigin, (String) null);
        g = new u0(8192, (String) null);
        new u0(Fields.Clip, (String) null);
        new u0(Fields.CompositingStrategy, (String) null);
        new u0(65536, (String) null);
        new u0(Fields.RenderEffect, o1.class);
        new u0(Fields.ColorFilter, (String) null);
        new u0(Fields.BlendMode, (String) null);
        new u0(1048576, (String) null);
        new u0(2097152, p1.class);
        new u0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new u0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, m1.class);
        h = new u0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        i = new u0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        j = new u0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        k = new u0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new u0(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
        new u0(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
        new u0(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
        new u0(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
        new u0(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new u0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, n1.class);
        new u0(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, l1.class);
        new u0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new u0(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            accessibilityAction = accessibilityAction10;
        } else {
            accessibilityAction = null;
        }
        new u0(accessibilityAction, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i2 >= 30) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction2 = accessibilityAction9;
        } else {
            accessibilityAction2 = null;
        }
        new u0(accessibilityAction2, R.id.accessibilityActionImeEnter, null, null, null);
        new u0(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        if (i2 >= 32) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction3 = accessibilityAction8;
        } else {
            accessibilityAction3 = null;
        }
        new u0(accessibilityAction3, R.id.accessibilityActionDragDrop, null, null, null);
        if (i2 >= 32) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction4 = accessibilityAction7;
        } else {
            accessibilityAction4 = null;
        }
        new u0(accessibilityAction4, R.id.accessibilityActionDragCancel, null, null, null);
        if (i2 >= 33) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction5 = accessibilityAction6;
        } else {
            accessibilityAction5 = null;
        }
        new u0(accessibilityAction5, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new u0(i2 >= 34 ? q0.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public u0(Object obj, int i2, CharSequence charSequence, q1 q1Var, Class cls) {
        this.b = i2;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.a = obj;
        }
        this.c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof u0)) {
            return false;
        }
        Object obj2 = ((u0) obj).a;
        Object obj3 = this.a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String c = z0.c(this.b);
        if (c.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                c = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(c);
        return sb.toString();
    }

    public u0(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public u0(int i2, String str) {
        this(null, i2, str, null, null);
    }
}
