package androidx.compose.material3;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3$1$2", f = "ModalBottomSheet.kt", l = {179}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$ModalBottomSheet$3$1$2 extends us0 implements my {
    final /* synthetic */ SheetState $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheet$3$1$2(SheetState sheetState, hm hmVar) {
        super(2, hmVar);
        this.$sheetState = sheetState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ModalBottomSheetKt$ModalBottomSheet$3$1$2(this.$sheetState, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((ModalBottomSheetKt$ModalBottomSheet$3$1$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            SheetState sheetState = this.$sheetState;
            this.label = 1;
            Object partialExpand = sheetState.partialExpand(this);
            vn vnVar = vn.d;
            if (partialExpand == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
