package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.CompositeShaderBrush;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.ShaderKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DropShadowRenderer extends ShadowRenderer {
    public static final int $stable = 8;
    private CompositeShaderBrush compositeShader;
    private final Paint paint;
    private final Shadow shadow;
    private ImageBitmap shadowBitmap;

    public DropShadowRenderer(Shadow shadow, Outline outline) {
        super(outline);
        this.shadow = shadow;
        this.paint = AndroidPaint_androidKt.Paint();
    }

    /* renamed from: createOuterShadowBitmap-Cqks5Fs, reason: not valid java name */
    private final ImageBitmap m5471createOuterShadowBitmapCqks5Fs(long j, Path path, float f, float f2) {
        float f3 = (f2 * 2.0f) + (f * 2.0f);
        ImageBitmap m4997ImageBitmapx__hDU$default = ImageBitmapKt.m4997ImageBitmapx__hDU$default((int) Math.ceil(Float.intBitsToFloat((int) (j >> 32)) + f3), (int) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L)) + f3), ImageBitmapConfig.Companion.m4991getAlpha8_sVssgQ(), false, null, 24, null);
        Canvas Canvas = CanvasKt.Canvas(m4997ImageBitmapx__hDU$default);
        if (f2 <= 0.0f) {
            BlurKt.m5470configureShadowFoewPVk$default(this.paint, 0L, 0, f > 0.0f ? Blur_androidKt.BlurFilter(f) : null, 0, 11, null);
            Canvas.translate(f, f);
            Canvas.drawPath(path, this.paint);
            return m4997ImageBitmapx__hDU$default;
        }
        float f4 = f + f2;
        Canvas.translate(f4, f4);
        Canvas.drawPath(path, BlurKt.m5470configureShadowFoewPVk$default(this.paint, 0L, 0, f > 0.0f ? Blur_androidKt.BlurFilter(f) : null, 0, 11, null));
        Paint m5470configureShadowFoewPVk$default = BlurKt.m5470configureShadowFoewPVk$default(this.paint, 0L, 0, f > 0.0f ? Blur_androidKt.BlurFilter(f) : null, PaintingStyle.Companion.m5043getStrokeTiuSbCo(), 3, null);
        m5470configureShadowFoewPVk$default.setStrokeWidth(f2 * 2.0f);
        Canvas.drawPath(path, m5470configureShadowFoewPVk$default);
        return m4997ImageBitmapx__hDU$default;
    }

    /* renamed from: createOuterShadowBitmap-D_oqF2M, reason: not valid java name */
    private final ImageBitmap m5472createOuterShadowBitmapD_oqF2M(long j, float f, float f2, long j2) {
        float f3 = (2.0f * f2) + (f * 2.0f);
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + f3;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + f3;
        ImageBitmap m4997ImageBitmapx__hDU$default = ImageBitmapKt.m4997ImageBitmapx__hDU$default((int) Math.ceil(intBitsToFloat), (int) Math.ceil(intBitsToFloat2), ImageBitmapConfig.Companion.m4991getAlpha8_sVssgQ(), false, null, 24, null);
        CanvasKt.Canvas(m4997ImageBitmapx__hDU$default).drawRoundRect(f, f, intBitsToFloat - f, intBitsToFloat2 - f, Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), BlurKt.m5470configureShadowFoewPVk$default(this.paint, 0L, 0, f > 0.0f ? Blur_androidKt.BlurFilter(f) : null, 0, 11, null));
        return m4997ImageBitmapx__hDU$default;
    }

    private final Brush obtainCompositeBrush(ImageBitmap imageBitmap, Brush brush) {
        CompositeShaderBrush compositeShaderBrush = this.compositeShader;
        if (compositeShaderBrush != null && q10.b(compositeShaderBrush.getSrcBrush(), brush)) {
            return compositeShaderBrush;
        }
        Brush.Companion companion = Brush.Companion;
        ShaderBrush ShaderBrush = BrushKt.ShaderBrush(ShaderKt.m5094ImageShaderF49vj9s$default(imageBitmap, 0, 0, 6, null));
        if (brush instanceof ShaderBrush) {
            float width = imageBitmap.getWidth();
            float height = imageBitmap.getHeight();
            brush = BrushKt.ShaderBrush(((ShaderBrush) brush).mo4730createShaderuvyYCjk(Size.m4576constructorimpl((Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L))));
        }
        Brush m4718composite7EN7VTw = companion.m4718composite7EN7VTw(ShaderBrush, brush, BlendMode.Companion.m4699getSrcIn0nO6VwU());
        m4718composite7EN7VTw.getClass();
        CompositeShaderBrush compositeShaderBrush2 = (CompositeShaderBrush) m4718composite7EN7VTw;
        this.compositeShader = compositeShaderBrush2;
        return compositeShaderBrush2;
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowRenderer
    /* renamed from: buildShadow-_SMYjrA, reason: not valid java name */
    public void mo5473buildShadow_SMYjrA(DrawScope drawScope, long j, long j2, Path path) {
        DropShadowRenderer dropShadowRenderer;
        ImageBitmap m5472createOuterShadowBitmapD_oqF2M;
        float mo367toPx0680j_4 = drawScope.mo367toPx0680j_4(this.shadow.m5481getRadiusD9Ej5fM());
        float mo367toPx0680j_42 = drawScope.mo367toPx0680j_4(this.shadow.m5482getSpreadD9Ej5fM());
        if (path != null) {
            dropShadowRenderer = this;
            m5472createOuterShadowBitmapD_oqF2M = dropShadowRenderer.m5471createOuterShadowBitmapCqks5Fs(j, path, mo367toPx0680j_4, mo367toPx0680j_42);
        } else {
            dropShadowRenderer = this;
            m5472createOuterShadowBitmapD_oqF2M = m5472createOuterShadowBitmapD_oqF2M(j, mo367toPx0680j_4, mo367toPx0680j_42, j2);
        }
        dropShadowRenderer.shadowBitmap = m5472createOuterShadowBitmapD_oqF2M;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowRenderer
    /* renamed from: onDrawShadow-MLmccfk, reason: not valid java name */
    public void mo5474onDrawShadowMLmccfk(DrawScope drawScope, long j, long j2, Path path, float f, ColorFilter colorFilter, Brush brush, int i) {
        ImageBitmap imageBitmap = this.shadowBitmap;
        if (imageBitmap != null) {
            float f2 = -(drawScope.mo367toPx0680j_4(this.shadow.m5482getSpreadD9Ej5fM()) + drawScope.mo367toPx0680j_4(this.shadow.m5481getRadiusD9Ej5fM()));
            if (brush == null || colorFilter != null) {
                DrawScope.m5319drawImagegbVJVH8$default(drawScope, imageBitmap, Offset.m4508constructorimpl((Float.floatToRawIntBits(f2) << 32) | (4294967295L & Float.floatToRawIntBits(f2))), f, null, colorFilter, i, 8, null);
                return;
            }
            Brush obtainCompositeBrush = obtainCompositeBrush(imageBitmap, brush);
            drawScope.getDrawContext().getTransform().translate(f2, f2);
            try {
                float width = imageBitmap.getWidth();
                float height = imageBitmap.getHeight();
                DrawScope.m5328drawRectAsUm42w$default(drawScope, obtainCompositeBrush, 0L, Size.m4576constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)), f, null, null, i, 50, null);
            } finally {
                float f3 = -f2;
                drawScope.getDrawContext().getTransform().translate(f3, f3);
            }
        }
    }
}
