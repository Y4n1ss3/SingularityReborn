package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface DrawContext {
    default Canvas getCanvas() {
        return EmptyCanvas.INSTANCE;
    }

    default Density getDensity() {
        return DrawContextKt.getDefaultDensity();
    }

    default GraphicsLayer getGraphicsLayer() {
        return null;
    }

    default LayoutDirection getLayoutDirection() {
        return LayoutDirection.Ltr;
    }

    /* renamed from: getSize-NH-jbRc */
    long mo5256getSizeNHjbRc();

    DrawTransform getTransform();

    /* renamed from: setSize-uvyYCjk */
    void mo5257setSizeuvyYCjk(long j);

    default void setCanvas(Canvas canvas) {
    }

    default void setDensity(Density density) {
    }

    default void setGraphicsLayer(GraphicsLayer graphicsLayer) {
    }

    default void setLayoutDirection(LayoutDirection layoutDirection) {
    }
}
