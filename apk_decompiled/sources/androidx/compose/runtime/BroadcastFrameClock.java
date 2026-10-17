package androidx.compose.runtime;

import androidx.compose.runtime.BroadcastFrameClock;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.AwaiterQueue;
import defpackage.d41;
import defpackage.dq;
import defpackage.fg;
import defpackage.gg;
import defpackage.hm;
import defpackage.in;
import defpackage.iy;
import defpackage.jj0;
import defpackage.jn;
import defpackage.kn;
import defpackage.ky;
import defpackage.my;
import defpackage.p10;
import defpackage.w01;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private final iy onNewAwaiters;
    private final AwaiterQueue<FrameAwaiter<?>> queue;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class FrameAwaiter<R> extends AwaiterQueue.Awaiter {
        private fg continuation;
        private ky onFrame;

        public FrameAwaiter(ky kyVar, fg fgVar) {
            this.continuation = fgVar;
            this.onFrame = kyVar;
        }

        @Override // androidx.compose.runtime.internal.AwaiterQueue.Awaiter
        public void cancel() {
            this.onFrame = null;
            this.continuation = null;
        }

        public final void resume(long j) {
            fg fgVar;
            Object jj0Var;
            ky kyVar = this.onFrame;
            if (kyVar == null || (fgVar = this.continuation) == null) {
                return;
            }
            try {
                jj0Var = kyVar.invoke(Long.valueOf(j));
            } catch (Throwable th) {
                jj0Var = new jj0(th);
            }
            fgVar.resumeWith(jj0Var);
        }

        @Override // androidx.compose.runtime.internal.AwaiterQueue.Awaiter
        public void resumeWithException(Throwable th) {
            fg fgVar = this.continuation;
            if (fgVar != null) {
                fgVar.resumeWith(p10.p(th));
            }
        }
    }

    public BroadcastFrameClock(iy iyVar) {
        this.onNewAwaiters = iyVar;
        this.queue = new AwaiterQueue<>();
    }

    public static /* synthetic */ void cancel$default(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.cancel(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 sendFrame$lambda$0(long j, FrameAwaiter frameAwaiter) {
        frameAwaiter.resume(j);
        return w01.a;
    }

    public final void cancel(CancellationException cancellationException) {
        this.queue.fail(cancellationException);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.kn
    public /* bridge */ <R> R fold(R r, my myVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, myVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.kn
    public /* bridge */ <E extends in> E get(jn jnVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, jnVar);
    }

    public final boolean getHasAwaiters() {
        return this.queue.getHasAwaiters();
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.kn
    public /* bridge */ kn minusKey(jn jnVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, jnVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.kn
    public /* bridge */ kn plus(kn knVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, knVar);
    }

    public final void sendFrame(final long j) {
        this.queue.flushAndDispatchAwaiters(new ky() { // from class: androidx.compose.runtime.b
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 sendFrame$lambda$0;
                sendFrame$lambda$0 = BroadcastFrameClock.sendFrame$lambda$0(j, (BroadcastFrameClock.FrameAwaiter) obj);
                return sendFrame$lambda$0;
            }
        });
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(ky kyVar, hm hmVar) {
        gg ggVar = new gg(1, d41.C(hmVar));
        ggVar.u();
        final CancellationHandle addAwaiter = this.queue.addAwaiter(new FrameAwaiter(kyVar, ggVar), this.onNewAwaiters);
        ggVar.d(new ky() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$1
            @Override // defpackage.ky
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return w01.a;
            }

            public final void invoke(Throwable th) {
                CancellationHandle.this.cancel();
            }
        });
        return ggVar.s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastFrameClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ BroadcastFrameClock(iy iyVar, int i, dq dqVar) {
        this((i & 1) != 0 ? null : iyVar);
    }
}
