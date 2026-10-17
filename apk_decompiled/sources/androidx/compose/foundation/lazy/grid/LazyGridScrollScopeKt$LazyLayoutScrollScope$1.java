package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.ui.unit.IntOffset;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridScrollScopeKt$LazyLayoutScrollScope$1 implements LazyLayoutScrollScope, ScrollScope {
    private final /* synthetic */ ScrollScope $$delegate_0;
    final /* synthetic */ LazyGridState $state;

    public LazyGridScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, LazyGridState lazyGridState) {
        this.$state = lazyGridState;
        this.$$delegate_0 = scrollScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int calculateDistanceTo(int i, int i2) {
        Integer num;
        LazyGridItemInfo lazyGridItemInfo;
        LazyGridLayoutInfo layoutInfo = this.$state.getLayoutInfo();
        if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        int firstVisibleItemIndex = getFirstVisibleItemIndex();
        if (i > getLastVisibleItemIndex() || firstVisibleItemIndex > i) {
            int slotsPerLine$foundation = this.$state.getSlotsPerLine$foundation();
            r2 = (((((slotsPerLine$foundation - 1) * ((i < getFirstVisibleItemIndex() ? 1 : 0) != 0 ? -1 : 1)) + (i - getFirstVisibleItemIndex())) / slotsPerLine$foundation) * LazyGridLayoutInfoKt.visibleLinesAverageMainAxisSize(layoutInfo)) - getFirstVisibleItemScrollOffset();
        } else {
            List<LazyGridItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            int i3 = 0;
            while (true) {
                num = null;
                if (i3 >= size) {
                    lazyGridItemInfo = null;
                    break;
                }
                lazyGridItemInfo = visibleItemsInfo.get(i3);
                if (lazyGridItemInfo.getIndex() == i) {
                    break;
                }
                i3++;
            }
            LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
            if (layoutInfo.getOrientation() == Orientation.Vertical) {
                if (lazyGridItemInfo2 != null) {
                    num = Integer.valueOf(IntOffset.m7740getYimpl(lazyGridItemInfo2.mo891getOffsetnOccac()));
                }
            } else if (lazyGridItemInfo2 != null) {
                num = Integer.valueOf(IntOffset.m7739getXimpl(lazyGridItemInfo2.mo891getOffsetnOccac()));
            }
            if (num != null) {
                r2 = num.intValue();
            }
        }
        return r2 + i2;
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
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) yi.w0(this.$state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyGridItemInfo != null) {
            return lazyGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.gestures.ScrollScope
    public float scrollBy(float f) {
        return this.$$delegate_0.scrollBy(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public void snapToItem(int i, int i2) {
        this.$state.snapToItemIndexInternal$foundation(i, i2, true);
    }
}
