package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import defpackage.bq;
import defpackage.gi0;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {1048}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DefaultFlingBehavior$performFling$2 extends us0 implements my {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ ScrollScope $this_performFling;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(float f, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, hm hmVar) {
        super(2, hmVar);
        this.$initialVelocity = f;
        this.this$0 = defaultFlingBehavior;
        this.$this_performFling = scrollScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(gi0 gi0Var, ScrollScope scrollScope, gi0 gi0Var2, DefaultFlingBehavior defaultFlingBehavior, AnimationScope animationScope) {
        float floatValue = ((Number) animationScope.getValue()).floatValue() - gi0Var.d;
        float scrollBy = scrollScope.scrollBy(floatValue);
        gi0Var.d = ((Number) animationScope.getValue()).floatValue();
        gi0Var2.d = ((Number) animationScope.getVelocity()).floatValue();
        if (Math.abs(floatValue - scrollBy) > 0.5f) {
            animationScope.cancelAnimation();
        }
        defaultFlingBehavior.setLastAnimationCycleCount(defaultFlingBehavior.getLastAnimationCycleCount() + 1);
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new DefaultFlingBehavior$performFling$2(this.$initialVelocity, this.this$0, this.$this_performFling, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((DefaultFlingBehavior$performFling$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        float f;
        gi0 gi0Var;
        AnimationState animationState;
        gi0 gi0Var2;
        DecayAnimationSpec decayAnimationSpec;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            float abs = Math.abs(this.$initialVelocity);
            f = this.$initialVelocity;
            if (abs > 1.0f) {
                gi0 gi0Var3 = new gi0();
                gi0Var3.d = f;
                gi0 gi0Var4 = new gi0();
                AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                try {
                    decayAnimationSpec = this.this$0.flingDecay;
                    gi0Var = gi0Var3;
                    try {
                        e eVar = new e(gi0Var4, this.$this_performFling, gi0Var, this.this$0, 1);
                        this.L$0 = gi0Var;
                        this.L$1 = AnimationState$default;
                        this.label = 1;
                        animationState = AnimationState$default;
                        try {
                            Object animateDecay$default = SuspendAnimationKt.animateDecay$default(animationState, decayAnimationSpec, false, eVar, this, 2, null);
                            vn vnVar = vn.d;
                            if (animateDecay$default == vnVar) {
                                return vnVar;
                            }
                            gi0Var2 = gi0Var;
                        } catch (CancellationException unused) {
                            gi0Var2 = gi0Var;
                            gi0Var2.d = ((Number) animationState.getVelocity()).floatValue();
                            f = gi0Var2.d;
                            return new Float(f);
                        }
                    } catch (CancellationException unused2) {
                        animationState = AnimationState$default;
                        gi0Var2 = gi0Var;
                        gi0Var2.d = ((Number) animationState.getVelocity()).floatValue();
                        f = gi0Var2.d;
                        return new Float(f);
                    }
                } catch (CancellationException unused3) {
                    gi0Var = gi0Var3;
                }
            }
            return new Float(f);
        }
        if (i != 1) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        animationState = (AnimationState) this.L$1;
        gi0Var2 = (gi0) this.L$0;
        try {
            p10.Q(obj);
        } catch (CancellationException unused4) {
            gi0Var2.d = ((Number) animationState.getVelocity()).floatValue();
            f = gi0Var2.d;
            return new Float(f);
        }
        f = gi0Var2.d;
        return new Float(f);
    }
}
