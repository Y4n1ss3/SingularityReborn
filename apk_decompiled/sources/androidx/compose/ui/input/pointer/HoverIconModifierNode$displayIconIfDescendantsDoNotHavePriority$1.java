package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.TraversableNode;
import defpackage.f30;
import defpackage.fi0;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1 extends f30 implements ky {
    final /* synthetic */ fi0 $hasIconRightsOverDescendants;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1(fi0 fi0Var) {
        super(1);
        this.$hasIconRightsOverDescendants = fi0Var;
    }

    @Override // defpackage.ky
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
        boolean z;
        z = hoverIconModifierNode.cursorInBoundsOfNode;
        if (!z) {
            return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
        }
        this.$hasIconRightsOverDescendants.d = false;
        return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
    }
}
