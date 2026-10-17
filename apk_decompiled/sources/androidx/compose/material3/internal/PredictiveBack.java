package androidx.compose.material3.internal;

import androidx.compose.animation.core.Easing;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PredictiveBack {
    public static final int $stable = 0;
    public static final PredictiveBack INSTANCE = new PredictiveBack();

    private PredictiveBack() {
    }

    public final float transform$material3(float f) {
        Easing easing;
        easing = BackHandlerKt.PredictiveBackEasing;
        return easing.transform(f);
    }
}
