package androidx.compose.material3.internal;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ParentSemanticsNode extends Modifier.Node implements TraversableNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private ky properties;
    private boolean semanticsConsumed;
    private final Object traverseKey = ParentSemanticsNodeKey.INSTANCE;

    public ParentSemanticsNode(ky kyVar) {
        this.properties = kyVar;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.semanticsConsumed) {
            return;
        }
        this.properties.invoke(semanticsPropertyReceiver);
    }

    public final ky getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    public final void obtainSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.semanticsConsumed = true;
        this.properties.invoke(semanticsPropertyReceiver);
        SemanticsModifierNodeKt.invalidateSemantics(this);
    }

    public final void releaseSemantics() {
        this.semanticsConsumed = false;
        SemanticsModifierNodeKt.invalidateSemantics(this);
    }

    public final void setProperties(ky kyVar) {
        this.properties = kyVar;
    }
}
