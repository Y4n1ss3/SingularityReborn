package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.ny;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", l = {333}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DraggableNode$onDragStopped$1 extends us0 implements my {
    final /* synthetic */ DragEvent.DragStopped $event;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$onDragStopped$1(DraggableNode draggableNode, DragEvent.DragStopped dragStopped, hm hmVar) {
        super(2, hmVar);
        this.this$0 = draggableNode;
        this.$event = dragStopped;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        DraggableNode$onDragStopped$1 draggableNode$onDragStopped$1 = new DraggableNode$onDragStopped$1(this.this$0, this.$event, hmVar);
        draggableNode$onDragStopped$1.L$0 = obj;
        return draggableNode$onDragStopped$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((DraggableNode$onDragStopped$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        ny nyVar;
        long m453reverseIfNeededAH228Gc;
        Orientation orientation;
        float m448toFloatsFctU;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            un unVar = (un) this.L$0;
            nyVar = this.this$0.onDragStopped;
            m453reverseIfNeededAH228Gc = this.this$0.m453reverseIfNeededAH228Gc(this.$event.m417getVelocity9UxMQ8M());
            orientation = this.this$0.orientation;
            m448toFloatsFctU = DraggableKt.m448toFloatsFctU(m453reverseIfNeededAH228Gc, orientation);
            Float f = new Float(m448toFloatsFctU);
            this.label = 1;
            Object invoke = nyVar.invoke(unVar, f, this);
            vn vnVar = vn.d;
            if (invoke == vnVar) {
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
