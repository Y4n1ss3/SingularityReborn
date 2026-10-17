package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListBeyondBoundsModifierKt {
    public static final LazyLayoutBeyondBoundsState rememberLazyListBeyondBoundsState(LazyListState lazyListState, int i, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877443446, i2, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:27)");
        }
        boolean z = ((((i2 & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(i)) || (i2 & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyListBeyondBoundsState(lazyListState, i);
            composer.updateRememberedValue(rememberedValue);
        }
        LazyListBeyondBoundsState lazyListBeyondBoundsState = (LazyListBeyondBoundsState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyListBeyondBoundsState;
    }
}
