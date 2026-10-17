package androidx.compose.material3;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ExposedDropdownMenuAnchorElement extends ModifierNodeElement<ExposedDropdownMenuAnchorNode> {
    private final iy updateStateOnAttach;

    public ExposedDropdownMenuAnchorElement(iy iyVar) {
        this.updateStateOnAttach = iyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ExposedDropdownMenuAnchorNode create() {
        return new ExposedDropdownMenuAnchorNode(this.updateStateOnAttach);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExposedDropdownMenuAnchorElement) && this.updateStateOnAttach == ((ExposedDropdownMenuAnchorElement) obj).updateStateOnAttach;
    }

    public final iy getUpdateStateOnAttach() {
        return this.updateStateOnAttach;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.updateStateOnAttach.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("exposedDropdownMenuAnchorType");
        inspectorInfo.getProperties().set("updateStateOnAttach", this.updateStateOnAttach);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ExposedDropdownMenuAnchorNode exposedDropdownMenuAnchorNode) {
        exposedDropdownMenuAnchorNode.setUpdateStateOnAttach(this.updateStateOnAttach);
    }
}
