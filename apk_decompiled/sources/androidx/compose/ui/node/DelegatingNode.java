package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import defpackage.ky;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class DelegatingNode extends Modifier.Node {
    public static final int $stable = 8;
    private Modifier.Node delegate;
    private final int selfKindSet = NodeKindKt.calculateNodeKindSetFrom(this);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    private final void updateNodeKindSet(int i, boolean z) {
        Modifier.Node child$ui;
        int kindSet$ui = getKindSet$ui();
        setKindSet$ui(i);
        if (kindSet$ui != i) {
            if (DelegatableNodeKt.isDelegationRoot(this)) {
                setAggregateChildKindSet$ui(i);
            }
            if (isAttached()) {
                Modifier.Node node = getNode();
                ?? r2 = this;
                while (r2 != 0) {
                    i |= r2.getKindSet$ui();
                    r2.setKindSet$ui(i);
                    if (r2 == node) {
                        break;
                    } else {
                        r2 = r2.getParent$ui();
                    }
                }
                if (z && r2 == node) {
                    i = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node);
                    node.setKindSet$ui(i);
                }
                int aggregateChildKindSet$ui = i | ((r2 == 0 || (child$ui = r2.getChild$ui()) == null) ? 0 : child$ui.getAggregateChildKindSet$ui());
                for (Modifier.Node node2 = r2; node2 != null; node2 = node2.getParent$ui()) {
                    aggregateChildKindSet$ui |= node2.getKindSet$ui();
                    node2.setAggregateChildKindSet$ui(aggregateChildKindSet$ui);
                }
            }
        }
    }

    private final void validateDelegateKindSet(int i, Modifier.Node node) {
        int kindSet$ui = getKindSet$ui();
        if ((i & NodeKind.m6573constructorimpl(2)) == 0 || (NodeKind.m6573constructorimpl(2) & kindSet$ui) == 0 || (this instanceof LayoutModifierNode)) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node);
    }

    public final <T extends DelegatableNode> T delegate(T t) {
        Modifier.Node node = t.getNode();
        if (node != t) {
            Modifier.Node node2 = t instanceof Modifier.Node ? (Modifier.Node) t : null;
            Modifier.Node parent$ui = node2 != null ? node2.getParent$ui() : null;
            if (node == getNode() && q10.b(parent$ui, this)) {
                return t;
            }
            o.f("Cannot delegate to an already delegated node");
            return null;
        }
        if (node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot delegate to an already attached node");
        }
        node.setAsDelegateTo$ui(getNode());
        int kindSet$ui = getKindSet$ui();
        int calculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node);
        node.setKindSet$ui(calculateNodeKindSetFromIncludingDelegates);
        validateDelegateKindSet(calculateNodeKindSetFromIncludingDelegates, node);
        node.setChild$ui(this.delegate);
        this.delegate = node;
        node.setParent$ui(this);
        updateNodeKindSet(getKindSet$ui() | calculateNodeKindSetFromIncludingDelegates, false);
        if (isAttached()) {
            if ((calculateNodeKindSetFromIncludingDelegates & NodeKind.m6573constructorimpl(2)) == 0 || (kindSet$ui & NodeKind.m6573constructorimpl(2)) != 0) {
                updateCoordinator$ui(getCoordinator$ui());
            } else {
                NodeChain nodes$ui = DelegatableNodeKt.requireLayoutNode(this).getNodes$ui();
                getNode().updateCoordinator$ui(null);
                nodes$ui.syncCoordinators();
            }
            node.markAsAttached$ui();
            node.runAttachLifecycle$ui();
            NodeKindKt.autoInvalidateInsertedNode(node);
        }
        return t;
    }

    public final <T extends DelegatableNode> T delegateUnprotected$ui(T t) {
        return (T) delegate(t);
    }

    public final void forEachImmediateDelegate$ui(ky kyVar) {
        for (Modifier.Node delegate$ui = getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            kyVar.invoke(delegate$ui);
        }
    }

    public final Modifier.Node getDelegate$ui() {
        return this.delegate;
    }

    public final int getSelfKindSet$ui() {
        return this.selfKindSet;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void markAsAttached$ui() {
        super.markAsAttached$ui();
        for (Modifier.Node delegate$ui = getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            delegate$ui.updateCoordinator$ui(getCoordinator$ui());
            if (!delegate$ui.isAttached()) {
                delegate$ui.markAsAttached$ui();
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void markAsDetached$ui() {
        for (Modifier.Node delegate$ui = getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            delegate$ui.markAsDetached$ui();
        }
        super.markAsDetached$ui();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void reset$ui() {
        super.reset$ui();
        for (Modifier.Node delegate$ui = getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            delegate$ui.reset$ui();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void runAttachLifecycle$ui() {
        for (Modifier.Node delegate$ui = getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            delegate$ui.runAttachLifecycle$ui();
        }
        super.runAttachLifecycle$ui();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void runDetachLifecycle$ui() {
        super.runDetachLifecycle$ui();
        for (Modifier.Node delegate$ui = getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            delegate$ui.runDetachLifecycle$ui();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void setAsDelegateTo$ui(Modifier.Node node) {
        super.setAsDelegateTo$ui(node);
        for (Modifier.Node delegate$ui = getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            delegate$ui.setAsDelegateTo$ui(node);
        }
    }

    public final void setDelegate$ui(Modifier.Node node) {
        this.delegate = node;
    }

    public final void undelegate(DelegatableNode delegatableNode) {
        Modifier.Node node = null;
        for (Modifier.Node node2 = this.delegate; node2 != null; node2 = node2.getChild$ui()) {
            if (node2 == delegatableNode) {
                if (node2.isAttached()) {
                    NodeKindKt.autoInvalidateRemovedNode(node2);
                    node2.runDetachLifecycle$ui();
                    node2.markAsDetached$ui();
                }
                node2.setAsDelegateTo$ui(node2);
                node2.setAggregateChildKindSet$ui(0);
                if (node == null) {
                    this.delegate = node2.getChild$ui();
                } else {
                    node.setChild$ui(node2.getChild$ui());
                }
                node2.setChild$ui(null);
                node2.setParent$ui(null);
                int kindSet$ui = getKindSet$ui();
                int calculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(this);
                updateNodeKindSet(calculateNodeKindSetFromIncludingDelegates, true);
                if (isAttached() && (kindSet$ui & NodeKind.m6573constructorimpl(2)) != 0 && (NodeKind.m6573constructorimpl(2) & calculateNodeKindSetFromIncludingDelegates) == 0) {
                    NodeChain nodes$ui = DelegatableNodeKt.requireLayoutNode(this).getNodes$ui();
                    getNode().updateCoordinator$ui(null);
                    nodes$ui.syncCoordinators();
                    return;
                }
                return;
            }
            node = node2;
        }
        o.p(delegatableNode, "Could not find delegate: ");
    }

    public final void undelegateUnprotected$ui(DelegatableNode delegatableNode) {
        undelegate(delegatableNode);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void updateCoordinator$ui(NodeCoordinator nodeCoordinator) {
        super.updateCoordinator$ui(nodeCoordinator);
        for (Modifier.Node delegate$ui = getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            delegate$ui.updateCoordinator$ui(nodeCoordinator);
        }
    }

    public static /* synthetic */ void getSelfKindSet$ui$annotations() {
    }
}
