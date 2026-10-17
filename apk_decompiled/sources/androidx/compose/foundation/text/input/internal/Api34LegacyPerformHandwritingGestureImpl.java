package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.platform.ViewConfiguration;
import defpackage.ky;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class Api34LegacyPerformHandwritingGestureImpl {
    public static final Api34LegacyPerformHandwritingGestureImpl INSTANCE = new Api34LegacyPerformHandwritingGestureImpl();

    private Api34LegacyPerformHandwritingGestureImpl() {
    }

    public final void performHandwritingGesture(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, HandwritingGesture handwritingGesture, ViewConfiguration viewConfiguration, Executor executor, IntConsumer intConsumer, ky kyVar) {
        int performHandwritingGesture$foundation = legacyTextFieldState != null ? HandwritingGestureApi34.INSTANCE.performHandwritingGesture$foundation(legacyTextFieldState, handwritingGesture, textFieldSelectionManager, viewConfiguration, kyVar) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new e(intConsumer, performHandwritingGesture$foundation, 0));
        } else {
            intConsumer.accept(performHandwritingGesture$foundation);
        }
    }

    public final boolean previewHandwritingGesture(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (legacyTextFieldState != null) {
            return HandwritingGestureApi34.INSTANCE.previewHandwritingGesture$foundation(legacyTextFieldState, previewableHandwritingGesture, textFieldSelectionManager, cancellationSignal);
        }
        return false;
    }
}
