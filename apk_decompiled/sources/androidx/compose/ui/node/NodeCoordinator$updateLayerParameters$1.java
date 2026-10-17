package androidx.compose.ui.node;

import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NodeCoordinator$updateLayerParameters$1 extends f30 implements iy {
    final /* synthetic */ ky $layerBlock;
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$updateLayerParameters$1(ky kyVar, NodeCoordinator nodeCoordinator) {
        super(0);
        this.$layerBlock = kyVar;
        this.this$0 = nodeCoordinator;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6569invoke() {
        ReusableGraphicsLayerScope reusableGraphicsLayerScope;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope2;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope3;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope4;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope5;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope6;
        ky kyVar = this.$layerBlock;
        reusableGraphicsLayerScope = NodeCoordinator.graphicsLayerScope;
        kyVar.invoke(reusableGraphicsLayerScope);
        Shape lastShape$ui = this.this$0.getLastShape$ui();
        reusableGraphicsLayerScope2 = NodeCoordinator.graphicsLayerScope;
        boolean b = q10.b(lastShape$ui, reusableGraphicsLayerScope2.getShape());
        boolean lastClip$ui = this.this$0.getLastClip$ui();
        reusableGraphicsLayerScope3 = NodeCoordinator.graphicsLayerScope;
        boolean z = lastClip$ui != reusableGraphicsLayerScope3.getClip();
        if (!b || z) {
            NodeCoordinator nodeCoordinator = this.this$0;
            reusableGraphicsLayerScope4 = NodeCoordinator.graphicsLayerScope;
            nodeCoordinator.setLastShape$ui(reusableGraphicsLayerScope4.getShape());
            NodeCoordinator nodeCoordinator2 = this.this$0;
            reusableGraphicsLayerScope5 = NodeCoordinator.graphicsLayerScope;
            nodeCoordinator2.setLastClip$ui(reusableGraphicsLayerScope5.getClip());
            if (this.this$0.getWasLayerBlockInvoked$ui() && (z || (this.this$0.getLastClip$ui() && !b))) {
                this.this$0.getLayoutNode().invalidateSemantics$ui();
            }
        }
        this.this$0.setWasLayerBlockInvoked$ui(true);
        reusableGraphicsLayerScope6 = NodeCoordinator.graphicsLayerScope;
        reusableGraphicsLayerScope6.updateOutline$ui();
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6569invoke();
        return w01.a;
    }
}
