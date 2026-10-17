package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class RecalculateWindowInsetsModifierElement extends ModifierNodeElement<RecalculateWindowInsetsModifierNode> {
    public static final RecalculateWindowInsetsModifierElement INSTANCE = new RecalculateWindowInsetsModifierElement();

    private RecalculateWindowInsetsModifierElement() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public RecalculateWindowInsetsModifierNode create() {
        return new RecalculateWindowInsetsModifierNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("recalculateWindowInsets");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(RecalculateWindowInsetsModifierNode recalculateWindowInsetsModifierNode) {
    }
}
