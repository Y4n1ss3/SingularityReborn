package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FocusPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode {
    private FocusPropertiesScope focusPropertiesScope;

    public FocusPropertiesNode(FocusPropertiesScope focusPropertiesScope) {
        this.focusPropertiesScope = focusPropertiesScope;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        this.focusPropertiesScope.apply(focusProperties);
    }

    public final FocusPropertiesScope getFocusPropertiesScope() {
        return this.focusPropertiesScope;
    }

    public final void setFocusPropertiesScope(FocusPropertiesScope focusPropertiesScope) {
        this.focusPropertiesScope = focusPropertiesScope;
    }
}
