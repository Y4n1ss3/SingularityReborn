package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidActualDefaultDecayAnimationSpec_androidKt {
    @er
    public static final DecayAnimationSpec<Float> defaultDecayAnimationSpec(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1468328074, i, -1, "androidx.compose.animation.defaultDecayAnimationSpec (AndroidActualDefaultDecayAnimationSpec.android.kt:23)");
        }
        DecayAnimationSpec<Float> rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberSplineBasedDecay;
    }
}
