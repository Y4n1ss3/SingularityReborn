package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FocusPropertiesElement extends ModifierNodeElement<FocusPropertiesNode> {
    private final FocusPropertiesScope scope;

    public FocusPropertiesElement(FocusPropertiesScope focusPropertiesScope) {
        this.scope = focusPropertiesScope;
    }

    public static /* synthetic */ FocusPropertiesElement copy$default(FocusPropertiesElement focusPropertiesElement, FocusPropertiesScope focusPropertiesScope, int i, Object obj) {
        if ((i & 1) != 0) {
            focusPropertiesScope = focusPropertiesElement.scope;
        }
        return focusPropertiesElement.copy(focusPropertiesScope);
    }

    public final FocusPropertiesScope component1() {
        return this.scope;
    }

    public final FocusPropertiesElement copy(FocusPropertiesScope focusPropertiesScope) {
        return new FocusPropertiesElement(focusPropertiesScope);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusPropertiesNode create() {
        return new FocusPropertiesNode(this.scope);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && q10.b(this.scope, ((FocusPropertiesElement) obj).scope);
    }

    public final FocusPropertiesScope getScope() {
        return this.scope;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.scope.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusProperties");
        inspectorInfo.getProperties().set("scope", this.scope);
    }

    public String toString() {
        return "FocusPropertiesElement(scope=" + this.scope + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FocusPropertiesNode focusPropertiesNode) {
        focusPropertiesNode.setFocusPropertiesScope(this.scope);
    }
}
