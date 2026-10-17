package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.SiblingsAlignedNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WithAlignmentLineBlockElement extends ModifierNodeElement<SiblingsAlignedNode.WithAlignmentLineBlockNode> {
    public static final int $stable = 0;
    private final ky block;

    public WithAlignmentLineBlockElement(ky kyVar) {
        this.block = kyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SiblingsAlignedNode.WithAlignmentLineBlockNode create() {
        return new SiblingsAlignedNode.WithAlignmentLineBlockNode(this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineBlockElement withAlignmentLineBlockElement = obj instanceof WithAlignmentLineBlockElement ? (WithAlignmentLineBlockElement) obj : null;
        return withAlignmentLineBlockElement != null && this.block == withAlignmentLineBlockElement.block;
    }

    public final ky getBlock() {
        return this.block;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("alignBy");
        inspectorInfo.setValue(this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SiblingsAlignedNode.WithAlignmentLineBlockNode withAlignmentLineBlockNode) {
        withAlignmentLineBlockNode.setBlock(this.block);
    }
}
