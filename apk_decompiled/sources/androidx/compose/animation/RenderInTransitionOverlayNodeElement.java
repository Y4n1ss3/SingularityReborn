package androidx.compose.animation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.iy;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RenderInTransitionOverlayNodeElement extends ModifierNodeElement<RenderInTransitionOverlayNode> {
    public static final int $stable = 0;
    private iy renderInOverlay;
    private SharedTransitionScopeImpl sharedTransitionScope;
    private final float zIndexInOverlay;

    public RenderInTransitionOverlayNodeElement(SharedTransitionScopeImpl sharedTransitionScopeImpl, iy iyVar, float f) {
        this.sharedTransitionScope = sharedTransitionScopeImpl;
        this.renderInOverlay = iyVar;
        this.zIndexInOverlay = f;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public RenderInTransitionOverlayNode create() {
        return new RenderInTransitionOverlayNode(this.sharedTransitionScope, this.renderInOverlay, this.zIndexInOverlay);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (obj instanceof RenderInTransitionOverlayNodeElement) {
            RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement = (RenderInTransitionOverlayNodeElement) obj;
            if (q10.b(this.sharedTransitionScope, renderInTransitionOverlayNodeElement.sharedTransitionScope) && this.renderInOverlay == renderInTransitionOverlayNodeElement.renderInOverlay && this.zIndexInOverlay == renderInTransitionOverlayNodeElement.zIndexInOverlay) {
                return true;
            }
        }
        return false;
    }

    public final iy getRenderInOverlay() {
        return this.renderInOverlay;
    }

    public final SharedTransitionScopeImpl getSharedTransitionScope() {
        return this.sharedTransitionScope;
    }

    public final float getZIndexInOverlay() {
        return this.zIndexInOverlay;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Float.hashCode(this.zIndexInOverlay) + ((this.renderInOverlay.hashCode() + (this.sharedTransitionScope.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("renderInSharedTransitionOverlay");
        inspectorInfo.getProperties().set("sharedTransitionScope", this.sharedTransitionScope);
        inspectorInfo.getProperties().set("renderInOverlay", this.renderInOverlay);
        inspectorInfo.getProperties().set("zIndexInOverlay", Float.valueOf(this.zIndexInOverlay));
    }

    public final void setRenderInOverlay(iy iyVar) {
        this.renderInOverlay = iyVar;
    }

    public final void setSharedTransitionScope(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.sharedTransitionScope = sharedTransitionScopeImpl;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(RenderInTransitionOverlayNode renderInTransitionOverlayNode) {
        renderInTransitionOverlayNode.setSharedScope(this.sharedTransitionScope);
        renderInTransitionOverlayNode.setRenderInOverlay(this.renderInOverlay);
        renderInTransitionOverlayNode.setZIndexInOverlay(this.zIndexInOverlay);
    }
}
