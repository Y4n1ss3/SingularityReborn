package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import defpackage.hm;
import defpackage.my;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnchoredDraggableState$draggableState$1 implements DraggableState {
    private final AnchoredDraggableState$draggableState$1$dragScope$1 dragScope;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$dragScope$1] */
    public AnchoredDraggableState$draggableState$1(final AnchoredDraggableState<T> anchoredDraggableState) {
        this.this$0 = anchoredDraggableState;
        this.dragScope = new DragScope() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f) {
                AnchoredDragScope anchoredDragScope;
                anchoredDragScope = ((AnchoredDraggableState) anchoredDraggableState).anchoredDragScope;
                AnchoredDragScope.dragTo$default(anchoredDragScope, anchoredDraggableState.newOffsetForDelta$material3(f), 0.0f, 2, null);
            }
        };
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f) {
        this.this$0.dispatchRawDelta(f);
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, my myVar, hm hmVar) {
        Object anchoredDrag = this.this$0.anchoredDrag(mutatePriority, new AnchoredDraggableState$draggableState$1$drag$2(this, myVar, null), hmVar);
        return anchoredDrag == vn.d ? anchoredDrag : w01.a;
    }
}
