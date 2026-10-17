package androidx.compose.animation.core;

import defpackage.bv;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SpringSpec<T> implements FiniteAnimationSpec<T> {
    public static final int $stable = 0;
    private final float dampingRatio;
    private final float stiffness;
    private final T visibilityThreshold;

    public /* synthetic */ SpringSpec(float f, float f2, Object obj, int i, dq dqVar) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : obj);
    }

    public boolean equals(Object obj) {
        if (obj instanceof SpringSpec) {
            SpringSpec springSpec = (SpringSpec) obj;
            if (springSpec.dampingRatio == this.dampingRatio && springSpec.stiffness == this.stiffness && q10.b(springSpec.visibilityThreshold, this.visibilityThreshold)) {
                return true;
            }
        }
        return false;
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    public final T getVisibilityThreshold() {
        return this.visibilityThreshold;
    }

    public int hashCode() {
        T t = this.visibilityThreshold;
        return Float.hashCode(this.stiffness) + bv.a(this.dampingRatio, (t != null ? t.hashCode() : 0) * 31, 31);
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedSpringSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        AnimationVector convert;
        float f = this.dampingRatio;
        float f2 = this.stiffness;
        convert = AnimationSpecKt.convert(twoWayConverter, this.visibilityThreshold);
        return new VectorizedSpringSpec<>(f, f2, convert);
    }

    public SpringSpec(float f, float f2, T t) {
        this.dampingRatio = f;
        this.stiffness = f2;
        this.visibilityThreshold = t;
    }

    public SpringSpec() {
        this(0.0f, 0.0f, null, 7, null);
    }
}
