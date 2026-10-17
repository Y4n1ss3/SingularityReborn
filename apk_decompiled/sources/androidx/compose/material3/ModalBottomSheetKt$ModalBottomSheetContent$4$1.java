package androidx.compose.material3;

import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.ny;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1", f = "ModalBottomSheet.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$ModalBottomSheetContent$4$1 extends us0 implements ny {
    final /* synthetic */ ky $settleToDismiss;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetContent$4$1(ky kyVar, hm hmVar) {
        super(3, hmVar);
        this.$settleToDismiss = kyVar;
    }

    public final Object invoke(un unVar, float f, hm hmVar) {
        ModalBottomSheetKt$ModalBottomSheetContent$4$1 modalBottomSheetKt$ModalBottomSheetContent$4$1 = new ModalBottomSheetKt$ModalBottomSheetContent$4$1(this.$settleToDismiss, hmVar);
        modalBottomSheetKt$ModalBottomSheetContent$4$1.F$0 = f;
        return modalBottomSheetKt$ModalBottomSheetContent$4$1.invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        this.$settleToDismiss.invoke(new Float(this.F$0));
        return w01.a;
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((un) obj, ((Number) obj2).floatValue(), (hm) obj3);
    }
}
