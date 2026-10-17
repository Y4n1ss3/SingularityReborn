package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.CacheWindowScope;
import androidx.compose.foundation.lazy.layout.CachedItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.ui.unit.Density;
import defpackage.iy;
import defpackage.my;
import defpackage.q10;
import defpackage.w01;
import defpackage.y80;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class PagerCacheWindowScope implements CacheWindowScope {
    private final iy itemCount;
    public PagerMeasureResult layoutInfo;
    public LazyLayoutPrefetchState state;

    public PagerCacheWindowScope(iy iyVar) {
        this.itemCount = iyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 schedulePrefetch$lambda$0(my myVar, PagerCacheWindowScope pagerCacheWindowScope, LazyLayoutPrefetchState.PrefetchResultScope prefetchResultScope) {
        myVar.invoke(Integer.valueOf(prefetchResultScope.getIndex()), Integer.valueOf(pagerCacheWindowScope.getLayoutInfo().getPageSize()));
        return w01.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public Density getDensity() {
        return getLayoutInfo().getDensity();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getFirstVisibleLineIndex() {
        long index = ((MeasuredPage) yi.p0(getLayoutInfo().getVisiblePagesInfo())).getIndex() - getLayoutInfo().getBeyondViewportPageCount();
        if (index < 0) {
            index = 0;
        }
        return (int) index;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public boolean getHasVisibleItems() {
        return !getLayoutInfo().getVisiblePagesInfo().isEmpty();
    }

    public final iy getItemCount() {
        return this.itemCount;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastLineIndex() {
        if (getTotalItemsCount() == 0) {
            return -1;
        }
        return getTotalItemsCount() - 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastVisibleLineIndex() {
        long index = ((MeasuredPage) yi.v0(getLayoutInfo().getVisiblePagesInfo())).getIndex() + getLayoutInfo().getBeyondViewportPageCount();
        long totalItemsCount = getTotalItemsCount() - 1;
        if (index > totalItemsCount) {
            index = totalItemsCount;
        }
        return (int) index;
    }

    public final PagerMeasureResult getLayoutInfo() {
        PagerMeasureResult pagerMeasureResult = this.layoutInfo;
        if (pagerMeasureResult != null) {
            return pagerMeasureResult;
        }
        q10.H("layoutInfo");
        throw null;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisExtraSpaceEnd() {
        return Math.abs((getLayoutInfo().getPageSpacing() + (getLayoutInfo().getPageSize() + ((MeasuredPage) yi.v0(getLayoutInfo().getVisiblePagesInfo())).getOffset())) - getLayoutInfo().getViewportEndOffset());
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisExtraSpaceStart() {
        int beforeContentPadding = getLayoutInfo().getBeforeContentPadding() + ((MeasuredPage) yi.p0(getLayoutInfo().getVisiblePagesInfo())).getOffset();
        if (beforeContentPadding > 0) {
            beforeContentPadding = 0;
        }
        return Math.abs(beforeContentPadding);
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisViewportSize() {
        return PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo());
    }

    public final LazyLayoutPrefetchState getState() {
        LazyLayoutPrefetchState lazyLayoutPrefetchState = this.state;
        if (lazyLayoutPrefetchState != null) {
            return lazyLayoutPrefetchState;
        }
        q10.H("state");
        throw null;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getTotalItemsCount() {
        return ((Number) this.itemCount.invoke()).intValue();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleItemLine(int i) {
        int size = getLayoutInfo().getExtraPagesBefore().size();
        int size2 = getLayoutInfo().getVisiblePagesInfo().size();
        if (i < size) {
            return getLayoutInfo().getExtraPagesBefore().get(i).getIndex();
        }
        if (i >= size && i < size + size2) {
            return getLayoutInfo().getVisiblePagesInfo().get(i - size).getIndex();
        }
        if (i >= size + size2) {
            return getLayoutInfo().getExtraPagesAfter().get((i - size) - size2).getIndex();
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleItemSize(int i) {
        return getLayoutInfo().getPageSize();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleLineCount() {
        return getLayoutInfo().getExtraPagesAfter().size() + getLayoutInfo().getVisiblePagesInfo().size() + getLayoutInfo().getExtraPagesBefore().size();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public Object getVisibleLineKey(int i) {
        int size = getLayoutInfo().getExtraPagesBefore().size();
        int size2 = getLayoutInfo().getVisiblePagesInfo().size();
        return i < size ? getLayoutInfo().getExtraPagesBefore().get(i).getKey() : (i < size || i >= size + size2) ? i >= size + size2 ? getLayoutInfo().getExtraPagesAfter().get((i - size) - size2).getKey() : CachedItem.NoKey : getLayoutInfo().getVisiblePagesInfo().get(i - size).getKey();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public List<LazyLayoutPrefetchState.PrefetchHandle> schedulePrefetch(int i, my myVar) {
        return y80.D(getState().m935schedulePrecompositionAndPremeasure_EkL_Y$foundation(i, getLayoutInfo().m1010getChildConstraintsmsEJaDk(), true, new d(0, myVar, this)));
    }

    public final void setLayoutInfo(PagerMeasureResult pagerMeasureResult) {
        this.layoutInfo = pagerMeasureResult;
    }

    public final void setState(LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.state = lazyLayoutPrefetchState;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastIndexInLine(int i) {
        return i;
    }
}
