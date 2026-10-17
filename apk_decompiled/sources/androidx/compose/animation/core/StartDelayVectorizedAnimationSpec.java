package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class StartDelayVectorizedAnimationSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {
    private final long startDelayNanos;
    private final VectorizedAnimationSpec<V> vectorizedAnimationSpec;

    public StartDelayVectorizedAnimationSpec(VectorizedAnimationSpec<V> vectorizedAnimationSpec, long j) {
        this.vectorizedAnimationSpec = vectorizedAnimationSpec;
        this.startDelayNanos = j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StartDelayVectorizedAnimationSpec)) {
            return false;
        }
        StartDelayVectorizedAnimationSpec startDelayVectorizedAnimationSpec = (StartDelayVectorizedAnimationSpec) obj;
        return startDelayVectorizedAnimationSpec.startDelayNanos == this.startDelayNanos && q10.b(startDelayVectorizedAnimationSpec.vectorizedAnimationSpec, this.vectorizedAnimationSpec);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V v, V v2, V v3) {
        return this.vectorizedAnimationSpec.getDurationNanos(v, v2, v3) + this.startDelayNanos;
    }

    public final long getStartDelayNanos() {
        return this.startDelayNanos;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j, V v, V v2, V v3) {
        long j2 = this.startDelayNanos;
        return j < j2 ? v : this.vectorizedAnimationSpec.getValueFromNanos(j - j2, v, v2, v3);
    }

    public final VectorizedAnimationSpec<V> getVectorizedAnimationSpec() {
        return this.vectorizedAnimationSpec;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        long j2 = this.startDelayNanos;
        return j < j2 ? v3 : this.vectorizedAnimationSpec.getVelocityFromNanos(j - j2, v, v2, v3);
    }

    public int hashCode() {
        return Long.hashCode(this.startDelayNanos) + (this.vectorizedAnimationSpec.hashCode() * 31);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        return this.vectorizedAnimationSpec.isInfinite();
    }
}
