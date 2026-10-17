package androidx.compose.foundation.lazy.grid;

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
public final class LazyGridItemProviderKt {
    public static final iy rememberLazyGridItemProviderLambda(LazyGridState lazyGridState, ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1898306282, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(kyVar, composer, (i >> 3) & 14);
        int i2 = 4;
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(lazyGridState)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            final State derivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new v4(18, SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new t6(rememberUpdatedState, i2)), lazyGridState));
            rememberedValue = new eh0(derivedStateOf) { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$1
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
    public static final LazyGridIntervalContent rememberLazyGridItemProviderLambda$lambda$0$0(State state) {
        return new LazyGridIntervalContent((ky) state.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridItemProviderImpl rememberLazyGridItemProviderLambda$lambda$0$1(State state, LazyGridState lazyGridState) {
        LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) state.getValue();
        return new LazyGridItemProviderImpl(lazyGridState, lazyGridIntervalContent, new NearestRangeKeyIndexMap(lazyGridState.getNearestRange$foundation(), lazyGridIntervalContent));
    }
}
