package androidx.compose.animation;

import defpackage.f30;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$6$1$4$1 extends f30 implements my {
    final /* synthetic */ ExitTransition $exit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$6$1$4$1(ExitTransition exitTransition) {
        super(2);
        this.$exit = exitTransition;
    }

    @Override // defpackage.my
    public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
        EnterExitState enterExitState3 = EnterExitState.PostExit;
        return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !this.$exit.getData$animation().getHold());
    }
}
