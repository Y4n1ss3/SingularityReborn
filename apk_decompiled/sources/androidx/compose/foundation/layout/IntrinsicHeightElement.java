package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class IntrinsicHeightElement extends ModifierNodeElement<IntrinsicHeightNode> {
    private final boolean enforceIncoming;
    private final IntrinsicSize height;
    private final ky inspectorInfo;

    public IntrinsicHeightElement(IntrinsicSize intrinsicSize, boolean z, ky kyVar) {
        this.height = intrinsicSize;
        this.enforceIncoming = z;
        this.inspectorInfo = kyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public IntrinsicHeightNode create() {
        return new IntrinsicHeightNode(this.height, this.enforceIncoming);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.height == intrinsicHeightElement.height && this.enforceIncoming == intrinsicHeightElement.enforceIncoming;
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public final IntrinsicSize getHeight() {
        return this.height;
    }

    public final ky getInspectorInfo() {
        return this.inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.enforceIncoming) + (this.height.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(IntrinsicHeightNode intrinsicHeightNode) {
        intrinsicHeightNode.setHeight(this.height);
        intrinsicHeightNode.setEnforceIncoming(this.enforceIncoming);
    }
}
