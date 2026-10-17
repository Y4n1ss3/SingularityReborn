package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.unit.IntOffset;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnterExitTransitionModifierNode$slideSpec$1 extends f30 implements ky {
    final /* synthetic */ EnterExitTransitionModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionModifierNode$slideSpec$1(EnterExitTransitionModifierNode enterExitTransitionModifierNode) {
        super(1);
        this.this$0 = enterExitTransitionModifierNode;
    }

    @Override // defpackage.ky
    public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> segment) {
        SpringSpec springSpec;
        SpringSpec springSpec2;
        FiniteAnimationSpec<IntOffset> animationSpec;
        SpringSpec springSpec3;
        FiniteAnimationSpec<IntOffset> animationSpec2;
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
            Slide slide = this.this$0.getEnter().getData$animation().getSlide();
            if (slide != null && (animationSpec2 = slide.getAnimationSpec()) != null) {
                return animationSpec2;
            }
            springSpec3 = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            return springSpec3;
        }
        if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
            springSpec = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            return springSpec;
        }
        Slide slide2 = this.this$0.getExit().getData$animation().getSlide();
        if (slide2 != null && (animationSpec = slide2.getAnimationSpec()) != null) {
            return animationSpec;
        }
        springSpec2 = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
        return springSpec2;
    }
}
