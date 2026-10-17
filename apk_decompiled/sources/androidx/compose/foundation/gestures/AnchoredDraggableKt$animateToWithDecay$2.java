package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import defpackage.bq;
import defpackage.gi0;
import defpackage.hm;
import defpackage.ky;
import defpackage.oy;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", l = {1394, 1412, 1436}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$animateToWithDecay$2 extends us0 implements oy {
    final /* synthetic */ DecayAnimationSpec<Float> $decayAnimationSpec;
    final /* synthetic */ gi0 $remainingVelocity;
    final /* synthetic */ AnimationSpec<Float> $snapAnimationSpec;
    final /* synthetic */ AnchoredDraggableState<T> $this_animateToWithDecay;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateToWithDecay$2(AnchoredDraggableState<T> anchoredDraggableState, float f, AnimationSpec<Float> animationSpec, gi0 gi0Var, DecayAnimationSpec<Float> decayAnimationSpec, hm hmVar) {
        super(4, hmVar);
        this.$this_animateToWithDecay = anchoredDraggableState;
        this.$velocity = f;
        this.$snapAnimationSpec = animationSpec;
        this.$remainingVelocity = gi0Var;
        this.$decayAnimationSpec = decayAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$2(float f, gi0 gi0Var, AnchoredDragScope anchoredDragScope, gi0 gi0Var2, AnimationScope animationScope) {
        float coerceToTarget;
        if ((((Number) animationScope.getValue()).floatValue() >= f || gi0Var.d <= f) && (((Number) animationScope.getValue()).floatValue() <= f || gi0Var.d >= f)) {
            anchoredDragScope.dragTo(((Number) animationScope.getValue()).floatValue(), ((Number) animationScope.getVelocity()).floatValue());
            gi0Var2.d = ((Number) animationScope.getVelocity()).floatValue();
            gi0Var.d = ((Number) animationScope.getValue()).floatValue();
        } else {
            coerceToTarget = AnchoredDraggableKt.coerceToTarget(((Number) animationScope.getValue()).floatValue(), f);
            anchoredDragScope.dragTo(coerceToTarget, ((Number) animationScope.getVelocity()).floatValue());
            gi0Var2.d = Float.isNaN(((Number) animationScope.getVelocity()).floatValue()) ? 0.0f : ((Number) animationScope.getVelocity()).floatValue();
            gi0Var.d = coerceToTarget;
            animationScope.cancelAnimation();
        }
        return w01.a;
    }

    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t, hm hmVar) {
        AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(this.$this_animateToWithDecay, this.$velocity, this.$snapAnimationSpec, this.$remainingVelocity, this.$decayAnimationSpec, hmVar);
        anchoredDraggableKt$animateToWithDecay$2.L$0 = anchoredDragScope;
        anchoredDraggableKt$animateToWithDecay$2.L$1 = draggableAnchors;
        anchoredDraggableKt$animateToWithDecay$2.L$2 = t;
        return anchoredDraggableKt$animateToWithDecay$2.invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:
    
        if (r0 != r14) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r1, r1, false, r3, r24, 2, null) != r14) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
    
        if (r0 == r14) goto L44;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object animateTo;
        float f;
        AnchoredDragScope anchoredDragScope;
        Object animateTo2;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            final AnchoredDragScope anchoredDragScope2 = (AnchoredDragScope) this.L$0;
            DraggableAnchors draggableAnchors = (DraggableAnchors) this.L$1;
            Object obj2 = this.L$2;
            final float positionOf = draggableAnchors.positionOf(obj2);
            if (!Float.isNaN(positionOf)) {
                final gi0 gi0Var = new gi0();
                float offset = Float.isNaN(this.$this_animateToWithDecay.getOffset()) ? 0.0f : this.$this_animateToWithDecay.getOffset();
                gi0Var.d = offset;
                if (offset != positionOf) {
                    float f2 = this.$velocity;
                    float f3 = (positionOf - offset) * f2;
                    vn vnVar = vn.d;
                    if (f3 < 0.0f || f2 == 0.0f) {
                        AnchoredDraggableState<T> anchoredDraggableState = this.$this_animateToWithDecay;
                        AnimationSpec<Float> animationSpec = this.$snapAnimationSpec;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        animateTo = AnchoredDraggableKt.animateTo(anchoredDraggableState, f2, anchoredDragScope2, draggableAnchors, obj2, animationSpec, this);
                    } else {
                        float calculateTargetValue = DecayAnimationSpecKt.calculateTargetValue(this.$decayAnimationSpec, offset, f2);
                        float f4 = this.$velocity;
                        if (f4 > 0.0f) {
                            if (calculateTargetValue < positionOf) {
                                anchoredDragScope = anchoredDragScope2;
                                f = f4;
                                AnchoredDraggableState<T> anchoredDraggableState2 = this.$this_animateToWithDecay;
                                AnimationSpec<Float> animationSpec2 = this.$snapAnimationSpec;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 3;
                                animateTo2 = AnchoredDraggableKt.animateTo(anchoredDraggableState2, f, anchoredDragScope, draggableAnchors, obj2, animationSpec2, this);
                            }
                            AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(gi0Var.d, f4, 0L, 0L, false, 28, null);
                            DecayAnimationSpec<Float> decayAnimationSpec = this.$decayAnimationSpec;
                            final gi0 gi0Var2 = this.$remainingVelocity;
                            ky kyVar = new ky() { // from class: androidx.compose.foundation.gestures.a
                                @Override // defpackage.ky
                                public final Object invoke(Object obj3) {
                                    w01 invokeSuspend$lambda$2;
                                    invokeSuspend$lambda$2 = AnchoredDraggableKt$animateToWithDecay$2.invokeSuspend$lambda$2(positionOf, gi0Var, anchoredDragScope2, gi0Var2, (AnimationScope) obj3);
                                    return invokeSuspend$lambda$2;
                                }
                            };
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 2;
                        } else {
                            if (calculateTargetValue > positionOf) {
                                f = f4;
                                anchoredDragScope = anchoredDragScope2;
                                AnchoredDraggableState<T> anchoredDraggableState22 = this.$this_animateToWithDecay;
                                AnimationSpec<Float> animationSpec22 = this.$snapAnimationSpec;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 3;
                                animateTo2 = AnchoredDraggableKt.animateTo(anchoredDraggableState22, f, anchoredDragScope, draggableAnchors, obj2, animationSpec22, this);
                            }
                            AnimationState AnimationState$default2 = AnimationStateKt.AnimationState$default(gi0Var.d, f4, 0L, 0L, false, 28, null);
                            DecayAnimationSpec<Float> decayAnimationSpec2 = this.$decayAnimationSpec;
                            final gi0 gi0Var22 = this.$remainingVelocity;
                            ky kyVar2 = new ky() { // from class: androidx.compose.foundation.gestures.a
                                @Override // defpackage.ky
                                public final Object invoke(Object obj3) {
                                    w01 invokeSuspend$lambda$2;
                                    invokeSuspend$lambda$2 = AnchoredDraggableKt$animateToWithDecay$2.invokeSuspend$lambda$2(positionOf, gi0Var, anchoredDragScope2, gi0Var22, (AnimationScope) obj3);
                                    return invokeSuspend$lambda$2;
                                }
                            };
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 2;
                        }
                    }
                    return vnVar;
                }
            }
        } else if (i == 1) {
            p10.Q(obj);
            this.$remainingVelocity.d = 0.0f;
        } else if (i == 2) {
            p10.Q(obj);
        } else {
            if (i != 3) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
            this.$remainingVelocity.d = 0.0f;
        }
        return w01.a;
    }

    @Override // defpackage.oy
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (hm) obj4);
    }
}
