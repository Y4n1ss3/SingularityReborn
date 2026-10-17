package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShadowGraphicsLayerElement$createBlock$1 extends f30 implements ky {
    final /* synthetic */ ShadowGraphicsLayerElement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowGraphicsLayerElement$createBlock$1(ShadowGraphicsLayerElement shadowGraphicsLayerElement) {
        super(1);
        this.this$0 = shadowGraphicsLayerElement;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo367toPx0680j_4(this.this$0.m4353getElevationD9Ej5fM()));
        graphicsLayerScope.setShape(this.this$0.getShape());
        graphicsLayerScope.setClip(this.this$0.getClip());
        graphicsLayerScope.mo4958setAmbientShadowColor8_81llA(this.this$0.m4352getAmbientColor0d7_KjU());
        graphicsLayerScope.mo4961setSpotShadowColor8_81llA(this.this$0.m4354getSpotColor0d7_KjU());
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return w01.a;
    }
}
