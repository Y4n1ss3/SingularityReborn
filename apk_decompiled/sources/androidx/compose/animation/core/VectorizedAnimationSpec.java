package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface VectorizedAnimationSpec<V extends AnimationVector> {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static <V extends AnimationVector> V getEndVelocity(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V v, V v2, V v3) {
            return (V) VectorizedAnimationSpec.super.getEndVelocity(v, v2, v3);
        }
    }

    long getDurationNanos(V v, V v2, V v3);

    default V getEndVelocity(V v, V v2, V v3) {
        return getVelocityFromNanos(getDurationNanos(v, v2, v3), v, v2, v3);
    }

    V getValueFromNanos(long j, V v, V v2, V v3);

    V getVelocityFromNanos(long j, V v, V v2, V v3);

    boolean isInfinite();
}
