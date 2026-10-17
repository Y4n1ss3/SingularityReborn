package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.ui.semantics.CollectionInfo;
import defpackage.hm;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutSemanticStateKt {
    public static final LazyLayoutSemanticState LazyLayoutSemanticState(final PagerState pagerState, final boolean z) {
        return new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.pager.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public CollectionInfo collectionInfo() {
                boolean z2 = z;
                PagerState pagerState2 = PagerState.this;
                return z2 ? new CollectionInfo(pagerState2.getPageCount(), 1) : new CollectionInfo(1, pagerState2.getPageCount());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getContentPadding() {
                return PagerState.this.getLayoutInfo().getAfterContentPadding() + PagerState.this.getLayoutInfo().getBeforeContentPadding();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getMaxScrollOffset() {
                return PagerStateKt.calculateNewMaxScrollOffset(PagerState.this.getLayoutInfo(), PagerState.this.getPageCount());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getScrollOffset() {
                return PagerScrollPositionKt.currentAbsoluteScrollOffset(PagerState.this);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getViewport() {
                Orientation orientation = PagerState.this.getLayoutInfo().getOrientation();
                Orientation orientation2 = Orientation.Vertical;
                PagerState pagerState2 = PagerState.this;
                return (int) (orientation == orientation2 ? pagerState2.getLayoutInfo().mo1006getViewportSizeYbymL2g() & 4294967295L : pagerState2.getLayoutInfo().mo1006getViewportSizeYbymL2g() >> 32);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public Object scrollToItem(int i, hm hmVar) {
                Object scrollToPage$default = PagerState.scrollToPage$default(PagerState.this, i, 0.0f, hmVar, 2, null);
                return scrollToPage$default == vn.d ? scrollToPage$default : w01.a;
            }
        };
    }
}
