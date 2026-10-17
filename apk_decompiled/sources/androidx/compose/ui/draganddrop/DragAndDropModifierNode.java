package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.DelegatableNode;
import defpackage.er;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes.dex */
public interface DragAndDropModifierNode extends DelegatableNode, DragAndDropTarget {
    boolean acceptDragAndDropTransfer(DragAndDropEvent dragAndDropEvent);

    @er
    /* renamed from: drag-12SF9DM, reason: not valid java name */
    void mo4261drag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j, ky kyVar);
}
