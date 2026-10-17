package androidx.compose.animation.core;

import defpackage.ss;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EasingKt {
    private static final float OneUlpAt1 = 1.1920929E-7f;
    private static final Easing FastOutSlowInEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    private static final Easing LinearOutSlowInEasing = new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);
    private static final Easing FastOutLinearInEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final Easing LinearEasing = new ss(6);

    public static final Easing getFastOutLinearInEasing() {
        return FastOutLinearInEasing;
    }

    public static final Easing getFastOutSlowInEasing() {
        return FastOutSlowInEasing;
    }

    public static final Easing getLinearEasing() {
        return LinearEasing;
    }

    public static final Easing getLinearOutSlowInEasing() {
        return LinearOutSlowInEasing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearEasing$lambda$0(float f) {
        return f;
    }
}
