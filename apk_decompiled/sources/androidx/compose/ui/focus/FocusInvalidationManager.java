package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import defpackage.fc;
import defpackage.gb0;
import defpackage.sl0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusInvalidationManager {
    public static final int $stable = 8;
    private final gb0 focusEventNodes;
    private final FocusOwner focusOwner;
    private final gb0 focusTargetNodes;
    private boolean isInvalidationScheduled;
    private final Owner owner;

    public FocusInvalidationManager(FocusOwner focusOwner, Owner owner) {
        this.focusOwner = focusOwner;
        this.owner = owner;
        gb0 gb0Var = sl0.a;
        this.focusTargetNodes = new gb0();
        this.focusEventNodes = new gb0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateNodes() {
        NodeChain nodes$ui;
        long j;
        long j2;
        FocusTargetNode activeFocusTargetNode = this.focusOwner.getActiveFocusTargetNode();
        long j3 = 255;
        if (activeFocusTargetNode == null) {
            gb0 gb0Var = this.focusEventNodes;
            Object[] objArr = gb0Var.b;
            long[] jArr = gb0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j4 = jArr[i];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        int i3 = 0;
                        while (i3 < i2) {
                            if ((j4 & j3) < 128) {
                                j2 = j3;
                                ((FocusEventModifierNode) objArr[(i << 3) + i3]).onFocusEvent(FocusStateImpl.Inactive);
                            } else {
                                j2 = j3;
                            }
                            j4 >>= 8;
                            i3++;
                            j3 = j2;
                        }
                        j = j3;
                        if (i2 != 8) {
                            break;
                        }
                    } else {
                        j = j3;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                    j3 = j;
                }
            }
        } else if (activeFocusTargetNode.isAttached()) {
            if (this.focusTargetNodes.a(activeFocusTargetNode)) {
                activeFocusTargetNode.invalidateFocus$ui();
            }
            FocusStateImpl focusState = activeFocusTargetNode.getFocusState();
            int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ) | NodeKind.m6573constructorimpl(Fields.TransformOrigin);
            if (!activeFocusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = activeFocusTargetNode.getNode();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode);
            int i4 = 0;
            while (requireLayoutNode != null) {
                if ((fc.b(requireLayoutNode) & m6573constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & m6573constructorimpl) != 0) {
                            if ((NodeKind.m6573constructorimpl(Fields.RotationZ) & node.getKindSet$ui()) != 0) {
                                i4++;
                            }
                            if ((node instanceof FocusEventModifierNode) && this.focusEventNodes.a(node)) {
                                if (i4 <= 1) {
                                    ((FocusEventModifierNode) node).onFocusEvent(focusState);
                                } else {
                                    ((FocusEventModifierNode) node).onFocusEvent(FocusStateImpl.ActiveParent);
                                }
                                this.focusEventNodes.m(node);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui();
                node = (requireLayoutNode == null || (nodes$ui = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
            gb0 gb0Var2 = this.focusEventNodes;
            Object[] objArr2 = gb0Var2.b;
            long[] jArr2 = gb0Var2.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    long j5 = jArr2[i5];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length2)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j5 & 255) < 128) {
                                ((FocusEventModifierNode) objArr2[(i5 << 3) + i7]).onFocusEvent(FocusStateImpl.Inactive);
                            }
                            j5 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length2) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        invalidateOwnerFocusState();
        this.focusTargetNodes.f();
        this.focusEventNodes.f();
        this.isInvalidationScheduled = false;
    }

    private final void invalidateOwnerFocusState() {
        if (this.focusOwner.getActiveFocusTargetNode() == null || this.focusOwner.getRootState() == FocusStateImpl.Inactive) {
            this.focusOwner.clearOwnerFocus();
        }
    }

    public final boolean hasPendingInvalidation() {
        return this.isInvalidationScheduled;
    }

    public final void scheduleInvalidation() {
        if (this.isInvalidationScheduled) {
            return;
        }
        this.owner.registerOnEndApplyChangesListener(new FocusInvalidationManager$scheduleInvalidation$1(this));
        this.isInvalidationScheduled = true;
    }

    public final void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode) {
        if (this.focusEventNodes.d(focusEventModifierNode)) {
            scheduleInvalidation();
        }
    }

    public final void scheduleInvalidation(FocusTargetNode focusTargetNode) {
        if (this.focusTargetNodes.d(focusTargetNode)) {
            scheduleInvalidation();
        }
    }
}
