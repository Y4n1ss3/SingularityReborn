package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.ui.internal.InlineClassHelperKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DelegatableNode_androidKt {
    public static final View requireView(DelegatableNode delegatableNode) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot get View because the Modifier node is not currently attached.");
        }
        Object requireOwner = LayoutNodeKt.requireOwner(DelegatableNodeKt.requireLayoutNode(delegatableNode));
        requireOwner.getClass();
        return (View) requireOwner;
    }
}
