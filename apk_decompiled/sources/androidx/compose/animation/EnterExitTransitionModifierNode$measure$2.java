package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnterExitTransitionModifierNode$measure$2 extends f30 implements ky {
    final /* synthetic */ ky $layerBlock;
    final /* synthetic */ long $offset;
    final /* synthetic */ long $offsetDelta;
    final /* synthetic */ Placeable $placeable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionModifierNode$measure$2(Placeable placeable, long j, long j2, ky kyVar) {
        super(1);
        this.$placeable = placeable;
        this.$offset = j;
        this.$offsetDelta = j2;
        this.$layerBlock = kyVar;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        placementScope.placeWithLayer(this.$placeable, IntOffset.m7739getXimpl(this.$offsetDelta) + IntOffset.m7739getXimpl(this.$offset), IntOffset.m7740getYimpl(this.$offsetDelta) + IntOffset.m7740getYimpl(this.$offset), 0.0f, this.$layerBlock);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return w01.a;
    }
}
