package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.ui.MotionDurationScale;
import defpackage.hm;
import defpackage.ky;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.vn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapFlingBehavior implements TargetedFlingBehavior {
    public static final int $stable = 0;
    private final DecayAnimationSpec<Float> decayAnimationSpec;
    private MotionDurationScale motionScaleDuration = ScrollableKt.getDefaultScrollMotionDurationScale();
    private final AnimationSpec<Float> snapAnimationSpec;
    private final SnapLayoutInfoProvider snapLayoutInfoProvider;

    public SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec) {
        this.snapLayoutInfoProvider = snapLayoutInfoProvider;
        this.decayAnimationSpec = decayAnimationSpec;
        this.snapAnimationSpec = animationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fling(ScrollScope scrollScope, float f, ky kyVar, hm hmVar) {
        SnapFlingBehavior$fling$1 snapFlingBehavior$fling$1;
        int i;
        ky kyVar2;
        if (hmVar instanceof SnapFlingBehavior$fling$1) {
            snapFlingBehavior$fling$1 = (SnapFlingBehavior$fling$1) hmVar;
            int i2 = snapFlingBehavior$fling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$fling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = snapFlingBehavior$fling$1.result;
                i = snapFlingBehavior$fling$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    MotionDurationScale motionDurationScale = this.motionScaleDuration;
                    SnapFlingBehavior$fling$result$1 snapFlingBehavior$fling$result$1 = new SnapFlingBehavior$fling$result$1(this, f, kyVar, scrollScope, null);
                    snapFlingBehavior$fling$1.L$0 = kyVar;
                    snapFlingBehavior$fling$1.label = 1;
                    obj = p01.H(motionDurationScale, snapFlingBehavior$fling$result$1, snapFlingBehavior$fling$1);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                    kyVar2 = kyVar;
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kyVar2 = (ky) snapFlingBehavior$fling$1.L$0;
                    p10.Q(obj);
                }
                AnimationResult animationResult = (AnimationResult) obj;
                kyVar2.invoke(new Float(0.0f));
                return animationResult;
            }
        }
        snapFlingBehavior$fling$1 = new SnapFlingBehavior$fling$1(this, hmVar);
        Object obj2 = snapFlingBehavior$fling$1.result;
        i = snapFlingBehavior$fling$1.label;
        if (i != 0) {
        }
        AnimationResult animationResult2 = (AnimationResult) obj2;
        kyVar2.invoke(new Float(0.0f));
        return animationResult2;
    }

    private final boolean isDecayApproachPossible(float f, float f2) {
        return Math.abs(DecayAnimationSpecKt.calculateTargetValue(this.decayAnimationSpec, 0.0f, f2)) >= Math.abs(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runApproach(ScrollScope scrollScope, float f, float f2, ky kyVar, hm hmVar) {
        Object approach;
        approach = SnapFlingBehaviorKt.approach(scrollScope, f, f2, isDecayApproachPossible(f, f2) ? new DecayApproachAnimation(this.decayAnimationSpec) : new TargetApproachAnimation(this.snapAnimationSpec), kyVar, hmVar);
        return approach;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryApproach(ScrollScope scrollScope, float f, float f2, ky kyVar, hm hmVar) {
        SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$1;
        SnapFlingBehavior snapFlingBehavior;
        int i;
        if (hmVar instanceof SnapFlingBehavior$tryApproach$1) {
            snapFlingBehavior$tryApproach$1 = (SnapFlingBehavior$tryApproach$1) hmVar;
            int i2 = snapFlingBehavior$tryApproach$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$tryApproach$1.label = i2 - Integer.MIN_VALUE;
                snapFlingBehavior = this;
                SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$12 = snapFlingBehavior$tryApproach$1;
                Object obj = snapFlingBehavior$tryApproach$12.result;
                i = snapFlingBehavior$tryApproach$12.label;
                if (i != 0) {
                    p10.Q(obj);
                    if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                        return AnimationStateKt.AnimationState$default(f, f2, 0L, 0L, false, 28, null);
                    }
                    snapFlingBehavior$tryApproach$12.label = 1;
                    obj = snapFlingBehavior.runApproach(scrollScope, f, f2, kyVar, snapFlingBehavior$tryApproach$12);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                return ((AnimationResult) obj).getCurrentAnimationState();
            }
        }
        snapFlingBehavior = this;
        snapFlingBehavior$tryApproach$1 = new SnapFlingBehavior$tryApproach$1(snapFlingBehavior, hmVar);
        SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$122 = snapFlingBehavior$tryApproach$1;
        Object obj2 = snapFlingBehavior$tryApproach$122.result;
        i = snapFlingBehavior$tryApproach$122.label;
        if (i != 0) {
        }
        return ((AnimationResult) obj2).getCurrentAnimationState();
    }

    public boolean equals(Object obj) {
        if (obj instanceof SnapFlingBehavior) {
            SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
            if (q10.b(snapFlingBehavior.snapAnimationSpec, this.snapAnimationSpec) && q10.b(snapFlingBehavior.decayAnimationSpec, this.decayAnimationSpec) && q10.b(snapFlingBehavior.snapLayoutInfoProvider, this.snapLayoutInfoProvider)) {
                return true;
            }
        }
        return false;
    }

    public final MotionDurationScale getMotionScaleDuration$foundation() {
        return this.motionScaleDuration;
    }

    public int hashCode() {
        return this.snapLayoutInfoProvider.hashCode() + ((this.decayAnimationSpec.hashCode() + (this.snapAnimationSpec.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // androidx.compose.foundation.gestures.TargetedFlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object performFling(ScrollScope scrollScope, float f, ky kyVar, hm hmVar) {
        SnapFlingBehavior$performFling$1 snapFlingBehavior$performFling$1;
        int i;
        if (hmVar instanceof SnapFlingBehavior$performFling$1) {
            snapFlingBehavior$performFling$1 = (SnapFlingBehavior$performFling$1) hmVar;
            int i2 = snapFlingBehavior$performFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$performFling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = snapFlingBehavior$performFling$1.result;
                i = snapFlingBehavior$performFling$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    snapFlingBehavior$performFling$1.label = 1;
                    obj = fling(scrollScope, f, kyVar, snapFlingBehavior$performFling$1);
                    Object obj2 = vn.d;
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                AnimationResult animationResult = (AnimationResult) obj;
                return new Float(((Number) animationResult.component1()).floatValue() != 0.0f ? ((Number) animationResult.component2().getVelocity()).floatValue() : 0.0f);
            }
        }
        snapFlingBehavior$performFling$1 = new SnapFlingBehavior$performFling$1(this, hmVar);
        Object obj3 = snapFlingBehavior$performFling$1.result;
        i = snapFlingBehavior$performFling$1.label;
        if (i != 0) {
        }
        AnimationResult animationResult2 = (AnimationResult) obj3;
        return new Float(((Number) animationResult2.component1()).floatValue() != 0.0f ? ((Number) animationResult2.component2().getVelocity()).floatValue() : 0.0f);
    }

    public final void setMotionScaleDuration$foundation(MotionDurationScale motionDurationScale) {
        this.motionScaleDuration = motionDurationScale;
    }
}
