package defpackage;

import androidx.compose.animation.core.AnimationKt;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class eq extends iu implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final eq l;
    public static final long m;

    static {
        Long l2;
        eq eqVar = new eq();
        l = eqVar;
        eqVar.j(false);
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        m = TimeUnit.MILLISECONDS.toNanos(l2.longValue());
    }

    @Override // defpackage.iu, defpackage.yq
    public final qr c(long j, Runnable runnable, kn knVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? SnapshotId_jvmKt.SnapshotIdMax : AnimationKt.MillisToNanos * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return tc0.d;
        }
        long nanoTime = System.nanoTime();
        fu fuVar = new fu(runnable, j2 + nanoTime);
        t(nanoTime, fuVar);
        return fuVar;
    }

    @Override // defpackage.iu
    public final void m(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.m(runnable);
    }

    @Override // defpackage.iu
    public final Thread q() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(l.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean r;
        xu0.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (r) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long k = k();
                    if (k == SnapshotId_jvmKt.SnapshotIdMax) {
                        long nanoTime = System.nanoTime();
                        if (j == SnapshotId_jvmKt.SnapshotIdMax) {
                            j = m + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            u();
                            if (r()) {
                                return;
                            }
                            q();
                            return;
                        }
                        if (k > j2) {
                            k = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (k > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            u();
                            if (r()) {
                                return;
                            }
                            q();
                            return;
                        }
                        LockSupport.parkNanos(this, k);
                    }
                }
            }
        } finally {
            _thread = null;
            u();
            if (!r()) {
                q();
            }
        }
    }

    @Override // defpackage.iu
    public final void s(long j, gu guVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.iu, defpackage.du
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.mn
    public final String toString() {
        return "DefaultExecutor";
    }

    public final synchronized void u() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = dc.a;
            unsafe.putObjectVolatile(this, iu.j, (Object) null);
            unsafe.putObjectVolatile(this, iu.h, (Object) null);
            notifyAll();
        }
    }
}
