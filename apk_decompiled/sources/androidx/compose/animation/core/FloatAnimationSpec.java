package androidx.compose.animation.core;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface FloatAnimationSpec extends AnimationSpec<Float> {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static float getEndVelocity(FloatAnimationSpec floatAnimationSpec, float f, float f2, float f3) {
            return FloatAnimationSpec.super.getEndVelocity(f, f2, f3);
        }

        @Deprecated
        public static <V extends AnimationVector> VectorizedFloatAnimationSpec<V> vectorize(FloatAnimationSpec floatAnimationSpec, TwoWayConverter<Float, V> twoWayConverter) {
            return FloatAnimationSpec.super.vectorize((TwoWayConverter) twoWayConverter);
        }
    }

    long getDurationNanos(float f, float f2, float f3);

    default float getEndVelocity(float f, float f2, float f3) {
        return getVelocityFromNanos(getDurationNanos(f, f2, f3), f, f2, f3);
    }

    float getValueFromNanos(long j, float f, float f2, float f3);

    float getVelocityFromNanos(long j, float f, float f2, float f3);

    @Override // androidx.compose.animation.core.AnimationSpec
    default <V extends AnimationVector> VectorizedFloatAnimationSpec<V> vectorize(TwoWayConverter<Float, V> twoWayConverter) {
        return new VectorizedFloatAnimationSpec<>(this);
    }
}
