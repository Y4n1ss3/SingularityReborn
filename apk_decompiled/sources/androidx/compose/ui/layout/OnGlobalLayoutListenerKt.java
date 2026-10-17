package androidx.compose.ui.layout;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class OnGlobalLayoutListenerKt {
    public static final DelegatableNode.RegistrationHandle registerOnGlobalLayoutListener(DelegatableNode delegatableNode, long j, long j2, ky kyVar) {
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        return LayoutNodeKt.requireOwner(requireLayoutNode).getRectManager().registerOnGlobalLayoutCallback(requireLayoutNode.getSemanticsId(), j, j2, delegatableNode.getNode(), kyVar);
    }
}
