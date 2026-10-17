package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FrameRateModifierNode extends Modifier.Node implements TraversableNode, DrawModifierNode {
    public static final int $stable = 8;
    private float frameRate;
    private boolean shouldUpdateFrameRates = true;
    private final String traverseKey = "TRAVERSAL_NODE_KEY_FRAME_RATE_MODIFIER_NODE";

    public FrameRateModifierNode(float f) {
        this.frameRate = f;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        OwnedLayer layer;
        if (this.shouldUpdateFrameRates) {
            NodeCoordinator coordinator$ui = getCoordinator$ui();
            if (coordinator$ui != null && (layer = coordinator$ui.getLayer()) != null) {
                layer.setFrameRate(this.frameRate);
            }
            NodeCoordinator coordinator$ui2 = getCoordinator$ui();
            setChildrenLayerFrameRate(coordinator$ui2 != null ? coordinator$ui2.getWrapped$ui() : null, this.frameRate);
            this.shouldUpdateFrameRates = false;
        }
        contentDrawScope.drawContent();
    }

    public final float getFrameRate() {
        return this.frameRate;
    }

    public final boolean getShouldUpdateFrameRates() {
        return this.shouldUpdateFrameRates;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.shouldUpdateFrameRates = true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        FrameRateModifierNode frameRateModifierNode = (FrameRateModifierNode) TraversableNodeKt.findNearestAncestor(this);
        if (frameRateModifierNode != null) {
            NodeCoordinator coordinator$ui = getCoordinator$ui();
            setChildrenLayerFrameRate(coordinator$ui != null ? coordinator$ui.getWrapped$ui() : null, frameRateModifierNode.frameRate);
        } else {
            NodeCoordinator coordinator$ui2 = getCoordinator$ui();
            setChildrenLayerFrameRate(coordinator$ui2 != null ? coordinator$ui2.getWrapped$ui() : null, 0.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setChildrenLayerFrameRate(NodeCoordinator nodeCoordinator, float f) {
        LayoutNode layoutNode;
        List<LayoutNode> children$ui;
        OwnedLayer layer;
        NodeCoordinator nodeCoordinator2 = nodeCoordinator;
        while (true) {
            if (nodeCoordinator2 == null) {
                if (nodeCoordinator == null) {
                    nodeCoordinator = getCoordinator$ui();
                }
                if (nodeCoordinator == null || (layoutNode = nodeCoordinator.getLayoutNode()) == null || (children$ui = layoutNode.getChildren$ui()) == null) {
                    return;
                }
                int size = children$ui.size();
                while (r1 < size) {
                    setChildrenLayerFrameRate(children$ui.get(r1).getOuterCoordinator$ui(), f);
                    r1++;
                }
                return;
            }
            if (nodeCoordinator != null && (layer = nodeCoordinator.getLayer()) != null) {
                if (layer.getFrameRate() != 0.0f && !layer.isFrameRateFromParent()) {
                    return;
                }
                layer.setFrameRate(f);
                layer.setFrameRateFromParent((f == 0.0f ? 1 : 0) ^ 1);
            }
            nodeCoordinator2 = nodeCoordinator2.getWrapped$ui();
        }
    }

    public final void setFrameRate(float f) {
        this.frameRate = f;
    }

    public final void setShouldUpdateFrameRates(boolean z) {
        this.shouldUpdateFrameRates = z;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public String getTraverseKey() {
        return this.traverseKey;
    }
}
