package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class CoreSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {
    public static final int $stable = 8;
    private boolean isClearingSemantics;
    private boolean mergeDescendants;
    private ky properties;

    public CoreSemanticsModifierNode(boolean z, boolean z2, ky kyVar) {
        this.mergeDescendants = z;
        this.isClearingSemantics = z2;
        this.properties = kyVar;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.properties.invoke(semanticsPropertyReceiver);
    }

    public final boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    public final ky getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldClearDescendantSemantics() {
        return this.isClearingSemantics;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return this.mergeDescendants;
    }

    public final boolean isClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final void setClearingSemantics(boolean z) {
        this.isClearingSemantics = z;
    }

    public final void setMergeDescendants(boolean z) {
        this.mergeDescendants = z;
    }

    public final void setProperties(ky kyVar) {
        this.properties = kyVar;
    }
}
