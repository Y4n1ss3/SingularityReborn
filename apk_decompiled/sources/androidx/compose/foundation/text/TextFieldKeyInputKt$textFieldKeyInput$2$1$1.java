package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.KeyEvent;
import defpackage.ky;
import defpackage.xy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class TextFieldKeyInputKt$textFieldKeyInput$2$1$1 extends xy implements ky {
    public TextFieldKeyInputKt$textFieldKeyInput$2$1$1(Object obj) {
        super(1, obj, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m1190invokeZmokQxo(((KeyEvent) obj).m5921unboximpl());
    }

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m1190invokeZmokQxo(android.view.KeyEvent keyEvent) {
        return Boolean.valueOf(((TextFieldKeyInput) this.receiver).m1187processZmokQxo(keyEvent));
    }
}
