package androidx.compose.foundation.interaction;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface HoverInteraction extends Interaction {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Enter implements HoverInteraction {
        public static final int $stable = 0;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Exit implements HoverInteraction {
        public static final int $stable = 0;
        private final Enter enter;

        public Exit(Enter enter) {
            this.enter = enter;
        }

        public final Enter getEnter() {
            return this.enter;
        }
    }
}
