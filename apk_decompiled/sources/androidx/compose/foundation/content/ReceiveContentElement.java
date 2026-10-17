package androidx.compose.foundation.content;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ReceiveContentElement extends ModifierNodeElement<ReceiveContentNode> {
    public static final int $stable = 0;
    private final ReceiveContentListener receiveContentListener;

    public ReceiveContentElement(ReceiveContentListener receiveContentListener) {
        this.receiveContentListener = receiveContentListener;
    }

    public static /* synthetic */ ReceiveContentElement copy$default(ReceiveContentElement receiveContentElement, ReceiveContentListener receiveContentListener, int i, Object obj) {
        if ((i & 1) != 0) {
            receiveContentListener = receiveContentElement.receiveContentListener;
        }
        return receiveContentElement.copy(receiveContentListener);
    }

    public final ReceiveContentListener component1() {
        return this.receiveContentListener;
    }

    public final ReceiveContentElement copy(ReceiveContentListener receiveContentListener) {
        return new ReceiveContentElement(receiveContentListener);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ReceiveContentNode create() {
        return new ReceiveContentNode(this.receiveContentListener);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReceiveContentElement) && q10.b(this.receiveContentListener, ((ReceiveContentElement) obj).receiveContentListener);
    }

    public final ReceiveContentListener getReceiveContentListener() {
        return this.receiveContentListener;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.receiveContentListener.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("receiveContent");
    }

    public String toString() {
        return "ReceiveContentElement(receiveContentListener=" + this.receiveContentListener + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ReceiveContentNode receiveContentNode) {
        receiveContentNode.updateNode(this.receiveContentListener);
    }
}
