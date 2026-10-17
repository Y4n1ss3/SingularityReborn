package androidx.compose.ui.node;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NodeCoordinator$drawBlock$1 extends f30 implements my {
    final /* synthetic */ iy $drawBlockCallToDrawModifiers;
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$drawBlock$1(NodeCoordinator nodeCoordinator, iy iyVar) {
        super(2);
        this.this$0 = nodeCoordinator;
        this.$drawBlockCallToDrawModifiers = iyVar;
    }

    public final void invoke(Canvas canvas, GraphicsLayer graphicsLayer) {
        OwnerSnapshotObserver snapshotObserver;
        ky kyVar;
        boolean isPlaced = this.this$0.getLayoutNode().isPlaced();
        NodeCoordinator nodeCoordinator = this.this$0;
        if (!isPlaced) {
            nodeCoordinator.lastLayerDrawingWasSkipped = true;
            return;
        }
        nodeCoordinator.drawBlockCanvas = canvas;
        this.this$0.drawBlockParentLayer = graphicsLayer;
        snapshotObserver = this.this$0.getSnapshotObserver();
        NodeCoordinator nodeCoordinator2 = this.this$0;
        kyVar = NodeCoordinator.onCommitAffectingLayer;
        snapshotObserver.observer.observeReads(nodeCoordinator2, kyVar, this.$drawBlockCallToDrawModifiers);
        this.this$0.lastLayerDrawingWasSkipped = false;
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Canvas) obj, (GraphicsLayer) obj2);
        return w01.a;
    }
}
