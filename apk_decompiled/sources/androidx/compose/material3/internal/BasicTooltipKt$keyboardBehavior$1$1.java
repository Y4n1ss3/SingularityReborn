package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.TooltipState;
import androidx.compose.ui.focus.FocusState;
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
@bq(c = "androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$1$1", f = "BasicTooltip.kt", l = {301}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BasicTooltipKt$keyboardBehavior$1$1 extends us0 implements my {
    final /* synthetic */ FocusState $it;
    final /* synthetic */ TooltipState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$keyboardBehavior$1$1(FocusState focusState, TooltipState tooltipState, hm hmVar) {
        super(2, hmVar);
        this.$it = focusState;
        this.$state = tooltipState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new BasicTooltipKt$keyboardBehavior$1$1(this.$it, this.$state, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((BasicTooltipKt$keyboardBehavior$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            if (this.$it.isFocused()) {
                TooltipState tooltipState = this.$state;
                MutatePriority mutatePriority = MutatePriority.PreventUserInput;
                this.label = 1;
                Object show = tooltipState.show(mutatePriority, this);
                vn vnVar = vn.d;
                if (show == vnVar) {
                    return vnVar;
                }
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        if (this.$state.isVisible() && !this.$it.isFocused()) {
            this.$state.dismiss();
        }
        return w01.a;
    }
}
