package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1 extends f30 implements ky {
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1(EnterTransition enterTransition, ExitTransition exitTransition) {
        super(1);
        this.$enter = enterTransition;
        this.$exit = exitTransition;
    }

    @Override // defpackage.ky
    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> segment) {
        SpringSpec springSpec;
        SpringSpec springSpec2;
        FiniteAnimationSpec<Float> animationSpec;
        SpringSpec springSpec3;
        FiniteAnimationSpec<Float> animationSpec2;
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
            Fade fade = this.$enter.getData$animation().getFade();
            if (fade != null && (animationSpec2 = fade.getAnimationSpec()) != null) {
                return animationSpec2;
            }
            springSpec3 = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
            return springSpec3;
        }
        if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
            springSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
            return springSpec;
        }
        Fade fade2 = this.$exit.getData$animation().getFade();
        if (fade2 != null && (animationSpec = fade2.getAnimationSpec()) != null) {
            return animationSpec;
        }
        springSpec2 = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
        return springSpec2;
    }
}
