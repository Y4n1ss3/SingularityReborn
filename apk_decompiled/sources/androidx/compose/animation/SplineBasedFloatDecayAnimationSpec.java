package androidx.compose.animation;

import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    public static final int $stable = 0;
    private final FlingCalculator flingCalculator;

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        this.flingCalculator = new FlingCalculator(SplineBasedFloatDecayAnimationSpec_androidKt.getPlatformFlingScrollFriction(), density);
    }

    private final float flingDistance(float f) {
        return Math.signum(f) * this.flingCalculator.flingDistance(f);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f, float f2) {
        return this.flingCalculator.flingDuration(f2) * AnimationKt.MillisToNanos;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f, float f2) {
        return f + flingDistance(f2);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j, float f, float f2) {
        return this.flingCalculator.flingInfo(f2).position(j / AnimationKt.MillisToNanos) + f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j, float f, float f2) {
        return this.flingCalculator.flingInfo(f2).velocity(j / AnimationKt.MillisToNanos);
    }
}
