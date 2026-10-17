package androidx.compose.foundation.pager;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.a10;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PagerDefaults {
    public static final int $stable = 0;
    public static final int BeyondViewportPageCount = 0;
    public static final PagerDefaults INSTANCE = new PagerDefaults();

    private PagerDefaults() {
    }

    public final TargetedFlingBehavior flingBehavior(final PagerState pagerState, PagerSnapDistance pagerSnapDistance, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, final float f, Composer composer, int i, int i2) {
        boolean z = true;
        if ((i2 & 2) != 0) {
            pagerSnapDistance = PagerSnapDistance.Companion.atMost(1);
        }
        if ((i2 & 4) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if ((i2 & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, Float.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(a10.a)), 1, null);
        }
        if ((i2 & 16) != 0) {
            f = 0.5f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1559769181, i, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:384)");
        }
        if (0.0f > f || f > 1.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f);
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        final LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        boolean changed = ((((i & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i & 6) == 4) | composer.changed(decayAnimationSpec) | composer.changed(animationSpec);
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(pagerSnapDistance)) && (i & 48) != 32) {
            z = false;
        }
        boolean changed2 = composer.changed(density) | changed | z | composer.changed(layoutDirection.ordinal());
        Object rememberedValue = composer.rememberedValue();
        if (changed2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapFlingBehaviorKt.snapFlingBehavior(PagerSnapLayoutInfoProviderKt.SnapLayoutInfoProvider(pagerState, pagerSnapDistance, new ny() { // from class: me0
                @Override // defpackage.ny
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float calculateFinalSnappingBound;
                    calculateFinalSnappingBound = PagerSnapLayoutInfoProviderKt.calculateFinalSnappingBound(PagerState.this, layoutDirection, f, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                    return Float.valueOf(calculateFinalSnappingBound);
                }
            }), decayAnimationSpec, animationSpec);
            composer.updateRememberedValue(rememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }

    public final NestedScrollConnection pageNestedScrollConnection(PagerState pagerState, Orientation orientation, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(877583120, i, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:433)");
        }
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(orientation.ordinal())) || (i & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultPagerNestedScrollConnection(pagerState, orientation);
            composer.updateRememberedValue(rememberedValue);
        }
        DefaultPagerNestedScrollConnection defaultPagerNestedScrollConnection = (DefaultPagerNestedScrollConnection) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultPagerNestedScrollConnection;
    }
}
