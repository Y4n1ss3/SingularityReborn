package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
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
@bq(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", f = "Draggable.kt", l = {326}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DraggableNode$onDragStarted$1 extends us0 implements my {

    /* renamed from: $$v$c$androidx-compose-ui-geometry-Offset$-startedPosition$0, reason: not valid java name */
    final /* synthetic */ long f10$$v$c$androidxcomposeuigeometryOffset$startedPosition$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$onDragStarted$1(DraggableNode draggableNode, long j, hm hmVar) {
        super(2, hmVar);
        this.this$0 = draggableNode;
        this.f10$$v$c$androidxcomposeuigeometryOffset$startedPosition$0 = j;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        DraggableNode$onDragStarted$1 draggableNode$onDragStarted$1 = new DraggableNode$onDragStarted$1(this.this$0, this.f10$$v$c$androidxcomposeuigeometryOffset$startedPosition$0, hmVar);
        draggableNode$onDragStarted$1.L$0 = obj;
        return draggableNode$onDragStarted$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((DraggableNode$onDragStarted$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        ny nyVar;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            un unVar = (un) this.L$0;
            nyVar = this.this$0.onDragStarted;
            Offset m4505boximpl = Offset.m4505boximpl(this.f10$$v$c$androidxcomposeuigeometryOffset$startedPosition$0);
            this.label = 1;
            Object invoke = nyVar.invoke(unVar, m4505boximpl, this);
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
