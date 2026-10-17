package androidx.compose.ui.graphics;

import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SimpleGraphicsLayerModifier$layerBlock$1 extends f30 implements ky {
    final /* synthetic */ SimpleGraphicsLayerModifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleGraphicsLayerModifier$layerBlock$1(SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        super(1);
        this.this$0 = simpleGraphicsLayerModifier;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setScaleX(this.this$0.getScaleX());
        graphicsLayerScope.setScaleY(this.this$0.getScaleY());
        graphicsLayerScope.setAlpha(this.this$0.getAlpha());
        graphicsLayerScope.setTranslationX(this.this$0.getTranslationX());
        graphicsLayerScope.setTranslationY(this.this$0.getTranslationY());
        graphicsLayerScope.setShadowElevation(this.this$0.getShadowElevation());
        graphicsLayerScope.setRotationX(this.this$0.getRotationX());
        graphicsLayerScope.setRotationY(this.this$0.getRotationY());
        graphicsLayerScope.setRotationZ(this.this$0.getRotationZ());
        graphicsLayerScope.setCameraDistance(this.this$0.getCameraDistance());
        graphicsLayerScope.mo4962setTransformOrigin__ExYCQ(this.this$0.m5111getTransformOriginSzJe1aQ());
        graphicsLayerScope.setShape(this.this$0.getShape());
        graphicsLayerScope.setClip(this.this$0.getClip());
        graphicsLayerScope.setRenderEffect(this.this$0.getRenderEffect());
        graphicsLayerScope.mo4958setAmbientShadowColor8_81llA(this.this$0.m5107getAmbientShadowColor0d7_KjU());
        graphicsLayerScope.mo4961setSpotShadowColor8_81llA(this.this$0.m5110getSpotShadowColor0d7_KjU());
        graphicsLayerScope.mo4960setCompositingStrategyaDBOjCE(this.this$0.m5109getCompositingStrategyNrFUSI());
        graphicsLayerScope.mo4959setBlendModes9anfk8(this.this$0.m5108getBlendMode0nO6VwU());
        graphicsLayerScope.setColorFilter(this.this$0.getColorFilter());
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return w01.a;
    }
}
