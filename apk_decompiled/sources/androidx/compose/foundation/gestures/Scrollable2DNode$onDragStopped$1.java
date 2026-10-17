package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.runtime.ComposerKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.Scrollable2DNode$onDragStopped$1", f = "Scrollable2D.kt", l = {ComposerKt.invocationKey}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class Scrollable2DNode$onDragStopped$1 extends us0 implements my {
    final /* synthetic */ DragEvent.DragStopped $event;
    int label;
    final /* synthetic */ Scrollable2DNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scrollable2DNode$onDragStopped$1(Scrollable2DNode scrollable2DNode, DragEvent.DragStopped dragStopped, hm hmVar) {
        super(2, hmVar);
        this.this$0 = scrollable2DNode;
        this.$event = dragStopped;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new Scrollable2DNode$onDragStopped$1(this.this$0, this.$event, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((Scrollable2DNode$onDragStopped$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic2D scrollingLogic2D;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            scrollingLogic2D = this.this$0.scrollingLogic;
            long m417getVelocity9UxMQ8M = this.$event.m417getVelocity9UxMQ8M();
            this.label = 1;
            Object m557onScrollStoppedsFctU = scrollingLogic2D.m557onScrollStoppedsFctU(m417getVelocity9UxMQ8M, this);
            vn vnVar = vn.d;
            if (m557onScrollStoppedsFctU == vnVar) {
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
