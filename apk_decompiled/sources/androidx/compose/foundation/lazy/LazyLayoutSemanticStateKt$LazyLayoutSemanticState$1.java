package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.semantics.CollectionInfo;
import defpackage.hm;
import defpackage.rp;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1 implements LazyLayoutSemanticState {
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ LazyListState $state;
    private final State totalItemsCount$delegate;

    public LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1(LazyListState lazyListState, boolean z) {
        this.$state = lazyListState;
        this.$isVertical = z;
        this.totalItemsCount$delegate = SnapshotStateKt.derivedStateOf(new rp(lazyListState, 1));
    }

    private final int getTotalItemsCount() {
        return ((Number) this.totalItemsCount$delegate.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int totalItemsCount_delegate$lambda$0(LazyListState lazyListState) {
        return lazyListState.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
    public CollectionInfo collectionInfo() {
        return this.$isVertical ? new CollectionInfo(getTotalItemsCount(), 1) : new CollectionInfo(1, getTotalItemsCount());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
    public int getContentPadding() {
        return this.$state.getLayoutInfo().getAfterContentPadding() + this.$state.getLayoutInfo().getBeforeContentPadding();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
    public float getMaxScrollOffset() {
        return LazyLayoutSemanticsKt.estimatedLazyMaxScrollOffset(this.$state.getFirstVisibleItemIndex(), this.$state.getFirstVisibleItemScrollOffset(), this.$state.getCanScrollForward());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
    public float getScrollOffset() {
        return LazyLayoutSemanticsKt.estimatedLazyScrollOffset(this.$state.getFirstVisibleItemIndex(), this.$state.getFirstVisibleItemScrollOffset());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
    public int getViewport() {
        Orientation orientation = this.$state.getLayoutInfo().getOrientation();
        Orientation orientation2 = Orientation.Vertical;
        LazyListState lazyListState = this.$state;
        return (int) (orientation == orientation2 ? lazyListState.getLayoutInfo().mo864getViewportSizeYbymL2g() & 4294967295L : lazyListState.getLayoutInfo().mo864getViewportSizeYbymL2g() >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
    public Object scrollToItem(int i, hm hmVar) {
        Object scrollToItem$default = LazyListState.scrollToItem$default(this.$state, i, 0, hmVar, 2, null);
        return scrollToItem$default == vn.d ? scrollToItem$default : w01.a;
    }
}
