package androidx.compose.animation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RenderInTransitionOverlayNode$measure$1$1 extends f30 implements ky {
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ Placeable $this_run;
    final /* synthetic */ RenderInTransitionOverlayNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderInTransitionOverlayNode$measure$1$1(MeasureScope measureScope, RenderInTransitionOverlayNode renderInTransitionOverlayNode, Placeable placeable) {
        super(1);
        this.$this_measure = measureScope;
        this.this$0 = renderInTransitionOverlayNode;
        this.$this_run = placeable;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        if (!this.$this_measure.isLookingAhead()) {
            if (!((Boolean) this.this$0.getRenderInOverlay().invoke()).booleanValue()) {
                this.this$0.setEnabled(false);
            } else if (placementScope.getCoordinates() != null) {
                RenderInTransitionOverlayNode renderInTransitionOverlayNode = this.this$0;
                renderInTransitionOverlayNode.setEnabled(true);
                renderInTransitionOverlayNode.m78setPositionInOverlayk4lQ0M(renderInTransitionOverlayNode.getSharedScope().getRoot$animation().mo6243localPositionOfR5De75A(DelegatableNodeKt.requireLayoutCoordinates(renderInTransitionOverlayNode), Offset.Companion.m4532getZeroF1C5BW0()));
            }
        }
        Placeable.PlacementScope.place$default(placementScope, this.$this_run, 0, 0, 0.0f, 4, null);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return w01.a;
    }
}
