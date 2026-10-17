package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.CacheWindowScope;
import androidx.compose.foundation.lazy.layout.CachedItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.ui.unit.Density;
import defpackage.ky;
import defpackage.my;
import defpackage.p01;
import defpackage.q10;
import defpackage.w01;
import defpackage.xe0;
import defpackage.yi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class LazyGridCacheWindowScope implements CacheWindowScope {
    public LazyGridLayoutInfo layoutInfo;
    public LazyGridPrefetchScope prefetchScope;

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 schedulePrefetch$lambda$0(my myVar, int i, LazyGridPrefetchResultScope lazyGridPrefetchResultScope) {
        int lineItemCount = lazyGridPrefetchResultScope.getLineItemCount();
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < lineItemCount; i3++) {
            i2 = p01.u(lazyGridPrefetchResultScope.getMainAxisSize(i3), new int[0]);
        }
        if (i2 != Integer.MIN_VALUE) {
            myVar.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        }
        return w01.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public Density getDensity() {
        LazyGridLayoutInfo layoutInfo = getLayoutInfo();
        LazyGridMeasureResult lazyGridMeasureResult = layoutInfo instanceof LazyGridMeasureResult ? (LazyGridMeasureResult) layoutInfo : null;
        if (lazyGridMeasureResult != null) {
            return lazyGridMeasureResult.getDensity();
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getFirstVisibleLineIndex() {
        return getLineIndex((LazyGridItemInfo) yi.p0(getLayoutInfo().getVisibleItemsInfo()));
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public boolean getHasVisibleItems() {
        return !getLayoutInfo().getVisibleItemsInfo().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastIndexInLine(int i) {
        LazyGridLayoutInfo layoutInfo = getLayoutInfo();
        LazyGridMeasureResult lazyGridMeasureResult = layoutInfo instanceof LazyGridMeasureResult ? (LazyGridMeasureResult) layoutInfo : null;
        if (lazyGridMeasureResult == null) {
            return -1;
        }
        if (((List) lazyGridMeasureResult.getPrefetchInfoRetriever().invoke(Integer.valueOf(i))).isEmpty()) {
            return -1;
        }
        return (r1.size() + ((Number) ((xe0) yi.p0(r1)).d).intValue()) - 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastLineIndex() {
        LazyGridLayoutInfo layoutInfo = getLayoutInfo();
        LazyGridMeasureResult lazyGridMeasureResult = layoutInfo instanceof LazyGridMeasureResult ? (LazyGridMeasureResult) layoutInfo : null;
        if (lazyGridMeasureResult == null || getTotalItemsCount() == 0) {
            return -1;
        }
        return ((Number) lazyGridMeasureResult.getLineIndexProvider().invoke(Integer.valueOf(getTotalItemsCount() - 1))).intValue();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastVisibleLineIndex() {
        return getLineIndex((LazyGridItemInfo) yi.v0(getLayoutInfo().getVisibleItemsInfo()));
    }

    public final LazyGridLayoutInfo getLayoutInfo() {
        LazyGridLayoutInfo lazyGridLayoutInfo = this.layoutInfo;
        if (lazyGridLayoutInfo != null) {
            return lazyGridLayoutInfo;
        }
        q10.H("layoutInfo");
        throw null;
    }

    public final int getLineIndex(LazyGridItemInfo lazyGridItemInfo) {
        return LazyGridItemInfoKt.lineIndex(lazyGridItemInfo, getLayoutInfo().getOrientation());
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisExtraSpaceEnd() {
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) yi.v0(getLayoutInfo().getVisibleItemsInfo());
        return Math.abs((getLayoutInfo().getMainAxisItemSpacing() + (LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()) + LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()))) - getLayoutInfo().getViewportEndOffset());
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisExtraSpaceStart() {
        int beforeContentPadding = getLayoutInfo().getBeforeContentPadding() + LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis((LazyGridItemInfo) yi.p0(getLayoutInfo().getVisibleItemsInfo()), getLayoutInfo().getOrientation());
        if (beforeContentPadding > 0) {
            beforeContentPadding = 0;
        }
        return Math.abs(beforeContentPadding);
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisViewportSize() {
        return LazyGridLayoutInfoKt.getSingleAxisViewportSize(getLayoutInfo());
    }

    public final LazyGridPrefetchScope getPrefetchScope() {
        LazyGridPrefetchScope lazyGridPrefetchScope = this.prefetchScope;
        if (lazyGridPrefetchScope != null) {
            return lazyGridPrefetchScope;
        }
        q10.H("prefetchScope");
        throw null;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getTotalItemsCount() {
        return getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleItemLine(int i) {
        return getFirstVisibleLineIndex() + i;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleItemSize(int i) {
        int firstVisibleLineIndex = i + getFirstVisibleLineIndex();
        List<LazyGridItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
        ArrayList arrayList = new ArrayList(visibleItemsInfo.size());
        int size = visibleItemsInfo.size();
        for (int i2 = 0; i2 < size; i2++) {
            LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i2);
            if (getLineIndex(lazyGridItemInfo) == firstVisibleLineIndex) {
                arrayList.add(lazyGridItemInfo);
            }
        }
        int size2 = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            i3 = Math.max(LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis((LazyGridItemInfo) arrayList.get(i4), getLayoutInfo().getOrientation()), i3);
        }
        return i3;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleLineCount() {
        return (getLastVisibleLineIndex() - getFirstVisibleLineIndex()) + 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public Object getVisibleLineKey(int i) {
        Object key;
        int firstVisibleLineIndex = i + getFirstVisibleLineIndex();
        List<LazyGridItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
        ArrayList arrayList = new ArrayList(visibleItemsInfo.size());
        int size = visibleItemsInfo.size();
        for (int i2 = 0; i2 < size; i2++) {
            LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i2);
            if (getLineIndex(lazyGridItemInfo) == firstVisibleLineIndex) {
                arrayList.add(lazyGridItemInfo);
            }
        }
        LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) yi.q0(arrayList);
        return (lazyGridItemInfo2 == null || (key = lazyGridItemInfo2.getKey()) == null) ? CachedItem.NoKey : key;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public List<LazyLayoutPrefetchState.PrefetchHandle> schedulePrefetch(final int i, final my myVar) {
        return getPrefetchScope().scheduleLinePrefetch(i, new ky() { // from class: androidx.compose.foundation.lazy.grid.a
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 schedulePrefetch$lambda$0;
                schedulePrefetch$lambda$0 = LazyGridCacheWindowScope.schedulePrefetch$lambda$0(myVar, i, (LazyGridPrefetchResultScope) obj);
                return schedulePrefetch$lambda$0;
            }
        });
    }

    public final void setLayoutInfo(LazyGridLayoutInfo lazyGridLayoutInfo) {
        this.layoutInfo = lazyGridLayoutInfo;
    }

    public final void setPrefetchScope(LazyGridPrefetchScope lazyGridPrefetchScope) {
        this.prefetchScope = lazyGridPrefetchScope;
    }
}
