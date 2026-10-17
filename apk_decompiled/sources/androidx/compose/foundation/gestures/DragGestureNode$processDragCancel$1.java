package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {667}, m = "processDragCancel", v = 1)
/* loaded from: classes.dex */
public final class DragGestureNode$processDragCancel$1 extends im {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DragGestureNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragCancel$1(DragGestureNode dragGestureNode, hm hmVar) {
        super(hmVar);
        this.this$0 = dragGestureNode;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object processDragCancel;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processDragCancel = this.this$0.processDragCancel(this);
        return processDragCancel;
    }
}
