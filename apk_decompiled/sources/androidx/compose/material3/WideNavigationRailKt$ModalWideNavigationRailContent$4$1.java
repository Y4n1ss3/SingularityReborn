package androidx.compose.material3;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.ny;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$4$1", f = "WideNavigationRail.kt", l = {1042}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WideNavigationRailKt$ModalWideNavigationRailContent$4$1 extends us0 implements ny {
    final /* synthetic */ my $settleToDismiss;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WideNavigationRailKt$ModalWideNavigationRailContent$4$1(my myVar, hm hmVar) {
        super(3, hmVar);
        this.$settleToDismiss = myVar;
    }

    public final Object invoke(un unVar, float f, hm hmVar) {
        WideNavigationRailKt$ModalWideNavigationRailContent$4$1 wideNavigationRailKt$ModalWideNavigationRailContent$4$1 = new WideNavigationRailKt$ModalWideNavigationRailContent$4$1(this.$settleToDismiss, hmVar);
        wideNavigationRailKt$ModalWideNavigationRailContent$4$1.F$0 = f;
        return wideNavigationRailKt$ModalWideNavigationRailContent$4$1.invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            float f = this.F$0;
            my myVar = this.$settleToDismiss;
            Float f2 = new Float(f);
            this.label = 1;
            Object invoke = myVar.invoke(f2, this);
            vn vnVar = vn.d;
            if (invoke == vnVar) {
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

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((un) obj, ((Number) obj2).floatValue(), (hm) obj3);
    }
}
