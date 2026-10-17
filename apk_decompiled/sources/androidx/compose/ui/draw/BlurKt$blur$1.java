package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.Shape;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BlurKt$blur$1 extends f30 implements ky {
    final /* synthetic */ boolean $clip;
    final /* synthetic */ Shape $edgeTreatment;
    final /* synthetic */ float $radiusX;
    final /* synthetic */ float $radiusY;
    final /* synthetic */ int $tileMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurKt$blur$1(float f, float f2, int i, Shape shape, boolean z) {
        super(1);
        this.$radiusX = f;
        this.$radiusY = f2;
        this.$tileMode = i;
        this.$edgeTreatment = shape;
        this.$clip = z;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        float mo367toPx0680j_4 = graphicsLayerScope.mo367toPx0680j_4(this.$radiusX);
        float mo367toPx0680j_42 = graphicsLayerScope.mo367toPx0680j_4(this.$radiusY);
        graphicsLayerScope.setRenderEffect((mo367toPx0680j_4 <= 0.0f || mo367toPx0680j_42 <= 0.0f) ? null : RenderEffectKt.m5085BlurEffect3YTHUZs(mo367toPx0680j_4, mo367toPx0680j_42, this.$tileMode));
        Shape shape = this.$edgeTreatment;
        if (shape == null) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(this.$clip);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return w01.a;
    }
}
