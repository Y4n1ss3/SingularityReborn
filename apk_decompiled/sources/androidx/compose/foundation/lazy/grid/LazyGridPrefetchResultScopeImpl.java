package androidx.compose.foundation.lazy.grid;

import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridPrefetchResultScopeImpl implements LazyGridPrefetchResultScope {
    public static final int $stable = 8;
    private final int lineIndex;
    private final List<Integer> mainAxisSizes;

    public LazyGridPrefetchResultScopeImpl(int i, List<Integer> list) {
        this.lineIndex = i;
        this.mainAxisSizes = list;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchResultScope
    public int getLineIndex() {
        return this.lineIndex;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchResultScope
    public int getLineItemCount() {
        return this.mainAxisSizes.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchResultScope
    public int getMainAxisSize(int i) {
        return this.mainAxisSizes.get(i).intValue();
    }
}
