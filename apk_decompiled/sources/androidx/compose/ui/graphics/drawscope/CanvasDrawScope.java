package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.er;
import defpackage.ky;
import defpackage.o;
import defpackage.q10;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CanvasDrawScope implements DrawScope {
    public static final int $stable = 0;
    private Paint fillPaint;
    private Paint strokePaint;
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);
    private final DrawContext drawContext = new DrawContext() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1
        private GraphicsLayer graphicsLayer;
        private final DrawTransform transform;

        {
            DrawTransform asDrawTransform;
            asDrawTransform = CanvasDrawScopeKt.asDrawTransform(this);
            this.transform = asDrawTransform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public Canvas getCanvas() {
            return CanvasDrawScope.this.getDrawParams().getCanvas();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public Density getDensity() {
            return CanvasDrawScope.this.getDrawParams().getDensity();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public GraphicsLayer getGraphicsLayer() {
            return this.graphicsLayer;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public LayoutDirection getLayoutDirection() {
            return CanvasDrawScope.this.getDrawParams().getLayoutDirection();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public long mo5256getSizeNHjbRc() {
            return CanvasDrawScope.this.getDrawParams().m5254getSizeNHjbRc();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public DrawTransform getTransform() {
            return this.transform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setCanvas(Canvas canvas) {
            CanvasDrawScope.this.getDrawParams().setCanvas(canvas);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setDensity(Density density) {
            CanvasDrawScope.this.getDrawParams().setDensity(density);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setGraphicsLayer(GraphicsLayer graphicsLayer) {
            this.graphicsLayer = graphicsLayer;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setLayoutDirection(LayoutDirection layoutDirection) {
            CanvasDrawScope.this.getDrawParams().setLayoutDirection(layoutDirection);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public void mo5257setSizeuvyYCjk(long j) {
            CanvasDrawScope.this.getDrawParams().m5255setSizeuvyYCjk(j);
        }
    };

    /* renamed from: configurePaint-2qPWKa0, reason: not valid java name */
    private final Paint m5222configurePaint2qPWKa0(long j, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2) {
        Paint selectPaint = selectPaint(drawStyle);
        long m5230modulate5vOe2sY = m5230modulate5vOe2sY(j, f);
        if (!Color.m4762equalsimpl0(selectPaint.mo4631getColor0d7_KjU(), m5230modulate5vOe2sY)) {
            selectPaint.mo4637setColor8_81llA(m5230modulate5vOe2sY);
        }
        if (selectPaint.getShader() != null) {
            selectPaint.setShader(null);
        }
        if (!q10.b(selectPaint.getColorFilter(), colorFilter)) {
            selectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m4670equalsimpl0(selectPaint.mo4630getBlendMode0nO6VwU(), i)) {
            selectPaint.mo4636setBlendModes9anfk8(i);
        }
        if (!FilterQuality.m4856equalsimpl0(selectPaint.mo4632getFilterQualityfv9h1I(), i2)) {
            selectPaint.mo4638setFilterQualityvDHp3xo(i2);
        }
        return selectPaint;
    }

    /* renamed from: configurePaint-2qPWKa0$default, reason: not valid java name */
    public static /* synthetic */ Paint m5223configurePaint2qPWKa0$default(CanvasDrawScope canvasDrawScope, long j, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        return canvasDrawScope.m5222configurePaint2qPWKa0(j, drawStyle, f, colorFilter, i, (i3 & 32) != 0 ? DrawScope.Companion.m5338getDefaultFilterQualityfv9h1I() : i2);
    }

    /* renamed from: configurePaint-swdJneE, reason: not valid java name */
    private final Paint m5224configurePaintswdJneE(Brush brush, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2) {
        Paint selectPaint = selectPaint(drawStyle);
        if (brush != null) {
            brush.mo4706applyToPq9zytI(mo5335getSizeNHjbRc(), selectPaint, f);
        } else {
            if (selectPaint.getShader() != null) {
                selectPaint.setShader(null);
            }
            long mo4631getColor0d7_KjU = selectPaint.mo4631getColor0d7_KjU();
            Color.Companion companion = Color.Companion;
            if (!Color.m4762equalsimpl0(mo4631getColor0d7_KjU, companion.m4787getBlack0d7_KjU())) {
                selectPaint.mo4637setColor8_81llA(companion.m4787getBlack0d7_KjU());
            }
            if (selectPaint.getAlpha() != f) {
                selectPaint.setAlpha(f);
            }
        }
        if (!q10.b(selectPaint.getColorFilter(), colorFilter)) {
            selectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m4670equalsimpl0(selectPaint.mo4630getBlendMode0nO6VwU(), i)) {
            selectPaint.mo4636setBlendModes9anfk8(i);
        }
        if (!FilterQuality.m4856equalsimpl0(selectPaint.mo4632getFilterQualityfv9h1I(), i2)) {
            selectPaint.mo4638setFilterQualityvDHp3xo(i2);
        }
        return selectPaint;
    }

    /* renamed from: configurePaint-swdJneE$default, reason: not valid java name */
    public static /* synthetic */ Paint m5225configurePaintswdJneE$default(CanvasDrawScope canvasDrawScope, Brush brush, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = DrawScope.Companion.m5338getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m5224configurePaintswdJneE(brush, drawStyle, f, colorFilter, i, i2);
    }

    /* renamed from: configureStrokePaint-Q_0CZUI, reason: not valid java name */
    private final Paint m5226configureStrokePaintQ_0CZUI(long j, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4) {
        Paint obtainStrokePaint = obtainStrokePaint();
        long m5230modulate5vOe2sY = m5230modulate5vOe2sY(j, f3);
        if (!Color.m4762equalsimpl0(obtainStrokePaint.mo4631getColor0d7_KjU(), m5230modulate5vOe2sY)) {
            obtainStrokePaint.mo4637setColor8_81llA(m5230modulate5vOe2sY);
        }
        if (obtainStrokePaint.getShader() != null) {
            obtainStrokePaint.setShader(null);
        }
        if (!q10.b(obtainStrokePaint.getColorFilter(), colorFilter)) {
            obtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m4670equalsimpl0(obtainStrokePaint.mo4630getBlendMode0nO6VwU(), i3)) {
            obtainStrokePaint.mo4636setBlendModes9anfk8(i3);
        }
        if (obtainStrokePaint.getStrokeWidth() != f) {
            obtainStrokePaint.setStrokeWidth(f);
        }
        if (obtainStrokePaint.getStrokeMiterLimit() != f2) {
            obtainStrokePaint.setStrokeMiterLimit(f2);
        }
        if (!StrokeCap.m5131equalsimpl0(obtainStrokePaint.mo4633getStrokeCapKaPHkGw(), i)) {
            obtainStrokePaint.mo4639setStrokeCapBeK7IIE(i);
        }
        if (!StrokeJoin.m5141equalsimpl0(obtainStrokePaint.mo4634getStrokeJoinLxFBmk8(), i2)) {
            obtainStrokePaint.mo4640setStrokeJoinWw9F2mQ(i2);
        }
        if (!q10.b(obtainStrokePaint.getPathEffect(), pathEffect)) {
            obtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m4856equalsimpl0(obtainStrokePaint.mo4632getFilterQualityfv9h1I(), i4)) {
            obtainStrokePaint.mo4638setFilterQualityvDHp3xo(i4);
        }
        return obtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-Q_0CZUI$default, reason: not valid java name */
    public static /* synthetic */ Paint m5227configureStrokePaintQ_0CZUI$default(CanvasDrawScope canvasDrawScope, long j, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, int i5, Object obj) {
        return canvasDrawScope.m5226configureStrokePaintQ_0CZUI(j, f, f2, i, i2, pathEffect, f3, colorFilter, i3, (i5 & Fields.RotationY) != 0 ? DrawScope.Companion.m5338getDefaultFilterQualityfv9h1I() : i4);
    }

    /* renamed from: configureStrokePaint-ho4zsrM, reason: not valid java name */
    private final Paint m5228configureStrokePaintho4zsrM(Brush brush, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4) {
        Paint obtainStrokePaint = obtainStrokePaint();
        if (brush != null) {
            brush.mo4706applyToPq9zytI(mo5335getSizeNHjbRc(), obtainStrokePaint, f3);
        } else if (obtainStrokePaint.getAlpha() != f3) {
            obtainStrokePaint.setAlpha(f3);
        }
        if (!q10.b(obtainStrokePaint.getColorFilter(), colorFilter)) {
            obtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m4670equalsimpl0(obtainStrokePaint.mo4630getBlendMode0nO6VwU(), i3)) {
            obtainStrokePaint.mo4636setBlendModes9anfk8(i3);
        }
        if (obtainStrokePaint.getStrokeWidth() != f) {
            obtainStrokePaint.setStrokeWidth(f);
        }
        if (obtainStrokePaint.getStrokeMiterLimit() != f2) {
            obtainStrokePaint.setStrokeMiterLimit(f2);
        }
        if (!StrokeCap.m5131equalsimpl0(obtainStrokePaint.mo4633getStrokeCapKaPHkGw(), i)) {
            obtainStrokePaint.mo4639setStrokeCapBeK7IIE(i);
        }
        if (!StrokeJoin.m5141equalsimpl0(obtainStrokePaint.mo4634getStrokeJoinLxFBmk8(), i2)) {
            obtainStrokePaint.mo4640setStrokeJoinWw9F2mQ(i2);
        }
        if (!q10.b(obtainStrokePaint.getPathEffect(), pathEffect)) {
            obtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m4856equalsimpl0(obtainStrokePaint.mo4632getFilterQualityfv9h1I(), i4)) {
            obtainStrokePaint.mo4638setFilterQualityvDHp3xo(i4);
        }
        return obtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-ho4zsrM$default, reason: not valid java name */
    public static /* synthetic */ Paint m5229configureStrokePaintho4zsrM$default(CanvasDrawScope canvasDrawScope, Brush brush, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, int i5, Object obj) {
        return canvasDrawScope.m5228configureStrokePaintho4zsrM(brush, f, f2, i, i2, pathEffect, f3, colorFilter, i3, (i5 & Fields.RotationY) != 0 ? DrawScope.Companion.m5338getDefaultFilterQualityfv9h1I() : i4);
    }

    /* renamed from: modulate-5vOe2sY, reason: not valid java name */
    private final long m5230modulate5vOe2sY(long j, float f) {
        return f == 1.0f ? j : Color.m4760copywmQWz5c$default(j, Color.m4763getAlphaimpl(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final Paint obtainFillPaint() {
        Paint paint = this.fillPaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo4641setStylek9PVt8s(PaintingStyle.Companion.m5042getFillTiuSbCo());
        this.fillPaint = Paint;
        return Paint;
    }

    private final Paint obtainStrokePaint() {
        Paint paint = this.strokePaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo4641setStylek9PVt8s(PaintingStyle.Companion.m5043getStrokeTiuSbCo());
        this.strokePaint = Paint;
        return Paint;
    }

    private final Paint selectPaint(DrawStyle drawStyle) {
        if (q10.b(drawStyle, Fill.INSTANCE)) {
            return obtainFillPaint();
        }
        if (!(drawStyle instanceof Stroke)) {
            o.n();
            return null;
        }
        Paint obtainStrokePaint = obtainStrokePaint();
        Stroke stroke = (Stroke) drawStyle;
        if (obtainStrokePaint.getStrokeWidth() != stroke.getWidth()) {
            obtainStrokePaint.setStrokeWidth(stroke.getWidth());
        }
        if (!StrokeCap.m5131equalsimpl0(obtainStrokePaint.mo4633getStrokeCapKaPHkGw(), stroke.m5404getCapKaPHkGw())) {
            obtainStrokePaint.mo4639setStrokeCapBeK7IIE(stroke.m5404getCapKaPHkGw());
        }
        if (obtainStrokePaint.getStrokeMiterLimit() != stroke.getMiter()) {
            obtainStrokePaint.setStrokeMiterLimit(stroke.getMiter());
        }
        if (!StrokeJoin.m5141equalsimpl0(obtainStrokePaint.mo4634getStrokeJoinLxFBmk8(), stroke.m5405getJoinLxFBmk8())) {
            obtainStrokePaint.mo4640setStrokeJoinWw9F2mQ(stroke.m5405getJoinLxFBmk8());
        }
        if (!q10.b(obtainStrokePaint.getPathEffect(), stroke.getPathEffect())) {
            obtainStrokePaint.setPathEffect(stroke.getPathEffect());
        }
        return obtainStrokePaint;
    }

    /* renamed from: draw-yzxVdVo, reason: not valid java name */
    public final void m5231drawyzxVdVo(Density density, LayoutDirection layoutDirection, Canvas canvas, long j, ky kyVar) {
        DrawParams drawParams = getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m5252component4NHjbRc = drawParams.m5252component4NHjbRc();
        DrawParams drawParams2 = getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m5255setSizeuvyYCjk(j);
        canvas.save();
        kyVar.invoke(this);
        canvas.restore();
        DrawParams drawParams3 = getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m5255setSizeuvyYCjk(m5252component4NHjbRc);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I, reason: not valid java name */
    public void mo5232drawArcillE91I(Brush brush, float f, float f2, boolean z, long j, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.drawParams.getCanvas().drawArc(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), f, f2, z, m5225configurePaintswdJneE$default(this, brush, drawStyle, f3, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo, reason: not valid java name */
    public void mo5233drawArcyD3GUKo(long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.drawParams.getCanvas().drawArc(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), f, f2, z, m5223configurePaint2qPWKa0$default(this, j, drawStyle, f3, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw, reason: not valid java name */
    public void mo5234drawCircleV9BoPsw(Brush brush, float f, long j, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.drawParams.getCanvas().mo4613drawCircle9KIMszo(j, f, m5225configurePaintswdJneE$default(this, brush, drawStyle, f2, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg, reason: not valid java name */
    public void mo5235drawCircleVaOC9Bg(long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.drawParams.getCanvas().mo4613drawCircle9KIMszo(j2, f, m5223configurePaint2qPWKa0$default(this, j, drawStyle, f2, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @er
    /* renamed from: drawImage-9jGpkUE, reason: not valid java name */
    public /* synthetic */ void mo5236drawImage9jGpkUE(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.drawParams.getCanvas().mo4615drawImageRectHPBpro0(imageBitmap, j, j2, j3, j4, m5225configurePaintswdJneE$default(this, null, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
    public void mo5237drawImageAZ2fEMs(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        this.drawParams.getCanvas().mo4615drawImageRectHPBpro0(imageBitmap, j, j2, j3, j4, m5224configurePaintswdJneE(null, drawStyle, f, colorFilter, i, i2));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8, reason: not valid java name */
    public void mo5238drawImagegbVJVH8(ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.drawParams.getCanvas().mo4614drawImaged4ec7I(imageBitmap, j, m5225configurePaintswdJneE$default(this, null, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc, reason: not valid java name */
    public void mo5239drawLine1RTmtNc(Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().mo4616drawLineWko1d7g(j, j2, m5229configureStrokePaintho4zsrM$default(this, brush, f, 4.0f, i, StrokeJoin.Companion.m5146getMiterLxFBmk8(), pathEffect, f2, colorFilter, i2, 0, Fields.RotationY, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0, reason: not valid java name */
    public void mo5240drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().mo4616drawLineWko1d7g(j2, j3, m5227configureStrokePaintQ_0CZUI$default(this, j, f, 4.0f, i, StrokeJoin.Companion.m5146getMiterLxFBmk8(), pathEffect, f2, colorFilter, i2, 0, Fields.RotationY, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w, reason: not valid java name */
    public void mo5241drawOvalAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.drawParams.getCanvas().drawOval(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), m5225configurePaintswdJneE$default(this, brush, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0, reason: not valid java name */
    public void mo5242drawOvalnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.drawParams.getCanvas().drawOval(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), m5223configurePaint2qPWKa0$default(this, j, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU, reason: not valid java name */
    public void mo5243drawPathGBMwjPU(Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.drawParams.getCanvas().drawPath(path, m5225configurePaintswdJneE$default(this, brush, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI, reason: not valid java name */
    public void mo5244drawPathLG529CI(Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.drawParams.getCanvas().drawPath(path, m5223configurePaint2qPWKa0$default(this, j, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8, reason: not valid java name */
    public void mo5245drawPointsF8ZwMP8(List<Offset> list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3) {
        this.drawParams.getCanvas().mo4617drawPointsO7TthRY(i, list, m5227configureStrokePaintQ_0CZUI$default(this, j, f, 4.0f, i2, StrokeJoin.Companion.m5146getMiterLxFBmk8(), pathEffect, f2, colorFilter, i3, 0, Fields.RotationY, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws, reason: not valid java name */
    public void mo5246drawPointsGsft0Ws(List<Offset> list, int i, Brush brush, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3) {
        this.drawParams.getCanvas().mo4617drawPointsO7TthRY(i, list, m5229configureStrokePaintho4zsrM$default(this, brush, f, 4.0f, i2, StrokeJoin.Companion.m5146getMiterLxFBmk8(), pathEffect, f2, colorFilter, i3, 0, Fields.RotationY, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w, reason: not valid java name */
    public void mo5247drawRectAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.drawParams.getCanvas().drawRect(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), m5225configurePaintswdJneE$default(this, brush, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0, reason: not valid java name */
    public void mo5248drawRectnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.drawParams.getCanvas().drawRect(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), m5223configurePaint2qPWKa0$default(this, j, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ, reason: not valid java name */
    public void mo5249drawRoundRectZuiqVtQ(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.drawParams.getCanvas().drawRoundRect(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), m5225configurePaintswdJneE$default(this, brush, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA, reason: not valid java name */
    public void mo5250drawRoundRectuAw5IA(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.drawParams.getCanvas().drawRoundRect(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), m5223configurePaint2qPWKa0$default(this, j, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.drawParams.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.drawContext;
    }

    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.drawParams.getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }

    public static /* synthetic */ void getDrawParams$annotations() {
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DrawParams {
        public static final int $stable = 8;
        private Canvas canvas;
        private Density density;
        private LayoutDirection layoutDirection;
        private long size;

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j, int i, dq dqVar) {
            this((i & 1) != 0 ? DrawContextKt.getDefaultDensity() : density, (i & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i & 4) != 0 ? EmptyCanvas.INSTANCE : canvas, (i & 8) != 0 ? Size.Companion.m4594getZeroNHjbRc() : j, null);
        }

        /* renamed from: copy-Ug5Nnss$default, reason: not valid java name */
        public static /* synthetic */ DrawParams m5251copyUg5Nnss$default(DrawParams drawParams, Density density, LayoutDirection layoutDirection, Canvas canvas, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                density = drawParams.density;
            }
            if ((i & 2) != 0) {
                layoutDirection = drawParams.layoutDirection;
            }
            if ((i & 4) != 0) {
                canvas = drawParams.canvas;
            }
            if ((i & 8) != 0) {
                j = drawParams.size;
            }
            Canvas canvas2 = canvas;
            return drawParams.m5253copyUg5Nnss(density, layoutDirection, canvas2, j);
        }

        public final Density component1() {
            return this.density;
        }

        public final LayoutDirection component2() {
            return this.layoutDirection;
        }

        public final Canvas component3() {
            return this.canvas;
        }

        /* renamed from: component4-NH-jbRc, reason: not valid java name */
        public final long m5252component4NHjbRc() {
            return this.size;
        }

        /* renamed from: copy-Ug5Nnss, reason: not valid java name */
        public final DrawParams m5253copyUg5Nnss(Density density, LayoutDirection layoutDirection, Canvas canvas, long j) {
            return new DrawParams(density, layoutDirection, canvas, j, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) obj;
            return q10.b(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && q10.b(this.canvas, drawParams.canvas) && Size.m4581equalsimpl0(this.size, drawParams.size);
        }

        public final Canvas getCanvas() {
            return this.canvas;
        }

        public final Density getDensity() {
            return this.density;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m5254getSizeNHjbRc() {
            return this.size;
        }

        public int hashCode() {
            return Size.m4586hashCodeimpl(this.size) + ((this.canvas.hashCode() + ((this.layoutDirection.hashCode() + (this.density.hashCode() * 31)) * 31)) * 31);
        }

        public final void setCanvas(Canvas canvas) {
            this.canvas = canvas;
        }

        public final void setDensity(Density density) {
            this.density = density;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m5255setSizeuvyYCjk(long j) {
            this.size = j;
        }

        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) Size.m4589toStringimpl(this.size)) + ')';
        }

        private DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.canvas = canvas;
            this.size = j;
        }

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j, dq dqVar) {
            this(density, layoutDirection, canvas, j);
        }
    }
}
