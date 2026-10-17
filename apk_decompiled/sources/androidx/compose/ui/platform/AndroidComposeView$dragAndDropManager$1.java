package androidx.compose.ui.platform;

import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Size;
import defpackage.ky;
import defpackage.ny;
import defpackage.xy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends xy implements ny {
    public AndroidComposeView$dragAndDropManager$1(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m6694invoke12SF9DM((DragAndDropTransferData) obj, ((Size) obj2).m4590unboximpl(), (ky) obj3);
    }

    /* renamed from: invoke-12SF9DM, reason: not valid java name */
    public final Boolean m6694invoke12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j, ky kyVar) {
        boolean m6691startDrag12SF9DM;
        m6691startDrag12SF9DM = ((AndroidComposeView) this.receiver).m6691startDrag12SF9DM(dragAndDropTransferData, j, kyVar);
        return Boolean.valueOf(m6691startDrag12SF9DM);
    }
}
