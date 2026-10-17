package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AddTextContextMenuDataComponentsElement extends ModifierNodeElement<AddTextContextMenuDataComponentsNode> {
    private final ky builder;

    public AddTextContextMenuDataComponentsElement(ky kyVar) {
        this.builder = kyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public AddTextContextMenuDataComponentsNode create() {
        return new AddTextContextMenuDataComponentsNode(this.builder);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddTextContextMenuDataComponentsElement) && this.builder == ((AddTextContextMenuDataComponentsElement) obj).builder;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.builder.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("addTextContextMenuDataComponents");
        inspectorInfo.getProperties().set("builder", this.builder);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(AddTextContextMenuDataComponentsNode addTextContextMenuDataComponentsNode) {
        addTextContextMenuDataComponentsNode.setBuilder(this.builder);
    }
}
