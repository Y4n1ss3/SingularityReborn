package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import defpackage.dq;
import defpackage.yi;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DefaultLazyListPrefetchStrategy implements LazyListPrefetchStrategy {
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private int indexToPrefetch;
    private final int initialNestedPrefetchItemCount;
    private float previousPassDelta;
    private int previousPassItemCount;
    private boolean wasScrollingForward;

    public DefaultLazyListPrefetchStrategy(int i) {
        this.initialNestedPrefetchItemCount = i;
        this.indexToPrefetch = -1;
        this.previousPassItemCount = -1;
    }

    private final int calculateIndexToPrefetch(LazyListLayoutInfo lazyListLayoutInfo, boolean z) {
        return z ? ((LazyListItemInfo) yi.v0(lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() + 1 : ((LazyListItemInfo) yi.p0(lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() - 1;
    }

    private final void evaluatePrefetchForCancellation(LazyListLayoutInfo lazyListLayoutInfo, int i, boolean z) {
        if (i == -1 || lazyListLayoutInfo.getVisibleItemsInfo().isEmpty() || i == calculateIndexToPrefetch(lazyListLayoutInfo, z)) {
            return;
        }
        resetPrefetchState();
    }

    private final void resetPrefetchState() {
        this.indexToPrefetch = -1;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
        if (prefetchHandle != null) {
            prefetchHandle.cancel();
        }
        this.currentPrefetchHandle = null;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onNestedPrefetch(NestedPrefetchScope nestedPrefetchScope, int i) {
        int nestedPrefetchItemCount = nestedPrefetchScope.getNestedPrefetchItemCount() == -1 ? this.initialNestedPrefetchItemCount : nestedPrefetchScope.getNestedPrefetchItemCount();
        for (int i2 = 0; i2 < nestedPrefetchItemCount; i2++) {
            nestedPrefetchScope.schedulePrecomposition(i + i2);
        }
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onScroll(LazyListPrefetchScope lazyListPrefetchScope, float f, LazyListLayoutInfo lazyListLayoutInfo) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        if (!lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            boolean z = f < 0.0f;
            int calculateIndexToPrefetch = calculateIndexToPrefetch(lazyListLayoutInfo, z);
            if (calculateIndexToPrefetch >= 0 && calculateIndexToPrefetch < lazyListLayoutInfo.getTotalItemsCount()) {
                if (calculateIndexToPrefetch != this.indexToPrefetch) {
                    if (this.wasScrollingForward != z) {
                        resetPrefetchState();
                    }
                    this.wasScrollingForward = z;
                    this.indexToPrefetch = calculateIndexToPrefetch;
                    this.currentPrefetchHandle = LazyListPrefetchScope.schedulePrefetch$default(lazyListPrefetchScope, calculateIndexToPrefetch, null, 2, null);
                }
                if (z) {
                    LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) yi.v0(lazyListLayoutInfo.getVisibleItemsInfo());
                    if (((lazyListItemInfo.getSize() + lazyListItemInfo.getOffset()) + lazyListLayoutInfo.getMainAxisItemSpacing()) - lazyListLayoutInfo.getViewportEndOffset() < (-f) && (prefetchHandle2 = this.currentPrefetchHandle) != null) {
                        prefetchHandle2.markAsUrgent();
                    }
                } else if (lazyListLayoutInfo.getViewportStartOffset() - ((LazyListItemInfo) yi.p0(lazyListLayoutInfo.getVisibleItemsInfo())).getOffset() < f && (prefetchHandle = this.currentPrefetchHandle) != null) {
                    prefetchHandle.markAsUrgent();
                }
            }
        }
        this.previousPassDelta = f;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onVisibleItemsUpdated(LazyListPrefetchScope lazyListPrefetchScope, LazyListLayoutInfo lazyListLayoutInfo) {
        evaluatePrefetchForCancellation(lazyListLayoutInfo, this.indexToPrefetch, this.wasScrollingForward);
        int totalItemsCount = lazyListLayoutInfo.getTotalItemsCount();
        int i = this.previousPassItemCount;
        if (i != -1 && this.previousPassDelta != 0.0f && i != totalItemsCount && !lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            int calculateIndexToPrefetch = calculateIndexToPrefetch(lazyListLayoutInfo, this.previousPassDelta < 0.0f);
            if (calculateIndexToPrefetch >= 0 && calculateIndexToPrefetch < totalItemsCount) {
                this.indexToPrefetch = calculateIndexToPrefetch;
                this.currentPrefetchHandle = LazyListPrefetchScope.schedulePrefetch$default(lazyListPrefetchScope, calculateIndexToPrefetch, null, 2, null);
            }
        }
        this.previousPassItemCount = totalItemsCount;
    }

    public DefaultLazyListPrefetchStrategy() {
        this(0, 1, null);
    }

    public /* synthetic */ DefaultLazyListPrefetchStrategy(int i, int i2, dq dqVar) {
        this((i2 & 1) != 0 ? 2 : i);
    }
}
