package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Placeable;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface LookaheadScope {
    /* renamed from: localLookaheadPositionOf-au-aQtc$default, reason: not valid java name */
    static /* synthetic */ long m6265localLookaheadPositionOfauaQtc$default(LookaheadScope lookaheadScope, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: localLookaheadPositionOf-au-aQtc");
            return 0L;
        }
        if ((i & 2) != 0) {
            j = Offset.Companion.m4532getZeroF1C5BW0();
        }
        long j2 = j;
        if ((i & 4) != 0) {
            z = true;
        }
        return lookaheadScope.mo92localLookaheadPositionOfauaQtc(layoutCoordinates, layoutCoordinates2, j2, z);
    }

    LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope);

    /* renamed from: localLookaheadPositionOf-au-aQtc */
    default long mo92localLookaheadPositionOfauaQtc(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j, boolean z) {
        return LookaheadScopeKt.m6266localLookaheadPositionOfFgt4K4Q(this, layoutCoordinates, layoutCoordinates2, j, z);
    }

    LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates);
}
