package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyEventHelpers_androidKt {
    /* renamed from: cancelsTextSelection-ZmokQxo, reason: not valid java name */
    public static final boolean m1115cancelsTextSelectionZmokQxo(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 4 && KeyEventType.m5925equalsimpl0(KeyEvent_androidKt.m5933getTypeZmokQxo(keyEvent), KeyEventType.Companion.m5930getKeyUpCS__XNY());
    }

    public static final void showCharacterPalette() {
    }
}
