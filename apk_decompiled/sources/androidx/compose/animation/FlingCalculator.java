package androidx.compose.animation;

import androidx.compose.ui.unit.Density;
import defpackage.bv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlingCalculator {
    public static final int $stable = 0;
    private final Density density;
    private final float friction;
    private final float magicPhysicalCoefficient;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class FlingInfo {
        public static final int $stable = 0;
        private final float distance;
        private final long duration;
        private final float initialVelocity;

        public FlingInfo(float f, float f2, long j) {
            this.initialVelocity = f;
            this.distance = f2;
            this.duration = j;
        }

        public static /* synthetic */ FlingInfo copy$default(FlingInfo flingInfo, float f, float f2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                f = flingInfo.initialVelocity;
            }
            if ((i & 2) != 0) {
                f2 = flingInfo.distance;
            }
            if ((i & 4) != 0) {
                j = flingInfo.duration;
            }
            return flingInfo.copy(f, f2, j);
        }

        public final float component1() {
            return this.initialVelocity;
        }

        public final float component2() {
            return this.distance;
        }

        public final long component3() {
            return this.duration;
        }

        public final FlingInfo copy(float f, float f2, long j) {
            return new FlingInfo(f, f2, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) obj;
            return Float.compare(this.initialVelocity, flingInfo.initialVelocity) == 0 && Float.compare(this.distance, flingInfo.distance) == 0 && this.duration == flingInfo.duration;
        }

        public final float getDistance() {
            return this.distance;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final float getInitialVelocity() {
            return this.initialVelocity;
        }

        public int hashCode() {
            return Long.hashCode(this.duration) + bv.a(this.distance, Float.hashCode(this.initialVelocity) * 31, 31);
        }

        public final float position(long j) {
            long j2 = this.duration;
            return AndroidFlingSpline.INSTANCE.flingPosition(j2 > 0 ? j / j2 : 1.0f).getDistanceCoefficient() * Math.signum(this.initialVelocity) * this.distance;
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.initialVelocity + ", distance=" + this.distance + ", duration=" + this.duration + ')';
        }

        public final float velocity(long j) {
            long j2 = this.duration;
            return (((Math.signum(this.initialVelocity) * AndroidFlingSpline.INSTANCE.flingPosition(j2 > 0 ? j / j2 : 1.0f).getVelocityCoefficient()) * this.distance) / this.duration) * 1000.0f;
        }
    }

    public FlingCalculator(float f, Density density) {
        this.friction = f;
        this.density = density;
        this.magicPhysicalCoefficient = computeDeceleration(density);
    }

    private final float computeDeceleration(Density density) {
        float computeDeceleration;
        computeDeceleration = FlingCalculatorKt.computeDeceleration(0.84f, density.getDensity());
        return computeDeceleration;
    }

    private final double getSplineDeceleration(float f) {
        return AndroidFlingSpline.INSTANCE.deceleration(f, this.friction * this.magicPhysicalCoefficient);
    }

    public final float flingDistance(float f) {
        float f2;
        float f3;
        double splineDeceleration = getSplineDeceleration(f);
        f2 = FlingCalculatorKt.DecelerationRate;
        double d = f2 - 1.0d;
        double d2 = this.friction * this.magicPhysicalCoefficient;
        f3 = FlingCalculatorKt.DecelerationRate;
        return (float) (Math.exp((f3 / d) * splineDeceleration) * d2);
    }

    public final long flingDuration(float f) {
        float f2;
        double splineDeceleration = getSplineDeceleration(f);
        f2 = FlingCalculatorKt.DecelerationRate;
        return (long) (Math.exp(splineDeceleration / (f2 - 1.0d)) * 1000.0d);
    }

    public final FlingInfo flingInfo(float f) {
        float f2;
        float f3;
        double splineDeceleration = getSplineDeceleration(f);
        f2 = FlingCalculatorKt.DecelerationRate;
        double d = f2 - 1.0d;
        double d2 = this.friction * this.magicPhysicalCoefficient;
        f3 = FlingCalculatorKt.DecelerationRate;
        return new FlingInfo(f, (float) (Math.exp((f3 / d) * splineDeceleration) * d2), (long) (Math.exp(splineDeceleration / d) * 1000.0d));
    }

    public final Density getDensity() {
        return this.density;
    }
}
