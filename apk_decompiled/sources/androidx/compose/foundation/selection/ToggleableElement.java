package androidx.compose.foundation.selection;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import defpackage.dq;
import defpackage.kp0;
import defpackage.ky;
import defpackage.q10;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ToggleableElement extends ModifierNodeElement<ToggleableNode> {
    private final boolean enabled;
    private final IndicationNodeFactory indicationNodeFactory;
    private final MutableInteractionSource interactionSource;
    private final ky onValueChange;
    private final Role role;
    private final boolean useLocalIndication;
    private final boolean value;

    private ToggleableElement(boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, ky kyVar) {
        this.value = z;
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.useLocalIndication = z2;
        this.enabled = z3;
        this.role = role;
        this.onValueChange = kyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ToggleableNode create() {
        return new ToggleableNode(this.value, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.role, this.onValueChange, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.value == toggleableElement.value && q10.b(this.interactionSource, toggleableElement.interactionSource) && q10.b(this.indicationNodeFactory, toggleableElement.indicationNodeFactory) && this.useLocalIndication == toggleableElement.useLocalIndication && this.enabled == toggleableElement.enabled && q10.b(this.role, toggleableElement.role) && this.onValueChange == toggleableElement.onValueChange;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = Boolean.hashCode(this.value) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int hashCode2 = (hashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        IndicationNodeFactory indicationNodeFactory = this.indicationNodeFactory;
        int c = kp0.c(kp0.c((hashCode2 + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31, 31, this.useLocalIndication), 31, this.enabled);
        Role role = this.role;
        return this.onValueChange.hashCode() + ((c + (role != null ? Role.m6825hashCodeimpl(role.m6827unboximpl()) : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("toggleable");
        inspectorInfo.getProperties().set("value", inspectorInfo.getValue());
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("indicationNodeFactory", this.indicationNodeFactory);
        uf.d(this.enabled, inspectorInfo.getProperties(), "enabled", inspectorInfo).set("role", this.role);
        inspectorInfo.getProperties().set("onValueChange", this.onValueChange);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ToggleableNode toggleableNode) {
        toggleableNode.m1037updateO2vRcR0(this.value, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.role, this.onValueChange);
    }

    public /* synthetic */ ToggleableElement(boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, ky kyVar, dq dqVar) {
        this(z, mutableInteractionSource, indicationNodeFactory, z2, z3, role, kyVar);
    }
}
