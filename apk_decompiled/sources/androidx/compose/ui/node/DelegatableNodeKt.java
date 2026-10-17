package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.ky;
import defpackage.q10;
import defpackage.rl0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DelegatableNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLayoutNodeChildren(MutableVector<Modifier.Node> mutableVector, Modifier.Node node, boolean z) {
        MutableVector<LayoutNode> children = getChildren(requireLayoutNode(node), z);
        int size = children.getSize() - 1;
        LayoutNode[] layoutNodeArr = children.content;
        if (size < layoutNodeArr.length) {
            while (size >= 0) {
                mutableVector.add(layoutNodeArr[size].getNodes$ui().getHead$ui());
                size--;
            }
        }
    }

    /* renamed from: ancestors-6rFNWt0, reason: not valid java name */
    public static final <T> List<T> m6407ancestors6rFNWt0(DelegatableNode delegatableNode, int i, boolean z) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((fc.b(requireLayoutNode) & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i) != 0) {
                        q10.G();
                        throw null;
                    }
                    node = node.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node = (requireLayoutNode == null || (nodes$ui = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return null;
    }

    /* renamed from: ancestors-6rFNWt0$default, reason: not valid java name */
    public static List m6408ancestors6rFNWt0$default(DelegatableNode delegatableNode, int i, boolean z, int i2, Object obj) {
        NodeChain nodes$ui;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((fc.b(requireLayoutNode) & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i) != 0) {
                        q10.G();
                        throw null;
                    }
                    node = node.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node = (requireLayoutNode == null || (nodes$ui = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LayoutModifierNode asLayoutModifierNode(Modifier.Node node) {
        if ((NodeKind.m6573constructorimpl(2) & node.getKindSet$ui()) != 0) {
            if (node instanceof LayoutModifierNode) {
                return (LayoutModifierNode) node;
            }
            if (node instanceof DelegatingNode) {
                Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui();
                while (delegate$ui != 0) {
                    if (delegate$ui instanceof LayoutModifierNode) {
                        return (LayoutModifierNode) delegate$ui;
                    }
                    delegate$ui = (!(delegate$ui instanceof DelegatingNode) || (NodeKind.m6573constructorimpl(2) & delegate$ui.getKindSet$ui()) == 0) ? delegate$ui.getChild$ui() : ((DelegatingNode) delegate$ui).getDelegate$ui();
                }
            }
        }
        return null;
    }

    /* renamed from: dispatchForKind-6rFNWt0, reason: not valid java name */
    public static final <T> void m6409dispatchForKind6rFNWt0(Modifier.Node node, int i, ky kyVar) {
        if (node == null) {
            return;
        }
        q10.G();
        throw null;
    }

    /* renamed from: dispatchForKind-Y-YKmho, reason: not valid java name */
    public static final <T> void m6410dispatchForKindYYKmho(Modifier.Node node, int i, boolean z, ky kyVar) {
        if (node == null) {
            return;
        }
        q10.G();
        throw null;
    }

    /* renamed from: dispatchOnScrollChanged-Uv8p0NA, reason: not valid java name */
    public static final void m6411dispatchOnScrollChangedUv8p0NA(DelegatableNode delegatableNode, long j) {
        requireOwner(delegatableNode).mo6639dispatchOnScrollChangedk4lQ0M(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    public static final BeyondBoundsLayout findNearestBeyondBoundsLayoutAncestor(DelegatableNode delegatableNode) {
        NodeChain nodes$ui;
        Object obj;
        int m6573constructorimpl = NodeKind.m6573constructorimpl(GroupFlagsKt.IsNodeFlag) | NodeKind.m6573constructorimpl(32);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            DelegatingNode delegatingNode = parent$ui;
            if ((fc.b(requireLayoutNode) & m6573constructorimpl) != 0) {
                while (delegatingNode != 0) {
                    if ((delegatingNode.getKindSet$ui() & m6573constructorimpl) != 0) {
                        if ((NodeKind.m6573constructorimpl(GroupFlagsKt.IsNodeFlag) & delegatingNode.getKindSet$ui()) != 0) {
                            if (!(delegatingNode instanceof BeyondBoundsLayoutProviderModifierNode)) {
                                if (delegatingNode instanceof DelegatingNode) {
                                    Modifier.Node delegate$ui = delegatingNode.getDelegate$ui();
                                    delegatingNode = 0;
                                    while (delegate$ui != null) {
                                        if (delegate$ui instanceof BeyondBoundsLayoutProviderModifierNode) {
                                            delegatingNode = delegate$ui;
                                        }
                                        delegate$ui = delegate$ui.getChild$ui();
                                        delegatingNode = delegatingNode;
                                    }
                                } else {
                                    delegatingNode = 0;
                                }
                            }
                            BeyondBoundsLayoutProviderModifierNode beyondBoundsLayoutProviderModifierNode = (BeyondBoundsLayoutProviderModifierNode) delegatingNode;
                            if (beyondBoundsLayoutProviderModifierNode != null) {
                                return beyondBoundsLayoutProviderModifierNode.getBeyondBoundsLayout();
                            }
                            return null;
                        }
                        if ((NodeKind.m6573constructorimpl(32) & delegatingNode.getKindSet$ui()) == 0) {
                            continue;
                        } else {
                            if (delegatingNode instanceof ModifierLocalModifierNode) {
                                obj = delegatingNode;
                            } else if (delegatingNode instanceof DelegatingNode) {
                                obj = null;
                                for (Modifier.Node delegate$ui2 = delegatingNode.getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                    if (delegate$ui2 instanceof ModifierLocalModifierNode) {
                                        obj = delegate$ui2;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) obj;
                            if (modifierLocalModifierNode != null && modifierLocalModifierNode.getProvidedValues().contains$ui(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout())) {
                                return (BeyondBoundsLayout) modifierLocalModifierNode.getProvidedValues().get$ui(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
                            }
                        }
                    }
                    delegatingNode = delegatingNode.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent$ui = (requireLayoutNode == null || (nodes$ui = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return null;
    }

    private static final MutableVector<LayoutNode> getChildren(LayoutNode layoutNode, boolean z) {
        return z ? layoutNode.getZSortedChildren() : layoutNode.get_children$ui();
    }

    /* renamed from: has-64DMado, reason: not valid java name */
    public static final boolean m6412has64DMado(DelegatableNode delegatableNode, int i) {
        return (delegatableNode.getNode().getAggregateChildKindSet$ui() & i) != 0;
    }

    public static final void invalidateDrawForSubtree(DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().isAttached()) {
            LayoutNode.invalidateDrawForSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    public static final void invalidateMeasurementForSubtree(DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().isAttached()) {
            requireLayoutNode(delegatableNode).invalidateMeasurementForSubtree();
        }
    }

    public static final void invalidateSubtree(DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().isAttached()) {
            LayoutNode.invalidateSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    public static final boolean isDelegationRoot(DelegatableNode delegatableNode) {
        return delegatableNode.getNode() == delegatableNode;
    }

    public static final Modifier.Node nearestAncestor(DelegatableNode delegatableNode, int i) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("nearestAncestor called on an unattached node");
        }
        Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((fc.b(requireLayoutNode) & i) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & i) != 0) {
                        return parent$ui;
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent$ui = (requireLayoutNode == null || (nodes$ui = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return null;
    }

    /* renamed from: nearestAncestor-64DMado, reason: not valid java name */
    public static final <T> T m6413nearestAncestor64DMado(DelegatableNode delegatableNode, int i) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((fc.b(requireLayoutNode) & i) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & i) != 0) {
                        q10.G();
                        throw null;
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent$ui = (requireLayoutNode == null || (nodes$ui = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node pop(MutableVector<Modifier.Node> mutableVector) {
        if (mutableVector == null || mutableVector.getSize() == 0) {
            return null;
        }
        return (Modifier.Node) bv.d(mutableVector, 1);
    }

    public static final void requestAutofill(DelegatableNode delegatableNode) {
        requireLayoutNode(delegatableNode).requestAutofill$ui();
    }

    /* renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final NodeCoordinator m6414requireCoordinator64DMado(DelegatableNode delegatableNode, int i) {
        NodeCoordinator coordinator$ui = delegatableNode.getNode().getCoordinator$ui();
        coordinator$ui.getClass();
        if (coordinator$ui.getTail() != delegatableNode || !NodeKindKt.m6582getIncludeSelfInTraversalH91voCI(i)) {
            return coordinator$ui;
        }
        NodeCoordinator wrapped$ui = coordinator$ui.getWrapped$ui();
        wrapped$ui.getClass();
        return wrapped$ui;
    }

    public static final Density requireDensity(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getDensity();
    }

    public static final GraphicsContext requireGraphicsContext(DelegatableNode delegatableNode) {
        return requireOwner(delegatableNode).getGraphicsContext();
    }

    public static final LayoutCoordinates requireLayoutCoordinates(DelegatableNode delegatableNode) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        LayoutCoordinates coordinates = m6414requireCoordinator64DMado(delegatableNode, NodeKind.m6573constructorimpl(2)).getCoordinates();
        if (!coordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates is not attached.");
        }
        return coordinates;
    }

    public static final LayoutDirection requireLayoutDirection(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getLayoutDirection();
    }

    public static final LayoutNode requireLayoutNode(DelegatableNode delegatableNode) {
        NodeCoordinator coordinator$ui = delegatableNode.getNode().getCoordinator$ui();
        if (coordinator$ui != null) {
            return coordinator$ui.getLayoutNode();
        }
        throw k4.a("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final Owner requireOwner(DelegatableNode delegatableNode) {
        Owner owner$ui = requireLayoutNode(delegatableNode).getOwner$ui();
        if (owner$ui != null) {
            return owner$ui;
        }
        throw k4.a("This node does not have an owner.");
    }

    public static final SemanticsInfo requireSemanticsInfo(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode);
    }

    /* renamed from: setOfAncestors-6rFNWt0, reason: not valid java name */
    public static final <T> rl0 m6415setOfAncestors6rFNWt0(DelegatableNode delegatableNode, int i, boolean z) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((fc.b(requireLayoutNode) & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i) != 0) {
                        q10.G();
                        throw null;
                    }
                    node = node.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node = (requireLayoutNode == null || (nodes$ui = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return null;
    }

    /* renamed from: setOfAncestors-6rFNWt0$default, reason: not valid java name */
    public static rl0 m6416setOfAncestors6rFNWt0$default(DelegatableNode delegatableNode, int i, boolean z, int i2, Object obj) {
        NodeChain nodes$ui;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((fc.b(requireLayoutNode) & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i) != 0) {
                        q10.G();
                        throw null;
                    }
                    node = node.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node = (requireLayoutNode == null || (nodes$ui = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return null;
    }

    public static final void visitAncestors(DelegatableNode delegatableNode, int i, boolean z, ky kyVar) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((fc.b(requireLayoutNode) & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i) != 0) {
                        kyVar.invoke(node);
                    }
                    node = node.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node = (requireLayoutNode == null || (nodes$ui = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
    }

    public static /* synthetic */ void visitAncestors$default(DelegatableNode delegatableNode, int i, boolean z, ky kyVar, int i2, Object obj) {
        NodeChain nodes$ui;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((fc.b(requireLayoutNode) & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i) != 0) {
                        kyVar.invoke(node);
                    }
                    node = node.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node = (requireLayoutNode == null || (nodes$ui = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
    }

    /* renamed from: visitAncestors-QFhIj7k, reason: not valid java name */
    public static final <T> void m6417visitAncestorsQFhIj7k(DelegatableNode delegatableNode, int i, boolean z, boolean z2, ky kyVar) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((fc.b(requireLayoutNode) & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i) != 0) {
                        q10.G();
                        throw null;
                    }
                    node = node.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node = (requireLayoutNode == null || (nodes$ui = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
    }

    /* renamed from: visitAncestors-QFhIj7k$default, reason: not valid java name */
    public static void m6418visitAncestorsQFhIj7k$default(DelegatableNode delegatableNode, int i, boolean z, boolean z2, ky kyVar, int i2, Object obj) {
        NodeChain nodes$ui;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((fc.b(requireLayoutNode) & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i) != 0) {
                        q10.G();
                        throw null;
                    }
                    node = node.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node = (requireLayoutNode == null || (nodes$ui = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
    }

    public static final void visitChildren(DelegatableNode delegatableNode, int i, boolean z, ky kyVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) bv.d(mutableVector, 1);
            if ((node.getAggregateChildKindSet$ui() & i) == 0) {
                addLayoutNodeChildren(mutableVector, node, z);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui() & i) != 0) {
                        kyVar.invoke(node);
                        break;
                    }
                    node = node.getChild$ui();
                }
            }
        }
    }

    /* renamed from: visitChildren-Y-YKmho, reason: not valid java name */
    public static final <T> void m6419visitChildrenYYKmho(DelegatableNode delegatableNode, int i, boolean z, ky kyVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) bv.d(mutableVector, 1);
            if ((node.getAggregateChildKindSet$ui() & i) == 0) {
                addLayoutNodeChildren(mutableVector, node, z);
            } else {
                while (node != null) {
                    if ((node.getKindSet$ui() & i) != 0) {
                        q10.G();
                        throw null;
                    }
                    node = node.getChild$ui();
                }
            }
        }
    }

    /* renamed from: visitChildren-Y-YKmho$default, reason: not valid java name */
    public static void m6420visitChildrenYYKmho$default(DelegatableNode delegatableNode, int i, boolean z, ky kyVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) bv.d(mutableVector, 1);
            if ((node.getAggregateChildKindSet$ui() & i) == 0) {
                addLayoutNodeChildren(mutableVector, node, z);
            } else {
                while (node != null) {
                    if ((node.getKindSet$ui() & i) != 0) {
                        q10.G();
                        throw null;
                    }
                    node = node.getChild$ui();
                }
            }
        }
    }

    public static final void visitLocalAncestors(DelegatableNode delegatableNode, int i, ky kyVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if ((parent$ui.getKindSet$ui() & i) != 0) {
                kyVar.invoke(parent$ui);
            }
        }
    }

    /* renamed from: visitLocalAncestors-6rFNWt0, reason: not valid java name */
    public static final <T> void m6421visitLocalAncestors6rFNWt0(DelegatableNode delegatableNode, int i, ky kyVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if ((parent$ui.getKindSet$ui() & i) != 0) {
                q10.G();
                throw null;
            }
        }
    }

    public static final void visitLocalDescendants(DelegatableNode delegatableNode, int i, boolean z, ky kyVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui() & i) == 0) {
            return;
        }
        if (!z) {
            node = node.getChild$ui();
        }
        while (node != null) {
            if ((node.getKindSet$ui() & i) != 0) {
                kyVar.invoke(node);
            }
            node = node.getChild$ui();
        }
    }

    public static /* synthetic */ void visitLocalDescendants$default(DelegatableNode delegatableNode, int i, boolean z, ky kyVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui() & i) == 0) {
            return;
        }
        if (!z) {
            node = node.getChild$ui();
        }
        while (node != null) {
            if ((node.getKindSet$ui() & i) != 0) {
                kyVar.invoke(node);
            }
            node = node.getChild$ui();
        }
    }

    /* renamed from: visitLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final <T> void m6422visitLocalDescendants6rFNWt0(DelegatableNode delegatableNode, int i, ky kyVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui() & i) != 0) {
            for (Modifier.Node child$ui = node.getChild$ui(); child$ui != null; child$ui = child$ui.getChild$ui()) {
                if ((child$ui.getKindSet$ui() & i) != 0) {
                    q10.G();
                    throw null;
                }
            }
        }
    }

    /* renamed from: visitSelfAndAncestors-5BbP62I, reason: not valid java name */
    public static final <T> void m6423visitSelfAndAncestors5BbP62I(DelegatableNode delegatableNode, int i, int i2, ky kyVar) {
        NodeChain nodes$ui;
        Modifier.Node node = delegatableNode.getNode();
        int i3 = i | i2;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = delegatableNode.getNode();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((fc.b(requireLayoutNode) & i3) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & i3) != 0) {
                        if (node2 != node && (node2.getKindSet$ui() & i2) != 0) {
                            return;
                        }
                        if ((node2.getKindSet$ui() & i) != 0) {
                            q10.G();
                            throw null;
                        }
                    }
                    node2 = node2.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node2 = (requireLayoutNode == null || (nodes$ui = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
    }

    /* renamed from: visitSelfAndChildren-Y-YKmho, reason: not valid java name */
    public static final <T> void m6424visitSelfAndChildrenYYKmho(DelegatableNode delegatableNode, int i, boolean z, ky kyVar) {
        if (delegatableNode.getNode() != null) {
            q10.G();
            throw null;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) bv.d(mutableVector, 1);
            if ((node.getAggregateChildKindSet$ui() & i) == 0) {
                addLayoutNodeChildren(mutableVector, node, z);
            } else {
                while (node != null) {
                    if ((node.getKindSet$ui() & i) != 0) {
                        q10.G();
                        throw null;
                    }
                    node = node.getChild$ui();
                }
            }
        }
    }

    /* renamed from: visitSelfAndChildren-Y-YKmho$default, reason: not valid java name */
    public static void m6425visitSelfAndChildrenYYKmho$default(DelegatableNode delegatableNode, int i, boolean z, ky kyVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (delegatableNode.getNode() != null) {
            q10.G();
            throw null;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) bv.d(mutableVector, 1);
            if ((node.getAggregateChildKindSet$ui() & i) == 0) {
                addLayoutNodeChildren(mutableVector, node, z);
            } else {
                while (node != null) {
                    if ((node.getKindSet$ui() & i) != 0) {
                        q10.G();
                        throw null;
                    }
                    node = node.getChild$ui();
                }
            }
        }
    }

    /* renamed from: visitSelfAndLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final <T> void m6426visitSelfAndLocalDescendants6rFNWt0(DelegatableNode delegatableNode, int i, ky kyVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui() & i) != 0) {
            while (node != null) {
                if ((node.getKindSet$ui() & i) != 0) {
                    q10.G();
                    throw null;
                }
                node = node.getChild$ui();
            }
        }
    }

    /* renamed from: visitSubtree-Y-YKmho, reason: not valid java name */
    public static final <T> void m6427visitSubtreeYYKmho(DelegatableNode delegatableNode, int i, boolean z, ky kyVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) bv.d(mutableVector, 1);
            if ((node.getAggregateChildKindSet$ui() & i) != 0) {
                for (Modifier.Node node2 = node; node2 != null && node2.isAttached(); node2 = node2.getChild$ui()) {
                    if ((node2.getKindSet$ui() & i) != 0) {
                        q10.G();
                        throw null;
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z);
        }
    }

    /* renamed from: visitSubtree-Y-YKmho$default, reason: not valid java name */
    public static void m6428visitSubtreeYYKmho$default(DelegatableNode delegatableNode, int i, boolean z, ky kyVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) bv.d(mutableVector, 1);
            if ((node.getAggregateChildKindSet$ui() & i) != 0) {
                for (Modifier.Node node2 = node; node2 != null && node2.isAttached(); node2 = node2.getChild$ui()) {
                    if ((node2.getKindSet$ui() & i) != 0) {
                        q10.G();
                        throw null;
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z);
        }
    }

    public static final void visitSubtreeIf(DelegatableNode delegatableNode, int i, boolean z, ky kyVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) bv.d(mutableVector, 1);
            if ((node.getAggregateChildKindSet$ui() & i) != 0) {
                for (Modifier.Node node2 = node; node2 != null && node2.isAttached(); node2 = node2.getChild$ui()) {
                    if ((node2.getKindSet$ui() & i) == 0 || ((Boolean) kyVar.invoke(node2)).booleanValue()) {
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z);
        }
    }

    /* renamed from: visitSubtreeIf-Y-YKmho, reason: not valid java name */
    public static final <T> void m6429visitSubtreeIfYYKmho(DelegatableNode delegatableNode, int i, boolean z, ky kyVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) bv.d(mutableVector, 1);
            if ((node.getAggregateChildKindSet$ui() & i) != 0) {
                for (Modifier.Node node2 = node; node2 != null && node2.isAttached(); node2 = node2.getChild$ui()) {
                    if ((node2.getKindSet$ui() & i) != 0) {
                        q10.G();
                        throw null;
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z);
        }
    }

    /* renamed from: visitSubtreeIf-Y-YKmho$default, reason: not valid java name */
    public static void m6430visitSubtreeIfYYKmho$default(DelegatableNode delegatableNode, int i, boolean z, ky kyVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) bv.d(mutableVector, 1);
            if ((node.getAggregateChildKindSet$ui() & i) != 0) {
                for (Modifier.Node node2 = node; node2 != null && node2.isAttached(); node2 = node2.getChild$ui()) {
                    if ((node2.getKindSet$ui() & i) != 0) {
                        q10.G();
                        throw null;
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z);
        }
    }

    public static final void visitLocalDescendants(DelegatableNode delegatableNode, int i, ky kyVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui() & i) != 0) {
            for (Modifier.Node child$ui = node.getChild$ui(); child$ui != null; child$ui = child$ui.getChild$ui()) {
                if ((child$ui.getKindSet$ui() & i) != 0) {
                    kyVar.invoke(child$ui);
                }
            }
        }
    }
}
