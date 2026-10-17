package androidx.compose.ui.node;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LayoutNodeDrawScope$record$1 extends f30 implements ky {
    final /* synthetic */ ky $block;
    final /* synthetic */ DrawModifierNode $currentDrawNode;
    final /* synthetic */ LayoutNodeDrawScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeDrawScope$record$1(LayoutNodeDrawScope layoutNodeDrawScope, DrawModifierNode drawModifierNode, ky kyVar) {
        super(1);
        this.this$0 = layoutNodeDrawScope;
        this.$currentDrawNode = drawModifierNode;
        this.$block = kyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.node.DrawModifierNode] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.node.DrawModifierNode] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.graphics.drawscope.DrawContext] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final void invoke(DrawScope drawScope) {
        ?? r2;
        LayoutNodeDrawScope layoutNodeDrawScope;
        Density density;
        LayoutDirection layoutDirection;
        Canvas canvas;
        long mo5256getSizeNHjbRc;
        GraphicsLayer graphicsLayer;
        ky kyVar;
        Density density2;
        LayoutDirection layoutDirection2;
        Canvas canvas2;
        long mo5256getSizeNHjbRc2;
        GraphicsLayer graphicsLayer2;
        r2 = this.this$0.drawNode;
        this.this$0.drawNode = this.$currentDrawNode;
        try {
            layoutNodeDrawScope = this.this$0;
            density = drawScope.getDrawContext().getDensity();
            layoutDirection = drawScope.getDrawContext().getLayoutDirection();
            canvas = drawScope.getDrawContext().getCanvas();
            mo5256getSizeNHjbRc = drawScope.getDrawContext().mo5256getSizeNHjbRc();
            graphicsLayer = drawScope.getDrawContext().getGraphicsLayer();
            kyVar = this.$block;
            density2 = layoutNodeDrawScope.getDrawContext().getDensity();
            layoutDirection2 = layoutNodeDrawScope.getDrawContext().getLayoutDirection();
            canvas2 = layoutNodeDrawScope.getDrawContext().getCanvas();
            mo5256getSizeNHjbRc2 = layoutNodeDrawScope.getDrawContext().mo5256getSizeNHjbRc();
            graphicsLayer2 = layoutNodeDrawScope.getDrawContext().getGraphicsLayer();
        } catch (Throwable th) {
            th = th;
            this.this$0.drawNode = r2;
            throw th;
        }
        try {
            r2 = layoutNodeDrawScope.getDrawContext();
            r2.setDensity(density);
            r2.setLayoutDirection(layoutDirection);
            r2.setCanvas(canvas);
            r2.mo5257setSizeuvyYCjk(mo5256getSizeNHjbRc);
            r2.setGraphicsLayer(graphicsLayer);
            canvas.save();
            try {
                kyVar.invoke(layoutNodeDrawScope);
                canvas.restore();
                DrawContext drawContext = layoutNodeDrawScope.getDrawContext();
                drawContext.setDensity(density2);
                drawContext.setLayoutDirection(layoutDirection2);
                drawContext.setCanvas(canvas2);
                drawContext.mo5257setSizeuvyYCjk(mo5256getSizeNHjbRc2);
                drawContext.setGraphicsLayer(graphicsLayer2);
                this.this$0.drawNode = r2;
            } finally {
            }
        } catch (Throwable th2) {
            th = th2;
            r2 = r2;
            this.this$0.drawNode = r2;
            throw th;
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return w01.a;
    }
}
