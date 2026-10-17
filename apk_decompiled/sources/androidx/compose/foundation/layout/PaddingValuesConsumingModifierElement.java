package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class PaddingValuesConsumingModifierElement extends ModifierNodeElement<PaddingValuesConsumingModifierNode> {
    private final ky inspectorInfo;
    private final PaddingValues paddingValues;

    public PaddingValuesConsumingModifierElement(PaddingValues paddingValues, ky kyVar) {
        this.paddingValues = paddingValues;
        this.inspectorInfo = kyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PaddingValuesConsumingModifierNode create() {
        return new PaddingValuesConsumingModifierNode(this.paddingValues);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PaddingValuesConsumingModifierElement) {
            return q10.b(((PaddingValuesConsumingModifierElement) obj).paddingValues, this.paddingValues);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(PaddingValuesConsumingModifierNode paddingValuesConsumingModifierNode) {
        paddingValuesConsumingModifierNode.update(this.paddingValues);
    }
}
