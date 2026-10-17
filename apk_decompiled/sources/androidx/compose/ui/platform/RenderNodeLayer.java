package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import defpackage.dq;
import defpackage.iy;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {
    private my drawBlock;
    private boolean drawnWithZ;
    private float frameRate;
    private iy invalidateParentLayer;
    private boolean isDestroyed;
    private boolean isDirty;
    private boolean isFrameRateFromParent;
    private int mutatedFields;
    private final AndroidComposeView ownerView;
    private final DeviceRenderNode renderNode;
    private Paint softwareLayerPaint;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final my getMatrix = RenderNodeLayer$Companion$getMatrix$1.INSTANCE;
    private final OutlineResolver outlineResolver = new OutlineResolver();
    private final LayerMatrixCache<DeviceRenderNode> matrixCache = new LayerMatrixCache<>(getMatrix);
    private final CanvasHolder canvasHolder = new CanvasHolder();
    private long transformOrigin = TransformOrigin.Companion.m5174getCenterSzJe1aQ();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class UniqueDrawingIdApi29 {
        public static final UniqueDrawingIdApi29 INSTANCE = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        public static final long getUniqueDrawingId(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public RenderNodeLayer(AndroidComposeView androidComposeView, my myVar, iy iyVar) {
        this.ownerView = androidComposeView;
        this.drawBlock = myVar;
        this.invalidateParentLayer = iyVar;
        RenderNodeApi29 renderNodeApi29 = new RenderNodeApi29(androidComposeView);
        renderNodeApi29.setHasOverlappingRendering(true);
        renderNodeApi29.setClipToBounds(false);
        this.renderNode = renderNodeApi29;
    }

    private final void clipRenderNode(Canvas canvas) {
        if (this.renderNode.getClipToOutline() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.clipToOutline(canvas);
        }
    }

    private final void setDirty(boolean z) {
        if (z != this.isDirty) {
            this.isDirty = z;
            this.ownerView.notifyLayerIsDirty$ui(this, z);
        }
    }

    private final void triggerRepaint() {
        WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        if (this.renderNode.getHasDisplayList()) {
            this.renderNode.discardDisplayList();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        this.ownerView.requestClearInvalidObservations();
        this.ownerView.recycle$ui(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas, GraphicsLayer graphicsLayer) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            boolean z = this.renderNode.getElevation() > 0.0f;
            this.drawnWithZ = z;
            if (z) {
                canvas.enableZ();
            }
            this.renderNode.drawInto(nativeCanvas);
            if (this.drawnWithZ) {
                canvas.disableZ();
                return;
            }
            return;
        }
        float left = this.renderNode.getLeft();
        float top = this.renderNode.getTop();
        float right = this.renderNode.getRight();
        float bottom = this.renderNode.getBottom();
        if (this.renderNode.getAlpha() < 1.0f) {
            Paint paint = this.softwareLayerPaint;
            if (paint == null) {
                paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = paint;
            }
            paint.setAlpha(this.renderNode.getAlpha());
            nativeCanvas.saveLayer(left, top, right, bottom, AndroidPaint_androidKt.getNativePaint(paint));
        } else {
            canvas.save();
        }
        canvas.translate(left, top);
        canvas.mo4612concat58bKbWc(this.matrixCache.m6765calculateMatrixGrdbGEg(this.renderNode));
        clipRenderNode(canvas);
        my myVar = this.drawBlock;
        if (myVar != null) {
            myVar.invoke(canvas, null);
        }
        canvas.restore();
        setDirty(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public float getFrameRate() {
        return this.frameRate;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return UniqueDrawingIdApi29.getUniqueDrawingId(this.ownerView);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo6630getUnderlyingMatrixsQKQjiQ() {
        return this.matrixCache.m6765calculateMatrixGrdbGEg(this.renderNode);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo6631inverseTransform58bKbWc(float[] fArr) {
        float[] m6764calculateInverseMatrixbWbORWo = this.matrixCache.m6764calculateInverseMatrixbWbORWo(this.renderNode);
        if (m6764calculateInverseMatrixbWbORWo != null) {
            Matrix.m5024timesAssign58bKbWc(fArr, m6764calculateInverseMatrixbWbORWo);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public boolean isFrameRateFromParent() {
        return this.isFrameRateFromParent;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo6632isInLayerk4lQ0M(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (this.renderNode.getClipToBounds()) {
            return 0.0f <= intBitsToFloat && intBitsToFloat < ((float) this.renderNode.getWidth()) && 0.0f <= intBitsToFloat2 && intBitsToFloat2 < ((float) this.renderNode.getHeight());
        }
        if (this.renderNode.getClipToOutline()) {
            return this.outlineResolver.m6795isInOutlinek4lQ0M(j);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect, boolean z) {
        LayerMatrixCache<DeviceRenderNode> layerMatrixCache = this.matrixCache;
        if (z) {
            layerMatrixCache.mapInverse(this.renderNode, mutableRect);
        } else {
            layerMatrixCache.map(this.renderNode, mutableRect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo6633mapOffset8S9VItk(long j, boolean z) {
        LayerMatrixCache<DeviceRenderNode> layerMatrixCache = this.matrixCache;
        return z ? layerMatrixCache.m6767mapInverseR5De75A(this.renderNode, j) : layerMatrixCache.m6766mapR5De75A(this.renderNode, j);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo6634movegyyYBs(long j) {
        int left = this.renderNode.getLeft();
        int top = this.renderNode.getTop();
        int m7739getXimpl = IntOffset.m7739getXimpl(j);
        int m7740getYimpl = IntOffset.m7740getYimpl(j);
        if (left == m7739getXimpl && top == m7740getYimpl) {
            return;
        }
        if (left != m7739getXimpl) {
            this.renderNode.offsetLeftAndRight(m7739getXimpl - left);
        }
        if (top != m7740getYimpl) {
            this.renderNode.offsetTopAndBottom(m7740getYimpl - top);
        }
        triggerRepaint();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo6635resizeozmzZPI(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.renderNode.setPivotX(TransformOrigin.m5169getPivotFractionXimpl(this.transformOrigin) * i);
        this.renderNode.setPivotY(TransformOrigin.m5170getPivotFractionYimpl(this.transformOrigin) * i2);
        DeviceRenderNode deviceRenderNode = this.renderNode;
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + i, this.renderNode.getTop() + i2)) {
            this.renderNode.setOutline(this.outlineResolver.getAndroidOutline());
            invalidate();
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(my myVar, iy iyVar) {
        this.matrixCache.reset();
        setDirty(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = TransformOrigin.Companion.m5174getCenterSzJe1aQ();
        this.drawBlock = myVar;
        this.invalidateParentLayer = iyVar;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void setFrameRate(float f) {
        this.frameRate = f;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void setFrameRateFromParent(boolean z) {
        this.isFrameRateFromParent = z;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo6636transform58bKbWc(float[] fArr) {
        Matrix.m5024timesAssign58bKbWc(fArr, this.matrixCache.m6765calculateMatrixGrdbGEg(this.renderNode));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty || !this.renderNode.getHasDisplayList()) {
            Path clipPath = (!this.renderNode.getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) ? null : this.outlineResolver.getClipPath();
            my myVar = this.drawBlock;
            if (myVar != null) {
                this.renderNode.record(this.canvasHolder, clipPath, new RenderNodeLayer$updateDisplayList$1$1(myVar));
            }
            setDirty(false);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        iy iyVar;
        int mutatedFields$ui = reusableGraphicsLayerScope.getMutatedFields$ui() | this.mutatedFields;
        int i = mutatedFields$ui & Fields.TransformOrigin;
        if (i != 0) {
            this.transformOrigin = reusableGraphicsLayerScope.mo4957getTransformOriginSzJe1aQ();
        }
        boolean z = false;
        boolean z2 = this.renderNode.getClipToOutline() && !this.outlineResolver.getOutlineClipSupported();
        if ((mutatedFields$ui & 1) != 0) {
            this.renderNode.setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((mutatedFields$ui & 2) != 0) {
            this.renderNode.setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((mutatedFields$ui & 4) != 0) {
            this.renderNode.setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((mutatedFields$ui & 8) != 0) {
            this.renderNode.setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((mutatedFields$ui & 16) != 0) {
            this.renderNode.setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((mutatedFields$ui & 32) != 0) {
            this.renderNode.setElevation(reusableGraphicsLayerScope.getShadowElevation());
        }
        if ((mutatedFields$ui & 64) != 0) {
            this.renderNode.setAmbientShadowColor(ColorKt.m4815toArgb8_81llA(reusableGraphicsLayerScope.mo4952getAmbientShadowColor0d7_KjU()));
        }
        if ((mutatedFields$ui & Fields.SpotShadowColor) != 0) {
            this.renderNode.setSpotShadowColor(ColorKt.m4815toArgb8_81llA(reusableGraphicsLayerScope.mo4956getSpotShadowColor0d7_KjU()));
        }
        if ((mutatedFields$ui & Fields.RotationZ) != 0) {
            this.renderNode.setRotationZ(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((mutatedFields$ui & Fields.RotationX) != 0) {
            this.renderNode.setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((mutatedFields$ui & Fields.RotationY) != 0) {
            this.renderNode.setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((mutatedFields$ui & Fields.CameraDistance) != 0) {
            this.renderNode.setCameraDistance(reusableGraphicsLayerScope.getCameraDistance());
        }
        if (i != 0) {
            this.renderNode.setPivotX(TransformOrigin.m5169getPivotFractionXimpl(this.transformOrigin) * this.renderNode.getWidth());
            this.renderNode.setPivotY(TransformOrigin.m5170getPivotFractionYimpl(this.transformOrigin) * this.renderNode.getHeight());
        }
        boolean z3 = reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() != RectangleShapeKt.getRectangleShape();
        if ((mutatedFields$ui & 24576) != 0) {
            this.renderNode.setClipToOutline(z3);
            this.renderNode.setClipToBounds(reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() == RectangleShapeKt.getRectangleShape());
        }
        if ((131072 & mutatedFields$ui) != 0) {
            this.renderNode.setRenderEffect(reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((262144 & mutatedFields$ui) != 0) {
            this.renderNode.setColorFilter(reusableGraphicsLayerScope.getColorFilter());
        }
        if ((524288 & mutatedFields$ui) != 0) {
            this.renderNode.mo6740setBlendModes9anfk8(reusableGraphicsLayerScope.mo4953getBlendMode0nO6VwU());
        }
        if ((32768 & mutatedFields$ui) != 0) {
            this.renderNode.mo6741setCompositingStrategyaDBOjCE(reusableGraphicsLayerScope.mo4954getCompositingStrategyNrFUSI());
        }
        boolean m6796updateS_szKao = this.outlineResolver.m6796updateS_szKao(reusableGraphicsLayerScope.getOutline$ui(), reusableGraphicsLayerScope.getAlpha(), z3, reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.mo4955getSizeNHjbRc());
        if (this.outlineResolver.getCacheIsDirty$ui()) {
            this.renderNode.setOutline(this.outlineResolver.getAndroidOutline());
        }
        if (z3 && !this.outlineResolver.getOutlineClipSupported()) {
            z = true;
        }
        if (z2 != z || (z && m6796updateS_szKao)) {
            invalidate();
        } else {
            triggerRepaint();
        }
        if (!this.drawnWithZ && this.renderNode.getElevation() > 0.0f && (iyVar = this.invalidateParentLayer) != null) {
            iyVar.invoke();
        }
        if ((mutatedFields$ui & Fields.MatrixAffectingFields) != 0) {
            this.matrixCache.invalidate();
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }
}
