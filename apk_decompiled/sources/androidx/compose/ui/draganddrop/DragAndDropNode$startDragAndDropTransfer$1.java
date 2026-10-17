package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragAndDropNode$startDragAndDropTransfer$1 extends f30 implements ky {
    final /* synthetic */ iy $isTransferStarted;
    final /* synthetic */ LayoutCoordinates $nodeCoordinates;
    final /* synthetic */ long $offset;
    final /* synthetic */ DragAndDropStartTransferScope $this_startDragAndDropTransfer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$startDragAndDropTransfer$1(long j, LayoutCoordinates layoutCoordinates, DragAndDropStartTransferScope dragAndDropStartTransferScope, iy iyVar) {
        super(1);
        this.$offset = j;
        this.$nodeCoordinates = layoutCoordinates;
        this.$this_startDragAndDropTransfer = dragAndDropStartTransferScope;
        this.$isTransferStarted = iyVar;
    }

    @Override // defpackage.ky
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
        my myVar;
        if (!dragAndDropNode.isAttached()) {
            return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }
        myVar = dragAndDropNode.onStartTransfer;
        if (myVar == null) {
            return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
        }
        long j = this.$offset;
        Offset.Companion companion = Offset.Companion;
        if (Offset.m4513equalsimpl0(j, companion.m4531getUnspecifiedF1C5BW0())) {
            myVar.invoke(this.$this_startDragAndDropTransfer, Offset.m4505boximpl(companion.m4531getUnspecifiedF1C5BW0()));
        } else {
            long mo6243localPositionOfR5De75A = DelegatableNodeKt.requireLayoutNode(dragAndDropNode).getCoordinates().mo6243localPositionOfR5De75A(this.$nodeCoordinates, this.$offset);
            if (!SizeKt.m4606toRectuvyYCjk(IntSizeKt.m7794toSizeozmzZPI(dragAndDropNode.m4262getSizeYbymL2g$ui())).m4542containsk4lQ0M(mo6243localPositionOfR5De75A)) {
                return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
            }
            myVar.invoke(this.$this_startDragAndDropTransfer, Offset.m4505boximpl(mo6243localPositionOfR5De75A));
        }
        return ((Boolean) this.$isTransferStarted.invoke()).booleanValue() ? TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal : TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
    }
}
