package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.TraversableNode;
import defpackage.f30;
import defpackage.ji0;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class HoverIconModifierNode$findDescendantNodeWithCursorInBounds$1 extends f30 implements ky {
    final /* synthetic */ ji0 $descendantNodeWithCursorInBounds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverIconModifierNode$findDescendantNodeWithCursorInBounds$1(ji0 ji0Var) {
        super(1);
        this.$descendantNodeWithCursorInBounds = ji0Var;
    }

    @Override // defpackage.ky
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
        boolean z;
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
        z = hoverIconModifierNode.cursorInBoundsOfNode;
        if (z) {
            this.$descendantNodeWithCursorInBounds.d = hoverIconModifierNode;
            if (hoverIconModifierNode.getOverrideDescendants()) {
                return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            }
        }
        return traverseDescendantsAction;
    }
}
