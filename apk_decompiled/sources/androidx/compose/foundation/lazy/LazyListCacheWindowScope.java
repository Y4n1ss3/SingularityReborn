package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.CacheWindowScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.ui.unit.Density;
import defpackage.my;
import defpackage.q10;
import defpackage.w01;
import defpackage.y80;
import defpackage.yi;
import defpackage.z30;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListCacheWindowScope implements CacheWindowScope {
    public static final int $stable = 8;
    public LazyListLayoutInfo layoutInfo;
    public LazyListPrefetchScope prefetchScope;

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 schedulePrefetch$lambda$0(my myVar, LazyListPrefetchResultScope lazyListPrefetchResultScope) {
        myVar.invoke(Integer.valueOf(lazyListPrefetchResultScope.getIndex()), Integer.valueOf(lazyListPrefetchResultScope.getMainAxisSize()));
        return w01.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public Density getDensity() {
        LazyListLayoutInfo layoutInfo = getLayoutInfo();
        LazyListMeasureResult lazyListMeasureResult = layoutInfo instanceof LazyListMeasureResult ? (LazyListMeasureResult) layoutInfo : null;
        if (lazyListMeasureResult != null) {
            return lazyListMeasureResult.getDensity();
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getFirstVisibleLineIndex() {
        return ((LazyListItemInfo) yi.p0(getLayoutInfo().getVisibleItemsInfo())).getIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public boolean getHasVisibleItems() {
        return !getLayoutInfo().getVisibleItemsInfo().isEmpty();
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
        return ((LazyListItemInfo) yi.v0(getLayoutInfo().getVisibleItemsInfo())).getIndex();
    }

    public final LazyListLayoutInfo getLayoutInfo() {
        LazyListLayoutInfo lazyListLayoutInfo = this.layoutInfo;
        if (lazyListLayoutInfo != null) {
            return lazyListLayoutInfo;
        }
        q10.H("layoutInfo");
        throw null;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisExtraSpaceEnd() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) yi.v0(getLayoutInfo().getVisibleItemsInfo());
        return Math.abs((getLayoutInfo().getMainAxisItemSpacing() + (lazyListItemInfo.getSize() + lazyListItemInfo.getOffset())) - getLayoutInfo().getViewportEndOffset());
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisExtraSpaceStart() {
        int beforeContentPadding = getLayoutInfo().getBeforeContentPadding() + ((LazyListItemInfo) yi.p0(getLayoutInfo().getVisibleItemsInfo())).getOffset();
        if (beforeContentPadding > 0) {
            beforeContentPadding = 0;
        }
        return Math.abs(beforeContentPadding);
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisViewportSize() {
        return LazyListSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getLayoutInfo());
    }

    public final LazyListPrefetchScope getPrefetchScope() {
        LazyListPrefetchScope lazyListPrefetchScope = this.prefetchScope;
        if (lazyListPrefetchScope != null) {
            return lazyListPrefetchScope;
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
        return getLayoutInfo().getVisibleItemsInfo().get(i).getIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleItemSize(int i) {
        return getLayoutInfo().getVisibleItemsInfo().get(i).getSize();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleLineCount() {
        return getLayoutInfo().getVisibleItemsInfo().size();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public Object getVisibleLineKey(int i) {
        return getLayoutInfo().getVisibleItemsInfo().get(i).getKey();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public List<LazyLayoutPrefetchState.PrefetchHandle> schedulePrefetch(int i, my myVar) {
        return y80.D(getPrefetchScope().schedulePrefetch(i, new z30(0, myVar)));
    }

    public final void setLayoutInfo(LazyListLayoutInfo lazyListLayoutInfo) {
        this.layoutInfo = lazyListLayoutInfo;
    }

    public final void setPrefetchScope(LazyListPrefetchScope lazyListPrefetchScope) {
        this.prefetchScope = lazyListPrefetchScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastIndexInLine(int i) {
        return i;
    }
}
