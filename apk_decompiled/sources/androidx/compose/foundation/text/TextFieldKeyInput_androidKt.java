package androidx.compose.foundation.text;

import android.view.KeyEvent;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldKeyInput_androidKt {
    /* renamed from: isTypedEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m1191isTypedEventZmokQxo(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }
}
