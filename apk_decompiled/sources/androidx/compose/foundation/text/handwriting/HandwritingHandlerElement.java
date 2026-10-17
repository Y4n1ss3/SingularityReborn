package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class HandwritingHandlerElement extends ModifierNodeElement<HandwritingHandlerNode> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public HandwritingHandlerNode create() {
        return new HandwritingHandlerNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return obj instanceof HandwritingHandlerElement;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("handwritingHandler");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(HandwritingHandlerNode handwritingHandlerNode) {
    }
}
