package androidx.compose.animation.core;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FloatDecayAnimationSpecKt {
    private static final float ExponentialDecayFriction = -4.2f;

    public static final Animation<Float, AnimationVector1D> createAnimation(FloatDecayAnimationSpec floatDecayAnimationSpec, float f, float f2) {
        return AnimationKt.DecayAnimation(floatDecayAnimationSpec, f, f2);
    }

    public static /* synthetic */ Animation createAnimation$default(FloatDecayAnimationSpec floatDecayAnimationSpec, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return createAnimation(floatDecayAnimationSpec, f, f2);
    }
}
