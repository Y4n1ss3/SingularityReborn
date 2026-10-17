package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.Placeable;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SimpleGraphicsLayerModifier$measure$1 extends f30 implements ky {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ SimpleGraphicsLayerModifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleGraphicsLayerModifier$measure$1(Placeable placeable, SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        super(1);
        this.$placeable = placeable;
        this.this$0 = simpleGraphicsLayerModifier;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        ky kyVar;
        Placeable placeable = this.$placeable;
        kyVar = this.this$0.layerBlock;
        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, 0, 0.0f, kyVar, 4, (Object) null);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return w01.a;
    }
}
