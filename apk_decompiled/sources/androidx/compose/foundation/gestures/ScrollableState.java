package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ScrollIndicatorState;
import defpackage.hm;
import defpackage.lu0;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface ScrollableState {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean getCanScrollBackward(ScrollableState scrollableState) {
            return ScrollableState.super.getCanScrollBackward();
        }

        @Deprecated
        public static boolean getCanScrollForward(ScrollableState scrollableState) {
            return ScrollableState.super.getCanScrollForward();
        }

        @Deprecated
        public static boolean getLastScrolledBackward(ScrollableState scrollableState) {
            return ScrollableState.super.getLastScrolledBackward();
        }

        @Deprecated
        public static boolean getLastScrolledForward(ScrollableState scrollableState) {
            return ScrollableState.super.getLastScrolledForward();
        }

        @Deprecated
        public static ScrollIndicatorState getScrollIndicatorState(ScrollableState scrollableState) {
            return ScrollableState.super.getScrollIndicatorState();
        }
    }

    static /* synthetic */ Object scroll$default(ScrollableState scrollableState, MutatePriority mutatePriority, my myVar, hm hmVar, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: scroll");
            return null;
        }
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return scrollableState.scroll(mutatePriority, myVar, hmVar);
    }

    float dispatchRawDelta(float f);

    default boolean getCanScrollBackward() {
        return true;
    }

    default boolean getCanScrollForward() {
        return true;
    }

    default boolean getLastScrolledBackward() {
        return false;
    }

    default boolean getLastScrolledForward() {
        return false;
    }

    default ScrollIndicatorState getScrollIndicatorState() {
        return null;
    }

    boolean isScrollInProgress();

    Object scroll(MutatePriority mutatePriority, my myVar, hm hmVar);
}
