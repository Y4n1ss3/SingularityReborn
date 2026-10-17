package androidx.compose.foundation.gestures;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kp0;
import defpackage.ky;
import defpackage.q10;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TransformableElement extends ModifierNodeElement<TransformableNode> {
    private final ky canPan;
    private final boolean enabled;
    private final boolean lockRotationOnZoomPan;
    private final TransformableState state;

    public TransformableElement(TransformableState transformableState, ky kyVar, boolean z, boolean z2) {
        this.state = transformableState;
        this.canPan = kyVar;
        this.lockRotationOnZoomPan = z;
        this.enabled = z2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TransformableNode create() {
        return new TransformableNode(this.state, this.canPan, this.lockRotationOnZoomPan, this.enabled);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransformableElement.class != obj.getClass()) {
            return false;
        }
        TransformableElement transformableElement = (TransformableElement) obj;
        return q10.b(this.state, transformableElement.state) && this.canPan == transformableElement.canPan && this.lockRotationOnZoomPan == transformableElement.lockRotationOnZoomPan && this.enabled == transformableElement.enabled;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.enabled) + kp0.c((this.canPan.hashCode() + (this.state.hashCode() * 31)) * 31, 31, this.lockRotationOnZoomPan);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("transformable");
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("canPan", this.canPan);
        uf.d(this.enabled, inspectorInfo.getProperties(), "enabled", inspectorInfo).set("lockRotationOnZoomPan", Boolean.valueOf(this.lockRotationOnZoomPan));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TransformableNode transformableNode) {
        transformableNode.update(this.state, this.canPan, this.lockRotationOnZoomPan, this.enabled);
    }
}
