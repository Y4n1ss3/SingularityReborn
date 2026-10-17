package androidx.compose.animation.core;

import defpackage.zv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DecayAnimationSpecKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, V extends AnimationVector> T calculateTargetValue(DecayAnimationSpec<T> decayAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t, T t2) {
        return (T) twoWayConverter.getConvertFromVector().invoke(decayAnimationSpec.vectorize(twoWayConverter).getTargetValue((AnimationVector) twoWayConverter.getConvertToVector().invoke(t), (AnimationVector) twoWayConverter.getConvertToVector().invoke(t2)));
    }

    public static final <T> DecayAnimationSpec<T> exponentialDecay(float f, float f2) {
        return generateDecayAnimationSpec(new FloatExponentialDecaySpec(f, f2));
    }

    public static /* synthetic */ DecayAnimationSpec exponentialDecay$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.1f;
        }
        return exponentialDecay(f, f2);
    }

    public static final <T> DecayAnimationSpec<T> generateDecayAnimationSpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        return new DecayAnimationSpecImpl(floatDecayAnimationSpec);
    }

    public static final float calculateTargetValue(DecayAnimationSpec<Float> decayAnimationSpec, float f, float f2) {
        return ((AnimationVector1D) decayAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(zv.a)).getTargetValue(AnimationVectorsKt.AnimationVector(f), AnimationVectorsKt.AnimationVector(f2))).getValue();
    }
}
