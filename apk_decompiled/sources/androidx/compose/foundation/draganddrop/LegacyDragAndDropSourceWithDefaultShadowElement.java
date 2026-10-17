package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.my;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class LegacyDragAndDropSourceWithDefaultShadowElement extends ModifierNodeElement<LegacyDragSourceNodeWithDefaultPainter> {
    private final my dragAndDropSourceHandler;

    public LegacyDragAndDropSourceWithDefaultShadowElement(my myVar) {
        this.dragAndDropSourceHandler = myVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LegacyDragSourceNodeWithDefaultPainter create() {
        return new LegacyDragSourceNodeWithDefaultPainter(this.dragAndDropSourceHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LegacyDragAndDropSourceWithDefaultShadowElement) {
            return q10.b(this.dragAndDropSourceHandler, ((LegacyDragAndDropSourceWithDefaultShadowElement) obj).dragAndDropSourceHandler);
        }
        return false;
    }

    public final my getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.dragAndDropSourceHandler.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSourceWithDefaultPainter");
        inspectorInfo.getProperties().set("dragAndDropSourceHandler", this.dragAndDropSourceHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LegacyDragSourceNodeWithDefaultPainter legacyDragSourceNodeWithDefaultPainter) {
        legacyDragSourceNodeWithDefaultPainter.setDragAndDropSourceHandler(this.dragAndDropSourceHandler);
    }
}
