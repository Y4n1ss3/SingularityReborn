package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class BringIntoViewElement extends ModifierNodeElement<BringIntoViewNode> {
    private final ky onRequesterReady;

    public BringIntoViewElement(ky kyVar) {
        this.onRequesterReady = kyVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BringIntoViewNode create() {
        return new BringIntoViewNode(this.onRequesterReady);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BringIntoViewElement) && this.onRequesterReady == ((BringIntoViewElement) obj).onRequesterReady;
        }
        return true;
    }

    public final ky getOnRequesterReady() {
        return this.onRequesterReady;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onRequesterReady.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("requestRectangleBringIntoViewBridge");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BringIntoViewNode bringIntoViewNode) {
        bringIntoViewNode.update(this.onRequesterReady);
    }
}
