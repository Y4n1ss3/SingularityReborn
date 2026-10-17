package androidx.compose.runtime;

import androidx.compose.runtime.internal.AtomicBoolean;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.AwaiterQueue;
import defpackage.iy;
import defpackage.v4;
import defpackage.w01;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NextFrameEndCallbackQueue {
    public static final int $stable = 8;
    private final iy onNewAwaiters;
    private final AtomicInt isFrameOngoing = AtomicBoolean.m4114constructorimpl(false);
    private final AwaiterQueue<NextFrameEndAwaiter> frameEndQueue = new AwaiterQueue<>();

    public NextFrameEndCallbackQueue(iy iyVar) {
        this.onNewAwaiters = new v4(26, this, iyVar);
    }

    public static /* synthetic */ void cancel$default(NextFrameEndCallbackQueue nextFrameEndCallbackQueue, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = new CancellationException("scheduler cancelled");
        }
        nextFrameEndCallbackQueue.cancel(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 markFrameComplete$lambda$0(NextFrameEndAwaiter nextFrameEndAwaiter) {
        nextFrameEndAwaiter.resume();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 onNewAwaiters$lambda$0(NextFrameEndCallbackQueue nextFrameEndCallbackQueue, iy iyVar) {
        if (!AtomicBoolean.m4118getimpl(nextFrameEndCallbackQueue.isFrameOngoing)) {
            iyVar.invoke();
        }
        return w01.a;
    }

    public final void cancel(CancellationException cancellationException) {
        this.frameEndQueue.fail(cancellationException);
    }

    public final boolean getHasAwaiters() {
        return this.frameEndQueue.getHasAwaiters();
    }

    public final void markFrameComplete() {
        AtomicBoolean.m4121setimpl(this.isFrameOngoing, false);
        this.frameEndQueue.flushAndDispatchAwaiters(new h());
    }

    public final void markFrameStarted() {
        AtomicBoolean.m4121setimpl(this.isFrameOngoing, true);
    }

    public final CancellationHandle scheduleFrameEndCallback(iy iyVar) {
        return this.frameEndQueue.addAwaiter(new NextFrameEndAwaiter(iyVar), this.onNewAwaiters);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class NextFrameEndAwaiter extends AwaiterQueue.Awaiter {
        private iy onNextFrameEnd;

        public NextFrameEndAwaiter(iy iyVar) {
            this.onNextFrameEnd = iyVar;
        }

        @Override // androidx.compose.runtime.internal.AwaiterQueue.Awaiter
        public void cancel() {
            this.onNextFrameEnd = null;
        }

        public final void resume() {
            iy iyVar = this.onNextFrameEnd;
            if (iyVar != null) {
                iyVar.invoke();
            }
        }

        @Override // androidx.compose.runtime.internal.AwaiterQueue.Awaiter
        public void resumeWithException(Throwable th) {
            throw th;
        }
    }
}
