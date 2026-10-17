package androidx.compose.foundation;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MarqueeDefaults {
    public static final int $stable = 0;
    public static final MarqueeDefaults INSTANCE = new MarqueeDefaults();
    private static final int Iterations = 3;
    private static final int RepeatDelayMillis = 1200;
    private static final MarqueeSpacing Spacing = MarqueeSpacing.Companion.fractionOfContainer(0.33333334f);
    private static final float Velocity = Dp.m7611constructorimpl(30.0f);

    private MarqueeDefaults() {
    }

    public final int getIterations() {
        return Iterations;
    }

    public final int getRepeatDelayMillis() {
        return RepeatDelayMillis;
    }

    public final MarqueeSpacing getSpacing() {
        return Spacing;
    }

    /* renamed from: getVelocity-D9Ej5fM, reason: not valid java name */
    public final float m306getVelocityD9Ej5fM() {
        return Velocity;
    }

    public static /* synthetic */ void getIterations$annotations() {
    }

    public static /* synthetic */ void getRepeatDelayMillis$annotations() {
    }
}
