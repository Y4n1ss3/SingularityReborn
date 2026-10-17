package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.ui.unit.IntOffset;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1 implements LazyLayoutScrollScope, ScrollScope {
    private final /* synthetic */ ScrollScope $$delegate_0;
    final /* synthetic */ LazyStaggeredGridState $state;

    public LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, LazyStaggeredGridState lazyStaggeredGridState) {
        this.$state = lazyStaggeredGridState;
        this.$$delegate_0 = scrollScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int calculateDistanceTo(int i, int i2) {
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo;
        int m7740getYimpl;
        LazyStaggeredGridLayoutInfo layoutInfo = this.$state.getLayoutInfo();
        int i3 = 0;
        if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        while (true) {
            if (i3 >= size) {
                lazyStaggeredGridItemInfo = null;
                break;
            }
            lazyStaggeredGridItemInfo = visibleItemsInfo.get(i3);
            if (lazyStaggeredGridItemInfo.getIndex() == i) {
                break;
            }
            i3++;
        }
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo2 = lazyStaggeredGridItemInfo;
        if (lazyStaggeredGridItemInfo2 == null) {
            int visibleItemsAverageSize = LazyStaggeredGridMeasureResultKt.visibleItemsAverageSize(layoutInfo);
            int laneCount$foundation = this.$state.getLaneCount$foundation();
            m7740getYimpl = (((i / laneCount$foundation) - (getFirstVisibleItemIndex() / laneCount$foundation)) * visibleItemsAverageSize) - getFirstVisibleItemScrollOffset();
        } else {
            m7740getYimpl = layoutInfo.getOrientation() == Orientation.Vertical ? IntOffset.m7740getYimpl(lazyStaggeredGridItemInfo2.mo964getOffsetnOccac()) : IntOffset.m7739getXimpl(lazyStaggeredGridItemInfo2.mo964getOffsetnOccac());
        }
        return m7740getYimpl + i2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int getFirstVisibleItemIndex() {
        return this.$state.getFirstVisibleItemIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int getFirstVisibleItemScrollOffset() {
        return this.$state.getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int getItemCount() {
        return this.$state.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int getLastVisibleItemIndex() {
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = (LazyStaggeredGridItemInfo) yi.w0(this.$state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyStaggeredGridItemInfo != null) {
            return lazyStaggeredGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.gestures.ScrollScope
    public float scrollBy(float f) {
        return this.$$delegate_0.scrollBy(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public void snapToItem(int i, int i2) {
        this.$state.snapToItemInternal$foundation(i, i2, true);
    }
}
