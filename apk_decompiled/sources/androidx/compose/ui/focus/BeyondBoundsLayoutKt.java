package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import defpackage.fc;
import defpackage.ky;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BeyondBoundsLayoutKt {
    /* renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m4383searchBeyondBoundsOMvw8(FocusTargetNode focusTargetNode, int i, ky kyVar) {
        Modifier.Node node;
        BeyondBoundsLayout beyondBoundsLayoutParent;
        int m6223getBeforehoxUOeE;
        NodeChain nodes$ui;
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = focusTargetNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (true) {
            if (requireLayoutNode == null) {
                node = null;
                break;
            }
            if ((fc.b(requireLayoutNode) & m6573constructorimpl) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                        node = parent$ui;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
                                if (i2 == 1) {
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
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
        if ((focusTargetNode2 == null || !q10.b(focusTargetNode2.getBeyondBoundsLayoutParent(), focusTargetNode.getBeyondBoundsLayoutParent())) && (beyondBoundsLayoutParent = focusTargetNode.getBeyondBoundsLayoutParent()) != null) {
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (FocusDirection.m4388equalsimpl0(i, companion.m4399getUpdhqQ8s())) {
                m6223getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m6221getAbovehoxUOeE();
            } else if (FocusDirection.m4388equalsimpl0(i, companion.m4392getDowndhqQ8s())) {
                m6223getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m6224getBelowhoxUOeE();
            } else if (FocusDirection.m4388equalsimpl0(i, companion.m4395getLeftdhqQ8s())) {
                m6223getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m6225getLefthoxUOeE();
            } else if (FocusDirection.m4388equalsimpl0(i, companion.m4398getRightdhqQ8s())) {
                m6223getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m6226getRighthoxUOeE();
            } else if (FocusDirection.m4388equalsimpl0(i, companion.m4396getNextdhqQ8s())) {
                m6223getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m6222getAfterhoxUOeE();
            } else if (FocusDirection.m4388equalsimpl0(i, companion.m4397getPreviousdhqQ8s())) {
                m6223getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m6223getBeforehoxUOeE();
            } else {
                o.f("Unsupported direction for beyond bounds layout");
            }
            return (T) beyondBoundsLayoutParent.mo909layouto7g1Pn8(m6223getBeforehoxUOeE, kyVar);
        }
        return null;
    }
}
