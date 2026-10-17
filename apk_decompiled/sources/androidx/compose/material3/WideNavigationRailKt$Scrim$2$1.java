package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.WideNavigationRailKt$Scrim$2$1", f = "WideNavigationRail.kt", l = {1130}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WideNavigationRailKt$Scrim$2$1 extends us0 implements my {
    final /* synthetic */ MutableState<Boolean> $dismiss$delegate;
    final /* synthetic */ ky $onDismissRequest;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WideNavigationRailKt$Scrim$2$1(ky kyVar, MutableState<Boolean> mutableState, hm hmVar) {
        super(2, hmVar);
        this.$onDismissRequest = kyVar;
        this.$dismiss$delegate = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new WideNavigationRailKt$Scrim$2$1(this.$onDismissRequest, this.$dismiss$delegate, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((WideNavigationRailKt$Scrim$2$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        boolean Scrim_3J_VO9M$lambda$28;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            Scrim_3J_VO9M$lambda$28 = WideNavigationRailKt.Scrim_3J_VO9M$lambda$28(this.$dismiss$delegate);
            if (Scrim_3J_VO9M$lambda$28) {
                ky kyVar = this.$onDismissRequest;
                this.label = 1;
                Object invoke = kyVar.invoke(this);
                vn vnVar = vn.d;
                if (invoke == vnVar) {
                    return vnVar;
                }
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
