package androidx.compose.animation.core;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SpringSimulation {
    public static final int $stable = 8;
    private float finalPosition;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f) {
        this.finalPosition = f;
    }

    public final float getAcceleration(float f, float f2) {
        float f3 = f - this.finalPosition;
        double d = this.naturalFreq;
        return (float) (((-(d * d)) * f3) - (((d * 2.0d) * this.dampingRatio) * f2));
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final float getStiffness() {
        double d = this.naturalFreq;
        return (float) (d * d);
    }

    public final void setDampingRatio(float f) {
        if (f < 0.0f) {
            PreconditionsKt.throwIllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f;
    }

    public final void setFinalPosition(float f) {
        this.finalPosition = f;
    }

    public final void setStiffness(float f) {
        if (getStiffness() <= 0.0f) {
            PreconditionsKt.throwIllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f);
    }

    /* renamed from: updateValues-IJZedt4$animation_core, reason: not valid java name */
    public final long m166updateValuesIJZedt4$animation_core(float f, float f2, long j) {
        double sin;
        double cos;
        double exp;
        double exp2;
        float f3 = f - this.finalPosition;
        double d = j / 1000.0d;
        float f4 = this.dampingRatio;
        double d2 = f4 * f4;
        double d3 = this.naturalFreq;
        double d4 = (-f4) * d3;
        if (f4 > 1.0f) {
            double sqrt = Math.sqrt(d2 - 1.0d) * d3;
            double d5 = d4 + sqrt;
            double d6 = d4 - sqrt;
            double d7 = f3;
            double d8 = ((d6 * d7) - f2) / (d6 - d5);
            double d9 = d7 - d8;
            double d10 = d6 * d;
            double d11 = d * d5;
            sin = (Math.exp(d11) * d8) + (Math.exp(d10) * d9);
            exp = Math.exp(d10) * d9 * d6;
            exp2 = Math.exp(d11) * d8 * d5;
        } else {
            if (f4 != 1.0f) {
                double sqrt2 = Math.sqrt(1.0d - d2) * d3;
                double d12 = f3;
                double d13 = (((-d4) * d12) + f2) * (1.0d / sqrt2);
                double d14 = sqrt2 * d;
                double d15 = d * d4;
                sin = ((Math.sin(d14) * d13) + (Math.cos(d14) * d12)) * Math.exp(d15);
                cos = (((Math.cos(d14) * sqrt2 * d13) + (Math.sin(d14) * (-sqrt2) * d12)) * Math.exp(d15)) + (d4 * sin);
                return Motion.m157constructorimpl((Float.floatToRawIntBits((float) cos) & 4294967295L) | (Float.floatToRawIntBits((float) (sin + this.finalPosition)) << 32));
            }
            double d16 = f3;
            double d17 = (d3 * d16) + f2;
            double d18 = (-d3) * d;
            double d19 = (d * d17) + d16;
            sin = Math.exp(d18) * d19;
            exp = Math.exp(d18) * d19 * (-this.naturalFreq);
            exp2 = Math.exp(d18) * d17;
        }
        cos = exp2 + exp;
        return Motion.m157constructorimpl((Float.floatToRawIntBits((float) cos) & 4294967295L) | (Float.floatToRawIntBits((float) (sin + this.finalPosition)) << 32));
    }
}
