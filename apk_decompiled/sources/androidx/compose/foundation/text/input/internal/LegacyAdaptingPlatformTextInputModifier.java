package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends ModifierNodeElement<LegacyAdaptingPlatformTextInputModifierNode> {
    private final LegacyTextFieldState legacyTextFieldState;
    private final LegacyPlatformTextInputServiceAdapter serviceAdapter;
    private final TextFieldSelectionManager textFieldSelectionManager;

    public LegacyAdaptingPlatformTextInputModifier(LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        this.serviceAdapter = legacyPlatformTextInputServiceAdapter;
        this.legacyTextFieldState = legacyTextFieldState;
        this.textFieldSelectionManager = textFieldSelectionManager;
    }

    public static /* synthetic */ LegacyAdaptingPlatformTextInputModifier copy$default(LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier, LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, int i, Object obj) {
        if ((i & 1) != 0) {
            legacyPlatformTextInputServiceAdapter = legacyAdaptingPlatformTextInputModifier.serviceAdapter;
        }
        if ((i & 2) != 0) {
            legacyTextFieldState = legacyAdaptingPlatformTextInputModifier.legacyTextFieldState;
        }
        if ((i & 4) != 0) {
            textFieldSelectionManager = legacyAdaptingPlatformTextInputModifier.textFieldSelectionManager;
        }
        return legacyAdaptingPlatformTextInputModifier.copy(legacyPlatformTextInputServiceAdapter, legacyTextFieldState, textFieldSelectionManager);
    }

    public final LegacyPlatformTextInputServiceAdapter component1() {
        return this.serviceAdapter;
    }

    public final LegacyTextFieldState component2() {
        return this.legacyTextFieldState;
    }

    public final TextFieldSelectionManager component3() {
        return this.textFieldSelectionManager;
    }

    public final LegacyAdaptingPlatformTextInputModifier copy(LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        return new LegacyAdaptingPlatformTextInputModifier(legacyPlatformTextInputServiceAdapter, legacyTextFieldState, textFieldSelectionManager);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LegacyAdaptingPlatformTextInputModifierNode create() {
        return new LegacyAdaptingPlatformTextInputModifierNode(this.serviceAdapter, this.legacyTextFieldState, this.textFieldSelectionManager);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return q10.b(this.serviceAdapter, legacyAdaptingPlatformTextInputModifier.serviceAdapter) && q10.b(this.legacyTextFieldState, legacyAdaptingPlatformTextInputModifier.legacyTextFieldState) && q10.b(this.textFieldSelectionManager, legacyAdaptingPlatformTextInputModifier.textFieldSelectionManager);
    }

    public final LegacyTextFieldState getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    public final LegacyPlatformTextInputServiceAdapter getServiceAdapter() {
        return this.serviceAdapter;
    }

    public final TextFieldSelectionManager getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.textFieldSelectionManager.hashCode() + ((this.legacyTextFieldState.hashCode() + (this.serviceAdapter.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.serviceAdapter + ", legacyTextFieldState=" + this.legacyTextFieldState + ", textFieldSelectionManager=" + this.textFieldSelectionManager + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode) {
        legacyAdaptingPlatformTextInputModifierNode.setServiceAdapter(this.serviceAdapter);
        legacyAdaptingPlatformTextInputModifierNode.setLegacyTextFieldState(this.legacyTextFieldState);
        legacyAdaptingPlatformTextInputModifierNode.setTextFieldSelectionManager(this.textFieldSelectionManager);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }
}
