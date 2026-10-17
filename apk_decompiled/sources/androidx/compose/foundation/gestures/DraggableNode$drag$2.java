package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {317}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DraggableNode$drag$2 extends us0 implements my {
    final /* synthetic */ my $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$drag$2(my myVar, DraggableNode draggableNode, hm hmVar) {
        super(2, hmVar);
        this.$forEachDelta = myVar;
        this.this$0 = draggableNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(DragScope dragScope, DraggableNode draggableNode, DragEvent.DragDelta dragDelta) {
        long m454reverseIfNeededMKHz9U;
        Orientation orientation;
        m454reverseIfNeededMKHz9U = draggableNode.m454reverseIfNeededMKHz9U(dragDelta.m415getDeltaF1C5BW0());
        orientation = draggableNode.orientation;
        dragScope.dragBy(DraggableKt.m447toFloat3MmeM6k(m454reverseIfNeededMKHz9U, orientation));
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        DraggableNode$drag$2 draggableNode$drag$2 = new DraggableNode$drag$2(this.$forEachDelta, this.this$0, hmVar);
        draggableNode$drag$2.L$0 = obj;
        return draggableNode$drag$2;
    }

    @Override // defpackage.my
    public final Object invoke(DragScope dragScope, hm hmVar) {
        return ((DraggableNode$drag$2) create(dragScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            p10.Q(obj);
            DragScope dragScope = (DragScope) this.L$0;
            my myVar = this.$forEachDelta;
            m mVar = new m(i2, dragScope, this.this$0);
            this.label = 1;
            Object invoke = myVar.invoke(mVar, this);
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
