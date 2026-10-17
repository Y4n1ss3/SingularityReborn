package androidx.compose.ui.node;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1 extends f30 implements iy {
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1(NodeCoordinator nodeCoordinator) {
        super(0);
        this.this$0 = nodeCoordinator;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6565invoke() {
        Canvas canvas;
        GraphicsLayer graphicsLayer;
        NodeCoordinator nodeCoordinator = this.this$0;
        canvas = nodeCoordinator.drawBlockCanvas;
        canvas.getClass();
        graphicsLayer = this.this$0.drawBlockParentLayer;
        nodeCoordinator.drawContainedDrawModifiers(canvas, graphicsLayer);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6565invoke();
        return w01.a;
    }
}
