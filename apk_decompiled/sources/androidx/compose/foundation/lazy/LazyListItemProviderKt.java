package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import defpackage.eh0;
import defpackage.iy;
import defpackage.ky;
import defpackage.p9;
import defpackage.t6;
import defpackage.w20;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListItemProviderKt {
    public static final iy rememberLazyListItemProviderLambda(LazyListState lazyListState, ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-343736148, i, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:41)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(kyVar, composer, (i >> 3) & 14);
        int i2 = 6;
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            final State derivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new p9(SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new t6(rememberUpdatedState, i2)), lazyListState, new LazyItemScopeImpl(), 7));
            rememberedValue = new eh0(derivedStateOf) { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1
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
    public static final LazyListIntervalContent rememberLazyListItemProviderLambda$lambda$0$0(State state) {
        return new LazyListIntervalContent((ky) state.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyListItemProviderImpl rememberLazyListItemProviderLambda$lambda$0$1(State state, LazyListState lazyListState, LazyItemScopeImpl lazyItemScopeImpl) {
        LazyListIntervalContent lazyListIntervalContent = (LazyListIntervalContent) state.getValue();
        return new LazyListItemProviderImpl(lazyListState, lazyListIntervalContent, lazyItemScopeImpl, new NearestRangeKeyIndexMap(lazyListState.getNearestRange$foundation(), lazyListIntervalContent));
    }
}
