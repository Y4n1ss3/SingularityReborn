package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import defpackage.fc;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusTransactionsKt {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean captureFocus(FocusTargetNode focusTargetNode) {
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        boolean z = true;
        if (i == 1) {
            DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setFocusCaptured(true);
            focusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Active, FocusStateImpl.Captured);
            return true;
        }
        if (i != 2) {
            z = false;
            if (i != 3 && i != 4) {
                o.n();
            }
        }
        return z;
    }

    private static final boolean clearChildFocus(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return clearFocus(activeChild, z, z2);
        }
        return true;
    }

    public static /* synthetic */ boolean clearChildFocus$default(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return clearChildFocus(focusTargetNode, z, z2);
    }

    public static final boolean clearFocus(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            if (!ComposeUiFlags.isOptimizedFocusEventDispatchEnabled) {
                DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(null);
                if (z2) {
                    focusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Active, FocusStateImpl.Inactive);
                }
            }
            return true;
        }
        if (i == 2) {
            if (z && !ComposeUiFlags.isOptimizedFocusEventDispatchEnabled) {
                DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(null);
                if (z2) {
                    focusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Captured, FocusStateImpl.Inactive);
                }
            }
            return z;
        }
        if (i != 3) {
            if (i == 4) {
                return true;
            }
            o.n();
            return false;
        }
        if (!clearChildFocus(focusTargetNode, z, z2)) {
            return false;
        }
        if (z2) {
            focusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
        }
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return clearFocus(focusTargetNode, z, z2);
    }

    public static final boolean freeFocus(FocusTargetNode focusTargetNode) {
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    o.n();
                }
                return false;
            }
            DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setFocusCaptured(false);
            focusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Captured, FocusStateImpl.Active);
        }
        return true;
    }

    private static final boolean grantFocus(FocusTargetNode focusTargetNode) {
        ObserverModifierNodeKt.observeReads(focusTargetNode, new FocusTransactionsKt$grantFocus$1(focusTargetNode));
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                o.n();
                return false;
            }
            DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(focusTargetNode);
        }
        return true;
    }

    /* renamed from: performCustomClearFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m4433performCustomClearFocusMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i2 == 3) {
                CustomDestinationResult m4433performCustomClearFocusMxy_nc0 = m4433performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i);
                CustomDestinationResult customDestinationResult = m4433performCustomClearFocusMxy_nc0 != CustomDestinationResult.None ? m4433performCustomClearFocusMxy_nc0 : null;
                return customDestinationResult == null ? m4435performCustomExitMxy_nc0(focusTargetNode, i) : customDestinationResult;
            }
            if (i2 != 4) {
                o.n();
                return null;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomEnter-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m4434performCustomEnterMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                FocusProperties fetchFocusProperties$ui = focusTargetNode.fetchFocusProperties$ui();
                CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i, null);
                FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
                FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
                fetchFocusProperties$ui.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
                FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
                if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
                    FocusRequester.Companion companion = FocusRequester.Companion;
                    FocusRequester cancel = companion.getCancel();
                    if (cancel == companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    if (cancel == companion.getRedirect$ui()) {
                        return CustomDestinationResult.Redirected;
                    }
                    return FocusRequester.m4419requestFocus3ESFkO8$default(cancel, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
                if (activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null) {
                    FocusRequester.Companion companion2 = FocusRequester.Companion;
                    FocusRequester redirect$ui = companion2.getRedirect$ui();
                    if (redirect$ui == companion2.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    if (redirect$ui == companion2.getRedirect$ui()) {
                        return CustomDestinationResult.Redirected;
                    }
                    return FocusRequester.m4419requestFocus3ESFkO8$default(redirect$ui, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomEnter = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomExit-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m4435performCustomExitMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.isProcessingCustomExit) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                FocusProperties fetchFocusProperties$ui = focusTargetNode.fetchFocusProperties$ui();
                CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i, null);
                FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
                FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
                fetchFocusProperties$ui.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
                FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
                if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
                    FocusRequester.Companion companion = FocusRequester.Companion;
                    FocusRequester cancel = companion.getCancel();
                    if (cancel == companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    if (cancel == companion.getRedirect$ui()) {
                        return CustomDestinationResult.Redirected;
                    }
                    return FocusRequester.m4419requestFocus3ESFkO8$default(cancel, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
                if (activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null) {
                    FocusRequester.Companion companion2 = FocusRequester.Companion;
                    FocusRequester redirect$ui = companion2.getRedirect$ui();
                    if (redirect$ui == companion2.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    if (redirect$ui == companion2.getRedirect$ui()) {
                        return CustomDestinationResult.Redirected;
                    }
                    return FocusRequester.m4419requestFocus3ESFkO8$default(redirect$ui, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomExit = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomRequestFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m4436performCustomRequestFocusMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        Modifier.Node node;
        NodeChain nodes$ui;
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return CustomDestinationResult.None;
        }
        if (i2 == 3) {
            return m4433performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i);
        }
        if (i2 != 4) {
            o.n();
            return null;
        }
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
                        MutableVector mutableVector = null;
                        node = parent$ui;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i3++;
                                        if (i3 == 1) {
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
                                if (i3 == 1) {
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
        if (focusTargetNode2 == null) {
            return CustomDestinationResult.None;
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode2.getFocusState().ordinal()];
        if (i4 == 1) {
            return m4434performCustomEnterMxy_nc0(focusTargetNode2, i);
        }
        if (i4 == 2) {
            return CustomDestinationResult.Cancelled;
        }
        if (i4 == 3) {
            return m4436performCustomRequestFocusMxy_nc0(focusTargetNode2, i);
        }
        if (i4 != 4) {
            o.n();
            return null;
        }
        CustomDestinationResult m4436performCustomRequestFocusMxy_nc0 = m4436performCustomRequestFocusMxy_nc0(focusTargetNode2, i);
        CustomDestinationResult customDestinationResult = m4436performCustomRequestFocusMxy_nc0 != CustomDestinationResult.None ? m4436performCustomRequestFocusMxy_nc0 : null;
        return customDestinationResult == null ? m4434performCustomEnterMxy_nc0(focusTargetNode2, i) : customDestinationResult;
    }

    public static final boolean performRequestFocus(FocusTargetNode focusTargetNode) {
        MutableVector mutableVector;
        NodeChain nodes$ui;
        NodeChain nodes$ui2;
        FocusOwner focusOwner;
        boolean z;
        String str;
        String str2;
        NodeChain nodes$ui3;
        FocusOwner focusOwner2 = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner2.getActiveFocusTargetNode();
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int i = 1;
        if (activeFocusTargetNode == focusTargetNode) {
            focusTargetNode.dispatchFocusCallbacks$ui(focusState, focusState);
            return true;
        }
        MutableVector mutableVector2 = null;
        if (ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
            if ((activeFocusTargetNode == null || activeFocusTargetNode.isInteropViewHost()) && !focusTargetNode.isInteropViewHost() && !m4438requestOwnerFocusEtdf9zw$default(focusTargetNode, null, null, 3, null)) {
                return false;
            }
        } else if (activeFocusTargetNode == null && !m4438requestOwnerFocusEtdf9zw$default(focusTargetNode, null, null, 3, null)) {
            return false;
        }
        String str3 = "visitAncestors called on an unattached node";
        int i2 = Fields.RotationZ;
        if (activeFocusTargetNode != null) {
            mutableVector = new MutableVector(new FocusTargetNode[16], 0);
            int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
            if (!activeFocusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui = activeFocusTargetNode.getNode().getParent$ui();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode);
            while (requireLayoutNode != null) {
                if ((fc.b(requireLayoutNode) & m6573constructorimpl) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                            MutableVector mutableVector3 = mutableVector2;
                            Modifier.Node node = parent$ui;
                            while (node != null) {
                                int i3 = i2;
                                if (node instanceof FocusTargetNode) {
                                    mutableVector.add((FocusTargetNode) node);
                                } else if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui();
                                    int i4 = 0;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                            i4++;
                                            if (i4 == i) {
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
                                        delegate$ui = delegate$ui.getChild$ui();
                                        i = 1;
                                    }
                                    if (i4 == i) {
                                        i2 = i3;
                                    }
                                }
                                node = DelegatableNodeKt.pop(mutableVector3);
                                i2 = i3;
                                i = 1;
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                        i2 = i2;
                        i = 1;
                        mutableVector2 = null;
                    }
                }
                int i5 = i2;
                requireLayoutNode = requireLayoutNode.getParent$ui();
                parent$ui = (requireLayoutNode == null || (nodes$ui3 = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui3.getTail$ui();
                i2 = i5;
                i = 1;
                mutableVector2 = null;
            }
        } else {
            mutableVector = null;
        }
        int i6 = i2;
        MutableVector mutableVector4 = new MutableVector(new FocusTargetNode[16], 0);
        MutableVector mutableVector5 = new MutableVector(new FocusTargetNode[16], 0);
        int m6573constructorimpl2 = NodeKind.m6573constructorimpl(i6);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui2 = focusTargetNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        boolean z2 = true;
        while (requireLayoutNode2 != null) {
            if ((fc.b(requireLayoutNode2) & m6573constructorimpl2) != 0) {
                while (parent$ui2 != null) {
                    if ((parent$ui2.getKindSet$ui() & m6573constructorimpl2) != 0) {
                        Modifier.Node node2 = parent$ui2;
                        MutableVector mutableVector6 = null;
                        while (node2 != null) {
                            if (node2 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = node2;
                                focusOwner = focusOwner2;
                                if (q10.b(mutableVector != null ? Boolean.valueOf(mutableVector.remove(focusTargetNode2)) : null, Boolean.TRUE)) {
                                    mutableVector4.add(focusTargetNode2);
                                } else {
                                    mutableVector5.add(focusTargetNode2);
                                }
                                if (focusTargetNode2 == activeFocusTargetNode) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                focusOwner = focusOwner2;
                                z = true;
                            }
                            if (z && (node2.getKindSet$ui() & m6573constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui2 = ((DelegatingNode) node2).getDelegate$ui();
                                int i7 = 0;
                                while (delegate$ui2 != null) {
                                    if ((delegate$ui2.getKindSet$ui() & m6573constructorimpl2) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            node2 = delegate$ui2;
                                        } else {
                                            if (mutableVector6 == null) {
                                                str2 = str3;
                                                mutableVector6 = new MutableVector(new Modifier.Node[16], 0);
                                            } else {
                                                str2 = str3;
                                            }
                                            if (node2 != null) {
                                                mutableVector6.add(node2);
                                                node2 = null;
                                            }
                                            mutableVector6.add(delegate$ui2);
                                            delegate$ui2 = delegate$ui2.getChild$ui();
                                            str3 = str2;
                                        }
                                    }
                                    str2 = str3;
                                    delegate$ui2 = delegate$ui2.getChild$ui();
                                    str3 = str2;
                                }
                                str = str3;
                                if (i7 == 1) {
                                    focusOwner2 = focusOwner;
                                    str3 = str;
                                }
                            } else {
                                str = str3;
                            }
                            node2 = DelegatableNodeKt.pop(mutableVector6);
                            focusOwner2 = focusOwner;
                            str3 = str;
                        }
                    }
                    parent$ui2 = parent$ui2.getParent$ui();
                    focusOwner2 = focusOwner2;
                    str3 = str3;
                }
            }
            FocusOwner focusOwner3 = focusOwner2;
            String str4 = str3;
            requireLayoutNode2 = requireLayoutNode2.getParent$ui();
            parent$ui2 = (requireLayoutNode2 == null || (nodes$ui2 = requireLayoutNode2.getNodes$ui()) == null) ? null : nodes$ui2.getTail$ui();
            focusOwner2 = focusOwner3;
            str3 = str4;
        }
        FocusOwner focusOwner4 = focusOwner2;
        String str5 = str3;
        if (z2 && activeFocusTargetNode != null && !clearFocus$default(activeFocusTargetNode, false, true, 1, null)) {
            return false;
        }
        grantFocus(focusTargetNode);
        if (ComposeUiFlags.isOptimizedFocusEventDispatchEnabled && z2 && activeFocusTargetNode != null) {
            activeFocusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Active, FocusStateImpl.Inactive);
        }
        if (mutableVector != null) {
            int size = mutableVector.getSize() - 1;
            Object[] objArr = mutableVector.content;
            if (size < objArr.length) {
                while (size >= 0) {
                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[size];
                    if (focusOwner4.getActiveFocusTargetNode() != focusTargetNode) {
                        return false;
                    }
                    focusTargetNode3.dispatchFocusCallbacks$ui(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                    size--;
                }
            }
        }
        int size2 = mutableVector5.getSize() - 1;
        Object[] objArr2 = mutableVector5.content;
        if (size2 < objArr2.length) {
            while (size2 >= 0) {
                FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr2[size2];
                if (focusOwner4.getActiveFocusTargetNode() != focusTargetNode) {
                    return false;
                }
                focusTargetNode4.dispatchFocusCallbacks$ui(focusTargetNode4 == activeFocusTargetNode ? FocusStateImpl.Active : FocusStateImpl.Inactive, FocusStateImpl.ActiveParent);
                size2--;
            }
        }
        if (focusOwner4.getActiveFocusTargetNode() != focusTargetNode) {
            return false;
        }
        focusTargetNode.dispatchFocusCallbacks$ui(focusState, FocusStateImpl.Active);
        if (focusOwner4.getActiveFocusTargetNode() != focusTargetNode) {
            return false;
        }
        if (ComposeUiFlags.isFocusRestorationEnabled) {
            FocusTargetNode focusTargetNode5 = (FocusTargetNode) (mutableVector4.getSize() == 0 ? null : mutableVector4.content[mutableVector4.getSize() - 1]);
            int m6573constructorimpl3 = NodeKind.m6573constructorimpl(i6);
            if (!focusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException(str5);
            }
            Modifier.Node parent$ui3 = focusTargetNode.getNode().getParent$ui();
            LayoutNode requireLayoutNode3 = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop10: while (requireLayoutNode3 != null) {
                if ((fc.b(requireLayoutNode3) & m6573constructorimpl3) != 0) {
                    while (parent$ui3 != null) {
                        if ((parent$ui3.getKindSet$ui() & m6573constructorimpl3) != 0) {
                            Modifier.Node node3 = parent$ui3;
                            MutableVector mutableVector7 = null;
                            while (node3 != null) {
                                if (node3 instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode6 = (FocusTargetNode) node3;
                                    FocusRestorerKt.saveFocusedChild(focusTargetNode6);
                                    if (focusTargetNode6 == focusTargetNode5) {
                                        break loop10;
                                    }
                                } else if ((node3.getKindSet$ui() & m6573constructorimpl3) != 0 && (node3 instanceof DelegatingNode)) {
                                    int i8 = 0;
                                    for (Modifier.Node delegate$ui3 = ((DelegatingNode) node3).getDelegate$ui(); delegate$ui3 != null; delegate$ui3 = delegate$ui3.getChild$ui()) {
                                        if ((delegate$ui3.getKindSet$ui() & m6573constructorimpl3) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                node3 = delegate$ui3;
                                            } else {
                                                if (mutableVector7 == null) {
                                                    mutableVector7 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node3 != null) {
                                                    mutableVector7.add(node3);
                                                    node3 = null;
                                                }
                                                mutableVector7.add(delegate$ui3);
                                            }
                                        }
                                    }
                                    if (i8 != 1) {
                                        node3 = DelegatableNodeKt.pop(mutableVector7);
                                    }
                                }
                                node3 = DelegatableNodeKt.pop(mutableVector7);
                            }
                        }
                        parent$ui3 = parent$ui3.getParent$ui();
                    }
                }
                requireLayoutNode3 = requireLayoutNode3.getParent$ui();
                parent$ui3 = (requireLayoutNode3 == null || (nodes$ui = requireLayoutNode3.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
        }
        if (!ComposeUiFlags.isViewFocusFixEnabled || DelegatableNodeKt.requireLayoutNode(focusTargetNode).getInteropView() != null) {
            return true;
        }
        m4437requestOwnerFocusEtdf9zw(focusTargetNode, FocusDirection.m4385boximpl(FocusDirection.Companion.m4396getNextdhqQ8s()), null);
        return true;
    }

    /* renamed from: requestOwnerFocus-Etdf9zw, reason: not valid java name */
    private static final boolean m4437requestOwnerFocusEtdf9zw(FocusTargetNode focusTargetNode, FocusDirection focusDirection, Rect rect) {
        return DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().mo4410requestOwnerFocus7o62pno(focusDirection, rect);
    }

    /* renamed from: requestOwnerFocus-Etdf9zw$default, reason: not valid java name */
    public static /* synthetic */ boolean m4438requestOwnerFocusEtdf9zw$default(FocusTargetNode focusTargetNode, FocusDirection focusDirection, Rect rect, int i, Object obj) {
        if ((i & 1) != 0) {
            focusDirection = null;
        }
        if ((i & 2) != 0) {
            rect = null;
        }
        return m4437requestOwnerFocusEtdf9zw(focusTargetNode, focusDirection, rect);
    }

    private static final FocusTargetNode requireActiveChild(FocusTargetNode focusTargetNode) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return activeChild;
        }
        o.m("ActiveParent with no focused child");
        return null;
    }
}
