package androidx.compose.animation.core;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorizedAnimationSpecKt {
    private static final int[] EmptyIntArray = new int[0];
    private static final float[] EmptyFloatArray = new float[0];
    private static final ArcSpline EmptyArcSpline = new ArcSpline(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    public static final long clampPlayTime(VectorizedDurationBasedAnimationSpec<?> vectorizedDurationBasedAnimationSpec, long j) {
        long delayMillis = j - vectorizedDurationBasedAnimationSpec.getDelayMillis();
        long durationMillis = vectorizedDurationBasedAnimationSpec.getDurationMillis();
        if (delayMillis < 0) {
            delayMillis = 0;
        }
        return delayMillis > durationMillis ? durationMillis : delayMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V extends AnimationVector> Animations createSpringAnimations(final V v, final float f, final float f2) {
        return v != null ? new Animations(v, f, f2) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$1
            private final FloatSpringSpec[] anims;

            /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
            {
                int size$animation_core = v.getSize$animation_core();
                FloatSpringSpec[] floatSpringSpecArr = new FloatSpringSpec[size$animation_core];
                for (int i = 0; i < size$animation_core; i++) {
                    floatSpringSpecArr[i] = new FloatSpringSpec(f, f2, v.get$animation_core(i));
                }
                this.anims = floatSpringSpecArr;
            }

            @Override // androidx.compose.animation.core.Animations
            public FloatSpringSpec get(int i) {
                return this.anims[i];
            }
        } : new Animations(f, f2) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$2
            private final FloatSpringSpec anim;

            {
                this.anim = new FloatSpringSpec(f, f2, 0.0f, 4, null);
            }

            @Override // androidx.compose.animation.core.Animations
            public FloatSpringSpec get(int i) {
                return this.anim;
            }
        };
    }

    public static final <V extends AnimationVector> long getDurationMillis(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V v, V v2, V v3) {
        return vectorizedAnimationSpec.getDurationNanos(v, v2, v3) / AnimationKt.MillisToNanos;
    }

    public static final <V extends AnimationVector> V getValueFromMillis(VectorizedAnimationSpec<V> vectorizedAnimationSpec, long j, V v, V v2, V v3) {
        return vectorizedAnimationSpec.getValueFromNanos(j * AnimationKt.MillisToNanos, v, v2, v3);
    }
}
