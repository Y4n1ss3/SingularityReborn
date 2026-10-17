package androidx.compose.material3.carousel;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.pager.PagerDefaults;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CarouselDefaults {
    public static final int $stable = 0;
    public static final float MediumLargeItemDiffThreshold = 0.85f;
    public static final CarouselDefaults INSTANCE = new CarouselDefaults();
    private static final float MinSmallItemSize = Dp.m7611constructorimpl(40.0f);
    private static final float MaxSmallItemSize = Dp.m7611constructorimpl(56.0f);
    private static final float AnchorSize = Dp.m7611constructorimpl(10.0f);

    private CarouselDefaults() {
    }

    /* renamed from: getAnchorSize-D9Ej5fM$material3, reason: not valid java name */
    public final float m2862getAnchorSizeD9Ej5fM$material3() {
        return AnchorSize;
    }

    /* renamed from: getMaxSmallItemSize-D9Ej5fM, reason: not valid java name */
    public final float m2863getMaxSmallItemSizeD9Ej5fM() {
        return MaxSmallItemSize;
    }

    /* renamed from: getMinSmallItemSize-D9Ej5fM, reason: not valid java name */
    public final float m2864getMinSmallItemSizeD9Ej5fM() {
        return MinSmallItemSize;
    }

    public final TargetedFlingBehavior multiBrowseFlingBehavior(CarouselState carouselState, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        DecayAnimationSpec<Float> decayAnimationSpec2 = decayAnimationSpec;
        if ((i2 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1105043293, i, -1, "androidx.compose.material3.carousel.CarouselDefaults.multiBrowseFlingBehavior (Carousel.kt:816)");
        }
        TargetedFlingBehavior flingBehavior = PagerDefaults.INSTANCE.flingBehavior(carouselState.getPagerState$material3(), new PagerSnapDistance() { // from class: androidx.compose.material3.carousel.CarouselDefaults$multiBrowseFlingBehavior$pagerSnapDistance$1
            @Override // androidx.compose.foundation.pager.PagerSnapDistance
            public int calculateTargetPage(int i3, int i4, float f, int i5, int i6) {
                return i4;
            }
        }, decayAnimationSpec2, animationSpec2, 0.0f, composer, ((i << 3) & 8064) | (PagerDefaults.$stable << 15), 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return flingBehavior;
    }

    public final TargetedFlingBehavior noSnapFlingBehavior(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-418415756, i, -1, "androidx.compose.material3.carousel.CarouselDefaults.noSnapFlingBehavior (Carousel.kt:845)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SnapLayoutInfoProvider() { // from class: androidx.compose.material3.carousel.CarouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$1
                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public float calculateSnapOffset(float f) {
                    return 0.0f;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        TargetedFlingBehavior rememberSnapFlingBehavior = SnapFlingBehaviorKt.rememberSnapFlingBehavior((CarouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$1) rememberedValue, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberSnapFlingBehavior;
    }

    public final TargetedFlingBehavior singleAdvanceFlingBehavior(CarouselState carouselState, AnimationSpec<Float> animationSpec, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1701587199, i, -1, "androidx.compose.material3.carousel.CarouselDefaults.singleAdvanceFlingBehavior (Carousel.kt:783)");
        }
        TargetedFlingBehavior flingBehavior = PagerDefaults.INSTANCE.flingBehavior(carouselState.getPagerState$material3(), PagerSnapDistance.Companion.atMost(1), null, animationSpec2, 0.0f, composer, ((i << 6) & 7168) | (PagerDefaults.$stable << 15), 20);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return flingBehavior;
    }
}
