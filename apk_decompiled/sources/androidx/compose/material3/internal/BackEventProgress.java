package androidx.compose.material3.internal;

import defpackage.bv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface BackEventProgress {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Completed implements BackEventProgress {
        public static final int $stable = 0;
        public static final Completed INSTANCE = new Completed();

        private Completed() {
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class InProgress implements BackEventProgress {
        public static final int $stable = 0;
        private final float progress;
        private final SwipeEdge swipeEdge;
        private final float touchX;
        private final float touchY;

        public InProgress(float f, float f2, float f3, SwipeEdge swipeEdge) {
            this.touchX = f;
            this.touchY = f2;
            this.progress = f3;
            this.swipeEdge = swipeEdge;
        }

        public static /* synthetic */ InProgress copy$default(InProgress inProgress, float f, float f2, float f3, SwipeEdge swipeEdge, int i, Object obj) {
            if ((i & 1) != 0) {
                f = inProgress.touchX;
            }
            if ((i & 2) != 0) {
                f2 = inProgress.touchY;
            }
            if ((i & 4) != 0) {
                f3 = inProgress.progress;
            }
            if ((i & 8) != 0) {
                swipeEdge = inProgress.swipeEdge;
            }
            return inProgress.copy(f, f2, f3, swipeEdge);
        }

        public final float component1() {
            return this.touchX;
        }

        public final float component2() {
            return this.touchY;
        }

        public final float component3() {
            return this.progress;
        }

        public final SwipeEdge component4() {
            return this.swipeEdge;
        }

        public final InProgress copy(float f, float f2, float f3, SwipeEdge swipeEdge) {
            return new InProgress(f, f2, f3, swipeEdge);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InProgress)) {
                return false;
            }
            InProgress inProgress = (InProgress) obj;
            return Float.compare(this.touchX, inProgress.touchX) == 0 && Float.compare(this.touchY, inProgress.touchY) == 0 && Float.compare(this.progress, inProgress.progress) == 0 && this.swipeEdge == inProgress.swipeEdge;
        }

        public final float getProgress() {
            return this.progress;
        }

        public final SwipeEdge getSwipeEdge() {
            return this.swipeEdge;
        }

        public final float getTouchX() {
            return this.touchX;
        }

        public final float getTouchY() {
            return this.touchY;
        }

        public int hashCode() {
            return this.swipeEdge.hashCode() + bv.a(this.progress, bv.a(this.touchY, Float.hashCode(this.touchX) * 31, 31), 31);
        }

        public String toString() {
            return "InProgress(touchX=" + this.touchX + ", touchY=" + this.touchY + ", progress=" + this.progress + ", swipeEdge=" + this.swipeEdge + ')';
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class NotRunning implements BackEventProgress {
        public static final int $stable = 0;
        public static final NotRunning INSTANCE = new NotRunning();

        private NotRunning() {
        }
    }
}
