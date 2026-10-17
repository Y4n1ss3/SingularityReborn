package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.TraversableNode;
import defpackage.f30;
import defpackage.ji0;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragAndDropNodeKt$firstDescendantOrNull$1 extends f30 implements ky {
    final /* synthetic */ ji0 $match;
    final /* synthetic */ ky $predicate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNodeKt$firstDescendantOrNull$1(ky kyVar, ji0 ji0Var) {
        super(1);
        this.$predicate = kyVar;
        this.$match = ji0Var;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction; */
    @Override // defpackage.ky
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(TraversableNode traversableNode) {
        if (!((Boolean) this.$predicate.invoke(traversableNode)).booleanValue()) {
            return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
        }
        this.$match.d = traversableNode;
        return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
    }
}
