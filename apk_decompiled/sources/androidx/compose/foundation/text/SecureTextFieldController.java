package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusState;
import defpackage.ah;
import defpackage.d41;
import defpackage.hm;
import defpackage.jh;
import defpackage.mb0;
import defpackage.tc;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;
import defpackage.zg;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SecureTextFieldController {
    public static final int $stable = 8;
    private final State<Character> obfuscationMaskState;
    private final PasswordInputTransformation passwordInputTransformation = new PasswordInputTransformation(new SecureTextFieldController$passwordInputTransformation$1(this));
    private final CodepointTransformation codepointTransformation = new tc(this, 1);
    private final Modifier focusChangeModifier = FocusChangedModifierKt.onFocusChanged(Modifier.Companion, new mb0(this, 17));
    private final zg resetTimerSignal = d41.b(Integer.MAX_VALUE, 6, null);

    public SecureTextFieldController(State<Character> state) {
        this.obfuscationMaskState = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int codepointTransformation$lambda$0(SecureTextFieldController secureTextFieldController, int i, int i2) {
        return i == secureTextFieldController.passwordInputTransformation.getRevealCodepointIndex$foundation() ? i2 : secureTextFieldController.obfuscationMaskState.getValue().charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 focusChangeModifier$lambda$0(SecureTextFieldController secureTextFieldController, FocusState focusState) {
        if (!focusState.isFocused()) {
            secureTextFieldController.passwordInputTransformation.hide();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleHide() {
        if (this.resetTimerSignal.m(w01.a) instanceof jh) {
            this.passwordInputTransformation.hide();
        }
    }

    public final CodepointTransformation getCodepointTransformation() {
        return this.codepointTransformation;
    }

    public final Modifier getFocusChangeModifier() {
        return this.focusChangeModifier;
    }

    public final PasswordInputTransformation getPasswordInputTransformation() {
        return this.passwordInputTransformation;
    }

    public final Object observeHideEvents(hm hmVar) {
        Object k = y80.k(new ah(this.resetTimerSignal, true), new SecureTextFieldController$observeHideEvents$2(this, null), hmVar);
        return k == vn.d ? k : w01.a;
    }
}
