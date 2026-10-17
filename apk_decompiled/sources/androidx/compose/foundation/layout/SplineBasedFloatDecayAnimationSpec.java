package androidx.compose.foundation.layout;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.foundation.layout.AndroidFlingSpline;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    private final float magicPhysicalCoefficient;

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        this.magicPhysicalCoefficient = density.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    private final double getSplineDeceleration(float f) {
        float f2;
        AndroidFlingSpline androidFlingSpline = AndroidFlingSpline.INSTANCE;
        f2 = WindowInsetsConnection_androidKt.PlatformFlingScrollFriction;
        return androidFlingSpline.deceleration(f, f2 * this.magicPhysicalCoefficient);
    }

    public final float flingDistance(float f) {
        float f2;
        double d;
        double d2;
        double splineDeceleration = getSplineDeceleration(f);
        f2 = WindowInsetsConnection_androidKt.PlatformFlingScrollFriction;
        double d3 = f2 * this.magicPhysicalCoefficient;
        d = WindowInsetsConnection_androidKt.DecelerationRate;
        d2 = WindowInsetsConnection_androidKt.DecelMinusOne;
        return Math.signum(f) * ((float) (Math.exp((d / d2) * splineDeceleration) * d3));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f, float f2) {
        double d;
        double splineDeceleration = getSplineDeceleration(f2);
        d = WindowInsetsConnection_androidKt.DecelMinusOne;
        return (long) (Math.exp(splineDeceleration / d) * 1.0E9d);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f, float f2) {
        return f + flingDistance(f2);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j, float f, float f2) {
        long durationNanos = getDurationNanos(0.0f, f2);
        return (AndroidFlingSpline.FlingResult.m642getDistanceCoefficientimpl(AndroidFlingSpline.INSTANCE.m637flingPositionLfoxSSI(durationNanos > 0 ? j / durationNanos : 1.0f)) * flingDistance(f2)) + f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j, float f, float f2) {
        long durationNanos = getDurationNanos(0.0f, f2);
        return ((AndroidFlingSpline.FlingResult.m643getVelocityCoefficientimpl(AndroidFlingSpline.INSTANCE.m637flingPositionLfoxSSI(durationNanos > 0 ? j / durationNanos : 1.0f)) * flingDistance(f2)) / durationNanos) * 1.0E9f;
    }
}
