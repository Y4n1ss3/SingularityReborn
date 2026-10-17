package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.CompositingStrategy;
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
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ViewLayer extends View implements OwnedLayer, GraphicLayerInfo {
    private static boolean hasRetrievedMethod;
    private static Field recreateDisplayList;
    private static boolean shouldUseDispatchDraw;
    private static Method updateDisplayListIfDirtyMethod;
    private final CanvasHolder canvasHolder;
    private Rect clipBoundsCache;
    private boolean clipToBounds;
    private final DrawChildContainer container;
    private my drawBlock;
    private boolean drawnWithZ;
    private float frameRate;
    private iy invalidateParentLayer;
    private boolean isFrameRateFromParent;
    private boolean isInvalidated;
    private final long layerId;
    private Paint layerPaint;
    private boolean mHasOverlappingRendering;
    private long mTransformOrigin;
    private final LayerMatrixCache<View> matrixCache;
    private int mutatedFields;
    private final OutlineResolver outlineResolver;
    private final AndroidComposeView ownerView;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final my getMatrix = ViewLayer$Companion$getMatrix$1.INSTANCE;
    private static final ViewOutlineProvider OutlineProvider = new ViewOutlineProvider() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            OutlineResolver outlineResolver;
            view.getClass();
            outlineResolver = ((ViewLayer) view).outlineResolver;
            Outline androidOutline = outlineResolver.getAndroidOutline();
            androidOutline.getClass();
            outline.set(androidOutline);
        }
    };

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class UniqueDrawingIdApi29 {
        public static final UniqueDrawingIdApi29 INSTANCE = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        public static final long getUniqueDrawingId(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, my myVar, iy iyVar) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.drawBlock = myVar;
        this.invalidateParentLayer = iyVar;
        this.outlineResolver = new OutlineResolver();
        this.canvasHolder = new CanvasHolder();
        this.matrixCache = new LayerMatrixCache<>(getMatrix);
        this.mTransformOrigin = TransformOrigin.Companion.m5174getCenterSzJe1aQ();
        this.mHasOverlappingRendering = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.layerId = View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (!getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) {
            return null;
        }
        return this.outlineResolver.getClipPath();
    }

    private final Paint obtainLayerPaint() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        this.layerPaint = Paint;
        return Paint;
    }

    private final void resetClipBounds() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.getClass();
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void setInvalidated(boolean z) {
        if (z != this.isInvalidated) {
            this.isInvalidated = z;
            this.ownerView.notifyLayerIsDirty$ui(this, z);
        }
    }

    private final void updateOutlineResolver() {
        setOutlineProvider(this.outlineResolver.getAndroidOutline() != null ? OutlineProvider : null);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        setInvalidated(false);
        this.ownerView.requestClearInvalidObservations();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.recycle$ui(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        CanvasHolder canvasHolder = this.canvasHolder;
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z = false;
        } else {
            androidCanvas.save();
            this.outlineResolver.clipToOutline(androidCanvas);
            z = true;
        }
        my myVar = this.drawBlock;
        if (myVar != null) {
            myVar.invoke(androidCanvas, null);
        }
        if (z) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(androidx.compose.ui.graphics.Canvas canvas, GraphicsLayer graphicsLayer) {
        boolean z = getElevation() > 0.0f;
        this.drawnWithZ = z;
        if (z) {
            canvas.enableZ();
        }
        this.container.drawChild$ui(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.disableZ();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final DrawChildContainer getContainer() {
        return this.container;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public float getFrameRate() {
        return this.frameRate;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.layerId;
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
        return this.matrixCache.m6765calculateMatrixGrdbGEg(this);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // android.view.View, androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo6631inverseTransform58bKbWc(float[] fArr) {
        float[] m6764calculateInverseMatrixbWbORWo = this.matrixCache.m6764calculateInverseMatrixbWbORWo(this);
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
        if (this.clipToBounds) {
            return 0.0f <= intBitsToFloat && intBitsToFloat < ((float) getWidth()) && 0.0f <= intBitsToFloat2 && intBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.m6795isInOutlinek4lQ0M(j);
        }
        return true;
    }

    public final boolean isInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect, boolean z) {
        LayerMatrixCache<View> layerMatrixCache = this.matrixCache;
        if (z) {
            layerMatrixCache.mapInverse(this, mutableRect);
        } else {
            layerMatrixCache.map(this, mutableRect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo6633mapOffset8S9VItk(long j, boolean z) {
        LayerMatrixCache<View> layerMatrixCache = this.matrixCache;
        return z ? layerMatrixCache.m6767mapInverseR5De75A(this, j) : layerMatrixCache.m6766mapR5De75A(this, j);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo6634movegyyYBs(long j) {
        int m7739getXimpl = IntOffset.m7739getXimpl(j);
        if (m7739getXimpl != getLeft()) {
            offsetLeftAndRight(m7739getXimpl - getLeft());
            this.matrixCache.invalidate();
        }
        int m7740getYimpl = IntOffset.m7740getYimpl(j);
        if (m7740getYimpl != getTop()) {
            offsetTopAndBottom(m7740getYimpl - getTop());
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo6635resizeozmzZPI(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (i == getWidth() && i2 == getHeight()) {
            return;
        }
        setPivotX(TransformOrigin.m5169getPivotFractionXimpl(this.mTransformOrigin) * i);
        setPivotY(TransformOrigin.m5170getPivotFractionYimpl(this.mTransformOrigin) * i2);
        updateOutlineResolver();
        layout(getLeft(), getTop(), getLeft() + i, getTop() + i2);
        resetClipBounds();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(my myVar, iy iyVar) {
        this.container.addView(this);
        this.matrixCache.reset();
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = TransformOrigin.Companion.m5174getCenterSzJe1aQ();
        this.drawBlock = myVar;
        this.invalidateParentLayer = iyVar;
        setInvalidated(false);
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
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
        Matrix.m5024timesAssign58bKbWc(fArr, this.matrixCache.m6765calculateMatrixGrdbGEg(this));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (!this.isInvalidated || shouldUseDispatchDraw) {
            return;
        }
        Companion.updateDisplayList(this);
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        iy iyVar;
        int mutatedFields$ui = reusableGraphicsLayerScope.getMutatedFields$ui() | this.mutatedFields;
        if ((mutatedFields$ui & Fields.TransformOrigin) != 0) {
            long mo4957getTransformOriginSzJe1aQ = reusableGraphicsLayerScope.mo4957getTransformOriginSzJe1aQ();
            this.mTransformOrigin = mo4957getTransformOriginSzJe1aQ;
            setPivotX(TransformOrigin.m5169getPivotFractionXimpl(mo4957getTransformOriginSzJe1aQ) * getWidth());
            setPivotY(TransformOrigin.m5170getPivotFractionYimpl(this.mTransformOrigin) * getHeight());
        }
        if ((mutatedFields$ui & 1) != 0) {
            setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((mutatedFields$ui & 2) != 0) {
            setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((mutatedFields$ui & 4) != 0) {
            setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((mutatedFields$ui & 8) != 0) {
            setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((mutatedFields$ui & 16) != 0) {
            setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((mutatedFields$ui & 32) != 0) {
            setElevation(reusableGraphicsLayerScope.getShadowElevation());
        }
        if ((mutatedFields$ui & Fields.RotationZ) != 0) {
            setRotation(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((mutatedFields$ui & Fields.RotationX) != 0) {
            setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((mutatedFields$ui & Fields.RotationY) != 0) {
            setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((mutatedFields$ui & Fields.CameraDistance) != 0) {
            setCameraDistancePx(reusableGraphicsLayerScope.getCameraDistance());
        }
        boolean z = false;
        boolean z2 = getManualClipPath() != null;
        boolean z3 = reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() != RectangleShapeKt.getRectangleShape();
        if ((mutatedFields$ui & 24576) != 0) {
            this.clipToBounds = reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() == RectangleShapeKt.getRectangleShape();
            resetClipBounds();
            setClipToOutline(z3);
        }
        boolean m6796updateS_szKao = this.outlineResolver.m6796updateS_szKao(reusableGraphicsLayerScope.getOutline$ui(), reusableGraphicsLayerScope.getAlpha(), z3, reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.mo4955getSizeNHjbRc());
        if (this.outlineResolver.getCacheIsDirty$ui()) {
            updateOutlineResolver();
        }
        boolean z4 = getManualClipPath() != null;
        if (z2 != z4 || (z4 && m6796updateS_szKao)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (iyVar = this.invalidateParentLayer) != null) {
            iyVar.invoke();
        }
        if ((mutatedFields$ui & Fields.MatrixAffectingFields) != 0) {
            this.matrixCache.invalidate();
        }
        if ((mutatedFields$ui & 64) != 0) {
            ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this, ColorKt.m4815toArgb8_81llA(reusableGraphicsLayerScope.mo4952getAmbientShadowColor0d7_KjU()));
        }
        if ((mutatedFields$ui & Fields.SpotShadowColor) != 0) {
            ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this, ColorKt.m4815toArgb8_81llA(reusableGraphicsLayerScope.mo4956getSpotShadowColor0d7_KjU()));
        }
        if (Build.VERSION.SDK_INT >= 31 && (131072 & mutatedFields$ui) != 0) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this, reusableGraphicsLayerScope.getRenderEffect());
        }
        boolean z5 = ((262144 & mutatedFields$ui) == 0 && (524288 & mutatedFields$ui) == 0) ? false : true;
        if ((mutatedFields$ui & Fields.CompositingStrategy) != 0 || z5) {
            int m4852getOffscreenNrFUSI = z5 ? CompositingStrategy.Companion.m4852getOffscreenNrFUSI() : reusableGraphicsLayerScope.mo4954getCompositingStrategyNrFUSI();
            CompositingStrategy.Companion companion = CompositingStrategy.Companion;
            android.graphics.Paint paint = null;
            if (CompositingStrategy.m4846equalsimpl0(m4852getOffscreenNrFUSI, companion.m4852getOffscreenNrFUSI())) {
                if (z5) {
                    Paint obtainLayerPaint = obtainLayerPaint();
                    obtainLayerPaint.setColorFilter(reusableGraphicsLayerScope.getColorFilter());
                    obtainLayerPaint.mo4636setBlendModes9anfk8(reusableGraphicsLayerScope.mo4953getBlendMode0nO6VwU());
                    paint = AndroidPaint_androidKt.getNativePaint(obtainLayerPaint);
                }
                setLayerType(2, paint);
            } else if (CompositingStrategy.m4846equalsimpl0(m4852getOffscreenNrFUSI, companion.m4851getModulateAlphaNrFUSI())) {
                setLayerType(0, null);
                this.mHasOverlappingRendering = z;
            } else {
                setLayerType(0, null);
            }
            z = true;
            this.mHasOverlappingRendering = z;
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final boolean getHasRetrievedMethod() {
            return ViewLayer.hasRetrievedMethod;
        }

        public final ViewOutlineProvider getOutlineProvider() {
            return ViewLayer.OutlineProvider;
        }

        public final boolean getShouldUseDispatchDraw() {
            return ViewLayer.shouldUseDispatchDraw;
        }

        public final void setShouldUseDispatchDraw$ui(boolean z) {
            ViewLayer.shouldUseDispatchDraw = z;
        }

        public final void updateDisplayList(View view) {
            try {
                if (!getHasRetrievedMethod()) {
                    ViewLayer.hasRetrievedMethod = true;
                    ViewLayer.updateDisplayListIfDirtyMethod = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    ViewLayer.recreateDisplayList = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    Method method = ViewLayer.updateDisplayListIfDirtyMethod;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.recreateDisplayList;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.recreateDisplayList;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.updateDisplayListIfDirtyMethod;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                setShouldUseDispatchDraw$ui(true);
            }
        }

        private Companion() {
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
