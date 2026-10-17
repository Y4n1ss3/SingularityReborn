package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kp0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class LazyLayoutBeyondBoundsModifierElement extends ModifierNodeElement<LazyLayoutBeyondBoundsProviderModifierNode> {
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final Orientation orientation;
    private final boolean reverseLayout;
    private final LazyLayoutBeyondBoundsState state;

    public LazyLayoutBeyondBoundsModifierElement(LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z, Orientation orientation) {
        this.state = lazyLayoutBeyondBoundsState;
        this.beyondBoundsInfo = lazyLayoutBeyondBoundsInfo;
        this.reverseLayout = z;
        this.orientation = orientation;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LazyLayoutBeyondBoundsProviderModifierNode create() {
        return new LazyLayoutBeyondBoundsProviderModifierNode(this.state, this.beyondBoundsInfo, this.reverseLayout, this.orientation);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return q10.b(this.state, lazyLayoutBeyondBoundsModifierElement.state) && q10.b(this.beyondBoundsInfo, lazyLayoutBeyondBoundsModifierElement.beyondBoundsInfo) && this.reverseLayout == lazyLayoutBeyondBoundsModifierElement.reverseLayout && this.orientation == lazyLayoutBeyondBoundsModifierElement.orientation;
    }

    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    public final LazyLayoutBeyondBoundsState getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.orientation.hashCode() + kp0.c((this.beyondBoundsInfo.hashCode() + (this.state.hashCode() * 31)) * 31, 31, this.reverseLayout);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LazyLayoutBeyondBoundsProviderModifierNode lazyLayoutBeyondBoundsProviderModifierNode) {
        lazyLayoutBeyondBoundsProviderModifierNode.update(this.state, this.beyondBoundsInfo, this.reverseLayout, this.orientation);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }
}
