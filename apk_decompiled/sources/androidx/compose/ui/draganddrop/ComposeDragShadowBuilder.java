package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposeDragShadowBuilder extends View.DragShadowBuilder {
    public static final int $stable = 8;
    private final long decorationSize;
    private final Density density;
    private final ky drawDragDecoration;

    private ComposeDragShadowBuilder(Density density, long j, ky kyVar) {
        this.density = density;
        this.decorationSize = j;
        this.drawDragDecoration = kyVar;
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
        Density density = this.density;
        long j = this.decorationSize;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        androidx.compose.ui.graphics.Canvas Canvas = AndroidCanvas_androidKt.Canvas(canvas);
        ky kyVar = this.drawDragDecoration;
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        androidx.compose.ui.graphics.Canvas component3 = drawParams.component3();
        long m5252component4NHjbRc = drawParams.m5252component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(Canvas);
        drawParams2.m5255setSizeuvyYCjk(j);
        Canvas.save();
        kyVar.invoke(canvasDrawScope);
        Canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m5255setSizeuvyYCjk(m5252component4NHjbRc);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point point, Point point2) {
        Density density = this.density;
        point.set(density.mo361roundToPx0680j_4(density.mo363toDpu2uoSUM(Float.intBitsToFloat((int) (this.decorationSize >> 32)))), density.mo361roundToPx0680j_4(density.mo363toDpu2uoSUM(Float.intBitsToFloat((int) (this.decorationSize & 4294967295L)))));
        point2.set(point.x / 2, point.y / 2);
    }

    public /* synthetic */ ComposeDragShadowBuilder(Density density, long j, ky kyVar, dq dqVar) {
        this(density, j, kyVar);
    }
}
