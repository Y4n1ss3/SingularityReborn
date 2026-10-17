package androidx.compose.foundation.relocation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends ModifierNodeElement<BringIntoViewRequesterNode> {
    private final BringIntoViewRequester requester;

    public BringIntoViewRequesterElement(BringIntoViewRequester bringIntoViewRequester) {
        this.requester = bringIntoViewRequester;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BringIntoViewRequesterNode create() {
        return new BringIntoViewRequesterNode(this.requester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BringIntoViewRequesterElement) && q10.b(this.requester, ((BringIntoViewRequesterElement) obj).requester);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.requester.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("bringIntoViewRequester");
        inspectorInfo.getProperties().set("bringIntoViewRequester", this.requester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BringIntoViewRequesterNode bringIntoViewRequesterNode) {
        bringIntoViewRequesterNode.updateRequester(this.requester);
    }
}
