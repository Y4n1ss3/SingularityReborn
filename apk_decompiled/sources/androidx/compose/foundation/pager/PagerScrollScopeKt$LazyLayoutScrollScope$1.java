package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import defpackage.y80;
import defpackage.yi;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PagerScrollScopeKt$LazyLayoutScrollScope$1 implements LazyLayoutScrollScope, ScrollScope {
    private final /* synthetic */ ScrollScope $$delegate_0;
    final /* synthetic */ PagerState $state;

    public PagerScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, PagerState pagerState) {
        this.$state = pagerState;
        this.$$delegate_0 = scrollScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int calculateDistanceTo(int i, int i2) {
        return (int) (y80.i(PagerScrollPositionKt.currentAbsoluteScrollOffset(this.$state) + y80.P(((this.$state.getPageSizeWithSpacing$foundation() * (i - this.$state.getCurrentPage())) - (this.$state.getCurrentPageOffsetFraction() * this.$state.getPageSizeWithSpacing$foundation())) + i2), this.$state.getMinScrollOffset$foundation(), this.$state.getMaxScrollOffset$foundation()) - PagerScrollPositionKt.currentAbsoluteScrollOffset(this.$state));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int getFirstVisibleItemIndex() {
        return this.$state.getFirstVisiblePage$foundation();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int getFirstVisibleItemScrollOffset() {
        return this.$state.getFirstVisiblePageOffset$foundation();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int getItemCount() {
        return this.$state.getPageCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int getLastVisibleItemIndex() {
        return ((PageInfo) yi.v0(this.$state.getLayoutInfo().getVisiblePagesInfo())).getIndex();
    }

    @Override // androidx.compose.foundation.gestures.ScrollScope
    public float scrollBy(float f) {
        return this.$$delegate_0.scrollBy(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public void snapToItem(int i, int i2) {
        this.$state.snapToItem$foundation(i, i2 / this.$state.getPageSizeWithSpacing$foundation(), true);
    }
}
