package androidx.compose.foundation;

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
final class ClickableElement extends ModifierNodeElement<ClickableNode> {
    private final boolean enabled;
    private final IndicationNodeFactory indicationNodeFactory;
    private final MutableInteractionSource interactionSource;
    private final iy onClick;
    private final String onClickLabel;
    private final Role role;
    private final boolean useLocalIndication;

    private ClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, iy iyVar) {
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.useLocalIndication = z;
        this.enabled = z2;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = iyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ClickableNode create() {
        return new ClickableNode(this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.onClickLabel, this.role, this.onClick, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return q10.b(this.interactionSource, clickableElement.interactionSource) && q10.b(this.indicationNodeFactory, clickableElement.indicationNodeFactory) && this.useLocalIndication == clickableElement.useLocalIndication && this.enabled == clickableElement.enabled && q10.b(this.onClickLabel, clickableElement.onClickLabel) && q10.b(this.role, clickableElement.role) && this.onClick == clickableElement.onClick;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int hashCode = (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0) * 31;
        IndicationNodeFactory indicationNodeFactory = this.indicationNodeFactory;
        int c = kp0.c(kp0.c((hashCode + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31, 31, this.useLocalIndication), 31, this.enabled);
        String str = this.onClickLabel;
        int hashCode2 = (c + (str != null ? str.hashCode() : 0)) * 31;
        Role role = this.role;
        return this.onClick.hashCode() + ((hashCode2 + (role != null ? Role.m6825hashCodeimpl(role.m6827unboximpl()) : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("clickable");
        uf.d(this.enabled, inspectorInfo.getProperties(), "enabled", inspectorInfo).set("onClick", this.onClick);
        inspectorInfo.getProperties().set("onClickLabel", this.onClickLabel);
        inspectorInfo.getProperties().set("role", this.role);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("indicationNodeFactory", this.indicationNodeFactory);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ClickableNode clickableNode) {
        clickableNode.m277updateO2vRcR0(this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.onClickLabel, this.role, this.onClick);
    }

    public /* synthetic */ ClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, iy iyVar, dq dqVar) {
        this(mutableInteractionSource, indicationNodeFactory, z, z2, str, role, iyVar);
    }
}
