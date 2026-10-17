package androidx.compose.animation.core;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MonoSplineKt {
    private static final boolean MonoSplineIsExtrapolate = true;

    public static final float hermiteDifferential(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f2 * f2;
        return (((((f5 + f6) * 3.0f) * f7) + (f5 - (((2.0f * f5) + f6) * (2.0f * f2)))) * f) - ((f3 - f4) * ((f2 - f7) * 6.0f));
    }

    public static final float hermiteInterpolate(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f2 * f2;
        float f8 = f7 * f2;
        return ((((f8 - f7) * (f * f6)) + (((f2 - (2.0f * f7)) + f8) * (f5 * f))) + f3) - ((f3 - f4) * ((3.0f * f7) - (2.0f * f8)));
    }
}
