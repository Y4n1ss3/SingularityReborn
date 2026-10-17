package androidx.compose.material3;

import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.SwipeToDismissBoxKt$SwipeToDismissBox$3$1", f = "SwipeToDismissBox.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SwipeToDismissBoxKt$SwipeToDismissBox$3$1 extends us0 implements my {
    final /* synthetic */ ky $onDismiss;
    final /* synthetic */ SwipeToDismissBoxState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToDismissBoxKt$SwipeToDismissBox$3$1(SwipeToDismissBoxState swipeToDismissBoxState, ky kyVar, hm hmVar) {
        super(2, hmVar);
        this.$state = swipeToDismissBoxState;
        this.$onDismiss = kyVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SwipeToDismissBoxKt$SwipeToDismissBox$3$1(this.$state, this.$onDismiss, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SwipeToDismissBoxKt$SwipeToDismissBox$3$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        if (this.$state.getSettledValue() != SwipeToDismissBoxValue.Settled) {
            this.$onDismiss.invoke(this.$state.getDismissDirection());
        }
        return w01.a;
    }
}
