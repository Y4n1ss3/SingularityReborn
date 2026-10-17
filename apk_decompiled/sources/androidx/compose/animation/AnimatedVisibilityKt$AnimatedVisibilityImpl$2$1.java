package androidx.compose.animation;

import defpackage.f30;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1 extends f30 implements my {
    public static final AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1();

    public AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1() {
        super(2);
    }

    @Override // defpackage.my
    public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
        return Boolean.valueOf(enterExitState == enterExitState2 && enterExitState2 == EnterExitState.PostExit);
    }
}
