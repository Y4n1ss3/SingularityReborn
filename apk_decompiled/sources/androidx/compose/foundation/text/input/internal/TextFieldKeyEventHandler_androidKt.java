package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldKeyEventHandler_androidKt {
    public static final TextFieldKeyEventHandler createTextFieldKeyEventHandler() {
        return new AndroidTextFieldKeyEventHandler();
    }

    /* renamed from: isFromSoftKeyboard-ZmokQxo, reason: not valid java name */
    public static final boolean m1338isFromSoftKeyboardZmokQxo(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m1339isKeyCodeYhN2O0w(KeyEvent keyEvent, int i) {
        return Key_androidKt.m5939getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent)) == i;
    }
}
