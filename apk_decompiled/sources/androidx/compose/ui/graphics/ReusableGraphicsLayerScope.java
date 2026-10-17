package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {
    public static final int $stable = 0;
    private boolean clip;
    private ColorFilter colorFilter;
    private int mutatedFields;
    private Outline outline;
    private RenderEffect renderEffect;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float shadowElevation;
    private float translationX;
    private float translationY;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float alpha = 1.0f;
    private long ambientShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
    private long spotShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
    private float cameraDistance = 8.0f;
    private long transformOrigin = TransformOrigin.Companion.m5174getCenterSzJe1aQ();
    private Shape shape = RectangleShapeKt.getRectangleShape();
    private int compositingStrategy = CompositingStrategy.Companion.m4850getAutoNrFUSI();
    private long size = Size.Companion.m4593getUnspecifiedNHjbRc();
    private Density graphicsDensity = DensityKt.Density$default(1.0f, 0.0f, 2, null);
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private int blendMode = BlendMode.Companion.m4701getSrcOver0nO6VwU();

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getAmbientShadowColor-0d7_KjU */
    public long mo4952getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getBlendMode-0nO6VwU */
    public int mo4953getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getCompositingStrategy--NrFUSI */
    public int mo4954getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    public final Density getGraphicsDensity$ui() {
        return this.graphicsDensity;
    }

    public final LayoutDirection getLayoutDirection$ui() {
        return this.layoutDirection;
    }

    public final int getMutatedFields$ui() {
        return this.mutatedFields;
    }

    public final Outline getOutline$ui() {
        return this.outline;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getSize-NH-jbRc */
    public long mo4955getSizeNHjbRc() {
        return this.size;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getSpotShadowColor-0d7_KjU */
    public long mo4956getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getTransformOrigin-SzJe1aQ */
    public long mo4957getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getTranslationY() {
        return this.translationY;
    }

    public final void reset() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setShadowElevation(0.0f);
        mo4958setAmbientShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        mo4961setSpotShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        setRotationX(0.0f);
        setRotationY(0.0f);
        setRotationZ(0.0f);
        setCameraDistance(8.0f);
        mo4962setTransformOrigin__ExYCQ(TransformOrigin.Companion.m5174getCenterSzJe1aQ());
        setShape(RectangleShapeKt.getRectangleShape());
        setClip(false);
        setRenderEffect(null);
        setColorFilter(null);
        mo4959setBlendModes9anfk8(BlendMode.Companion.m4701getSrcOver0nO6VwU());
        mo4960setCompositingStrategyaDBOjCE(CompositingStrategy.Companion.m4850getAutoNrFUSI());
        m5089setSizeuvyYCjk(Size.Companion.m4593getUnspecifiedNHjbRc());
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setAlpha(float f) {
        if (this.alpha == f) {
            return;
        }
        this.mutatedFields |= 4;
        this.alpha = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setAmbientShadowColor-8_81llA */
    public void mo4958setAmbientShadowColor8_81llA(long j) {
        if (Color.m4762equalsimpl0(this.ambientShadowColor, j)) {
            return;
        }
        this.mutatedFields |= 64;
        this.ambientShadowColor = j;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setBlendMode-s9anfk8 */
    public void mo4959setBlendModes9anfk8(int i) {
        if (BlendMode.m4670equalsimpl0(this.blendMode, i)) {
            return;
        }
        this.mutatedFields |= Fields.BlendMode;
        this.blendMode = i;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setCameraDistance(float f) {
        if (this.cameraDistance == f) {
            return;
        }
        this.mutatedFields |= Fields.CameraDistance;
        this.cameraDistance = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setClip(boolean z) {
        if (this.clip != z) {
            this.mutatedFields |= Fields.Clip;
            this.clip = z;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setColorFilter(ColorFilter colorFilter) {
        if (q10.b(this.colorFilter, colorFilter)) {
            return;
        }
        this.mutatedFields |= Fields.ColorFilter;
        this.colorFilter = colorFilter;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setCompositingStrategy-aDBOjCE */
    public void mo4960setCompositingStrategyaDBOjCE(int i) {
        if (CompositingStrategy.m4846equalsimpl0(this.compositingStrategy, i)) {
            return;
        }
        this.mutatedFields |= Fields.CompositingStrategy;
        this.compositingStrategy = i;
    }

    public final void setGraphicsDensity$ui(Density density) {
        this.graphicsDensity = density;
    }

    public final void setLayoutDirection$ui(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    public final void setMutatedFields$ui(int i) {
        this.mutatedFields = i;
    }

    public final void setOutline$ui(Outline outline) {
        this.outline = outline;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRenderEffect(RenderEffect renderEffect) {
        if (q10.b(this.renderEffect, renderEffect)) {
            return;
        }
        this.mutatedFields |= Fields.RenderEffect;
        this.renderEffect = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationX(float f) {
        if (this.rotationX == f) {
            return;
        }
        this.mutatedFields |= Fields.RotationX;
        this.rotationX = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationY(float f) {
        if (this.rotationY == f) {
            return;
        }
        this.mutatedFields |= Fields.RotationY;
        this.rotationY = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationZ(float f) {
        if (this.rotationZ == f) {
            return;
        }
        this.mutatedFields |= Fields.RotationZ;
        this.rotationZ = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setScaleX(float f) {
        if (this.scaleX == f) {
            return;
        }
        this.mutatedFields |= 1;
        this.scaleX = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setScaleY(float f) {
        if (this.scaleY == f) {
            return;
        }
        this.mutatedFields |= 2;
        this.scaleY = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setShadowElevation(float f) {
        if (this.shadowElevation == f) {
            return;
        }
        this.mutatedFields |= 32;
        this.shadowElevation = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setShape(Shape shape) {
        if (q10.b(this.shape, shape)) {
            return;
        }
        this.mutatedFields |= 8192;
        this.shape = shape;
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public void m5089setSizeuvyYCjk(long j) {
        this.size = j;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setSpotShadowColor-8_81llA */
    public void mo4961setSpotShadowColor8_81llA(long j) {
        if (Color.m4762equalsimpl0(this.spotShadowColor, j)) {
            return;
        }
        this.mutatedFields |= Fields.SpotShadowColor;
        this.spotShadowColor = j;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setTransformOrigin-__ExYCQ */
    public void mo4962setTransformOrigin__ExYCQ(long j) {
        if (TransformOrigin.m5168equalsimpl0(this.transformOrigin, j)) {
            return;
        }
        this.mutatedFields |= Fields.TransformOrigin;
        this.transformOrigin = j;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setTranslationX(float f) {
        if (this.translationX == f) {
            return;
        }
        this.mutatedFields |= 8;
        this.translationX = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setTranslationY(float f) {
        if (this.translationY == f) {
            return;
        }
        this.mutatedFields |= 16;
        this.translationY = f;
    }

    public final void updateOutline$ui() {
        this.outline = getShape().mo283createOutlinePq9zytI(mo4955getSizeNHjbRc(), this.layoutDirection, this.graphicsDensity);
    }
}
