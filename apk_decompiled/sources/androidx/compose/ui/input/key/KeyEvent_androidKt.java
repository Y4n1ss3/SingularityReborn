package androidx.compose.ui.input.key;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyEvent_androidKt {
    /* renamed from: getKey-ZmokQxo, reason: not valid java name */
    public static final long m5932getKeyZmokQxo(android.view.KeyEvent keyEvent) {
        return Key_androidKt.Key(keyEvent.getKeyCode());
    }

    /* renamed from: getType-ZmokQxo, reason: not valid java name */
    public static final int m5933getTypeZmokQxo(android.view.KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        return action != 0 ? action != 1 ? KeyEventType.Companion.m5931getUnknownCS__XNY() : KeyEventType.Companion.m5930getKeyUpCS__XNY() : KeyEventType.Companion.m5929getKeyDownCS__XNY();
    }

    /* renamed from: getUtf16CodePoint-ZmokQxo, reason: not valid java name */
    public static final int m5934getUtf16CodePointZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    /* renamed from: isAltPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m5935isAltPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    /* renamed from: isCtrlPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m5936isCtrlPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    /* renamed from: isMetaPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m5937isMetaPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isMetaPressed();
    }

    /* renamed from: isShiftPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m5938isShiftPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
