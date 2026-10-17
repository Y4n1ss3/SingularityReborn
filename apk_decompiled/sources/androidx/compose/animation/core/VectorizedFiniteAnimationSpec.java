package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface VectorizedFiniteAnimationSpec<V extends AnimationVector> extends VectorizedAnimationSpec<V> {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static <V extends AnimationVector> V getEndVelocity(VectorizedFiniteAnimationSpec<V> vectorizedFiniteAnimationSpec, V v, V v2, V v3) {
            return (V) VectorizedFiniteAnimationSpec.super.getEndVelocity(v, v2, v3);
        }

        @Deprecated
        public static <V extends AnimationVector> boolean isInfinite(VectorizedFiniteAnimationSpec<V> vectorizedFiniteAnimationSpec) {
            return VectorizedFiniteAnimationSpec.super.isInfinite();
        }
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    default boolean isInfinite() {
        return false;
    }
}
