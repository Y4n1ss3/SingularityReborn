package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.gi0;
import defpackage.hm;
import defpackage.ny;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", f = "AnchoredDraggable.kt", l = {471}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AnchoredDraggableNode$fling$2 extends us0 implements ny {
    final /* synthetic */ gi0 $leftoverVelocity;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$fling$2(AnchoredDraggableNode<T> anchoredDraggableNode, gi0 gi0Var, float f, hm hmVar) {
        super(3, hmVar);
        this.this$0 = anchoredDraggableNode;
        this.$leftoverVelocity = gi0Var;
        this.$velocity = f;
    }

    @Override // defpackage.ny
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, hm hmVar) {
        AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(this.this$0, this.$leftoverVelocity, this.$velocity, hmVar);
        anchoredDraggableNode$fling$2.L$0 = anchoredDragScope;
        return anchoredDraggableNode$fling$2.invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        gi0 gi0Var;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            final AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2$scrollScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float f) {
                    AnchoredDraggableState anchoredDraggableState;
                    AnchoredDraggableState anchoredDraggableState2;
                    anchoredDraggableState = ((AnchoredDraggableNode) anchoredDraggableNode).state;
                    float newOffsetForDelta$foundation = anchoredDraggableState.newOffsetForDelta$foundation(f);
                    anchoredDraggableState2 = ((AnchoredDraggableNode) anchoredDraggableNode).state;
                    float offset = newOffsetForDelta$foundation - anchoredDraggableState2.getOffset();
                    AnchoredDragScope.dragTo$default(anchoredDragScope, newOffsetForDelta$foundation, 0.0f, 2, null);
                    return offset;
                }
            };
            FlingBehavior resolvedFlingBehavior = this.this$0.getResolvedFlingBehavior();
            gi0 gi0Var2 = this.$leftoverVelocity;
            float f = this.$velocity;
            this.L$0 = gi0Var2;
            this.label = 1;
            obj = resolvedFlingBehavior.performFling(scrollScope, f, this);
            vn vnVar = vn.d;
            if (obj == vnVar) {
                return vnVar;
            }
            gi0Var = gi0Var2;
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gi0Var = (gi0) this.L$0;
            p10.Q(obj);
        }
        gi0Var.d = ((Number) obj).floatValue();
        return w01.a;
    }
}
