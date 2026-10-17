package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode", f = "AnchoredDraggable.kt", l = {457, 460}, m = "fling", v = 1)
/* loaded from: classes.dex */
public final class AnchoredDraggableNode$fling$1 extends im {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$fling$1(AnchoredDraggableNode<T> anchoredDraggableNode, hm hmVar) {
        super(hmVar);
        this.this$0 = anchoredDraggableNode;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object fling;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fling = this.this$0.fling(0.0f, this);
        return fling;
    }
}
