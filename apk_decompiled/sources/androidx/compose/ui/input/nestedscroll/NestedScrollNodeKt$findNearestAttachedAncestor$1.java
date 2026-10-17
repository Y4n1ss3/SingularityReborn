package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.TraversableNode;
import defpackage.f30;
import defpackage.ji0;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NestedScrollNodeKt$findNearestAttachedAncestor$1 extends f30 implements ky {
    final /* synthetic */ ji0 $node;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNodeKt$findNearestAttachedAncestor$1(ji0 ji0Var) {
        super(1);
        this.$node = ji0Var;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
    @Override // defpackage.ky
    public final Boolean invoke(TraversableNode traversableNode) {
        boolean z;
        if (traversableNode.getNode().isAttached()) {
            this.$node.d = traversableNode;
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
