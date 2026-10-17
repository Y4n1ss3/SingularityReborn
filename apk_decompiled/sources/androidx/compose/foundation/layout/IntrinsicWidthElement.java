package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class IntrinsicWidthElement extends ModifierNodeElement<IntrinsicWidthNode> {
    private final boolean enforceIncoming;
    private final ky inspectorInfo;
    private final IntrinsicSize width;

    public IntrinsicWidthElement(IntrinsicSize intrinsicSize, boolean z, ky kyVar) {
        this.width = intrinsicSize;
        this.enforceIncoming = z;
        this.inspectorInfo = kyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public IntrinsicWidthNode create() {
        return new IntrinsicWidthNode(this.width, this.enforceIncoming);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.width == intrinsicWidthElement.width && this.enforceIncoming == intrinsicWidthElement.enforceIncoming;
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public final ky getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final IntrinsicSize getWidth() {
        return this.width;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.enforceIncoming) + (this.width.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(IntrinsicWidthNode intrinsicWidthNode) {
        intrinsicWidthNode.setWidth(this.width);
        intrinsicWidthNode.setEnforceIncoming(this.enforceIncoming);
    }
}
