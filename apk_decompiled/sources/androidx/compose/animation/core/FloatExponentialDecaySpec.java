package androidx.compose.animation.core;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FloatExponentialDecaySpec implements FloatDecayAnimationSpec {
    public static final int $stable = 0;
    private final float absVelocityThreshold;
    private final float friction;

    public FloatExponentialDecaySpec(float f, float f2) {
        this.absVelocityThreshold = Math.max(1.0E-7f, Math.abs(f2));
        this.friction = Math.max(1.0E-4f, f) * (-4.2f);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f, float f2) {
        return ((long) ((((float) Math.log(getAbsVelocityThreshold() / Math.abs(f2))) * 1000.0f) / this.friction)) * AnimationKt.MillisToNanos;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f, float f2) {
        if (Math.abs(f2) <= getAbsVelocityThreshold()) {
            return f;
        }
        double log = Math.log(Math.abs(getAbsVelocityThreshold() / f2));
        float f3 = this.friction;
        return ((f2 / f3) * ((float) Math.exp((f3 * ((log / f3) * 1000.0d)) / 1000.0d))) + (f - (f2 / f3));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j, float f, float f2) {
        long j2 = j / AnimationKt.MillisToNanos;
        float f3 = this.friction;
        return ((f2 / f3) * ((float) Math.exp((f3 * j2) / 1000.0f))) + (f - (f2 / f3));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j, float f, float f2) {
        return f2 * ((float) Math.exp(((j / AnimationKt.MillisToNanos) / 1000.0f) * this.friction));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FloatExponentialDecaySpec() {
        this(r2, r2, 3, null);
        float f = 0.0f;
    }

    public /* synthetic */ FloatExponentialDecaySpec(float f, float f2, int i, dq dqVar) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.1f : f2);
    }
}
