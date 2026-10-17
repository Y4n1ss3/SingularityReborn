package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FocusEventElement extends ModifierNodeElement<FocusEventNode> {
    private final ky onFocusEvent;

    public FocusEventElement(ky kyVar) {
        this.onFocusEvent = kyVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusEventNode create() {
        return new FocusEventNode(this.onFocusEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusEventElement) && this.onFocusEvent == ((FocusEventElement) obj).onFocusEvent;
    }

    public final ky getOnFocusEvent() {
        return this.onFocusEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onFocusEvent.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFocusEvent");
        inspectorInfo.getProperties().set("onFocusEvent", this.onFocusEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FocusEventNode focusEventNode) {
        focusEventNode.setOnFocusEvent(this.onFocusEvent);
    }
}
