package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.TraversableNode;
import defpackage.f30;
import defpackage.ji0;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1 extends f30 implements ky {
    final /* synthetic */ DragAndDropEvent $event$inlined;
    final /* synthetic */ ji0 $match;
    final /* synthetic */ DragAndDropNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1(ji0 ji0Var, DragAndDropNode dragAndDropNode, DragAndDropEvent dragAndDropEvent) {
        super(1);
        this.$match = ji0Var;
        this.this$0 = dragAndDropNode;
        this.$event$inlined = dragAndDropEvent;
    }

    @Override // defpackage.ky
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
        DragAndDropManager dragAndDropManager;
        boolean m4268containsUv8p0NA;
        DragAndDropNode dragAndDropNode2 = dragAndDropNode;
        dragAndDropManager = this.this$0.getDragAndDropManager();
        if (dragAndDropManager.isInterestedTarget(dragAndDropNode2)) {
            m4268containsUv8p0NA = DragAndDropNodeKt.m4268containsUv8p0NA(dragAndDropNode2, DragAndDrop_androidKt.getPositionInRoot(this.$event$inlined));
            if (m4268containsUv8p0NA) {
                this.$match.d = dragAndDropNode;
                return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
            }
        }
        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
    }
}
