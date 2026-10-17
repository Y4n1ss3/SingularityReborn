package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.graphics.Color;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VeilModifierNode$draw$veilColor$1 extends f30 implements ky {
    final /* synthetic */ VeilModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VeilModifierNode$draw$veilColor$1(VeilModifierNode veilModifierNode) {
        super(1);
        this.this$0 = veilModifierNode;
    }

    @Override // defpackage.ky
    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<EnterExitState> segment) {
        SpringSpec springSpec;
        SpringSpec springSpec2;
        FiniteAnimationSpec<Color> animationSpec;
        SpringSpec springSpec3;
        FiniteAnimationSpec<Color> animationSpec2;
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
            Veil veil = this.this$0.getEnter().getData$animation().getVeil();
            if (veil != null && (animationSpec2 = veil.getAnimationSpec()) != null) {
                return animationSpec2;
            }
            springSpec3 = EnterExitTransitionKt.DefaultColorAnimationSpec;
            return springSpec3;
        }
        if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
            springSpec = EnterExitTransitionKt.DefaultColorAnimationSpec;
            return springSpec;
        }
        Veil veil2 = this.this$0.getExit().getData$animation().getVeil();
        if (veil2 != null && (animationSpec = veil2.getAnimationSpec()) != null) {
            return animationSpec;
        }
        springSpec2 = EnterExitTransitionKt.DefaultColorAnimationSpec;
        return springSpec2;
    }
}
