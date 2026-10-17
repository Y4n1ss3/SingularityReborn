package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.semantics.CollectionInfo;
import defpackage.hm;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridSemanticsKt {
    public static final LazyLayoutSemanticState rememberLazyStaggeredGridSemanticState(final LazyStaggeredGridState lazyStaggeredGridState, boolean z, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1629354903, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridSemanticState (LazyStaggeredGridSemantics.kt:31)");
        }
        boolean z2 = ((((i & 14) ^ 6) > 4 && composer.changed(lazyStaggeredGridState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(z)) || (i & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1
                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public CollectionInfo collectionInfo() {
                    return new CollectionInfo(-1, -1);
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int getContentPadding() {
                    return LazyStaggeredGridState.this.getLayoutInfo().getAfterContentPadding() + LazyStaggeredGridState.this.getLayoutInfo().getBeforeContentPadding();
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public float getMaxScrollOffset() {
                    return LazyLayoutSemanticsKt.estimatedLazyMaxScrollOffset(LazyStaggeredGridState.this.getFirstVisibleItemIndex(), LazyStaggeredGridState.this.getFirstVisibleItemScrollOffset(), LazyStaggeredGridState.this.getCanScrollForward());
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public float getScrollOffset() {
                    return LazyLayoutSemanticsKt.estimatedLazyScrollOffset(LazyStaggeredGridState.this.getFirstVisibleItemIndex(), LazyStaggeredGridState.this.getFirstVisibleItemScrollOffset());
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int getViewport() {
                    Orientation orientation = LazyStaggeredGridState.this.getLayoutInfo().getOrientation();
                    Orientation orientation2 = Orientation.Vertical;
                    LazyStaggeredGridState lazyStaggeredGridState2 = LazyStaggeredGridState.this;
                    return (int) (orientation == orientation2 ? lazyStaggeredGridState2.getLayoutInfo().mo967getViewportSizeYbymL2g() & 4294967295L : lazyStaggeredGridState2.getLayoutInfo().mo967getViewportSizeYbymL2g() >> 32);
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public Object scrollToItem(int i2, hm hmVar) {
                    Object scrollToItem$default = LazyStaggeredGridState.scrollToItem$default(LazyStaggeredGridState.this, i2, 0, hmVar, 2, null);
                    return scrollToItem$default == vn.d ? scrollToItem$default : w01.a;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1 lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1 = (LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1;
    }
}
