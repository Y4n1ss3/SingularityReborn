package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LegacyAdaptingPlatformTextInputModifierNodeKt {
    public static final Modifier legacyTextInputAdapter(Modifier modifier, LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        return modifier.then(new LegacyAdaptingPlatformTextInputModifier(legacyPlatformTextInputServiceAdapter, legacyTextFieldState, textFieldSelectionManager));
    }
}
