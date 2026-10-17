package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import defpackage.dq;
import defpackage.er;
import defpackage.hm;
import defpackage.ky;
import defpackage.q10;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Animatable<T, V extends AnimationVector> {
    public static final int $stable = 8;
    private final SpringSpec<T> defaultSpringSpec;
    private final AnimationState<T, V> internalState;
    private final MutableState isRunning$delegate;
    private final String label;
    private T lowerBound;
    private V lowerBoundVector;
    private final MutatorMutex mutatorMutex;
    private final V negativeInfinityBounds;
    private final V positiveInfinityBounds;
    private final MutableState targetValue$delegate;
    private final TwoWayConverter<T, V> typeConverter;
    private T upperBound;
    private V upperBoundVector;
    private final T visibilityThreshold;

    public Animatable(T t, TwoWayConverter<T, V> twoWayConverter, T t2, String str) {
        this.typeConverter = twoWayConverter;
        this.visibilityThreshold = t2;
        this.label = str;
        this.internalState = new AnimationState<>(twoWayConverter, t, null, 0L, 0L, false, 60, null);
        this.isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.targetValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec<>(0.0f, 0.0f, t2, 3, null);
        V velocityVector = getVelocityVector();
        V v = velocityVector instanceof AnimationVector1D ? AnimatableKt.negativeInfinityBounds1D : velocityVector instanceof AnimationVector2D ? AnimatableKt.negativeInfinityBounds2D : velocityVector instanceof AnimationVector3D ? AnimatableKt.negativeInfinityBounds3D : AnimatableKt.negativeInfinityBounds4D;
        v.getClass();
        this.negativeInfinityBounds = v;
        V velocityVector2 = getVelocityVector();
        V v2 = velocityVector2 instanceof AnimationVector1D ? AnimatableKt.positiveInfinityBounds1D : velocityVector2 instanceof AnimationVector2D ? AnimatableKt.positiveInfinityBounds2D : velocityVector2 instanceof AnimationVector3D ? AnimatableKt.positiveInfinityBounds3D : AnimatableKt.positiveInfinityBounds4D;
        v2.getClass();
        this.positiveInfinityBounds = v2;
        this.lowerBoundVector = v;
        this.upperBoundVector = v2;
    }

    public static /* synthetic */ Object animateDecay$default(Animatable animatable, Object obj, DecayAnimationSpec decayAnimationSpec, ky kyVar, hm hmVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            kyVar = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, kyVar, hmVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, ky kyVar, hm hmVar, int i, Object obj3) {
        if ((i & 2) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        AnimationSpec animationSpec2 = animationSpec;
        T t = obj2;
        if ((i & 4) != 0) {
            t = animatable.getVelocity();
        }
        T t2 = t;
        if ((i & 8) != 0) {
            kyVar = null;
        }
        return animatable.animateTo(obj, animationSpec2, t2, kyVar, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T clampToBounds(T t) {
        if (!q10.b(this.lowerBoundVector, this.negativeInfinityBounds) || !q10.b(this.upperBoundVector, this.positiveInfinityBounds)) {
            AnimationVector animationVector = (AnimationVector) this.typeConverter.getConvertToVector().invoke(t);
            int size$animation_core = animationVector.getSize$animation_core();
            boolean z = false;
            for (int i = 0; i < size$animation_core; i++) {
                if (animationVector.get$animation_core(i) < this.lowerBoundVector.get$animation_core(i) || animationVector.get$animation_core(i) > this.upperBoundVector.get$animation_core(i)) {
                    animationVector.set$animation_core(i, y80.g(animationVector.get$animation_core(i), this.lowerBoundVector.get$animation_core(i), this.upperBoundVector.get$animation_core(i)));
                    z = true;
                }
            }
            if (z) {
                return (T) this.typeConverter.getConvertFromVector().invoke(animationVector);
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAnimation() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.getVelocityVector().reset$animation_core();
        animationState.setLastFrameTimeNanos$animation_core(Long.MIN_VALUE);
        setRunning(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(Animation<T, V> animation, T t, ky kyVar, hm hmVar) {
        return MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$runAnimation$2(this, t, animation, this.internalState.getLastFrameTimeNanos(), kyVar, null), hmVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRunning(boolean z) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetValue(T t) {
        this.targetValue$delegate.setValue(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBounds$default(Animatable animatable, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = animatable.lowerBound;
        }
        if ((i & 2) != 0) {
            obj2 = animatable.upperBound;
        }
        animatable.updateBounds(obj, obj2);
    }

    public final Object animateDecay(T t, DecayAnimationSpec<T> decayAnimationSpec, ky kyVar, hm hmVar) {
        return runAnimation(new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter<T, AnimationVector>) this.typeConverter, (Object) getValue(), (AnimationVector) this.typeConverter.getConvertToVector().invoke(t)), t, kyVar, hmVar);
    }

    public final Object animateTo(T t, AnimationSpec<T> animationSpec, T t2, ky kyVar, hm hmVar) {
        return runAnimation(AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t, t2), t2, kyVar, hmVar);
    }

    public final State<T> asState() {
        return this.internalState;
    }

    public final SpringSpec<T> getDefaultSpringSpec$animation_core() {
        return this.defaultSpringSpec;
    }

    public final AnimationState<T, V> getInternalState$animation_core() {
        return this.internalState;
    }

    public final String getLabel() {
        return this.label;
    }

    public final T getLowerBound() {
        return this.lowerBound;
    }

    public final T getTargetValue() {
        return this.targetValue$delegate.getValue();
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getUpperBound() {
        return this.upperBound;
    }

    public final T getValue() {
        return this.internalState.getValue();
    }

    public final T getVelocity() {
        return (T) this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    public final V getVelocityVector() {
        return this.internalState.getVelocityVector();
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final Object snapTo(T t, hm hmVar) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$snapTo$2(this, t, null), hmVar, 1, null);
        return mutate$default == vn.d ? mutate$default : w01.a;
    }

    public final Object stop(hm hmVar) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$stop$2(this, null), hmVar, 1, null);
        return mutate$default == vn.d ? mutate$default : w01.a;
    }

    public final void updateBounds(T t, T t2) {
        V v;
        V v2;
        if (t == null || (v = (V) this.typeConverter.getConvertToVector().invoke(t)) == null) {
            v = this.negativeInfinityBounds;
        }
        if (t2 == null || (v2 = (V) this.typeConverter.getConvertToVector().invoke(t2)) == null) {
            v2 = this.positiveInfinityBounds;
        }
        int size$animation_core = v.getSize$animation_core();
        for (int i = 0; i < size$animation_core; i++) {
            if (!(v.get$animation_core(i) <= v2.get$animation_core(i))) {
                PreconditionsKt.throwIllegalStateException("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + v + " is greater than upper bound " + v2 + " on index " + i);
            }
        }
        this.lowerBoundVector = v;
        this.upperBoundVector = v2;
        this.upperBound = t2;
        this.lowerBound = t;
        if (isRunning()) {
            return;
        }
        T clampToBounds = clampToBounds(getValue());
        if (q10.b(clampToBounds, getValue())) {
            return;
        }
        this.internalState.setValue$animation_core(clampToBounds);
    }

    private static /* synthetic */ void getNegativeInfinityBounds$annotations() {
    }

    private static /* synthetic */ void getPositiveInfinityBounds$annotations() {
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str, int i, dq dqVar) {
        this(obj, twoWayConverter, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i, dq dqVar) {
        this(obj, twoWayConverter, (i & 4) != 0 ? null : obj2);
    }

    @er
    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2) {
        this(obj, twoWayConverter, obj2, "Animatable");
    }
}
