package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.FillableData;
import androidx.compose.ui.autofill.FillableData_androidKt;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import defpackage.dq;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TriStateToggleableNode extends ClickableNode {
    private ToggleableState state;

    private TriStateToggleableNode(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, Role role, iy iyVar) {
        super(mutableInteractionSource, indicationNodeFactory, z, z2, null, role, iyVar, null);
        this.state = toggleableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applyAdditionalSemantics$lambda$1(SemanticsPropertyReceiver semanticsPropertyReceiver, FillableData fillableData) {
        Boolean booleanValue = fillableData.getBooleanValue();
        if (booleanValue == null) {
            return false;
        }
        SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, ToggleableStateKt.ToggleableState(booleanValue.booleanValue()));
        return true;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, this.state);
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.Companion.getToggle());
        int i = 1;
        FillableData createFromBoolean = FillableData_androidKt.createFromBoolean(FillableData.Companion, this.state != ToggleableState.Indeterminate);
        if (createFromBoolean != null) {
            SemanticsPropertiesKt.setFillableData(semanticsPropertyReceiver, createFromBoolean);
        }
        SemanticsPropertiesKt.onFillData$default(semanticsPropertyReceiver, null, new a(i, semanticsPropertyReceiver), 1, null);
    }

    /* renamed from: update-O2vRcR0, reason: not valid java name */
    public final void m1038updateO2vRcR0(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, Role role, iy iyVar) {
        if (this.state != toggleableState) {
            this.state = toggleableState;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        m277updateO2vRcR0(mutableInteractionSource, indicationNodeFactory, z, z2, (String) null, role, iyVar);
    }

    public /* synthetic */ TriStateToggleableNode(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, Role role, iy iyVar, dq dqVar) {
        this(toggleableState, mutableInteractionSource, indicationNodeFactory, z, z2, role, iyVar);
    }
}
