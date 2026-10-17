package androidx.compose.animation.core;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import defpackage.ac;
import defpackage.d41;
import defpackage.dq;
import defpackage.fg;
import defpackage.gg;
import defpackage.hm;
import defpackage.hm0;
import defpackage.iy;
import defpackage.k10;
import defpackage.ky;
import defpackage.lb0;
import defpackage.o;
import defpackage.ob0;
import defpackage.p10;
import defpackage.q10;
import defpackage.vn;
import defpackage.w01;
import defpackage.xa0;
import defpackage.y80;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SeekableTransitionState<S> extends TransitionState<S> {
    private final ky animateOneFrameLambda;
    private S composedTargetState;
    private fg compositionContinuation;
    private final lb0 compositionContinuationMutex;
    private SeekingAnimationState currentAnimation;
    private final MutableState currentState$delegate;
    private float durationScale;
    private final ky firstFrameLambda;
    private final MutableFloatState fraction$delegate;
    private final xa0 initialValueAnimations;
    private long lastFrameTimeNanos;
    private final MutatorMutex mutatorMutex;
    private final iy recalculateTotalDurationNanos;
    private final MutableState targetState$delegate;
    private long totalDurationNanos;
    private Transition<S> transition;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final AnimationVector1D ZeroVelocity = new AnimationVector1D(0.0f);
    private static final AnimationVector1D Target1 = new AnimationVector1D(1.0f);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SeekingAnimationState {
        public static final int $stable = 8;
        private VectorizedAnimationSpec<AnimationVector1D> animationSpec;
        private long animationSpecDuration;
        private long durationNanos;
        private AnimationVector1D initialVelocity;
        private boolean isComplete;
        private long progressNanos;
        private AnimationVector1D start = new AnimationVector1D(0.0f);
        private float value;

        public final VectorizedAnimationSpec<AnimationVector1D> getAnimationSpec() {
            return this.animationSpec;
        }

        public final long getAnimationSpecDuration() {
            return this.animationSpecDuration;
        }

        public final long getDurationNanos() {
            return this.durationNanos;
        }

        public final AnimationVector1D getInitialVelocity() {
            return this.initialVelocity;
        }

        public final long getProgressNanos() {
            return this.progressNanos;
        }

        public final AnimationVector1D getStart() {
            return this.start;
        }

        public final float getValue() {
            return this.value;
        }

        public final boolean isComplete() {
            return this.isComplete;
        }

        public final void setAnimationSpec(VectorizedAnimationSpec<AnimationVector1D> vectorizedAnimationSpec) {
            this.animationSpec = vectorizedAnimationSpec;
        }

        public final void setAnimationSpecDuration(long j) {
            this.animationSpecDuration = j;
        }

        public final void setComplete(boolean z) {
            this.isComplete = z;
        }

        public final void setDurationNanos(long j) {
            this.durationNanos = j;
        }

        public final void setInitialVelocity(AnimationVector1D animationVector1D) {
            this.initialVelocity = animationVector1D;
        }

        public final void setProgressNanos(long j) {
            this.progressNanos = j;
        }

        public final void setStart(AnimationVector1D animationVector1D) {
            this.start = animationVector1D;
        }

        public final void setValue(float f) {
            this.value = f;
        }

        public String toString() {
            return "progress nanos: " + this.progressNanos + ", animationSpec: " + this.animationSpec + ", isComplete: " + this.isComplete + ", value: " + this.value + ", start: " + this.start + ", initialVelocity: " + this.initialVelocity + ", durationNanos: " + this.durationNanos + ", animationSpecDuration: " + this.animationSpecDuration;
        }
    }

    public SeekableTransitionState(S s) {
        super(null);
        this.targetState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s, null, 2, null);
        this.currentState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s, null, 2, null);
        this.composedTargetState = s;
        this.recalculateTotalDurationNanos = new hm0(this, 2);
        this.fraction$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.compositionContinuationMutex = new ob0();
        this.mutatorMutex = new MutatorMutex();
        this.lastFrameTimeNanos = Long.MIN_VALUE;
        this.initialValueAnimations = new xa0();
        final int i = 0;
        this.firstFrameLambda = new ky(this) { // from class: cn0
            public final /* synthetic */ SeekableTransitionState e;

            {
                this.e = this;
            }

            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 firstFrameLambda$lambda$0;
                w01 animateOneFrameLambda$lambda$0;
                int i2 = i;
                SeekableTransitionState seekableTransitionState = this.e;
                Long l = (Long) obj;
                switch (i2) {
                    case 0:
                        firstFrameLambda$lambda$0 = SeekableTransitionState.firstFrameLambda$lambda$0(seekableTransitionState, l.longValue());
                        return firstFrameLambda$lambda$0;
                    default:
                        animateOneFrameLambda$lambda$0 = SeekableTransitionState.animateOneFrameLambda$lambda$0(seekableTransitionState, l.longValue());
                        return animateOneFrameLambda$lambda$0;
                }
            }
        };
        final int i2 = 1;
        this.animateOneFrameLambda = new ky(this) { // from class: cn0
            public final /* synthetic */ SeekableTransitionState e;

            {
                this.e = this;
            }

            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 firstFrameLambda$lambda$0;
                w01 animateOneFrameLambda$lambda$0;
                int i22 = i2;
                SeekableTransitionState seekableTransitionState = this.e;
                Long l = (Long) obj;
                switch (i22) {
                    case 0:
                        firstFrameLambda$lambda$0 = SeekableTransitionState.firstFrameLambda$lambda$0(seekableTransitionState, l.longValue());
                        return firstFrameLambda$lambda$0;
                    default:
                        animateOneFrameLambda$lambda$0 = SeekableTransitionState.animateOneFrameLambda$lambda$0(seekableTransitionState, l.longValue());
                        return animateOneFrameLambda$lambda$0;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateOneFrame(hm hmVar) {
        float durationScale = SuspendAnimationKt.getDurationScale(hmVar.getContext());
        w01 w01Var = w01.a;
        if (durationScale <= 0.0f) {
            endAllAnimations();
            return w01Var;
        }
        this.durationScale = durationScale;
        Object withFrameNanos = MonotonicFrameClockKt.withFrameNanos(this.animateOneFrameLambda, hmVar);
        return withFrameNanos == vn.d ? withFrameNanos : w01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animateOneFrameLambda$lambda$0(SeekableTransitionState seekableTransitionState, long j) {
        long j2 = j - seekableTransitionState.lastFrameTimeNanos;
        seekableTransitionState.lastFrameTimeNanos = j;
        long Q = y80.Q(j2 / seekableTransitionState.durationScale);
        if (seekableTransitionState.initialValueAnimations.e()) {
            xa0 xa0Var = seekableTransitionState.initialValueAnimations;
            Object[] objArr = xa0Var.a;
            int i = xa0Var.b;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                SeekingAnimationState seekingAnimationState = (SeekingAnimationState) objArr[i3];
                seekableTransitionState.recalculateAnimationValue(seekingAnimationState, Q);
                seekingAnimationState.setComplete(true);
            }
            Transition<S> transition = seekableTransitionState.transition;
            if (transition != null) {
                transition.updateInitialValues$animation_core();
            }
            xa0 xa0Var2 = seekableTransitionState.initialValueAnimations;
            int i4 = xa0Var2.b;
            Object[] objArr2 = xa0Var2.a;
            k10 W = y80.W(0, i4);
            int i5 = W.d;
            int i6 = W.e;
            if (i5 <= i6) {
                while (true) {
                    objArr2[i5 - i2] = objArr2[i5];
                    if (((SeekingAnimationState) objArr2[i5]).isComplete()) {
                        i2++;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5++;
                }
            }
            ac.X(objArr2, i4 - i2, i4, null);
            xa0Var2.b -= i2;
        }
        SeekingAnimationState seekingAnimationState2 = seekableTransitionState.currentAnimation;
        if (seekingAnimationState2 != null) {
            seekingAnimationState2.setDurationNanos(seekableTransitionState.totalDurationNanos);
            seekableTransitionState.recalculateAnimationValue(seekingAnimationState2, Q);
            seekableTransitionState.setFraction(seekingAnimationState2.getValue());
            if (seekingAnimationState2.getValue() == 1.0f) {
                seekableTransitionState.currentAnimation = null;
            }
            seekableTransitionState.seekToFraction();
        }
        return w01.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(SeekableTransitionState seekableTransitionState, Object obj, FiniteAnimationSpec finiteAnimationSpec, hm hmVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = seekableTransitionState.getTargetState();
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec = null;
        }
        return seekableTransitionState.animateTo(obj, finiteAnimationSpec, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doOneFrame(hm hmVar) {
        long j = this.lastFrameTimeNanos;
        vn vnVar = vn.d;
        w01 w01Var = w01.a;
        if (j == Long.MIN_VALUE) {
            Object withFrameNanos = MonotonicFrameClockKt.withFrameNanos(this.firstFrameLambda, hmVar);
            return withFrameNanos == vnVar ? withFrameNanos : w01Var;
        }
        Object animateOneFrame = animateOneFrame(hmVar);
        return animateOneFrame == vnVar ? animateOneFrame : w01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAllAnimations() {
        Transition<S> transition = this.transition;
        if (transition != null) {
            transition.clearInitialAnimations$animation_core();
        }
        this.initialValueAnimations.j();
        if (this.currentAnimation != null) {
            this.currentAnimation = null;
            setFraction(1.0f);
            seekToFraction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 firstFrameLambda$lambda$0(SeekableTransitionState seekableTransitionState, long j) {
        seekableTransitionState.lastFrameTimeNanos = j;
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveAnimationToInitialState() {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        SeekingAnimationState seekingAnimationState = this.currentAnimation;
        if (seekingAnimationState == null) {
            if (this.totalDurationNanos <= 0 || getFraction() == 1.0f || q10.b(getCurrentState(), getTargetState())) {
                seekingAnimationState = null;
            } else {
                seekingAnimationState = new SeekingAnimationState();
                seekingAnimationState.setValue(getFraction());
                long j = this.totalDurationNanos;
                seekingAnimationState.setDurationNanos(j);
                seekingAnimationState.setAnimationSpecDuration(y80.Q((1.0d - getFraction()) * j));
                seekingAnimationState.getStart().set$animation_core(0, getFraction());
            }
        }
        if (seekingAnimationState != null) {
            seekingAnimationState.setDurationNanos(this.totalDurationNanos);
            this.initialValueAnimations.g(seekingAnimationState);
            transition.setInitialAnimations$animation_core(seekingAnimationState);
        }
        this.currentAnimation = null;
    }

    private final void recalculateAnimationValue(SeekingAnimationState seekingAnimationState, long j) {
        long progressNanos = seekingAnimationState.getProgressNanos() + j;
        seekingAnimationState.setProgressNanos(progressNanos);
        long animationSpecDuration = seekingAnimationState.getAnimationSpecDuration();
        if (progressNanos >= animationSpecDuration) {
            seekingAnimationState.setValue(1.0f);
            return;
        }
        VectorizedAnimationSpec<AnimationVector1D> animationSpec = seekingAnimationState.getAnimationSpec();
        if (animationSpec == null) {
            float f = progressNanos / animationSpecDuration;
            seekingAnimationState.setValue((f * 1.0f) + ((1.0f - f) * seekingAnimationState.getStart().get$animation_core(0)));
            return;
        }
        AnimationVector1D start = seekingAnimationState.getStart();
        AnimationVector1D animationVector1D = Target1;
        AnimationVector1D initialVelocity = seekingAnimationState.getInitialVelocity();
        if (initialVelocity == null) {
            initialVelocity = ZeroVelocity;
        }
        seekingAnimationState.setValue(y80.g(animationSpec.getValueFromNanos(progressNanos, start, animationVector1D, initialVelocity).get$animation_core(0), 0.0f, 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 recalculateTotalDurationNanos$lambda$0(SeekableTransitionState seekableTransitionState) {
        Transition<S> transition = seekableTransitionState.transition;
        seekableTransitionState.totalDurationNanos = transition != null ? transition.getTotalDurationNanos() : 0L;
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r11, r0) == r7) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runAnimations(hm hmVar) {
        SeekableTransitionState$runAnimations$1 seekableTransitionState$runAnimations$1;
        int i;
        vn vnVar;
        if (hmVar instanceof SeekableTransitionState$runAnimations$1) {
            seekableTransitionState$runAnimations$1 = (SeekableTransitionState$runAnimations$1) hmVar;
            int i2 = seekableTransitionState$runAnimations$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                seekableTransitionState$runAnimations$1.label = i2 - Integer.MIN_VALUE;
                Object obj = seekableTransitionState$runAnimations$1.result;
                i = seekableTransitionState$runAnimations$1.label;
                w01 w01Var = w01.a;
                vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    if (this.initialValueAnimations.d() && this.currentAnimation == null) {
                        return w01Var;
                    }
                    if (SuspendAnimationKt.getDurationScale(seekableTransitionState$runAnimations$1.getContext()) == 0.0f) {
                        endAllAnimations();
                        this.lastFrameTimeNanos = Long.MIN_VALUE;
                        return w01Var;
                    }
                    if (this.lastFrameTimeNanos == Long.MIN_VALUE) {
                        ky kyVar = this.firstFrameLambda;
                        seekableTransitionState$runAnimations$1.label = 1;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                do {
                    if (this.initialValueAnimations.e() && this.currentAnimation == null) {
                        this.lastFrameTimeNanos = Long.MIN_VALUE;
                        return w01Var;
                    }
                    seekableTransitionState$runAnimations$1.label = 2;
                } while (animateOneFrame(seekableTransitionState$runAnimations$1) != vnVar);
                return vnVar;
            }
        }
        seekableTransitionState$runAnimations$1 = new SeekableTransitionState$runAnimations$1(this, hmVar);
        Object obj2 = seekableTransitionState$runAnimations$1.result;
        i = seekableTransitionState$runAnimations$1.label;
        w01 w01Var2 = w01.a;
        vnVar = vn.d;
        if (i != 0) {
        }
        do {
            if (this.initialValueAnimations.e()) {
            }
            seekableTransitionState$runAnimations$1.label = 2;
        } while (animateOneFrame(seekableTransitionState$runAnimations$1) != vnVar);
        return vnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object seekTo$default(SeekableTransitionState seekableTransitionState, float f, Object obj, hm hmVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = seekableTransitionState.getTargetState();
        }
        return seekableTransitionState.seekTo(f, obj, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void seekToFraction() {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        transition.seekAnimations$animation_core(y80.Q(getFraction() * transition.getTotalDurationNanos()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFraction(float f) {
        this.fraction$delegate.setFloatValue(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (((defpackage.ob0) r1).d(r0) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitForComposition(hm hmVar) {
        SeekableTransitionState$waitForComposition$1 seekableTransitionState$waitForComposition$1;
        int i;
        vn vnVar;
        Object targetState;
        Object s;
        Object obj;
        if (hmVar instanceof SeekableTransitionState$waitForComposition$1) {
            seekableTransitionState$waitForComposition$1 = (SeekableTransitionState$waitForComposition$1) hmVar;
            int i2 = seekableTransitionState$waitForComposition$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                seekableTransitionState$waitForComposition$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = seekableTransitionState$waitForComposition$1.result;
                i = seekableTransitionState$waitForComposition$1.label;
                vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj2);
                    targetState = getTargetState();
                    lb0 lb0Var = this.compositionContinuationMutex;
                    seekableTransitionState$waitForComposition$1.L$0 = targetState;
                    seekableTransitionState$waitForComposition$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = seekableTransitionState$waitForComposition$1.L$0;
                        p10.Q(obj2);
                        if (!q10.b(obj2, obj)) {
                            return w01.a;
                        }
                        this.lastFrameTimeNanos = Long.MIN_VALUE;
                        throw new CancellationException("targetState while waiting for composition");
                    }
                    Object obj3 = seekableTransitionState$waitForComposition$1.L$0;
                    p10.Q(obj2);
                    targetState = obj3;
                }
                seekableTransitionState$waitForComposition$1.L$0 = targetState;
                seekableTransitionState$waitForComposition$1.label = 2;
                gg ggVar = new gg(1, d41.C(seekableTransitionState$waitForComposition$1));
                ggVar.u();
                setCompositionContinuation$animation_core(ggVar);
                ((ob0) getCompositionContinuationMutex$animation_core()).f(null);
                s = ggVar.s();
                if (s != vnVar) {
                    obj = targetState;
                    obj2 = s;
                    if (!q10.b(obj2, obj)) {
                    }
                }
                return vnVar;
            }
        }
        seekableTransitionState$waitForComposition$1 = new SeekableTransitionState$waitForComposition$1(this, hmVar);
        Object obj22 = seekableTransitionState$waitForComposition$1.result;
        i = seekableTransitionState$waitForComposition$1.label;
        vnVar = vn.d;
        if (i != 0) {
        }
        seekableTransitionState$waitForComposition$1.L$0 = targetState;
        seekableTransitionState$waitForComposition$1.label = 2;
        gg ggVar2 = new gg(1, d41.C(seekableTransitionState$waitForComposition$1));
        ggVar2.u();
        setCompositionContinuation$animation_core(ggVar2);
        ((ob0) getCompositionContinuationMutex$animation_core()).f(null);
        s = ggVar2.s();
        if (s != vnVar) {
        }
        return vnVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (((defpackage.ob0) r1).d(r0) == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitForCompositionAfterTargetStateChange(hm hmVar) {
        SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 seekableTransitionState$waitForCompositionAfterTargetStateChange$1;
        int i;
        Object targetState;
        Object obj;
        if (hmVar instanceof SeekableTransitionState$waitForCompositionAfterTargetStateChange$1) {
            seekableTransitionState$waitForCompositionAfterTargetStateChange$1 = (SeekableTransitionState$waitForCompositionAfterTargetStateChange$1) hmVar;
            int i2 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.result;
                i = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label;
                vn vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj2);
                    targetState = getTargetState();
                    lb0 lb0Var = this.compositionContinuationMutex;
                    seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$0 = targetState;
                    seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$0;
                        p10.Q(obj2);
                        if (!q10.b(obj2, obj)) {
                            this.lastFrameTimeNanos = Long.MIN_VALUE;
                            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                        }
                        return w01.a;
                    }
                    Object obj3 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$0;
                    p10.Q(obj2);
                    targetState = obj3;
                }
                if (!q10.b(targetState, this.composedTargetState)) {
                    ((ob0) this.compositionContinuationMutex).f(null);
                    return w01.a;
                }
                seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$0 = targetState;
                seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label = 2;
                gg ggVar = new gg(1, d41.C(seekableTransitionState$waitForCompositionAfterTargetStateChange$1));
                ggVar.u();
                setCompositionContinuation$animation_core(ggVar);
                ((ob0) getCompositionContinuationMutex$animation_core()).f(null);
                Object s = ggVar.s();
                if (s != vnVar) {
                    obj = targetState;
                    obj2 = s;
                    if (!q10.b(obj2, obj)) {
                    }
                    return w01.a;
                }
                return vnVar;
            }
        }
        seekableTransitionState$waitForCompositionAfterTargetStateChange$1 = new SeekableTransitionState$waitForCompositionAfterTargetStateChange$1(this, hmVar);
        Object obj22 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.result;
        i = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label;
        vn vnVar2 = vn.d;
        if (i != 0) {
        }
        if (!q10.b(targetState, this.composedTargetState)) {
        }
    }

    public final Object animateTo(S s, FiniteAnimationSpec<Float> finiteAnimationSpec, hm hmVar) {
        Transition<S> transition = this.transition;
        w01 w01Var = w01.a;
        if (transition == null) {
            return w01Var;
        }
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new SeekableTransitionState$animateTo$2(transition, this, s, finiteAnimationSpec, null), hmVar, 1, null);
        return mutate$default == vn.d ? mutate$default : w01Var;
    }

    public final S getComposedTargetState$animation_core() {
        return this.composedTargetState;
    }

    public final fg getCompositionContinuation$animation_core() {
        return this.compositionContinuation;
    }

    public final lb0 getCompositionContinuationMutex$animation_core() {
        return this.compositionContinuationMutex;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getCurrentState() {
        return (S) this.currentState$delegate.getValue();
    }

    public final float getFraction() {
        return this.fraction$delegate.getFloatValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final long getTotalDurationNanos$animation_core() {
        return this.totalDurationNanos;
    }

    public final void observeTotalDuration$animation_core() {
        ky kyVar;
        SnapshotStateObserver seekableStateObserver = TransitionKt.getSeekableStateObserver();
        kyVar = TransitionKt.SeekableTransitionStateTotalDurationChanged;
        seekableStateObserver.observeReads(this, kyVar, this.recalculateTotalDurationNanos);
    }

    public final void onTotalDurationChanged$animation_core() {
        long j = this.totalDurationNanos;
        observeTotalDuration$animation_core();
        long j2 = this.totalDurationNanos;
        if (j != j2) {
            SeekingAnimationState seekingAnimationState = this.currentAnimation;
            if (seekingAnimationState == null) {
                if (j2 != 0) {
                    seekToFraction();
                    return;
                }
                return;
            }
            long progressNanos = seekingAnimationState.getProgressNanos();
            long j3 = this.totalDurationNanos;
            if (progressNanos > j3) {
                endAllAnimations();
                return;
            }
            seekingAnimationState.setDurationNanos(j3);
            if (seekingAnimationState.getAnimationSpec() == null) {
                seekingAnimationState.setAnimationSpecDuration(y80.Q((1.0d - seekingAnimationState.getStart().get$animation_core(0)) * this.totalDurationNanos));
            }
        }
    }

    public final Object seekTo(float f, S s, hm hmVar) {
        boolean z = false;
        if (0.0f <= f && f <= 1.0f) {
            z = true;
        }
        if (!z) {
            PreconditionsKt.throwIllegalArgumentException("Expecting fraction between 0 and 1. Got " + f);
        }
        Transition<S> transition = this.transition;
        w01 w01Var = w01.a;
        if (transition == null) {
            return w01Var;
        }
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new SeekableTransitionState$seekTo$3(s, getTargetState(), this, transition, f, null), hmVar, 1, null);
        return mutate$default == vn.d ? mutate$default : w01Var;
    }

    public final void setComposedTargetState$animation_core(S s) {
        this.composedTargetState = s;
    }

    public final void setCompositionContinuation$animation_core(fg fgVar) {
        this.compositionContinuation = fgVar;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setCurrentState$animation_core(S s) {
        this.currentState$delegate.setValue(s);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setTargetState$animation_core(S s) {
        this.targetState$delegate.setValue(s);
    }

    public final void setTotalDurationNanos$animation_core(long j) {
        this.totalDurationNanos = j;
    }

    public final Object snapTo(S s, hm hmVar) {
        Transition<S> transition = this.transition;
        w01 w01Var = w01.a;
        if (transition == null) {
            return w01Var;
        }
        if (q10.b(getCurrentState(), s) && q10.b(getTargetState(), s)) {
            return w01Var;
        }
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new SeekableTransitionState$snapTo$2(this, s, transition, null), hmVar, 1, null);
        return mutate$default == vn.d ? mutate$default : w01Var;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core(Transition<S> transition) {
        Transition<S> transition2 = this.transition;
        if (!(transition2 == null || q10.b(transition, transition2))) {
            PreconditionsKt.throwIllegalStateException("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.transition + ", new instance: " + transition);
        }
        this.transition = transition;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionRemoved$animation_core() {
        this.transition = null;
        TransitionKt.getSeekableStateObserver().clear(this);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final AnimationVector1D getTarget1() {
            return SeekableTransitionState.Target1;
        }

        public final AnimationVector1D getZeroVelocity() {
            return SeekableTransitionState.ZeroVelocity;
        }

        private Companion() {
        }
    }
}
