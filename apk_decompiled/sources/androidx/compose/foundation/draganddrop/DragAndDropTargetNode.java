package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DragAndDropTargetNode extends DelegatingNode {
    private DragAndDropTargetModifierNode dragAndDropNode;
    private ky shouldStartDragAndDrop;
    private DragAndDropTarget target;

    public DragAndDropTargetNode(ky kyVar, DragAndDropTarget dragAndDropTarget) {
        this.shouldStartDragAndDrop = kyVar;
        this.target = dragAndDropTarget;
    }

    private final void createAndAttachDragAndDropModifierNode() {
        this.dragAndDropNode = (DragAndDropTargetModifierNode) delegate(DragAndDropNodeKt.DragAndDropTargetModifierNode(new a(this, 1), this.target));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createAndAttachDragAndDropModifierNode$lambda$0(DragAndDropTargetNode dragAndDropTargetNode, DragAndDropEvent dragAndDropEvent) {
        return ((Boolean) dragAndDropTargetNode.shouldStartDragAndDrop.invoke(dragAndDropEvent)).booleanValue();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        createAndAttachDragAndDropModifierNode();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.dragAndDropNode;
        dragAndDropTargetModifierNode.getClass();
        undelegate(dragAndDropTargetModifierNode);
    }

    public final void update(ky kyVar, DragAndDropTarget dragAndDropTarget) {
        this.shouldStartDragAndDrop = kyVar;
        if (q10.b(dragAndDropTarget, this.target)) {
            return;
        }
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.dragAndDropNode;
        if (dragAndDropTargetModifierNode != null) {
            undelegate(dragAndDropTargetModifierNode);
        }
        this.target = dragAndDropTarget;
        createAndAttachDragAndDropModifierNode();
    }
}
