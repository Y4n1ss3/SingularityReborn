package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class PreferKeepClearElement extends ModifierNodeElement<PreferKeepClearNode> {
    private final ky clearRect;

    public PreferKeepClearElement(ky kyVar) {
        this.clearRect = kyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PreferKeepClearNode create() {
        return new PreferKeepClearNode(this.clearRect);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return (obj instanceof PreferKeepClearNode) && this.clearRect == ((PreferKeepClearNode) obj).getRect();
    }

    public final ky getClearRect() {
        return this.clearRect;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        ky kyVar = this.clearRect;
        if (kyVar != null) {
            return kyVar.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("preferKeepClearBounds");
        if (this.clearRect != null) {
            inspectorInfo.getProperties().set("clearRect", this.clearRect);
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(PreferKeepClearNode preferKeepClearNode) {
        preferKeepClearNode.setRect(this.clearRect);
    }
}
