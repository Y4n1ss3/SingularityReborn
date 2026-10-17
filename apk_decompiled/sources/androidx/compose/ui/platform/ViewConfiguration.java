package androidx.compose.ui.platform;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface ViewConfiguration {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static float getHandwritingGestureLineMargin(ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.getHandwritingGestureLineMargin();
        }

        @Deprecated
        public static float getHandwritingSlop(ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.getHandwritingSlop();
        }

        @Deprecated
        public static float getMaximumFlingVelocity(ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.getMaximumFlingVelocity();
        }

        @Deprecated
        public static float getMinimumFlingVelocity(ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.getMinimumFlingVelocity();
        }

        @Deprecated
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public static long m6808getMinimumTouchTargetSizeMYxV2XQ(ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.mo6474getMinimumTouchTargetSizeMYxV2XQ();
        }
    }

    long getDoubleTapMinTimeMillis();

    long getDoubleTapTimeoutMillis();

    default float getHandwritingGestureLineMargin() {
        return 16.0f;
    }

    default float getHandwritingSlop() {
        return 2.0f;
    }

    long getLongPressTimeoutMillis();

    default float getMaximumFlingVelocity() {
        return Float.MAX_VALUE;
    }

    default float getMinimumFlingVelocity() {
        return 0.0f;
    }

    /* renamed from: getMinimumTouchTargetSize-MYxV2XQ */
    default long mo6474getMinimumTouchTargetSizeMYxV2XQ() {
        return DpKt.m7633DpSizeYgX7TsA(Dp.m7611constructorimpl(48.0f), Dp.m7611constructorimpl(48.0f));
    }

    float getTouchSlop();
}
