package androidx.compose.foundation.interaction;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface FocusInteraction extends Interaction {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Focus implements FocusInteraction {
        public static final int $stable = 0;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Unfocus implements FocusInteraction {
        public static final int $stable = 0;
        private final Focus focus;

        public Unfocus(Focus focus) {
            this.focus = focus;
        }

        public final Focus getFocus() {
            return this.focus;
        }
    }
}
