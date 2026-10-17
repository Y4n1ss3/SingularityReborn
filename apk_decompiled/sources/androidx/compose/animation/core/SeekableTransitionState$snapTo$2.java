package androidx.compose.animation.core;

import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.q10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", l = {458}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SeekableTransitionState$snapTo$2 extends us0 implements ky {
    final /* synthetic */ S $targetState;
    final /* synthetic */ Transition<S> $transition;
    int label;
    final /* synthetic */ SeekableTransitionState<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$snapTo$2(SeekableTransitionState<S> seekableTransitionState, S s, Transition<S> transition, hm hmVar) {
        super(1, hmVar);
        this.this$0 = seekableTransitionState;
        this.$targetState = s;
        this.$transition = transition;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new SeekableTransitionState$snapTo$2(this.this$0, this.$targetState, this.$transition, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((SeekableTransitionState$snapTo$2) create(hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object waitForCompositionAfterTargetStateChange;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            this.this$0.endAllAnimations();
            ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = Long.MIN_VALUE;
            this.this$0.setFraction(0.0f);
            S s = this.$targetState;
            float f = q10.b(s, this.this$0.getCurrentState()) ? -4.0f : q10.b(s, this.this$0.getTargetState()) ? -5.0f : -3.0f;
            this.$transition.updateTarget$animation_core(this.$targetState);
            this.$transition.setPlayTimeNanos(0L);
            this.this$0.setTargetState$animation_core(this.$targetState);
            this.this$0.setFraction(0.0f);
            this.this$0.setCurrentState$animation_core(this.$targetState);
            this.$transition.resetAnimationFraction$animation_core(f);
            if (f == -3.0f) {
                SeekableTransitionState<S> seekableTransitionState = this.this$0;
                this.label = 1;
                waitForCompositionAfterTargetStateChange = seekableTransitionState.waitForCompositionAfterTargetStateChange(this);
                vn vnVar = vn.d;
                if (waitForCompositionAfterTargetStateChange == vnVar) {
                    return vnVar;
                }
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        this.$transition.onTransitionEnd$animation_core();
        return w01.a;
    }
}
