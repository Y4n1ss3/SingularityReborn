package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bv;
import defpackage.fc;
import defpackage.ky;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusTraversalKt {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: customFocusSearch--OM-vw8, reason: not valid java name */
    public static final FocusRequester m4440customFocusSearchOMvw8(FocusTargetNode focusTargetNode, int i, LayoutDirection layoutDirection) {
        FocusRequester end;
        FocusRequester focusRequester;
        FocusRequester start;
        FocusProperties fetchFocusProperties$ui = focusTargetNode.fetchFocusProperties$ui();
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m4388equalsimpl0(i, companion.m4396getNextdhqQ8s())) {
            return fetchFocusProperties$ui.getNext();
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4397getPreviousdhqQ8s())) {
            return fetchFocusProperties$ui.getPrevious();
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4399getUpdhqQ8s())) {
            return fetchFocusProperties$ui.getUp();
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4392getDowndhqQ8s())) {
            return fetchFocusProperties$ui.getDown();
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4395getLeftdhqQ8s())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                start = fetchFocusProperties$ui.getStart();
            } else {
                if (i2 != 2) {
                    o.n();
                    return null;
                }
                start = fetchFocusProperties$ui.getEnd();
            }
            focusRequester = start != FocusRequester.Companion.getDefault() ? start : null;
            return focusRequester == null ? fetchFocusProperties$ui.getLeft() : focusRequester;
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4398getRightdhqQ8s())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                end = fetchFocusProperties$ui.getEnd();
            } else {
                if (i3 != 2) {
                    o.n();
                    return null;
                }
                end = fetchFocusProperties$ui.getStart();
            }
            focusRequester = end != FocusRequester.Companion.getDefault() ? end : null;
            return focusRequester == null ? fetchFocusProperties$ui.getRight() : focusRequester;
        }
        if (!FocusDirection.m4388equalsimpl0(i, companion.m4393getEnterdhqQ8s()) && !FocusDirection.m4388equalsimpl0(i, companion.m4394getExitdhqQ8s())) {
            o.f("invalid FocusDirection");
            return null;
        }
        CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i, null);
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        if (FocusDirection.m4388equalsimpl0(i, companion.m4393getEnterdhqQ8s())) {
            fetchFocusProperties$ui.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
        } else {
            fetchFocusProperties$ui.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
        }
        return cancelIndicatingFocusBoundaryScope.isCanceled() ? FocusRequester.Companion.getCancel() : activeFocusTargetNode != focusOwner.getActiveFocusTargetNode() ? FocusRequester.Companion.getRedirect$ui() : FocusRequester.Companion.getDefault();
    }

    public static final FocusTargetNode findActiveFocusNode(FocusTargetNode focusTargetNode) {
        FocusTargetNode activeFocusTargetNode = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
        if (activeFocusTargetNode == null || !activeFocusTargetNode.isAttached()) {
            return null;
        }
        return activeFocusTargetNode;
    }

    private static final FocusTargetNode findNonDeactivatedParent(FocusTargetNode focusTargetNode) {
        NodeChain nodes$ui;
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = focusTargetNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        while (requireLayoutNode != null) {
            if ((fc.b(requireLayoutNode) & m6573constructorimpl) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                        Modifier.Node node = parent$ui;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                if (focusTargetNode2.fetchFocusProperties$ui().getCanFocus()) {
                                    return focusTargetNode2;
                                }
                            } else if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
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
        return null;
    }

    public static final Rect focusRect(FocusTargetNode focusTargetNode) {
        LayoutCoordinates findRootCoordinates;
        if (!focusTargetNode.isAttached()) {
            return Rect.Companion.getZero();
        }
        NodeCoordinator coordinator$ui = focusTargetNode.getCoordinator$ui();
        if (coordinator$ui != null && (findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(coordinator$ui)) != null) {
            if (!findRootCoordinates.isAttached()) {
                findRootCoordinates = null;
            }
            if (findRootCoordinates != null) {
                return focusTargetNode.fetchFocusRect$ui(findRootCoordinates);
            }
        }
        return Rect.Companion.getZero();
    }

    /* renamed from: focusSearch-0X8WOeE, reason: not valid java name */
    public static final Boolean m4441focusSearch0X8WOeE(FocusTargetNode focusTargetNode, int i, LayoutDirection layoutDirection, Rect rect, ky kyVar) {
        int m4398getRightdhqQ8s;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m4388equalsimpl0(i, companion.m4396getNextdhqQ8s()) || FocusDirection.m4388equalsimpl0(i, companion.m4397getPreviousdhqQ8s())) {
            return Boolean.valueOf(OneDimensionalFocusSearchKt.m4455oneDimensionalFocusSearchOMvw8(focusTargetNode, i, kyVar));
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4395getLeftdhqQ8s()) || FocusDirection.m4388equalsimpl0(i, companion.m4398getRightdhqQ8s()) || FocusDirection.m4388equalsimpl0(i, companion.m4399getUpdhqQ8s()) || FocusDirection.m4388equalsimpl0(i, companion.m4392getDowndhqQ8s())) {
            return TwoDimensionalFocusSearchKt.m4466twoDimensionalFocusSearchsMXa3k8(focusTargetNode, i, rect, kyVar);
        }
        if (!FocusDirection.m4388equalsimpl0(i, companion.m4393getEnterdhqQ8s())) {
            if (FocusDirection.m4388equalsimpl0(i, companion.m4394getExitdhqQ8s())) {
                FocusTargetNode findActiveFocusNode = findActiveFocusNode(focusTargetNode);
                FocusTargetNode findNonDeactivatedParent = findActiveFocusNode != null ? findNonDeactivatedParent(findActiveFocusNode) : null;
                return Boolean.valueOf((findNonDeactivatedParent == null || findNonDeactivatedParent == focusTargetNode) ? false : ((Boolean) kyVar.invoke(findNonDeactivatedParent)).booleanValue());
            }
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) FocusDirection.m4390toStringimpl(i))).toString());
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i2 == 1) {
            m4398getRightdhqQ8s = companion.m4398getRightdhqQ8s();
        } else {
            if (i2 != 2) {
                o.n();
                return null;
            }
            m4398getRightdhqQ8s = companion.m4395getLeftdhqQ8s();
        }
        FocusTargetNode findActiveFocusNode2 = findActiveFocusNode(focusTargetNode);
        if (findActiveFocusNode2 != null) {
            return TwoDimensionalFocusSearchKt.m4466twoDimensionalFocusSearchsMXa3k8(findActiveFocusNode2, m4398getRightdhqQ8s, rect, kyVar);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0041, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FocusTargetNode getActiveChild(FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.getNode().isAttached()) {
            return null;
        }
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = focusTargetNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusTargetNode.getNode(), false);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) bv.d(mutableVector, 1);
            if ((node.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui() & m6573constructorimpl) != 0) {
                        MutableVector mutableVector2 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                if (focusTargetNode2.getNode().isAttached()) {
                                    int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode2.getFocusState().ordinal()];
                                    if (i == 1 || i == 2 || i == 3) {
                                        return focusTargetNode2;
                                    }
                                    if (i != 4) {
                                        o.n();
                                        return null;
                                    }
                                }
                            } else if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node = delegate$ui;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector2.add(node);
                                                node = null;
                                            }
                                            mutableVector2.add(delegate$ui);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector2);
                        }
                    } else {
                        node = node.getChild$ui();
                    }
                }
            }
        }
        return null;
    }

    public static final boolean isEligibleForFocusSearch(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        NodeCoordinator coordinator$ui;
        LayoutNode layoutNode2;
        NodeCoordinator coordinator$ui2 = focusTargetNode.getCoordinator$ui();
        return (coordinator$ui2 == null || (layoutNode = coordinator$ui2.getLayoutNode()) == null || !layoutNode.isPlaced() || (coordinator$ui = focusTargetNode.getCoordinator$ui()) == null || (layoutNode2 = coordinator$ui.getLayoutNode()) == null || !layoutNode2.isAttached()) ? false : true;
    }
}
