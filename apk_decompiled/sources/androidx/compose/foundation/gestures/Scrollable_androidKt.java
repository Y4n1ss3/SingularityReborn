package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Scrollable_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ScrollableDefaultFlingBehavior platformScrollableDefaultFlingBehavior() {
        return new DefaultFlingBehavior(SplineBasedDecayKt.splineBasedDecay(ScrollableKt.getUnityDensity()), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final FlingBehavior rememberPlatformDefaultFlingBehavior(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(162564459, i, -1, "androidx.compose.foundation.gestures.rememberPlatformDefaultFlingBehavior (Scrollable.android.kt:28)");
        }
        DecayAnimationSpec rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        boolean changed = composer.changed(rememberSplineBasedDecay);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultFlingBehavior(rememberSplineBasedDecay, null, 2, 0 == true ? 1 : 0);
            composer.updateRememberedValue(rememberedValue);
        }
        DefaultFlingBehavior defaultFlingBehavior = (DefaultFlingBehavior) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFlingBehavior;
    }
}
