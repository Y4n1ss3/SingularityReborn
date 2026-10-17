package androidx.compose.animation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionScope$skipToLookaheadPosition$4$1$1 extends f30 implements ky {
    final /* synthetic */ iy $enabled;
    final /* synthetic */ Placeable $this_run;
    final /* synthetic */ SharedTransitionScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScope$skipToLookaheadPosition$4$1$1(iy iyVar, Placeable placeable, SharedTransitionScope sharedTransitionScope) {
        super(1);
        this.$enabled = iyVar;
        this.$this_run = placeable;
        this.this$0 = sharedTransitionScope;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        if (!((Boolean) this.$enabled.invoke()).booleanValue()) {
            Placeable.PlacementScope.place$default(placementScope, this.$this_run, 0, 0, 0.0f, 4, null);
            return;
        }
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates == null) {
            Placeable.PlacementScope.place$default(placementScope, this.$this_run, 0, 0, 0.0f, 4, null);
            return;
        }
        SharedTransitionScope sharedTransitionScope = this.this$0;
        Placeable.PlacementScope.m6303place70tqf50$default(placementScope, this.$this_run, IntOffsetKt.m7756roundk4lQ0M(Offset.m4520minusMKHz9U(coordinates.mo6243localPositionOfR5De75A(sharedTransitionScope.getLookaheadScopeCoordinates(placementScope), Offset.m4520minusMKHz9U(LookaheadScope.m6265localLookaheadPositionOfauaQtc$default(sharedTransitionScope, sharedTransitionScope.getLookaheadScopeCoordinates(placementScope), coordinates, 0L, false, 6, null), LayoutCoordinates.m6241localPositionOfS_NoaFU$default(sharedTransitionScope.getLookaheadScopeCoordinates(placementScope), coordinates, 0L, false, 6, null))), LayoutCoordinates.m6241localPositionOfS_NoaFU$default(coordinates, sharedTransitionScope.getLookaheadScopeCoordinates(placementScope), 0L, false, 6, null))), 0.0f, 2, null);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return w01.a;
    }
}
