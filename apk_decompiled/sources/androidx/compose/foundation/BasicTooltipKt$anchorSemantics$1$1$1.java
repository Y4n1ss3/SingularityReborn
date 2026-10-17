package androidx.compose.foundation;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1$1$1", f = "BasicTooltip.kt", l = {220}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class BasicTooltipKt$anchorSemantics$1$1$1 extends us0 implements my {
    final /* synthetic */ BasicTooltipState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$anchorSemantics$1$1$1(BasicTooltipState basicTooltipState, hm hmVar) {
        super(2, hmVar);
        this.$state = basicTooltipState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new BasicTooltipKt$anchorSemantics$1$1$1(this.$state, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((BasicTooltipKt$anchorSemantics$1$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            BasicTooltipState basicTooltipState = this.$state;
            this.label = 1;
            Object show$default = BasicTooltipState.show$default(basicTooltipState, null, this, 1, null);
            vn vnVar = vn.d;
            if (show$default == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
