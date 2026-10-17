package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class BoxChildDataElement extends ModifierNodeElement<BoxChildDataNode> {
    private final Alignment alignment;
    private final ky inspectorInfo;
    private final boolean matchParentSize;

    public BoxChildDataElement(Alignment alignment, boolean z, ky kyVar) {
        this.alignment = alignment;
        this.matchParentSize = z;
        this.inspectorInfo = kyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BoxChildDataNode create() {
        return new BoxChildDataNode(this.alignment, this.matchParentSize);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && q10.b(this.alignment, boxChildDataElement.alignment) && this.matchParentSize == boxChildDataElement.matchParentSize;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final ky getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.matchParentSize) + (this.alignment.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BoxChildDataNode boxChildDataNode) {
        boxChildDataNode.setAlignment(this.alignment);
        boxChildDataNode.setMatchParentSize(this.matchParentSize);
    }
}
