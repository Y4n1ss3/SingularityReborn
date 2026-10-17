package androidx.compose.ui.draganddrop;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.TraversableNode;
import defpackage.f30;
import defpackage.fi0;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragAndDropNode$acceptDragAndDropTransfer$1 extends f30 implements ky {
    final /* synthetic */ fi0 $handled;
    final /* synthetic */ DragAndDropEvent $startEvent;
    final /* synthetic */ DragAndDropNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$acceptDragAndDropTransfer$1(DragAndDropEvent dragAndDropEvent, DragAndDropNode dragAndDropNode, fi0 fi0Var) {
        super(1);
        this.$startEvent = dragAndDropEvent;
        this.this$0 = dragAndDropNode;
        this.$handled = fi0Var;
    }

    @Override // defpackage.ky
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
        DragAndDropTarget dragAndDropTarget;
        ky kyVar;
        DragAndDropTarget dragAndDropTarget2;
        DragAndDropManager dragAndDropManager;
        if (!dragAndDropNode.isAttached()) {
            return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }
        dragAndDropTarget = dragAndDropNode.thisDragAndDropTarget;
        if (!(dragAndDropTarget == null)) {
            InlineClassHelperKt.throwIllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session");
        }
        kyVar = dragAndDropNode.onDropTargetValidate;
        dragAndDropNode.thisDragAndDropTarget = kyVar != null ? (DragAndDropTarget) kyVar.invoke(this.$startEvent) : null;
        dragAndDropTarget2 = dragAndDropNode.thisDragAndDropTarget;
        boolean z = dragAndDropTarget2 != null;
        if (z) {
            dragAndDropManager = this.this$0.getDragAndDropManager();
            dragAndDropManager.registerTargetInterest(dragAndDropNode);
        }
        fi0 fi0Var = this.$handled;
        fi0Var.d = fi0Var.d || z;
        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
    }
}
