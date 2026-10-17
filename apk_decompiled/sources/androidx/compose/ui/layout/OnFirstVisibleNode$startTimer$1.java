package androidx.compose.ui.layout;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.layout.OnFirstVisibleNode$startTimer$1", f = "OnFirstVisibleModifier.kt", l = {195}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class OnFirstVisibleNode$startTimer$1 extends us0 implements my {
    final /* synthetic */ long $minDurationMs;
    int label;
    final /* synthetic */ OnFirstVisibleNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnFirstVisibleNode$startTimer$1(long j, OnFirstVisibleNode onFirstVisibleNode, hm hmVar) {
        super(2, hmVar);
        this.$minDurationMs = j;
        this.this$0 = onFirstVisibleNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new OnFirstVisibleNode$startTimer$1(this.$minDurationMs, this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((OnFirstVisibleNode$startTimer$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            long j = this.$minDurationMs;
            this.label = 1;
            Object p = y80.p(j, this);
            vn vnVar = vn.d;
            if (p == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        this.this$0.triggerCallback();
        return w01.a;
    }
}
