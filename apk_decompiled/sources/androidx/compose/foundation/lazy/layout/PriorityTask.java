package androidx.compose.foundation.lazy.layout;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PriorityTask {
    private static final int Low = 0;
    private final int priority;
    private final PrefetchRequest request;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int High = 1;

    public PriorityTask(int i, PrefetchRequest prefetchRequest) {
        this.priority = i;
        this.request = prefetchRequest;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final PrefetchRequest getRequest() {
        return this.request;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final int getHigh() {
            return PriorityTask.High;
        }

        public final int getLow() {
            return PriorityTask.Low;
        }

        private Companion() {
        }
    }
}
