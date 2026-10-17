package androidx.compose.ui.node;

import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutModifierNodeKt {
    public static final void invalidateLayer(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.m6414requireCoordinator64DMado(layoutModifierNode, NodeKind.m6573constructorimpl(2)).invalidateLayer();
    }

    public static final void invalidateMeasurement(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).invalidateMeasurements$ui();
    }

    public static final void invalidatePlacement(LayoutModifierNode layoutModifierNode) {
        LayoutNode.requestRelayout$ui$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, 1, null);
    }

    public static final void remeasureSync(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).forceRemeasure();
    }

    public static final void requestRemeasure(LayoutModifierNode layoutModifierNode) {
        LayoutNode.requestRemeasure$ui$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, false, false, 7, null);
    }

    public static final void updateLayerBlock(LayoutModifierNode layoutModifierNode, ky kyVar) {
        NodeCoordinator wrapped$ui;
        if (layoutModifierNode.getNode().isAttached() && (wrapped$ui = DelegatableNodeKt.m6414requireCoordinator64DMado(layoutModifierNode, NodeKind.m6573constructorimpl(2)).getWrapped$ui()) != null) {
            wrapped$ui.updateLayerBlock(kyVar, true);
        }
    }
}
