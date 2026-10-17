package androidx.compose.animation.core;

import androidx.compose.animation.core.SeekableTransitionState;
import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.lb0;
import defpackage.my;
import defpackage.o;
import defpackage.ob0;
import defpackage.p10;
import defpackage.q10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;
import defpackage.zv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", l = {600}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SeekableTransitionState$animateTo$2 extends us0 implements ky {
    final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
    final /* synthetic */ S $targetState;
    final /* synthetic */ Transition<S> $transition;
    int label;
    final /* synthetic */ SeekableTransitionState<S> this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", l = {2174, 613, 615, 669, 671}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SeekableTransitionState<S> seekableTransitionState, S s, Transition<S> transition, FiniteAnimationSpec<Float> finiteAnimationSpec, hm hmVar) {
            super(2, hmVar);
            this.this$0 = seekableTransitionState;
            this.$targetState = s;
            this.$transition = transition;
            this.$animationSpec = finiteAnimationSpec;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.this$0, this.$targetState, this.$transition, this.$animationSpec, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x01e8, code lost:
        
            if (r1 == r11) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x01d6, code lost:
        
            if (r1 == r11) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00b7, code lost:
        
            if (r1 == r11) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00ab, code lost:
        
            if (r1 == r11) goto L75;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
        @Override // defpackage.mc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SeekableTransitionState seekableTransitionState;
            Object obj2;
            Object doOneFrame;
            Object waitForCompositionAfterTargetStateChange;
            Object runAnimations;
            SeekableTransitionState.SeekingAnimationState seekingAnimationState;
            SeekableTransitionState.Companion companion;
            AnimationVector1D zeroVelocity;
            SeekableTransitionState.Companion companion2;
            long Q;
            SeekableTransitionState.Companion companion3;
            SeekableTransitionState.Companion companion4;
            SeekableTransitionState.Companion companion5;
            Object waitForComposition;
            int i = this.label;
            vn vnVar = vn.d;
            try {
                if (i == 0) {
                    p10.Q(obj);
                    Object targetState = this.this$0.getTargetState();
                    if (!q10.b(this.$targetState, targetState)) {
                        this.this$0.moveAnimationToInitialState();
                        this.this$0.setFraction(0.0f);
                        this.$transition.updateTarget$animation_core(this.$targetState);
                        this.$transition.setPlayTimeNanos(0L);
                        this.this$0.setCurrentState$animation_core(targetState);
                        this.this$0.setTargetState$animation_core(this.$targetState);
                    }
                    lb0 compositionContinuationMutex$animation_core = this.this$0.getCompositionContinuationMutex$animation_core();
                    SeekableTransitionState seekableTransitionState2 = this.this$0;
                    this.L$0 = compositionContinuationMutex$animation_core;
                    this.L$1 = seekableTransitionState2;
                    this.label = 1;
                    ob0 ob0Var = (ob0) compositionContinuationMutex$animation_core;
                    if (ob0Var.d(this) != vnVar) {
                        seekableTransitionState = seekableTransitionState2;
                        obj2 = ob0Var;
                    }
                    return vnVar;
                }
                if (i == 1) {
                    seekableTransitionState = (SeekableTransitionState) this.L$1;
                    Object obj3 = (lb0) this.L$0;
                    p10.Q(obj);
                    obj2 = obj3;
                } else if (i == 2) {
                    p10.Q(obj);
                    SeekableTransitionState<S> seekableTransitionState3 = this.this$0;
                    this.label = 3;
                    waitForCompositionAfterTargetStateChange = seekableTransitionState3.waitForCompositionAfterTargetStateChange(this);
                } else {
                    if (i == 3) {
                        p10.Q(obj);
                        if (!q10.b(this.this$0.getCurrentState(), this.$targetState)) {
                            if (this.this$0.getFraction() < 1.0f) {
                                seekingAnimationState = ((SeekableTransitionState) this.this$0).currentAnimation;
                                FiniteAnimationSpec<Float> finiteAnimationSpec = this.$animationSpec;
                                VectorizedAnimationSpec<AnimationVector1D> vectorize = finiteAnimationSpec != null ? finiteAnimationSpec.vectorize((TwoWayConverter<Float, V>) VectorConvertersKt.getVectorConverter(zv.a)) : null;
                                if (seekingAnimationState == null || !q10.b(vectorize, seekingAnimationState.getAnimationSpec())) {
                                    VectorizedAnimationSpec<AnimationVector1D> animationSpec = seekingAnimationState != null ? seekingAnimationState.getAnimationSpec() : null;
                                    if (animationSpec != null) {
                                        long progressNanos = seekingAnimationState.getProgressNanos();
                                        AnimationVector1D start = seekingAnimationState.getStart();
                                        companion4 = SeekableTransitionState.Companion;
                                        AnimationVector1D target1 = companion4.getTarget1();
                                        AnimationVector1D initialVelocity = seekingAnimationState.getInitialVelocity();
                                        if (initialVelocity == null) {
                                            companion5 = SeekableTransitionState.Companion;
                                            initialVelocity = companion5.getZeroVelocity();
                                        }
                                        zeroVelocity = animationSpec.getVelocityFromNanos(progressNanos, start, target1, initialVelocity);
                                    } else if (seekingAnimationState == null || seekingAnimationState.getProgressNanos() == 0) {
                                        companion = SeekableTransitionState.Companion;
                                        zeroVelocity = companion.getZeroVelocity();
                                    } else {
                                        long durationNanos = seekingAnimationState.getDurationNanos();
                                        if (durationNanos == Long.MIN_VALUE) {
                                            durationNanos = this.this$0.getTotalDurationNanos$animation_core();
                                        }
                                        float f = durationNanos / 1.0E9f;
                                        if (f <= 0.0f) {
                                            companion2 = SeekableTransitionState.Companion;
                                            zeroVelocity = companion2.getZeroVelocity();
                                        } else {
                                            zeroVelocity = new AnimationVector1D(1.0f / f);
                                        }
                                    }
                                    if (seekingAnimationState == null) {
                                        seekingAnimationState = new SeekableTransitionState.SeekingAnimationState();
                                    }
                                    seekingAnimationState.setAnimationSpec(vectorize);
                                    seekingAnimationState.setComplete(false);
                                    seekingAnimationState.setValue(this.this$0.getFraction());
                                    seekingAnimationState.getStart().set$animation_core(0, this.this$0.getFraction());
                                    seekingAnimationState.setDurationNanos(this.this$0.getTotalDurationNanos$animation_core());
                                    seekingAnimationState.setProgressNanos(0L);
                                    seekingAnimationState.setInitialVelocity(zeroVelocity);
                                    if (vectorize != null) {
                                        AnimationVector1D start2 = seekingAnimationState.getStart();
                                        companion3 = SeekableTransitionState.Companion;
                                        Q = vectorize.getDurationNanos(start2, companion3.getTarget1(), zeroVelocity);
                                    } else {
                                        Q = y80.Q((1.0d - this.this$0.getFraction()) * this.this$0.getTotalDurationNanos$animation_core());
                                    }
                                    seekingAnimationState.setAnimationSpecDuration(Q);
                                    ((SeekableTransitionState) this.this$0).currentAnimation = seekingAnimationState;
                                }
                            }
                            SeekableTransitionState<S> seekableTransitionState4 = this.this$0;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 4;
                            runAnimations = seekableTransitionState4.runAnimations(this);
                        }
                        return w01.a;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        this.this$0.setFraction(0.0f);
                        return w01.a;
                    }
                    p10.Q(obj);
                    this.this$0.setCurrentState$animation_core(this.$targetState);
                    SeekableTransitionState<S> seekableTransitionState5 = this.this$0;
                    this.label = 5;
                    waitForComposition = seekableTransitionState5.waitForComposition(this);
                }
                Object composedTargetState$animation_core = seekableTransitionState.getComposedTargetState$animation_core();
                ((ob0) obj2).f(null);
                if (!q10.b(this.$targetState, composedTargetState$animation_core)) {
                    SeekableTransitionState<S> seekableTransitionState6 = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                    doOneFrame = seekableTransitionState6.doOneFrame(this);
                }
                if (!q10.b(this.this$0.getCurrentState(), this.$targetState)) {
                }
                return w01.a;
            } catch (Throwable th) {
                ((ob0) obj2).f(null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$animateTo$2(Transition<S> transition, SeekableTransitionState<S> seekableTransitionState, S s, FiniteAnimationSpec<Float> finiteAnimationSpec, hm hmVar) {
        super(1, hmVar);
        this.$transition = transition;
        this.this$0 = seekableTransitionState;
        this.$targetState = s;
        this.$animationSpec = finiteAnimationSpec;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new SeekableTransitionState$animateTo$2(this.$transition, this.this$0, this.$targetState, this.$animationSpec, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((SeekableTransitionState$animateTo$2) create(hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$targetState, this.$transition, this.$animationSpec, null);
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
        this.$transition.onTransitionEnd$animation_core();
        return w01.a;
    }
}
