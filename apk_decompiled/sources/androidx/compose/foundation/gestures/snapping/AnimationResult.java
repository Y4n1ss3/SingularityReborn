package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AnimationResult<T, V extends AnimationVector> {
    private final AnimationState<T, V> currentAnimationState;
    private final T remainingOffset;

    public AnimationResult(T t, AnimationState<T, V> animationState) {
        this.remainingOffset = t;
        this.currentAnimationState = animationState;
    }

    public final T component1() {
        return this.remainingOffset;
    }

    public final AnimationState<T, V> component2() {
        return this.currentAnimationState;
    }

    public final AnimationState<T, V> getCurrentAnimationState() {
        return this.currentAnimationState;
    }

    public final T getRemainingOffset() {
        return this.remainingOffset;
    }
}
