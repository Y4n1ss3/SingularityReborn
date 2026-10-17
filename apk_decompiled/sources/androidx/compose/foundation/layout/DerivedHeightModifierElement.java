package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DerivedHeightModifierElement extends ModifierNodeElement<DerivedHeightModifierNode> {
    private final my heightCalc;
    private final WindowInsets insets;
    private final ky inspectorInfo;

    public DerivedHeightModifierElement(WindowInsets windowInsets, ky kyVar, my myVar) {
        this.insets = windowInsets;
        this.inspectorInfo = kyVar;
        this.heightCalc = myVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DerivedHeightModifierNode create() {
        return new DerivedHeightModifierNode(this.insets, this.heightCalc);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedHeightModifierElement)) {
            return false;
        }
        DerivedHeightModifierElement derivedHeightModifierElement = (DerivedHeightModifierElement) obj;
        return q10.b(this.insets, derivedHeightModifierElement.insets) && this.heightCalc == derivedHeightModifierElement.heightCalc;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.heightCalc.hashCode() + (this.insets.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DerivedHeightModifierNode derivedHeightModifierNode) {
        derivedHeightModifierNode.update(this.insets, this.heightCalc);
    }
}
