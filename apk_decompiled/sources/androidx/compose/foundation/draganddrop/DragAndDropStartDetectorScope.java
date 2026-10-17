package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface DragAndDropStartDetectorScope extends PointerInputScope {
    /* renamed from: requestDragAndDropTransfer-k-4lQ0M$default, reason: not valid java name */
    static /* synthetic */ void m372requestDragAndDropTransferk4lQ0M$default(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, long j, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: requestDragAndDropTransfer-k-4lQ0M");
            return;
        }
        if ((i & 1) != 0) {
            j = Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        dragAndDropStartDetectorScope.mo359requestDragAndDropTransferk4lQ0M(j);
    }

    /* renamed from: requestDragAndDropTransfer-k-4lQ0M */
    void mo359requestDragAndDropTransferk4lQ0M(long j);
}
