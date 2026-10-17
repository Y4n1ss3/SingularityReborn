package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.ny;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", l = {410}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AnchoredDraggableNode$drag$2 extends us0 implements ny {
    final /* synthetic */ my $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$drag$2(my myVar, AnchoredDraggableNode<T> anchoredDraggableNode, hm hmVar) {
        super(3, hmVar);
        this.$forEachDelta = myVar;
        this.this$0 = anchoredDraggableNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(AnchoredDraggableNode anchoredDraggableNode, AnchoredDragScope anchoredDragScope, DragEvent.DragDelta dragDelta) {
        long m380reverseIfNeededMKHz9U;
        float m382toFloatk4lQ0M;
        OverscrollEffect overscrollEffect;
        OverscrollEffect overscrollEffect2;
        long m383toOffsettuRUvjQ;
        AnchoredDraggableState anchoredDraggableState;
        m380reverseIfNeededMKHz9U = anchoredDraggableNode.m380reverseIfNeededMKHz9U(dragDelta.m415getDeltaF1C5BW0());
        m382toFloatk4lQ0M = anchoredDraggableNode.m382toFloatk4lQ0M(m380reverseIfNeededMKHz9U);
        overscrollEffect = anchoredDraggableNode.overscrollEffect;
        if (overscrollEffect == null) {
            anchoredDraggableState = anchoredDraggableNode.state;
            AnchoredDragScope.dragTo$default(anchoredDragScope, anchoredDraggableState.newOffsetForDelta$foundation(m382toFloatk4lQ0M), 0.0f, 2, null);
        } else {
            overscrollEffect2 = anchoredDraggableNode.overscrollEffect;
            overscrollEffect2.getClass();
            m383toOffsettuRUvjQ = anchoredDraggableNode.m383toOffsettuRUvjQ(m382toFloatk4lQ0M);
            Offset.m4505boximpl(overscrollEffect2.mo206applyToScrollRhakbz0(m383toOffsettuRUvjQ, NestedScrollSource.Companion.m5969getUserInputWNlRxjI(), new b(anchoredDraggableNode, anchoredDragScope, 0)));
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset invokeSuspend$lambda$0$0(AnchoredDraggableNode anchoredDraggableNode, AnchoredDragScope anchoredDragScope, Offset offset) {
        AnchoredDraggableState anchoredDraggableState;
        float m382toFloatk4lQ0M;
        AnchoredDraggableState anchoredDraggableState2;
        long m383toOffsettuRUvjQ;
        anchoredDraggableState = anchoredDraggableNode.state;
        m382toFloatk4lQ0M = anchoredDraggableNode.m382toFloatk4lQ0M(offset.m4526unboximpl());
        float newOffsetForDelta$foundation = anchoredDraggableState.newOffsetForDelta$foundation(m382toFloatk4lQ0M);
        anchoredDraggableState2 = anchoredDraggableNode.state;
        m383toOffsettuRUvjQ = anchoredDraggableNode.m383toOffsettuRUvjQ(newOffsetForDelta$foundation - anchoredDraggableState2.requireOffset());
        AnchoredDragScope.dragTo$default(anchoredDragScope, newOffsetForDelta$foundation, 0.0f, 2, null);
        return Offset.m4505boximpl(m383toOffsettuRUvjQ);
    }

    @Override // defpackage.ny
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, hm hmVar) {
        AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2 = new AnchoredDraggableNode$drag$2(this.$forEachDelta, this.this$0, hmVar);
        anchoredDraggableNode$drag$2.L$0 = anchoredDragScope;
        return anchoredDraggableNode$drag$2.invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            p10.Q(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            my myVar = this.$forEachDelta;
            b bVar = new b(this.this$0, anchoredDragScope, i2);
            this.label = 1;
            Object invoke = myVar.invoke(bVar, this);
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
