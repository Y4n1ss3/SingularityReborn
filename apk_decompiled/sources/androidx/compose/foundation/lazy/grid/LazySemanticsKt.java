package androidx.compose.foundation.lazy.grid;

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
public final class LazySemanticsKt {
    public static final LazyLayoutSemanticState rememberLazyGridSemanticState(final LazyGridState lazyGridState, boolean z, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1247008005, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:31)");
        }
        boolean z2 = ((((i & 14) ^ 6) > 4 && composer.changed(lazyGridState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(z)) || (i & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.grid.LazySemanticsKt$rememberLazyGridSemanticState$1$1
                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public CollectionInfo collectionInfo() {
                    return new CollectionInfo(-1, -1);
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int getContentPadding() {
                    return LazyGridState.this.getLayoutInfo().getAfterContentPadding() + LazyGridState.this.getLayoutInfo().getBeforeContentPadding();
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public float getMaxScrollOffset() {
                    return LazyLayoutSemanticsKt.estimatedLazyMaxScrollOffset(LazyGridState.this.getFirstVisibleItemIndex(), LazyGridState.this.getFirstVisibleItemScrollOffset(), LazyGridState.this.getCanScrollForward());
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public float getScrollOffset() {
                    return LazyLayoutSemanticsKt.estimatedLazyScrollOffset(LazyGridState.this.getFirstVisibleItemIndex(), LazyGridState.this.getFirstVisibleItemScrollOffset());
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int getViewport() {
                    Orientation orientation = LazyGridState.this.getLayoutInfo().getOrientation();
                    Orientation orientation2 = Orientation.Vertical;
                    LazyGridState lazyGridState2 = LazyGridState.this;
                    return (int) (orientation == orientation2 ? lazyGridState2.getLayoutInfo().mo894getViewportSizeYbymL2g() & 4294967295L : lazyGridState2.getLayoutInfo().mo894getViewportSizeYbymL2g() >> 32);
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public Object scrollToItem(int i2, hm hmVar) {
                    Object scrollToItem$default = LazyGridState.scrollToItem$default(LazyGridState.this, i2, 0, hmVar, 2, null);
                    return scrollToItem$default == vn.d ? scrollToItem$default : w01.a;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        LazySemanticsKt$rememberLazyGridSemanticState$1$1 lazySemanticsKt$rememberLazyGridSemanticState$1$1 = (LazySemanticsKt$rememberLazyGridSemanticState$1$1) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazySemanticsKt$rememberLazyGridSemanticState$1$1;
    }
}
