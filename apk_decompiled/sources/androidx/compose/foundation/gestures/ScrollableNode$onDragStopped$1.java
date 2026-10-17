package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.unit.Velocity;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1", f = "Scrollable.kt", l = {395}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ScrollableNode$onDragStopped$1 extends us0 implements my {
    final /* synthetic */ DragEvent.DragStopped $event;
    int label;
    final /* synthetic */ ScrollableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onDragStopped$1(DragEvent.DragStopped dragStopped, ScrollableNode scrollableNode, hm hmVar) {
        super(2, hmVar);
        this.$event = dragStopped;
        this.this$0 = scrollableNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ScrollableNode$onDragStopped$1(this.$event, this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((ScrollableNode$onDragStopped$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            float f = this.$event.isIndirectPointerEvent() ? -1.0f : 1.0f;
            scrollingLogic = this.this$0.scrollingLogic;
            long m7855timesadjELrA = Velocity.m7855timesadjELrA(this.$event.m417getVelocity9UxMQ8M(), f);
            this.label = 1;
            Object m546onScrollStoppedBMRW4eQ = scrollingLogic.m546onScrollStoppedBMRW4eQ(m7855timesadjELrA, false, this);
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
