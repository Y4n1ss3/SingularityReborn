package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kp0;
import defpackage.q10;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ScrollableAreaElement extends ModifierNodeElement<ScrollableAreaNode> {
    private final BringIntoViewSpec bringIntoViewSpec;
    private final boolean enabled;
    private final FlingBehavior flingBehavior;
    private final MutableInteractionSource interactionSource;
    private final Orientation orientation;
    private final OverscrollEffect overscrollEffect;
    private final boolean reverseScrolling;
    private final ScrollableState state;
    private final boolean useLocalOverscrollFactory;

    public ScrollableAreaElement(ScrollableState scrollableState, Orientation orientation, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec, boolean z3, OverscrollEffect overscrollEffect) {
        this.state = scrollableState;
        this.orientation = orientation;
        this.enabled = z;
        this.reverseScrolling = z2;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.useLocalOverscrollFactory = z3;
        this.overscrollEffect = overscrollEffect;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ScrollableAreaNode create() {
        return new ScrollableAreaNode(this.state, this.orientation, this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec, this.useLocalOverscrollFactory, this.overscrollEffect);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollableAreaElement.class != obj.getClass()) {
            return false;
        }
        ScrollableAreaElement scrollableAreaElement = (ScrollableAreaElement) obj;
        return q10.b(this.state, scrollableAreaElement.state) && this.orientation == scrollableAreaElement.orientation && this.enabled == scrollableAreaElement.enabled && this.reverseScrolling == scrollableAreaElement.reverseScrolling && q10.b(this.flingBehavior, scrollableAreaElement.flingBehavior) && q10.b(this.interactionSource, scrollableAreaElement.interactionSource) && q10.b(this.bringIntoViewSpec, scrollableAreaElement.bringIntoViewSpec) && this.useLocalOverscrollFactory == scrollableAreaElement.useLocalOverscrollFactory && q10.b(this.overscrollEffect, scrollableAreaElement.overscrollEffect);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int c = kp0.c(kp0.c((this.orientation.hashCode() + (this.state.hashCode() * 31)) * 31, 31, this.enabled), 31, this.reverseScrolling);
        FlingBehavior flingBehavior = this.flingBehavior;
        int hashCode = (c + (flingBehavior != null ? flingBehavior.hashCode() : 0)) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int hashCode2 = (hashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        BringIntoViewSpec bringIntoViewSpec = this.bringIntoViewSpec;
        int c2 = kp0.c((hashCode2 + (bringIntoViewSpec != null ? bringIntoViewSpec.hashCode() : 0)) * 31, 31, this.useLocalOverscrollFactory);
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        return c2 + (overscrollEffect != null ? overscrollEffect.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("scrollableArea");
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("orientation", this.orientation);
        if (!this.useLocalOverscrollFactory) {
            inspectorInfo.getProperties().set("overscrollEffect", this.overscrollEffect);
        }
        uf.d(this.reverseScrolling, uf.d(this.enabled, inspectorInfo.getProperties(), "enabled", inspectorInfo), "reverseScrolling", inspectorInfo).set("flingBehavior", this.flingBehavior);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("bringIntoViewSpec", this.bringIntoViewSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ScrollableAreaNode scrollableAreaNode) {
        scrollableAreaNode.update(this.state, this.orientation, this.useLocalOverscrollFactory, this.overscrollEffect, this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }
}
