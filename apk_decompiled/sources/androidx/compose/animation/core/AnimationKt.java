package androidx.compose.animation.core;

import defpackage.d1;
import defpackage.zv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimationKt {
    public static final long MillisToNanos = 1000000;
    public static final long SecondsToMillis = 1000;

    public static final DecayAnimation<Float, AnimationVector1D> DecayAnimation(FloatDecayAnimationSpec floatDecayAnimationSpec, float f, float f2) {
        return new DecayAnimation<>((DecayAnimationSpec<Float>) DecayAnimationSpecKt.generateDecayAnimationSpec(floatDecayAnimationSpec), VectorConvertersKt.getVectorConverter(zv.a), Float.valueOf(f), AnimationVectorsKt.AnimationVector(f2));
    }

    public static /* synthetic */ DecayAnimation DecayAnimation$default(FloatDecayAnimationSpec floatDecayAnimationSpec, float f, float f2, int i, Object obj) {
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return DecayAnimation(floatDecayAnimationSpec, f, f2);
    }

    public static final <T, V extends AnimationVector> TargetBasedAnimation<T, V> TargetBasedAnimation(AnimationSpec<T> animationSpec, TwoWayConverter<T, V> twoWayConverter, T t, T t2, T t3) {
        return new TargetBasedAnimation<>(animationSpec, twoWayConverter, t, t2, (AnimationVector) twoWayConverter.getConvertToVector().invoke(t3));
    }

    public static final <V extends AnimationVector> TargetBasedAnimation<V, V> createAnimation(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V v, V v2, V v3) {
        return new TargetBasedAnimation<>(vectorizedAnimationSpec, (TwoWayConverter<V, V>) VectorConvertersKt.TwoWayConverter(new d1(19), new d1(20)), v, v2, v3);
    }

    public static final long getDurationMillis(Animation<?, ?> animation) {
        return animation.getDurationNanos() / MillisToNanos;
    }

    public static final <T, V extends AnimationVector> T getVelocityFromNanos(Animation<T, V> animation, long j) {
        return (T) animation.getTypeConverter().getConvertFromVector().invoke(animation.getVelocityVectorFromNanos(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVector createAnimation$lambda$0(AnimationVector animationVector) {
        return animationVector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVector createAnimation$lambda$1(AnimationVector animationVector) {
        return animationVector;
    }
}
