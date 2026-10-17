package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.dq;
import defpackage.kp0;
import defpackage.q10;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AnchoredDraggableElement<T> extends ModifierNodeElement<AnchoredDraggableNode<T>> {
    private final boolean enabled;
    private final FlingBehavior flingBehavior;
    private final MutableInteractionSource interactionSource;
    private final Orientation orientation;
    private final OverscrollEffect overscrollEffect;
    private final Boolean reverseDirection;
    private final Boolean startDragImmediately;
    private final AnchoredDraggableState<T> state;

    public AnchoredDraggableElement(AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z, Boolean bool, MutableInteractionSource mutableInteractionSource, Boolean bool2, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior) {
        this.state = anchoredDraggableState;
        this.orientation = orientation;
        this.enabled = z;
        this.reverseDirection = bool;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = bool2;
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public AnchoredDraggableNode<T> create() {
        return new AnchoredDraggableNode<>(this.state, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.overscrollEffect, this.startDragImmediately, this.flingBehavior);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchoredDraggableElement)) {
            return false;
        }
        AnchoredDraggableElement anchoredDraggableElement = (AnchoredDraggableElement) obj;
        return q10.b(this.state, anchoredDraggableElement.state) && this.orientation == anchoredDraggableElement.orientation && this.enabled == anchoredDraggableElement.enabled && q10.b(this.reverseDirection, anchoredDraggableElement.reverseDirection) && q10.b(this.interactionSource, anchoredDraggableElement.interactionSource) && q10.b(this.startDragImmediately, anchoredDraggableElement.startDragImmediately) && q10.b(this.overscrollEffect, anchoredDraggableElement.overscrollEffect) && q10.b(this.flingBehavior, anchoredDraggableElement.flingBehavior);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int c = kp0.c((this.orientation.hashCode() + (this.state.hashCode() * 31)) * 31, 31, this.enabled);
        Boolean bool = this.reverseDirection;
        int hashCode = (c + (bool != null ? bool.hashCode() : 0)) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int hashCode2 = (hashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        Boolean bool2 = this.startDragImmediately;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        int hashCode4 = (hashCode3 + (overscrollEffect != null ? overscrollEffect.hashCode() : 0)) * 31;
        FlingBehavior flingBehavior = this.flingBehavior;
        return hashCode4 + (flingBehavior != null ? flingBehavior.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("anchoredDraggable");
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("orientation", this.orientation);
        uf.d(this.enabled, inspectorInfo.getProperties(), "enabled", inspectorInfo).set("reverseDirection", this.reverseDirection);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("startDragImmediately", this.startDragImmediately);
        inspectorInfo.getProperties().set("overscrollEffect", this.overscrollEffect);
        inspectorInfo.getProperties().set("flingBehavior", this.flingBehavior);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(AnchoredDraggableNode<T> anchoredDraggableNode) {
        anchoredDraggableNode.update(this.state, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.overscrollEffect, this.startDragImmediately, this.flingBehavior);
    }

    public /* synthetic */ AnchoredDraggableElement(AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z, Boolean bool, MutableInteractionSource mutableInteractionSource, Boolean bool2, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, int i, dq dqVar) {
        this(anchoredDraggableState, orientation, z, bool, mutableInteractionSource, (i & 32) != 0 ? null : bool2, overscrollEffect, (i & Fields.SpotShadowColor) != 0 ? null : flingBehavior);
    }
}
