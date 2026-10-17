package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListScrollScopeKt$LazyLayoutScrollScope$1 implements LazyLayoutScrollScope, ScrollScope {
    private final /* synthetic */ ScrollScope $$delegate_0;
    final /* synthetic */ LazyListState $state;

    public LazyListScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, LazyListState lazyListState) {
        this.$state = lazyListState;
        this.$$delegate_0 = scrollScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int calculateDistanceTo(int i, int i2) {
        LazyListItemInfo lazyListItemInfo;
        LazyListLayoutInfo layoutInfo = this.$state.getLayoutInfo();
        int i3 = 0;
        if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        int firstVisibleItemIndex = getFirstVisibleItemIndex();
        if (i > getLastVisibleItemIndex() || firstVisibleItemIndex > i) {
            i3 = ((i - getFirstVisibleItemIndex()) * LazyListLayoutInfoKt.visibleItemsAverageSize(layoutInfo)) - getFirstVisibleItemScrollOffset();
        } else {
            List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    lazyListItemInfo = null;
                    break;
                }
                lazyListItemInfo = visibleItemsInfo.get(i4);
                if (lazyListItemInfo.getIndex() == i) {
                    break;
                }
                i4++;
            }
            LazyListItemInfo lazyListItemInfo2 = lazyListItemInfo;
            if (lazyListItemInfo2 != null) {
                i3 = lazyListItemInfo2.getOffset();
            }
        }
        return i3 + i2;
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
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) yi.w0(this.$state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getIndex();
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
