package androidx.compose.foundation;

import androidx.compose.foundation.BorderModifierNode;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.h;
import defpackage.ji0;
import defpackage.kf0;
import defpackage.ky;
import defpackage.o;
import defpackage.q10;
import defpackage.ve;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BorderModifierNode extends DelegatingNode implements SemanticsModifierNode {
    public static final int $stable = 8;
    private BorderCache borderCache;
    private Brush brush;
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private final boolean isImportantForBounds;
    private Shape shape;
    private final boolean shouldAutoInvalidate;
    private float width;

    private BorderModifierNode(float f, Brush brush, Shape shape) {
        this.width = f;
        this.brush = brush;
        this.shape = shape;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new h(this, 9)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f4, code lost:
    
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m4986equalsimpl(r8, r6 != null ? androidx.compose.ui.graphics.ImageBitmapConfig.m4984boximpl(r6.mo4625getConfig_sVssgQ()) : null) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final DrawResult drawGenericBorder(CacheDrawScope cacheDrawScope, Brush brush, Outline.Generic generic, boolean z, float f) {
        ImageBitmapConfig.Companion companion;
        int m4992getArgb8888_sVssgQ;
        ColorFilter colorFilter;
        ji0 ji0Var;
        ImageBitmap imageBitmap;
        Canvas canvas;
        float f2;
        float f3;
        CanvasDrawScope canvasDrawScope;
        Canvas canvas2;
        ImageBitmap imageBitmap2;
        ColorFilter colorFilter2;
        ji0 ji0Var2;
        DrawContext drawContext;
        long j;
        if (z) {
            return cacheDrawScope.onDrawWithContent(new defpackage.g(8, generic, brush));
        }
        if (brush instanceof SolidColor) {
            companion = ImageBitmapConfig.Companion;
            m4992getArgb8888_sVssgQ = companion.m4991getAlpha8_sVssgQ();
            colorFilter = ColorFilter.Companion.m4802tintxETnrds$default(ColorFilter.Companion, Color.m4760copywmQWz5c$default(((SolidColor) brush).m5117getValue0d7_KjU(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), 0, 2, null);
        } else {
            companion = ImageBitmapConfig.Companion;
            m4992getArgb8888_sVssgQ = companion.m4992getArgb8888_sVssgQ();
            colorFilter = null;
        }
        int i = m4992getArgb8888_sVssgQ;
        Rect bounds = generic.getPath().getBounds();
        BorderCache borderCache = this.borderCache;
        if (borderCache == null) {
            BorderCache borderCache2 = new BorderCache(null, null, null, null, 15, null);
            this.borderCache = borderCache2;
            borderCache = borderCache2;
        }
        Path obtainPath = borderCache.obtainPath();
        obtainPath.reset();
        Path.addRect$default(obtainPath, bounds, null, 2, null);
        obtainPath.mo4650opN5in7k0(obtainPath, generic.getPath(), PathOperation.Companion.m5067getDifferenceb3I0S0c());
        ji0 ji0Var3 = new ji0();
        long m7777constructorimpl = IntSize.m7777constructorimpl((((int) Math.ceil(bounds.getBottom() - bounds.getTop())) & 4294967295L) | (((int) Math.ceil(bounds.getRight() - bounds.getLeft())) << 32));
        BorderCache borderCache3 = this.borderCache;
        borderCache3.getClass();
        ImageBitmap imageBitmap3 = borderCache3.imageBitmap;
        Canvas canvas3 = borderCache3.canvas;
        ImageBitmapConfig m4984boximpl = imageBitmap3 != null ? ImageBitmapConfig.m4984boximpl(imageBitmap3.mo4625getConfig_sVssgQ()) : null;
        boolean z2 = false;
        if (!(m4984boximpl == null ? false : ImageBitmapConfig.m4987equalsimpl0(m4984boximpl.m4990unboximpl(), companion.m4992getArgb8888_sVssgQ()))) {
        }
        z2 = true;
        if (imageBitmap3 == null || canvas3 == null || Float.intBitsToFloat((int) (cacheDrawScope.m4293getSizeNHjbRc() >> 32)) > imageBitmap3.getWidth() || Float.intBitsToFloat((int) (cacheDrawScope.m4293getSizeNHjbRc() & 4294967295L)) > imageBitmap3.getHeight() || !z2) {
            ji0Var = ji0Var3;
            ImageBitmap m4997ImageBitmapx__hDU$default = ImageBitmapKt.m4997ImageBitmapx__hDU$default((int) (m7777constructorimpl >> 32), (int) (m7777constructorimpl & 4294967295L), i, false, null, 24, null);
            borderCache3.imageBitmap = m4997ImageBitmapx__hDU$default;
            Canvas Canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(m4997ImageBitmapx__hDU$default);
            borderCache3.canvas = Canvas;
            imageBitmap = m4997ImageBitmapx__hDU$default;
            canvas = Canvas;
        } else {
            ji0Var = ji0Var3;
            canvas = canvas3;
            imageBitmap = imageBitmap3;
        }
        CanvasDrawScope canvasDrawScope2 = borderCache3.canvasDrawScope;
        if (canvasDrawScope2 == null) {
            canvasDrawScope2 = new CanvasDrawScope();
            borderCache3.canvasDrawScope = canvasDrawScope2;
        }
        CanvasDrawScope canvasDrawScope3 = canvasDrawScope2;
        long m7794toSizeozmzZPI = IntSizeKt.m7794toSizeozmzZPI(m7777constructorimpl);
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope3.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m5252component4NHjbRc = drawParams.m5252component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope3.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m5255setSizeuvyYCjk(m7794toSizeozmzZPI);
        canvas.save();
        long m4787getBlack0d7_KjU = Color.Companion.m4787getBlack0d7_KjU();
        BlendMode.Companion companion2 = BlendMode.Companion;
        DrawScope.m5329drawRectnJ9OG0$default(canvasDrawScope3, m4787getBlack0d7_KjU, 0L, m7794toSizeozmzZPI, 0.0f, null, null, companion2.m4674getClear0nO6VwU(), 58, null);
        float f4 = -bounds.getLeft();
        float f5 = -bounds.getTop();
        canvasDrawScope3.getDrawContext().getTransform().translate(f4, f5);
        try {
            canvas2 = canvas;
            imageBitmap2 = imageBitmap;
            f3 = f5;
            f2 = f4;
            colorFilter2 = colorFilter;
            ji0Var2 = ji0Var;
            canvasDrawScope = canvasDrawScope3;
        } catch (Throwable th) {
            th = th;
            f2 = f4;
            f3 = f5;
            canvasDrawScope = canvasDrawScope3;
        }
        try {
            DrawScope.m5324drawPathGBMwjPU$default(canvasDrawScope, generic.getPath(), brush, 0.0f, new Stroke(f * 2.0f, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
            float intBitsToFloat = (Float.intBitsToFloat((int) (canvasDrawScope.mo5335getSizeNHjbRc() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (canvasDrawScope.mo5335getSizeNHjbRc() >> 32));
            float intBitsToFloat2 = (Float.intBitsToFloat((int) (canvasDrawScope.mo5335getSizeNHjbRc() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (canvasDrawScope.mo5335getSizeNHjbRc() & 4294967295L));
            long mo5334getCenterF1C5BW0 = canvasDrawScope.mo5334getCenterF1C5BW0();
            DrawContext drawContext2 = canvasDrawScope.getDrawContext();
            long mo5256getSizeNHjbRc = drawContext2.mo5256getSizeNHjbRc();
            drawContext2.getCanvas().save();
            try {
                drawContext2.getTransform().mo5263scale0AR0LA0(intBitsToFloat, intBitsToFloat2, mo5334getCenterF1C5BW0);
                j = mo5256getSizeNHjbRc;
                try {
                    DrawScope.m5324drawPathGBMwjPU$default(canvasDrawScope, obtainPath, brush, 0.0f, null, null, companion2.m4674getClear0nO6VwU(), 28, null);
                    drawContext2.getCanvas().restore();
                    drawContext2.mo5257setSizeuvyYCjk(j);
                    canvasDrawScope.getDrawContext().getTransform().translate(-f2, -f3);
                    canvas2.restore();
                    CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
                    drawParams3.setDensity(component1);
                    drawParams3.setLayoutDirection(component2);
                    drawParams3.setCanvas(component3);
                    drawParams3.m5255setSizeuvyYCjk(m5252component4NHjbRc);
                    imageBitmap2.prepareToDraw();
                    ji0Var2.d = imageBitmap2;
                    return cacheDrawScope.onDrawWithContent(new ve(bounds, ji0Var2, m7777constructorimpl, colorFilter2, 0));
                } catch (Throwable th2) {
                    th = th2;
                    drawContext = drawContext2;
                    drawContext.getCanvas().restore();
                    drawContext.mo5257setSizeuvyYCjk(j);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                drawContext = drawContext2;
                j = mo5256getSizeNHjbRc;
            }
        } catch (Throwable th4) {
            th = th4;
            canvasDrawScope.getDrawContext().getTransform().translate(-f2, -f3);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 drawGenericBorder$lambda$0(Outline.Generic generic, Brush brush, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        DrawScope.m5324drawPathGBMwjPU$default(contentDrawScope, generic.getPath(), brush, 0.0f, null, null, 0, 60, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 drawGenericBorder$lambda$3(Rect rect, ji0 ji0Var, long j, ColorFilter colorFilter, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        float left = rect.getLeft();
        float top = rect.getTop();
        contentDrawScope.getDrawContext().getTransform().translate(left, top);
        try {
            DrawScope.m5318drawImageAZ2fEMs$default(contentDrawScope, (ImageBitmap) ji0Var.d, 0L, j, 0L, 0L, 0.0f, null, colorFilter, 0, 0, 890, null);
            contentDrawScope.getDrawContext().getTransform().translate(-left, -top);
            return w01.a;
        } catch (Throwable th) {
            contentDrawScope.getDrawContext().getTransform().translate(-left, -top);
            throw th;
        }
    }

    /* renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    private final DrawResult m243drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, final Brush brush, Outline.Rounded rounded, final long j, final long j2, final boolean z, final float f) {
        Path createRoundRectPath;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long m4566getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m4566getTopLeftCornerRadiuskKHJgLs();
            final float f2 = f / 2.0f;
            final Stroke stroke = new Stroke(f, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new ky() { // from class: ue
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    w01 drawRoundRectBorder_JqoCqck$lambda$0;
                    drawRoundRectBorder_JqoCqck$lambda$0 = BorderModifierNode.drawRoundRectBorder_JqoCqck$lambda$0(z, brush, m4566getTopLeftCornerRadiuskKHJgLs, f2, f, j, j2, stroke, (ContentDrawScope) obj);
                    return drawRoundRectBorder_JqoCqck$lambda$0;
                }
            });
        }
        BorderCache borderCache = this.borderCache;
        if (borderCache == null) {
            BorderCache borderCache2 = new BorderCache(null, null, null, null, 15, null);
            this.borderCache = borderCache2;
            borderCache = borderCache2;
        }
        createRoundRectPath = BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f, z);
        return cacheDrawScope.onDrawWithContent(new defpackage.g(7, createRoundRectPath, brush));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 drawRoundRectBorder_JqoCqck$lambda$0(boolean z, Brush brush, long j, float f, float f2, long j2, long j3, Stroke stroke, ContentDrawScope contentDrawScope) {
        long m242shrinkKibmq7A;
        contentDrawScope.drawContent();
        if (z) {
            DrawScope.m5330drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, j, 0.0f, null, null, 0, 246, null);
        } else if (Float.intBitsToFloat((int) (j >> 32)) < f) {
            float intBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() >> 32)) - f2;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() & 4294967295L)) - f2;
            int m4749getDifferencertfAjoo = ClipOp.Companion.m4749getDifferencertfAjoo();
            DrawContext drawContext = contentDrawScope.getDrawContext();
            long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo5259clipRectN_I0leg(f2, f2, intBitsToFloat, intBitsToFloat2, m4749getDifferencertfAjoo);
                DrawScope.m5330drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, j, 0.0f, null, null, 0, 246, null);
            } finally {
                kf0.g(drawContext, mo5256getSizeNHjbRc);
            }
        } else {
            m242shrinkKibmq7A = BorderKt.m242shrinkKibmq7A(j, f);
            DrawScope.m5330drawRoundRectZuiqVtQ$default(contentDrawScope, brush, j2, j3, m242shrinkKibmq7A, 0.0f, stroke, null, 0, 208, null);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 drawRoundRectBorder_JqoCqck$lambda$1(Path path, Brush brush, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        DrawScope.m5324drawPathGBMwjPU$default(contentDrawScope, path, brush, 0.0f, null, null, 0, 60, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawWithCacheModifierNode$lambda$0(BorderModifierNode borderModifierNode, CacheDrawScope cacheDrawScope) {
        DrawResult drawContentWithoutBorder;
        DrawResult m241drawRectBorderNsqcLGU;
        if (cacheDrawScope.mo367toPx0680j_4(borderModifierNode.width) < 0.0f || Size.m4584getMinDimensionimpl(cacheDrawScope.m4293getSizeNHjbRc()) <= 0.0f) {
            drawContentWithoutBorder = BorderKt.drawContentWithoutBorder(cacheDrawScope);
            return drawContentWithoutBorder;
        }
        float min = Math.min(Dp.m7616equalsimpl0(borderModifierNode.width, Dp.Companion.m7629getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo367toPx0680j_4(borderModifierNode.width)), (float) Math.ceil(Size.m4584getMinDimensionimpl(cacheDrawScope.m4293getSizeNHjbRc()) / 2.0f));
        float f = min / 2.0f;
        long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.m4293getSizeNHjbRc() >> 32)) - min;
        long m4576constructorimpl = Size.m4576constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m4293getSizeNHjbRc() & 4294967295L)) - min) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        boolean z = 2.0f * min > Size.m4584getMinDimensionimpl(cacheDrawScope.m4293getSizeNHjbRc());
        Outline mo283createOutlinePq9zytI = borderModifierNode.shape.mo283createOutlinePq9zytI(cacheDrawScope.m4293getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
        if (mo283createOutlinePq9zytI instanceof Outline.Generic) {
            return borderModifierNode.drawGenericBorder(cacheDrawScope, borderModifierNode.brush, (Outline.Generic) mo283createOutlinePq9zytI, z, min);
        }
        if (mo283createOutlinePq9zytI instanceof Outline.Rounded) {
            return borderModifierNode.m243drawRoundRectBorderJqoCqck(cacheDrawScope, borderModifierNode.brush, (Outline.Rounded) mo283createOutlinePq9zytI, m4508constructorimpl, m4576constructorimpl, z, min);
        }
        if (mo283createOutlinePq9zytI instanceof Outline.Rectangle) {
            m241drawRectBorderNsqcLGU = BorderKt.m241drawRectBorderNsqcLGU(cacheDrawScope, borderModifierNode.brush, m4508constructorimpl, m4576constructorimpl, z, min);
            return m241drawRectBorderNsqcLGU;
        }
        o.n();
        return null;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setShape(semanticsPropertyReceiver, this.shape);
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m244getWidthD9Ej5fM() {
        return this.width;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean isImportantForBounds() {
        return this.isImportantForBounds;
    }

    public final void setBrush(Brush brush) {
        if (q10.b(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final void setShape(Shape shape) {
        if (q10.b(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
        SemanticsModifierNodeKt.invalidateSemantics(this);
    }

    /* renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m245setWidth0680j_4(float f) {
        if (Dp.m7616equalsimpl0(this.width, f)) {
            return;
        }
        this.width = f;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public /* synthetic */ BorderModifierNode(float f, Brush brush, Shape shape, dq dqVar) {
        this(f, brush, shape);
    }
}
