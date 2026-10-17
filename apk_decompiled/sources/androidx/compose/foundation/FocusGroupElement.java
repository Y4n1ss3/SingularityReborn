package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FocusGroupElement extends ModifierNodeElement<FocusGroupNode> {
    public static final FocusGroupElement INSTANCE = new FocusGroupElement();

    private FocusGroupElement() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusGroupNode create() {
        return new FocusGroupNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return -1063782265;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusGroup");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FocusGroupNode focusGroupNode) {
    }
}
