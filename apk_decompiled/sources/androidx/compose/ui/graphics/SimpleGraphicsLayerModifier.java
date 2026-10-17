package androidx.compose.ui.graphics;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.dq;
import defpackage.kp0;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SimpleGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode, SemanticsModifierNode {
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;
    private float cameraDistance;
    private boolean clip;
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private final boolean isImportantForBounds;
    private ky layerBlock;
    private RenderEffect renderEffect;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private Shape shape;
    private long spotShadowColor;
    private long transformOrigin;
    private float translationX;
    private float translationY;

    public /* synthetic */ SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, int i2, ColorFilter colorFilter, int i3, dq dqVar) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, (i3 & 65536) != 0 ? CompositingStrategy.Companion.m4850getAutoNrFUSI() : i, (i3 & Fields.RenderEffect) != 0 ? BlendMode.Companion.m4701getSrcOver0nO6VwU() : i2, (i3 & Fields.ColorFilter) != 0 ? null : colorFilter, null);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (ComposeUiFlags.isGraphicsLayerShapeSemanticsEnabled && this.clip) {
            SemanticsPropertiesKt.setShape(semanticsPropertyReceiver, this.shape);
        }
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m5107getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m5108getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m5109getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    public final Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m5110getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m5111getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void invalidateLayerBlock() {
        LayoutModifierNodeKt.updateLayerBlock(this, this.layerBlock);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean isImportantForBounds() {
        return this.isImportantForBounds;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new SimpleGraphicsLayerModifier$measure$1(mo6234measureBRTryo0, this), 4, null);
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m5112setAmbientShadowColor8_81llA(long j) {
        this.ambientShadowColor = j;
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m5113setBlendModes9anfk8(int i) {
        this.blendMode = i;
    }

    public final void setCameraDistance(float f) {
        this.cameraDistance = f;
    }

    public final void setClip(boolean z) {
        this.clip = z;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m5114setCompositingStrategyaDBOjCE(int i) {
        this.compositingStrategy = i;
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public final void setRotationX(float f) {
        this.rotationX = f;
    }

    public final void setRotationY(float f) {
        this.rotationY = f;
    }

    public final void setRotationZ(float f) {
        this.rotationZ = f;
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
    }

    public final void setShadowElevation(float f) {
        this.shadowElevation = f;
    }

    public final void setShape(Shape shape) {
        this.shape = shape;
    }

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m5115setSpotShadowColor8_81llA(long j) {
        this.spotShadowColor = j;
    }

    /* renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    public final void m5116setTransformOrigin__ExYCQ(long j) {
        this.transformOrigin = j;
    }

    public final void setTranslationX(float f) {
        this.translationX = f;
    }

    public final void setTranslationY(float f) {
        this.translationY = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.scaleX);
        sb.append(", scaleY=");
        sb.append(this.scaleY);
        sb.append(", alpha = ");
        sb.append(this.alpha);
        sb.append(", translationX=");
        sb.append(this.translationX);
        sb.append(", translationY=");
        sb.append(this.translationY);
        sb.append(", shadowElevation=");
        sb.append(this.shadowElevation);
        sb.append(", rotationX=");
        sb.append(this.rotationX);
        sb.append(", rotationY=");
        sb.append(this.rotationY);
        sb.append(", rotationZ=");
        sb.append(this.rotationZ);
        sb.append(", cameraDistance=");
        sb.append(this.cameraDistance);
        sb.append(", transformOrigin=");
        sb.append((Object) TransformOrigin.m5172toStringimpl(this.transformOrigin));
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(", clip=");
        sb.append(this.clip);
        sb.append(", renderEffect=");
        sb.append(this.renderEffect);
        sb.append(", ambientShadowColor=");
        kp0.i(this.ambientShadowColor, sb, ", spotShadowColor=");
        kp0.i(this.spotShadowColor, sb, ", compositingStrategy=");
        sb.append((Object) CompositingStrategy.m4848toStringimpl(this.compositingStrategy));
        sb.append(", blendMode=");
        sb.append((Object) BlendMode.m4672toStringimpl(this.blendMode));
        sb.append(", colorFilter=");
        sb.append(this.colorFilter);
        sb.append(')');
        return sb.toString();
    }

    private SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, int i2, ColorFilter colorFilter) {
        this.scaleX = f;
        this.scaleY = f2;
        this.alpha = f3;
        this.translationX = f4;
        this.translationY = f5;
        this.shadowElevation = f6;
        this.rotationX = f7;
        this.rotationY = f8;
        this.rotationZ = f9;
        this.cameraDistance = f10;
        this.transformOrigin = j;
        this.shape = shape;
        this.clip = z;
        this.renderEffect = renderEffect;
        this.ambientShadowColor = j2;
        this.spotShadowColor = j3;
        this.compositingStrategy = i;
        this.blendMode = i2;
        this.colorFilter = colorFilter;
        this.layerBlock = new SimpleGraphicsLayerModifier$layerBlock$1(this);
    }

    public /* synthetic */ SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, int i2, ColorFilter colorFilter, dq dqVar) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, i, i2, colorFilter);
    }
}
