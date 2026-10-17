package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.my;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DraggableAnchorsElementV2<T> extends ModifierNodeElement<DraggableAnchorsNodeV2<T>> {
    private final my anchors;
    private final Orientation orientation;
    private final androidx.compose.foundation.gestures.AnchoredDraggableState<T> state;

    public DraggableAnchorsElementV2(androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, my myVar, Orientation orientation) {
        this.state = anchoredDraggableState;
        this.anchors = myVar;
        this.orientation = orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DraggableAnchorsNodeV2<T> create() {
        return new DraggableAnchorsNodeV2<>(this.state, this.anchors, this.orientation);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElementV2)) {
            return false;
        }
        DraggableAnchorsElementV2 draggableAnchorsElementV2 = (DraggableAnchorsElementV2) obj;
        return q10.b(this.state, draggableAnchorsElementV2.state) && this.anchors == draggableAnchorsElementV2.anchors && this.orientation == draggableAnchorsElementV2.orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.orientation.hashCode() + ((this.anchors.hashCode() + (this.state.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            new DraggableAnchorsElementV2$inspectableProperties$$inlined$debugInspectorInfo$1(this);
        } else {
            InspectableValueKt.getNoInspectorInfo();
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DraggableAnchorsNodeV2<T> draggableAnchorsNodeV2) {
        draggableAnchorsNodeV2.setState(this.state);
        draggableAnchorsNodeV2.setAnchors(this.anchors);
        draggableAnchorsNodeV2.setOrientation(this.orientation);
    }
}
