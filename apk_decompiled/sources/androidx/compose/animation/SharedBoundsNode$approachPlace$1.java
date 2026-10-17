package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionStateMachine;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Placeable;
import defpackage.f30;
import defpackage.ky;
import defpackage.o;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedBoundsNode$approachPlace$1 extends f30 implements ky {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ SharedBoundsNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedBoundsNode$approachPlace$1(SharedBoundsNode sharedBoundsNode, Placeable placeable) {
        super(1);
        this.this$0 = sharedBoundsNode;
        this.$placeable = placeable;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        SharedElement sharedElement;
        SharedElement sharedElement2;
        this.this$0.isPlaced = true;
        this.this$0.boundsBeforeDetached = null;
        sharedElement = this.this$0.getSharedElement();
        SharedTransitionStateMachine.State state$animation = sharedElement.getState$animation();
        if (!this.this$0.getSharedElementEntry().isEnabled()) {
            Placeable.PlacementScope.place$default(placementScope, this.$placeable, 0, 0, 0.0f, 4, null);
            return;
        }
        if (!state$animation.getMatchIsOrHasBeenConfigured()) {
            Placeable.PlacementScope.place$default(placementScope, this.$placeable, 0, 0, 0.0f, 4, null);
            return;
        }
        TargetData targetData = state$animation.getTargetData();
        if (targetData == null) {
            o.t(state$animation, "Match State is configured, but target data is null. State = ");
            return;
        }
        Rect currentBounds = state$animation.getCurrentBounds();
        if (currentBounds == null) {
            o.t(state$animation, "Match State is configured, but current bounds is null. State = ");
            return;
        }
        sharedElement2 = this.this$0.getSharedElement();
        boolean isTransitionActive = sharedElement2.getScope().isTransitionActive();
        SharedBoundsNode sharedBoundsNode = this.this$0;
        if (isTransitionActive) {
            sharedBoundsNode.approachPlaceMatchInTransition$animation(placementScope, this.$placeable, targetData, currentBounds);
        } else {
            sharedBoundsNode.approachPlaceMatchBeyondTransition(placementScope, this.$placeable, currentBounds);
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return w01.a;
    }
}
