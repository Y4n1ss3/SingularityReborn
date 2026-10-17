package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DropTargetElement extends ModifierNodeElement<DragAndDropTargetNode> {
    private final ky shouldStartDragAndDrop;
    private final DragAndDropTarget target;

    public DropTargetElement(ky kyVar, DragAndDropTarget dragAndDropTarget) {
        this.shouldStartDragAndDrop = kyVar;
        this.target = dragAndDropTarget;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DragAndDropTargetNode create() {
        return new DragAndDropTargetNode(this.shouldStartDragAndDrop, this.target);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropTargetElement)) {
            return false;
        }
        DropTargetElement dropTargetElement = (DropTargetElement) obj;
        return q10.b(this.target, dropTargetElement.target) && this.shouldStartDragAndDrop == dropTargetElement.shouldStartDragAndDrop;
    }

    public final ky getShouldStartDragAndDrop() {
        return this.shouldStartDragAndDrop;
    }

    public final DragAndDropTarget getTarget() {
        return this.target;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.shouldStartDragAndDrop.hashCode() + (this.target.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dropTarget");
        inspectorInfo.getProperties().set("target", this.target);
        inspectorInfo.getProperties().set("shouldStartDragAndDrop", this.shouldStartDragAndDrop);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DragAndDropTargetNode dragAndDropTargetNode) {
        dragAndDropTargetNode.update(this.shouldStartDragAndDrop, this.target);
    }
}
