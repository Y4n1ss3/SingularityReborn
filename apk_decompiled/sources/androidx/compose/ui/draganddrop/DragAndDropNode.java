package androidx.compose.ui.draganddrop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.unit.IntSize;
import defpackage.dq;
import defpackage.er;
import defpackage.fi0;
import defpackage.iy;
import defpackage.ji0;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragAndDropNode extends Modifier.Node implements TraversableNode, DragAndDropModifierNode, DragAndDropSourceModifierNode, DragAndDropTargetModifierNode, DragAndDropTarget {
    private DragAndDropNode lastChildDragAndDropModifierNode;
    private final ky onDropTargetValidate;
    private my onStartTransfer;
    private long size;
    private DragAndDropTarget thisDragAndDropTarget;
    private final Object traverseKey;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public DragAndDropNode(my myVar, ky kyVar) {
        this.onStartTransfer = myVar;
        this.onDropTargetValidate = kyVar;
        this.traverseKey = Companion.DragAndDropTraversableKey.INSTANCE;
        this.size = IntSize.Companion.m7787getZeroYbymL2g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DragAndDropManager getDragAndDropManager() {
        return DelegatableNodeKt.requireOwner(this).getDragAndDropManager();
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    public boolean acceptDragAndDropTransfer(DragAndDropEvent dragAndDropEvent) {
        fi0 fi0Var = new fi0();
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new DragAndDropNode$acceptDragAndDropTransfer$1(dragAndDropEvent, this, fi0Var));
        return fi0Var.d;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    @er
    /* renamed from: drag-12SF9DM */
    public void mo4261drag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j, ky kyVar) {
        if (!(this.onStartTransfer == null)) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        this.onStartTransfer = new DragAndDropNode$drag$1(dragAndDropTransferData, j, kyVar);
        getDragAndDropManager().mo4259requestDragAndDropTransferUv8p0NA(this, Offset.Companion.m4531getUnspecifiedF1C5BW0());
        this.onStartTransfer = null;
    }

    /* renamed from: getSize-YbymL2g$ui, reason: not valid java name */
    public final long m4262getSizeYbymL2g$ui() {
        return this.size;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    public final boolean hasEligibleDropTarget() {
        return (this.lastChildDragAndDropModifierNode == null && this.thisDragAndDropTarget == null) ? false : true;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode
    public boolean isRequestDragAndDropTransferRequired() {
        return getDragAndDropManager().isRequestDragAndDropTransferRequired();
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onChanged(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onChanged(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onChanged(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public boolean onDrop(DragAndDropEvent dragAndDropEvent) {
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            return dragAndDropNode.onDrop(dragAndDropEvent);
        }
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            return dragAndDropTarget.onDrop(dragAndDropEvent);
        }
        return false;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEnded(DragAndDropEvent dragAndDropEvent) {
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new DragAndDropNode$onEnded$1(dragAndDropEvent));
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEntered(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onEntered(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onEntered(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onExited(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onExited(dragAndDropEvent);
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onExited(dragAndDropEvent);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMoved(DragAndDropEvent dragAndDropEvent) {
        TraversableNode traversableNode;
        DragAndDropNode dragAndDropNode;
        boolean m4268containsUv8p0NA;
        DragAndDropNode dragAndDropNode2 = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode2 != null) {
            m4268containsUv8p0NA = DragAndDropNodeKt.m4268containsUv8p0NA(dragAndDropNode2, DragAndDrop_androidKt.getPositionInRoot(dragAndDropEvent));
            if (m4268containsUv8p0NA) {
                dragAndDropNode = dragAndDropNode2;
                if (dragAndDropNode == null && dragAndDropNode2 == null) {
                    DragAndDropNodeKt.dispatchEntered(dragAndDropNode, dragAndDropEvent);
                    DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
                    if (dragAndDropTarget != null) {
                        dragAndDropTarget.onExited(dragAndDropEvent);
                    }
                } else if (dragAndDropNode != null && dragAndDropNode2 != null) {
                    DragAndDropTarget dragAndDropTarget2 = this.thisDragAndDropTarget;
                    if (dragAndDropTarget2 != null) {
                        DragAndDropNodeKt.dispatchEntered(dragAndDropTarget2, dragAndDropEvent);
                    }
                    dragAndDropNode2.onExited(dragAndDropEvent);
                } else if (q10.b(dragAndDropNode, dragAndDropNode2)) {
                    if (dragAndDropNode != null) {
                        DragAndDropNodeKt.dispatchEntered(dragAndDropNode, dragAndDropEvent);
                    }
                    if (dragAndDropNode2 != null) {
                        dragAndDropNode2.onExited(dragAndDropEvent);
                    }
                } else if (dragAndDropNode != null) {
                    dragAndDropNode.onMoved(dragAndDropEvent);
                } else {
                    DragAndDropTarget dragAndDropTarget3 = this.thisDragAndDropTarget;
                    if (dragAndDropTarget3 != null) {
                        dragAndDropTarget3.onMoved(dragAndDropEvent);
                    }
                }
                this.lastChildDragAndDropModifierNode = dragAndDropNode;
            }
        }
        if (getNode().isAttached()) {
            ji0 ji0Var = new ji0();
            TraversableNodeKt.traverseDescendants(this, new DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1(ji0Var, this, dragAndDropEvent));
            traversableNode = (TraversableNode) ji0Var.d;
        } else {
            traversableNode = null;
        }
        dragAndDropNode = (DragAndDropNode) traversableNode;
        if (dragAndDropNode == null) {
        }
        if (dragAndDropNode != null) {
        }
        if (q10.b(dragAndDropNode, dragAndDropNode2)) {
        }
        this.lastChildDragAndDropModifierNode = dragAndDropNode;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo356onRemeasuredozmzZPI(long j) {
        this.size = j;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onStarted(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onStarted(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onStarted(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode
    /* renamed from: requestDragAndDropTransfer-k-4lQ0M, reason: not valid java name */
    public void mo4263requestDragAndDropTransferk4lQ0M(long j) {
        if (!(this.onStartTransfer != null)) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        getDragAndDropManager().mo4259requestDragAndDropTransferUv8p0NA(this, j);
    }

    /* renamed from: setSize-ozmzZPI$ui, reason: not valid java name */
    public final void m4264setSizeozmzZPI$ui(long j) {
        this.size = j;
    }

    /* renamed from: startDragAndDropTransfer-d-4ec7I, reason: not valid java name */
    public final void m4265startDragAndDropTransferd4ec7I(DragAndDropStartTransferScope dragAndDropStartTransferScope, long j, iy iyVar) {
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new DragAndDropNode$startDragAndDropTransfer$1(j, DelegatableNodeKt.requireLayoutNode(this).getCoordinates(), dragAndDropStartTransferScope, iyVar));
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class DragAndDropTraversableKey {
            public static final DragAndDropTraversableKey INSTANCE = new DragAndDropTraversableKey();

            private DragAndDropTraversableKey() {
            }
        }

        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DragAndDropNode(my myVar, ky kyVar, int i, dq dqVar) {
        this((i & 1) != 0 ? null : myVar, (i & 2) != 0 ? null : kyVar);
    }
}
