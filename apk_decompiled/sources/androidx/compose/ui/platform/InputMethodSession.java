package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.WeakReference;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper_androidKt;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class InputMethodSession {
    private boolean disposed;
    private final iy onAllConnectionsClosed;
    private final PlatformTextInputMethodRequest request;
    private final Object lock = new Object();
    private MutableVector<WeakReference<NullableInputConnectionWrapper>> connections = new MutableVector<>(new WeakReference[16], 0);

    public InputMethodSession(PlatformTextInputMethodRequest platformTextInputMethodRequest, iy iyVar) {
        this.request = platformTextInputMethodRequest;
        this.onAllConnectionsClosed = iyVar;
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        synchronized (this.lock) {
            if (this.disposed) {
                return null;
            }
            NullableInputConnectionWrapper NullableInputConnectionWrapper = NullableInputConnectionWrapper_androidKt.NullableInputConnectionWrapper(this.request.createInputConnection(editorInfo), new InputMethodSession$createInputConnection$1$1(this));
            this.connections.add(new WeakReference<>(NullableInputConnectionWrapper));
            return NullableInputConnectionWrapper;
        }
    }

    public final void dispose() {
        synchronized (this.lock) {
            try {
                this.disposed = true;
                MutableVector<WeakReference<NullableInputConnectionWrapper>> mutableVector = this.connections;
                WeakReference<NullableInputConnectionWrapper>[] weakReferenceArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    NullableInputConnectionWrapper nullableInputConnectionWrapper = weakReferenceArr[i].get();
                    if (nullableInputConnectionWrapper != null) {
                        nullableInputConnectionWrapper.disposeDelegate();
                    }
                }
                this.connections.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isActive() {
        return !this.disposed;
    }
}
