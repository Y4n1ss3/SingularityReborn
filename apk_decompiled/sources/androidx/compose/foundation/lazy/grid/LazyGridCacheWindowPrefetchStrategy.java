package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridCacheWindowPrefetchStrategy extends CacheWindowLogic implements LazyGridPrefetchStrategy {
    public static final int $stable = 8;
    private final LazyGridCacheWindowScope cacheWindowScope;

    public LazyGridCacheWindowPrefetchStrategy(LazyLayoutCacheWindow lazyLayoutCacheWindow) {
        super(lazyLayoutCacheWindow, false, 2, null);
        this.cacheWindowScope = new LazyGridCacheWindowScope();
    }

    private final void applyWindowScope(LazyGridPrefetchScope lazyGridPrefetchScope, LazyGridLayoutInfo lazyGridLayoutInfo, ky kyVar) {
        this.cacheWindowScope.setLayoutInfo(lazyGridLayoutInfo);
        this.cacheWindowScope.setPrefetchScope(lazyGridPrefetchScope);
        kyVar.invoke(this.cacheWindowScope);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onNestedPrefetch(NestedPrefetchScope nestedPrefetchScope, int i) {
        int nestedPrefetchItemCount = nestedPrefetchScope.getNestedPrefetchItemCount();
        for (int i2 = 0; i2 < nestedPrefetchItemCount; i2++) {
            nestedPrefetchScope.schedulePrecomposition(i + i2);
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onScroll(LazyGridPrefetchScope lazyGridPrefetchScope, float f, LazyGridLayoutInfo lazyGridLayoutInfo) {
        this.cacheWindowScope.setLayoutInfo(lazyGridLayoutInfo);
        this.cacheWindowScope.setPrefetchScope(lazyGridPrefetchScope);
        onScroll(this.cacheWindowScope, f);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onVisibleItemsUpdated(LazyGridPrefetchScope lazyGridPrefetchScope, LazyGridLayoutInfo lazyGridLayoutInfo) {
        this.cacheWindowScope.setLayoutInfo(lazyGridLayoutInfo);
        this.cacheWindowScope.setPrefetchScope(lazyGridPrefetchScope);
        onVisibleItemsUpdated(this.cacheWindowScope);
    }
}
