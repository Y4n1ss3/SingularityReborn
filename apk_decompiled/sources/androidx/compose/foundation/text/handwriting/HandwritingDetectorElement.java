package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class HandwritingDetectorElement extends ModifierNodeElement<HandwritingDetectorNode> {
    private final iy callback;

    public HandwritingDetectorElement(iy iyVar) {
        this.callback = iyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public HandwritingDetectorNode create() {
        return new HandwritingDetectorNode(this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        boolean z = false;
        boolean z2 = this == obj;
        if ((obj instanceof HandwritingDetectorElement) && this.callback == ((HandwritingDetectorElement) obj).callback) {
            z = true;
        }
        return z2 | z;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.callback.hashCode() * 31;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("handwritingDetector");
        inspectorInfo.getProperties().set("callback", this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(HandwritingDetectorNode handwritingDetectorNode) {
        handwritingDetectorNode.setCallback(this.callback);
    }
}
