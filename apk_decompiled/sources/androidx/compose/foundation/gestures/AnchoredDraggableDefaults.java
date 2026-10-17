package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import defpackage.d1;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnchoredDraggableDefaults {
    public static final AnchoredDraggableDefaults INSTANCE = new AnchoredDraggableDefaults();
    private static final AnimationSpec<Float> SnapAnimationSpec = AnimationSpecKt.tween$default(0, 0, null, 7, null);
    private static final ky PositionalThreshold = new d1(4);
    private static final DecayAnimationSpec<Float> DecayAnimationSpec = DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
    public static final int $stable = 8;

    private AnchoredDraggableDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float PositionalThreshold$lambda$0(float f) {
        return f / 2.0f;
    }

    public final <T> TargetedFlingBehavior flingBehavior(AnchoredDraggableState<T> anchoredDraggableState, ky kyVar, AnimationSpec<Float> animationSpec, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            kyVar = PositionalThreshold;
        }
        if ((i2 & 4) != 0) {
            animationSpec = SnapAnimationSpec;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-952742024, i, -1, "androidx.compose.foundation.gestures.AnchoredDraggableDefaults.flingBehavior (AnchoredDraggable.kt:1523)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean changed = ((((i & 14) ^ 6) > 4 && composer.changed(anchoredDraggableState)) || (i & 6) == 4) | composer.changed(density) | ((((i & 112) ^ 48) > 32 && composer.changed(kyVar)) || (i & 48) == 32) | composer.changed(animationSpec);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = AnchoredDraggableKt.anchoredDraggableFlingBehavior(anchoredDraggableState, density, kyVar, animationSpec);
            composer.updateRememberedValue(rememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }

    public final DecayAnimationSpec<Float> getDecayAnimationSpec() {
        return DecayAnimationSpec;
    }

    public final ky getPositionalThreshold() {
        return PositionalThreshold;
    }

    public final AnimationSpec<Float> getSnapAnimationSpec() {
        return SnapAnimationSpec;
    }
}
