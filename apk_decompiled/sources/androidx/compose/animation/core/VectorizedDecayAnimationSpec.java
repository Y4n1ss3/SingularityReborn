package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface VectorizedDecayAnimationSpec<V extends AnimationVector> {
    float getAbsVelocityThreshold();

    long getDurationNanos(V v, V v2);

    V getTargetValue(V v, V v2);

    V getValueFromNanos(long j, V v, V v2);

    V getVelocityFromNanos(long j, V v, V v2);
}
