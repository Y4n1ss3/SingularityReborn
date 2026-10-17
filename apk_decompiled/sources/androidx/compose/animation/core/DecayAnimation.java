package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DecayAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    public static final int $stable = 0;
    private final VectorizedDecayAnimationSpec<V> animationSpec;
    private final long durationNanos;
    private final V endVelocity;
    private final T initialValue;
    private final V initialValueVector;
    private final V initialVelocityVector;
    private final boolean isInfinite;
    private final T targetValue;
    private final TwoWayConverter<T, V> typeConverter;

    public DecayAnimation(VectorizedDecayAnimationSpec<V> vectorizedDecayAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t, V v) {
        this.animationSpec = vectorizedDecayAnimationSpec;
        this.typeConverter = twoWayConverter;
        this.initialValue = t;
        V v2 = (V) getTypeConverter().getConvertToVector().invoke(t);
        this.initialValueVector = v2;
        this.initialVelocityVector = (V) AnimationVectorsKt.copy(v);
        this.targetValue = (T) getTypeConverter().getConvertFromVector().invoke(vectorizedDecayAnimationSpec.getTargetValue(v2, v));
        this.durationNanos = vectorizedDecayAnimationSpec.getDurationNanos(v2, v);
        V v3 = (V) AnimationVectorsKt.copy(vectorizedDecayAnimationSpec.getVelocityFromNanos(getDurationNanos(), v2, v));
        this.endVelocity = v3;
        int size$animation_core = v3.getSize$animation_core();
        for (int i = 0; i < size$animation_core; i++) {
            V v4 = this.endVelocity;
            v4.set$animation_core(i, y80.g(v4.get$animation_core(i), -this.animationSpec.getAbsVelocityThreshold(), this.animationSpec.getAbsVelocityThreshold()));
        }
    }

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        return this.durationNanos;
    }

    public final T getInitialValue() {
        return this.initialValue;
    }

    public final V getInitialVelocityVector() {
        return this.initialVelocityVector;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getTargetValue() {
        return this.targetValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getValueFromNanos(long j) {
        return !isFinishedFromNanos(j) ? (T) getTypeConverter().getConvertFromVector().invoke(this.animationSpec.getValueFromNanos(j, this.initialValueVector, this.initialVelocityVector)) : getTargetValue();
    }

    @Override // androidx.compose.animation.core.Animation
    public V getVelocityVectorFromNanos(long j) {
        return !isFinishedFromNanos(j) ? this.animationSpec.getVelocityFromNanos(j, this.initialValueVector, this.initialVelocityVector) : this.endVelocity;
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return this.isInfinite;
    }

    public DecayAnimation(DecayAnimationSpec<T> decayAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t, V v) {
        this(decayAnimationSpec.vectorize(twoWayConverter), twoWayConverter, t, v);
    }

    public DecayAnimation(DecayAnimationSpec<T> decayAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t, T t2) {
        this(decayAnimationSpec.vectorize(twoWayConverter), twoWayConverter, t, (AnimationVector) twoWayConverter.getConvertToVector().invoke(t2));
    }
}
