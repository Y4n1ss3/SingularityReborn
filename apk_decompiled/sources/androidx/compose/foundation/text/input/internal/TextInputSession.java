package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.text.input.TextFieldCharSequence;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface TextInputSession extends ImeEditCommandScope {
    TextFieldCharSequence getText();

    boolean onCommitContent(TransferableContent transferableContent);

    /* renamed from: onImeAction-KlQnJC8 */
    void mo1269onImeActionKlQnJC8(int i);

    int performHandwritingGesture(HandwritingGesture handwritingGesture);

    boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal);

    void requestCursorUpdates(int i);

    void sendKeyEvent(KeyEvent keyEvent);

    void updateTouchMode(boolean z);
}
