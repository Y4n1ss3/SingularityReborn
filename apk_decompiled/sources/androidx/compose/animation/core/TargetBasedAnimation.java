package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TargetBasedAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    public static final int $stable = 8;
    private long _durationNanos;
    private V _endVelocity;
    private final VectorizedAnimationSpec<V> animationSpec;
    private V initialValueVector;
    private final V initialVelocityVector;
    private T mutableInitialValue;
    private T mutableTargetValue;
    private V targetValueVector;
    private final TwoWayConverter<T, V> typeConverter;

    public TargetBasedAnimation(VectorizedAnimationSpec<V> vectorizedAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t, T t2, V v) {
        V v2;
        this.animationSpec = vectorizedAnimationSpec;
        this.typeConverter = twoWayConverter;
        this.mutableTargetValue = t2;
        this.mutableInitialValue = t;
        this.initialValueVector = (V) getTypeConverter().getConvertToVector().invoke(t);
        this.targetValueVector = (V) getTypeConverter().getConvertToVector().invoke(t2);
        this.initialVelocityVector = (v == null || (v2 = (V) AnimationVectorsKt.copy(v)) == null) ? (V) AnimationVectorsKt.newInstance((AnimationVector) getTypeConverter().getConvertToVector().invoke(t)) : v2;
        this._durationNanos = -1L;
    }

    private final V getEndVelocity() {
        V v = this._endVelocity;
        if (v != null) {
            return v;
        }
        V endVelocity = this.animationSpec.getEndVelocity(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        this._endVelocity = endVelocity;
        return endVelocity;
    }

    public final VectorizedAnimationSpec<V> getAnimationSpec$animation_core() {
        return this.animationSpec;
    }

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        long j = this._durationNanos;
        if (j >= 0) {
            return j;
        }
        long durationNanos = this.animationSpec.getDurationNanos(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        this._durationNanos = durationNanos;
        return durationNanos;
    }

    public final T getInitialValue() {
        return this.mutableInitialValue;
    }

    public final T getMutableInitialValue$animation_core() {
        return this.mutableInitialValue;
    }

    public final T getMutableTargetValue$animation_core() {
        return this.mutableTargetValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getTargetValue() {
        return this.mutableTargetValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getValueFromNanos(long j) {
        if (isFinishedFromNanos(j)) {
            return getTargetValue();
        }
        V valueFromNanos = this.animationSpec.getValueFromNanos(j, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        int size$animation_core = valueFromNanos.getSize$animation_core();
        for (int i = 0; i < size$animation_core; i++) {
            if (Float.isNaN(valueFromNanos.get$animation_core(i))) {
                PreconditionsKt.throwIllegalStateException("AnimationVector cannot contain a NaN. " + valueFromNanos + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return (T) getTypeConverter().getConvertFromVector().invoke(valueFromNanos);
    }

    @Override // androidx.compose.animation.core.Animation
    public V getVelocityVectorFromNanos(long j) {
        return !isFinishedFromNanos(j) ? this.animationSpec.getVelocityFromNanos(j, this.initialValueVector, this.targetValueVector, this.initialVelocityVector) : getEndVelocity();
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return this.animationSpec.isInfinite();
    }

    public final void setMutableInitialValue$animation_core(T t) {
        if (q10.b(t, this.mutableInitialValue)) {
            return;
        }
        this.mutableInitialValue = t;
        this.initialValueVector = (V) getTypeConverter().getConvertToVector().invoke(t);
        this._endVelocity = null;
        this._durationNanos = -1L;
    }

    public final void setMutableTargetValue$animation_core(T t) {
        if (q10.b(this.mutableTargetValue, t)) {
            return;
        }
        this.mutableTargetValue = t;
        this.targetValueVector = (V) getTypeConverter().getConvertToVector().invoke(t);
        this._endVelocity = null;
        this._durationNanos = -1L;
    }

    public String toString() {
        return "TargetBasedAnimation: " + getInitialValue() + " -> " + getTargetValue() + ",initial velocity: " + this.initialVelocityVector + ", duration: " + AnimationKt.getDurationMillis(this) + " ms,animationSpec: " + this.animationSpec;
    }

    public /* synthetic */ TargetBasedAnimation(VectorizedAnimationSpec vectorizedAnimationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i, dq dqVar) {
        this((VectorizedAnimationSpec<AnimationVector>) vectorizedAnimationSpec, (TwoWayConverter<Object, AnimationVector>) twoWayConverter, obj, obj2, (i & 16) != 0 ? null : animationVector);
    }

    public /* synthetic */ TargetBasedAnimation(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i, dq dqVar) {
        this((AnimationSpec<Object>) animationSpec, (TwoWayConverter<Object, AnimationVector>) twoWayConverter, obj, obj2, (i & 16) != 0 ? null : animationVector);
    }

    public TargetBasedAnimation(AnimationSpec<T> animationSpec, TwoWayConverter<T, V> twoWayConverter, T t, T t2, V v) {
        this(animationSpec.vectorize(twoWayConverter), twoWayConverter, t, t2, v);
    }
}
