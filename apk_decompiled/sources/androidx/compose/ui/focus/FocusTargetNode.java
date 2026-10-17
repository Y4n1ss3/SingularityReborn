package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.dq;
import defpackage.er;
import defpackage.fc;
import defpackage.ji0;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusTargetNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutAwareModifierNode, FocusTargetModifierNode, ObserverModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 8;
    private FocusStateImpl committedFocusState;
    private int focusability;
    private final boolean isInteropViewHost;
    private boolean isProcessingCustomEnter;
    private boolean isProcessingCustomExit;
    private final ky onDispatchEventsCompleted;
    private final my onFocusChange;
    private Integer previouslyFocusedChildHash;
    private final boolean shouldAutoInvalidate;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ FocusTargetNode(int i, boolean z, my myVar, ky kyVar, int i2, dq dqVar) {
        this((i2 & 1) != 0 ? Focusability.Companion.m4450getAlwaysLCbbffg() : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : myVar, (i2 & 8) != 0 ? null : kyVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: assignFocus-3ESFkO8, reason: not valid java name */
    public final boolean m4428assignFocus3ESFkO8(int i) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m4436performCustomRequestFocusMxy_nc0(this, i).ordinal()];
        if (i2 == 1) {
            return FocusTransactionsKt.performRequestFocus(this);
        }
        if (i2 == 2) {
            return true;
        }
        if (i2 == 3 || i2 == 4) {
            return false;
        }
        o.n();
        return false;
    }

    /* renamed from: fetchCustomEnterOrExit-ULY8qGw, reason: not valid java name */
    private final void m4429fetchCustomEnterOrExitULY8qGw(int i, ky kyVar, my myVar) {
        Object fetchFocusProperties$ui = fetchFocusProperties$ui();
        CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i, null);
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        myVar.invoke(fetchFocusProperties$ui, cancelIndicatingFocusBoundaryScope);
        FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
        if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
            kyVar.invoke(FocusRequester.Companion.getCancel());
        } else {
            if (activeFocusTargetNode == activeFocusTargetNode2 || activeFocusTargetNode2 == null) {
                return;
            }
            kyVar.invoke(FocusRequester.Companion.getRedirect$ui());
        }
    }

    public static /* synthetic */ Rect fetchFocusRect$ui$default(FocusTargetNode focusTargetNode, LayoutCoordinates layoutCoordinates, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutCoordinates = null;
        }
        return focusTargetNode.fetchFocusRect$ui(layoutCoordinates);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v9 */
    public final void dispatchFocusCallbacks$ui(FocusState focusState, FocusState focusState2) {
        NodeChain nodes$ui;
        my myVar;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        if (!q10.b(focusState, focusState2) && (myVar = this.onFocusChange) != null) {
            myVar.invoke(focusState, focusState2);
        }
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.TransformOrigin);
        int m6573constructorimpl2 = NodeKind.m6573constructorimpl(Fields.RotationZ);
        Modifier.Node node = getNode();
        int i = m6573constructorimpl | m6573constructorimpl2;
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = getNode();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        loop0: while (requireLayoutNode != null) {
            if ((fc.b(requireLayoutNode) & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & i) != 0) {
                        if (node2 != node && (node2.getKindSet$ui() & m6573constructorimpl2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui() & m6573constructorimpl) != 0) {
                            DelegatingNode delegatingNode = node2;
                            MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof FocusEventModifierNode) {
                                    FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) delegatingNode;
                                    if (activeFocusTargetNode == focusOwner.getActiveFocusTargetNode()) {
                                        focusEventModifierNode.onFocusEvent(focusState2);
                                    }
                                } else if ((delegatingNode.getKindSet$ui() & m6573constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = delegatingNode.getDelegate$ui();
                                    int i2 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                delegatingNode = delegate$ui;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    mutableVector.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                mutableVector.add(delegate$ui);
                                            }
                                        }
                                        delegate$ui = delegate$ui.getChild$ui();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node2 = (requireLayoutNode == null || (nodes$ui = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        ky kyVar = this.onDispatchEventsCompleted;
        if (kyVar != null) {
            kyVar.invoke(this);
        }
    }

    /* renamed from: fetchCustomEnter-aToIllA$ui, reason: not valid java name */
    public final void m4430fetchCustomEnteraToIllA$ui(int i, ky kyVar) {
        if (this.isProcessingCustomEnter) {
            return;
        }
        this.isProcessingCustomEnter = true;
        try {
            FocusProperties fetchFocusProperties$ui = fetchFocusProperties$ui();
            CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i, null);
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
            fetchFocusProperties$ui.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
            FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
            if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
                kyVar.invoke(FocusRequester.Companion.getCancel());
            } else if (activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null) {
                kyVar.invoke(FocusRequester.Companion.getRedirect$ui());
            }
            this.isProcessingCustomEnter = false;
        } catch (Throwable th) {
            this.isProcessingCustomEnter = false;
            throw th;
        }
    }

    /* renamed from: fetchCustomExit-aToIllA$ui, reason: not valid java name */
    public final void m4431fetchCustomExitaToIllA$ui(int i, ky kyVar) {
        if (this.isProcessingCustomExit) {
            return;
        }
        this.isProcessingCustomExit = true;
        try {
            FocusProperties fetchFocusProperties$ui = fetchFocusProperties$ui();
            CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i, null);
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
            fetchFocusProperties$ui.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
            FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
            if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
                kyVar.invoke(FocusRequester.Companion.getCancel());
            } else if (activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null) {
                kyVar.invoke(FocusRequester.Companion.getRedirect$ui());
            }
            this.isProcessingCustomExit = false;
        } catch (Throwable th) {
            this.isProcessingCustomExit = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final FocusProperties fetchFocusProperties$ui() {
        NodeChain nodes$ui;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        focusPropertiesImpl.setCanFocus(Focusability.m4443canFocusimpl$ui(mo4422getFocusabilityLCbbffg(), this));
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.CameraDistance);
        int m6573constructorimpl2 = NodeKind.m6573constructorimpl(Fields.RotationZ);
        Modifier.Node node = getNode();
        int i = m6573constructorimpl | m6573constructorimpl2;
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = getNode();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        while (requireLayoutNode != null) {
            if ((fc.b(requireLayoutNode) & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & i) != 0) {
                        if (node2 != node && (node2.getKindSet$ui() & m6573constructorimpl2) != 0) {
                            return focusPropertiesImpl;
                        }
                        if ((node2.getKindSet$ui() & m6573constructorimpl) != 0) {
                            DelegatingNode delegatingNode = node2;
                            MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof FocusPropertiesModifierNode) {
                                    ((FocusPropertiesModifierNode) delegatingNode).applyFocusProperties(focusPropertiesImpl);
                                } else if ((delegatingNode.getKindSet$ui() & m6573constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = delegatingNode.getDelegate$ui();
                                    int i2 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                delegatingNode = delegate$ui;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    mutableVector.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                mutableVector.add(delegate$ui);
                                            }
                                        }
                                        delegate$ui = delegate$ui.getChild$ui();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node2 = (requireLayoutNode == null || (nodes$ui = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return focusPropertiesImpl;
    }

    public final Rect fetchFocusRect$ui(LayoutCoordinates layoutCoordinates) {
        Rect localBoundingBoxOf;
        Rect focusRect = fetchFocusProperties$ui().getFocusRect();
        return focusRect != FocusProperties.Companion.getUnsetFocusRect() ? layoutCoordinates == null ? focusRect : focusRect.m4553translatek4lQ0M(LayoutCoordinates.m6241localPositionOfS_NoaFU$default(layoutCoordinates, DelegatableNodeKt.requireLayoutCoordinates(this), 0L, false, 6, null)) : (layoutCoordinates == null || (localBoundingBoxOf = layoutCoordinates.localBoundingBoxOf(DelegatableNodeKt.requireLayoutCoordinates(this), false)) == null) ? RectKt.m4556Recttz77jQw(Offset.Companion.m4532getZeroF1C5BW0(), IntSizeKt.m7794toSizeozmzZPI(DelegatableNodeKt.requireLayoutCoordinates(this).mo6242getSizeYbymL2g())) : localBoundingBoxOf;
    }

    public final BeyondBoundsLayout getBeyondBoundsLayoutParent() {
        return DelegatableNodeKt.findNearestBeyondBoundsLayoutAncestor(this);
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    public FocusStateImpl getFocusState() {
        NodeChain nodes$ui;
        if (!isAttached()) {
            return FocusStateImpl.Inactive;
        }
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        if (activeFocusTargetNode == null) {
            return FocusStateImpl.Inactive;
        }
        if (this == activeFocusTargetNode) {
            return focusOwner.isFocusCaptured() ? FocusStateImpl.Captured : FocusStateImpl.Active;
        }
        if (activeFocusTargetNode.isAttached()) {
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
                            Modifier.Node node = parent$ui;
                            MutableVector mutableVector = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    if (this == ((FocusTargetNode) node)) {
                                        return FocusStateImpl.ActiveParent;
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
        }
        return FocusStateImpl.Inactive;
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* renamed from: getFocusability-LCbbffg */
    public int mo4422getFocusabilityLCbbffg() {
        return this.focusability;
    }

    public final Integer getPreviouslyFocusedChildHash() {
        return this.previouslyFocusedChildHash;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final void invalidateFocus$ui() {
        int i = WhenMappings.$EnumSwitchMapping$1[getFocusState().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                return;
            }
            o.n();
            return;
        }
        ji0 ji0Var = new ji0();
        ObserverModifierNodeKt.observeReads(this, new FocusTargetNode$invalidateFocus$1(ji0Var, this));
        Object obj = ji0Var.d;
        if (obj == null) {
            q10.H("focusProperties");
            throw null;
        }
        if (((FocusProperties) obj).getCanFocus()) {
            return;
        }
        DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
    }

    public final boolean isInteropViewHost() {
        return this.isInteropViewHost;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        int i = WhenMappings.$EnumSwitchMapping$1[getFocusState().ordinal()];
        if (i == 1 || i == 2) {
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            focusOwner.mo4405clearFocusI7lrPNg(true, true, false, FocusDirection.Companion.m4394getExitdhqQ8s());
            if (this.isInteropViewHost) {
                focusOwner.mo4410requestOwnerFocus7o62pno(null, null);
            }
            focusOwner.scheduleInvalidationForOwner();
        } else if (i == 3) {
            FocusOwner focusOwner2 = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this);
            if (findActiveFocusNode != null && findActiveFocusNode.isInteropViewHost) {
                focusOwner2.mo4410requestOwnerFocus7o62pno(null, null);
                focusOwner2.scheduleInvalidationForOwner();
            }
        } else if (i != 4) {
            o.n();
            return;
        }
        this.committedFocusState = null;
        this.previouslyFocusedChildHash = null;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        invalidateFocus$ui();
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        if (ComposeUiFlags.isInitialFocusOnFocusableAvailable) {
            DelegatableNodeKt.requireOwner(getNode()).getFocusOwner().focusTargetAvailable();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        if (getFocusState().isFocused()) {
            DelegatableNodeKt.requireOwner(this).getFocusOwner().mo4405clearFocusI7lrPNg(true, true, true, FocusDirection.Companion.m4394getExitdhqQ8s());
        }
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    @er
    public /* synthetic */ boolean requestFocus() {
        return mo4423requestFocus3ESFkO8(FocusDirection.Companion.m4393getEnterdhqQ8s());
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* renamed from: requestFocus-3ESFkO8 */
    public boolean mo4423requestFocus3ESFkO8(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return fetchFocusProperties$ui().getCanFocus() ? m4428assignFocus3ESFkO8(i) : TwoDimensionalFocusSearchKt.m4462findChildCorrespondingToFocusEnterOMvw8(this, i, new FocusTargetNode$requestFocus$1$1(i));
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* renamed from: setFocusability-josRg5g */
    public void mo4424setFocusabilityjosRg5g(int i) {
        if (Focusability.m4446equalsimpl0(this.focusability, i)) {
            return;
        }
        this.focusability = i;
        if (isAttached() && this == DelegatableNodeKt.requireOwner(this).getFocusOwner().getActiveFocusTargetNode() && !Focusability.m4443canFocusimpl$ui(this.focusability, this)) {
            if (!ComposeUiFlags.isOptimizedFocusEventDispatchEnabled) {
                FocusTransactionsKt.clearFocus(this, true, true);
                return;
            }
            if (FocusTransactionsKt.clearFocus(this, true, true)) {
                FocusTargetNode activeFocusTargetNode = DelegatableNodeKt.requireOwner(this).getFocusOwner().getActiveFocusTargetNode();
                DelegatableNodeKt.requireOwner(this).getFocusOwner().setActiveFocusTargetNode(null);
                if (activeFocusTargetNode != null) {
                    activeFocusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Active, FocusStateImpl.Inactive);
                }
            }
        }
    }

    public final void setPreviouslyFocusedChildHash(Integer num) {
        this.previouslyFocusedChildHash = num;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class FocusTargetElement extends ModifierNodeElement<FocusTargetNode> {
        public static final int $stable = 0;
        public static final FocusTargetElement INSTANCE = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public FocusTargetNode create() {
            return new FocusTargetNode(0, false, null, null, 15, null);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("focusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(FocusTargetNode focusTargetNode) {
        }
    }

    private FocusTargetNode(int i, boolean z, my myVar, ky kyVar) {
        this.isInteropViewHost = z;
        this.onFocusChange = myVar;
        this.onDispatchEventsCompleted = kyVar;
        this.focusability = i;
    }

    public /* synthetic */ FocusTargetNode(int i, boolean z, my myVar, ky kyVar, dq dqVar) {
        this(i, z, myVar, kyVar);
    }
}
