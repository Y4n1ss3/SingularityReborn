package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipState;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.internal.BasicTooltipKt$TooltipPopup$1$1$1", f = "BasicTooltip.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BasicTooltipKt$TooltipPopup$1$1$1 extends us0 implements my {
    final /* synthetic */ TooltipState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$TooltipPopup$1$1$1(TooltipState tooltipState, hm hmVar) {
        super(2, hmVar);
        this.$state = tooltipState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new BasicTooltipKt$TooltipPopup$1$1$1(this.$state, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((BasicTooltipKt$TooltipPopup$1$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        this.$state.dismiss();
        return w01.a;
    }
}
