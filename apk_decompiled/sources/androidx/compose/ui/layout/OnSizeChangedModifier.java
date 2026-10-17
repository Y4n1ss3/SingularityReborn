package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class OnSizeChangedModifier extends ModifierNodeElement<OnSizeChangedNode> {
    private final ky onSizeChanged;

    public OnSizeChangedModifier(ky kyVar) {
        this.onSizeChanged = kyVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OnSizeChangedNode create() {
        return new OnSizeChangedNode(this.onSizeChanged);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnSizeChangedModifier) && this.onSizeChanged == ((OnSizeChangedModifier) obj).onSizeChanged;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onSizeChanged.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onSizeChanged");
        inspectorInfo.getProperties().set("onSizeChanged", this.onSizeChanged);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OnSizeChangedNode onSizeChangedNode) {
        onSizeChangedNode.update(this.onSizeChanged);
    }
}
