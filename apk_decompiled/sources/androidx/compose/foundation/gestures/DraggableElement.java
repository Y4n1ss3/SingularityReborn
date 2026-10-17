package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.dq;
import defpackage.kp0;
import defpackage.ky;
import defpackage.ny;
import defpackage.q10;
import defpackage.qo;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DraggableElement extends ModifierNodeElement<DraggableNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final MutableInteractionSource interactionSource;
    private final ny onDragStarted;
    private final ny onDragStopped;
    private final Orientation orientation;
    private final boolean reverseDirection;
    private final boolean startDragImmediately;
    private final DraggableState state;
    public static final Companion Companion = new Companion(null);
    private static final ky CanDrag = new qo(16);

    public DraggableElement(DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, ny nyVar, ny nyVar2, boolean z3) {
        this.state = draggableState;
        this.orientation = orientation;
        this.enabled = z;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = z2;
        this.onDragStarted = nyVar;
        this.onDragStopped = nyVar2;
        this.reverseDirection = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CanDrag$lambda$0(PointerType pointerType) {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DraggableNode create() {
        return new DraggableNode(this.state, CanDrag, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return q10.b(this.state, draggableElement.state) && this.orientation == draggableElement.orientation && this.enabled == draggableElement.enabled && q10.b(this.interactionSource, draggableElement.interactionSource) && this.startDragImmediately == draggableElement.startDragImmediately && q10.b(this.onDragStarted, draggableElement.onDragStarted) && q10.b(this.onDragStopped, draggableElement.onDragStopped) && this.reverseDirection == draggableElement.reverseDirection;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int c = kp0.c((this.orientation.hashCode() + (this.state.hashCode() * 31)) * 31, 31, this.enabled);
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        return Boolean.hashCode(this.reverseDirection) + ((this.onDragStopped.hashCode() + ((this.onDragStarted.hashCode() + kp0.c((c + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31, 31, this.startDragImmediately)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("draggable");
        inspectorInfo.getProperties().set("orientation", this.orientation);
        uf.d(this.reverseDirection, uf.d(this.enabled, inspectorInfo.getProperties(), "enabled", inspectorInfo), "reverseDirection", inspectorInfo).set("interactionSource", this.interactionSource);
        uf.d(this.startDragImmediately, inspectorInfo.getProperties(), "startDragImmediately", inspectorInfo).set("onDragStarted", this.onDragStarted);
        inspectorInfo.getProperties().set("onDragStopped", this.onDragStopped);
        inspectorInfo.getProperties().set("state", this.state);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DraggableNode draggableNode) {
        draggableNode.update(this.state, CanDrag, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final ky getCanDrag() {
            return DraggableElement.CanDrag;
        }

        private Companion() {
        }
    }
}
