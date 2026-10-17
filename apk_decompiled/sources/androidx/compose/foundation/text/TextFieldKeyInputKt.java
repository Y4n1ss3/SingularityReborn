package androidx.compose.foundation.text;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldKeyInputKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import defpackage.ky;
import defpackage.m20;
import defpackage.ny;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldKeyInputKt {
    /* renamed from: textFieldKeyInput-2WJ9YEU, reason: not valid java name */
    public static final Modifier m1188textFieldKeyInput2WJ9YEU(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldSelectionManager textFieldSelectionManager, final TextFieldValue textFieldValue, final ky kyVar, final boolean z, final boolean z2, final OffsetMapping offsetMapping, final UndoManager undoManager, final int i) {
        return ComposedModifierKt.composed$default(modifier, null, new ny() { // from class: cu0
            @Override // defpackage.ny
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Modifier textFieldKeyInput_2WJ9YEU$lambda$1;
                int intValue = ((Integer) obj3).intValue();
                textFieldKeyInput_2WJ9YEU$lambda$1 = TextFieldKeyInputKt.textFieldKeyInput_2WJ9YEU$lambda$1(LegacyTextFieldState.this, textFieldSelectionManager, textFieldValue, z, z2, offsetMapping, undoManager, kyVar, i, (Modifier) obj, (Composer) obj2, intValue);
                return textFieldKeyInput_2WJ9YEU$lambda$1;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 textFieldKeyInput_2WJ9YEU$lambda$0(TextFieldValue textFieldValue) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier textFieldKeyInput_2WJ9YEU$lambda$1(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, OffsetMapping offsetMapping, UndoManager undoManager, ky kyVar, int i, Modifier modifier, Composer composer, int i2) {
        composer.startReplaceGroup(851809892);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(851809892, i2, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:255)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new TextPreparedSelectionState();
            composer.updateRememberedValue(rememberedValue);
        }
        TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new DeadKeyCombiner();
            composer.updateRememberedValue(rememberedValue2);
        }
        TextFieldKeyInput textFieldKeyInput = new TextFieldKeyInput(legacyTextFieldState, textFieldSelectionManager, textFieldValue, z, z2, textPreparedSelectionState, offsetMapping, undoManager, (DeadKeyCombiner) rememberedValue2, null, kyVar, i, Fields.RotationY, null);
        Modifier.Companion companion2 = Modifier.Companion;
        boolean changedInstance = composer.changedInstance(textFieldKeyInput);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new TextFieldKeyInputKt$textFieldKeyInput$2$1$1(textFieldKeyInput);
            composer.updateRememberedValue(rememberedValue3);
        }
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, (ky) ((m20) rememberedValue3));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return onKeyEvent;
    }
}
