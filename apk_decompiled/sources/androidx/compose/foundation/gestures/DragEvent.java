package androidx.compose.foundation.gestures;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class DragEvent {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DragCancelled extends DragEvent {
        public static final int $stable = 0;
        public static final DragCancelled INSTANCE = new DragCancelled();

        private DragCancelled() {
            super(null);
        }
    }

    public /* synthetic */ DragEvent(dq dqVar) {
        this();
    }

    private DragEvent() {
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DragStarted extends DragEvent {
        public static final int $stable = 0;
        private final long startPoint;

        private DragStarted(long j) {
            super(null);
            this.startPoint = j;
        }

        /* renamed from: getStartPoint-F1C5BW0, reason: not valid java name */
        public final long m416getStartPointF1C5BW0() {
            return this.startPoint;
        }

        public /* synthetic */ DragStarted(long j, dq dqVar) {
            this(j);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DragDelta extends DragEvent {
        public static final int $stable = 0;
        private final long delta;
        private final boolean isIndirectPointerEvent;

        private DragDelta(long j, boolean z) {
            super(null);
            this.delta = j;
            this.isIndirectPointerEvent = z;
        }

        /* renamed from: getDelta-F1C5BW0, reason: not valid java name */
        public final long m415getDeltaF1C5BW0() {
            return this.delta;
        }

        public final boolean isIndirectPointerEvent() {
            return this.isIndirectPointerEvent;
        }

        public /* synthetic */ DragDelta(long j, boolean z, dq dqVar) {
            this(j, z);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DragStopped extends DragEvent {
        public static final int $stable = 0;
        private final boolean isIndirectPointerEvent;
        private final long velocity;

        private DragStopped(long j, boolean z) {
            super(null);
            this.velocity = j;
            this.isIndirectPointerEvent = z;
        }

        /* renamed from: getVelocity-9UxMQ8M, reason: not valid java name */
        public final long m417getVelocity9UxMQ8M() {
            return this.velocity;
        }

        public final boolean isIndirectPointerEvent() {
            return this.isIndirectPointerEvent;
        }

        public /* synthetic */ DragStopped(long j, boolean z, dq dqVar) {
            this(j, z);
        }
    }
}
