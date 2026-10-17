package androidx.compose.ui.platform;

import android.os.Build;
import androidx.compose.ui.FrameRateCategory;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class GraphicsLayerOwnerLayer implements OwnedLayer, GraphicLayerInfo {
    public static final int $stable = 8;
    private final GraphicsContext context;
    private my drawBlock;
    private boolean drawnWithEnabledZ;
    private float frameRate;
    private GraphicsLayer graphicsLayer;
    private iy invalidateParentLayer;
    private float[] inverseMatrixCache;
    private boolean isDestroyed;
    private boolean isDirty;
    private boolean isFrameRateFromParent;
    private boolean isInverseMatrixDirty;
    private boolean isMatrixDirty;
    private int mutatedFields;
    private Outline outline;
    private final AndroidComposeView ownerView;
    private long size = IntSize.m7777constructorimpl(InlineClassHelperKt.DualUnsignedFloatMask);
    private final float[] matrixCache = Matrix.m5005constructorimpl$default(null, 1, null);
    private Density density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private final CanvasDrawScope scope = new CanvasDrawScope();
    private long transformOrigin = TransformOrigin.Companion.m5174getCenterSzJe1aQ();
    private boolean isIdentity = true;
    private final ky recordLambda = new GraphicsLayerOwnerLayer$recordLambda$1(this);

    public GraphicsLayerOwnerLayer(GraphicsLayer graphicsLayer, GraphicsContext graphicsContext, AndroidComposeView androidComposeView, my myVar, iy iyVar) {
        this.graphicsLayer = graphicsLayer;
        this.context = graphicsContext;
        this.ownerView = androidComposeView;
        this.drawBlock = myVar;
        this.invalidateParentLayer = iyVar;
    }

    /* renamed from: getInverseMatrix-3i98HWw, reason: not valid java name */
    private final float[] m6758getInverseMatrix3i98HWw() {
        float[] fArr = this.inverseMatrixCache;
        if (fArr == null) {
            fArr = Matrix.m5005constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArr;
        }
        if (!this.isInverseMatrixDirty) {
            if (Float.isNaN(fArr[0])) {
                return null;
            }
            return fArr;
        }
        this.isInverseMatrixDirty = false;
        float[] m6759getMatrixsQKQjiQ = m6759getMatrixsQKQjiQ();
        if (this.isIdentity) {
            return m6759getMatrixsQKQjiQ;
        }
        if (InvertMatrixKt.m6762invertToJiSxe2E(m6759getMatrixsQKQjiQ, fArr)) {
            return fArr;
        }
        fArr[0] = Float.NaN;
        return null;
    }

    /* renamed from: getMatrix-sQKQjiQ, reason: not valid java name */
    private final float[] m6759getMatrixsQKQjiQ() {
        updateMatrix();
        return this.matrixCache;
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

    private final void updateMatrix() {
        if (this.isMatrixDirty) {
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            long m4595getCenteruvyYCjk = (graphicsLayer.m5425getPivotOffsetF1C5BW0() & InlineClassHelperKt.DualUnsignedFloatMask) == InlineClassHelperKt.UnspecifiedPackedFloats ? SizeKt.m4595getCenteruvyYCjk(IntSizeKt.m7794toSizeozmzZPI(this.size)) : graphicsLayer.m5425getPivotOffsetF1C5BW0();
            Matrix.m5016resetToPivotedTransformimpl$default(this.matrixCache, Float.intBitsToFloat((int) (m4595getCenteruvyYCjk >> 32)), Float.intBitsToFloat((int) (m4595getCenteruvyYCjk & 4294967295L)), graphicsLayer.getTranslationX(), graphicsLayer.getTranslationY(), 0.0f, graphicsLayer.getRotationX(), graphicsLayer.getRotationY(), graphicsLayer.getRotationZ(), graphicsLayer.getScaleX(), graphicsLayer.getScaleY(), 0.0f, 1040, null);
            this.isMatrixDirty = false;
            this.isIdentity = MatrixKt.m5030isIdentity58bKbWc(this.matrixCache);
        }
    }

    private final void updateOutline() {
        iy iyVar;
        Outline outline = this.outline;
        if (outline == null) {
            return;
        }
        GraphicsLayerKt.setOutline(this.graphicsLayer, outline);
        if (Build.VERSION.SDK_INT < 33) {
            if (((outline instanceof Outline.Generic) || ((outline instanceof Outline.Rounded) && !RoundRectKt.isSimple(((Outline.Rounded) outline).getRoundRect()))) && (iyVar = this.invalidateParentLayer) != null) {
                iyVar.invoke();
            }
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        setFrameRate(0.0f);
        setFrameRateFromParent(false);
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext != null) {
            graphicsContext.releaseGraphicsLayer(this.graphicsLayer);
            this.ownerView.recycle$ui(this);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas, GraphicsLayer graphicsLayer) {
        updateDisplayList();
        this.drawnWithEnabledZ = this.graphicsLayer.getShadowElevation() > 0.0f;
        DrawContext drawContext = this.scope.getDrawContext();
        drawContext.setCanvas(canvas);
        drawContext.setGraphicsLayer(graphicsLayer);
        GraphicsLayerKt.drawLayer(this.scope, this.graphicsLayer);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public float getFrameRate() {
        return this.frameRate;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.graphicsLayer.getLayerId();
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return this.graphicsLayer.getOwnerViewId();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo6630getUnderlyingMatrixsQKQjiQ() {
        return m6759getMatrixsQKQjiQ();
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
        float[] m6758getInverseMatrix3i98HWw = m6758getInverseMatrix3i98HWw();
        if (m6758getInverseMatrix3i98HWw != null) {
            Matrix.m5024timesAssign58bKbWc(fArr, m6758getInverseMatrix3i98HWw);
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
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (this.graphicsLayer.getClip()) {
            return ShapeContainingUtilKt.isInOutline$default(this.graphicsLayer.getOutline(), intBitsToFloat, intBitsToFloat2, null, null, 24, null);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect, boolean z) {
        float[] m6758getInverseMatrix3i98HWw = z ? m6758getInverseMatrix3i98HWw() : m6759getMatrixsQKQjiQ();
        if (this.isIdentity) {
            return;
        }
        if (m6758getInverseMatrix3i98HWw == null) {
            mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            Matrix.m5013mapimpl(m6758getInverseMatrix3i98HWw, mutableRect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo6633mapOffset8S9VItk(long j, boolean z) {
        float[] m6759getMatrixsQKQjiQ;
        if (z) {
            m6759getMatrixsQKQjiQ = m6758getInverseMatrix3i98HWw();
            if (m6759getMatrixsQKQjiQ == null) {
                return Offset.Companion.m4530getInfiniteF1C5BW0();
            }
        } else {
            m6759getMatrixsQKQjiQ = m6759getMatrixsQKQjiQ();
        }
        return this.isIdentity ? j : Matrix.m5011mapMKHz9U(m6759getMatrixsQKQjiQ, j);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo6634movegyyYBs(long j) {
        if (this.ownerView.isArrEnabled$ui()) {
            this.ownerView.voteFrameRate(FrameRateCategory.Companion.m4187getHighNSsRyOo());
        }
        this.graphicsLayer.m5437setTopLeftgyyYBs(j);
        triggerRepaint();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo6635resizeozmzZPI(long j) {
        if (IntSize.m7780equalsimpl0(j, this.size)) {
            return;
        }
        if (this.ownerView.isArrEnabled$ui()) {
            this.ownerView.voteFrameRate(FrameRateCategory.Companion.m4187getHighNSsRyOo());
        }
        this.size = j;
        invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(my myVar, iy iyVar) {
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext == null) {
            throw k4.a("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.graphicsLayer.isReleased()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("layer should have been released before reuse");
        }
        this.graphicsLayer = graphicsContext.createGraphicsLayer();
        this.isDestroyed = false;
        this.drawBlock = myVar;
        this.invalidateParentLayer = iyVar;
        this.isMatrixDirty = false;
        this.isInverseMatrixDirty = false;
        this.isIdentity = true;
        Matrix.m5014resetimpl(this.matrixCache);
        float[] fArr = this.inverseMatrixCache;
        if (fArr != null) {
            Matrix.m5014resetimpl(fArr);
        }
        this.transformOrigin = TransformOrigin.Companion.m5174getCenterSzJe1aQ();
        this.drawnWithEnabledZ = false;
        this.size = IntSize.m7777constructorimpl(InlineClassHelperKt.DualUnsignedFloatMask);
        this.outline = null;
        this.mutatedFields = 0;
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
        Matrix.m5024timesAssign58bKbWc(fArr, m6759getMatrixsQKQjiQ());
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.ownerView.isArrEnabled$ui() && getFrameRate() != 0.0f) {
            this.ownerView.voteFrameRate(getFrameRate());
        }
        if (this.isDirty) {
            if (!TransformOrigin.m5168equalsimpl0(this.transformOrigin, TransformOrigin.Companion.m5174getCenterSzJe1aQ()) && !IntSize.m7780equalsimpl0(this.graphicsLayer.m5426getSizeYbymL2g(), this.size)) {
                GraphicsLayer graphicsLayer = this.graphicsLayer;
                float m5169getPivotFractionXimpl = TransformOrigin.m5169getPivotFractionXimpl(this.transformOrigin) * ((int) (this.size >> 32));
                float m5170getPivotFractionYimpl = TransformOrigin.m5170getPivotFractionYimpl(this.transformOrigin) * ((int) (this.size & 4294967295L));
                graphicsLayer.m5433setPivotOffsetk4lQ0M(Offset.m4508constructorimpl((Float.floatToRawIntBits(m5170getPivotFractionYimpl) & 4294967295L) | (Float.floatToRawIntBits(m5169getPivotFractionXimpl) << 32)));
            }
            this.graphicsLayer.m5429recordmLhObY(this.density, this.layoutDirection, this.size, this.recordLambda);
            setDirty(false);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        int m5416getModulateAlphake2Ky5w;
        iy iyVar;
        int mutatedFields$ui = reusableGraphicsLayerScope.getMutatedFields$ui() | this.mutatedFields;
        this.layoutDirection = reusableGraphicsLayerScope.getLayoutDirection$ui();
        this.density = reusableGraphicsLayerScope.getGraphicsDensity$ui();
        int i = mutatedFields$ui & Fields.TransformOrigin;
        if (i != 0) {
            this.transformOrigin = reusableGraphicsLayerScope.mo4957getTransformOriginSzJe1aQ();
        }
        if ((mutatedFields$ui & 1) != 0) {
            this.graphicsLayer.setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((mutatedFields$ui & 2) != 0) {
            this.graphicsLayer.setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((mutatedFields$ui & 4) != 0) {
            this.graphicsLayer.setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((mutatedFields$ui & 8) != 0) {
            this.graphicsLayer.setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((mutatedFields$ui & 16) != 0) {
            this.graphicsLayer.setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((mutatedFields$ui & 32) != 0) {
            this.graphicsLayer.setShadowElevation(reusableGraphicsLayerScope.getShadowElevation());
            if (reusableGraphicsLayerScope.getShadowElevation() > 0.0f && !this.drawnWithEnabledZ && (iyVar = this.invalidateParentLayer) != null) {
                iyVar.invoke();
            }
        }
        if ((mutatedFields$ui & 64) != 0) {
            this.graphicsLayer.m5430setAmbientShadowColor8_81llA(reusableGraphicsLayerScope.mo4952getAmbientShadowColor0d7_KjU());
        }
        if ((mutatedFields$ui & Fields.SpotShadowColor) != 0) {
            this.graphicsLayer.m5436setSpotShadowColor8_81llA(reusableGraphicsLayerScope.mo4956getSpotShadowColor0d7_KjU());
        }
        if ((mutatedFields$ui & Fields.RotationZ) != 0) {
            this.graphicsLayer.setRotationZ(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((mutatedFields$ui & Fields.RotationX) != 0) {
            this.graphicsLayer.setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((mutatedFields$ui & Fields.RotationY) != 0) {
            this.graphicsLayer.setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((mutatedFields$ui & Fields.CameraDistance) != 0) {
            this.graphicsLayer.setCameraDistance(reusableGraphicsLayerScope.getCameraDistance());
        }
        if (i != 0) {
            boolean m5168equalsimpl0 = TransformOrigin.m5168equalsimpl0(this.transformOrigin, TransformOrigin.Companion.m5174getCenterSzJe1aQ());
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            if (m5168equalsimpl0) {
                graphicsLayer.m5433setPivotOffsetk4lQ0M(Offset.Companion.m4531getUnspecifiedF1C5BW0());
            } else {
                float m5169getPivotFractionXimpl = TransformOrigin.m5169getPivotFractionXimpl(this.transformOrigin) * ((int) (this.size >> 32));
                graphicsLayer.m5433setPivotOffsetk4lQ0M(Offset.m4508constructorimpl((Float.floatToRawIntBits(TransformOrigin.m5170getPivotFractionYimpl(this.transformOrigin) * ((int) (this.size & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(m5169getPivotFractionXimpl) << 32)));
            }
        }
        if ((mutatedFields$ui & Fields.Clip) != 0) {
            this.graphicsLayer.setClip(reusableGraphicsLayerScope.getClip());
        }
        if ((131072 & mutatedFields$ui) != 0) {
            this.graphicsLayer.setRenderEffect(reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((262144 & mutatedFields$ui) != 0) {
            this.graphicsLayer.setColorFilter(reusableGraphicsLayerScope.getColorFilter());
        }
        if ((524288 & mutatedFields$ui) != 0) {
            this.graphicsLayer.m5431setBlendModes9anfk8(reusableGraphicsLayerScope.mo4953getBlendMode0nO6VwU());
        }
        if ((32768 & mutatedFields$ui) != 0) {
            GraphicsLayer graphicsLayer2 = this.graphicsLayer;
            int mo4954getCompositingStrategyNrFUSI = reusableGraphicsLayerScope.mo4954getCompositingStrategyNrFUSI();
            CompositingStrategy.Companion companion = CompositingStrategy.Companion;
            if (CompositingStrategy.m4846equalsimpl0(mo4954getCompositingStrategyNrFUSI, companion.m4850getAutoNrFUSI())) {
                m5416getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.Companion.m5415getAutoke2Ky5w();
            } else if (CompositingStrategy.m4846equalsimpl0(mo4954getCompositingStrategyNrFUSI, companion.m4852getOffscreenNrFUSI())) {
                m5416getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.Companion.m5417getOffscreenke2Ky5w();
            } else {
                if (!CompositingStrategy.m4846equalsimpl0(mo4954getCompositingStrategyNrFUSI, companion.m4851getModulateAlphaNrFUSI())) {
                    o.f("Not supported composition strategy");
                    return;
                }
                m5416getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.Companion.m5416getModulateAlphake2Ky5w();
            }
            graphicsLayer2.m5432setCompositingStrategyWpw9cng(m5416getModulateAlphake2Ky5w);
        }
        boolean z = true;
        if ((mutatedFields$ui & Fields.MatrixAffectingFields) != 0) {
            this.isMatrixDirty = true;
            this.isInverseMatrixDirty = true;
        }
        if (q10.b(this.outline, reusableGraphicsLayerScope.getOutline$ui())) {
            z = false;
        } else {
            this.outline = reusableGraphicsLayerScope.getOutline$ui();
            updateOutline();
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui();
        if (mutatedFields$ui != 0 || z) {
            triggerRepaint();
            if (this.ownerView.isArrEnabled$ui()) {
                this.ownerView.voteFrameRate(getFrameRate());
            }
        }
    }
}
