package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public static final int $stable = 8;

    public PointerEventTimeoutCancellationException(long j) {
        super("Timed out waiting for " + j + " ms");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArr;
        stackTraceElementArr = SuspendingPointerInputFilter_jvmAndAndroidKt.EmptyStackTraceElements;
        setStackTrace(stackTraceElementArr);
        return this;
    }
}
