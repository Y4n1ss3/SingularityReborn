package androidx.compose.animation;

import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionScopeImpl$sharedBounds$1 extends f30 implements ky {
    public static final SharedTransitionScopeImpl$sharedBounds$1 INSTANCE = new SharedTransitionScopeImpl$sharedBounds$1();

    public SharedTransitionScopeImpl$sharedBounds$1() {
        super(1);
    }

    @Override // defpackage.ky
    public final Boolean invoke(EnterExitState enterExitState) {
        return Boolean.valueOf(enterExitState == EnterExitState.Visible);
    }
}
