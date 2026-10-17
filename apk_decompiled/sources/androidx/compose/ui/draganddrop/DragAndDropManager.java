package androidx.compose.ui.draganddrop;

import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface DragAndDropManager {
    Modifier getModifier();

    boolean isInterestedTarget(DragAndDropTarget dragAndDropTarget);

    boolean isRequestDragAndDropTransferRequired();

    void registerTargetInterest(DragAndDropTarget dragAndDropTarget);

    /* renamed from: requestDragAndDropTransfer-Uv8p0NA */
    void mo4259requestDragAndDropTransferUv8p0NA(DragAndDropNode dragAndDropNode, long j);
}
