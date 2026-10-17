package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import defpackage.f30;
import defpackage.kf0;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GraphicsLayer$clipDrawBlock$1 extends f30 implements ky {
    final /* synthetic */ GraphicsLayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayer$clipDrawBlock$1(GraphicsLayer graphicsLayer) {
        super(1);
        this.this$0 = graphicsLayer;
    }

    public final void invoke(DrawScope drawScope) {
        Path path;
        boolean z;
        path = this.this$0.outlinePath;
        z = this.this$0.usePathForClip;
        if (!z || !this.this$0.getClip() || path == null) {
            this.this$0.drawWithChildTracking(drawScope);
            return;
        }
        GraphicsLayer graphicsLayer = this.this$0;
        int m4750getIntersectrtfAjoo = ClipOp.Companion.m4750getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5258clipPathmtrdDE(path, m4750getIntersectrtfAjoo);
            graphicsLayer.drawWithChildTracking(drawScope);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return w01.a;
    }
}
