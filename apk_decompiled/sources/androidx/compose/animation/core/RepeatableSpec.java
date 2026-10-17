package androidx.compose.animation.core;

import defpackage.dq;
import defpackage.er;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RepeatableSpec<T> implements FiniteAnimationSpec<T> {
    public static final int $stable = 0;
    private final DurationBasedAnimationSpec<T> animation;
    private final long initialStartOffset;
    private final int iterations;
    private final RepeatMode repeatMode;

    public /* synthetic */ RepeatableSpec(int i, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j, int i2, dq dqVar) {
        this(i, durationBasedAnimationSpec, (i2 & 4) != 0 ? RepeatMode.Restart : repeatMode, (i2 & 8) != 0 ? StartOffset.m170constructorimpl$default(0, 0, 2, null) : j, (dq) null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof RepeatableSpec) {
            RepeatableSpec repeatableSpec = (RepeatableSpec) obj;
            if (repeatableSpec.iterations == this.iterations && q10.b(repeatableSpec.animation, this.animation) && repeatableSpec.repeatMode == this.repeatMode && StartOffset.m172equalsimpl0(repeatableSpec.initialStartOffset, this.initialStartOffset)) {
                return true;
            }
        }
        return false;
    }

    public final DurationBasedAnimationSpec<T> getAnimation() {
        return this.animation;
    }

    /* renamed from: getInitialStartOffset-Rmkjzm4, reason: not valid java name */
    public final long m165getInitialStartOffsetRmkjzm4() {
        return this.initialStartOffset;
    }

    public final int getIterations() {
        return this.iterations;
    }

    public final RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    public int hashCode() {
        return StartOffset.m175hashCodeimpl(this.initialStartOffset) + ((this.repeatMode.hashCode() + ((this.animation.hashCode() + (this.iterations * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedFiniteAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedRepeatableSpec(this.iterations, this.animation.vectorize((TwoWayConverter) twoWayConverter), this.repeatMode, this.initialStartOffset, (dq) null);
    }

    private RepeatableSpec(int i, DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j) {
        this.iterations = i;
        this.animation = durationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        this.initialStartOffset = j;
    }

    public /* synthetic */ RepeatableSpec(int i, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j, dq dqVar) {
        this(i, durationBasedAnimationSpec, repeatMode, j);
    }

    public /* synthetic */ RepeatableSpec(int i, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i2, dq dqVar) {
        this(i, durationBasedAnimationSpec, (i2 & 4) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @er
    public /* synthetic */ RepeatableSpec(int i, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        this(i, durationBasedAnimationSpec, repeatMode, StartOffset.m170constructorimpl$default(0, 0, 2, null), (dq) null);
    }
}
