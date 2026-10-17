package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimationScope<T, V extends AnimationVector> {
    public static final int $stable = 8;
    private long finishedTimeNanos = Long.MIN_VALUE;
    private final MutableState isRunning$delegate;
    private long lastFrameTimeNanos;
    private final iy onCancel;
    private final long startTimeNanos;
    private final T targetValue;
    private final TwoWayConverter<T, V> typeConverter;
    private final MutableState value$delegate;
    private V velocityVector;

    public AnimationScope(T t, TwoWayConverter<T, V> twoWayConverter, V v, long j, T t2, long j2, boolean z, iy iyVar) {
        this.typeConverter = twoWayConverter;
        this.targetValue = t2;
        this.startTimeNanos = j2;
        this.onCancel = iyVar;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.velocityVector = (V) AnimationVectorsKt.copy(v);
        this.lastFrameTimeNanos = j;
        this.isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    public final void cancelAnimation() {
        setRunning$animation_core(false);
        this.onCancel.invoke();
    }

    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

    public final T getTargetValue() {
        return this.targetValue;
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getValue() {
        return this.value$delegate.getValue();
    }

    public final T getVelocity() {
        return (T) this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    public final V getVelocityVector() {
        return this.velocityVector;
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final void setFinishedTimeNanos$animation_core(long j) {
        this.finishedTimeNanos = j;
    }

    public final void setLastFrameTimeNanos$animation_core(long j) {
        this.lastFrameTimeNanos = j;
    }

    public final void setRunning$animation_core(boolean z) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setValue$animation_core(T t) {
        this.value$delegate.setValue(t);
    }

    public final void setVelocityVector$animation_core(V v) {
        this.velocityVector = v;
    }

    public final AnimationState<T, V> toAnimationState() {
        return new AnimationState<>(this.typeConverter, getValue(), this.velocityVector, this.lastFrameTimeNanos, this.finishedTimeNanos, isRunning());
    }
}
