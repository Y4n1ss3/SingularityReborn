package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class LegacyDragAndDropSourceElement extends ModifierNodeElement<LegacyDragAndDropSourceNode> {
    private final my dragAndDropSourceHandler;
    private final ky drawDragDecoration;

    public LegacyDragAndDropSourceElement(ky kyVar, my myVar) {
        this.drawDragDecoration = kyVar;
        this.dragAndDropSourceHandler = myVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LegacyDragAndDropSourceNode create() {
        return new LegacyDragAndDropSourceNode(this.drawDragDecoration, this.dragAndDropSourceHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyDragAndDropSourceElement)) {
            return false;
        }
        LegacyDragAndDropSourceElement legacyDragAndDropSourceElement = (LegacyDragAndDropSourceElement) obj;
        return this.drawDragDecoration == legacyDragAndDropSourceElement.drawDragDecoration && this.dragAndDropSourceHandler == legacyDragAndDropSourceElement.dragAndDropSourceHandler;
    }

    public final my getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    public final ky getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.dragAndDropSourceHandler.hashCode() + (this.drawDragDecoration.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSource");
        inspectorInfo.getProperties().set("drawDragDecoration", this.drawDragDecoration);
        inspectorInfo.getProperties().set("dragAndDropSourceHandler", this.dragAndDropSourceHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LegacyDragAndDropSourceNode legacyDragAndDropSourceNode) {
        legacyDragAndDropSourceNode.setDrawDragDecoration(this.drawDragDecoration);
        legacyDragAndDropSourceNode.setDragAndDropSourceHandler(this.dragAndDropSourceHandler);
    }
}
