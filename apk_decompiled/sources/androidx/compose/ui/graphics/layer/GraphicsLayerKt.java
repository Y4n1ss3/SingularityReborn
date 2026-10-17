package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GraphicsLayerKt {
    public static final float DefaultCameraDistance = 8.0f;

    public static final void drawLayer(DrawScope drawScope, GraphicsLayer graphicsLayer) {
        graphicsLayer.draw$ui_graphics(drawScope.getDrawContext().getCanvas(), drawScope.getDrawContext().getGraphicsLayer());
    }

    public static final void setOutline(GraphicsLayer graphicsLayer, Outline outline) {
        if (outline instanceof Outline.Rectangle) {
            Outline.Rectangle rectangle = (Outline.Rectangle) outline;
            float left = rectangle.getRect().getLeft();
            float top = rectangle.getRect().getTop();
            long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top) & 4294967295L));
            Rect rect = rectangle.getRect();
            float right = rect.getRight() - rect.getLeft();
            Rect rect2 = rectangle.getRect();
            float bottom = rect2.getBottom() - rect2.getTop();
            graphicsLayer.m5434setRectOutlinetz77jQw(m4508constructorimpl, Size.m4576constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32)));
            return;
        }
        if (outline instanceof Outline.Generic) {
            graphicsLayer.setPathOutline(((Outline.Generic) outline).getPath());
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            o.n();
            return;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        if (rounded.getRoundRectPath$ui_graphics() != null) {
            graphicsLayer.setPathOutline(rounded.getRoundRectPath$ui_graphics());
            return;
        }
        RoundRect roundRect = rounded.getRoundRect();
        float left2 = roundRect.getLeft();
        float top2 = roundRect.getTop();
        long m4508constructorimpl2 = Offset.m4508constructorimpl((Float.floatToRawIntBits(left2) << 32) | (Float.floatToRawIntBits(top2) & 4294967295L));
        float width = roundRect.getWidth();
        float height = roundRect.getHeight();
        graphicsLayer.m5435setRoundRectOutlineTNW_H78(m4508constructorimpl2, Size.m4576constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)), Float.intBitsToFloat((int) (roundRect.m4564getBottomLeftCornerRadiuskKHJgLs() >> 32)));
    }
}
