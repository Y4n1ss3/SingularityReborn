package androidx.compose.animation;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionScopeRootModifierNode$measure$1 extends f30 implements ky {
    final /* synthetic */ Placeable $p;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ SharedTransitionScopeRootModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeRootModifierNode$measure$1(MeasureScope measureScope, SharedTransitionScopeRootModifierNode sharedTransitionScopeRootModifierNode, Placeable placeable) {
        super(1);
        this.$this_measure = measureScope;
        this.this$0 = sharedTransitionScopeRootModifierNode;
        this.$p = placeable;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates != null) {
            boolean isLookingAhead = this.$this_measure.isLookingAhead();
            SharedTransitionScopeRootModifierNode sharedTransitionScopeRootModifierNode = this.this$0;
            if (isLookingAhead) {
                sharedTransitionScopeRootModifierNode.getSharedScope().setLookaheadRoot$animation(coordinates);
            } else {
                sharedTransitionScopeRootModifierNode.getSharedScope().setRoot$animation(coordinates);
            }
        }
        Placeable.PlacementScope.place$default(placementScope, this.$p, 0, 0, 0.0f, 4, null);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return w01.a;
    }
}
