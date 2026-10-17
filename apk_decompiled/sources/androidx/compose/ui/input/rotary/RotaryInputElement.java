package androidx.compose.ui.input.rotary;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class RotaryInputElement extends ModifierNodeElement<RotaryInputNode> {
    private final ky onPreRotaryScrollEvent;
    private final ky onRotaryScrollEvent;

    public RotaryInputElement(ky kyVar, ky kyVar2) {
        this.onRotaryScrollEvent = kyVar;
        this.onPreRotaryScrollEvent = kyVar2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public RotaryInputNode create() {
        return new RotaryInputNode(this.onRotaryScrollEvent, this.onPreRotaryScrollEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return this.onRotaryScrollEvent == rotaryInputElement.onRotaryScrollEvent && this.onPreRotaryScrollEvent == rotaryInputElement.onPreRotaryScrollEvent;
    }

    public final ky getOnPreRotaryScrollEvent() {
        return this.onPreRotaryScrollEvent;
    }

    public final ky getOnRotaryScrollEvent() {
        return this.onRotaryScrollEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        ky kyVar = this.onRotaryScrollEvent;
        int hashCode = (kyVar != null ? kyVar.hashCode() : 0) * 31;
        ky kyVar2 = this.onPreRotaryScrollEvent;
        return hashCode + (kyVar2 != null ? kyVar2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        ky kyVar = this.onRotaryScrollEvent;
        if (kyVar != null) {
            inspectorInfo.setName("onRotaryScrollEvent");
            inspectorInfo.getProperties().set("onRotaryScrollEvent", kyVar);
        }
        ky kyVar2 = this.onPreRotaryScrollEvent;
        if (kyVar2 != null) {
            inspectorInfo.setName("onPreRotaryScrollEvent");
            inspectorInfo.getProperties().set("onPreRotaryScrollEvent", kyVar2);
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(RotaryInputNode rotaryInputNode) {
        rotaryInputNode.setOnEvent(this.onRotaryScrollEvent);
        rotaryInputNode.setOnPreEvent(this.onPreRotaryScrollEvent);
    }
}
