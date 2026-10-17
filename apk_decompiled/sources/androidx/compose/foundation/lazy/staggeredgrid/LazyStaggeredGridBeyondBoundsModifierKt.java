package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridBeyondBoundsModifierKt {
    public static final LazyLayoutBeyondBoundsState rememberLazyStaggeredGridBeyondBoundsState(LazyStaggeredGridState lazyStaggeredGridState, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-363070453, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridBeyondBoundsState (LazyStaggeredGridBeyondBoundsModifier.kt:25)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(lazyStaggeredGridState)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState);
            composer.updateRememberedValue(rememberedValue);
        }
        LazyStaggeredGridBeyondBoundsState lazyStaggeredGridBeyondBoundsState = (LazyStaggeredGridBeyondBoundsState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyStaggeredGridBeyondBoundsState;
    }
}
