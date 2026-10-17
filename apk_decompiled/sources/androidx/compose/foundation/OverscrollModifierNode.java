package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class OverscrollModifierNode extends DelegatingNode {
    private DelegatableNode overscrollNode;

    public OverscrollModifierNode(DelegatableNode delegatableNode) {
        this.overscrollNode = delegatableNode;
    }

    private final void attachIfNeeded() {
        DelegatableNode delegatableNode;
        Modifier.Node node;
        DelegatableNode delegatableNode2 = this.overscrollNode;
        if (delegatableNode2 == null || (node = delegatableNode2.getNode()) == null || node.isAttached()) {
            delegatableNode = null;
        } else {
            DelegatableNode delegatableNode3 = this.overscrollNode;
            delegatableNode3.getClass();
            delegatableNode = delegate(delegatableNode3);
        }
        this.overscrollNode = delegatableNode;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        attachIfNeeded();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
    }

    public final void update(DelegatableNode delegatableNode) {
        DelegatableNode delegatableNode2 = this.overscrollNode;
        if (delegatableNode2 != null) {
            undelegate(delegatableNode2);
        }
        this.overscrollNode = delegatableNode;
        attachIfNeeded();
    }
}
