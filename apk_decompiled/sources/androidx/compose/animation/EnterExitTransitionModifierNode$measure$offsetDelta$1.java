package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.unit.IntOffset;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnterExitTransitionModifierNode$measure$offsetDelta$1 extends f30 implements ky {
    public static final EnterExitTransitionModifierNode$measure$offsetDelta$1 INSTANCE = new EnterExitTransitionModifierNode$measure$offsetDelta$1();

    public EnterExitTransitionModifierNode$measure$offsetDelta$1() {
        super(1);
    }

    @Override // defpackage.ky
    public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> segment) {
        SpringSpec springSpec;
        springSpec = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
        return springSpec;
    }
}
