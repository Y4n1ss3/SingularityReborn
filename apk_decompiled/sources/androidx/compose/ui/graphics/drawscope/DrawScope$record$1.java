package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DrawScope$record$1 extends f30 implements ky {
    final /* synthetic */ ky $block;
    final /* synthetic */ DrawScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawScope$record$1(DrawScope drawScope, ky kyVar) {
        super(1);
        this.this$0 = drawScope;
        this.$block = kyVar;
    }

    public final void invoke(DrawScope drawScope) {
        DrawScope drawScope2 = this.this$0;
        Density density = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        long mo5256getSizeNHjbRc = drawScope.getDrawContext().mo5256getSizeNHjbRc();
        GraphicsLayer graphicsLayer = drawScope.getDrawContext().getGraphicsLayer();
        ky kyVar = this.$block;
        Density density2 = drawScope2.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope2.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope2.getDrawContext().getCanvas();
        long mo5256getSizeNHjbRc2 = drawScope2.getDrawContext().mo5256getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope2.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope2.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo5257setSizeuvyYCjk(mo5256getSizeNHjbRc);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            kyVar.invoke(drawScope2);
        } finally {
            canvas.restore();
            DrawContext drawContext2 = drawScope2.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo5257setSizeuvyYCjk(mo5256getSizeNHjbRc2);
            drawContext2.setGraphicsLayer(graphicsLayer2);
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return w01.a;
    }
}
