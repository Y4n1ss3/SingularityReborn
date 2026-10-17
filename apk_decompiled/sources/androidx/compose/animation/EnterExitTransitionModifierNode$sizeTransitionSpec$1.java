package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.unit.IntSize;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnterExitTransitionModifierNode$sizeTransitionSpec$1 extends f30 implements ky {
    final /* synthetic */ EnterExitTransitionModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionModifierNode$sizeTransitionSpec$1(EnterExitTransitionModifierNode enterExitTransitionModifierNode) {
        super(1);
        this.this$0 = enterExitTransitionModifierNode;
    }

    @Override // defpackage.ky
    public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<EnterExitState> segment) {
        SpringSpec springSpec;
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        FiniteAnimationSpec<IntSize> finiteAnimationSpec = null;
        if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
            ChangeSize changeSize = this.this$0.getEnter().getData$animation().getChangeSize();
            if (changeSize != null) {
                finiteAnimationSpec = changeSize.getAnimationSpec();
            }
        } else if (segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
            ChangeSize changeSize2 = this.this$0.getExit().getData$animation().getChangeSize();
            if (changeSize2 != null) {
                finiteAnimationSpec = changeSize2.getAnimationSpec();
            }
        } else {
            finiteAnimationSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
        }
        if (finiteAnimationSpec != null) {
            return finiteAnimationSpec;
        }
        springSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
        return springSpec;
    }
}
