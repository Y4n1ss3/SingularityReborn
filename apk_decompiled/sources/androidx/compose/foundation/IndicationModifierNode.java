package androidx.compose.foundation;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class IndicationModifierNode extends DelegatingNode {
    private DelegatableNode indicationNode;

    public IndicationModifierNode(DelegatableNode delegatableNode) {
        this.indicationNode = delegatableNode;
        delegate(delegatableNode);
    }

    public final void update(DelegatableNode delegatableNode) {
        undelegate(this.indicationNode);
        this.indicationNode = delegatableNode;
        delegate(delegatableNode);
    }
}
