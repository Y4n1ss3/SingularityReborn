package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.dq;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SelectableNode extends ClickableNode {
    private boolean selected;

    private SelectableNode(boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, iy iyVar) {
        super(mutableInteractionSource, indicationNodeFactory, z2, z3, null, role, iyVar, null);
        this.selected = z;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, this.selected);
    }

    /* renamed from: update-O2vRcR0, reason: not valid java name */
    public final void m1024updateO2vRcR0(boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, iy iyVar) {
        if (this.selected != z) {
            this.selected = z;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        m277updateO2vRcR0(mutableInteractionSource, indicationNodeFactory, z2, z3, (String) null, role, iyVar);
    }

    public /* synthetic */ SelectableNode(boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, iy iyVar, dq dqVar) {
        this(z, mutableInteractionSource, indicationNodeFactory, z2, z3, role, iyVar);
    }
}
