package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DragAndDropSourceElement extends ModifierNodeElement<DragAndDropSourceNode> {
    private final my detectDragStart;
    private final ky drawDragDecoration;
    private final ky transferData;

    public DragAndDropSourceElement(ky kyVar, my myVar, ky kyVar2) {
        this.drawDragDecoration = kyVar;
        this.detectDragStart = myVar;
        this.transferData = kyVar2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DragAndDropSourceNode create() {
        return new DragAndDropSourceNode(this.drawDragDecoration, this.detectDragStart, this.transferData);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceElement)) {
            return false;
        }
        DragAndDropSourceElement dragAndDropSourceElement = (DragAndDropSourceElement) obj;
        return this.drawDragDecoration == dragAndDropSourceElement.drawDragDecoration && this.detectDragStart == dragAndDropSourceElement.detectDragStart && this.transferData == dragAndDropSourceElement.transferData;
    }

    public final my getDetectDragStart() {
        return this.detectDragStart;
    }

    public final ky getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    public final ky getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.transferData.hashCode() + ((this.detectDragStart.hashCode() + (this.drawDragDecoration.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSource");
        inspectorInfo.getProperties().set("drawDragDecoration", this.drawDragDecoration);
        inspectorInfo.getProperties().set("detectDragStart", this.detectDragStart);
        inspectorInfo.getProperties().set("transferData", this.transferData);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DragAndDropSourceNode dragAndDropSourceNode) {
        dragAndDropSourceNode.setDrawDragDecoration(this.drawDragDecoration);
        dragAndDropSourceNode.setDetectDragStart(this.detectDragStart);
        dragAndDropSourceNode.setTransferData(this.transferData);
    }
}
