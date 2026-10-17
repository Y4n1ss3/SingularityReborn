package androidx.compose.animation.core;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface FloatDecayAnimationSpec {
    float getAbsVelocityThreshold();

    long getDurationNanos(float f, float f2);

    float getTargetValue(float f, float f2);

    float getValueFromNanos(long j, float f, float f2);

    float getVelocityFromNanos(long j, float f, float f2);
}
