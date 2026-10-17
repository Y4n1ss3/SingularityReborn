package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RailPredictiveBackState {
    public static final int $stable = 0;
    private final MutableState swipeEdgeMatchesRail$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getSwipeEdgeMatchesRail() {
        return ((Boolean) this.swipeEdgeMatchesRail$delegate.getValue()).booleanValue();
    }

    public final void setSwipeEdgeMatchesRail(boolean z) {
        this.swipeEdgeMatchesRail$delegate.setValue(Boolean.valueOf(z));
    }

    public final void update(boolean z, boolean z2) {
        setSwipeEdgeMatchesRail((z && !z2) || (!z && z2));
    }
}
