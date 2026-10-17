package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DeadKeyCombiner {
    public static final int $stable = 8;
    private Integer deadKeyCode;

    /* renamed from: consume-ZmokQxo, reason: not valid java name */
    public final Integer m1113consumeZmokQxo(KeyEvent keyEvent) {
        int m5934getUtf16CodePointZmokQxo = KeyEvent_androidKt.m5934getUtf16CodePointZmokQxo(keyEvent);
        if ((Integer.MIN_VALUE & m5934getUtf16CodePointZmokQxo) != 0) {
            this.deadKeyCode = Integer.valueOf(m5934getUtf16CodePointZmokQxo & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.deadKeyCode;
        if (num == null) {
            return Integer.valueOf(m5934getUtf16CodePointZmokQxo);
        }
        this.deadKeyCode = null;
        Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), m5934getUtf16CodePointZmokQxo));
        Integer num2 = valueOf.intValue() != 0 ? valueOf : null;
        if (num2 != null) {
            m5934getUtf16CodePointZmokQxo = num2.intValue();
        }
        return Integer.valueOf(m5934getUtf16CodePointZmokQxo);
    }
}
