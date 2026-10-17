package androidx.compose.foundation.relocation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class BringIntoViewResponderElement extends ModifierNodeElement<BringIntoViewResponderNode> {
    private final BringIntoViewResponder responder;

    public BringIntoViewResponderElement(BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BringIntoViewResponderNode create() {
        return new BringIntoViewResponderNode(this.responder);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BringIntoViewResponderElement) && q10.b(this.responder, ((BringIntoViewResponderElement) obj).responder);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.responder.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("bringIntoViewResponder");
        inspectorInfo.getProperties().set("responder", this.responder);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BringIntoViewResponderNode bringIntoViewResponderNode) {
        bringIntoViewResponderNode.setResponder(this.responder);
    }
}
