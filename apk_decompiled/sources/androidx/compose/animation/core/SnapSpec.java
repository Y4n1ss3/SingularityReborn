package androidx.compose.animation.core;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final int delay;

    public /* synthetic */ SnapSpec(int i, int i2, dq dqVar) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof SnapSpec) && ((SnapSpec) obj).delay == this.delay;
    }

    public final int getDelay() {
        return this.delay;
    }

    public int hashCode() {
        return this.delay;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedSnapSpec(this.delay);
    }

    public SnapSpec(int i) {
        this.delay = i;
    }

    public SnapSpec() {
        this(0, 1, null);
    }
}
