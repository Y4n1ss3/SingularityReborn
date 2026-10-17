package androidx.compose.animation.core;

import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.xa0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", l = {489}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SeekableTransitionState$seekTo$3 extends us0 implements ky {
    final /* synthetic */ float $fraction;
    final /* synthetic */ S $oldTargetState;
    final /* synthetic */ S $targetState;
    final /* synthetic */ Transition<S> $transition;
    int label;
    final /* synthetic */ SeekableTransitionState<S> this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", l = {511}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ float $fraction;
        final /* synthetic */ S $oldTargetState;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", f = "Transition.kt", l = {507}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00001 extends us0 implements my {
            int label;
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00001(SeekableTransitionState<S> seekableTransitionState, hm hmVar) {
                super(2, hmVar);
                this.this$0 = seekableTransitionState;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                return new C00001(this.this$0, hmVar);
            }

            @Override // defpackage.my
            public final Object invoke(un unVar, hm hmVar) {
                return ((C00001) create(unVar, hmVar)).invokeSuspend(w01.a);
            }

            @Override // defpackage.mc
            public final Object invokeSuspend(Object obj) {
                Object runAnimations;
                int i = this.label;
                if (i == 0) {
                    p10.Q(obj);
                    SeekableTransitionState<S> seekableTransitionState = this.this$0;
                    this.label = 1;
                    runAnimations = seekableTransitionState.runAnimations(this);
                    vn vnVar = vn.d;
                    if (runAnimations == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                return w01.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(S s, S s2, SeekableTransitionState<S> seekableTransitionState, Transition<S> transition, float f, hm hmVar) {
            super(2, hmVar);
            this.$targetState = s;
            this.$oldTargetState = s2;
            this.this$0 = seekableTransitionState;
            this.$transition = transition;
            this.$fraction = f;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, hmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            xa0 xa0Var;
            Object waitForCompositionAfterTargetStateChange;
            int i = this.label;
            w01 w01Var = w01.a;
            if (i == 0) {
                p10.Q(obj);
                un unVar = (un) this.L$0;
                boolean b = q10.b(this.$targetState, this.$oldTargetState);
                SeekableTransitionState<S> seekableTransitionState = this.this$0;
                if (b) {
                    ((SeekableTransitionState) seekableTransitionState).currentAnimation = null;
                    if (q10.b(this.this$0.getCurrentState(), this.$targetState)) {
                        return w01Var;
                    }
                } else {
                    seekableTransitionState.moveAnimationToInitialState();
                }
                if (!q10.b(this.$targetState, this.$oldTargetState)) {
                    this.$transition.updateTarget$animation_core(this.$targetState);
                    this.$transition.setPlayTimeNanos(0L);
                    this.this$0.setTargetState$animation_core(this.$targetState);
                    this.$transition.resetAnimationFraction$animation_core(this.$fraction);
                }
                this.this$0.setFraction(this.$fraction);
                xa0Var = ((SeekableTransitionState) this.this$0).initialValueAnimations;
                boolean e = xa0Var.e();
                SeekableTransitionState<S> seekableTransitionState2 = this.this$0;
                if (e) {
                    p01.t(unVar, null, null, new C00001(seekableTransitionState2, null), 3);
                } else {
                    ((SeekableTransitionState) seekableTransitionState2).lastFrameTimeNanos = Long.MIN_VALUE;
                }
                SeekableTransitionState<S> seekableTransitionState3 = this.this$0;
                this.label = 1;
                waitForCompositionAfterTargetStateChange = seekableTransitionState3.waitForCompositionAfterTargetStateChange(this);
                vn vnVar = vn.d;
                if (waitForCompositionAfterTargetStateChange == vnVar) {
                    return vnVar;
                }
            } else {
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
            }
            this.this$0.seekToFraction();
            return w01Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$seekTo$3(S s, S s2, SeekableTransitionState<S> seekableTransitionState, Transition<S> transition, float f, hm hmVar) {
        super(1, hmVar);
        this.$targetState = s;
        this.$oldTargetState = s2;
        this.this$0 = seekableTransitionState;
        this.$transition = transition;
        this.$fraction = f;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new SeekableTransitionState$seekTo$3(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((SeekableTransitionState$seekTo$3) create(hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, null);
            this.label = 1;
            Object n = p10.n(anonymousClass1, this);
            vn vnVar = vn.d;
            if (n == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
