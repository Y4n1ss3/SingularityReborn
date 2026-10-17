package androidx.compose.foundation;

import defpackage.bq;
import defpackage.d41;
import defpackage.gg;
import defpackage.hm;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$cancellableShow$1", f = "BasicTooltip.kt", l = {391}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class BasicTooltipStateImpl$show$cancellableShow$1 extends us0 implements ky {
    Object L$0;
    int label;
    final /* synthetic */ BasicTooltipStateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipStateImpl$show$cancellableShow$1(BasicTooltipStateImpl basicTooltipStateImpl, hm hmVar) {
        super(1, hmVar);
        this.this$0 = basicTooltipStateImpl;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new BasicTooltipStateImpl$show$cancellableShow$1(this.this$0, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((BasicTooltipStateImpl$show$cancellableShow$1) create(hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            BasicTooltipStateImpl basicTooltipStateImpl = this.this$0;
            this.L$0 = basicTooltipStateImpl;
            this.label = 1;
            gg ggVar = new gg(1, d41.C(this));
            ggVar.u();
            basicTooltipStateImpl.setVisible(true);
            basicTooltipStateImpl.job = ggVar;
            Object s = ggVar.s();
            vn vnVar = vn.d;
            if (s == vnVar) {
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
