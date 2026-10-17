package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import defpackage.hm;
import defpackage.ky;
import defpackage.vn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TargetApproachAnimation implements ApproachAnimation<Float, AnimationVector1D> {
    private final AnimationSpec<Float> animationSpec;

    public TargetApproachAnimation(AnimationSpec<Float> animationSpec) {
        this.animationSpec = animationSpec;
    }

    public Object approachAnimation(ScrollScope scrollScope, float f, float f2, ky kyVar, hm hmVar) {
        Object animateWithTarget;
        animateWithTarget = SnapFlingBehaviorKt.animateWithTarget(scrollScope, Math.signum(f2) * Math.abs(f), f, AnimationStateKt.AnimationState$default(0.0f, f2, 0L, 0L, false, 28, null), this.animationSpec, kyVar, hmVar);
        return animateWithTarget == vn.d ? animateWithTarget : (AnimationResult) animateWithTarget;
    }

    @Override // androidx.compose.foundation.gestures.snapping.ApproachAnimation
    public /* bridge */ /* synthetic */ Object approachAnimation(ScrollScope scrollScope, Float f, Float f2, ky kyVar, hm hmVar) {
        return approachAnimation(scrollScope, f.floatValue(), f2.floatValue(), kyVar, hmVar);
    }
}
