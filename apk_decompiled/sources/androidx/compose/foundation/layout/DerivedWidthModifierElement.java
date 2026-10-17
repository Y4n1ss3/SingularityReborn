package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;
import defpackage.ny;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DerivedWidthModifierElement extends ModifierNodeElement<DerivedWidthModifierNode> {
    private final WindowInsets insets;
    private final ky inspectorInfo;
    private final ny widthCalc;

    public DerivedWidthModifierElement(WindowInsets windowInsets, ky kyVar, ny nyVar) {
        this.insets = windowInsets;
        this.inspectorInfo = kyVar;
        this.widthCalc = nyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DerivedWidthModifierNode create() {
        return new DerivedWidthModifierNode(this.insets, this.widthCalc);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedWidthModifierElement)) {
            return false;
        }
        DerivedWidthModifierElement derivedWidthModifierElement = (DerivedWidthModifierElement) obj;
        return q10.b(this.insets, derivedWidthModifierElement.insets) && this.widthCalc == derivedWidthModifierElement.widthCalc;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.widthCalc.hashCode() + (this.insets.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DerivedWidthModifierNode derivedWidthModifierNode) {
        derivedWidthModifierNode.update(this.insets, this.widthCalc);
    }
}
