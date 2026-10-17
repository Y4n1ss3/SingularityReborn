package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.node.DelegatableNodeKt;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FocusGroupNode_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsDescendant(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Modifier focusInteropModifier(Modifier modifier) {
        return FocusModifierKt.focusTarget(modifier.then(FocusGroupPropertiesElement.INSTANCE)).then(FocusTargetPropertiesElement.INSTANCE).then(FocusTargetInteropElement.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getCurrentlyFocusedRect(FocusOwner focusOwner, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        androidx.compose.ui.geometry.Rect focusRect = focusOwner.getFocusRect();
        if (focusRect == null) {
            return null;
        }
        return new Rect((((int) focusRect.getLeft()) + iArr[0]) - iArr2[0], (((int) focusRect.getTop()) + iArr[1]) - iArr2[1], (((int) focusRect.getRight()) + iArr[0]) - iArr2[0], (((int) focusRect.getBottom()) + iArr[1]) - iArr2[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View getEmbeddedView(Modifier.Node node) {
        View interopView = DelegatableNodeKt.requireLayoutNode(node.getNode()).getInteropView();
        if (interopView != null) {
            return interopView;
        }
        o.f("Could not fetch interop view");
        return null;
    }
}
