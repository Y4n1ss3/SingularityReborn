package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FocusChangedElement extends ModifierNodeElement<FocusChangedNode> {
    private final ky onFocusChanged;

    public FocusChangedElement(ky kyVar) {
        this.onFocusChanged = kyVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusChangedNode create() {
        return new FocusChangedNode(this.onFocusChanged);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && this.onFocusChanged == ((FocusChangedElement) obj).onFocusChanged;
    }

    public final ky getOnFocusChanged() {
        return this.onFocusChanged;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onFocusChanged.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFocusChanged");
        inspectorInfo.getProperties().set("onFocusChanged", this.onFocusChanged);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FocusChangedNode focusChangedNode) {
        focusChangedNode.setOnFocusChanged(this.onFocusChanged);
    }
}
