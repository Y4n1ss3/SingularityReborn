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
import androidx.compose.ui.state.ToggleableStateKt;
import defpackage.dq;
import defpackage.iy;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ToggleableNode extends ClickableNode {
    private final iy _onClick;
    private ky onValueChange;
    private boolean value;

    private ToggleableNode(final boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, final ky kyVar) {
        super(mutableInteractionSource, indicationNodeFactory, z2, z3, null, role, new iy() { // from class: androidx.compose.foundation.selection.b
            @Override // defpackage.iy
            public final Object invoke() {
                w01 _init_$lambda$0;
                _init_$lambda$0 = ToggleableNode._init_$lambda$0(ky.this, z);
                return _init_$lambda$0;
            }
        }, null);
        this.value = z;
        this.onValueChange = kyVar;
        this._onClick = new iy() { // from class: androidx.compose.foundation.selection.c
            @Override // defpackage.iy
            public final Object invoke() {
                w01 _onClick$lambda$0;
                _onClick$lambda$0 = ToggleableNode._onClick$lambda$0(ToggleableNode.this);
                return _onClick$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _init_$lambda$0(ky kyVar, boolean z) {
        kyVar.invoke(Boolean.valueOf(!z));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _onClick$lambda$0(ToggleableNode toggleableNode) {
        toggleableNode.onValueChange.invoke(Boolean.valueOf(!toggleableNode.value));
        return w01.a;
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
        SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, ToggleableStateKt.ToggleableState(this.value));
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.Companion.getToggle());
        FillableData createFromBoolean = FillableData_androidKt.createFromBoolean(FillableData.Companion, this.value);
        if (createFromBoolean != null) {
            SemanticsPropertiesKt.setFillableData(semanticsPropertyReceiver, createFromBoolean);
        }
        SemanticsPropertiesKt.onFillData$default(semanticsPropertyReceiver, null, new a(0, semanticsPropertyReceiver), 1, null);
    }

    public final iy get_onClick() {
        return this._onClick;
    }

    /* renamed from: update-O2vRcR0, reason: not valid java name */
    public final void m1037updateO2vRcR0(boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, ky kyVar) {
        if (this.value != z) {
            this.value = z;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        this.onValueChange = kyVar;
        m277updateO2vRcR0(mutableInteractionSource, indicationNodeFactory, z2, z3, (String) null, role, this._onClick);
    }

    public /* synthetic */ ToggleableNode(boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, ky kyVar, dq dqVar) {
        this(z, mutableInteractionSource, indicationNodeFactory, z2, z3, role, kyVar);
    }
}
