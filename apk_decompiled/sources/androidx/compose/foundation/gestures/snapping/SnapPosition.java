package androidx.compose.foundation.gestures.snapping;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface SnapPosition {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Center implements SnapPosition {
        public static final int $stable = 0;
        public static final Center INSTANCE = new Center();

        private Center() {
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public int position(int i, int i2, int i3, int i4, int i5, int i6) {
            return (((i - i3) - i4) / 2) - (i2 / 2);
        }

        public String toString() {
            return "Center";
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class End implements SnapPosition {
        public static final int $stable = 0;
        public static final End INSTANCE = new End();

        private End() {
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public int position(int i, int i2, int i3, int i4, int i5, int i6) {
            return ((i - i3) - i4) - i2;
        }

        public String toString() {
            return "End";
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Start implements SnapPosition {
        public static final int $stable = 0;
        public static final Start INSTANCE = new Start();

        private Start() {
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public int position(int i, int i2, int i3, int i4, int i5, int i6) {
            return 0;
        }

        public String toString() {
            return "Start";
        }
    }

    int position(int i, int i2, int i3, int i4, int i5, int i6);
}
