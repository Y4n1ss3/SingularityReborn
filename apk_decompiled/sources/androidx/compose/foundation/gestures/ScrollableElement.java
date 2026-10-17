package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kp0;
import defpackage.q10;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ScrollableElement extends ModifierNodeElement<ScrollableNode> {
    private final BringIntoViewSpec bringIntoViewSpec;
    private final boolean enabled;
    private final FlingBehavior flingBehavior;
    private final MutableInteractionSource interactionSource;
    private final Orientation orientation;
    private final OverscrollEffect overscrollEffect;
    private final boolean reverseDirection;
    private final ScrollableState state;

    public ScrollableElement(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        this.state = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.enabled = z;
        this.reverseDirection = z2;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ScrollableNode create() {
        return new ScrollableNode(this.state, this.overscrollEffect, this.flingBehavior, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.bringIntoViewSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return q10.b(this.state, scrollableElement.state) && this.orientation == scrollableElement.orientation && q10.b(this.overscrollEffect, scrollableElement.overscrollEffect) && this.enabled == scrollableElement.enabled && this.reverseDirection == scrollableElement.reverseDirection && q10.b(this.flingBehavior, scrollableElement.flingBehavior) && q10.b(this.interactionSource, scrollableElement.interactionSource) && q10.b(this.bringIntoViewSpec, scrollableElement.bringIntoViewSpec);
    }

    public final BringIntoViewSpec getBringIntoViewSpec() {
        return this.bringIntoViewSpec;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final OverscrollEffect getOverscrollEffect() {
        return this.overscrollEffect;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    public final ScrollableState getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = (this.orientation.hashCode() + (this.state.hashCode() * 31)) * 31;
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        int c = kp0.c(kp0.c((hashCode + (overscrollEffect != null ? overscrollEffect.hashCode() : 0)) * 31, 31, this.enabled), 31, this.reverseDirection);
        FlingBehavior flingBehavior = this.flingBehavior;
        int hashCode2 = (c + (flingBehavior != null ? flingBehavior.hashCode() : 0)) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int hashCode3 = (hashCode2 + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        BringIntoViewSpec bringIntoViewSpec = this.bringIntoViewSpec;
        return hashCode3 + (bringIntoViewSpec != null ? bringIntoViewSpec.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("scrollable");
        inspectorInfo.getProperties().set("orientation", this.orientation);
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("overscrollEffect", this.overscrollEffect);
        uf.d(this.reverseDirection, uf.d(this.enabled, inspectorInfo.getProperties(), "enabled", inspectorInfo), "reverseDirection", inspectorInfo).set("flingBehavior", this.flingBehavior);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("bringIntoViewSpec", this.bringIntoViewSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ScrollableNode scrollableNode) {
        scrollableNode.update(this.state, this.orientation, this.overscrollEffect, this.enabled, this.reverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }
}
