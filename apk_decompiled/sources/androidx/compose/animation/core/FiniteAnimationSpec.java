package androidx.compose.animation.core;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface FiniteAnimationSpec<T> extends AnimationSpec<T> {
    @Override // androidx.compose.animation.core.AnimationSpec
    <V extends AnimationVector> VectorizedFiniteAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter);
}
