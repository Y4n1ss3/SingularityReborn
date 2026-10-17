package androidx.compose.runtime.internal;

import androidx.compose.runtime.CancellationHandle;
import androidx.compose.runtime.OneShotCancellationHandle;
import androidx.compose.runtime.internal.AwaiterQueue.Awaiter;
import defpackage.hi0;
import defpackage.iy;
import defpackage.ky;
import defpackage.p9;
import defpackage.w01;
import defpackage.xa0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AwaiterQueue<A extends Awaiter> {
    public static final int $stable = 8;
    private Throwable failureCause;
    private final Object lock = new Object();
    private final AtomicInt pendingAwaitersCountUnlocked = AtomicAwaitersCount.m4097constructorimpl();
    private xa0 awaiters = new xa0();
    private xa0 spareList = new xa0();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static abstract class Awaiter {
        public static final int $stable = 0;

        public abstract void cancel();

        public abstract void resumeWithException(Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addAwaiter$lambda$1(Awaiter awaiter, AwaiterQueue awaiterQueue, hi0 hi0Var) {
        int i;
        awaiter.cancel();
        AtomicInt atomicInt = awaiterQueue.pendingAwaitersCountUnlocked;
        int i2 = hi0Var.d;
        do {
            i = atomicInt.get();
        } while (!atomicInt.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
        return w01.a;
    }

    public final CancellationHandle addAwaiter(A a, iy iyVar) {
        int i;
        int i2;
        hi0 hi0Var = new hi0();
        hi0Var.d = -1;
        synchronized (this.lock) {
            Throwable th = this.failureCause;
            if (th != null) {
                a.resumeWithException(th);
                return CancellationHandle.Companion.getEmpty$runtime();
            }
            AtomicInt atomicInt = this.pendingAwaitersCountUnlocked;
            do {
                i = atomicInt.get();
                i2 = i + 1;
            } while (!atomicInt.compareAndSet(i, i2));
            int i3 = 1;
            boolean z = (134217727 & i2) == 1;
            hi0Var.d = (i2 >>> 27) & 15;
            this.awaiters.g(a);
            if (z && iyVar != null) {
                try {
                    iyVar.invoke();
                } catch (Throwable th2) {
                    fail(th2);
                }
            }
            return new OneShotCancellationHandle(new p9(a, this, hi0Var, i3));
        }
    }

    public final void fail(Throwable th) {
        int i;
        synchronized (this.lock) {
            try {
                if (this.failureCause != null) {
                    return;
                }
                this.failureCause = th;
                xa0 xa0Var = this.awaiters;
                Object[] objArr = xa0Var.a;
                int i2 = xa0Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((Awaiter) objArr[i3]).resumeWithException(th);
                }
                this.awaiters.j();
                AtomicInt atomicInt = this.pendingAwaitersCountUnlocked;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, AtomicAwaitersCount.m4108packimpl(atomicInt, ((i >>> 27) & 15) + 1, 0)));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void flushAndDispatchAwaiters(ky kyVar) {
        int i;
        int i2;
        synchronized (this.lock) {
            try {
                xa0 xa0Var = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = xa0Var;
                AtomicInt atomicInt = this.pendingAwaitersCountUnlocked;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, AtomicAwaitersCount.m4108packimpl(atomicInt, ((i >>> 27) & 15) + 1, 0)));
                int i3 = xa0Var.b;
                for (i2 = 0; i2 < i3; i2++) {
                    kyVar.invoke(xa0Var.b(i2));
                }
                xa0Var.j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean getHasAwaiters() {
        return (this.pendingAwaitersCountUnlocked.get() & 134217727) > 0;
    }
}
