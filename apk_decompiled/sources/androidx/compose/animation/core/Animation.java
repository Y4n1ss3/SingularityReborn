package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface Animation<T, V extends AnimationVector> {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static <T, V extends AnimationVector> boolean isFinishedFromNanos(Animation<T, V> animation, long j) {
            return Animation.super.isFinishedFromNanos(j);
        }
    }

    long getDurationNanos();

    T getTargetValue();

    TwoWayConverter<T, V> getTypeConverter();

    T getValueFromNanos(long j);

    V getVelocityVectorFromNanos(long j);

    default boolean isFinishedFromNanos(long j) {
        return j >= getDurationNanos();
    }

    boolean isInfinite();
}
