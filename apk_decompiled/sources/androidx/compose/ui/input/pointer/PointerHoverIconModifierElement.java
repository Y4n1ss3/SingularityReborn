package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.dq;
import defpackage.q10;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerHoverIconModifierElement extends ModifierNodeElement<PointerHoverIconModifierNode> {
    public static final int $stable = 0;
    private final PointerIcon icon;
    private final boolean overrideDescendants;

    public /* synthetic */ PointerHoverIconModifierElement(PointerIcon pointerIcon, boolean z, int i, dq dqVar) {
        this(pointerIcon, (i & 2) != 0 ? false : z);
    }

    public static /* synthetic */ PointerHoverIconModifierElement copy$default(PointerHoverIconModifierElement pointerHoverIconModifierElement, PointerIcon pointerIcon, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerIcon = pointerHoverIconModifierElement.icon;
        }
        if ((i & 2) != 0) {
            z = pointerHoverIconModifierElement.overrideDescendants;
        }
        return pointerHoverIconModifierElement.copy(pointerIcon, z);
    }

    public final PointerIcon component1() {
        return this.icon;
    }

    public final boolean component2() {
        return this.overrideDescendants;
    }

    public final PointerHoverIconModifierElement copy(PointerIcon pointerIcon, boolean z) {
        return new PointerHoverIconModifierElement(pointerIcon, z);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PointerHoverIconModifierNode create() {
        return new PointerHoverIconModifierNode(this.icon, this.overrideDescendants);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return q10.b(this.icon, pointerHoverIconModifierElement.icon) && this.overrideDescendants == pointerHoverIconModifierElement.overrideDescendants;
    }

    public final PointerIcon getIcon() {
        return this.icon;
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.overrideDescendants) + (this.icon.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("pointerHoverIcon");
        inspectorInfo.getProperties().set("icon", this.icon);
        inspectorInfo.getProperties().set("overrideDescendants", Boolean.valueOf(this.overrideDescendants));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PointerHoverIconModifierElement(icon=");
        sb.append(this.icon);
        sb.append(", overrideDescendants=");
        return uf.e(sb, this.overrideDescendants, ')');
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
        pointerHoverIconModifierNode.setIcon(this.icon);
        pointerHoverIconModifierNode.setOverrideDescendants(this.overrideDescendants);
    }

    public PointerHoverIconModifierElement(PointerIcon pointerIcon, boolean z) {
        this.icon = pointerIcon;
        this.overrideDescendants = z;
    }
}
