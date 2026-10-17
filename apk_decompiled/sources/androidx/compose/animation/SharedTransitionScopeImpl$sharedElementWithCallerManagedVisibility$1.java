package androidx.compose.animation;

import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionScopeImpl$sharedElementWithCallerManagedVisibility$1 extends f30 implements ky {
    final /* synthetic */ boolean $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$sharedElementWithCallerManagedVisibility$1(boolean z) {
        super(1);
        this.$visible = z;
    }

    @Override // defpackage.ky
    public final Boolean invoke(w01 w01Var) {
        return Boolean.valueOf(this.$visible);
    }
}
