package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class OverscrollModifierElement extends ModifierNodeElement<OverscrollModifierNode> {
    private final OverscrollEffect overscrollEffect;

    public OverscrollModifierElement(OverscrollEffect overscrollEffect) {
        this.overscrollEffect = overscrollEffect;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OverscrollModifierNode create() {
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        return new OverscrollModifierNode(overscrollEffect != null ? overscrollEffect.getNode() : null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverscrollModifierElement) && q10.b(this.overscrollEffect, ((OverscrollModifierElement) obj).overscrollEffect);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        if (overscrollEffect != null) {
            return overscrollEffect.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("overscroll");
        inspectorInfo.getProperties().set("overscrollEffect", this.overscrollEffect);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OverscrollModifierNode overscrollModifierNode) {
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        overscrollModifierNode.update(overscrollEffect != null ? overscrollEffect.getNode() : null);
    }
}
