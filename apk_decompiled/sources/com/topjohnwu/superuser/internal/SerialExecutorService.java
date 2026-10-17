package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.Shell;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class SerialExecutorService extends AbstractExecutorService implements Callable<Void>, AutoCloseable {
    private boolean isShutdown = false;
    private ArrayDeque<Runnable> mTasks = new ArrayDeque<>();
    private FutureTask<Void> scheduleTask = null;

    @Override // java.util.concurrent.ExecutorService
    public synchronized boolean awaitTermination(long j, TimeUnit timeUnit) {
        FutureTask<Void> futureTask = this.scheduleTask;
        if (futureTask == null) {
            return true;
        }
        try {
            futureTask.get(j, timeUnit);
        } catch (ExecutionException unused) {
        } catch (TimeoutException unused2) {
            return false;
        }
        return true;
    }

    @Override // java.util.concurrent.Callable
    public Void call() {
        Runnable poll;
        while (true) {
            synchronized (this) {
                try {
                    poll = this.mTasks.poll();
                    if (poll == null) {
                        this.scheduleTask = null;
                        return null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            poll.run();
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        if (this.isShutdown) {
            throw new RejectedExecutionException("Task " + runnable.toString() + " rejected from " + toString());
        }
        this.mTasks.offer(runnable);
        if (this.scheduleTask == null) {
            FutureTask<Void> futureTask = new FutureTask<>(this);
            this.scheduleTask = futureTask;
            Shell.EXECUTOR.execute(futureTask);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public synchronized boolean isShutdown() {
        return this.isShutdown;
    }

    @Override // java.util.concurrent.ExecutorService
    public synchronized boolean isTerminated() {
        boolean z;
        if (this.isShutdown) {
            z = this.scheduleTask == null;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public synchronized void shutdown() {
        this.isShutdown = true;
        this.mTasks.clear();
    }

    @Override // java.util.concurrent.ExecutorService
    public synchronized List<Runnable> shutdownNow() {
        this.isShutdown = true;
        FutureTask<Void> futureTask = this.scheduleTask;
        if (futureTask != null) {
            futureTask.cancel(true);
        }
        try {
        } finally {
            this.mTasks.clear();
        }
        return new ArrayList(this.mTasks);
    }
}
