package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import defpackage.ky;
import defpackage.oq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScrollableStateKt {
    public static final ScrollableState ScrollableState(ky kyVar) {
        return new DefaultScrollableState(kyVar);
    }

    public static final ScrollableState rememberScrollableState(ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-180460798, i, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:169)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(kyVar, composer, i & 14);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = ScrollableState(new oq(rememberUpdatedState, 4));
            composer.updateRememberedValue(rememberedValue);
        }
        ScrollableState scrollableState = (ScrollableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return scrollableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float rememberScrollableState$lambda$0$0(State state, float f) {
        return ((Number) ((ky) state.getValue()).invoke(Float.valueOf(f))).floatValue();
    }
}
