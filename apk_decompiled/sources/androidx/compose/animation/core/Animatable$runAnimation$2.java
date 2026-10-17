package androidx.compose.animation.core;

import defpackage.bq;
import defpackage.fi0;
import defpackage.hm;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.q10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {308}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class Animatable$runAnimation$2 extends us0 implements ky {
    final /* synthetic */ Animation<T, V> $animation;
    final /* synthetic */ ky $block;
    final /* synthetic */ T $initialVelocity;
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(Animatable<T, V> animatable, T t, Animation<T, V> animation, long j, ky kyVar, hm hmVar) {
        super(1, hmVar);
        this.this$0 = animatable;
        this.$initialVelocity = t;
        this.$animation = animation;
        this.$startTime = j;
        this.$block = kyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(Animatable animatable, AnimationState animationState, ky kyVar, fi0 fi0Var, AnimationScope animationScope) {
        Object clampToBounds;
        SuspendAnimationKt.updateState(animationScope, animatable.getInternalState$animation_core());
        clampToBounds = animatable.clampToBounds(animationScope.getValue());
        if (!q10.b(clampToBounds, animationScope.getValue())) {
            animatable.getInternalState$animation_core().setValue$animation_core(clampToBounds);
            animationState.setValue$animation_core(clampToBounds);
            if (kyVar != null) {
                kyVar.invoke(animatable);
            }
            animationScope.cancelAnimation();
            fi0Var.d = true;
        } else if (kyVar != null) {
            kyVar.invoke(animatable);
        }
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((Animatable$runAnimation$2) create(hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        AnimationState animationState;
        fi0 fi0Var;
        int i = this.label;
        try {
            if (i == 0) {
                p10.Q(obj);
                this.this$0.getInternalState$animation_core().setVelocityVector$animation_core((AnimationVector) this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));
                this.this$0.setTargetValue(this.$animation.getTargetValue());
                this.this$0.setRunning(true);
                AnimationState copy$default = AnimationStateKt.copy$default(this.this$0.getInternalState$animation_core(), (Object) null, (AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                fi0 fi0Var2 = new fi0();
                Animation<T, V> animation = this.$animation;
                long j = this.$startTime;
                a aVar = new a(this.this$0, copy$default, this.$block, fi0Var2, 0);
                this.L$0 = copy$default;
                this.L$1 = fi0Var2;
                this.label = 1;
                Object animate = SuspendAnimationKt.animate(copy$default, animation, j, aVar, this);
                vn vnVar = vn.d;
                if (animate == vnVar) {
                    return vnVar;
                }
                animationState = copy$default;
                fi0Var = fi0Var2;
            } else {
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fi0Var = (fi0) this.L$1;
                animationState = (AnimationState) this.L$0;
                p10.Q(obj);
            }
            AnimationEndReason animationEndReason = fi0Var.d ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
            this.this$0.endAnimation();
            return new AnimationResult(animationState, animationEndReason);
        } catch (CancellationException e) {
            this.this$0.endAnimation();
            throw e;
        }
    }
}
