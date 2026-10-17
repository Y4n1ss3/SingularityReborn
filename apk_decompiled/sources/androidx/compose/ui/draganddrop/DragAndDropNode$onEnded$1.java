package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.TraversableNode;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragAndDropNode$onEnded$1 extends f30 implements ky {
    final /* synthetic */ DragAndDropEvent $event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$onEnded$1(DragAndDropEvent dragAndDropEvent) {
        super(1);
        this.$event = dragAndDropEvent;
    }

    @Override // defpackage.ky
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
        DragAndDropTarget dragAndDropTarget;
        if (!dragAndDropNode.getNode().isAttached()) {
            return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }
        dragAndDropTarget = dragAndDropNode.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onEnded(this.$event);
        }
        dragAndDropNode.thisDragAndDropTarget = null;
        dragAndDropNode.lastChildDragAndDropModifierNode = null;
        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
    }
}
