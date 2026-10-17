package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class LongPressResult {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Canceled extends LongPressResult {
        public static final int $stable = 0;
        public static final Canceled INSTANCE = new Canceled();

        private Canceled() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Released extends LongPressResult {
        public static final int $stable = 0;
        private final PointerInputChange finalUpChange;

        public Released(PointerInputChange pointerInputChange) {
            super(null);
            this.finalUpChange = pointerInputChange;
        }

        public final PointerInputChange getFinalUpChange() {
            return this.finalUpChange;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Success extends LongPressResult {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ LongPressResult(dq dqVar) {
        this();
    }

    private LongPressResult() {
    }
}
