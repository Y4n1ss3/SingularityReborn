package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class HoverableElement extends ModifierNodeElement<HoverableNode> {
    private final MutableInteractionSource interactionSource;

    public HoverableElement(MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public HoverableNode create() {
        return new HoverableNode(this.interactionSource);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && q10.b(((HoverableElement) obj).interactionSource, this.interactionSource);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.interactionSource.hashCode() * 31;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("hoverable");
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("enabled", Boolean.TRUE);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(HoverableNode hoverableNode) {
        hoverableNode.updateInteractionSource(this.interactionSource);
    }
}
