package androidx.compose.foundation.text.input.internal;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.text.TextFieldKeyInput_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import defpackage.iy;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidTextFieldKeyEventHandler extends TextFieldKeyEventHandler {
    public static final int $stable = 8;

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* renamed from: onKeyEvent-8zsqlwg, reason: not valid java name */
    public boolean mo1265onKeyEvent8zsqlwg(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, ky kyVar, SoftwareKeyboardController softwareKeyboardController, boolean z, boolean z2, iy iyVar) {
        if (KeyEventType.m5925equalsimpl0(KeyEvent_androidKt.m5933getTypeZmokQxo(keyEvent), KeyEventType.Companion.m5929getKeyDownCS__XNY()) && keyEvent.isFromSource(257) && (!TextFieldKeyEventHandler_androidKt.m1338isFromSoftKeyboardZmokQxo(keyEvent) || !TextFieldKeyInput_androidKt.m1191isTypedEventZmokQxo(keyEvent))) {
            textFieldSelectionState.setInTouchMode(false);
        }
        return super.mo1265onKeyEvent8zsqlwg(keyEvent, transformedTextFieldState, textLayoutState, textFieldSelectionState, kyVar, softwareKeyboardController, z, z2, iyVar);
    }

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* renamed from: onPreKeyEvent-MyFupTE, reason: not valid java name */
    public boolean mo1266onPreKeyEventMyFupTE(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController) {
        boolean m1339isKeyCodeYhN2O0w;
        boolean m1339isKeyCodeYhN2O0w2;
        boolean m1339isKeyCodeYhN2O0w3;
        boolean m1339isKeyCodeYhN2O0w4;
        boolean m1339isKeyCodeYhN2O0w5;
        boolean mo1266onPreKeyEventMyFupTE = super.mo1266onPreKeyEventMyFupTE(keyEvent, transformedTextFieldState, textFieldSelectionState, focusManager, softwareKeyboardController);
        if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
            return mo1266onPreKeyEventMyFupTE;
        }
        if (mo1266onPreKeyEventMyFupTE) {
            return true;
        }
        InputDevice device = keyEvent.getDevice();
        if (device == null || !device.supportsSource(513) || device.isVirtual() || !KeyEventType.m5925equalsimpl0(KeyEvent_androidKt.m5933getTypeZmokQxo(keyEvent), KeyEventType.Companion.m5929getKeyDownCS__XNY()) || keyEvent.getSource() == 257) {
            return false;
        }
        m1339isKeyCodeYhN2O0w = TextFieldKeyEventHandler_androidKt.m1339isKeyCodeYhN2O0w(keyEvent, 19);
        if (m1339isKeyCodeYhN2O0w) {
            return focusManager.mo4403moveFocus3ESFkO8(FocusDirection.Companion.m4399getUpdhqQ8s());
        }
        m1339isKeyCodeYhN2O0w2 = TextFieldKeyEventHandler_androidKt.m1339isKeyCodeYhN2O0w(keyEvent, 20);
        if (m1339isKeyCodeYhN2O0w2) {
            return focusManager.mo4403moveFocus3ESFkO8(FocusDirection.Companion.m4392getDowndhqQ8s());
        }
        m1339isKeyCodeYhN2O0w3 = TextFieldKeyEventHandler_androidKt.m1339isKeyCodeYhN2O0w(keyEvent, 21);
        if (m1339isKeyCodeYhN2O0w3) {
            return focusManager.mo4403moveFocus3ESFkO8(FocusDirection.Companion.m4395getLeftdhqQ8s());
        }
        m1339isKeyCodeYhN2O0w4 = TextFieldKeyEventHandler_androidKt.m1339isKeyCodeYhN2O0w(keyEvent, 22);
        if (m1339isKeyCodeYhN2O0w4) {
            return focusManager.mo4403moveFocus3ESFkO8(FocusDirection.Companion.m4398getRightdhqQ8s());
        }
        m1339isKeyCodeYhN2O0w5 = TextFieldKeyEventHandler_androidKt.m1339isKeyCodeYhN2O0w(keyEvent, 23);
        if (!m1339isKeyCodeYhN2O0w5) {
            return false;
        }
        softwareKeyboardController.show();
        return true;
    }
}
