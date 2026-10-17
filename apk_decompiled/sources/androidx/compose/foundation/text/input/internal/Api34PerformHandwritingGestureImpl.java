package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class Api34PerformHandwritingGestureImpl {
    public static final Api34PerformHandwritingGestureImpl INSTANCE = new Api34PerformHandwritingGestureImpl();

    private Api34PerformHandwritingGestureImpl() {
    }

    public final void performHandwritingGesture(TextInputSession textInputSession, HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int performHandwritingGesture = textInputSession.performHandwritingGesture(handwritingGesture);
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new e(intConsumer, performHandwritingGesture, 1));
        } else {
            intConsumer.accept(performHandwritingGesture);
        }
    }

    public final boolean previewHandwritingGesture(TextInputSession textInputSession, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        return textInputSession.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
    }
}
