package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import defpackage.g30;
import defpackage.g40;
import defpackage.q10;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PathComponent extends VNode {
    public static final int $stable = 8;
    private Path _tmpPath;
    private Brush fill;
    private float fillAlpha;
    private boolean isPathDirty;
    private boolean isStrokeDirty;
    private boolean isTrimPathDirty;
    private String name;
    private final Path path;
    private List<? extends PathNode> pathData;
    private int pathFillType;
    private final g30 pathMeasure$delegate;
    private Path renderPath;
    private Brush stroke;
    private float strokeAlpha;
    private int strokeLineCap;
    private int strokeLineJoin;
    private float strokeLineMiter;
    private float strokeLineWidth;
    private Stroke strokeStyle;
    private float trimPathEnd;
    private float trimPathOffset;
    private float trimPathStart;

    public PathComponent() {
        super(null);
        this.name = "";
        this.fillAlpha = 1.0f;
        this.pathData = VectorKt.getEmptyPath();
        this.pathFillType = VectorKt.getDefaultFillType();
        this.strokeAlpha = 1.0f;
        this.strokeLineCap = VectorKt.getDefaultStrokeLineCap();
        this.strokeLineJoin = VectorKt.getDefaultStrokeLineJoin();
        this.strokeLineMiter = 4.0f;
        this.trimPathEnd = 1.0f;
        this.isPathDirty = true;
        this.isStrokeDirty = true;
        Path Path = AndroidPath_androidKt.Path();
        this.path = Path;
        this.renderPath = Path;
        this.pathMeasure$delegate = y80.B(g40.e, PathComponent$pathMeasure$2.INSTANCE);
    }

    private final PathMeasure getPathMeasure() {
        return (PathMeasure) this.pathMeasure$delegate.getValue();
    }

    private final Path getTmpPath() {
        Path path = this._tmpPath;
        if (path != null) {
            return path;
        }
        Path Path = AndroidPath_androidKt.Path();
        this._tmpPath = Path;
        return Path;
    }

    private final void updatePath() {
        PathParserKt.toPath(this.pathData, this.path);
        updateRenderPath();
    }

    private final void updateRenderPath() {
        if (this.trimPathStart == 0.0f && this.trimPathEnd == 1.0f) {
            this.renderPath = this.path;
            return;
        }
        if (q10.b(this.renderPath, this.path)) {
            this.renderPath = AndroidPath_androidKt.Path();
        } else {
            int mo4649getFillTypeRgk1Os = this.renderPath.mo4649getFillTypeRgk1Os();
            this.renderPath.rewind();
            this.renderPath.mo4651setFillTypeoQ8Xj4U(mo4649getFillTypeRgk1Os);
        }
        getPathMeasure().setPath(this.path, false);
        float length = getPathMeasure().getLength();
        float f = this.trimPathStart;
        float f2 = this.trimPathOffset;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.trimPathEnd + f2) % 1.0f) * length;
        if (f3 <= f4) {
            getPathMeasure().getSegment(f3, f4, this.renderPath, true);
            return;
        }
        Path tmpPath = getTmpPath();
        tmpPath.reset();
        getPathMeasure().getSegment(f3, length, tmpPath, true);
        Path.m5045addPathUv8p0NA$default(this.renderPath, tmpPath, 0L, 2, null);
        tmpPath.reset();
        getPathMeasure().getSegment(0.0f, f4, tmpPath, true);
        Path.m5045addPathUv8p0NA$default(this.renderPath, tmpPath, 0L, 2, null);
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        Stroke stroke;
        if (this.isPathDirty) {
            updatePath();
        } else if (this.isTrimPathDirty) {
            updateRenderPath();
        }
        this.isPathDirty = false;
        this.isTrimPathDirty = false;
        Brush brush = this.fill;
        if (brush != null) {
            DrawScope.m5324drawPathGBMwjPU$default(drawScope, this.renderPath, brush, this.fillAlpha, null, null, 0, 56, null);
        }
        Brush brush2 = this.stroke;
        if (brush2 != null) {
            Stroke stroke2 = this.strokeStyle;
            if (this.isStrokeDirty || stroke2 == null) {
                Stroke stroke3 = new Stroke(this.strokeLineWidth, this.strokeLineMiter, this.strokeLineCap, this.strokeLineJoin, null, 16, null);
                this.strokeStyle = stroke3;
                this.isStrokeDirty = false;
                stroke = stroke3;
            } else {
                stroke = stroke2;
            }
            DrawScope.m5324drawPathGBMwjPU$default(drawScope, this.renderPath, brush2, this.strokeAlpha, stroke, null, 0, 48, null);
        }
    }

    public final Brush getFill() {
        return this.fill;
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PathNode> getPathData() {
        return this.pathData;
    }

    /* renamed from: getPathFillType-Rg-k1Os, reason: not valid java name */
    public final int m5496getPathFillTypeRgk1Os() {
        return this.pathFillType;
    }

    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* renamed from: getStrokeLineCap-KaPHkGw, reason: not valid java name */
    public final int m5497getStrokeLineCapKaPHkGw() {
        return this.strokeLineCap;
    }

    /* renamed from: getStrokeLineJoin-LxFBmk8, reason: not valid java name */
    public final int m5498getStrokeLineJoinLxFBmk8() {
        return this.strokeLineJoin;
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public final void setFill(Brush brush) {
        this.fill = brush;
        invalidate();
    }

    public final void setFillAlpha(float f) {
        this.fillAlpha = f;
        invalidate();
    }

    public final void setName(String str) {
        this.name = str;
        invalidate();
    }

    public final void setPathData(List<? extends PathNode> list) {
        this.pathData = list;
        this.isPathDirty = true;
        invalidate();
    }

    /* renamed from: setPathFillType-oQ8Xj4U, reason: not valid java name */
    public final void m5499setPathFillTypeoQ8Xj4U(int i) {
        this.pathFillType = i;
        this.renderPath.mo4651setFillTypeoQ8Xj4U(i);
        invalidate();
    }

    public final void setStroke(Brush brush) {
        this.stroke = brush;
        invalidate();
    }

    public final void setStrokeAlpha(float f) {
        this.strokeAlpha = f;
        invalidate();
    }

    /* renamed from: setStrokeLineCap-BeK7IIE, reason: not valid java name */
    public final void m5500setStrokeLineCapBeK7IIE(int i) {
        this.strokeLineCap = i;
        this.isStrokeDirty = true;
        invalidate();
    }

    /* renamed from: setStrokeLineJoin-Ww9F2mQ, reason: not valid java name */
    public final void m5501setStrokeLineJoinWw9F2mQ(int i) {
        this.strokeLineJoin = i;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setStrokeLineMiter(float f) {
        this.strokeLineMiter = f;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setStrokeLineWidth(float f) {
        this.strokeLineWidth = f;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setTrimPathEnd(float f) {
        this.trimPathEnd = f;
        this.isTrimPathDirty = true;
        invalidate();
    }

    public final void setTrimPathOffset(float f) {
        this.trimPathOffset = f;
        this.isTrimPathDirty = true;
        invalidate();
    }

    public final void setTrimPathStart(float f) {
        this.trimPathStart = f;
        this.isTrimPathDirty = true;
        invalidate();
    }

    public String toString() {
        return this.path.toString();
    }
}
