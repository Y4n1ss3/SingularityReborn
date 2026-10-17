package androidx.compose.animation;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Placeable;
import defpackage.f30;
import defpackage.iy;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionScope$skipToLookaheadPosition$3 extends f30 implements my {
    final /* synthetic */ iy $enabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScope$skipToLookaheadPosition$3(iy iyVar) {
        super(2);
        this.$enabled = iyVar;
    }

    @Override // defpackage.my
    public final Boolean invoke(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        return (Boolean) this.$enabled.invoke();
    }
}
