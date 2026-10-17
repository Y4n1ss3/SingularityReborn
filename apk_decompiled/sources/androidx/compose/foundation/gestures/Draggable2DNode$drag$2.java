package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.Draggable2DNode$drag$2", f = "Draggable2D.kt", l = {257}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class Draggable2DNode$drag$2 extends us0 implements my {
    final /* synthetic */ my $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Draggable2DNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Draggable2DNode$drag$2(my myVar, Draggable2DNode draggable2DNode, hm hmVar) {
        super(2, hmVar);
        this.$forEachDelta = myVar;
        this.this$0 = draggable2DNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(Drag2DScope drag2DScope, Draggable2DNode draggable2DNode, DragEvent.DragDelta dragDelta) {
        long m415getDeltaF1C5BW0 = dragDelta.m415getDeltaF1C5BW0();
        if (draggable2DNode.reverseDirection) {
            m415getDeltaF1C5BW0 = Offset.m4508constructorimpl((-9223372034707292160L) ^ m415getDeltaF1C5BW0);
        }
        drag2DScope.mo404dragByk4lQ0M(m415getDeltaF1C5BW0);
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        Draggable2DNode$drag$2 draggable2DNode$drag$2 = new Draggable2DNode$drag$2(this.$forEachDelta, this.this$0, hmVar);
        draggable2DNode$drag$2.L$0 = obj;
        return draggable2DNode$drag$2;
    }

    @Override // defpackage.my
    public final Object invoke(Drag2DScope drag2DScope, hm hmVar) {
        return ((Draggable2DNode$drag$2) create(drag2DScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            Drag2DScope drag2DScope = (Drag2DScope) this.L$0;
            my myVar = this.$forEachDelta;
            m mVar = new m(0, drag2DScope, this.this$0);
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
