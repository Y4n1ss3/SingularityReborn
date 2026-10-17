package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import defpackage.iy;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PagerCacheWindowLogic extends CacheWindowLogic {
    public static final int $stable = 8;
    private final LazyLayoutCacheWindow cacheWindow;
    private final PagerCacheWindowScope cacheWindowScope;
    private final iy itemCount;
    private final LazyLayoutPrefetchState state;

    public PagerCacheWindowLogic(LazyLayoutCacheWindow lazyLayoutCacheWindow, LazyLayoutPrefetchState lazyLayoutPrefetchState, iy iyVar) {
        super(lazyLayoutCacheWindow, false);
        this.cacheWindow = lazyLayoutCacheWindow;
        this.state = lazyLayoutPrefetchState;
        this.itemCount = iyVar;
        this.cacheWindowScope = new PagerCacheWindowScope(iyVar);
    }

    private final void applyWindowScope(PagerMeasureResult pagerMeasureResult, ky kyVar) {
        this.cacheWindowScope.setLayoutInfo(pagerMeasureResult);
        this.cacheWindowScope.setState(this.state);
        kyVar.invoke(this.cacheWindowScope);
    }

    public final LazyLayoutCacheWindow getCacheWindow() {
        return this.cacheWindow;
    }

    public final iy getItemCount() {
        return this.itemCount;
    }

    public final LazyLayoutPrefetchState getState() {
        return this.state;
    }

    public final void onScroll(float f, PagerMeasureResult pagerMeasureResult) {
        this.cacheWindowScope.setLayoutInfo(pagerMeasureResult);
        this.cacheWindowScope.setState(this.state);
        onScroll(this.cacheWindowScope, -f);
    }

    public final void onVisibleItemsChanged(PagerMeasureResult pagerMeasureResult) {
        this.cacheWindowScope.setLayoutInfo(pagerMeasureResult);
        this.cacheWindowScope.setState(this.state);
        onVisibleItemsUpdated(this.cacheWindowScope);
    }
}
