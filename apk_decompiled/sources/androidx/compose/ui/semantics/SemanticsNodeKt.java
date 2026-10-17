package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.SemanticsModifierNode;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsNodeKt {
    public static final SemanticsNode SemanticsNode(LayoutNode layoutNode, boolean z) {
        NodeChain nodes$ui = layoutNode.getNodes$ui();
        int m6573constructorimpl = NodeKind.m6573constructorimpl(8);
        Object obj = null;
        if ((nodes$ui.getAggregateChildKindSet() & m6573constructorimpl) != 0) {
            Modifier.Node head$ui = nodes$ui.getHead$ui();
            loop0: while (true) {
                if (head$ui == null) {
                    break;
                }
                if ((head$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                    Modifier.Node node = head$ui;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof SemanticsModifierNode) {
                            obj = node;
                            break loop0;
                        }
                        if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node = delegate$ui;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            mutableVector.add(node);
                                            node = null;
                                        }
                                        mutableVector.add(delegate$ui);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head$ui.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                    break;
                }
                head$ui = head$ui.getChild$ui();
            }
        }
        obj.getClass();
        Modifier.Node node2 = ((SemanticsModifierNode) obj).getNode();
        SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
        if (semanticsConfiguration == null) {
            semanticsConfiguration = new SemanticsConfiguration();
        }
        return new SemanticsNode(node2, z, layoutNode, semanticsConfiguration);
    }

    public static /* synthetic */ SemanticsNode SemanticsNode$default(SemanticsModifierNode semanticsModifierNode, boolean z, LayoutNode layoutNode, int i, Object obj) {
        if ((i & 4) != 0) {
            layoutNode = DelegatableNodeKt.requireLayoutNode(semanticsModifierNode);
        }
        return SemanticsNode(semanticsModifierNode, z, layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int contentDescriptionFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 2000000000;
    }

    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, ky kyVar) {
        for (LayoutNode parent$ui = layoutNode.getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if (((Boolean) kyVar.invoke(parent$ui)).booleanValue()) {
                return parent$ui;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Role getRole(SemanticsNode semanticsNode) {
        return (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getRole());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int roleFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 1000000000;
    }

    public static final SemanticsNode SemanticsNode(SemanticsModifierNode semanticsModifierNode, boolean z, LayoutNode layoutNode) {
        Modifier.Node node = semanticsModifierNode.getNode();
        SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
        if (semanticsConfiguration == null) {
            semanticsConfiguration = new SemanticsConfiguration();
        }
        return new SemanticsNode(node, z, layoutNode, semanticsConfiguration);
    }
}
