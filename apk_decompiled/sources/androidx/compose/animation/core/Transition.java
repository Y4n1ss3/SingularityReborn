package androidx.compose.animation.core;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.dq;
import defpackage.iw0;
import defpackage.ky;
import defpackage.p01;
import defpackage.q10;
import defpackage.st;
import defpackage.te0;
import defpackage.un;
import defpackage.vv0;
import defpackage.w01;
import defpackage.xn;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Transition<S> {
    public static final int $stable = 0;
    private final SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> _animations;
    private final MutableLongState _playTimeNanos$delegate;
    private final SnapshotStateList<Transition<?>> _transitions;
    private final MutableState isSeeking$delegate;
    private final String label;
    private long lastSeekedTimeNanos;
    private final Transition<?> parentTransition;
    private final MutableState segment$delegate;
    private final MutableLongState startTimeNanos$delegate;
    private final MutableState targetState$delegate;
    private final State totalDurationNanos$delegate;
    private final TransitionState<S> transitionState;
    private final MutableState updateChildrenNeeded$delegate;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class DeferredAnimation<T, V extends AnimationVector> {
        private final MutableState data$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        private final String label;
        private final TwoWayConverter<T, V> typeConverter;

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {
            private final Transition<S>.TransitionAnimationState<T, V> animation;
            private ky targetValueByState;
            private ky transitionSpec;

            public DeferredAnimationData(Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, ky kyVar, ky kyVar2) {
                this.animation = transitionAnimationState;
                this.transitionSpec = kyVar;
                this.targetValueByState = kyVar2;
            }

            public final Transition<S>.TransitionAnimationState<T, V> getAnimation() {
                return this.animation;
            }

            public final ky getTargetValueByState() {
                return this.targetValueByState;
            }

            public final ky getTransitionSpec() {
                return this.transitionSpec;
            }

            @Override // androidx.compose.runtime.State
            public T getValue() {
                updateAnimationStates(Transition.this.getSegment());
                return this.animation.getValue();
            }

            public final void setTargetValueByState(ky kyVar) {
                this.targetValueByState = kyVar;
            }

            public final void setTransitionSpec(ky kyVar) {
                this.transitionSpec = kyVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void updateAnimationStates(Segment<S> segment) {
                Object invoke = this.targetValueByState.invoke(segment.getTargetState());
                if (!Transition.this.isSeeking()) {
                    this.animation.updateTargetValue$animation_core(invoke, (FiniteAnimationSpec) this.transitionSpec.invoke(segment));
                } else {
                    this.animation.updateInitialAndTargetValue$animation_core(this.targetValueByState.invoke(segment.getInitialState()), invoke, (FiniteAnimationSpec) this.transitionSpec.invoke(segment));
                }
            }
        }

        public DeferredAnimation(TwoWayConverter<T, V> twoWayConverter, String str) {
            this.typeConverter = twoWayConverter;
            this.label = str;
        }

        public final State<T> animate(ky kyVar, ky kyVar2) {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core = getData$animation_core();
            if (data$animation_core == null) {
                Transition<S> transition = Transition.this;
                data$animation_core = new DeferredAnimationData<>(transition.new TransitionAnimationState(kyVar2.invoke(transition.getCurrentState()), AnimationStateKt.createZeroVectorFrom(this.typeConverter, kyVar2.invoke(Transition.this.getCurrentState())), this.typeConverter, this.label), kyVar, kyVar2);
                Transition<S> transition2 = Transition.this;
                setData$animation_core(data$animation_core);
                transition2.addAnimation$animation_core(data$animation_core.getAnimation());
            }
            Transition<S> transition3 = Transition.this;
            data$animation_core.setTargetValueByState(kyVar2);
            data$animation_core.setTransitionSpec(kyVar);
            data$animation_core.updateAnimationStates(transition3.getSegment());
            return data$animation_core;
        }

        public final Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> getData$animation_core() {
            return (DeferredAnimationData) this.data$delegate.getValue();
        }

        public final String getLabel() {
            return this.label;
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final void setData$animation_core(Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData) {
            this.data$delegate.setValue(deferredAnimationData);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void setupSeeking$animation_core() {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core = getData$animation_core();
            if (data$animation_core != null) {
                Transition<S> transition = Transition.this;
                data$animation_core.getAnimation().updateInitialAndTargetValue$animation_core(data$animation_core.getTargetValueByState().invoke(transition.getSegment().getInitialState()), data$animation_core.getTargetValueByState().invoke(transition.getSegment().getTargetState()), (FiniteAnimationSpec) data$animation_core.getTransitionSpec().invoke(transition.getSegment()));
            }
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface Segment<S> {

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class DefaultImpls {
            @Deprecated
            public static <S> boolean isTransitioningTo(Segment<S> segment, S s, S s2) {
                return Segment.super.isTransitioningTo(s, s2);
            }
        }

        S getInitialState();

        S getTargetState();

        default boolean isTransitioningTo(S s, S s2) {
            return q10.b(s, getInitialState()) && q10.b(s2, getTargetState());
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SegmentImpl<S> implements Segment<S> {
        private final S initialState;
        private final S targetState;

        public SegmentImpl(S s, S s2) {
            this.initialState = s;
            this.targetState = s2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Segment)) {
                return false;
            }
            Segment segment = (Segment) obj;
            return q10.b(getInitialState(), segment.getInitialState()) && q10.b(getTargetState(), segment.getTargetState());
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getInitialState() {
            return this.initialState;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getTargetState() {
            return this.targetState;
        }

        public int hashCode() {
            S initialState = getInitialState();
            int hashCode = (initialState != null ? initialState.hashCode() : 0) * 31;
            S targetState = getTargetState();
            return hashCode + (targetState != null ? targetState.hashCode() : 0);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        private final MutableState animation$delegate;
        private final MutableState animationSpec$delegate;
        private final SpringSpec<T> defaultSpring;
        private final MutableLongState durationNanos$delegate;
        private TargetBasedAnimation<T, V> initialValueAnimation;
        private SeekableTransitionState.SeekingAnimationState initialValueState;
        private final FiniteAnimationSpec<T> interruptionSpec;
        private final MutableState isFinished$delegate;
        private boolean isSeeking;
        private final String label;
        private final MutableFloatState resetSnapValue$delegate;
        private final MutableState targetValue$delegate;
        private final TwoWayConverter<T, V> typeConverter;
        private boolean useOnlyInitialValue;
        private final MutableState value$delegate;
        private V velocityVector;

        public TransitionAnimationState(T t, V v, TwoWayConverter<T, V> twoWayConverter, String str) {
            Object obj;
            this.typeConverter = twoWayConverter;
            this.label = str;
            this.targetValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            SpringSpec<T> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            this.defaultSpring = spring$default;
            this.animationSpec$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(spring$default, null, 2, null);
            this.animation$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TargetBasedAnimation(getAnimationSpec(), twoWayConverter, t, getTargetValue(), v), null, 2, null);
            this.isFinished$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            this.resetSnapValue$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(-1.0f);
            this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            this.velocityVector = v;
            this.durationNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(getAnimation().getDurationNanos());
            Float f = VisibilityThresholdsKt.getVisibilityThresholdMap().get(twoWayConverter);
            if (f != null) {
                float floatValue = f.floatValue();
                AnimationVector animationVector = (AnimationVector) twoWayConverter.getConvertToVector().invoke(t);
                int size$animation_core = animationVector.getSize$animation_core();
                for (int i = 0; i < size$animation_core; i++) {
                    animationVector.set$animation_core(i, floatValue);
                }
                obj = this.typeConverter.getConvertFromVector().invoke(animationVector);
            } else {
                obj = null;
            }
            this.interruptionSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, obj, 3, null);
        }

        private final T getTargetValue() {
            return this.targetValue$delegate.getValue();
        }

        private final void setAnimation(TargetBasedAnimation<T, V> targetBasedAnimation) {
            this.animation$delegate.setValue(targetBasedAnimation);
        }

        private final void setAnimationSpec(FiniteAnimationSpec<T> finiteAnimationSpec) {
            this.animationSpec$delegate.setValue(finiteAnimationSpec);
        }

        private final void setTargetValue(T t) {
            this.targetValue$delegate.setValue(t);
        }

        private final void updateAnimation(T t, boolean z) {
            TargetBasedAnimation<T, V> targetBasedAnimation = this.initialValueAnimation;
            if (q10.b(targetBasedAnimation != null ? targetBasedAnimation.getTargetValue() : null, getTargetValue())) {
                setAnimation(new TargetBasedAnimation<>(this.interruptionSpec, this.typeConverter, t, t, AnimationVectorsKt.newInstance(this.velocityVector)));
                this.useOnlyInitialValue = true;
                setDurationNanos$animation_core(getAnimation().getDurationNanos());
                return;
            }
            AnimationSpec animationSpec = (!z || this.isSeeking) ? getAnimationSpec() : getAnimationSpec() instanceof SpringSpec ? getAnimationSpec() : this.interruptionSpec;
            if (Transition.this.getPlayTimeNanos() > 0) {
                animationSpec = AnimationSpecKt.delayed(animationSpec, Transition.this.getPlayTimeNanos());
            }
            setAnimation(new TargetBasedAnimation<>(animationSpec, this.typeConverter, t, getTargetValue(), this.velocityVector));
            setDurationNanos$animation_core(getAnimation().getDurationNanos());
            this.useOnlyInitialValue = false;
            Transition.this.onChildAnimationUpdated();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void updateAnimation$default(TransitionAnimationState transitionAnimationState, Object obj, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = transitionAnimationState.getValue();
            }
            if ((i & 2) != 0) {
                z = false;
            }
            transitionAnimationState.updateAnimation(obj, z);
        }

        public final void clearInitialAnimation$animation_core() {
            this.initialValueAnimation = null;
            this.initialValueState = null;
            this.useOnlyInitialValue = false;
        }

        public final TargetBasedAnimation<T, V> getAnimation() {
            return (TargetBasedAnimation) this.animation$delegate.getValue();
        }

        public final FiniteAnimationSpec<T> getAnimationSpec() {
            return (FiniteAnimationSpec) this.animationSpec$delegate.getValue();
        }

        public final long getDurationNanos$animation_core() {
            return this.durationNanos$delegate.getLongValue();
        }

        public final SeekableTransitionState.SeekingAnimationState getInitialValueState$animation_core() {
            return this.initialValueState;
        }

        public final String getLabel() {
            return this.label;
        }

        public final float getResetSnapValue$animation_core() {
            return this.resetSnapValue$delegate.getFloatValue();
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value$delegate.getValue();
        }

        public final boolean isFinished$animation_core() {
            return ((Boolean) this.isFinished$delegate.getValue()).booleanValue();
        }

        public final void onPlayTimeChanged$animation_core(long j, boolean z) {
            if (z) {
                j = getAnimation().getDurationNanos();
            }
            setValue$animation_core(getAnimation().getValueFromNanos(j));
            this.velocityVector = getAnimation().getVelocityVectorFromNanos(j);
            if (getAnimation().isFinishedFromNanos(j)) {
                setFinished$animation_core(true);
            }
        }

        public final void resetAnimation$animation_core() {
            setResetSnapValue$animation_core(-2.0f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void resetAnimationValue$animation_core(float f) {
            if (f != -4.0f && f != -5.0f) {
                setResetSnapValue$animation_core(f);
                return;
            }
            TargetBasedAnimation<T, V> targetBasedAnimation = this.initialValueAnimation;
            if (targetBasedAnimation != null) {
                getAnimation().setMutableInitialValue$animation_core(targetBasedAnimation.getTargetValue());
                this.initialValueState = null;
                this.initialValueAnimation = null;
            }
            Object initialValue = f == -4.0f ? getAnimation().getInitialValue() : getAnimation().getTargetValue();
            getAnimation().setMutableInitialValue$animation_core(initialValue);
            getAnimation().setMutableTargetValue$animation_core(initialValue);
            setValue$animation_core(initialValue);
            setDurationNanos$animation_core(getAnimation().getDurationNanos());
        }

        public final void seekTo$animation_core(long j) {
            if (getResetSnapValue$animation_core() == -1.0f) {
                this.isSeeking = true;
                if (q10.b(getAnimation().getTargetValue(), getAnimation().getInitialValue())) {
                    setValue$animation_core(getAnimation().getTargetValue());
                } else {
                    setValue$animation_core(getAnimation().getValueFromNanos(j));
                    this.velocityVector = getAnimation().getVelocityVectorFromNanos(j);
                }
            }
        }

        public final void setDurationNanos$animation_core(long j) {
            this.durationNanos$delegate.setLongValue(j);
        }

        public final void setFinished$animation_core(boolean z) {
            this.isFinished$delegate.setValue(Boolean.valueOf(z));
        }

        public final void setInitialValueAnimation$animation_core(SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
            if (!q10.b(getAnimation().getTargetValue(), getAnimation().getInitialValue())) {
                this.initialValueAnimation = getAnimation();
                this.initialValueState = seekingAnimationState;
            }
            setAnimation(new TargetBasedAnimation<>(this.interruptionSpec, this.typeConverter, getValue(), getValue(), AnimationVectorsKt.newInstance(this.velocityVector)));
            setDurationNanos$animation_core(getAnimation().getDurationNanos());
            this.useOnlyInitialValue = true;
        }

        public final void setInitialValueState$animation_core(SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
            this.initialValueState = seekingAnimationState;
        }

        public final void setResetSnapValue$animation_core(float f) {
            this.resetSnapValue$delegate.setFloatValue(f);
        }

        public void setValue$animation_core(T t) {
            this.value$delegate.setValue(t);
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + getTargetValue() + ", spec: " + getAnimationSpec();
        }

        public final void updateInitialAndTargetValue$animation_core(T t, T t2, FiniteAnimationSpec<T> finiteAnimationSpec) {
            setTargetValue(t2);
            setAnimationSpec(finiteAnimationSpec);
            if (q10.b(getAnimation().getInitialValue(), t) && q10.b(getAnimation().getTargetValue(), t2)) {
                return;
            }
            updateAnimation$default(this, t, false, 2, null);
        }

        public final void updateInitialValue$animation_core() {
            TargetBasedAnimation<T, V> targetBasedAnimation;
            SeekableTransitionState.SeekingAnimationState seekingAnimationState = this.initialValueState;
            if (seekingAnimationState == null || (targetBasedAnimation = this.initialValueAnimation) == null) {
                return;
            }
            long Q = y80.Q(seekingAnimationState.getDurationNanos() * seekingAnimationState.getValue());
            T valueFromNanos = targetBasedAnimation.getValueFromNanos(Q);
            if (this.useOnlyInitialValue) {
                getAnimation().setMutableTargetValue$animation_core(valueFromNanos);
            }
            getAnimation().setMutableInitialValue$animation_core(valueFromNanos);
            setDurationNanos$animation_core(getAnimation().getDurationNanos());
            if (getResetSnapValue$animation_core() == -2.0f || this.useOnlyInitialValue) {
                setValue$animation_core(valueFromNanos);
            } else {
                seekTo$animation_core(Transition.this.getPlayTimeNanos());
            }
            if (Q < seekingAnimationState.getDurationNanos()) {
                seekingAnimationState.setComplete(false);
            } else {
                this.initialValueState = null;
                this.initialValueAnimation = null;
            }
        }

        public final void updateTargetValue$animation_core(T t, FiniteAnimationSpec<T> finiteAnimationSpec) {
            if (this.useOnlyInitialValue) {
                TargetBasedAnimation<T, V> targetBasedAnimation = this.initialValueAnimation;
                if (q10.b(t, targetBasedAnimation != null ? targetBasedAnimation.getTargetValue() : null)) {
                    return;
                }
            }
            if (q10.b(getTargetValue(), t) && getResetSnapValue$animation_core() == -1.0f) {
                return;
            }
            setTargetValue(t);
            setAnimationSpec(finiteAnimationSpec);
            updateAnimation(getResetSnapValue$animation_core() == -3.0f ? t : getValue(), !isFinished$animation_core());
            setFinished$animation_core(getResetSnapValue$animation_core() == -3.0f);
            if (getResetSnapValue$animation_core() >= 0.0f) {
                setValue$animation_core(getAnimation().getValueFromNanos((long) (getResetSnapValue$animation_core() * getAnimation().getDurationNanos())));
            } else if (getResetSnapValue$animation_core() == -3.0f) {
                setValue$animation_core(t);
            }
            this.useOnlyInitialValue = false;
            setResetSnapValue$animation_core(-1.0f);
        }
    }

    public Transition(TransitionState<S> transitionState, Transition<?> transition, String str) {
        this.transitionState = transitionState;
        this.parentTransition = transition;
        this.label = str;
        this.targetState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getCurrentState(), null, 2, null);
        this.segment$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SegmentImpl(getCurrentState(), getCurrentState()), null, 2, null);
        this._playTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(0L);
        this.startTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.updateChildrenNeeded$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this._animations = SnapshotStateKt.mutableStateListOf();
        this._transitions = SnapshotStateKt.mutableStateListOf();
        this.isSeeking$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.totalDurationNanos$delegate = SnapshotStateKt.derivedStateOf(new iw0(this, 1));
        transitionState.transitionConfigured$animation_core(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean animateTo$lambda$0$0(Transition transition) {
        return !q10.b(transition.getTargetState(), transition.getCurrentState()) || transition.isRunning() || transition.getUpdateChildrenNeeded();
    }

    private static final boolean animateTo$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult animateTo$lambda$2$0(un unVar, Transition transition, DisposableEffectScope disposableEffectScope) {
        p01.t(unVar, null, xn.g, new Transition$animateTo$1$1$1(transition, null), 1);
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.Transition$animateTo$lambda$2$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animateTo$lambda$3(Transition transition, Object obj, int i, Composer composer, int i2) {
        transition.animateTo$animation_core(obj, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long calculateTotalDurationNanos() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, snapshotStateList.get(i).getDurationNanos$animation_core());
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, snapshotStateList2.get(i2).calculateTotalDurationNanos());
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getUpdateChildrenNeeded() {
        return ((Boolean) this.updateChildrenNeeded$delegate.getValue()).booleanValue();
    }

    private final long get_playTimeNanos() {
        return this._playTimeNanos$delegate.getLongValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChildAnimationUpdated() {
        setUpdateChildrenNeeded(true);
        if (isSeeking()) {
            SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
            int size = snapshotStateList.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState = snapshotStateList.get(i);
                j = Math.max(j, transitionAnimationState.getDurationNanos$animation_core());
                transitionAnimationState.seekTo$animation_core(this.lastSeekedTimeNanos);
            }
            setUpdateChildrenNeeded(false);
        }
    }

    private final void setSegment(Segment<S> segment) {
        this.segment$delegate.setValue(segment);
    }

    private final void setUpdateChildrenNeeded(boolean z) {
        this.updateChildrenNeeded$delegate.setValue(Boolean.valueOf(z));
    }

    private final void set_playTimeNanos(long j) {
        this._playTimeNanos$delegate.setLongValue(j);
    }

    public final boolean addAnimation$animation_core(Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState) {
        return this._animations.add(transitionAnimationState);
    }

    public final boolean addTransition$animation_core(Transition<?> transition) {
        return this._transitions.add(transition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void animateTo$animation_core(S s, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(s) : startRestartGroup.changedInstance(s) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        int i3 = 1;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1493585151, i2, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1180)");
            }
            if (isSeeking()) {
                startRestartGroup.startReplaceGroup(416369985);
            } else {
                startRestartGroup.startReplaceGroup(466062241);
                updateTarget$animation_core(s);
                int i4 = i2 & 112;
                Object[] objArr = i4 == 32;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (objArr != false || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = SnapshotStateKt.derivedStateOf(new iw0(this, r5));
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                if (animateTo$lambda$1((State) rememberedValue)) {
                    startRestartGroup.startReplaceGroup(466470356);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    un unVar = (un) rememberedValue2;
                    int i5 = (startRestartGroup.changedInstance(unVar) ? 1 : 0) | (i4 == 32 ? 1 : 0);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (i5 != 0 || rememberedValue3 == companion.getEmpty()) {
                        rememberedValue3 = new te0(19, unVar, this);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    EffectsKt.DisposableEffect(unVar, this, (ky) rememberedValue3, startRestartGroup, i4);
                } else {
                    startRestartGroup.startReplaceGroup(416369985);
                }
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new vv0(this, s, i, i3));
        }
    }

    public final void clearInitialAnimations$animation_core() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).clearInitialAnimation$animation_core();
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).clearInitialAnimations$animation_core();
        }
    }

    public final List<Transition<S>.TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations;
    }

    public final S getCurrentState() {
        return this.transitionState.getCurrentState();
    }

    public final boolean getHasInitialValueAnimations() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            if (snapshotStateList.get(i).getInitialValueState$animation_core() != null) {
                return true;
            }
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (snapshotStateList2.get(i2).getHasInitialValueAnimations()) {
                return true;
            }
        }
        return false;
    }

    public final String getLabel() {
        return this.label;
    }

    public final long getLastSeekedTimeNanos$animation_core() {
        return this.lastSeekedTimeNanos;
    }

    public final Transition<?> getParentTransition() {
        return this.parentTransition;
    }

    public final long getPlayTimeNanos() {
        Transition<?> transition = this.parentTransition;
        return transition != null ? transition.getPlayTimeNanos() : get_playTimeNanos();
    }

    public final Segment<S> getSegment() {
        return (Segment) this.segment$delegate.getValue();
    }

    public final long getStartTimeNanos$animation_core() {
        return this.startTimeNanos$delegate.getLongValue();
    }

    public final S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final long getTotalDurationNanos() {
        return ((Number) this.totalDurationNanos$delegate.getValue()).longValue();
    }

    public final List<Transition<?>> getTransitions() {
        return this._transitions;
    }

    public final boolean isRunning() {
        return getStartTimeNanos$animation_core() != Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isSeeking() {
        return ((Boolean) this.isSeeking$delegate.getValue()).booleanValue();
    }

    public final void onDisposed$animation_core() {
        onTransitionEnd$animation_core();
        this.transitionState.transitionRemoved$animation_core();
    }

    public final void onFrame$animation_core(long j, boolean z) {
        boolean z2 = true;
        if (getStartTimeNanos$animation_core() == Long.MIN_VALUE) {
            onTransitionStart$animation_core(j);
        } else if (!this.transitionState.isRunning$animation_core()) {
            this.transitionState.setRunning$animation_core(true);
        }
        setUpdateChildrenNeeded(false);
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState = snapshotStateList.get(i);
            if (!transitionAnimationState.isFinished$animation_core()) {
                transitionAnimationState.onPlayTimeChanged$animation_core(j, z);
            }
            if (!transitionAnimationState.isFinished$animation_core()) {
                z2 = false;
            }
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Transition<?> transition = snapshotStateList2.get(i2);
            if (!q10.b(transition.getTargetState(), transition.getCurrentState())) {
                transition.onFrame$animation_core(j, z);
            }
            if (!q10.b(transition.getTargetState(), transition.getCurrentState())) {
                z2 = false;
            }
        }
        if (z2) {
            onTransitionEnd$animation_core();
        }
    }

    public final void onTransitionEnd$animation_core() {
        setStartTimeNanos$animation_core(Long.MIN_VALUE);
        TransitionState<S> transitionState = this.transitionState;
        if (transitionState instanceof MutableTransitionState) {
            ((MutableTransitionState) transitionState).setCurrentState$animation_core(getTargetState());
        }
        setPlayTimeNanos(0L);
        this.transitionState.setRunning$animation_core(false);
        SnapshotStateList<Transition<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).onTransitionEnd$animation_core();
        }
    }

    public final void onTransitionStart$animation_core(long j) {
        setStartTimeNanos$animation_core(j);
        this.transitionState.setRunning$animation_core(true);
    }

    public final void removeAnimation$animation_core(Transition<S>.DeferredAnimation<?, ?> deferredAnimation) {
        Transition<S>.TransitionAnimationState<?, ?> animation;
        Transition<S>.DeferredAnimationData<?, V>.DeferredAnimationData<?, ?> data$animation_core = deferredAnimation.getData$animation_core();
        if (data$animation_core == null || (animation = data$animation_core.getAnimation()) == null) {
            return;
        }
        removeAnimation$animation_core(animation);
    }

    public final boolean removeTransition$animation_core(Transition<?> transition) {
        return this._transitions.remove(transition);
    }

    public final void resetAnimationFraction$animation_core(float f) {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).resetAnimationValue$animation_core(f);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).resetAnimationFraction$animation_core(f);
        }
    }

    public final void seek(S s, S s2, long j) {
        setStartTimeNanos$animation_core(Long.MIN_VALUE);
        this.transitionState.setRunning$animation_core(false);
        if (!isSeeking() || !q10.b(getCurrentState(), s) || !q10.b(getTargetState(), s2)) {
            if (!q10.b(getCurrentState(), s)) {
                TransitionState<S> transitionState = this.transitionState;
                if (transitionState instanceof MutableTransitionState) {
                    ((MutableTransitionState) transitionState).setCurrentState$animation_core(s);
                }
            }
            setTargetState$animation_core(s2);
            setSeeking$animation_core(true);
            setSegment(new SegmentImpl(s, s2));
        }
        SnapshotStateList<Transition<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            Transition<?> transition = snapshotStateList.get(i);
            transition.getClass();
            if (transition.isSeeking()) {
                transition.seek(transition.getCurrentState(), transition.getTargetState(), j);
            }
        }
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList2 = this._animations;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).seekTo$animation_core(j);
        }
        this.lastSeekedTimeNanos = j;
    }

    public final void seekAnimations$animation_core(long j) {
        if (getStartTimeNanos$animation_core() == Long.MIN_VALUE) {
            setStartTimeNanos$animation_core(j);
        }
        setPlayTimeNanos(j);
        setUpdateChildrenNeeded(false);
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).seekTo$animation_core(j);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Transition<?> transition = snapshotStateList2.get(i2);
            if (!q10.b(transition.getTargetState(), transition.getCurrentState())) {
                transition.seekAnimations$animation_core(j);
            }
        }
    }

    public final void setInitialAnimations$animation_core(SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).setInitialValueAnimation$animation_core(seekingAnimationState);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).setInitialAnimations$animation_core(seekingAnimationState);
        }
    }

    public final void setLastSeekedTimeNanos$animation_core(long j) {
        this.lastSeekedTimeNanos = j;
    }

    public final void setPlayTimeNanos(long j) {
        if (this.parentTransition == null) {
            set_playTimeNanos(j);
        }
    }

    public final void setSeeking$animation_core(boolean z) {
        this.isSeeking$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setStartTimeNanos$animation_core(long j) {
        this.startTimeNanos$delegate.setLongValue(j);
    }

    public final void setTargetState$animation_core(S s) {
        this.targetState$delegate.setValue(s);
    }

    public String toString() {
        List<Transition<S>.TransitionAnimationState<?, ?>> animations = getAnimations();
        int size = animations.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + animations.get(i) + ", ";
        }
        return str;
    }

    public final void updateInitialValues$animation_core() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).updateInitialValue$animation_core();
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).updateInitialValues$animation_core();
        }
    }

    public final void updateTarget$animation_core(S s) {
        if (q10.b(getTargetState(), s)) {
            return;
        }
        setSegment(new SegmentImpl(getTargetState(), s));
        if (!q10.b(getCurrentState(), getTargetState())) {
            this.transitionState.setCurrentState$animation_core(getTargetState());
        }
        setTargetState$animation_core(s);
        if (!isRunning()) {
            setUpdateChildrenNeeded(true);
        }
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).resetAnimation$animation_core();
        }
    }

    public final void removeAnimation$animation_core(Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState) {
        this._animations.remove(transitionAnimationState);
    }

    public static /* synthetic */ void getHasInitialValueAnimations$annotations() {
    }

    public /* synthetic */ Transition(TransitionState transitionState, Transition transition, String str, int i, dq dqVar) {
        this(transitionState, transition, (i & 4) != 0 ? null : str);
    }

    public /* synthetic */ Transition(TransitionState transitionState, String str, int i, dq dqVar) {
        this(transitionState, (i & 2) != 0 ? null : str);
    }

    public Transition(TransitionState<S> transitionState, String str) {
        this(transitionState, null, str);
    }

    public Transition(S s, String str) {
        this(new MutableTransitionState(s), null, str);
    }

    public /* synthetic */ Transition(MutableTransitionState mutableTransitionState, String str, int i, dq dqVar) {
        this(mutableTransitionState, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Transition(MutableTransitionState<S> mutableTransitionState, String str) {
        this(mutableTransitionState, null, str);
        mutableTransitionState.getClass();
    }

    public final void onFrame$animation_core(long j, float f) {
        if (getStartTimeNanos$animation_core() == Long.MIN_VALUE) {
            onTransitionStart$animation_core(j);
        }
        long startTimeNanos$animation_core = j - getStartTimeNanos$animation_core();
        if (f != 0.0f) {
            startTimeNanos$animation_core = y80.Q(startTimeNanos$animation_core / f);
        }
        setPlayTimeNanos(startTimeNanos$animation_core);
        onFrame$animation_core(startTimeNanos$animation_core, f == 0.0f);
    }
}
