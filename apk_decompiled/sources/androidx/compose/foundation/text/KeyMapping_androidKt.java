package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyMapping_androidKt {
    private static final KeyMapping platformDefaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        /* renamed from: map-ZmokQxo */
        public KeyCommand mo1116mapZmokQxo(KeyEvent keyEvent) {
            KeyCommand keyCommand = null;
            if (KeyEvent_androidKt.m5938isShiftPressedZmokQxo(keyEvent) && KeyEvent_androidKt.m5935isAltPressedZmokQxo(keyEvent)) {
                long m5932getKeyZmokQxo = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
                Key.Companion companion = Key.Companion;
                if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5689getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5690getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5691getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5686getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (KeyEvent_androidKt.m5935isAltPressedZmokQxo(keyEvent)) {
                long m5932getKeyZmokQxo2 = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
                Key.Companion companion2 = Key.Companion;
                if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5689getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5690getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5691getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.HOME;
                } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5686getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.END;
                }
            }
            return keyCommand == null ? KeyMappingKt.getDefaultKeyMapping().mo1116mapZmokQxo(keyEvent) : keyCommand;
        }
    };

    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
