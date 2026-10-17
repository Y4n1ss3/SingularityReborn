package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.iy;
import defpackage.kp0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends ModifierNodeElement<LazyLayoutSemanticsModifierNode> {
    private final iy itemProviderLambda;
    private final Orientation orientation;
    private final boolean reverseScrolling;
    private final LazyLayoutSemanticState state;
    private final boolean userScrollEnabled;

    public LazyLayoutSemanticsModifier(iy iyVar, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z, boolean z2) {
        this.itemProviderLambda = iyVar;
        this.state = lazyLayoutSemanticState;
        this.orientation = orientation;
        this.userScrollEnabled = z;
        this.reverseScrolling = z2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LazyLayoutSemanticsModifierNode create() {
        return new LazyLayoutSemanticsModifierNode(this.itemProviderLambda, this.state, this.orientation, this.userScrollEnabled, this.reverseScrolling);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.itemProviderLambda == lazyLayoutSemanticsModifier.itemProviderLambda && q10.b(this.state, lazyLayoutSemanticsModifier.state) && this.orientation == lazyLayoutSemanticsModifier.orientation && this.userScrollEnabled == lazyLayoutSemanticsModifier.userScrollEnabled && this.reverseScrolling == lazyLayoutSemanticsModifier.reverseScrolling;
    }

    public final iy getItemProviderLambda() {
        return this.itemProviderLambda;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final LazyLayoutSemanticState getState() {
        return this.state;
    }

    public final boolean getUserScrollEnabled() {
        return this.userScrollEnabled;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.reverseScrolling) + kp0.c((this.orientation.hashCode() + ((this.state.hashCode() + (this.itemProviderLambda.hashCode() * 31)) * 31)) * 31, 31, this.userScrollEnabled);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode) {
        lazyLayoutSemanticsModifierNode.update(this.itemProviderLambda, this.state, this.orientation, this.userScrollEnabled, this.reverseScrolling);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }
}
