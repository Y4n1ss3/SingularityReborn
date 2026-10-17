package androidx.compose.animation;

import defpackage.f30;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionScope$renderInSharedTransitionScopeOverlay$1 extends f30 implements iy {
    final /* synthetic */ SharedTransitionScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScope$renderInSharedTransitionScopeOverlay$1(SharedTransitionScope sharedTransitionScope) {
        super(0);
        this.this$0 = sharedTransitionScope;
    }

    @Override // defpackage.iy
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.isTransitionActive());
    }
}
