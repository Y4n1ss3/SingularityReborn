package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import defpackage.ky;
import defpackage.st;
import defpackage.te0;
import defpackage.un;
import defpackage.xl;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldPressGestureFilterKt {
    public static final Modifier tapPressTextFieldModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z, ky kyVar) {
        return z ? ComposedModifierKt.composed$default(modifier, null, new xl(9, kyVar, mutableInteractionSource), 1, null) : modifier;
    }

    public static /* synthetic */ Modifier tapPressTextFieldModifier$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z, ky kyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return tapPressTextFieldModifier(modifier, mutableInteractionSource, z, kyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier tapPressTextFieldModifier$lambda$0(ky kyVar, MutableInteractionSource mutableInteractionSource, Modifier modifier, Composer composer, int i) {
        composer.startReplaceGroup(-102778667);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-102778667, i, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, composer);
            composer.updateRememberedValue(rememberedValue);
        }
        un unVar = (un) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(kyVar, composer, 0);
        boolean changed = composer.changed(mutableInteractionSource);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new te0(15, mutableState, mutableInteractionSource);
            composer.updateRememberedValue(rememberedValue3);
        }
        EffectsKt.DisposableEffect(mutableInteractionSource, (ky) rememberedValue3, composer, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        boolean changedInstance = composer.changedInstance(unVar) | composer.changed(mutableInteractionSource) | composer.changed(rememberUpdatedState);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1(unVar, mutableState, mutableInteractionSource, rememberUpdatedState);
            composer.updateRememberedValue(rememberedValue4);
        }
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource, (PointerInputEventHandler) rememberedValue4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return pointerInput;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult tapPressTextFieldModifier$lambda$0$1$0(final MutableState mutableState, final MutableInteractionSource mutableInteractionSource, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$lambda$0$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                PressInteraction.Press press = (PressInteraction.Press) MutableState.this.getValue();
                if (press != null) {
                    PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                    MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                    if (mutableInteractionSource2 != null) {
                        mutableInteractionSource2.tryEmit(cancel);
                    }
                    MutableState.this.setValue(null);
                }
            }
        };
    }
}
