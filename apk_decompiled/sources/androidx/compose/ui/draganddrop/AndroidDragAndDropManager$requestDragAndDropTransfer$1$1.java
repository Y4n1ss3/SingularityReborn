package androidx.compose.ui.draganddrop;

import defpackage.f30;
import defpackage.fi0;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidDragAndDropManager$requestDragAndDropTransfer$1$1 extends f30 implements iy {
    final /* synthetic */ fi0 $isTransferStarted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDragAndDropManager$requestDragAndDropTransfer$1$1(fi0 fi0Var) {
        super(0);
        this.$isTransferStarted = fi0Var;
    }

    @Override // defpackage.iy
    public final Boolean invoke() {
        return Boolean.valueOf(this.$isTransferStarted.d);
    }
}
