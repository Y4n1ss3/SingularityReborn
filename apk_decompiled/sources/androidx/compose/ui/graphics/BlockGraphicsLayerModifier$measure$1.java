package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.Placeable;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BlockGraphicsLayerModifier$measure$1 extends f30 implements ky {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ BlockGraphicsLayerModifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockGraphicsLayerModifier$measure$1(Placeable placeable, BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        super(1);
        this.$placeable = placeable;
        this.this$0 = blockGraphicsLayerModifier;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeWithLayer$default(placementScope, this.$placeable, 0, 0, 0.0f, this.this$0.getLayerBlock(), 4, (Object) null);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return w01.a;
    }
}
