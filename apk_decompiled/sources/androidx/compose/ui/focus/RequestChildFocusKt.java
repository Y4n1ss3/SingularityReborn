package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RequestChildFocusKt {
    public static final boolean requestFocusForChildInRootBounds(DelegatableNode delegatableNode, int i, int i2, int i3, int i4) {
        FocusTargetModifierNode findFocusableNodeFromRect$ui = DelegatableNodeKt.requireOwner(delegatableNode).getRectManager().findFocusableNodeFromRect$ui(i, i2, i3, i4, DelegatableNodeKt.requireLayoutNode(delegatableNode).getSemanticsId());
        if (findFocusableNodeFromRect$ui != null) {
            return FocusTargetModifierNode.m4421requestFocus3ESFkO8$default(findFocusableNodeFromRect$ui, 0, 1, null);
        }
        return false;
    }
}
