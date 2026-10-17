package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MouseWheelScrollableKt {
    private static final int MaxAnimationDuration = 100;
    private static final long ScrollProgressTimeout = 50;
    private static final float AnimationThreshold = Dp.m7611constructorimpl(6.0f);
    private static final float AnimationSpeed = Dp.m7611constructorimpl(1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLowScrollingDelta(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }
}
