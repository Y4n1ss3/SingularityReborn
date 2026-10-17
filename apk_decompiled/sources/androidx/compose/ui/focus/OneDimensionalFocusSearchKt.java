package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import defpackage.bv;
import defpackage.fc;
import defpackage.k10;
import defpackage.ky;
import defpackage.o;
import defpackage.q10;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OneDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 1-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final boolean backwardFocusSearch(FocusTargetNode focusTargetNode, ky kyVar) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[focusState.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return pickChildForBackwardSearch(focusTargetNode, kyVar);
            }
            if (i != 4) {
                o.n();
                return false;
            }
            if (!pickChildForBackwardSearch(focusTargetNode, kyVar)) {
                if (!(focusTargetNode.fetchFocusProperties$ui().getCanFocus() ? ((Boolean) kyVar.invoke(focusTargetNode)).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild == null) {
            o.f(NoActiveChild);
            return false;
        }
        int i2 = iArr[activeChild.getFocusState().ordinal()];
        if (i2 == 1) {
            return backwardFocusSearch(activeChild, kyVar) || m4454generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m4397getPreviousdhqQ8s(), kyVar) || (activeChild.fetchFocusProperties$ui().getCanFocus() && ((Boolean) kyVar.invoke(activeChild)).booleanValue());
        }
        if (i2 == 2 || i2 == 3) {
            return m4454generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m4397getPreviousdhqQ8s(), kyVar);
        }
        if (i2 != 4) {
            o.n();
            return false;
        }
        o.f(NoActiveChild);
        return false;
    }

    private static final <T> void forEachItemAfter(MutableVector<T> mutableVector, T t, ky kyVar) {
        boolean z = false;
        k10 W = y80.W(0, mutableVector.getSize());
        int i = W.d;
        int i2 = W.e;
        if (i > i2) {
            return;
        }
        while (true) {
            if (z) {
                kyVar.invoke(mutableVector.content[i]);
            }
            if (q10.b(mutableVector.content[i], t)) {
                z = true;
            }
            if (i == i2) {
                return;
            } else {
                i++;
            }
        }
    }

    private static final <T> void forEachItemBefore(MutableVector<T> mutableVector, T t, ky kyVar) {
        boolean z = false;
        k10 W = y80.W(0, mutableVector.getSize());
        int i = W.d;
        int i2 = W.e;
        if (i > i2) {
            return;
        }
        while (true) {
            if (z) {
                kyVar.invoke(mutableVector.content[i2]);
            }
            if (q10.b(mutableVector.content[i2], t)) {
                z = true;
            }
            if (i2 == i) {
                return;
            } else {
                i2--;
            }
        }
    }

    private static final boolean forwardFocusSearch(FocusTargetNode focusTargetNode, ky kyVar) {
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
            if (activeChild != null) {
                return forwardFocusSearch(activeChild, kyVar) || m4454generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m4396getNextdhqQ8s(), kyVar);
            }
            o.f(NoActiveChild);
            return false;
        }
        if (i == 2 || i == 3) {
            return pickChildForForwardSearch(focusTargetNode, kyVar);
        }
        if (i == 4) {
            return focusTargetNode.fetchFocusProperties$ui().getCanFocus() ? ((Boolean) kyVar.invoke(focusTargetNode)).booleanValue() : pickChildForForwardSearch(focusTargetNode, kyVar);
        }
        o.n();
        return false;
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m4454generateAndSearchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, ky kyVar) {
        if (m4456searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i, kyVar)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m4383searchBeyondBoundsOMvw8(focusTargetNode, i, new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode(), focusTargetNode, focusTargetNode2, i, kyVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean isRoot(FocusTargetNode focusTargetNode) {
        Modifier.Node node;
        NodeChain nodes$ui;
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = focusTargetNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (true) {
            node = null;
            if (requireLayoutNode == null) {
                break;
            }
            if ((fc.b(requireLayoutNode) & m6573constructorimpl) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                        Modifier.Node node2 = parent$ui;
                        MutableVector mutableVector = null;
                        while (node2 != null) {
                            if (node2 instanceof FocusTargetNode) {
                                node = node2;
                                break loop0;
                            }
                            if ((node2.getKindSet$ui() & m6573constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) node2).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node2 = delegate$ui;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                mutableVector.add(node2);
                                                node2 = null;
                                            }
                                            mutableVector.add(delegate$ui);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node2 = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent$ui = (requireLayoutNode == null || (nodes$ui = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return node == null;
    }

    /* renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m4455oneDimensionalFocusSearchOMvw8(FocusTargetNode focusTargetNode, int i, ky kyVar) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m4388equalsimpl0(i, companion.m4396getNextdhqQ8s())) {
            return forwardFocusSearch(focusTargetNode, kyVar);
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4397getPreviousdhqQ8s())) {
            return backwardFocusSearch(focusTargetNode, kyVar);
        }
        o.f(InvalidFocusDirection);
        return false;
    }

    private static final boolean pickChildForBackwardSearch(FocusTargetNode focusTargetNode, ky kyVar) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = focusTargetNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) bv.d(mutableVector2, 1);
            if ((node.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui() & m6573constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                mutableVector.add((FocusTargetNode) node);
                            } else if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate$ui;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.add(node);
                                                node = null;
                                            }
                                            mutableVector3.add(delegate$ui);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild$ui();
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        if (size < objArr.length) {
            while (size >= 0) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[size];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && backwardFocusSearch(focusTargetNode2, kyVar)) {
                    return true;
                }
                size--;
            }
        }
        return false;
    }

    private static final boolean pickChildForForwardSearch(FocusTargetNode focusTargetNode, ky kyVar) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = focusTargetNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) bv.d(mutableVector2, 1);
            if ((node.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui() & m6573constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                mutableVector.add((FocusTargetNode) node);
                            } else if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate$ui;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.add(node);
                                                node = null;
                                            }
                                            mutableVector3.add(delegate$ui);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild$ui();
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i2];
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && forwardFocusSearch(focusTargetNode2, kyVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m4456searchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, ky kyVar) {
        if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
            o.f("This function should only be used within a parent that has focus.");
            return false;
        }
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = focusTargetNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) bv.d(mutableVector2, 1);
            if ((node.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui() & m6573constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                mutableVector.add((FocusTargetNode) node);
                            } else if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node = delegate$ui;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.add(node);
                                                node = null;
                                            }
                                            mutableVector3.add(delegate$ui);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild$ui();
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m4388equalsimpl0(i, companion.m4396getNextdhqQ8s())) {
            k10 W = y80.W(0, mutableVector.getSize());
            int i3 = W.d;
            int i4 = W.e;
            if (i3 <= i4) {
                boolean z = false;
                while (true) {
                    if (z) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) mutableVector.content[i3];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && forwardFocusSearch(focusTargetNode3, kyVar)) {
                            return true;
                        }
                    }
                    if (q10.b(mutableVector.content[i3], focusTargetNode2)) {
                        z = true;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3++;
                }
            }
        } else {
            if (!FocusDirection.m4388equalsimpl0(i, companion.m4397getPreviousdhqQ8s())) {
                o.f(InvalidFocusDirection);
                return false;
            }
            k10 W2 = y80.W(0, mutableVector.getSize());
            int i5 = W2.d;
            int i6 = W2.e;
            if (i5 <= i6) {
                boolean z2 = false;
                while (true) {
                    if (z2) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) mutableVector.content[i6];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode4) && backwardFocusSearch(focusTargetNode4, kyVar)) {
                            return true;
                        }
                    }
                    if (q10.b(mutableVector.content[i6], focusTargetNode2)) {
                        z2 = true;
                    }
                    if (i6 == i5) {
                        break;
                    }
                    i6--;
                }
            }
        }
        if (FocusDirection.m4388equalsimpl0(i, FocusDirection.Companion.m4396getNextdhqQ8s()) || !focusTargetNode.fetchFocusProperties$ui().getCanFocus() || isRoot(focusTargetNode)) {
            return false;
        }
        return ((Boolean) kyVar.invoke(focusTargetNode)).booleanValue();
    }

    private static /* synthetic */ void getInvalidFocusDirection$annotations() {
    }

    private static /* synthetic */ void getNoActiveChild$annotations() {
    }
}
