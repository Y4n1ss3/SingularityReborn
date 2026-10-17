package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.FinalSnappingItem;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.cr0;
import defpackage.gi0;
import defpackage.hm;
import defpackage.iy;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.ti;
import defpackage.ui;
import defpackage.vn;
import defpackage.w01;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt {
    private static final boolean DEBUG = false;
    private static final float MinFlingVelocityDp = Dp.m7611constructorimpl(400.0f);
    public static final float NoDistance = 0.0f;
    public static final float NoVelocity = 0.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateDecay(ScrollScope scrollScope, float f, AnimationState<Float, AnimationVector1D> animationState, DecayAnimationSpec<Float> decayAnimationSpec, ky kyVar, hm hmVar) {
        SnapFlingBehaviorKt$animateDecay$1 snapFlingBehaviorKt$animateDecay$1;
        int i;
        float f2;
        gi0 gi0Var;
        if (hmVar instanceof SnapFlingBehaviorKt$animateDecay$1) {
            snapFlingBehaviorKt$animateDecay$1 = (SnapFlingBehaviorKt$animateDecay$1) hmVar;
            int i2 = snapFlingBehaviorKt$animateDecay$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$animateDecay$1.label = i2 - Integer.MIN_VALUE;
                Object obj = snapFlingBehaviorKt$animateDecay$1.result;
                i = snapFlingBehaviorKt$animateDecay$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    gi0 gi0Var2 = new gi0();
                    boolean z = animationState.getVelocity().floatValue() == 0.0f;
                    cr0 cr0Var = new cr0(f, gi0Var2, scrollScope, kyVar, 0);
                    snapFlingBehaviorKt$animateDecay$1.L$0 = animationState;
                    snapFlingBehaviorKt$animateDecay$1.L$1 = gi0Var2;
                    snapFlingBehaviorKt$animateDecay$1.F$0 = f;
                    snapFlingBehaviorKt$animateDecay$1.label = 1;
                    Object animateDecay = SuspendAnimationKt.animateDecay(animationState, decayAnimationSpec, !z, cr0Var, snapFlingBehaviorKt$animateDecay$1);
                    vn vnVar = vn.d;
                    if (animateDecay == vnVar) {
                        return vnVar;
                    }
                    f2 = f;
                    gi0Var = gi0Var2;
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f2 = snapFlingBehaviorKt$animateDecay$1.F$0;
                    gi0Var = (gi0) snapFlingBehaviorKt$animateDecay$1.L$1;
                    animationState = (AnimationState) snapFlingBehaviorKt$animateDecay$1.L$0;
                    p10.Q(obj);
                }
                return new AnimationResult(new Float(f2 - gi0Var.d), animationState);
            }
        }
        snapFlingBehaviorKt$animateDecay$1 = new SnapFlingBehaviorKt$animateDecay$1(hmVar);
        Object obj2 = snapFlingBehaviorKt$animateDecay$1.result;
        i = snapFlingBehaviorKt$animateDecay$1.label;
        if (i != 0) {
        }
        return new AnimationResult(new Float(f2 - gi0Var.d), animationState);
    }

    private static final void animateDecay$consumeDelta(AnimationScope<Float, AnimationVector1D> animationScope, ScrollScope scrollScope, ky kyVar, float f) {
        float f2;
        try {
            f2 = scrollScope.scrollBy(f);
        } catch (CancellationException unused) {
            animationScope.cancelAnimation();
            f2 = 0.0f;
        }
        kyVar.invoke(Float.valueOf(f2));
        if (Math.abs(f - f2) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animateDecay$lambda$0(float f, gi0 gi0Var, ScrollScope scrollScope, ky kyVar, AnimationScope animationScope) {
        if (Math.abs(((Number) animationScope.getValue()).floatValue()) >= Math.abs(f)) {
            float coerceToTarget = coerceToTarget(((Number) animationScope.getValue()).floatValue(), f);
            animateDecay$consumeDelta(animationScope, scrollScope, kyVar, coerceToTarget - gi0Var.d);
            animationScope.cancelAnimation();
            gi0Var.d = coerceToTarget;
        } else {
            animateDecay$consumeDelta(animationScope, scrollScope, kyVar, ((Number) animationScope.getValue()).floatValue() - gi0Var.d);
            gi0Var.d = ((Number) animationScope.getValue()).floatValue();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateWithTarget(ScrollScope scrollScope, float f, float f2, AnimationState<Float, AnimationVector1D> animationState, AnimationSpec<Float> animationSpec, ky kyVar, hm hmVar) {
        SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$1;
        int i;
        float f3;
        gi0 gi0Var;
        AnimationState<Float, AnimationVector1D> animationState2;
        float f4 = f;
        if (hmVar instanceof SnapFlingBehaviorKt$animateWithTarget$1) {
            snapFlingBehaviorKt$animateWithTarget$1 = (SnapFlingBehaviorKt$animateWithTarget$1) hmVar;
            int i2 = snapFlingBehaviorKt$animateWithTarget$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$animateWithTarget$1.label = i2 - Integer.MIN_VALUE;
                SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$12 = snapFlingBehaviorKt$animateWithTarget$1;
                Object obj = snapFlingBehaviorKt$animateWithTarget$12.result;
                i = snapFlingBehaviorKt$animateWithTarget$12.label;
                if (i != 0) {
                    p10.Q(obj);
                    gi0 gi0Var2 = new gi0();
                    float floatValue = animationState.getVelocity().floatValue();
                    Float f5 = new Float(f4);
                    boolean z = animationState.getVelocity().floatValue() == 0.0f;
                    cr0 cr0Var = new cr0(f2, gi0Var2, scrollScope, kyVar, 1);
                    snapFlingBehaviorKt$animateWithTarget$12.L$0 = animationState;
                    snapFlingBehaviorKt$animateWithTarget$12.L$1 = gi0Var2;
                    snapFlingBehaviorKt$animateWithTarget$12.F$0 = f4;
                    snapFlingBehaviorKt$animateWithTarget$12.F$1 = floatValue;
                    snapFlingBehaviorKt$animateWithTarget$12.label = 1;
                    Object animateTo = SuspendAnimationKt.animateTo(animationState, f5, animationSpec, !z, cr0Var, snapFlingBehaviorKt$animateWithTarget$12);
                    vn vnVar = vn.d;
                    if (animateTo == vnVar) {
                        return vnVar;
                    }
                    f3 = floatValue;
                    gi0Var = gi0Var2;
                    animationState2 = animationState;
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f3 = snapFlingBehaviorKt$animateWithTarget$12.F$1;
                    f4 = snapFlingBehaviorKt$animateWithTarget$12.F$0;
                    gi0Var = (gi0) snapFlingBehaviorKt$animateWithTarget$12.L$1;
                    AnimationState<Float, AnimationVector1D> animationState3 = (AnimationState) snapFlingBehaviorKt$animateWithTarget$12.L$0;
                    p10.Q(obj);
                    animationState2 = animationState3;
                }
                return new AnimationResult(new Float(f4 - gi0Var.d), AnimationStateKt.copy$default((AnimationState) animationState2, 0.0f, coerceToTarget(animationState2.getVelocity().floatValue(), f3), 0L, 0L, false, 29, (Object) null));
            }
        }
        snapFlingBehaviorKt$animateWithTarget$1 = new SnapFlingBehaviorKt$animateWithTarget$1(hmVar);
        SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$122 = snapFlingBehaviorKt$animateWithTarget$1;
        Object obj2 = snapFlingBehaviorKt$animateWithTarget$122.result;
        i = snapFlingBehaviorKt$animateWithTarget$122.label;
        if (i != 0) {
        }
        return new AnimationResult(new Float(f4 - gi0Var.d), AnimationStateKt.copy$default((AnimationState) animationState2, 0.0f, coerceToTarget(animationState2.getVelocity().floatValue(), f3), 0L, 0L, false, 29, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animateWithTarget$lambda$0(float f, gi0 gi0Var, ScrollScope scrollScope, ky kyVar, AnimationScope animationScope) {
        float f2;
        float coerceToTarget = coerceToTarget(((Number) animationScope.getValue()).floatValue(), f);
        float f3 = coerceToTarget - gi0Var.d;
        try {
            f2 = scrollScope.scrollBy(f3);
        } catch (CancellationException unused) {
            animationScope.cancelAnimation();
            f2 = 0.0f;
        }
        kyVar.invoke(Float.valueOf(f2));
        if (Math.abs(f3 - f2) > 0.5f || coerceToTarget != ((Number) animationScope.getValue()).floatValue()) {
            animationScope.cancelAnimation();
        }
        gi0Var.d += f2;
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object approach(ScrollScope scrollScope, float f, float f2, ApproachAnimation<Float, AnimationVector1D> approachAnimation, ky kyVar, hm hmVar) {
        return approachAnimation.approachAnimation(scrollScope, new Float(f), new Float(f2), kyVar, hmVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (java.lang.Math.abs(r5) <= java.lang.Math.abs(r4)) goto L9;
     */
    /* renamed from: calculateFinalOffset-Fhqu1e0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float m587calculateFinalOffsetFhqu1e0(int i, float f, float f2) {
        FinalSnappingItem.Companion companion = FinalSnappingItem.Companion;
        if (!FinalSnappingItem.m580equalsimpl0(i, companion.m584getClosestItembbeMdSM())) {
            if (!FinalSnappingItem.m580equalsimpl0(i, companion.m585getNextItembbeMdSM())) {
                if (!FinalSnappingItem.m580equalsimpl0(i, companion.m586getPreviousItembbeMdSM())) {
                    f = 0.0f;
                }
            }
            f = f2;
        }
        if (calculateFinalOffset_Fhqu1e0$isValidDistance(f)) {
            return f;
        }
        return 0.0f;
    }

    private static final boolean calculateFinalOffset_Fhqu1e0$isValidDistance(float f) {
        return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
    }

    private static final float coerceToTarget(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    private static final <T extends Comparable<? super T>> T component1(ui uiVar) {
        return Float.valueOf(((ti) uiVar).a);
    }

    private static final <T extends Comparable<? super T>> T component2(ui uiVar) {
        return Float.valueOf(((ti) uiVar).b);
    }

    public static final float getMinFlingVelocityDp() {
        return MinFlingVelocityDp;
    }

    public static final TargetedFlingBehavior rememberSnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1921733134, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:230)");
        }
        Object obj = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        DecayAnimationSpec rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        boolean changed = composer.changed(rememberSplineBasedDecay) | ((((i & 14) ^ 6) > 4 && composer.changed(snapLayoutInfoProvider)) || (i & 6) == 4) | composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = snapFlingBehavior(snapLayoutInfoProvider, rememberSplineBasedDecay, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null));
            composer.updateRememberedValue(rememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }

    public static final TargetedFlingBehavior snapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec) {
        return new SnapFlingBehavior(snapLayoutInfoProvider, decayAnimationSpec, animationSpec);
    }

    private static final void debugLog(iy iyVar) {
    }
}
