package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ConsumedInsetsModifierElement extends ModifierNodeElement<ConsumedInsetsModifierNode> {
    private final ky block;
    private final ky inspectorInfo;

    public ConsumedInsetsModifierElement(ky kyVar, ky kyVar2) {
        this.block = kyVar;
        this.inspectorInfo = kyVar2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ConsumedInsetsModifierNode create() {
        return new ConsumedInsetsModifierNode(this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConsumedInsetsModifierElement) && ((ConsumedInsetsModifierElement) obj).block == this.block;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ConsumedInsetsModifierNode consumedInsetsModifierNode) {
        consumedInsetsModifierNode.update(this.block);
    }
}
