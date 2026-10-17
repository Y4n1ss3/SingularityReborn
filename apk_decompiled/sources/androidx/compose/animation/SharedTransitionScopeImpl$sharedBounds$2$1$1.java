package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import defpackage.f30;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionScopeImpl$sharedBounds$2$1$1 extends f30 implements iy {
    final /* synthetic */ SharedTransitionScope.SharedContentState $sharedContentState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$sharedBounds$2$1$1(SharedTransitionScope.SharedContentState sharedContentState) {
        super(0);
        this.$sharedContentState = sharedContentState;
    }

    @Override // defpackage.iy
    public final Boolean invoke() {
        return Boolean.valueOf(this.$sharedContentState.isMatchFound());
    }
}
