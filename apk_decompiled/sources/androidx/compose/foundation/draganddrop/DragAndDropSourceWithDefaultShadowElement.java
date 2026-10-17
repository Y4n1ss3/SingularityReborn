package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DragAndDropSourceWithDefaultShadowElement extends ModifierNodeElement<DragSourceNodeWithDefaultPainter> {
    private my detectDragStart;
    private ky transferData;

    public DragAndDropSourceWithDefaultShadowElement(my myVar, ky kyVar) {
        this.detectDragStart = myVar;
        this.transferData = kyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DragSourceNodeWithDefaultPainter create() {
        return new DragSourceNodeWithDefaultPainter(this.detectDragStart, this.transferData);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceWithDefaultShadowElement)) {
            return false;
        }
        DragAndDropSourceWithDefaultShadowElement dragAndDropSourceWithDefaultShadowElement = (DragAndDropSourceWithDefaultShadowElement) obj;
        return this.detectDragStart == dragAndDropSourceWithDefaultShadowElement.detectDragStart && this.transferData == dragAndDropSourceWithDefaultShadowElement.transferData;
    }

    public final my getDetectDragStart() {
        return this.detectDragStart;
    }

    public final ky getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.transferData.hashCode() + (this.detectDragStart.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSourceWithDefaultPainter");
        inspectorInfo.getProperties().set("detectDragStart", this.detectDragStart);
        inspectorInfo.getProperties().set("transferData", this.transferData);
    }

    public final void setDetectDragStart(my myVar) {
        this.detectDragStart = myVar;
    }

    public final void setTransferData(ky kyVar) {
        this.transferData = kyVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter) {
        dragSourceNodeWithDefaultPainter.setDetectDragStart(this.detectDragStart);
        dragSourceNodeWithDefaultPainter.setTransferData(this.transferData);
    }
}
