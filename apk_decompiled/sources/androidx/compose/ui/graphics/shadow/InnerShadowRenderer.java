package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
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
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.ShaderKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.DpOffset;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InnerShadowRenderer extends ShadowRenderer {
    public static final int $stable = 8;
    private CompositeShaderBrush compositeShader;
    private float[] matrix;
    private final Paint paint;
    private final Shadow shadow;
    private ShaderBrush shadowMask;

    public InnerShadowRenderer(Shadow shadow, Outline outline) {
        super(outline);
        this.shadow = shadow;
        this.paint = AndroidPaint_androidKt.Paint();
    }

    /* renamed from: createInnerPathShadowBrush-LjSzlW0, reason: not valid java name */
    private final ShaderBrush m5475createInnerPathShadowBrushLjSzlW0(long j, Path path, float f, float f2, float f3, float f4) {
        ImageBitmap imageBitmap;
        int ceil = (int) Math.ceil(Float.intBitsToFloat((int) (j >> 32)));
        int ceil2 = (int) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L)));
        if (f2 > 0.0f) {
            Rect bounds = path.getBounds();
            float right = bounds.getRight() - bounds.getLeft();
            float bottom = bounds.getBottom() - bounds.getTop();
            imageBitmap = ImageBitmapKt.m4997ImageBitmapx__hDU$default((int) Math.ceil(right), (int) Math.ceil(bottom), ImageBitmapConfig.Companion.m4991getAlpha8_sVssgQ(), false, null, 24, null);
            Canvas Canvas = CanvasKt.Canvas(imageBitmap);
            Canvas.drawPath(path, this.paint);
            Canvas.m4733clipRectN_I0leg$default(Canvas, 0.0f, 0.0f, right, bottom, 0, 16, null);
            Paint m5470configureShadowFoewPVk$default = BlurKt.m5470configureShadowFoewPVk$default(this.paint, 0L, BlendMode.Companion.m4674getClear0nO6VwU(), null, PaintingStyle.Companion.m5043getStrokeTiuSbCo(), 5, null);
            m5470configureShadowFoewPVk$default.setStrokeWidth(2.0f * f2);
            Canvas.drawPath(path, m5470configureShadowFoewPVk$default);
        } else {
            imageBitmap = null;
        }
        int ceil3 = ((int) Math.ceil(f)) * 2;
        ImageBitmap m4997ImageBitmapx__hDU$default = ImageBitmapKt.m4997ImageBitmapx__hDU$default(ceil + ceil3, ceil2 + ceil3, ImageBitmapConfig.Companion.m4991getAlpha8_sVssgQ(), false, null, 24, null);
        Canvas Canvas2 = CanvasKt.Canvas(m4997ImageBitmapx__hDU$default);
        if (imageBitmap != null) {
            Canvas2.drawRect(0.0f, 0.0f, m4997ImageBitmapx__hDU$default.getWidth(), m4997ImageBitmapx__hDU$default.getHeight(), BlurKt.m5470configureShadowFoewPVk$default(this.paint, 0L, 0, null, 0, 15, null));
            Canvas2.mo4614drawImaged4ec7I(imageBitmap, Offset.m4508constructorimpl((4294967295L & Float.floatToRawIntBits(f4)) | (Float.floatToRawIntBits(f3) << 32)), BlurKt.m5470configureShadowFoewPVk$default(this.paint, 0L, BlendMode.Companion.m4702getXor0nO6VwU(), f > 0.0f ? Blur_androidKt.BlurFilter(f) : null, 0, 9, null));
            return BrushKt.ShaderBrush(ShaderKt.m5094ImageShaderF49vj9s$default(m4997ImageBitmapx__hDU$default, 0, 0, 6, null));
        }
        Canvas2.save();
        Canvas2.translate(f3, f4);
        Canvas2.drawPath(path, BlurKt.m5470configureShadowFoewPVk$default(this.paint, 0L, 0, f > 0.0f ? Blur_androidKt.BlurFilter(f) : null, 0, 11, null));
        Canvas2.restore();
        Canvas2.drawRect(0.0f, 0.0f, m4997ImageBitmapx__hDU$default.getWidth(), m4997ImageBitmapx__hDU$default.getHeight(), BlurKt.m5470configureShadowFoewPVk$default(this.paint, 0L, BlendMode.Companion.m4702getXor0nO6VwU(), null, 0, 13, null));
        return BrushKt.ShaderBrush(ShaderKt.m5094ImageShaderF49vj9s$default(m4997ImageBitmapx__hDU$default, 0, 0, 6, null));
    }

    /* renamed from: createInnerShadowBrush-u1Psq-8, reason: not valid java name */
    private final ShaderBrush m5476createInnerShadowBrushu1Psq8(long j, float f, float f2, float f3, float f4, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        ImageBitmap m4997ImageBitmapx__hDU$default = ImageBitmapKt.m4997ImageBitmapx__hDU$default((int) Math.ceil(Float.intBitsToFloat(i)), (int) Math.ceil(Float.intBitsToFloat(i2)), ImageBitmapConfig.Companion.m4991getAlpha8_sVssgQ(), false, null, 24, null);
        Canvas Canvas = CanvasKt.Canvas(m4997ImageBitmapx__hDU$default);
        float f5 = f3 + f2;
        float f6 = f4 + f2;
        Canvas.drawRoundRect(f5, f6, Math.max(f5, (Float.intBitsToFloat(i) + f3) - f2), Math.max(f6, (Float.intBitsToFloat(i2) + f4) - f2), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), BlurKt.m5470configureShadowFoewPVk$default(this.paint, 0L, 0, f > 0.0f ? Blur_androidKt.BlurFilter(f) : null, 0, 11, null));
        Canvas.drawRect(0.0f, 0.0f, m4997ImageBitmapx__hDU$default.getWidth(), m4997ImageBitmapx__hDU$default.getHeight(), BlurKt.m5470configureShadowFoewPVk$default(this.paint, 0L, BlendMode.Companion.m4702getXor0nO6VwU(), null, 0, 13, null));
        return BrushKt.ShaderBrush(ShaderKt.m5094ImageShaderF49vj9s$default(m4997ImageBitmapx__hDU$default, 0, 0, 6, null));
    }

    private final CompositeShaderBrush obtainCompositeBrush(ShaderBrush shaderBrush, Brush brush) {
        CompositeShaderBrush compositeShaderBrush = this.compositeShader;
        if (compositeShaderBrush != null && q10.b(compositeShaderBrush.getSrcBrush(), brush)) {
            return compositeShaderBrush;
        }
        CompositeShaderBrush compositeShaderBrush2 = new CompositeShaderBrush(BrushKt.toShaderBrush(shaderBrush), BrushKt.toShaderBrush(brush), BlendMode.Companion.m4699getSrcIn0nO6VwU(), null);
        this.compositeShader = compositeShaderBrush2;
        return compositeShaderBrush2;
    }

    /* renamed from: obtainMatrix-sQKQjiQ, reason: not valid java name */
    private final float[] m5477obtainMatrixsQKQjiQ() {
        float[] fArr = this.matrix;
        if (fArr != null) {
            return fArr;
        }
        float[] m5005constructorimpl$default = Matrix.m5005constructorimpl$default(null, 1, null);
        this.matrix = m5005constructorimpl$default;
        return m5005constructorimpl$default;
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowRenderer
    /* renamed from: buildShadow-_SMYjrA */
    public void mo5473buildShadow_SMYjrA(DrawScope drawScope, long j, long j2, Path path) {
        float mo367toPx0680j_4 = drawScope.mo367toPx0680j_4(this.shadow.m5481getRadiusD9Ej5fM());
        float mo367toPx0680j_42 = drawScope.mo367toPx0680j_4(this.shadow.m5482getSpreadD9Ej5fM());
        float mo367toPx0680j_43 = drawScope.mo367toPx0680j_4(DpOffset.m7672getXD9Ej5fM(this.shadow.m5480getOffsetRKDOV3M()));
        float mo367toPx0680j_44 = drawScope.mo367toPx0680j_4(DpOffset.m7674getYD9Ej5fM(this.shadow.m5480getOffsetRKDOV3M()));
        this.shadowMask = path != null ? m5475createInnerPathShadowBrushLjSzlW0(j, path, mo367toPx0680j_4, mo367toPx0680j_42, mo367toPx0680j_43, mo367toPx0680j_44) : m5476createInnerShadowBrushu1Psq8(j, mo367toPx0680j_4, mo367toPx0680j_42, mo367toPx0680j_43, mo367toPx0680j_44, j2);
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowRenderer
    /* renamed from: onDrawShadow-MLmccfk */
    public void mo5474onDrawShadowMLmccfk(DrawScope drawScope, long j, long j2, Path path, float f, ColorFilter colorFilter, Brush brush, int i) {
        ShaderBrush shaderBrush = this.shadowMask;
        if (shaderBrush != null) {
            if (this.shadow.getBrush() instanceof ShaderBrush) {
                shaderBrush = obtainCompositeBrush(shaderBrush, this.shadow.getBrush());
            }
            ShaderBrush shaderBrush2 = shaderBrush;
            if (path != null) {
                DrawScope.m5324drawPathGBMwjPU$default(drawScope, path, shaderBrush2, f, null, colorFilter, i, 8, null);
            } else if (CornerRadius.m4475equalsimpl0(j2, CornerRadius.Companion.m4488getZerokKHJgLs())) {
                DrawScope.m5328drawRectAsUm42w$default(drawScope, shaderBrush2, 0L, 0L, f, null, colorFilter, i, 22, null);
            } else {
                DrawScope.m5330drawRoundRectZuiqVtQ$default(drawScope, shaderBrush2, 0L, 0L, j2, f, null, colorFilter, this.shadow.m5478getBlendMode0nO6VwU(), 38, null);
            }
        }
    }
}
