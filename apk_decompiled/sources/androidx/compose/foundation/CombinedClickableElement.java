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
final class CombinedClickableElement extends ModifierNodeElement<CombinedClickableNode> {
    private final boolean enabled;
    private final boolean hapticFeedbackEnabled;
    private final IndicationNodeFactory indicationNodeFactory;
    private final MutableInteractionSource interactionSource;
    private final iy onClick;
    private final String onClickLabel;
    private final iy onDoubleClick;
    private final iy onLongClick;
    private final String onLongClickLabel;
    private final Role role;
    private final boolean useLocalIndication;

    private CombinedClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, iy iyVar, String str2, iy iyVar2, iy iyVar3, boolean z3) {
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.useLocalIndication = z;
        this.enabled = z2;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = iyVar;
        this.onLongClickLabel = str2;
        this.onLongClick = iyVar2;
        this.onDoubleClick = iyVar3;
        this.hapticFeedbackEnabled = z3;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public CombinedClickableNode create() {
        return new CombinedClickableNode(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.hapticFeedbackEnabled, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.onClickLabel, this.role, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return q10.b(this.interactionSource, combinedClickableElement.interactionSource) && q10.b(this.indicationNodeFactory, combinedClickableElement.indicationNodeFactory) && this.useLocalIndication == combinedClickableElement.useLocalIndication && this.enabled == combinedClickableElement.enabled && q10.b(this.onClickLabel, combinedClickableElement.onClickLabel) && q10.b(this.role, combinedClickableElement.role) && this.onClick == combinedClickableElement.onClick && q10.b(this.onLongClickLabel, combinedClickableElement.onLongClickLabel) && this.onLongClick == combinedClickableElement.onLongClick && this.onDoubleClick == combinedClickableElement.onDoubleClick && this.hapticFeedbackEnabled == combinedClickableElement.hapticFeedbackEnabled;
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
        int hashCode3 = (this.onClick.hashCode() + ((hashCode2 + (role != null ? Role.m6825hashCodeimpl(role.m6827unboximpl()) : 0)) * 31)) * 31;
        String str2 = this.onLongClickLabel;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        iy iyVar = this.onLongClick;
        int hashCode5 = (hashCode4 + (iyVar != null ? iyVar.hashCode() : 0)) * 31;
        iy iyVar2 = this.onDoubleClick;
        return Boolean.hashCode(this.hapticFeedbackEnabled) + ((hashCode5 + (iyVar2 != null ? iyVar2.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("combinedClickable");
        inspectorInfo.getProperties().set("indicationNodeFactory", this.indicationNodeFactory);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        uf.d(this.enabled, inspectorInfo.getProperties(), "enabled", inspectorInfo).set("onClickLabel", this.onClickLabel);
        inspectorInfo.getProperties().set("role", this.role);
        inspectorInfo.getProperties().set("onClick", this.onClick);
        inspectorInfo.getProperties().set("onDoubleClick", this.onDoubleClick);
        inspectorInfo.getProperties().set("onLongClick", this.onLongClick);
        inspectorInfo.getProperties().set("onLongClickLabel", this.onLongClickLabel);
        inspectorInfo.getProperties().set("hapticFeedbackEnabled", Boolean.valueOf(this.hapticFeedbackEnabled));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(CombinedClickableNode combinedClickableNode) {
        combinedClickableNode.setHapticFeedbackEnabled(this.hapticFeedbackEnabled);
        combinedClickableNode.m279update2tQrsxU(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.onClickLabel, this.role);
    }

    public /* synthetic */ CombinedClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, iy iyVar, String str2, iy iyVar2, iy iyVar3, boolean z3, dq dqVar) {
        this(mutableInteractionSource, indicationNodeFactory, z, z2, str, role, iyVar, str2, iyVar2, iyVar3, z3);
    }
}
