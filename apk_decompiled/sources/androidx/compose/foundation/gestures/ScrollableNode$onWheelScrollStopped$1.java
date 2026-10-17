package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ScrollableNode$onWheelScrollStopped$1", f = "Scrollable.kt", l = {404}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ScrollableNode$onWheelScrollStopped$1 extends us0 implements my {

    /* renamed from: $$v$c$androidx-compose-ui-unit-Velocity$-velocity$0, reason: not valid java name */
    final /* synthetic */ long f15$$v$c$androidxcomposeuiunitVelocity$velocity$0;
    int label;
    final /* synthetic */ ScrollableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onWheelScrollStopped$1(ScrollableNode scrollableNode, long j, hm hmVar) {
        super(2, hmVar);
        this.this$0 = scrollableNode;
        this.f15$$v$c$androidxcomposeuiunitVelocity$velocity$0 = j;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ScrollableNode$onWheelScrollStopped$1(this.this$0, this.f15$$v$c$androidxcomposeuiunitVelocity$velocity$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((ScrollableNode$onWheelScrollStopped$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            scrollingLogic = this.this$0.scrollingLogic;
            long j = this.f15$$v$c$androidxcomposeuiunitVelocity$velocity$0;
            this.label = 1;
            Object m546onScrollStoppedBMRW4eQ = scrollingLogic.m546onScrollStoppedBMRW4eQ(j, true, this);
            vn vnVar = vn.d;
            if (m546onScrollStoppedBMRW4eQ == vnVar) {
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
