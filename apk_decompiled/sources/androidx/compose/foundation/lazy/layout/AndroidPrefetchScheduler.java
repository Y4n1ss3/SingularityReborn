package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.ui.util.AndroidTrace_androidKt;
import defpackage.dq;
import defpackage.q10;
import defpackage.y5;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidPrefetchScheduler implements PrefetchScheduler, PriorityPrefetchScheduler, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    private static long frameIntervalNs;
    private long frameStartTimeNanos;
    private boolean isActive;
    private boolean prefetchScheduled;
    private final View view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final PriorityQueue<PriorityTask> prefetchRequests = new PriorityQueue<>(11, new y5(0));
    private final Choreographer choreographer = Choreographer.getInstance();
    private final PrefetchRequestScopeImpl scope = new PrefetchRequestScopeImpl();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class PrefetchRequestScopeImpl implements PrefetchRequestScope {
        public static final int $stable = 8;
        private boolean isFrameIdle;
        private long nextFrameTimeNs;

        @Override // androidx.compose.foundation.lazy.layout.PrefetchRequestScope
        public long availableTimeNanos() {
            return this.isFrameIdle ? SnapshotId_jvmKt.SnapshotIdMax : Math.max(0L, this.nextFrameTimeNs - System.nanoTime());
        }

        public final long getNextFrameTimeNs() {
            return this.nextFrameTimeNs;
        }

        public final boolean isFrameIdle() {
            return this.isFrameIdle;
        }

        public final void setFrameIdle(boolean z) {
            this.isFrameIdle = z;
        }

        public final void setNextFrameTimeNs(long j) {
            this.nextFrameTimeNs = j;
        }
    }

    public AndroidPrefetchScheduler(View view) {
        this.view = view;
        Companion.calculateFrameIntervalIfNeeded(view);
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int prefetchRequests$lambda$0(PriorityTask priorityTask, PriorityTask priorityTask2) {
        return q10.h(priorityTask2.getPriority(), priorityTask.getPriority());
    }

    private final boolean runRequest() {
        long availableTimeNanos = this.scope.availableTimeNanos();
        AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:available_time_nanos", availableTimeNanos);
        boolean z = true;
        if (availableTimeNanos > 0) {
            PriorityTask peek = this.prefetchRequests.peek();
            peek.getClass();
            if (!peek.getRequest().execute(this.scope)) {
                this.prefetchRequests.poll();
                z = false;
            }
            this.scope.setFrameIdle(false);
        }
        return z;
    }

    private final void startExecution() {
        if (this.prefetchScheduled) {
            return;
        }
        this.prefetchScheduled = true;
        this.view.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.isActive) {
            this.frameStartTimeNanos = j;
            this.view.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.isActive = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.isActive = false;
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prefetchRequests.isEmpty() || !this.prefetchScheduled || !this.isActive || this.view.getWindowVisibility() != 0) {
            this.prefetchScheduled = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.view.getDrawingTime());
        this.scope.setFrameIdle(System.nanoTime() > (2 * frameIntervalNs) + nanos);
        this.scope.setNextFrameTimeNs(Math.max(this.frameStartTimeNanos, nanos) + frameIntervalNs);
        boolean z = false;
        while (!this.prefetchRequests.isEmpty() && !z) {
            if (this.scope.isFrameIdle()) {
                Trace.beginSection("compose:lazy:prefetch:idle_frame");
                try {
                    z = runRequest();
                } finally {
                    Trace.endSection();
                }
            } else {
                z = runRequest();
            }
        }
        if (z) {
            this.choreographer.postFrameCallback(this);
        } else {
            this.prefetchScheduled = false;
        }
        AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:available_time_nanos", 0L);
    }

    @Override // androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler
    public void scheduleHighPriorityPrefetch(PrefetchRequest prefetchRequest) {
        this.prefetchRequests.add(new PriorityTask(PriorityTask.Companion.getHigh(), prefetchRequest));
        startExecution();
    }

    @Override // androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler
    public void scheduleLowPriorityPrefetch(PrefetchRequest prefetchRequest) {
        this.prefetchRequests.add(new PriorityTask(PriorityTask.Companion.getLow(), prefetchRequest));
        startExecution();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        
            if (r4 >= 30.0f) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void calculateFrameIntervalIfNeeded(View view) {
            float f;
            if (AndroidPrefetchScheduler.frameIntervalNs == 0) {
                Display display = view.getDisplay();
                if (!view.isInEditMode() && display != null) {
                    f = display.getRefreshRate();
                }
                f = 60.0f;
                AndroidPrefetchScheduler.frameIntervalNs = (long) (1.0E9f / f);
            }
        }

        private Companion() {
        }
    }
}
