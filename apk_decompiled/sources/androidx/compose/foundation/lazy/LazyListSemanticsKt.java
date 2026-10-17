package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListSemanticsKt {
    public static final LazyLayoutSemanticState rememberLazyListSemanticState(LazyListState lazyListState, boolean z, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(596174919, i, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
        }
        boolean z2 = ((((i & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(z)) || (i & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = LazyLayoutSemanticStateKt.LazyLayoutSemanticState(lazyListState, z);
            composer.updateRememberedValue(rememberedValue);
        }
        LazyLayoutSemanticState lazyLayoutSemanticState = (LazyLayoutSemanticState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyLayoutSemanticState;
    }
}
