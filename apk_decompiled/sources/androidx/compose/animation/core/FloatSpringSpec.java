package androidx.compose.animation.core;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FloatSpringSpec implements FloatAnimationSpec {
    public static final int $stable = 8;
    private final float dampingRatio;
    private final SpringSimulation spring;
    private final float stiffness;
    private final float visibilityThreshold;

    public FloatSpringSpec(float f, float f2, float f3) {
        this.dampingRatio = f;
        this.stiffness = f2;
        this.visibilityThreshold = f3;
        SpringSimulation springSimulation = new SpringSimulation(1.0f);
        springSimulation.setDampingRatio(f);
        springSimulation.setStiffness(f2);
        this.spring = springSimulation;
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f, float f2, float f3) {
        float stiffness = this.spring.getStiffness();
        float dampingRatio = this.spring.getDampingRatio();
        float f4 = this.visibilityThreshold;
        return SpringEstimationKt.estimateAnimationDurationMillis(stiffness, dampingRatio, f3 / f4, (f - f2) / f4, 1.0f) * AnimationKt.MillisToNanos;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getEndVelocity(float f, float f2, float f3) {
        return 0.0f;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long j, float f, float f2, float f3) {
        long j2 = j / AnimationKt.MillisToNanos;
        this.spring.setFinalPosition(f2);
        return Float.intBitsToFloat((int) (this.spring.m166updateValuesIJZedt4$animation_core(f, f3, j2) >> 32));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long j, float f, float f2, float f3) {
        long j2 = j / AnimationKt.MillisToNanos;
        this.spring.setFinalPosition(f2);
        return Float.intBitsToFloat((int) (this.spring.m166updateValuesIJZedt4$animation_core(f, f3, j2) & 4294967295L));
    }

    public FloatSpringSpec() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public /* synthetic */ FloatSpringSpec(float f, float f2, float f3, int i, dq dqVar) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? 0.01f : f3);
    }
}
