package androidx.compose.ui.graphics;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.bv;
import defpackage.dq;
import defpackage.kp0;
import defpackage.q10;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class GraphicsLayerElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {
    private final float alpha;
    private final long ambientShadowColor;
    private final int blendMode;
    private final float cameraDistance;
    private final boolean clip;
    private final ColorFilter colorFilter;
    private final int compositingStrategy;
    private final RenderEffect renderEffect;
    private final float rotationX;
    private final float rotationY;
    private final float rotationZ;
    private final float scaleX;
    private final float scaleY;
    private final float shadowElevation;
    private final Shape shape;
    private final long spotShadowColor;
    private final long transformOrigin;
    private final float translationX;
    private final float translationY;

    private GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, int i2, ColorFilter colorFilter) {
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
    }

    /* renamed from: copy-cp5nf6A$default, reason: not valid java name */
    public static /* synthetic */ GraphicsLayerElement m4909copycp5nf6A$default(GraphicsLayerElement graphicsLayerElement, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, int i2, ColorFilter colorFilter, int i3, Object obj) {
        ColorFilter colorFilter2;
        int i4;
        float f11 = (i3 & 1) != 0 ? graphicsLayerElement.scaleX : f;
        float f12 = (i3 & 2) != 0 ? graphicsLayerElement.scaleY : f2;
        float f13 = (i3 & 4) != 0 ? graphicsLayerElement.alpha : f3;
        float f14 = (i3 & 8) != 0 ? graphicsLayerElement.translationX : f4;
        float f15 = (i3 & 16) != 0 ? graphicsLayerElement.translationY : f5;
        float f16 = (i3 & 32) != 0 ? graphicsLayerElement.shadowElevation : f6;
        float f17 = (i3 & 64) != 0 ? graphicsLayerElement.rotationX : f7;
        float f18 = (i3 & Fields.SpotShadowColor) != 0 ? graphicsLayerElement.rotationY : f8;
        float f19 = (i3 & Fields.RotationX) != 0 ? graphicsLayerElement.rotationZ : f9;
        float f20 = (i3 & Fields.RotationY) != 0 ? graphicsLayerElement.cameraDistance : f10;
        long j4 = (i3 & Fields.RotationZ) != 0 ? graphicsLayerElement.transformOrigin : j;
        Shape shape2 = (i3 & Fields.CameraDistance) != 0 ? graphicsLayerElement.shape : shape;
        boolean z2 = (i3 & Fields.TransformOrigin) != 0 ? graphicsLayerElement.clip : z;
        float f21 = f11;
        RenderEffect renderEffect2 = (i3 & 8192) != 0 ? graphicsLayerElement.renderEffect : renderEffect;
        long j5 = (i3 & Fields.Clip) != 0 ? graphicsLayerElement.ambientShadowColor : j2;
        long j6 = (i3 & Fields.CompositingStrategy) != 0 ? graphicsLayerElement.spotShadowColor : j3;
        int i5 = (i3 & 65536) != 0 ? graphicsLayerElement.compositingStrategy : i;
        int i6 = (i3 & Fields.RenderEffect) != 0 ? graphicsLayerElement.blendMode : i2;
        if ((i3 & Fields.ColorFilter) != 0) {
            i4 = i5;
            colorFilter2 = graphicsLayerElement.colorFilter;
        } else {
            colorFilter2 = colorFilter;
            i4 = i5;
        }
        return graphicsLayerElement.m4915copycp5nf6A(f21, f12, f13, f14, f15, f16, f17, f18, f19, f20, j4, shape2, z2, renderEffect2, j5, j6, i4, i6, colorFilter2);
    }

    public final float component1() {
        return this.scaleX;
    }

    public final float component10() {
        return this.cameraDistance;
    }

    /* renamed from: component11-SzJe1aQ, reason: not valid java name */
    public final long m4910component11SzJe1aQ() {
        return this.transformOrigin;
    }

    public final Shape component12() {
        return this.shape;
    }

    public final boolean component13() {
        return this.clip;
    }

    public final RenderEffect component14() {
        return this.renderEffect;
    }

    /* renamed from: component15-0d7_KjU, reason: not valid java name */
    public final long m4911component150d7_KjU() {
        return this.ambientShadowColor;
    }

    /* renamed from: component16-0d7_KjU, reason: not valid java name */
    public final long m4912component160d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: component17--NrFUSI, reason: not valid java name */
    public final int m4913component17NrFUSI() {
        return this.compositingStrategy;
    }

    /* renamed from: component18-0nO6VwU, reason: not valid java name */
    public final int m4914component180nO6VwU() {
        return this.blendMode;
    }

    public final ColorFilter component19() {
        return this.colorFilter;
    }

    public final float component2() {
        return this.scaleY;
    }

    public final float component3() {
        return this.alpha;
    }

    public final float component4() {
        return this.translationX;
    }

    public final float component5() {
        return this.translationY;
    }

    public final float component6() {
        return this.shadowElevation;
    }

    public final float component7() {
        return this.rotationX;
    }

    public final float component8() {
        return this.rotationY;
    }

    public final float component9() {
        return this.rotationZ;
    }

    /* renamed from: copy-cp5nf6A, reason: not valid java name */
    public final GraphicsLayerElement m4915copycp5nf6A(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, int i2, ColorFilter colorFilter) {
        return new GraphicsLayerElement(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, i, i2, colorFilter, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SimpleGraphicsLayerModifier create() {
        return new SimpleGraphicsLayerModifier(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, this.renderEffect, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, this.blendMode, this.colorFilter, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.scaleX, graphicsLayerElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerElement.alpha) == 0 && Float.compare(this.translationX, graphicsLayerElement.translationX) == 0 && Float.compare(this.translationY, graphicsLayerElement.translationY) == 0 && Float.compare(this.shadowElevation, graphicsLayerElement.shadowElevation) == 0 && Float.compare(this.rotationX, graphicsLayerElement.rotationX) == 0 && Float.compare(this.rotationY, graphicsLayerElement.rotationY) == 0 && Float.compare(this.rotationZ, graphicsLayerElement.rotationZ) == 0 && Float.compare(this.cameraDistance, graphicsLayerElement.cameraDistance) == 0 && TransformOrigin.m5168equalsimpl0(this.transformOrigin, graphicsLayerElement.transformOrigin) && q10.b(this.shape, graphicsLayerElement.shape) && this.clip == graphicsLayerElement.clip && q10.b(this.renderEffect, graphicsLayerElement.renderEffect) && Color.m4762equalsimpl0(this.ambientShadowColor, graphicsLayerElement.ambientShadowColor) && Color.m4762equalsimpl0(this.spotShadowColor, graphicsLayerElement.spotShadowColor) && CompositingStrategy.m4846equalsimpl0(this.compositingStrategy, graphicsLayerElement.compositingStrategy) && BlendMode.m4670equalsimpl0(this.blendMode, graphicsLayerElement.blendMode) && q10.b(this.colorFilter, graphicsLayerElement.colorFilter);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m4916getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m4917getBlendMode0nO6VwU() {
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
    public final int m4918getCompositingStrategyNrFUSI() {
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

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m4919getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m4920getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int c = kp0.c((this.shape.hashCode() + ((TransformOrigin.m5171hashCodeimpl(this.transformOrigin) + bv.a(this.cameraDistance, bv.a(this.rotationZ, bv.a(this.rotationY, bv.a(this.rotationX, bv.a(this.shadowElevation, bv.a(this.translationY, bv.a(this.translationX, bv.a(this.alpha, bv.a(this.scaleY, Float.hashCode(this.scaleX) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31, 31, this.clip);
        RenderEffect renderEffect = this.renderEffect;
        int m4671hashCodeimpl = (BlendMode.m4671hashCodeimpl(this.blendMode) + ((CompositingStrategy.m4847hashCodeimpl(this.compositingStrategy) + kp0.d(this.spotShadowColor, kp0.d(this.ambientShadowColor, (c + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31, 31), 31)) * 31)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return m4671hashCodeimpl + (colorFilter != null ? colorFilter.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("scaleX", Float.valueOf(this.scaleX));
        inspectorInfo.getProperties().set("scaleY", Float.valueOf(this.scaleY));
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("translationX", Float.valueOf(this.translationX));
        inspectorInfo.getProperties().set("translationY", Float.valueOf(this.translationY));
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.shadowElevation));
        inspectorInfo.getProperties().set("rotationX", Float.valueOf(this.rotationX));
        inspectorInfo.getProperties().set("rotationY", Float.valueOf(this.rotationY));
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.rotationZ));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(this.cameraDistance));
        inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m5161boximpl(this.transformOrigin));
        inspectorInfo.getProperties().set("shape", this.shape);
        uf.d(this.clip, inspectorInfo.getProperties(), "clip", inspectorInfo).set("renderEffect", this.renderEffect);
        inspectorInfo.getProperties().set("ambientShadowColor", Color.m4751boximpl(this.ambientShadowColor));
        inspectorInfo.getProperties().set("spotShadowColor", Color.m4751boximpl(this.spotShadowColor));
        inspectorInfo.getProperties().set("compositingStrategy", CompositingStrategy.m4843boximpl(this.compositingStrategy));
        inspectorInfo.getProperties().set("blendMode", BlendMode.m4667boximpl(this.blendMode));
        inspectorInfo.getProperties().set("colorFilter", this.colorFilter);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.scaleX);
        sb.append(", scaleY=");
        sb.append(this.scaleY);
        sb.append(", alpha=");
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

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        simpleGraphicsLayerModifier.setScaleX(this.scaleX);
        simpleGraphicsLayerModifier.setScaleY(this.scaleY);
        simpleGraphicsLayerModifier.setAlpha(this.alpha);
        simpleGraphicsLayerModifier.setTranslationX(this.translationX);
        simpleGraphicsLayerModifier.setTranslationY(this.translationY);
        simpleGraphicsLayerModifier.setShadowElevation(this.shadowElevation);
        simpleGraphicsLayerModifier.setRotationX(this.rotationX);
        simpleGraphicsLayerModifier.setRotationY(this.rotationY);
        simpleGraphicsLayerModifier.setRotationZ(this.rotationZ);
        simpleGraphicsLayerModifier.setCameraDistance(this.cameraDistance);
        simpleGraphicsLayerModifier.m5116setTransformOrigin__ExYCQ(this.transformOrigin);
        simpleGraphicsLayerModifier.setShape(this.shape);
        simpleGraphicsLayerModifier.setClip(this.clip);
        simpleGraphicsLayerModifier.setRenderEffect(this.renderEffect);
        simpleGraphicsLayerModifier.m5112setAmbientShadowColor8_81llA(this.ambientShadowColor);
        simpleGraphicsLayerModifier.m5115setSpotShadowColor8_81llA(this.spotShadowColor);
        simpleGraphicsLayerModifier.m5114setCompositingStrategyaDBOjCE(this.compositingStrategy);
        simpleGraphicsLayerModifier.m5113setBlendModes9anfk8(this.blendMode);
        simpleGraphicsLayerModifier.setColorFilter(this.colorFilter);
        simpleGraphicsLayerModifier.invalidateLayerBlock();
    }

    public /* synthetic */ GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, int i2, ColorFilter colorFilter, dq dqVar) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, i, i2, colorFilter);
    }
}
