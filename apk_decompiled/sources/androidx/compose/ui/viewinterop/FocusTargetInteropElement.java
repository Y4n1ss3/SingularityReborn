package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class FocusTargetInteropElement extends ModifierNodeElement<FocusTargetInteropNode> {
    public static final FocusTargetInteropElement INSTANCE = new FocusTargetInteropElement();

    private FocusTargetInteropElement() {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusTargetInteropNode create() {
        return new FocusTargetInteropNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return 1019320052;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusTargetInterop");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FocusTargetInteropNode focusTargetInteropNode) {
    }
}
