package androidx.compose.foundation.text;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.ImeAction;
import defpackage.ky;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyboardActionRunner implements KeyboardActionScope {
    public static final int $stable = 8;
    public FocusManager focusManager;
    public KeyboardActions keyboardActions;
    private final SoftwareKeyboardController keyboardController;

    public KeyboardActionRunner(SoftwareKeyboardController softwareKeyboardController) {
        this.keyboardController = softwareKeyboardController;
    }

    /* renamed from: defaultKeyboardActionWithResult-KlQnJC8, reason: not valid java name */
    private final boolean m1117defaultKeyboardActionWithResultKlQnJC8(int i) {
        SoftwareKeyboardController softwareKeyboardController;
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m7228equalsimpl0(i, companion.m7244getNexteUduSuo())) {
            getFocusManager().mo4403moveFocus3ESFkO8(FocusDirection.Companion.m4396getNextdhqQ8s());
            return true;
        }
        if (ImeAction.m7228equalsimpl0(i, companion.m7246getPreviouseUduSuo())) {
            getFocusManager().mo4403moveFocus3ESFkO8(FocusDirection.Companion.m4397getPreviousdhqQ8s());
            return true;
        }
        if (!ImeAction.m7228equalsimpl0(i, companion.m7242getDoneeUduSuo()) || (softwareKeyboardController = this.keyboardController) == null) {
            return false;
        }
        softwareKeyboardController.hide();
        return true;
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
    public void mo1118defaultKeyboardActionKlQnJC8(int i) {
        m1117defaultKeyboardActionWithResultKlQnJC8(i);
    }

    public final FocusManager getFocusManager() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        q10.H("focusManager");
        throw null;
    }

    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        q10.H("keyboardActions");
        throw null;
    }

    /* renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final boolean m1119runActionKlQnJC8(int i) {
        ky kyVar;
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m7228equalsimpl0(i, companion.m7242getDoneeUduSuo())) {
            kyVar = getKeyboardActions().getOnDone();
        } else if (ImeAction.m7228equalsimpl0(i, companion.m7243getGoeUduSuo())) {
            kyVar = getKeyboardActions().getOnGo();
        } else if (ImeAction.m7228equalsimpl0(i, companion.m7244getNexteUduSuo())) {
            kyVar = getKeyboardActions().getOnNext();
        } else if (ImeAction.m7228equalsimpl0(i, companion.m7246getPreviouseUduSuo())) {
            kyVar = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m7228equalsimpl0(i, companion.m7247getSearcheUduSuo())) {
            kyVar = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m7228equalsimpl0(i, companion.m7248getSendeUduSuo())) {
            kyVar = getKeyboardActions().getOnSend();
        } else {
            if (!ImeAction.m7228equalsimpl0(i, companion.m7241getDefaulteUduSuo()) && !ImeAction.m7228equalsimpl0(i, companion.m7245getNoneeUduSuo())) {
                o.f("invalid ImeAction");
                return false;
            }
            kyVar = null;
        }
        if (kyVar == null) {
            return m1117defaultKeyboardActionWithResultKlQnJC8(i);
        }
        kyVar.invoke(this);
        return true;
    }

    public final void setFocusManager(FocusManager focusManager) {
        this.focusManager = focusManager;
    }

    public final void setKeyboardActions(KeyboardActions keyboardActions) {
        this.keyboardActions = keyboardActions;
    }
}
