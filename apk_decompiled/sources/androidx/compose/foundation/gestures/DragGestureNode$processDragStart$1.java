package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {649, 652}, m = "processDragStart", v = 1)
/* loaded from: classes.dex */
public final class DragGestureNode$processDragStart$1 extends im {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DragGestureNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragStart$1(DragGestureNode dragGestureNode, hm hmVar) {
        super(hmVar);
        this.this$0 = dragGestureNode;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object processDragStart;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processDragStart = this.this$0.processDragStart(null, this);
        return processDragStart;
    }
}
