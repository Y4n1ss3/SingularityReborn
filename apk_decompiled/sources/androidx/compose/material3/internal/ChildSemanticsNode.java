package androidx.compose.material3.internal;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ed;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChildSemanticsNode extends Modifier.Node implements SemanticsModifierNode {
    public static final int $stable = 8;
    private ky properties;

    public ChildSemanticsNode(ky kyVar) {
        this.properties = kyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$1(SemanticsPropertyReceiver semanticsPropertyReceiver, TraversableNode traversableNode) {
        traversableNode.getClass();
        ((ParentSemanticsNode) traversableNode).obtainSemantics(semanticsPropertyReceiver);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onDetach$lambda$2(TraversableNode traversableNode) {
        traversableNode.getClass();
        ((ParentSemanticsNode) traversableNode).releaseSemantics();
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TraversableNodeKt.traverseAncestors(this, ParentSemanticsNodeKey.INSTANCE, new defpackage.h(semanticsPropertyReceiver, 11));
        this.properties.invoke(semanticsPropertyReceiver);
    }

    public final ky getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        TraversableNodeKt.traverseAncestors(this, ParentSemanticsNodeKey.INSTANCE, new ed(17));
    }

    public final void setProperties(ky kyVar) {
        this.properties = kyVar;
    }
}
