package androidx.compose.foundation.selection;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import defpackage.dq;
import defpackage.iy;
import defpackage.kp0;
import defpackage.q10;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SelectableElement extends ModifierNodeElement<SelectableNode> {
    private final boolean enabled;
    private final IndicationNodeFactory indicationNodeFactory;
    private final MutableInteractionSource interactionSource;
    private final iy onClick;
    private final Role role;
    private final boolean selected;
    private final boolean useLocalIndication;

    private SelectableElement(boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, iy iyVar) {
        this.selected = z;
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.useLocalIndication = z2;
        this.enabled = z3;
        this.role = role;
        this.onClick = iyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SelectableNode create() {
        return new SelectableNode(this.selected, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.role, this.onClick, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.selected == selectableElement.selected && q10.b(this.interactionSource, selectableElement.interactionSource) && q10.b(this.indicationNodeFactory, selectableElement.indicationNodeFactory) && this.useLocalIndication == selectableElement.useLocalIndication && this.enabled == selectableElement.enabled && q10.b(this.role, selectableElement.role) && this.onClick == selectableElement.onClick;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = Boolean.hashCode(this.selected) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int hashCode2 = (hashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        IndicationNodeFactory indicationNodeFactory = this.indicationNodeFactory;
        int c = kp0.c(kp0.c((hashCode2 + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31, 31, this.useLocalIndication), 31, this.enabled);
        Role role = this.role;
        return this.onClick.hashCode() + ((c + (role != null ? Role.m6825hashCodeimpl(role.m6827unboximpl()) : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("selectable");
        uf.d(this.selected, inspectorInfo.getProperties(), "selected", inspectorInfo).set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("indicationNodeFactory", this.indicationNodeFactory);
        uf.d(this.enabled, inspectorInfo.getProperties(), "enabled", inspectorInfo).set("role", this.role);
        inspectorInfo.getProperties().set("onClick", this.onClick);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SelectableNode selectableNode) {
        selectableNode.m1024updateO2vRcR0(this.selected, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.role, this.onClick);
    }

    public /* synthetic */ SelectableElement(boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, iy iyVar, dq dqVar) {
        this(z, mutableInteractionSource, indicationNodeFactory, z2, z3, role, iyVar);
    }
}
