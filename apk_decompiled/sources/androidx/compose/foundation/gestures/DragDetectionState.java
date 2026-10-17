package androidx.compose.foundation.gestures;

import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.bu;
import defpackage.dq;
import defpackage.p01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
abstract class DragDetectionState {
    public /* synthetic */ DragDetectionState(dq dqVar) {
        this();
    }

    private DragDetectionState() {
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class AwaitDown extends DragDetectionState {
        public static final int $stable = 8;
        private AwaitTouchSlop awaitTouchSlop;
        private boolean consumedOnInitial;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class AwaitTouchSlop {
            private static final /* synthetic */ bu $ENTRIES;
            private static final /* synthetic */ AwaitTouchSlop[] $VALUES;
            public static final AwaitTouchSlop Yes = new AwaitTouchSlop("Yes", 0);
            public static final AwaitTouchSlop No = new AwaitTouchSlop("No", 1);
            public static final AwaitTouchSlop NotInitialized = new AwaitTouchSlop("NotInitialized", 2);

            private static final /* synthetic */ AwaitTouchSlop[] $values() {
                return new AwaitTouchSlop[]{Yes, No, NotInitialized};
            }

            static {
                AwaitTouchSlop[] $values = $values();
                $VALUES = $values;
                $ENTRIES = p01.k($values);
            }

            private AwaitTouchSlop(String str, int i) {
            }

            public static bu getEntries() {
                return $ENTRIES;
            }

            public static AwaitTouchSlop valueOf(String str) {
                return (AwaitTouchSlop) Enum.valueOf(AwaitTouchSlop.class, str);
            }

            public static AwaitTouchSlop[] values() {
                return (AwaitTouchSlop[]) $VALUES.clone();
            }
        }

        public /* synthetic */ AwaitDown(AwaitTouchSlop awaitTouchSlop, boolean z, int i, dq dqVar) {
            this((i & 1) != 0 ? AwaitTouchSlop.NotInitialized : awaitTouchSlop, (i & 2) != 0 ? false : z);
        }

        public final AwaitTouchSlop getAwaitTouchSlop() {
            return this.awaitTouchSlop;
        }

        public final boolean getConsumedOnInitial() {
            return this.consumedOnInitial;
        }

        public final void setAwaitTouchSlop(AwaitTouchSlop awaitTouchSlop) {
            this.awaitTouchSlop = awaitTouchSlop;
        }

        public final void setConsumedOnInitial(boolean z) {
            this.consumedOnInitial = z;
        }

        public AwaitDown(AwaitTouchSlop awaitTouchSlop, boolean z) {
            super(null);
            this.awaitTouchSlop = awaitTouchSlop;
            this.consumedOnInitial = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AwaitDown() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Dragging extends DragDetectionState {
        public static final int $stable = 8;
        private long pointerId;

        public /* synthetic */ Dragging(long j, int i, dq dqVar) {
            this((i & 1) != 0 ? PointerId.m6078constructorimpl(SnapshotId_jvmKt.SnapshotIdMax) : j, null);
        }

        /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name */
        public final long m413getPointerIdJ3iCeTQ() {
            return this.pointerId;
        }

        /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
        public final void m414setPointerId0FcD4WY(long j) {
            this.pointerId = j;
        }

        private Dragging(long j) {
            super(null);
            this.pointerId = j;
        }

        public /* synthetic */ Dragging(long j, dq dqVar) {
            this(j);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class AwaitGesturePickup extends DragDetectionState {
        public static final int $stable = 8;
        private PointerInputChange initialDown;
        private long pointerId;
        private TouchSlopDetector touchSlopDetector;

        public /* synthetic */ AwaitGesturePickup(PointerInputChange pointerInputChange, long j, TouchSlopDetector touchSlopDetector, int i, dq dqVar) {
            this((i & 1) != 0 ? null : pointerInputChange, (i & 2) != 0 ? PointerId.m6078constructorimpl(SnapshotId_jvmKt.SnapshotIdMax) : j, (i & 4) != 0 ? null : touchSlopDetector, null);
        }

        public final PointerInputChange getInitialDown() {
            return this.initialDown;
        }

        /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name */
        public final long m409getPointerIdJ3iCeTQ() {
            return this.pointerId;
        }

        public final TouchSlopDetector getTouchSlopDetector() {
            return this.touchSlopDetector;
        }

        public final void setInitialDown(PointerInputChange pointerInputChange) {
            this.initialDown = pointerInputChange;
        }

        /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
        public final void m410setPointerId0FcD4WY(long j) {
            this.pointerId = j;
        }

        public final void setTouchSlopDetector(TouchSlopDetector touchSlopDetector) {
            this.touchSlopDetector = touchSlopDetector;
        }

        private AwaitGesturePickup(PointerInputChange pointerInputChange, long j, TouchSlopDetector touchSlopDetector) {
            super(null);
            this.initialDown = pointerInputChange;
            this.pointerId = j;
            this.touchSlopDetector = touchSlopDetector;
        }

        public /* synthetic */ AwaitGesturePickup(PointerInputChange pointerInputChange, long j, TouchSlopDetector touchSlopDetector, dq dqVar) {
            this(pointerInputChange, j, touchSlopDetector);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class AwaitTouchSlop extends DragDetectionState {
        public static final int $stable = 8;
        private PointerInputChange initialDown;
        private long pointerId;
        private boolean verifyConsumptionInFinalPass;

        public /* synthetic */ AwaitTouchSlop(PointerInputChange pointerInputChange, long j, boolean z, int i, dq dqVar) {
            this((i & 1) != 0 ? null : pointerInputChange, (i & 2) != 0 ? PointerId.m6078constructorimpl(SnapshotId_jvmKt.SnapshotIdMax) : j, (i & 4) != 0 ? false : z, null);
        }

        public final PointerInputChange getInitialDown() {
            return this.initialDown;
        }

        /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name */
        public final long m411getPointerIdJ3iCeTQ() {
            return this.pointerId;
        }

        public final boolean getVerifyConsumptionInFinalPass() {
            return this.verifyConsumptionInFinalPass;
        }

        public final void setInitialDown(PointerInputChange pointerInputChange) {
            this.initialDown = pointerInputChange;
        }

        /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
        public final void m412setPointerId0FcD4WY(long j) {
            this.pointerId = j;
        }

        public final void setVerifyConsumptionInFinalPass(boolean z) {
            this.verifyConsumptionInFinalPass = z;
        }

        private AwaitTouchSlop(PointerInputChange pointerInputChange, long j, boolean z) {
            super(null);
            this.initialDown = pointerInputChange;
            this.pointerId = j;
            this.verifyConsumptionInFinalPass = z;
        }

        public /* synthetic */ AwaitTouchSlop(PointerInputChange pointerInputChange, long j, boolean z, dq dqVar) {
            this(pointerInputChange, j, z);
        }
    }
}
