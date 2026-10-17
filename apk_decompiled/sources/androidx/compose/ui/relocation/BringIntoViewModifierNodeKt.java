package androidx.compose.ui.relocation;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import defpackage.fc;
import defpackage.hm;
import defpackage.iy;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class BringIntoViewModifierNodeKt {
    public static final Object bringIntoView(DelegatableNode delegatableNode, iy iyVar, hm hmVar) {
        Object obj;
        NodeChain nodes$ui;
        boolean isAttached = delegatableNode.getNode().isAttached();
        w01 w01Var = w01.a;
        if (!isAttached) {
            return w01Var;
        }
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.BlendMode);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        loop0: while (true) {
            obj = null;
            if (requireLayoutNode == null) {
                break;
            }
            if ((fc.b(requireLayoutNode) & m6573constructorimpl) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                        Modifier.Node node = parent$ui;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof BringIntoViewModifierNode) {
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
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent$ui = (requireLayoutNode == null || (nodes$ui = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        BringIntoViewModifierNode bringIntoViewModifierNode = (BringIntoViewModifierNode) obj;
        if (bringIntoViewModifierNode == null) {
            return w01Var;
        }
        LayoutCoordinates requireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(delegatableNode);
        Object bringIntoView = bringIntoViewModifierNode.bringIntoView(requireLayoutCoordinates, new BringIntoViewModifierNodeKt$bringIntoView$2(iyVar, requireLayoutCoordinates), hmVar);
        return bringIntoView == vn.d ? bringIntoView : w01Var;
    }

    public static /* synthetic */ Object bringIntoView$default(DelegatableNode delegatableNode, iy iyVar, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iyVar = null;
        }
        return bringIntoView(delegatableNode, iyVar, hmVar);
    }
}
