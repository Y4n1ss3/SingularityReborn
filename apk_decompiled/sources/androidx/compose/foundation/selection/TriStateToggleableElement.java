package androidx.compose.foundation.selection;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import defpackage.dq;
import defpackage.iy;
import defpackage.kp0;
import defpackage.q10;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TriStateToggleableElement extends ModifierNodeElement<TriStateToggleableNode> {
    private final boolean enabled;
    private final IndicationNodeFactory indicationNodeFactory;
    private final MutableInteractionSource interactionSource;
    private final iy onClick;
    private final Role role;
    private final ToggleableState state;
    private final boolean useLocalIndication;

    private TriStateToggleableElement(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, Role role, iy iyVar) {
        this.state = toggleableState;
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.useLocalIndication = z;
        this.enabled = z2;
        this.role = role;
        this.onClick = iyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TriStateToggleableNode create() {
        return new TriStateToggleableNode(this.state, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.role, this.onClick, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.state == triStateToggleableElement.state && q10.b(this.interactionSource, triStateToggleableElement.interactionSource) && q10.b(this.indicationNodeFactory, triStateToggleableElement.indicationNodeFactory) && this.useLocalIndication == triStateToggleableElement.useLocalIndication && this.enabled == triStateToggleableElement.enabled && q10.b(this.role, triStateToggleableElement.role) && this.onClick == triStateToggleableElement.onClick;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.state.hashCode() * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int hashCode2 = (hashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        IndicationNodeFactory indicationNodeFactory = this.indicationNodeFactory;
        int c = kp0.c(kp0.c((hashCode2 + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31, 31, this.useLocalIndication), 31, this.enabled);
        Role role = this.role;
        return this.onClick.hashCode() + ((c + (role != null ? Role.m6825hashCodeimpl(role.m6827unboximpl()) : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("triStateToggleable");
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("indicationNodeFactory", this.indicationNodeFactory);
        uf.d(this.enabled, inspectorInfo.getProperties(), "enabled", inspectorInfo).set("role", this.role);
        inspectorInfo.getProperties().set("onClick", this.onClick);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TriStateToggleableNode triStateToggleableNode) {
        triStateToggleableNode.m1038updateO2vRcR0(this.state, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.role, this.onClick);
    }

    public /* synthetic */ TriStateToggleableElement(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, Role role, iy iyVar, dq dqVar) {
        this(toggleableState, mutableInteractionSource, indicationNodeFactory, z, z2, role, iyVar);
    }
}
