package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface VectorizedDurationBasedAnimationSpec<V extends AnimationVector> extends VectorizedFiniteAnimationSpec<V> {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static <V extends AnimationVector> long getDurationNanos(VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, V v, V v2, V v3) {
            return VectorizedDurationBasedAnimationSpec.super.getDurationNanos(v, v2, v3);
        }

        @Deprecated
        public static <V extends AnimationVector> V getEndVelocity(VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, V v, V v2, V v3) {
            return (V) VectorizedDurationBasedAnimationSpec.super.getEndVelocity(v, v2, v3);
        }

        @Deprecated
        public static <V extends AnimationVector> boolean isInfinite(VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec) {
            return VectorizedDurationBasedAnimationSpec.super.isInfinite();
        }
    }

    int getDelayMillis();

    int getDurationMillis();

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    default long getDurationNanos(V v, V v2, V v3) {
        return (getDurationMillis() + getDelayMillis()) * AnimationKt.MillisToNanos;
    }
}
