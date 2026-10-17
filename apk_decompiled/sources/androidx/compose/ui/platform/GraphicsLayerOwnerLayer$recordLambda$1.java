package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import defpackage.f30;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class GraphicsLayerOwnerLayer$recordLambda$1 extends f30 implements ky {
    final /* synthetic */ GraphicsLayerOwnerLayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayerOwnerLayer$recordLambda$1(GraphicsLayerOwnerLayer graphicsLayerOwnerLayer) {
        super(1);
        this.this$0 = graphicsLayerOwnerLayer;
    }

    public final void invoke(DrawScope drawScope) {
        my myVar;
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = this.this$0;
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        myVar = graphicsLayerOwnerLayer.drawBlock;
        if (myVar != null) {
            myVar.invoke(canvas, drawScope.getDrawContext().getGraphicsLayer());
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return w01.a;
    }
}
