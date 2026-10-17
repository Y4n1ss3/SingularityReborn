package androidx.compose.ui.focus;

import android.os.Trace;
import android.view.KeyEvent;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.bv;
import defpackage.fc;
import defpackage.iy;
import defpackage.ji0;
import defpackage.ky;
import defpackage.o;
import defpackage.q10;
import defpackage.sa0;
import defpackage.xa0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements FocusOwner {
    public static final int $stable = 8;
    private FocusTargetNode activeFocusTargetNode;
    private final FocusInvalidationManager focusInvalidationManager;
    private boolean isFocusCaptured;
    private sa0 keysCurrentlyDown;
    private final Owner owner;
    private final PlatformFocusOwner platformFocusOwner;
    private FocusTargetNode rootFocusNode = new FocusTargetNode(Focusability.Companion.m4451getNeverLCbbffg(), false, null, null, 14, null);
    private final Modifier modifier = new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public FocusTargetNode create() {
            return FocusOwnerImpl.this.getRootFocusNode$ui();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return FocusOwnerImpl.this.getRootFocusNode$ui().hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootFocusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(FocusTargetNode focusTargetNode) {
        }
    };
    private final xa0 listeners = new xa0(1);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FocusOwnerImpl(PlatformFocusOwner platformFocusOwner, Owner owner) {
        this.platformFocusOwner = platformFocusOwner;
        this.owner = owner;
        this.focusInvalidationManager = new FocusInvalidationManager(this, owner);
    }

    private final boolean clearFocus(boolean z, boolean z2) {
        NodeChain nodes$ui;
        if (getActiveFocusTargetNode() == null) {
            return true;
        }
        if (isFocusCaptured() && !z) {
            return false;
        }
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        setActiveFocusTargetNode(null);
        if (z2 && activeFocusTargetNode != null) {
            activeFocusTargetNode.dispatchFocusCallbacks$ui(isFocusCaptured() ? FocusStateImpl.Captured : FocusStateImpl.Active, FocusStateImpl.Inactive);
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
                                    ((FocusTargetNode) node).dispatchFocusCallbacks$ui(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
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
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(FocusOwnerImpl focusOwnerImpl, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return focusOwnerImpl.clearFocus(z, z2);
    }

    private final FocusTargetNode findFocusTargetNode() {
        return FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
    }

    private final Modifier.Node lastLocalKeyInputNode(DelegatableNode delegatableNode) {
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ) | NodeKind.m6573constructorimpl(8192);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        Modifier.Node node2 = null;
        if ((node.getAggregateChildKindSet$ui() & m6573constructorimpl) != 0) {
            for (Modifier.Node child$ui = node.getChild$ui(); child$ui != null; child$ui = child$ui.getChild$ui()) {
                if ((child$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                    if ((NodeKind.m6573constructorimpl(Fields.RotationZ) & child$ui.getKindSet$ui()) != 0) {
                        return node2;
                    }
                    node2 = child$ui;
                }
            }
        }
        return node2;
    }

    /* renamed from: nearestAncestorIncludingSelf-64DMado, reason: not valid java name */
    private final <T> T m4413nearestAncestorIncludingSelf64DMado(DelegatableNode delegatableNode, int i) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
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

    /* renamed from: traverseAncestorsIncludingSelf-QFhIj7k, reason: not valid java name */
    private final <T extends DelegatableNode> void m4414traverseAncestorsIncludingSelfQFhIj7k(DelegatableNode delegatableNode, int i, ky kyVar, iy iyVar, ky kyVar2) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
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
        if (delegatableNode.getNode() != null) {
            q10.G();
            throw null;
        }
        iyVar.invoke();
        if (delegatableNode.getNode() == null) {
            return;
        }
        q10.G();
        throw null;
    }

    /* renamed from: validateKeyEvent-ZmokQxo, reason: not valid java name */
    private final boolean m4415validateKeyEventZmokQxo(KeyEvent keyEvent) {
        long m5932getKeyZmokQxo = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
        int m5933getTypeZmokQxo = KeyEvent_androidKt.m5933getTypeZmokQxo(keyEvent);
        KeyEventType.Companion companion = KeyEventType.Companion;
        if (KeyEventType.m5925equalsimpl0(m5933getTypeZmokQxo, companion.m5929getKeyDownCS__XNY())) {
            sa0 sa0Var = this.keysCurrentlyDown;
            if (sa0Var == null) {
                sa0Var = new sa0(3);
                this.keysCurrentlyDown = sa0Var;
            }
            sa0Var.d(m5932getKeyZmokQxo);
            return true;
        }
        if (KeyEventType.m5925equalsimpl0(m5933getTypeZmokQxo, companion.m5930getKeyUpCS__XNY())) {
            sa0 sa0Var2 = this.keysCurrentlyDown;
            if (sa0Var2 == null || !sa0Var2.a(m5932getKeyZmokQxo)) {
                return false;
            }
            sa0 sa0Var3 = this.keysCurrentlyDown;
            if (sa0Var3 != null) {
                sa0Var3.e(m5932getKeyZmokQxo);
                return true;
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: clearFocus-I7lrPNg */
    public boolean mo4405clearFocusI7lrPNg(boolean z, boolean z2, boolean z3, int i) {
        boolean clearFocus;
        if (z) {
            clearFocus = clearFocus(z, z2);
        } else {
            int i2 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m4433performCustomClearFocusMxy_nc0(this.rootFocusNode, i).ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                clearFocus = false;
            } else {
                if (i2 != 4) {
                    o.n();
                    return false;
                }
                clearFocus = clearFocus(z, z2);
            }
        }
        if (clearFocus && z3) {
            clearOwnerFocus();
        }
        return clearFocus;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void clearOwnerFocus() {
        this.platformFocusOwner.clearOwnerFocus();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public void dispatchIndirectPointerCancel() {
        IndirectPointerInputModifierNode indirectPointerInputModifierNode;
        NodeChain nodes$ui;
        boolean z;
        DelegatingNode delegatingNode;
        NodeChain nodes$ui2;
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        if (activeFocusTargetNode != null) {
            int m6573constructorimpl = NodeKind.m6573constructorimpl(2097152);
            if (!activeFocusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = activeFocusTargetNode.getNode();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    delegatingNode = 0;
                    break;
                }
                if ((fc.b(requireLayoutNode) & m6573constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & m6573constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            delegatingNode = node;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof IndirectPointerInputModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNode.getKindSet$ui() & m6573constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = delegatingNode.getDelegate$ui();
                                    int i = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
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
                                    if (i == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui();
                node = (requireLayoutNode == null || (nodes$ui2 = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui2.getTail$ui();
            }
            indirectPointerInputModifierNode = (IndirectPointerInputModifierNode) delegatingNode;
        } else {
            indirectPointerInputModifierNode = null;
        }
        if (indirectPointerInputModifierNode != null) {
            int m6573constructorimpl2 = NodeKind.m6573constructorimpl(2097152);
            if (!indirectPointerInputModifierNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui = indirectPointerInputModifierNode.getNode().getParent$ui();
            LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(indirectPointerInputModifierNode);
            ArrayList arrayList = null;
            while (requireLayoutNode2 != null) {
                if ((fc.b(requireLayoutNode2) & m6573constructorimpl2) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & m6573constructorimpl2) != 0) {
                            Modifier.Node node2 = parent$ui;
                            MutableVector mutableVector2 = null;
                            while (node2 != null) {
                                if (node2 instanceof IndirectPointerInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(node2);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (node2.getKindSet$ui() & m6573constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui2 = ((DelegatingNode) node2).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                        if ((delegate$ui2.getKindSet$ui() & m6573constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node2 = delegate$ui2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node2 != null) {
                                                    mutableVector2.add(node2);
                                                    node2 = null;
                                                }
                                                mutableVector2.add(delegate$ui2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node2 = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui();
                parent$ui = (requireLayoutNode2 == null || (nodes$ui = requireLayoutNode2.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
            indirectPointerInputModifierNode.onCancelIndirectPointerInput();
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((IndirectPointerInputModifierNode) arrayList.get(i3)).onCancelIndirectPointerInput();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent) {
        IndirectPointerInputModifierNode indirectPointerInputModifierNode;
        int size;
        int size2;
        NodeChain nodes$ui;
        boolean z;
        DelegatingNode delegatingNode;
        NodeChain nodes$ui2;
        if (this.focusInvalidationManager.hasPendingInvalidation()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        if (activeFocusTargetNode != null) {
            int m6573constructorimpl = NodeKind.m6573constructorimpl(2097152);
            if (!activeFocusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = activeFocusTargetNode.getNode();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    delegatingNode = 0;
                    break;
                }
                if ((fc.b(requireLayoutNode) & m6573constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & m6573constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            delegatingNode = node;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof IndirectPointerInputModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNode.getKindSet$ui() & m6573constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = delegatingNode.getDelegate$ui();
                                    int i = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
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
                                    if (i == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui();
                node = (requireLayoutNode == null || (nodes$ui2 = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui2.getTail$ui();
            }
            indirectPointerInputModifierNode = (IndirectPointerInputModifierNode) delegatingNode;
        } else {
            indirectPointerInputModifierNode = null;
        }
        if (indirectPointerInputModifierNode != null) {
            int m6573constructorimpl2 = NodeKind.m6573constructorimpl(2097152);
            if (!indirectPointerInputModifierNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui = indirectPointerInputModifierNode.getNode().getParent$ui();
            LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(indirectPointerInputModifierNode);
            ArrayList arrayList = null;
            while (requireLayoutNode2 != null) {
                if ((fc.b(requireLayoutNode2) & m6573constructorimpl2) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & m6573constructorimpl2) != 0) {
                            Modifier.Node node2 = parent$ui;
                            MutableVector mutableVector2 = null;
                            while (node2 != null) {
                                if (node2 instanceof IndirectPointerInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(node2);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (node2.getKindSet$ui() & m6573constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui2 = ((DelegatingNode) node2).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                        if ((delegate$ui2.getKindSet$ui() & m6573constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node2 = delegate$ui2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node2 != null) {
                                                    mutableVector2.add(node2);
                                                    node2 = null;
                                                }
                                                mutableVector2.add(delegate$ui2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node2 = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui();
                parent$ui = (requireLayoutNode2 == null || (nodes$ui = requireLayoutNode2.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size2 - 1;
                    ((IndirectPointerInputModifierNode) arrayList.get(size2)).onIndirectPointerEvent(indirectPointerEvent, PointerEventPass.Initial);
                    if (i3 < 0) {
                        break;
                    }
                    size2 = i3;
                }
            }
            indirectPointerInputModifierNode.onIndirectPointerEvent(indirectPointerEvent, PointerEventPass.Initial);
            indirectPointerInputModifierNode.onIndirectPointerEvent(indirectPointerEvent, PointerEventPass.Main);
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((IndirectPointerInputModifierNode) arrayList.get(i4)).onIndirectPointerEvent(indirectPointerEvent, PointerEventPass.Main);
                }
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i5 = size - 1;
                    ((IndirectPointerInputModifierNode) arrayList.get(size)).onIndirectPointerEvent(indirectPointerEvent, PointerEventPass.Final);
                    if (i5 < 0) {
                        break;
                    }
                    size = i5;
                }
            }
            indirectPointerInputModifierNode.onIndirectPointerEvent(indirectPointerEvent, PointerEventPass.Final);
        }
        List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
        int size4 = changes.size();
        for (int i6 = 0; i6 < size4; i6++) {
            if (changes.get(i6).isConsumed()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public boolean mo4406dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent) {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        int size;
        NodeChain nodes$ui;
        boolean z;
        DelegatingNode delegatingNode;
        NodeChain nodes$ui2;
        if (this.focusInvalidationManager.hasPendingInvalidation()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RenderEffect);
            if (!findActiveFocusNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = findActiveFocusNode.getNode();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(findActiveFocusNode);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    delegatingNode = 0;
                    break;
                }
                if ((fc.b(requireLayoutNode) & m6573constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & m6573constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            delegatingNode = node;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof SoftKeyboardInterceptionModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNode.getKindSet$ui() & m6573constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = delegatingNode.getDelegate$ui();
                                    int i = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
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
                                    if (i == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui();
                node = (requireLayoutNode == null || (nodes$ui2 = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui2.getTail$ui();
            }
            softKeyboardInterceptionModifierNode = (SoftKeyboardInterceptionModifierNode) delegatingNode;
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            int m6573constructorimpl2 = NodeKind.m6573constructorimpl(Fields.RenderEffect);
            if (!softKeyboardInterceptionModifierNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui = softKeyboardInterceptionModifierNode.getNode().getParent$ui();
            LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(softKeyboardInterceptionModifierNode);
            ArrayList arrayList = null;
            while (requireLayoutNode2 != null) {
                if ((fc.b(requireLayoutNode2) & m6573constructorimpl2) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & m6573constructorimpl2) != 0) {
                            Modifier.Node node2 = parent$ui;
                            MutableVector mutableVector2 = null;
                            while (node2 != null) {
                                if (node2 instanceof SoftKeyboardInterceptionModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(node2);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (node2.getKindSet$ui() & m6573constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui2 = ((DelegatingNode) node2).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                        if ((delegate$ui2.getKindSet$ui() & m6573constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node2 = delegate$ui2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node2 != null) {
                                                    mutableVector2.add(node2);
                                                    node2 = null;
                                                }
                                                mutableVector2.add(delegate$ui2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node2 = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui();
                parent$ui = (requireLayoutNode2 == null || (nodes$ui = requireLayoutNode2.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(size)).mo5608onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            DelegatingNode node3 = softKeyboardInterceptionModifierNode.getNode();
            MutableVector mutableVector3 = null;
            while (node3 != 0) {
                if (node3 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) node3).mo5608onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node3.getKindSet$ui() & m6573constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui3 = node3.getDelegate$ui();
                    int i4 = 0;
                    node3 = node3;
                    while (delegate$ui3 != null) {
                        if ((delegate$ui3.getKindSet$ui() & m6573constructorimpl2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                node3 = delegate$ui3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node3 != 0) {
                                    mutableVector3.add(node3);
                                    node3 = 0;
                                }
                                mutableVector3.add(delegate$ui3);
                            }
                        }
                        delegate$ui3 = delegate$ui3.getChild$ui();
                        node3 = node3;
                    }
                    if (i4 == 1) {
                    }
                }
                node3 = DelegatableNodeKt.pop(mutableVector3);
            }
            DelegatingNode node4 = softKeyboardInterceptionModifierNode.getNode();
            MutableVector mutableVector4 = null;
            while (node4 != 0) {
                if (node4 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) node4).mo5607onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node4.getKindSet$ui() & m6573constructorimpl2) != 0 && (node4 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui4 = node4.getDelegate$ui();
                    int i5 = 0;
                    node4 = node4;
                    while (delegate$ui4 != null) {
                        if ((delegate$ui4.getKindSet$ui() & m6573constructorimpl2) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node4 = delegate$ui4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node4 != 0) {
                                    mutableVector4.add(node4);
                                    node4 = 0;
                                }
                                mutableVector4.add(delegate$ui4);
                            }
                        }
                        delegate$ui4 = delegate$ui4.getChild$ui();
                        node4 = node4;
                    }
                    if (i5 == 1) {
                    }
                }
                node4 = DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(i6)).mo5607onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v19, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v20, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v26, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v35, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchKeyEvent-YhN2O0w */
    public boolean mo4407dispatchKeyEventYhN2O0w(KeyEvent keyEvent, iy iyVar) {
        Object obj;
        Modifier.Node node;
        NodeChain nodes$ui;
        Object obj2;
        NodeChain nodes$ui2;
        int size;
        NodeChain nodes$ui3;
        boolean z;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.focusInvalidationManager.hasPendingInvalidation()) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!m4415validateKeyEventZmokQxo(keyEvent)) {
                return false;
            }
            FocusTargetNode findFocusTargetNode = findFocusTargetNode();
            if (findFocusTargetNode == null || (node = lastLocalKeyInputNode(findFocusTargetNode)) == null) {
                if (findFocusTargetNode != null) {
                    int m6573constructorimpl = NodeKind.m6573constructorimpl(8192);
                    if (!findFocusTargetNode.getNode().isAttached()) {
                        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                    }
                    Modifier.Node node2 = findFocusTargetNode.getNode();
                    LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(findFocusTargetNode);
                    loop10: while (true) {
                        if (requireLayoutNode == null) {
                            obj2 = null;
                            break;
                        }
                        if ((requireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & m6573constructorimpl) != 0) {
                            while (node2 != null) {
                                if ((node2.getKindSet$ui() & m6573constructorimpl) != 0) {
                                    MutableVector mutableVector = null;
                                    Modifier.Node node3 = node2;
                                    while (node3 != null) {
                                        if (node3 instanceof KeyInputModifierNode) {
                                            obj2 = node3;
                                            break loop10;
                                        }
                                        if ((node3.getKindSet$ui() & m6573constructorimpl) != 0 && (node3 instanceof DelegatingNode)) {
                                            Modifier.Node delegate$ui = ((DelegatingNode) node3).getDelegate$ui();
                                            int i = 0;
                                            node3 = node3;
                                            while (delegate$ui != null) {
                                                if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        node3 = delegate$ui;
                                                    } else {
                                                        if (mutableVector == null) {
                                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (node3 != null) {
                                                            mutableVector.add(node3);
                                                            node3 = null;
                                                        }
                                                        mutableVector.add(delegate$ui);
                                                    }
                                                }
                                                delegate$ui = delegate$ui.getChild$ui();
                                                node3 = node3;
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        node3 = DelegatableNodeKt.pop(mutableVector);
                                    }
                                }
                                node2 = node2.getParent$ui();
                            }
                        }
                        requireLayoutNode = requireLayoutNode.getParent$ui();
                        node2 = (requireLayoutNode == null || (nodes$ui2 = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui2.getTail$ui();
                    }
                    KeyInputModifierNode keyInputModifierNode = (KeyInputModifierNode) obj2;
                    if (keyInputModifierNode != null) {
                        node = keyInputModifierNode.getNode();
                    }
                }
                FocusTargetNode focusTargetNode = this.rootFocusNode;
                int m6573constructorimpl2 = NodeKind.m6573constructorimpl(8192);
                if (!focusTargetNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent$ui = focusTargetNode.getNode().getParent$ui();
                LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
                loop14: while (true) {
                    if (requireLayoutNode2 == null) {
                        obj = null;
                        break;
                    }
                    if ((requireLayoutNode2.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & m6573constructorimpl2) != 0) {
                        while (parent$ui != null) {
                            if ((parent$ui.getKindSet$ui() & m6573constructorimpl2) != 0) {
                                MutableVector mutableVector2 = null;
                                Modifier.Node node4 = parent$ui;
                                while (node4 != null) {
                                    if (node4 instanceof KeyInputModifierNode) {
                                        obj = node4;
                                        break loop14;
                                    }
                                    if ((node4.getKindSet$ui() & m6573constructorimpl2) != 0 && (node4 instanceof DelegatingNode)) {
                                        Modifier.Node delegate$ui2 = ((DelegatingNode) node4).getDelegate$ui();
                                        int i2 = 0;
                                        node4 = node4;
                                        while (delegate$ui2 != null) {
                                            if ((delegate$ui2.getKindSet$ui() & m6573constructorimpl2) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    node4 = delegate$ui2;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node4 != null) {
                                                        mutableVector2.add(node4);
                                                        node4 = null;
                                                    }
                                                    mutableVector2.add(delegate$ui2);
                                                }
                                            }
                                            delegate$ui2 = delegate$ui2.getChild$ui();
                                            node4 = node4;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    node4 = DelegatableNodeKt.pop(mutableVector2);
                                }
                            }
                            parent$ui = parent$ui.getParent$ui();
                        }
                    }
                    requireLayoutNode2 = requireLayoutNode2.getParent$ui();
                    parent$ui = (requireLayoutNode2 == null || (nodes$ui = requireLayoutNode2.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
                }
                KeyInputModifierNode keyInputModifierNode2 = (KeyInputModifierNode) obj;
                node = keyInputModifierNode2 != null ? keyInputModifierNode2.getNode() : null;
            }
            if (node != null) {
                int m6573constructorimpl3 = NodeKind.m6573constructorimpl(8192);
                if (!node.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent$ui2 = node.getNode().getParent$ui();
                LayoutNode requireLayoutNode3 = DelegatableNodeKt.requireLayoutNode(node);
                ArrayList arrayList = null;
                while (requireLayoutNode3 != null) {
                    if ((requireLayoutNode3.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & m6573constructorimpl3) != 0) {
                        while (parent$ui2 != null) {
                            if ((parent$ui2.getKindSet$ui() & m6573constructorimpl3) != 0) {
                                Modifier.Node node5 = parent$ui2;
                                MutableVector mutableVector3 = null;
                                while (node5 != null) {
                                    if (node5 instanceof KeyInputModifierNode) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(node5);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (node5.getKindSet$ui() & m6573constructorimpl3) != 0 && (node5 instanceof DelegatingNode)) {
                                        int i3 = 0;
                                        for (Modifier.Node delegate$ui3 = ((DelegatingNode) node5).getDelegate$ui(); delegate$ui3 != null; delegate$ui3 = delegate$ui3.getChild$ui()) {
                                            if ((delegate$ui3.getKindSet$ui() & m6573constructorimpl3) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    node5 = delegate$ui3;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node5 != null) {
                                                        mutableVector3.add(node5);
                                                        node5 = null;
                                                    }
                                                    mutableVector3.add(delegate$ui3);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    node5 = DelegatableNodeKt.pop(mutableVector3);
                                }
                            }
                            parent$ui2 = parent$ui2.getParent$ui();
                        }
                    }
                    requireLayoutNode3 = requireLayoutNode3.getParent$ui();
                    parent$ui2 = (requireLayoutNode3 == null || (nodes$ui3 = requireLayoutNode3.getNodes$ui()) == null) ? null : nodes$ui3.getTail$ui();
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i4 = size - 1;
                        if (((KeyInputModifierNode) arrayList.get(size)).mo198onPreKeyEventZmokQxo(keyEvent)) {
                            return true;
                        }
                        if (i4 < 0) {
                            break;
                        }
                        size = i4;
                    }
                }
                DelegatingNode node6 = node.getNode();
                MutableVector mutableVector4 = null;
                while (node6 != 0) {
                    if (node6 instanceof KeyInputModifierNode) {
                        if (((KeyInputModifierNode) node6).mo198onPreKeyEventZmokQxo(keyEvent)) {
                            return true;
                        }
                    } else if ((node6.getKindSet$ui() & m6573constructorimpl3) != 0 && (node6 instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui4 = node6.getDelegate$ui();
                        int i5 = 0;
                        node6 = node6;
                        while (delegate$ui4 != null) {
                            if ((delegate$ui4.getKindSet$ui() & m6573constructorimpl3) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    node6 = delegate$ui4;
                                } else {
                                    if (mutableVector4 == null) {
                                        mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node6 != 0) {
                                        mutableVector4.add(node6);
                                        node6 = 0;
                                    }
                                    mutableVector4.add(delegate$ui4);
                                }
                            }
                            delegate$ui4 = delegate$ui4.getChild$ui();
                            node6 = node6;
                        }
                        if (i5 == 1) {
                        }
                    }
                    node6 = DelegatableNodeKt.pop(mutableVector4);
                }
                if (((Boolean) iyVar.invoke()).booleanValue()) {
                    return true;
                }
                DelegatingNode node7 = node.getNode();
                MutableVector mutableVector5 = null;
                while (node7 != 0) {
                    if (node7 instanceof KeyInputModifierNode) {
                        if (((KeyInputModifierNode) node7).mo196onKeyEventZmokQxo(keyEvent)) {
                            return true;
                        }
                    } else if ((node7.getKindSet$ui() & m6573constructorimpl3) != 0 && (node7 instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui5 = node7.getDelegate$ui();
                        int i6 = 0;
                        node7 = node7;
                        while (delegate$ui5 != null) {
                            if ((delegate$ui5.getKindSet$ui() & m6573constructorimpl3) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    node7 = delegate$ui5;
                                } else {
                                    if (mutableVector5 == null) {
                                        mutableVector5 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node7 != 0) {
                                        mutableVector5.add(node7);
                                        node7 = 0;
                                    }
                                    mutableVector5.add(delegate$ui5);
                                }
                            }
                            delegate$ui5 = delegate$ui5.getChild$ui();
                            node7 = node7;
                        }
                        if (i6 == 1) {
                        }
                    }
                    node7 = DelegatableNodeKt.pop(mutableVector5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        if (((KeyInputModifierNode) arrayList.get(i7)).mo196onKeyEventZmokQxo(keyEvent)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r15v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(RotaryScrollEvent rotaryScrollEvent, iy iyVar) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int size;
        NodeChain nodes$ui;
        boolean z;
        DelegatingNode delegatingNode;
        NodeChain nodes$ui2;
        if (this.focusInvalidationManager.hasPendingInvalidation()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode findFocusTargetNode = findFocusTargetNode();
        if (findFocusTargetNode != null) {
            int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.Clip);
            if (!findFocusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = findFocusTargetNode.getNode();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(findFocusTargetNode);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    delegatingNode = 0;
                    break;
                }
                if ((fc.b(requireLayoutNode) & m6573constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & m6573constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            delegatingNode = node;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof RotaryInputModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNode.getKindSet$ui() & m6573constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = delegatingNode.getDelegate$ui();
                                    int i = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
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
                                    if (i == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui();
                node = (requireLayoutNode == null || (nodes$ui2 = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui2.getTail$ui();
            }
            rotaryInputModifierNode = (RotaryInputModifierNode) delegatingNode;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            int m6573constructorimpl2 = NodeKind.m6573constructorimpl(Fields.Clip);
            if (!rotaryInputModifierNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui = rotaryInputModifierNode.getNode().getParent$ui();
            LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(rotaryInputModifierNode);
            ArrayList arrayList = null;
            while (requireLayoutNode2 != null) {
                if ((fc.b(requireLayoutNode2) & m6573constructorimpl2) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & m6573constructorimpl2) != 0) {
                            Modifier.Node node2 = parent$ui;
                            MutableVector mutableVector2 = null;
                            while (node2 != null) {
                                if (node2 instanceof RotaryInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(node2);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (node2.getKindSet$ui() & m6573constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui2 = ((DelegatingNode) node2).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                        if ((delegate$ui2.getKindSet$ui() & m6573constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node2 = delegate$ui2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node2 != null) {
                                                    mutableVector2.add(node2);
                                                    node2 = null;
                                                }
                                                mutableVector2.add(delegate$ui2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node2 = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui();
                parent$ui = (requireLayoutNode2 == null || (nodes$ui = requireLayoutNode2.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((RotaryInputModifierNode) arrayList.get(size)).onPreRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            DelegatingNode node3 = rotaryInputModifierNode.getNode();
            MutableVector mutableVector3 = null;
            while (node3 != 0) {
                if (node3 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) node3).onPreRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                } else if ((node3.getKindSet$ui() & m6573constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui3 = node3.getDelegate$ui();
                    int i4 = 0;
                    node3 = node3;
                    while (delegate$ui3 != null) {
                        if ((delegate$ui3.getKindSet$ui() & m6573constructorimpl2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                node3 = delegate$ui3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node3 != 0) {
                                    mutableVector3.add(node3);
                                    node3 = 0;
                                }
                                mutableVector3.add(delegate$ui3);
                            }
                        }
                        delegate$ui3 = delegate$ui3.getChild$ui();
                        node3 = node3;
                    }
                    if (i4 == 1) {
                    }
                }
                node3 = DelegatableNodeKt.pop(mutableVector3);
            }
            if (((Boolean) iyVar.invoke()).booleanValue()) {
                return true;
            }
            DelegatingNode node4 = rotaryInputModifierNode.getNode();
            MutableVector mutableVector4 = null;
            while (node4 != 0) {
                if (node4 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) node4).onRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                } else if ((node4.getKindSet$ui() & m6573constructorimpl2) != 0 && (node4 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui4 = node4.getDelegate$ui();
                    int i5 = 0;
                    node4 = node4;
                    while (delegate$ui4 != null) {
                        if ((delegate$ui4.getKindSet$ui() & m6573constructorimpl2) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node4 = delegate$ui4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node4 != 0) {
                                    mutableVector4.add(node4);
                                    node4 = 0;
                                }
                                mutableVector4.add(delegate$ui4);
                            }
                        }
                        delegate$ui4 = delegate$ui4.getChild$ui();
                        node4 = node4;
                    }
                    if (i5 == 1) {
                    }
                }
                node4 = DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((RotaryInputModifierNode) arrayList.get(i6)).onRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x00a8, code lost:
    
        continue;
     */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: focusSearch-ULY8qGw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean mo4408focusSearchULY8qGw(int i, Rect rect, ky kyVar) {
        FocusTargetNode findFocusTargetNode = findFocusTargetNode();
        if (findFocusTargetNode != null) {
            FocusRequester m4440customFocusSearchOMvw8 = FocusTraversalKt.m4440customFocusSearchOMvw8(findFocusTargetNode, i, this.owner.getLayoutDirection());
            FocusRequester.Companion companion = FocusRequester.Companion;
            if (q10.b(m4440customFocusSearchOMvw8, companion.getCancel())) {
                return null;
            }
            if (q10.b(m4440customFocusSearchOMvw8, companion.getRedirect$ui())) {
                FocusTargetNode findFocusTargetNode2 = findFocusTargetNode();
                if (findFocusTargetNode2 != null) {
                    return (Boolean) kyVar.invoke(findFocusTargetNode2);
                }
                return null;
            }
            if (!q10.b(m4440customFocusSearchOMvw8, companion.getDefault())) {
                if (m4440customFocusSearchOMvw8 == companion.getDefault()) {
                    o.f("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                    return null;
                }
                if (m4440customFocusSearchOMvw8 == companion.getCancel()) {
                    o.f("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                    return null;
                }
                boolean z = false;
                if (m4440customFocusSearchOMvw8.getFocusRequesterNodes$ui().getSize() == 0) {
                    System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                } else {
                    MutableVector<FocusRequesterModifierNode> focusRequesterNodes$ui = m4440customFocusSearchOMvw8.getFocusRequesterNodes$ui();
                    FocusRequesterModifierNode[] focusRequesterModifierNodeArr = focusRequesterNodes$ui.content;
                    int size = focusRequesterNodes$ui.getSize();
                    boolean z2 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        FocusRequesterModifierNode focusRequesterModifierNode = focusRequesterModifierNodeArr[i2];
                        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
                        if (!focusRequesterModifierNode.getNode().isAttached()) {
                            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                        }
                        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
                        Modifier.Node child$ui = focusRequesterModifierNode.getNode().getChild$ui();
                        if (child$ui == null) {
                            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusRequesterModifierNode.getNode(), false);
                        } else {
                            mutableVector.add(child$ui);
                        }
                        while (true) {
                            if (mutableVector.getSize() != 0) {
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
                                                    if (((Boolean) kyVar.invoke((FocusTargetNode) node)).booleanValue()) {
                                                        z2 = true;
                                                        break;
                                                    }
                                                } else if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                                    int i3 = 0;
                                                    for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                                        if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                                            i3++;
                                                            if (i3 == 1) {
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
                                                    if (i3 == 1) {
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
                        }
                    }
                    z = z2;
                }
                return Boolean.valueOf(z);
            }
        } else {
            findFocusTargetNode = null;
        }
        return FocusTraversalKt.m4441focusSearch0X8WOeE(this.rootFocusNode, i, this.owner.getLayoutDirection(), rect, new FocusOwnerImpl$focusSearch$1(findFocusTargetNode, this, kyVar));
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void focusTargetAvailable() {
        this.platformFocusOwner.focusTargetAvailable();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusTargetNode getActiveFocusTargetNode() {
        FocusTargetNode focusTargetNode = this.activeFocusTargetNode;
        if (focusTargetNode == null || !focusTargetNode.isAttached()) {
            return null;
        }
        return this.activeFocusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Rect getFocusRect() {
        FocusTargetNode findFocusTargetNode = findFocusTargetNode();
        if (findFocusTargetNode != null) {
            return FocusTraversalKt.focusRect(findFocusTargetNode);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public xa0 getListeners() {
        return this.listeners;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Modifier getModifier() {
        return this.modifier;
    }

    public final FocusTargetNode getRootFocusNode$ui() {
        return this.rootFocusNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusState getRootState() {
        return this.rootFocusNode.getFocusState();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean hasFocusableContent() {
        if (!this.rootFocusNode.isAttached()) {
            return false;
        }
        FocusTargetNode focusTargetNode = this.rootFocusNode;
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
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
            if ((node.getAggregateChildKindSet$ui() & m6573constructorimpl) != 0) {
                for (Modifier.Node node2 = node; node2 != null && node2.isAttached(); node2 = node2.getChild$ui()) {
                    if ((node2.getKindSet$ui() & m6573constructorimpl) != 0) {
                        Modifier.Node node3 = node2;
                        MutableVector mutableVector2 = null;
                        while (node3 != null) {
                            if (node3 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node3;
                                if (focusTargetNode2.isAttached() && focusTargetNode2.fetchFocusProperties$ui().getCanFocus()) {
                                    return true;
                                }
                            } else if ((node3.getKindSet$ui() & m6573constructorimpl) != 0 && (node3 instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) node3).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node3 = delegate$ui;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node3 != null) {
                                                mutableVector2.add(node3);
                                                node3 = null;
                                            }
                                            mutableVector2.add(delegate$ui);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node3 = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean hasNonInteropFocusableContent() {
        if (!this.rootFocusNode.isAttached()) {
            return false;
        }
        FocusTargetNode focusTargetNode = this.rootFocusNode;
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
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
            if ((node.getAggregateChildKindSet$ui() & m6573constructorimpl) != 0) {
                for (Modifier.Node node2 = node; node2 != null && node2.isAttached(); node2 = node2.getChild$ui()) {
                    if ((node2.getKindSet$ui() & m6573constructorimpl) != 0) {
                        Modifier.Node node3 = node2;
                        MutableVector mutableVector2 = null;
                        while (node3 != null) {
                            if (node3 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node3;
                                if (focusTargetNode2.isAttached()) {
                                    FocusProperties fetchFocusProperties$ui = focusTargetNode2.fetchFocusProperties$ui();
                                    if (focusTargetNode2.isAttached() && !focusTargetNode2.isInteropViewHost() && fetchFocusProperties$ui.getCanFocus()) {
                                        return true;
                                    }
                                }
                            } else if ((node3.getKindSet$ui() & m6573constructorimpl) != 0 && (node3 instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) node3).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node3 = delegate$ui;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node3 != null) {
                                                mutableVector2.add(node3);
                                                node3 = null;
                                            }
                                            mutableVector2.add(delegate$ui);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node3 = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean isFocusCaptured() {
        return this.isFocusCaptured;
    }

    @Override // androidx.compose.ui.focus.FocusManager
    /* renamed from: moveFocus-3ESFkO8 */
    public boolean mo4403moveFocus3ESFkO8(int i) {
        return mo4409moveFocusaToIllA(i, true);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: moveFocus-aToIllA */
    public boolean mo4409moveFocusaToIllA(int i, boolean z) {
        FocusTargetNode activeFocusTargetNode;
        if ((ComposeUiFlags.isViewFocusFixEnabled || (ComposeUiFlags.isBypassUnfocusableComposeViewEnabled && (activeFocusTargetNode = getActiveFocusTargetNode()) != null && activeFocusTargetNode.isInteropViewHost())) && this.platformFocusOwner.mo4457moveFocusInChildren3ESFkO8(i)) {
            return true;
        }
        ji0 ji0Var = new ji0();
        ji0Var.d = Boolean.FALSE;
        FocusTargetNode activeFocusTargetNode2 = getActiveFocusTargetNode();
        Boolean mo4408focusSearchULY8qGw = mo4408focusSearchULY8qGw(i, this.platformFocusOwner.getEmbeddedViewFocusRect(), new FocusOwnerImpl$moveFocus$focusSearchSuccess$1(ji0Var, i));
        if (q10.b(mo4408focusSearchULY8qGw, Boolean.TRUE) && activeFocusTargetNode2 != getActiveFocusTargetNode()) {
            return true;
        }
        if (mo4408focusSearchULY8qGw != null && ji0Var.d != null) {
            if (mo4408focusSearchULY8qGw.booleanValue() && ((Boolean) ji0Var.d).booleanValue()) {
                return true;
            }
            if (FocusOwnerImplKt.m4416is1dFocusSearch3ESFkO8(i) && z) {
                return mo4405clearFocusI7lrPNg(false, true, false, i) && mo4412takeFocusaToIllA(i, null);
            }
            if (!ComposeUiFlags.isViewFocusFixEnabled && !ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
                return this.platformFocusOwner.mo4457moveFocusInChildren3ESFkO8(i);
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void releaseFocus() {
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
        if (!ComposeUiFlags.isOptimizedFocusEventDispatchEnabled || getActiveFocusTargetNode() == null) {
            return;
        }
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        setActiveFocusTargetNode(null);
        if (activeFocusTargetNode != null) {
            activeFocusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Active, FocusStateImpl.Inactive);
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: requestOwnerFocus-7o62pno */
    public boolean mo4410requestOwnerFocus7o62pno(FocusDirection focusDirection, Rect rect) {
        return this.platformFocusOwner.mo4458requestOwnerFocus7o62pno(focusDirection, rect);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: resetFocus-3ESFkO8 */
    public boolean mo4411resetFocus3ESFkO8(int i) {
        if (!mo4405clearFocusI7lrPNg(false, true, false, i)) {
            return false;
        }
        Boolean mo4408focusSearchULY8qGw = mo4408focusSearchULY8qGw(i, null, new FocusOwnerImpl$resetFocus$successfulReset$1(i));
        boolean booleanValue = mo4408focusSearchULY8qGw != null ? mo4408focusSearchULY8qGw.booleanValue() : false;
        if (!booleanValue) {
            clearOwnerFocus();
        }
        return booleanValue;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusTargetNode focusTargetNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusTargetNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidationForOwner() {
        this.focusInvalidationManager.scheduleInvalidation();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void setActiveFocusTargetNode(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.activeFocusTargetNode;
        this.activeFocusTargetNode = focusTargetNode;
        if (focusTargetNode == null || focusTargetNode2 != focusTargetNode) {
            setFocusCaptured(false);
        }
        xa0 listeners = getListeners();
        Object[] objArr = listeners.a;
        int i = listeners.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((FocusListener) objArr[i2]).onFocusChanged(focusTargetNode2, focusTargetNode);
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void setFocusCaptured(boolean z) {
        if (!((z && getActiveFocusTargetNode() == null) ? false : true)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot capture focus when the active focus target node is unset");
        }
        this.isFocusCaptured = z;
    }

    public final void setRootFocusNode$ui(FocusTargetNode focusTargetNode) {
        this.rootFocusNode = focusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: takeFocus-aToIllA */
    public boolean mo4412takeFocusaToIllA(int i, Rect rect) {
        Boolean mo4408focusSearchULY8qGw = mo4408focusSearchULY8qGw(i, rect, new FocusOwnerImpl$takeFocus$1(i));
        if (mo4408focusSearchULY8qGw != null) {
            return mo4408focusSearchULY8qGw.booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusEventModifierNode);
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean z) {
        mo4405clearFocusI7lrPNg(z, true, true, FocusDirection.Companion.m4394getExitdhqQ8s());
    }
}
