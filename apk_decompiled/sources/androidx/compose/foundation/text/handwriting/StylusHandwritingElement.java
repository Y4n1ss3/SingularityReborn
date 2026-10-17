package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class StylusHandwritingElement extends ModifierNodeElement<StylusHandwritingNode> {
    private final iy onHandwritingSlopExceeded;

    public StylusHandwritingElement(iy iyVar) {
        this.onHandwritingSlopExceeded = iyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public StylusHandwritingNode create() {
        return new StylusHandwritingNode(this.onHandwritingSlopExceeded);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElement) && this.onHandwritingSlopExceeded == ((StylusHandwritingElement) obj).onHandwritingSlopExceeded;
    }

    public final iy getOnHandwritingSlopExceeded() {
        return this.onHandwritingSlopExceeded;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onHandwritingSlopExceeded.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("stylusHandwriting");
        inspectorInfo.getProperties().set("onHandwritingSlopExceeded", this.onHandwritingSlopExceeded);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(StylusHandwritingNode stylusHandwritingNode) {
        stylusHandwritingNode.setOnHandwritingSlopExceeded(this.onHandwritingSlopExceeded);
    }
}
