package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import defpackage.bq;
import defpackage.gi0;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {134, 150}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SnapFlingBehavior$fling$result$1 extends us0 implements my {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ ky $onRemainingScrollOffsetUpdate;
    final /* synthetic */ ScrollScope $this_fling;
    Object L$0;
    int label;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$result$1(SnapFlingBehavior snapFlingBehavior, float f, ky kyVar, ScrollScope scrollScope, hm hmVar) {
        super(2, hmVar);
        this.this$0 = snapFlingBehavior;
        this.$initialVelocity = f;
        this.$onRemainingScrollOffsetUpdate = kyVar;
        this.$this_fling = scrollScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$1(gi0 gi0Var, ky kyVar, float f) {
        float f2 = gi0Var.d - f;
        gi0Var.d = f2;
        kyVar.invoke(Float.valueOf(f2));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$4(gi0 gi0Var, ky kyVar, float f) {
        float f2 = gi0Var.d - f;
        gi0Var.d = f2;
        kyVar.invoke(Float.valueOf(f2));
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SnapFlingBehavior$fling$result$1(this.this$0, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SnapFlingBehavior$fling$result$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        if (r0 == r9) goto L22;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DecayAnimationSpec decayAnimationSpec;
        SnapLayoutInfoProvider snapLayoutInfoProvider;
        final gi0 gi0Var;
        Object tryApproach;
        SnapLayoutInfoProvider snapLayoutInfoProvider2;
        AnimationSpec animationSpec;
        Object animateWithTarget;
        int i = this.label;
        final int i2 = 1;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            decayAnimationSpec = this.this$0.decayAnimationSpec;
            float calculateTargetValue = DecayAnimationSpecKt.calculateTargetValue(decayAnimationSpec, 0.0f, this.$initialVelocity);
            snapLayoutInfoProvider = this.this$0.snapLayoutInfoProvider;
            float calculateApproachOffset = snapLayoutInfoProvider.calculateApproachOffset(this.$initialVelocity, calculateTargetValue);
            if (Float.isNaN(calculateApproachOffset)) {
                InlineClassHelperKt.throwIllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            gi0Var = new gi0();
            float signum = Math.signum(this.$initialVelocity) * Math.abs(calculateApproachOffset);
            gi0Var.d = signum;
            this.$onRemainingScrollOffsetUpdate.invoke(new Float(signum));
            SnapFlingBehavior snapFlingBehavior = this.this$0;
            ScrollScope scrollScope = this.$this_fling;
            float f = gi0Var.d;
            float f2 = this.$initialVelocity;
            final ky kyVar = this.$onRemainingScrollOffsetUpdate;
            final int i3 = 0;
            ky kyVar2 = new ky() { // from class: androidx.compose.foundation.gestures.snapping.a
                @Override // defpackage.ky
                public final Object invoke(Object obj2) {
                    w01 invokeSuspend$lambda$1;
                    w01 invokeSuspend$lambda$4;
                    int i4 = i3;
                    ky kyVar3 = kyVar;
                    gi0 gi0Var2 = gi0Var;
                    float floatValue = ((Float) obj2).floatValue();
                    switch (i4) {
                        case 0:
                            invokeSuspend$lambda$1 = SnapFlingBehavior$fling$result$1.invokeSuspend$lambda$1(gi0Var2, kyVar3, floatValue);
                            return invokeSuspend$lambda$1;
                        default:
                            invokeSuspend$lambda$4 = SnapFlingBehavior$fling$result$1.invokeSuspend$lambda$4(gi0Var2, kyVar3, floatValue);
                            return invokeSuspend$lambda$4;
                    }
                }
            };
            this.L$0 = gi0Var;
            this.label = 1;
            tryApproach = snapFlingBehavior.tryApproach(scrollScope, f, f2, kyVar2, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    p10.Q(obj);
                    return obj;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gi0 gi0Var2 = (gi0) this.L$0;
            p10.Q(obj);
            gi0Var = gi0Var2;
            tryApproach = obj;
        }
        AnimationState animationState = (AnimationState) tryApproach;
        snapLayoutInfoProvider2 = this.this$0.snapLayoutInfoProvider;
        float calculateSnapOffset = snapLayoutInfoProvider2.calculateSnapOffset(((Number) animationState.getVelocity()).floatValue());
        if (Float.isNaN(calculateSnapOffset)) {
            InlineClassHelperKt.throwIllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        gi0Var.d = calculateSnapOffset;
        ScrollScope scrollScope2 = this.$this_fling;
        AnimationState copy$default = AnimationStateKt.copy$default(animationState, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
        animationSpec = this.this$0.snapAnimationSpec;
        final ky kyVar3 = this.$onRemainingScrollOffsetUpdate;
        ky kyVar4 = new ky() { // from class: androidx.compose.foundation.gestures.snapping.a
            @Override // defpackage.ky
            public final Object invoke(Object obj2) {
                w01 invokeSuspend$lambda$1;
                w01 invokeSuspend$lambda$4;
                int i4 = i2;
                ky kyVar32 = kyVar3;
                gi0 gi0Var22 = gi0Var;
                float floatValue = ((Float) obj2).floatValue();
                switch (i4) {
                    case 0:
                        invokeSuspend$lambda$1 = SnapFlingBehavior$fling$result$1.invokeSuspend$lambda$1(gi0Var22, kyVar32, floatValue);
                        return invokeSuspend$lambda$1;
                    default:
                        invokeSuspend$lambda$4 = SnapFlingBehavior$fling$result$1.invokeSuspend$lambda$4(gi0Var22, kyVar32, floatValue);
                        return invokeSuspend$lambda$4;
                }
            }
        };
        this.L$0 = null;
        this.label = 2;
        animateWithTarget = SnapFlingBehaviorKt.animateWithTarget(scrollScope2, calculateSnapOffset, calculateSnapOffset, copy$default, animationSpec, kyVar4, this);
        return animateWithTarget == vnVar ? vnVar : animateWithTarget;
    }
}
