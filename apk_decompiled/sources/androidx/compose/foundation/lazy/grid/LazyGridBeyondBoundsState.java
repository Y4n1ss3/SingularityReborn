package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import defpackage.yi;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridBeyondBoundsState implements LazyLayoutBeyondBoundsState {
    public static final int $stable = 0;
    private final LazyGridState state;

    public LazyGridBeyondBoundsState(LazyGridState lazyGridState) {
        this.state = lazyGridState;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getFirstPlacedIndex() {
        return this.state.getFirstVisibleItemIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public boolean getHasVisibleItems() {
        return !this.state.getLayoutInfo().getVisibleItemsInfo().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getItemCount() {
        return this.state.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getLastPlacedIndex() {
        return ((LazyGridItemInfo) yi.v0(this.state.getLayoutInfo().getVisibleItemsInfo())).getIndex();
    }

    public final LazyGridState getState() {
        return this.state;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int itemsPerViewport() {
        int i;
        if (this.state.getLayoutInfo().getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        int singleAxisViewportSize = LazyGridSnapLayoutInfoProviderKt.getSingleAxisViewportSize(this.state.getLayoutInfo());
        int visibleLinesAverageMainAxisSize = LazyGridLayoutInfoKt.visibleLinesAverageMainAxisSize(this.state.getLayoutInfo());
        if (visibleLinesAverageMainAxisSize != 0 && (i = singleAxisViewportSize / visibleLinesAverageMainAxisSize) >= 1) {
            return i;
        }
        return 1;
    }
}
