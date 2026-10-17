package androidx.compose.material3.internal;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ParentSemanticsNodeElement extends ModifierNodeElement<ParentSemanticsNode> {
    public static final int $stable = 0;
    private final ky properties;

    public ParentSemanticsNodeElement(ky kyVar) {
        this.properties = kyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ParentSemanticsNode create() {
        return new ParentSemanticsNode(this.properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ParentSemanticsNodeElement) && this.properties == ((ParentSemanticsNodeElement) obj).properties;
    }

    public final ky getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.properties.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("parentSemantics");
        inspectorInfo.getProperties().set("properties", this.properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ParentSemanticsNode parentSemanticsNode) {
        parentSemanticsNode.setProperties(this.properties);
        SemanticsModifierNodeKt.invalidateSemantics(parentSemanticsNode);
    }
}
