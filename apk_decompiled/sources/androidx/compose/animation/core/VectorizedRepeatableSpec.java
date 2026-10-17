package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import defpackage.dq;
import defpackage.er;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorizedRepeatableSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    private final VectorizedDurationBasedAnimationSpec<V> animation;
    private final long durationNanos;
    private final long initialOffsetNanos;
    private final int iterations;
    private final RepeatMode repeatMode;

    private VectorizedRepeatableSpec(int i, VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j) {
        this.iterations = i;
        this.animation = vectorizedDurationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        if (i < 1) {
            o.m("Iterations count can't be less than 1");
            throw null;
        }
        this.durationNanos = (vectorizedDurationBasedAnimationSpec.getDurationMillis() + vectorizedDurationBasedAnimationSpec.getDelayMillis()) * AnimationKt.MillisToNanos;
        this.initialOffsetNanos = j * AnimationKt.MillisToNanos;
    }

    private final long repetitionPlayTimeNanos(long j) {
        long j2 = this.initialOffsetNanos;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long min = Math.min(j3 / this.durationNanos, this.iterations - 1);
        return (this.repeatMode == RepeatMode.Restart || min % 2 == 0) ? j3 - (min * this.durationNanos) : ((min + 1) * this.durationNanos) - j3;
    }

    private final V repetitionStartVelocity(long j, V v, V v2, V v3) {
        long j2 = this.initialOffsetNanos;
        long j3 = j + j2;
        long j4 = this.durationNanos;
        return j3 > j4 ? getVelocityFromNanos(j4 - j2, v, v2, v3) : v2;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V v, V v2, V v3) {
        return (this.iterations * this.durationNanos) - this.initialOffsetNanos;
    }

    public final long getDurationNanos$animation_core() {
        return this.durationNanos;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j, V v, V v2, V v3) {
        return this.animation.getValueFromNanos(repetitionPlayTimeNanos(j), v, v2, repetitionStartVelocity(j, v, v3, v2));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        return this.animation.getVelocityFromNanos(repetitionPlayTimeNanos(j), v, v2, repetitionStartVelocity(j, v, v3, v2));
    }

    public /* synthetic */ VectorizedRepeatableSpec(int i, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j, dq dqVar) {
        this(i, vectorizedDurationBasedAnimationSpec, repeatMode, j);
    }

    public /* synthetic */ VectorizedRepeatableSpec(int i, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j, int i2, dq dqVar) {
        this(i, vectorizedDurationBasedAnimationSpec, (i2 & 4) != 0 ? RepeatMode.Restart : repeatMode, (i2 & 8) != 0 ? StartOffset.m170constructorimpl$default(0, 0, 2, null) : j, (dq) null);
    }

    public /* synthetic */ VectorizedRepeatableSpec(int i, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, int i2, dq dqVar) {
        this(i, vectorizedDurationBasedAnimationSpec, (i2 & 4) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @er
    public /* synthetic */ VectorizedRepeatableSpec(int i, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode) {
        this(i, vectorizedDurationBasedAnimationSpec, repeatMode, StartOffset.m170constructorimpl$default(0, 0, 2, null), (dq) null);
    }
}
