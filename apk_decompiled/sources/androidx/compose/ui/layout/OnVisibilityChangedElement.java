package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.bv;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class OnVisibilityChangedElement extends ModifierNodeElement<OnVisibilityChangedNode> {
    private final ky callback;
    private final long minDurationMs;
    private final float minFractionVisible;
    private final LayoutBoundsHolder viewportBounds;

    public OnVisibilityChangedElement(long j, float f, LayoutBoundsHolder layoutBoundsHolder, ky kyVar) {
        this.minDurationMs = j;
        this.minFractionVisible = f;
        this.viewportBounds = layoutBoundsHolder;
        this.callback = kyVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OnVisibilityChangedNode create() {
        return new OnVisibilityChangedNode(this.minDurationMs, this.minFractionVisible, this.viewportBounds, this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && OnVisibilityChangedElement.class == obj.getClass()) {
            OnVisibilityChangedElement onVisibilityChangedElement = (OnVisibilityChangedElement) obj;
            return this.minDurationMs == onVisibilityChangedElement.minDurationMs && this.minFractionVisible == onVisibilityChangedElement.minFractionVisible && q10.b(this.viewportBounds, onVisibilityChangedElement.viewportBounds) && this.callback == onVisibilityChangedElement.callback;
        }
        return false;
    }

    public final ky getCallback() {
        return this.callback;
    }

    public final long getMinDurationMs() {
        return this.minDurationMs;
    }

    public final float getMinFractionVisible() {
        return this.minFractionVisible;
    }

    public final LayoutBoundsHolder getViewportBounds() {
        return this.viewportBounds;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int a = bv.a(this.minFractionVisible, Long.hashCode(this.minDurationMs) * 31, 31);
        LayoutBoundsHolder layoutBoundsHolder = this.viewportBounds;
        return this.callback.hashCode() + ((a + (layoutBoundsHolder != null ? layoutBoundsHolder.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onViewportVisibilityChanged");
        inspectorInfo.getProperties().set("minDurationMs", Long.valueOf(this.minDurationMs));
        inspectorInfo.getProperties().set("minFractionVisible", Float.valueOf(this.minFractionVisible));
        inspectorInfo.getProperties().set("viewportRef", this.viewportBounds);
        inspectorInfo.getProperties().set("callback", this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OnVisibilityChangedNode onVisibilityChangedNode) {
        onVisibilityChangedNode.setMinDurationMs(this.minDurationMs);
        onVisibilityChangedNode.setMinFractionVisible(this.minFractionVisible);
        onVisibilityChangedNode.setCallback(this.callback);
        onVisibilityChangedNode.setViewportBounds(this.viewportBounds);
        onVisibilityChangedNode.forceUpdate();
    }
}
