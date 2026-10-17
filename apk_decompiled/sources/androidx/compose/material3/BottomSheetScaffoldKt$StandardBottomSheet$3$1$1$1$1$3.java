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
@bq(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$3", f = "BottomSheetScaffold.kt", l = {351}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$3 extends us0 implements my {
    final /* synthetic */ SheetState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$3(SheetState sheetState, hm hmVar) {
        super(2, hmVar);
        this.$state = sheetState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$3(this.$state, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$3) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            SheetState sheetState = this.$state;
            this.label = 1;
            Object show = sheetState.show(this);
            vn vnVar = vn.d;
            if (show == vnVar) {
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
