package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.my;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DraggableAnchorsElement<T> extends ModifierNodeElement<DraggableAnchorsNode<T>> {
    private final my anchors;
    private final Orientation orientation;
    private final AnchoredDraggableState<T> state;

    public DraggableAnchorsElement(AnchoredDraggableState<T> anchoredDraggableState, my myVar, Orientation orientation) {
        this.state = anchoredDraggableState;
        this.anchors = myVar;
        this.orientation = orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DraggableAnchorsNode<T> create() {
        return new DraggableAnchorsNode<>(this.state, this.anchors, this.orientation);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return q10.b(this.state, draggableAnchorsElement.state) && this.anchors == draggableAnchorsElement.anchors && this.orientation == draggableAnchorsElement.orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.orientation.hashCode() + ((this.anchors.hashCode() + (this.state.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            new DraggableAnchorsElement$inspectableProperties$$inlined$debugInspectorInfo$1(this);
        } else {
            InspectableValueKt.getNoInspectorInfo();
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DraggableAnchorsNode<T> draggableAnchorsNode) {
        draggableAnchorsNode.setState(this.state);
        draggableAnchorsNode.setAnchors(this.anchors);
        draggableAnchorsNode.setOrientation(this.orientation);
    }
}
