package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MediaQueryKt {
    private static final ProvidableCompositionLocal<UiMediaScope> LocalUiMediaScope = CompositionLocalKt.staticCompositionLocalOf(MediaQueryKt$LocalUiMediaScope$1.INSTANCE);

    public static final State<Boolean> derivedMediaQuery(ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-287752256, i, -1, "androidx.compose.ui.derivedMediaQuery (MediaQuery.kt:251)");
        }
        UiMediaScope uiMediaScope = (UiMediaScope) composer.consume(LocalUiMediaScope);
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(kyVar, composer, i & 14);
        boolean changed = composer.changed(uiMediaScope);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new MediaQueryKt$derivedMediaQuery$1$1(uiMediaScope, rememberUpdatedState));
            composer.updateRememberedValue(rememberedValue);
        }
        State<Boolean> state = (State) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky derivedMediaQuery$lambda$0(State<? extends ky> state) {
        return state.getValue();
    }

    public static final ProvidableCompositionLocal<UiMediaScope> getLocalUiMediaScope() {
        return LocalUiMediaScope;
    }

    public static final boolean mediaQuery(ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1936917258, i, -1, "androidx.compose.ui.mediaQuery (MediaQuery.kt:232)");
        }
        boolean booleanValue = ((Boolean) kyVar.invoke(composer.consume(LocalUiMediaScope))).booleanValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return booleanValue;
    }

    public static /* synthetic */ void getLocalUiMediaScope$annotations() {
    }

    public static final boolean mediaQuery(CompositionLocalAccessorScope compositionLocalAccessorScope, ky kyVar) {
        return ((Boolean) kyVar.invoke(compositionLocalAccessorScope.getCurrentValue(getLocalUiMediaScope()))).booleanValue();
    }

    public static final boolean mediaQuery(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode, ky kyVar) {
        return ((Boolean) kyVar.invoke(CompositionLocalConsumerModifierNodeKt.currentValueOf(compositionLocalConsumerModifierNode, getLocalUiMediaScope()))).booleanValue();
    }
}
