package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import defpackage.eh0;
import defpackage.iy;
import defpackage.ky;
import defpackage.t6;
import defpackage.v4;
import defpackage.w20;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridItemProviderKt {
    public static final iy rememberStaggeredGridItemProviderLambda(LazyStaggeredGridState lazyStaggeredGridState, ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(690901732, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProviderLambda (LazyStaggeredGridItemProvider.kt:37)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(kyVar, composer, (i >> 3) & 14);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(lazyStaggeredGridState)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            final State derivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new v4(21, SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new t6(rememberUpdatedState, 7)), lazyStaggeredGridState));
            rememberedValue = new eh0(derivedStateOf) { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1
                @Override // defpackage.w20
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        w20 w20Var = (w20) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return w20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyStaggeredGridIntervalContent rememberStaggeredGridItemProviderLambda$lambda$0$0(State state) {
        return new LazyStaggeredGridIntervalContent((ky) state.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyStaggeredGridItemProviderImpl rememberStaggeredGridItemProviderLambda$lambda$0$1(State state, LazyStaggeredGridState lazyStaggeredGridState) {
        LazyStaggeredGridIntervalContent lazyStaggeredGridIntervalContent = (LazyStaggeredGridIntervalContent) state.getValue();
        return new LazyStaggeredGridItemProviderImpl(lazyStaggeredGridState, lazyStaggeredGridIntervalContent, new NearestRangeKeyIndexMap(lazyStaggeredGridState.getNearestRange$foundation(), lazyStaggeredGridIntervalContent));
    }
}
