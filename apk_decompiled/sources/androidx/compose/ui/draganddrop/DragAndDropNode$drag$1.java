package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.Offset;
import defpackage.f30;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragAndDropNode$drag$1 extends f30 implements my {
    final /* synthetic */ long $decorationSize;
    final /* synthetic */ ky $drawDragDecoration;
    final /* synthetic */ DragAndDropTransferData $transferData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$drag$1(DragAndDropTransferData dragAndDropTransferData, long j, ky kyVar) {
        super(2);
        this.$transferData = dragAndDropTransferData;
        this.$decorationSize = j;
        this.$drawDragDecoration = kyVar;
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m4266invokeUv8p0NA((DragAndDropStartTransferScope) obj, ((Offset) obj2).m4526unboximpl());
        return w01.a;
    }

    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
    public final void m4266invokeUv8p0NA(DragAndDropStartTransferScope dragAndDropStartTransferScope, long j) {
        dragAndDropStartTransferScope.mo4260startDragAndDropTransfer12SF9DM(this.$transferData, this.$decorationSize, this.$drawDragDecoration);
    }
}
