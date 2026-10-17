package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import defpackage.ky;
import defpackage.oq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Scrollable2DStateKt {
    public static final Scrollable2DState Scrollable2DState(ky kyVar) {
        return new DefaultScrollable2DState(kyVar);
    }

    public static final Scrollable2DState rememberScrollable2DState(ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1315827064, i, -1, "androidx.compose.foundation.gestures.rememberScrollable2DState (Scrollable2DState.kt:122)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(kyVar, composer, i & 14);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = Scrollable2DState(new oq(rememberUpdatedState, 3));
            composer.updateRememberedValue(rememberedValue);
        }
        Scrollable2DState scrollable2DState = (Scrollable2DState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return scrollable2DState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset rememberScrollable2DState$lambda$0$0(State state, Offset offset) {
        return (Offset) ((ky) state.getValue()).invoke(offset);
    }
}
