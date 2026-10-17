package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.CompositingStrategy;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GraphicsLayerV29 implements GraphicsLayerImpl {
    public static final int $stable = 8;
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;
    private float cameraDistance;
    private final CanvasDrawScope canvasDrawScope;
    private final CanvasHolder canvasHolder;
    private boolean clip;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private boolean isInvalidated;
    private Paint layerPaint;
    private Matrix matrix;
    private boolean outlineIsProvided;
    private final long ownerId;
    private long pivotOffset;
    private RenderEffect renderEffect;
    private final RenderNode renderNode;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private long size;
    private long spotShadowColor;
    private float translationX;
    private float translationY;

    public GraphicsLayerV29(long j, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.ownerId = j;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.renderNode = renderNode;
        this.size = Size.Companion.m4594getZeroNHjbRc();
        renderNode.setClipToBounds(false);
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        m5451applyCompositingStrategyZ1X6vPc(renderNode, companion.m5415getAutoke2Ky5w());
        this.alpha = 1.0f;
        this.blendMode = BlendMode.Companion.m4701getSrcOver0nO6VwU();
        this.pivotOffset = Offset.Companion.m4531getUnspecifiedF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        Color.Companion companion2 = Color.Companion;
        this.ambientShadowColor = companion2.m4787getBlack0d7_KjU();
        this.spotShadowColor = companion2.m4787getBlack0d7_KjU();
        this.cameraDistance = 8.0f;
        this.compositingStrategy = companion.m5415getAutoke2Ky5w();
        this.isInvalidated = true;
    }

    private final void applyClip() {
        boolean z = false;
        boolean z2 = getClip() && !this.outlineIsProvided;
        if (getClip() && this.outlineIsProvided) {
            z = true;
        }
        if (z2 != this.clipToBounds) {
            this.clipToBounds = z2;
            this.renderNode.setClipToBounds(z2);
        }
        if (z != this.clipToOutline) {
            this.clipToOutline = z;
            this.renderNode.setClipToOutline(z);
        }
    }

    /* renamed from: applyCompositingStrategy-Z1X6vPc, reason: not valid java name */
    private final void m5451applyCompositingStrategyZ1X6vPc(RenderNode renderNode, int i) {
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        if (CompositingStrategy.m5411equalsimpl0(i, companion.m5417getOffscreenke2Ky5w())) {
            renderNode.setUseCompositingLayer(true, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        boolean m5411equalsimpl0 = CompositingStrategy.m5411equalsimpl0(i, companion.m5416getModulateAlphake2Ky5w());
        Paint paint = this.layerPaint;
        if (m5411equalsimpl0) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
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

    private final boolean requiresCompositingLayer() {
        return CompositingStrategy.m5411equalsimpl0(mo5440getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m5417getOffscreenke2Ky5w()) || requiresLayerPaint() || getRenderEffect() != null;
    }

    private final boolean requiresLayerPaint() {
        return (BlendMode.m4670equalsimpl0(mo5439getBlendMode0nO6VwU(), BlendMode.Companion.m4701getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void updateLayerProperties() {
        boolean requiresCompositingLayer = requiresCompositingLayer();
        RenderNode renderNode = this.renderNode;
        if (requiresCompositingLayer) {
            m5451applyCompositingStrategyZ1X6vPc(renderNode, CompositingStrategy.Companion.m5417getOffscreenke2Ky5w());
        } else {
            m5451applyCompositingStrategyZ1X6vPc(renderNode, mo5440getCompositingStrategyke2Ky5w());
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public Matrix calculateMatrix() {
        Matrix matrix = this.matrix;
        if (matrix == null) {
            matrix = new Matrix();
            this.matrix = matrix;
        }
        this.renderNode.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void draw(Canvas canvas) {
        AndroidCanvas_androidKt.getNativeCanvas(canvas).drawRenderNode(this.renderNode);
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
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getClip() {
        return this.clip;
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
    public boolean getHasDisplayList() {
        return this.renderNode.hasDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getLayerId() {
        return this.renderNode.getUniqueId();
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
        RecordingCanvas beginRecording = this.renderNode.beginRecording();
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(beginRecording);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            DrawContext drawContext = this.canvasDrawScope.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setGraphicsLayer(graphicsLayer);
            drawContext.mo5257setSizeuvyYCjk(this.size);
            drawContext.setCanvas(androidCanvas);
            kyVar.invoke(this.canvasDrawScope);
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
            this.renderNode.endRecording();
            setInvalidated(false);
        } catch (Throwable th) {
            this.renderNode.endRecording();
            throw th;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setAlpha(float f) {
        this.alpha = f;
        this.renderNode.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setAmbientShadowColor-8_81llA */
    public void mo5443setAmbientShadowColor8_81llA(long j) {
        this.ambientShadowColor = j;
        this.renderNode.setAmbientShadowColor(ColorKt.m4815toArgb8_81llA(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setBlendMode-s9anfk8 */
    public void mo5444setBlendModes9anfk8(int i) {
        this.blendMode = i;
        obtainLayerPaint().setBlendMode(AndroidBlendMode_androidKt.m4608toAndroidBlendModes9anfk8(i));
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f) {
        this.cameraDistance = f;
        this.renderNode.setCameraDistance(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z) {
        this.clip = z;
        applyClip();
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
        this.renderNode.setOutline(outline);
        this.outlineIsProvided = outline != null;
        applyClip();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPivotOffset-k-4lQ0M */
    public void mo5447setPivotOffsetk4lQ0M(long j) {
        this.pivotOffset = j;
        long j2 = InlineClassHelperKt.DualUnsignedFloatMask & j;
        RenderNode renderNode = this.renderNode;
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.renderNode.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPosition-H0pRuoY */
    public void mo5448setPositionH0pRuoY(int i, int i2, long j) {
        this.renderNode.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.size = IntSizeKt.m7794toSizeozmzZPI(j);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeVerificationHelper.INSTANCE.setRenderEffect(this.renderNode, renderEffect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationX(float f) {
        this.rotationX = f;
        this.renderNode.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationY(float f) {
        this.rotationY = f;
        this.renderNode.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationZ(float f) {
        this.rotationZ = f;
        this.renderNode.setRotationZ(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleX(float f) {
        this.scaleX = f;
        this.renderNode.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleY(float f) {
        this.scaleY = f;
        this.renderNode.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setShadowElevation(float f) {
        this.shadowElevation = f;
        this.renderNode.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setSpotShadowColor-8_81llA */
    public void mo5449setSpotShadowColor8_81llA(long j) {
        this.spotShadowColor = j;
        this.renderNode.setSpotShadowColor(ColorKt.m4815toArgb8_81llA(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float f) {
        this.translationX = f;
        this.renderNode.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float f) {
        this.translationY = f;
        this.renderNode.setTranslationY(f);
    }

    public /* synthetic */ GraphicsLayerV29(long j, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i, dq dqVar) {
        this(j, (i & 2) != 0 ? new CanvasHolder() : canvasHolder, (i & 4) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
