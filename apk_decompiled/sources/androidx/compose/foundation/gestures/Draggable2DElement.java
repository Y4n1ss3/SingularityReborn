package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.dq;
import defpackage.kp0;
import defpackage.ky;
import defpackage.q10;
import defpackage.qo;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Draggable2DElement extends ModifierNodeElement<Draggable2DNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final MutableInteractionSource interactionSource;
    private final ky onDragStarted;
    private final ky onDragStopped;
    private final boolean reverseDirection;
    private final boolean startDragImmediately;
    private final Draggable2DState state;
    public static final Companion Companion = new Companion(null);
    private static final ky CanDrag = new qo(13);

    public Draggable2DElement(Draggable2DState draggable2DState, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, ky kyVar, ky kyVar2, boolean z3) {
        this.state = draggable2DState;
        this.enabled = z;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = z2;
        this.onDragStarted = kyVar;
        this.onDragStopped = kyVar2;
        this.reverseDirection = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CanDrag$lambda$0(PointerType pointerType) {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public Draggable2DNode create() {
        return new Draggable2DNode(this.state, CanDrag, this.enabled, this.interactionSource, this.startDragImmediately, this.reverseDirection, this.onDragStarted, this.onDragStopped);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Draggable2DElement.class != obj.getClass()) {
            return false;
        }
        Draggable2DElement draggable2DElement = (Draggable2DElement) obj;
        return q10.b(this.state, draggable2DElement.state) && this.enabled == draggable2DElement.enabled && q10.b(this.interactionSource, draggable2DElement.interactionSource) && this.startDragImmediately == draggable2DElement.startDragImmediately && this.onDragStarted == draggable2DElement.onDragStarted && this.onDragStopped == draggable2DElement.onDragStopped && this.reverseDirection == draggable2DElement.reverseDirection;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int c = kp0.c(this.state.hashCode() * 31, 31, this.enabled);
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        return Boolean.hashCode(this.reverseDirection) + ((this.onDragStopped.hashCode() + ((this.onDragStarted.hashCode() + kp0.c((c + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31, 31, this.startDragImmediately)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("draggable2D");
        uf.d(this.enabled, inspectorInfo.getProperties(), "enabled", inspectorInfo).set("interactionSource", this.interactionSource);
        uf.d(this.startDragImmediately, inspectorInfo.getProperties(), "startDragImmediately", inspectorInfo).set("onDragStarted", this.onDragStarted);
        inspectorInfo.getProperties().set("onDragStopped", this.onDragStopped);
        uf.d(this.reverseDirection, inspectorInfo.getProperties(), "reverseDirection", inspectorInfo).set("state", this.state);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(Draggable2DNode draggable2DNode) {
        draggable2DNode.update(this.state, CanDrag, this.enabled, this.interactionSource, this.startDragImmediately, this.reverseDirection, this.onDragStarted, this.onDragStopped);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final ky getCanDrag() {
            return Draggable2DElement.CanDrag;
        }

        private Companion() {
        }
    }
}
