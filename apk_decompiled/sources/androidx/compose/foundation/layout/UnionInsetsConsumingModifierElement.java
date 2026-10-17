package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class UnionInsetsConsumingModifierElement extends ModifierNodeElement<UnionInsetsConsumingModifierNode> {
    private final WindowInsets insets;
    private final ky inspectorInfo;

    public UnionInsetsConsumingModifierElement(WindowInsets windowInsets, ky kyVar) {
        this.insets = windowInsets;
        this.inspectorInfo = kyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public UnionInsetsConsumingModifierNode create() {
        return new UnionInsetsConsumingModifierNode(this.insets);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnionInsetsConsumingModifierElement) {
            return q10.b(((UnionInsetsConsumingModifierElement) obj).insets, this.insets);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.insets.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(UnionInsetsConsumingModifierNode unionInsetsConsumingModifierNode) {
        unionInsetsConsumingModifierNode.update(this.insets);
    }
}
