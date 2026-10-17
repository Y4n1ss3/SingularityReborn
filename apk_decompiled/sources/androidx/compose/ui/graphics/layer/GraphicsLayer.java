package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.gb0;
import defpackage.hm;
import defpackage.ky;
import defpackage.lu0;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.q10;
import defpackage.sl0;
import defpackage.vn;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GraphicsLayer {
    private static final LayerSnapshotImpl SnapshotImpl;
    private static final boolean isRobolectric;
    private Outline androidOutline;
    private final ChildLayerDependenciesTracker childDependenciesTracker;
    private boolean clip;
    private final GraphicsLayerImpl impl;
    private androidx.compose.ui.graphics.Outline internalOutline;
    private boolean isReleased;
    private Path outlinePath;
    private int parentLayerUsages;
    private RectF pathBounds;
    private long pivotOffset;
    private Path roundRectClipPath;
    private float roundRectCornerRadius;
    private long roundRectOutlineSize;
    private long roundRectOutlineTopLeft;
    private long size;
    private CanvasDrawScope softwareDrawScope;
    private Paint softwareLayerPaint;
    private long topLeft;
    private boolean usePathForClip;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private Density density = DrawContextKt.getDefaultDensity();
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private ky drawBlock = GraphicsLayer$drawBlock$1.INSTANCE;
    private final ky clipDrawBlock = new GraphicsLayer$clipDrawBlock$1(this);
    private boolean outlineDirty = true;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        boolean equals = lowerCase.equals("robolectric");
        isRobolectric = equals;
        SnapshotImpl = equals ? LayerSnapshotV21.INSTANCE : LayerSnapshotV28.INSTANCE;
    }

    public GraphicsLayer(GraphicsLayerImpl graphicsLayerImpl) {
        this.impl = graphicsLayerImpl;
        Offset.Companion companion = Offset.Companion;
        this.roundRectOutlineTopLeft = companion.m4532getZeroF1C5BW0();
        this.roundRectOutlineSize = Size.Companion.m4593getUnspecifiedNHjbRc();
        this.childDependenciesTracker = new ChildLayerDependenciesTracker();
        graphicsLayerImpl.setClip(false);
        this.topLeft = IntOffset.Companion.m7750getZeronOccac();
        this.size = IntSize.Companion.m7787getZeroYbymL2g();
        this.pivotOffset = companion.m4531getUnspecifiedF1C5BW0();
    }

    private final void addSubLayer(GraphicsLayer graphicsLayer) {
        if (this.childDependenciesTracker.onDependencyAdded(graphicsLayer)) {
            graphicsLayer.onAddedToParentLayer();
        }
    }

    private final void configureOutlineAndClip() {
        if (this.outlineDirty) {
            Outline outline = null;
            if (this.clip || getShadowElevation() > 0.0f) {
                Path path = this.outlinePath;
                if (path != null) {
                    RectF obtainPathBounds = obtainPathBounds();
                    if (!(path instanceof AndroidPath)) {
                        lu0.a("Unable to obtain android.graphics.Path");
                        return;
                    }
                    ((AndroidPath) path).getInternalPath().computeBounds(obtainPathBounds, false);
                    Outline updatePathOutline = updatePathOutline(path);
                    if (updatePathOutline != null) {
                        updatePathOutline.setAlpha(getAlpha());
                        outline = updatePathOutline;
                    }
                    this.impl.mo5446setOutlineO0kMr_c(outline, IntSize.m7777constructorimpl((4294967295L & Math.round(obtainPathBounds.height())) | (Math.round(obtainPathBounds.width()) << 32)));
                    if (this.usePathForClip && this.clip) {
                        this.impl.setClip(false);
                        this.impl.discardDisplayList();
                    } else {
                        this.impl.setClip(this.clip);
                    }
                } else {
                    this.impl.setClip(this.clip);
                    Size.Companion.m4594getZeroNHjbRc();
                    Outline obtainAndroidOutline = obtainAndroidOutline();
                    long m7794toSizeozmzZPI = IntSizeKt.m7794toSizeozmzZPI(this.size);
                    long j = this.roundRectOutlineTopLeft;
                    long j2 = this.roundRectOutlineSize;
                    long j3 = j2 == InlineClassHelperKt.UnspecifiedPackedFloats ? m7794toSizeozmzZPI : j2;
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    obtainAndroidOutline.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2)), this.roundRectCornerRadius);
                    obtainAndroidOutline.setAlpha(getAlpha());
                    this.impl.mo5446setOutlineO0kMr_c(obtainAndroidOutline, IntSizeKt.m7790roundToIntSizeuvyYCjk(j3));
                }
            } else {
                this.impl.setClip(false);
                this.impl.mo5446setOutlineO0kMr_c(null, IntSize.Companion.m7787getZeroYbymL2g());
            }
        }
        this.outlineDirty = false;
    }

    private final void discardContentIfReleasedAndHaveNoParentLayerUsages() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            discardDisplayList$ui_graphics();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawWithChildTracking(DrawScope drawScope) {
        ChildLayerDependenciesTracker childLayerDependenciesTracker = this.childDependenciesTracker;
        childLayerDependenciesTracker.oldDependency = childLayerDependenciesTracker.dependency;
        gb0 gb0Var = childLayerDependenciesTracker.dependenciesSet;
        if (gb0Var != null && gb0Var.c()) {
            gb0 gb0Var2 = childLayerDependenciesTracker.oldDependenciesSet;
            if (gb0Var2 == null) {
                gb0 gb0Var3 = sl0.a;
                gb0Var2 = new gb0();
                childLayerDependenciesTracker.oldDependenciesSet = gb0Var2;
            }
            gb0Var2.k(gb0Var);
            gb0Var.f();
        }
        childLayerDependenciesTracker.trackingInProgress = true;
        this.drawBlock.invoke(drawScope);
        childLayerDependenciesTracker.trackingInProgress = false;
        GraphicsLayer graphicsLayer = childLayerDependenciesTracker.oldDependency;
        if (graphicsLayer != null) {
            graphicsLayer.onRemovedFromParentLayer();
        }
        gb0 gb0Var4 = childLayerDependenciesTracker.oldDependenciesSet;
        if (gb0Var4 == null || !gb0Var4.c()) {
            return;
        }
        Object[] objArr = gb0Var4.b;
        long[] jArr = gb0Var4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((GraphicsLayer) objArr[(i << 3) + i3]).onRemovedFromParentLayer();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        gb0Var4.f();
    }

    private final Outline obtainAndroidOutline() {
        Outline outline = this.androidOutline;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.androidOutline = outline2;
        return outline2;
    }

    private final RectF obtainPathBounds() {
        RectF rectF = this.pathBounds;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.pathBounds = rectF2;
        return rectF2;
    }

    private final void onAddedToParentLayer() {
        this.parentLayerUsages++;
    }

    private final void onRemovedFromParentLayer() {
        this.parentLayerUsages--;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    private final void recordInternal() {
        this.impl.record(this.density, this.layoutDirection, this, this.clipDrawBlock);
    }

    private final void recreateDisplayListIfNeeded() {
        if (this.impl.getHasDisplayList()) {
            return;
        }
        try {
            recordInternal();
        } catch (Throwable unused) {
        }
    }

    private final void resetOutlineParams() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = Size.Companion.m4593getUnspecifiedNHjbRc();
        this.roundRectOutlineTopLeft = Offset.Companion.m4532getZeroF1C5BW0();
        this.roundRectCornerRadius = 0.0f;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }

    private final <T> T resolveOutlinePosition(my myVar) {
        long m7794toSizeozmzZPI = IntSizeKt.m7794toSizeozmzZPI(this.size);
        long j = this.roundRectOutlineTopLeft;
        long j2 = this.roundRectOutlineSize;
        if (j2 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            m7794toSizeozmzZPI = j2;
        }
        return (T) myVar.invoke(Offset.m4505boximpl(j), Size.m4573boximpl(m7794toSizeozmzZPI));
    }

    /* renamed from: setPosition-VbeCjmY, reason: not valid java name */
    private final void m5418setPositionVbeCjmY(long j, long j2) {
        this.impl.mo5448setPositionH0pRuoY(IntOffset.m7739getXimpl(j), IntOffset.m7740getYimpl(j), j2);
    }

    /* renamed from: setRectOutline-tz77jQw$default, reason: not valid java name */
    public static /* synthetic */ void m5419setRectOutlinetz77jQw$default(GraphicsLayer graphicsLayer, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Offset.Companion.m4532getZeroF1C5BW0();
        }
        if ((i & 2) != 0) {
            j2 = Size.Companion.m4593getUnspecifiedNHjbRc();
        }
        graphicsLayer.m5434setRectOutlinetz77jQw(j, j2);
    }

    /* renamed from: setRoundRectOutline-TNW_H78$default, reason: not valid java name */
    public static /* synthetic */ void m5420setRoundRectOutlineTNW_H78$default(GraphicsLayer graphicsLayer, long j, long j2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Offset.Companion.m4532getZeroF1C5BW0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = Size.Companion.m4593getUnspecifiedNHjbRc();
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        graphicsLayer.m5435setRoundRectOutlineTNW_H78(j3, j4, f);
    }

    /* renamed from: setSize-ozmzZPI, reason: not valid java name */
    private final void m5421setSizeozmzZPI(long j) {
        if (IntSize.m7780equalsimpl0(this.size, j)) {
            return;
        }
        this.size = j;
        m5418setPositionVbeCjmY(this.topLeft, j);
        if (this.roundRectOutlineSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    private final void transformCanvas(Canvas canvas) {
        Canvas canvas2;
        float m7739getXimpl = IntOffset.m7739getXimpl(this.topLeft);
        float m7740getYimpl = IntOffset.m7740getYimpl(this.topLeft);
        float m7739getXimpl2 = IntOffset.m7739getXimpl(this.topLeft) + ((int) (this.size >> 32));
        float m7740getYimpl2 = IntOffset.m7740getYimpl(this.topLeft) + ((int) (this.size & 4294967295L));
        float alpha = getAlpha();
        ColorFilter colorFilter = getColorFilter();
        int m5423getBlendMode0nO6VwU = m5423getBlendMode0nO6VwU();
        if (alpha < 1.0f || !BlendMode.m4670equalsimpl0(m5423getBlendMode0nO6VwU, BlendMode.Companion.m4701getSrcOver0nO6VwU()) || colorFilter != null || CompositingStrategy.m5411equalsimpl0(m5424getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m5417getOffscreenke2Ky5w())) {
            Paint paint = this.softwareLayerPaint;
            if (paint == null) {
                paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = paint;
            }
            paint.setAlpha(alpha);
            paint.mo4636setBlendModes9anfk8(m5423getBlendMode0nO6VwU);
            paint.setColorFilter(colorFilter);
            canvas2 = canvas;
            canvas2.saveLayer(m7739getXimpl, m7740getYimpl, m7739getXimpl2, m7740getYimpl2, AndroidPaint_androidKt.getNativePaint(paint));
        } else {
            canvas.save();
            canvas2 = canvas;
        }
        canvas2.translate(m7739getXimpl, m7740getYimpl);
        canvas2.concat(this.impl.calculateMatrix());
    }

    private final Outline updatePathOutline(Path path) {
        Outline obtainAndroidOutline = obtainAndroidOutline();
        if (Build.VERSION.SDK_INT >= 30) {
            OutlineVerificationHelper.INSTANCE.setPath(obtainAndroidOutline, path);
        } else {
            if (!(path instanceof AndroidPath)) {
                lu0.a("Unable to obtain android.graphics.Path");
                return null;
            }
            obtainAndroidOutline.setConvexPath(((AndroidPath) path).getInternalPath());
        }
        this.usePathForClip = !obtainAndroidOutline.canClip();
        this.outlinePath = path;
        return obtainAndroidOutline;
    }

    public final void discardDisplayList$ui_graphics() {
        ChildLayerDependenciesTracker childLayerDependenciesTracker = this.childDependenciesTracker;
        GraphicsLayer graphicsLayer = childLayerDependenciesTracker.dependency;
        if (graphicsLayer != null) {
            graphicsLayer.onRemovedFromParentLayer();
            childLayerDependenciesTracker.dependency = null;
        }
        gb0 gb0Var = childLayerDependenciesTracker.dependenciesSet;
        if (gb0Var != null) {
            Object[] objArr = gb0Var.b;
            long[] jArr = gb0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((GraphicsLayer) objArr[(i << 3) + i3]).onRemovedFromParentLayer();
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            gb0Var.f();
        }
        this.impl.discardDisplayList();
    }

    public final void draw$ui_graphics(androidx.compose.ui.graphics.Canvas canvas, GraphicsLayer graphicsLayer) {
        boolean z;
        boolean z2;
        if (this.isReleased) {
            return;
        }
        configureOutlineAndClip();
        recreateDisplayListIfNeeded();
        boolean z3 = getShadowElevation() > 0.0f;
        if (z3) {
            canvas.enableZ();
        }
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean isHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            transformCanvas(nativeCanvas);
        }
        boolean z4 = !isHardwareAccelerated && this.clip;
        if (z4) {
            canvas.save();
            androidx.compose.ui.graphics.Outline outline = getOutline();
            if (outline instanceof Outline.Rectangle) {
                androidx.compose.ui.graphics.Canvas.m4734clipRectmtrdDE$default(canvas, ((Outline.Rectangle) outline).getBounds(), 0, 2, null);
            } else if (outline instanceof Outline.Rounded) {
                Path path = this.roundRectClipPath;
                if (path != null) {
                    path.rewind();
                } else {
                    path = AndroidPath_androidKt.Path();
                    this.roundRectClipPath = path;
                }
                Path.addRoundRect$default(path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
                androidx.compose.ui.graphics.Canvas.m4732clipPathmtrdDE$default(canvas, path, 0, 2, null);
            } else {
                if (!(outline instanceof Outline.Generic)) {
                    o.n();
                    return;
                }
                androidx.compose.ui.graphics.Canvas.m4732clipPathmtrdDE$default(canvas, ((Outline.Generic) outline).getPath(), 0, 2, null);
            }
        }
        if (graphicsLayer != null) {
            graphicsLayer.addSubLayer(this);
        }
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            z = z3;
            z2 = z4;
            this.impl.draw(canvas);
        } else {
            CanvasDrawScope canvasDrawScope = this.softwareDrawScope;
            if (canvasDrawScope == null) {
                canvasDrawScope = new CanvasDrawScope();
                this.softwareDrawScope = canvasDrawScope;
            }
            Density density = this.density;
            LayoutDirection layoutDirection = this.layoutDirection;
            long m7794toSizeozmzZPI = IntSizeKt.m7794toSizeozmzZPI(this.size);
            Density density2 = canvasDrawScope.getDrawContext().getDensity();
            LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
            androidx.compose.ui.graphics.Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
            long mo5256getSizeNHjbRc = canvasDrawScope.getDrawContext().mo5256getSizeNHjbRc();
            z = z3;
            GraphicsLayer graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
            z2 = z4;
            DrawContext drawContext = canvasDrawScope.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setCanvas(canvas);
            drawContext.mo5257setSizeuvyYCjk(m7794toSizeozmzZPI);
            drawContext.setGraphicsLayer(this);
            canvas.save();
            try {
                drawWithChildTracking(canvasDrawScope);
            } finally {
                canvas.restore();
                DrawContext drawContext2 = canvasDrawScope.getDrawContext();
                drawContext2.setDensity(density2);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas2);
                drawContext2.mo5257setSizeuvyYCjk(mo5256getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer2);
            }
        }
        if (z2) {
            canvas.restore();
        }
        if (z) {
            canvas.disableZ();
        }
        if (isHardwareAccelerated) {
            return;
        }
        nativeCanvas.restore();
    }

    public final void drawForPersistence$ui_graphics(androidx.compose.ui.graphics.Canvas canvas) {
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            recreateDisplayListIfNeeded();
            this.impl.draw(canvas);
        }
    }

    public final void emulateTrimMemory$ui_graphics() {
        this.impl.discardDisplayList();
    }

    public final float getAlpha() {
        return this.impl.getAlpha();
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m5422getAmbientShadowColor0d7_KjU() {
        return this.impl.mo5438getAmbientShadowColor0d7_KjU();
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m5423getBlendMode0nO6VwU() {
        return this.impl.mo5439getBlendMode0nO6VwU();
    }

    public final float getCameraDistance() {
        return this.impl.getCameraDistance();
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final ColorFilter getColorFilter() {
        return this.impl.getColorFilter();
    }

    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    public final int m5424getCompositingStrategyke2Ky5w() {
        return this.impl.mo5440getCompositingStrategyke2Ky5w();
    }

    public final GraphicsLayerImpl getImpl$ui_graphics() {
        return this.impl;
    }

    public final long getLayerId() {
        return this.impl.getLayerId();
    }

    public final androidx.compose.ui.graphics.Outline getOutline() {
        androidx.compose.ui.graphics.Outline rectangle;
        androidx.compose.ui.graphics.Outline outline = this.internalOutline;
        Path path = this.outlinePath;
        if (outline != null) {
            return outline;
        }
        if (path != null) {
            Outline.Generic generic = new Outline.Generic(path);
            this.internalOutline = generic;
            return generic;
        }
        long m7794toSizeozmzZPI = IntSizeKt.m7794toSizeozmzZPI(this.size);
        long j = this.roundRectOutlineTopLeft;
        long j2 = this.roundRectOutlineSize;
        if (j2 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            m7794toSizeozmzZPI = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (m7794toSizeozmzZPI >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (m7794toSizeozmzZPI & 4294967295L)) + intBitsToFloat2;
        if (this.roundRectCornerRadius > 0.0f) {
            rectangle = new Outline.Rounded(RoundRectKt.m4570RoundRectgG7oq9Y(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0)))));
        } else {
            rectangle = new Outline.Rectangle(new Rect(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.internalOutline = rectangle;
        return rectangle;
    }

    public final long getOwnerViewId() {
        return this.impl.getOwnerId();
    }

    /* renamed from: getPivotOffset-F1C5BW0, reason: not valid java name */
    public final long m5425getPivotOffsetF1C5BW0() {
        return this.pivotOffset;
    }

    public final RenderEffect getRenderEffect() {
        return this.impl.getRenderEffect();
    }

    public final float getRotationX() {
        return this.impl.getRotationX();
    }

    public final float getRotationY() {
        return this.impl.getRotationY();
    }

    public final float getRotationZ() {
        return this.impl.getRotationZ();
    }

    public final float getScaleX() {
        return this.impl.getScaleX();
    }

    public final float getScaleY() {
        return this.impl.getScaleY();
    }

    public final float getShadowElevation() {
        return this.impl.getShadowElevation();
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m5426getSizeYbymL2g() {
        return this.size;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m5427getSpotShadowColor0d7_KjU() {
        return this.impl.mo5442getSpotShadowColor0d7_KjU();
    }

    /* renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m5428getTopLeftnOccac() {
        return this.topLeft;
    }

    public final float getTranslationX() {
        return this.impl.getTranslationX();
    }

    public final float getTranslationY() {
        return this.impl.getTranslationY();
    }

    public final boolean isReleased() {
        return this.isReleased;
    }

    /* renamed from: record-mL-hObY, reason: not valid java name */
    public final void m5429recordmLhObY(Density density, LayoutDirection layoutDirection, long j, ky kyVar) {
        m5421setSizeozmzZPI(j);
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = kyVar;
        this.impl.setInvalidated(true);
        recordInternal();
    }

    public final void release$ui_graphics() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    public final void setAlpha(float f) {
        if (this.impl.getAlpha() == f) {
            return;
        }
        this.impl.setAlpha(f);
    }

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m5430setAmbientShadowColor8_81llA(long j) {
        if (Color.m4762equalsimpl0(j, this.impl.mo5438getAmbientShadowColor0d7_KjU())) {
            return;
        }
        this.impl.mo5443setAmbientShadowColor8_81llA(j);
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m5431setBlendModes9anfk8(int i) {
        if (BlendMode.m4670equalsimpl0(this.impl.mo5439getBlendMode0nO6VwU(), i)) {
            return;
        }
        this.impl.mo5444setBlendModes9anfk8(i);
    }

    public final void setCameraDistance(float f) {
        if (this.impl.getCameraDistance() == f) {
            return;
        }
        this.impl.setCameraDistance(f);
    }

    public final void setClip(boolean z) {
        if (this.clip != z) {
            this.clip = z;
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (q10.b(this.impl.getColorFilter(), colorFilter)) {
            return;
        }
        this.impl.setColorFilter(colorFilter);
    }

    /* renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    public final void m5432setCompositingStrategyWpw9cng(int i) {
        if (CompositingStrategy.m5411equalsimpl0(this.impl.mo5440getCompositingStrategyke2Ky5w(), i)) {
            return;
        }
        this.impl.mo5445setCompositingStrategyWpw9cng(i);
    }

    public final void setPathOutline(Path path) {
        resetOutlineParams();
        this.outlinePath = path;
        configureOutlineAndClip();
    }

    /* renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    public final void m5433setPivotOffsetk4lQ0M(long j) {
        if (Offset.m4513equalsimpl0(this.pivotOffset, j)) {
            return;
        }
        this.pivotOffset = j;
        this.impl.mo5447setPivotOffsetk4lQ0M(j);
    }

    /* renamed from: setRectOutline-tz77jQw, reason: not valid java name */
    public final void m5434setRectOutlinetz77jQw(long j, long j2) {
        m5435setRoundRectOutlineTNW_H78(j, j2, 0.0f);
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        if (q10.b(this.impl.getRenderEffect(), renderEffect)) {
            return;
        }
        this.impl.setRenderEffect(renderEffect);
    }

    public final void setRotationX(float f) {
        if (this.impl.getRotationX() == f) {
            return;
        }
        this.impl.setRotationX(f);
    }

    public final void setRotationY(float f) {
        if (this.impl.getRotationY() == f) {
            return;
        }
        this.impl.setRotationY(f);
    }

    public final void setRotationZ(float f) {
        if (this.impl.getRotationZ() == f) {
            return;
        }
        this.impl.setRotationZ(f);
    }

    /* renamed from: setRoundRectOutline-TNW_H78, reason: not valid java name */
    public final void m5435setRoundRectOutlineTNW_H78(long j, long j2, float f) {
        if (Offset.m4513equalsimpl0(this.roundRectOutlineTopLeft, j) && Size.m4581equalsimpl0(this.roundRectOutlineSize, j2) && this.roundRectCornerRadius == f && this.outlinePath == null) {
            return;
        }
        resetOutlineParams();
        this.roundRectOutlineTopLeft = j;
        this.roundRectOutlineSize = j2;
        this.roundRectCornerRadius = f;
        configureOutlineAndClip();
    }

    public final void setScaleX(float f) {
        if (this.impl.getScaleX() == f) {
            return;
        }
        this.impl.setScaleX(f);
    }

    public final void setScaleY(float f) {
        if (this.impl.getScaleY() == f) {
            return;
        }
        this.impl.setScaleY(f);
    }

    public final void setShadowElevation(float f) {
        if (this.impl.getShadowElevation() == f) {
            return;
        }
        this.impl.setShadowElevation(f);
        this.outlineDirty = true;
        configureOutlineAndClip();
    }

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m5436setSpotShadowColor8_81llA(long j) {
        if (Color.m4762equalsimpl0(j, this.impl.mo5442getSpotShadowColor0d7_KjU())) {
            return;
        }
        this.impl.mo5449setSpotShadowColor8_81llA(j);
    }

    /* renamed from: setTopLeft--gyyYBs, reason: not valid java name */
    public final void m5437setTopLeftgyyYBs(long j) {
        if (IntOffset.m7738equalsimpl0(this.topLeft, j)) {
            return;
        }
        this.topLeft = j;
        m5418setPositionVbeCjmY(j, this.size);
    }

    public final void setTranslationX(float f) {
        if (this.impl.getTranslationX() == f) {
            return;
        }
        this.impl.setTranslationX(f);
    }

    public final void setTranslationY(float f) {
        if (this.impl.getTranslationY() == f) {
            return;
        }
        this.impl.setTranslationY(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object toImageBitmap(hm hmVar) {
        GraphicsLayer$toImageBitmap$1 graphicsLayer$toImageBitmap$1;
        int i;
        if (hmVar instanceof GraphicsLayer$toImageBitmap$1) {
            graphicsLayer$toImageBitmap$1 = (GraphicsLayer$toImageBitmap$1) hmVar;
            int i2 = graphicsLayer$toImageBitmap$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphicsLayer$toImageBitmap$1.label = i2 - Integer.MIN_VALUE;
                Object obj = graphicsLayer$toImageBitmap$1.result;
                i = graphicsLayer$toImageBitmap$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    LayerSnapshotImpl layerSnapshotImpl = SnapshotImpl;
                    graphicsLayer$toImageBitmap$1.label = 1;
                    obj = layerSnapshotImpl.toBitmap(this, graphicsLayer$toImageBitmap$1);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                return AndroidImageBitmap_androidKt.asImageBitmap((Bitmap) obj);
            }
        }
        graphicsLayer$toImageBitmap$1 = new GraphicsLayer$toImageBitmap$1(this, hmVar);
        Object obj2 = graphicsLayer$toImageBitmap$1.result;
        i = graphicsLayer$toImageBitmap$1.label;
        if (i != 0) {
        }
        return AndroidImageBitmap_androidKt.asImageBitmap((Bitmap) obj2);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getClip$annotations() {
    }
}
