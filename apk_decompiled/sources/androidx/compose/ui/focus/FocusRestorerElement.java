package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FocusRestorerElement extends ModifierNodeElement<FocusRestorerNode> {
    private final FocusRequester fallback;

    public FocusRestorerElement(FocusRequester focusRequester) {
        this.fallback = focusRequester;
    }

    public static /* synthetic */ FocusRestorerElement copy$default(FocusRestorerElement focusRestorerElement, FocusRequester focusRequester, int i, Object obj) {
        if ((i & 1) != 0) {
            focusRequester = focusRestorerElement.fallback;
        }
        return focusRestorerElement.copy(focusRequester);
    }

    public final FocusRequester component1() {
        return this.fallback;
    }

    public final FocusRestorerElement copy(FocusRequester focusRequester) {
        return new FocusRestorerElement(focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusRestorerNode create() {
        return new FocusRestorerNode(this.fallback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRestorerElement) && q10.b(this.fallback, ((FocusRestorerElement) obj).fallback);
    }

    public final FocusRequester getFallback() {
        return this.fallback;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.fallback.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusRestorer");
        inspectorInfo.getProperties().set("fallback", this.fallback);
    }

    public String toString() {
        return "FocusRestorerElement(fallback=" + this.fallback + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FocusRestorerNode focusRestorerNode) {
        focusRestorerNode.setFallback(this.fallback);
    }
}
