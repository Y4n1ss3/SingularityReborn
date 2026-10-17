package androidx.compose.animation;

import androidx.compose.ui.node.DrawModifierNodeKt;
import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionScopeRootModifierNode$onAttach$1 extends f30 implements iy {
    final /* synthetic */ SharedTransitionScopeRootModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeRootModifierNode$onAttach$1(SharedTransitionScopeRootModifierNode sharedTransitionScopeRootModifierNode) {
        super(0);
        this.this$0 = sharedTransitionScopeRootModifierNode;
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m94invoke();
        return w01.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m94invoke() {
        DrawModifierNodeKt.invalidateDraw(this.this$0);
    }
}
