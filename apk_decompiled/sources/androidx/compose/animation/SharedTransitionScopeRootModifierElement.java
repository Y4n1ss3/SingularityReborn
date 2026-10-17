package androidx.compose.animation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SharedTransitionScopeRootModifierElement extends ModifierNodeElement<SharedTransitionScopeRootModifierNode> {
    private final SharedTransitionScopeImpl sharedTransitionScope;

    public SharedTransitionScopeRootModifierElement(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.sharedTransitionScope = sharedTransitionScopeImpl;
    }

    public static /* synthetic */ SharedTransitionScopeRootModifierElement copy$default(SharedTransitionScopeRootModifierElement sharedTransitionScopeRootModifierElement, SharedTransitionScopeImpl sharedTransitionScopeImpl, int i, Object obj) {
        if ((i & 1) != 0) {
            sharedTransitionScopeImpl = sharedTransitionScopeRootModifierElement.sharedTransitionScope;
        }
        return sharedTransitionScopeRootModifierElement.copy(sharedTransitionScopeImpl);
    }

    public final SharedTransitionScopeImpl component1() {
        return this.sharedTransitionScope;
    }

    public final SharedTransitionScopeRootModifierElement copy(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        return new SharedTransitionScopeRootModifierElement(sharedTransitionScopeImpl);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SharedTransitionScopeRootModifierNode create() {
        return new SharedTransitionScopeRootModifierNode(this.sharedTransitionScope);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedTransitionScopeRootModifierElement) && q10.b(this.sharedTransitionScope, ((SharedTransitionScopeRootModifierElement) obj).sharedTransitionScope);
    }

    public final SharedTransitionScopeImpl getSharedTransitionScope() {
        return this.sharedTransitionScope;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.sharedTransitionScope.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("SharedTransitionScopeRootModifier");
        inspectorInfo.getProperties().set("sharedTransitionScope", this.sharedTransitionScope);
    }

    public String toString() {
        return "SharedTransitionScopeRootModifierElement(sharedTransitionScope=" + this.sharedTransitionScope + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SharedTransitionScopeRootModifierNode sharedTransitionScopeRootModifierNode) {
        sharedTransitionScopeRootModifierNode.setSharedScope(this.sharedTransitionScope);
    }
}
