package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.CompositingStrategy;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GraphicsViewLayer implements GraphicsLayerImpl {
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;
    private final CanvasHolder canvasHolder;
    private boolean clipBoundsInvalidated;
    private final Rect clipRect;
    private boolean clipToBounds;
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private boolean isInvalidated;
    private final DrawChildContainer layerContainer;
    private final long layerId;
    private Paint layerPaint;
    private boolean outlineIsProvided;
    private final long ownerId;
    private final Picture picture;
    private final CanvasHolder pictureCanvasHolder;
    private final CanvasDrawScope pictureDrawScope;
    private long pivotOffset;
    private RenderEffect renderEffect;
    private final Resources resources;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private boolean shouldManuallySetCenterPivot;
    private long size;
    private long spotShadowColor;
    private final boolean supportsSoftwareRendering;
    private float translationX;
    private float translationY;
    private final ViewLayer viewLayer;
    private int x;
    private int y;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final boolean mayRenderInSoftware = !SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable();
    private static final Canvas PlaceholderCanvas = new Canvas() { // from class: androidx.compose.ui.graphics.layer.GraphicsViewLayer$Companion$PlaceholderCanvas$1
        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    };

    public GraphicsViewLayer(DrawChildContainer drawChildContainer, long j, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.layerContainer = drawChildContainer;
        this.ownerId = j;
        this.canvasHolder = canvasHolder;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, canvasHolder, canvasDrawScope);
        this.viewLayer = viewLayer;
        this.resources = drawChildContainer.getResources();
        this.clipRect = new Rect();
        boolean z = mayRenderInSoftware;
        this.picture = z ? new Picture() : null;
        this.pictureDrawScope = z ? new CanvasDrawScope() : null;
        this.pictureCanvasHolder = z ? new CanvasHolder() : null;
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.size = IntSize.Companion.m7787getZeroYbymL2g();
        this.isInvalidated = true;
        this.layerId = View.generateViewId();
        this.blendMode = BlendMode.Companion.m4701getSrcOver0nO6VwU();
        this.compositingStrategy = CompositingStrategy.Companion.m5415getAutoke2Ky5w();
        this.alpha = 1.0f;
        this.pivotOffset = Offset.Companion.m4532getZeroF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        Color.Companion companion = Color.Companion;
        this.ambientShadowColor = companion.m4787getBlack0d7_KjU();
        this.spotShadowColor = companion.m4787getBlack0d7_KjU();
        this.supportsSoftwareRendering = z;
    }

    /* renamed from: applyCompositingLayer-Wpw9cng, reason: not valid java name */
    private final void m5452applyCompositingLayerWpw9cng(int i) {
        ViewLayer viewLayer = this.viewLayer;
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        boolean z = true;
        if (CompositingStrategy.m5411equalsimpl0(i, companion.m5417getOffscreenke2Ky5w())) {
            this.viewLayer.setLayerType(2, this.layerPaint);
        } else {
            boolean m5411equalsimpl0 = CompositingStrategy.m5411equalsimpl0(i, companion.m5416getModulateAlphake2Ky5w());
            ViewLayer viewLayer2 = this.viewLayer;
            if (m5411equalsimpl0) {
                viewLayer2.setLayerType(0, this.layerPaint);
                z = false;
            } else {
                viewLayer2.setLayerType(0, this.layerPaint);
            }
        }
        viewLayer.setCanUseCompositingLayer$ui_graphics(z);
    }

    private final Paint obtainLayerPaint() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.layerPaint = paint2;
        return paint2;
    }

    private final void recordDrawingOperations() {
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            Canvas canvas = PlaceholderCanvas;
            Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.drawChild$ui_graphics(androidCanvas, viewLayer, viewLayer.getDrawingTime());
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        } catch (ClassCastException unused) {
        }
    }

    private final boolean requiresCompositingLayer() {
        return CompositingStrategy.m5411equalsimpl0(mo5440getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m5417getOffscreenke2Ky5w()) || requiresLayerPaint();
    }

    private final boolean requiresLayerPaint() {
        return (BlendMode.m4670equalsimpl0(mo5439getBlendMode0nO6VwU(), BlendMode.Companion.m4701getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void updateClipBounds() {
        Rect rect;
        if (this.clipBoundsInvalidated) {
            ViewLayer viewLayer = this.viewLayer;
            if (!getClip() || this.outlineIsProvided) {
                rect = null;
            } else {
                rect = this.clipRect;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.viewLayer.getWidth();
                rect.bottom = this.viewLayer.getHeight();
            }
            viewLayer.setClipBounds(rect);
        }
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m5452applyCompositingLayerWpw9cng(CompositingStrategy.Companion.m5417getOffscreenke2Ky5w());
        } else {
            m5452applyCompositingLayerWpw9cng(mo5440getCompositingStrategyke2Ky5w());
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public Matrix calculateMatrix() {
        return this.viewLayer.getMatrix();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        this.layerContainer.removeViewInLayout(this.viewLayer);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void draw(androidx.compose.ui.graphics.Canvas canvas) {
        updateClipBounds();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.drawChild$ui_graphics(canvas, viewLayer, viewLayer.getDrawingTime());
        } else {
            Picture picture = this.picture;
            if (picture != null) {
                nativeCanvas.drawPicture(picture);
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getAmbientShadowColor-0d7_KjU */
    public long mo5438getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getBlendMode-0nO6VwU */
    public int mo5439getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getCameraDistance() {
        return this.viewLayer.getCameraDistance() / this.resources.getDisplayMetrics().densityDpi;
    }

    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getClip() {
        return this.clipToBounds || this.viewLayer.getClipToOutline();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getCompositingStrategy-ke2Ky5w */
    public int mo5440getCompositingStrategyke2Ky5w() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getLayerId() {
        return this.layerId;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getOwnerId() {
        return this.ownerId;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getPivotOffset-F1C5BW0 */
    public long mo5441getPivotOffsetF1C5BW0() {
        return this.pivotOffset;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getSpotShadowColor-0d7_KjU */
    public long mo5442getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getSupportsSoftwareRendering() {
        return this.supportsSoftwareRendering;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean isInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void record(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, ky kyVar) {
        Picture picture;
        CanvasHolder canvasHolder;
        Canvas canvas;
        if (this.viewLayer.getParent() == null) {
            this.layerContainer.addView(this.viewLayer);
        }
        this.viewLayer.setDrawParams(density, layoutDirection, graphicsLayer, kyVar);
        if (!this.viewLayer.isAttachedToWindow()) {
            return;
        }
        this.viewLayer.setVisibility(4);
        this.viewLayer.setVisibility(0);
        recordDrawingOperations();
        Picture picture2 = this.picture;
        if (picture2 == null) {
            return;
        }
        long j = this.size;
        Canvas beginRecording = picture2.beginRecording((int) (j >> 32), (int) (j & 4294967295L));
        try {
            CanvasHolder canvasHolder2 = this.pictureCanvasHolder;
            if (canvasHolder2 != null) {
                Canvas internalCanvas = canvasHolder2.getAndroidCanvas().getInternalCanvas();
                canvasHolder2.getAndroidCanvas().setInternalCanvas(beginRecording);
                AndroidCanvas androidCanvas = canvasHolder2.getAndroidCanvas();
                CanvasDrawScope canvasDrawScope = this.pictureDrawScope;
                if (canvasDrawScope != null) {
                    long m7794toSizeozmzZPI = IntSizeKt.m7794toSizeozmzZPI(this.size);
                    Density density2 = canvasDrawScope.getDrawContext().getDensity();
                    LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
                    androidx.compose.ui.graphics.Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
                    canvasHolder = canvasHolder2;
                    canvas = internalCanvas;
                    long mo5256getSizeNHjbRc = canvasDrawScope.getDrawContext().mo5256getSizeNHjbRc();
                    picture = picture2;
                    try {
                        GraphicsLayer graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
                        DrawContext drawContext = canvasDrawScope.getDrawContext();
                        drawContext.setDensity(density);
                        drawContext.setLayoutDirection(layoutDirection);
                        drawContext.setCanvas(androidCanvas);
                        drawContext.mo5257setSizeuvyYCjk(m7794toSizeozmzZPI);
                        drawContext.setGraphicsLayer(graphicsLayer);
                        androidCanvas.save();
                        try {
                            kyVar.invoke(canvasDrawScope);
                            androidCanvas.restore();
                            DrawContext drawContext2 = canvasDrawScope.getDrawContext();
                            drawContext2.setDensity(density2);
                            drawContext2.setLayoutDirection(layoutDirection2);
                            drawContext2.setCanvas(canvas2);
                            drawContext2.mo5257setSizeuvyYCjk(mo5256getSizeNHjbRc);
                            drawContext2.setGraphicsLayer(graphicsLayer2);
                        } catch (Throwable th) {
                            androidCanvas.restore();
                            DrawContext drawContext3 = canvasDrawScope.getDrawContext();
                            drawContext3.setDensity(density2);
                            drawContext3.setLayoutDirection(layoutDirection2);
                            drawContext3.setCanvas(canvas2);
                            drawContext3.mo5257setSizeuvyYCjk(mo5256getSizeNHjbRc);
                            drawContext3.setGraphicsLayer(graphicsLayer2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        picture.endRecording();
                        throw th;
                    }
                } else {
                    picture = picture2;
                    canvasHolder = canvasHolder2;
                    canvas = internalCanvas;
                }
                canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
            } else {
                picture = picture2;
            }
            picture.endRecording();
        } catch (Throwable th3) {
            th = th3;
            picture = picture2;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setAlpha(float f) {
        this.alpha = f;
        this.viewLayer.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setAmbientShadowColor-8_81llA */
    public void mo5443setAmbientShadowColor8_81llA(long j) {
        this.ambientShadowColor = j;
        ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this.viewLayer, ColorKt.m4815toArgb8_81llA(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setBlendMode-s9anfk8 */
    public void mo5444setBlendModes9anfk8(int i) {
        this.blendMode = i;
        obtainLayerPaint().setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m4609toPorterDuffModes9anfk8(i)));
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f) {
        this.viewLayer.setCameraDistance(f * this.resources.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z) {
        boolean z2 = false;
        this.clipToBounds = z && !this.outlineIsProvided;
        this.clipBoundsInvalidated = true;
        ViewLayer viewLayer = this.viewLayer;
        if (z && this.outlineIsProvided) {
            z2 = true;
        }
        viewLayer.setClipToOutline(z2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        obtainLayerPaint().setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setCompositingStrategy-Wpw9cng */
    public void mo5445setCompositingStrategyWpw9cng(int i) {
        this.compositingStrategy = i;
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setInvalidated(boolean z) {
        this.isInvalidated = z;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setOutline-O0kMr_c */
    public void mo5446setOutlineO0kMr_c(Outline outline, long j) {
        boolean layerOutline = this.viewLayer.setLayerOutline(outline);
        if (getClip() && outline != null) {
            this.viewLayer.setClipToOutline(true);
            if (this.clipToBounds) {
                this.clipToBounds = false;
                this.clipBoundsInvalidated = true;
            }
        }
        this.outlineIsProvided = outline != null;
        if (layerOutline) {
            return;
        }
        this.viewLayer.invalidate();
        recordDrawingOperations();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPivotOffset-k-4lQ0M */
    public void mo5447setPivotOffsetk4lQ0M(long j) {
        this.pivotOffset = j;
        if ((InlineClassHelperKt.DualUnsignedFloatMask & j) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            ViewLayerVerificationHelper28.INSTANCE.resetPivot(this.viewLayer);
            return;
        }
        this.shouldManuallySetCenterPivot = false;
        this.viewLayer.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
        this.viewLayer.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPosition-H0pRuoY */
    public void mo5448setPositionH0pRuoY(int i, int i2, long j) {
        if (IntSize.m7780equalsimpl0(this.size, j)) {
            int i3 = this.x;
            if (i3 != i) {
                this.viewLayer.offsetLeftAndRight(i - i3);
            }
            int i4 = this.y;
            if (i4 != i2) {
                this.viewLayer.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (getClip()) {
                this.clipBoundsInvalidated = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            this.viewLayer.layout(i, i2, i + i5, i2 + i6);
            this.size = j;
            if (this.shouldManuallySetCenterPivot) {
                this.viewLayer.setPivotX(i5 / 2.0f);
                this.viewLayer.setPivotY(i6 / 2.0f);
            }
        }
        this.x = i;
        this.y = i2;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this.viewLayer, renderEffect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationX(float f) {
        this.rotationX = f;
        this.viewLayer.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationY(float f) {
        this.rotationY = f;
        this.viewLayer.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationZ(float f) {
        this.rotationZ = f;
        this.viewLayer.setRotation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleX(float f) {
        this.scaleX = f;
        this.viewLayer.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleY(float f) {
        this.scaleY = f;
        this.viewLayer.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setShadowElevation(float f) {
        this.shadowElevation = f;
        this.viewLayer.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setSpotShadowColor-8_81llA */
    public void mo5449setSpotShadowColor8_81llA(long j) {
        this.spotShadowColor = j;
        ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this.viewLayer, ColorKt.m4815toArgb8_81llA(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float f) {
        this.translationX = f;
        this.viewLayer.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float f) {
        this.translationY = f;
        this.viewLayer.setTranslationY(f);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final boolean getMayRenderInSoftware() {
            return GraphicsViewLayer.mayRenderInSoftware;
        }

        public final Canvas getPlaceholderCanvas() {
            return GraphicsViewLayer.PlaceholderCanvas;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GraphicsViewLayer(DrawChildContainer drawChildContainer, long j, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i, dq dqVar) {
        this(drawChildContainer, j, (i & 4) != 0 ? new CanvasHolder() : canvasHolder, (i & 8) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
