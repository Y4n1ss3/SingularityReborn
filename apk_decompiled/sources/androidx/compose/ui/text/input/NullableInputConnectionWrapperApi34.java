package androidx.compose.ui.text.input;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import defpackage.ky;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
class NullableInputConnectionWrapperApi34 extends NullableInputConnectionWrapperApi25 {
    public NullableInputConnectionWrapperApi34(InputConnection inputConnection, ky kyVar) {
        super(inputConnection, kyVar);
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            delegate.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        boolean previewHandwritingGesture;
        InputConnection delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        previewHandwritingGesture = delegate.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        return previewHandwritingGesture;
    }
}
