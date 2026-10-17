package androidx.compose.material3.internal;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.ny;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {277}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnchoredDraggableState$draggableState$1$drag$2 extends us0 implements ny {
    final /* synthetic */ my $block;
    int label;
    final /* synthetic */ AnchoredDraggableState$draggableState$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$draggableState$1$drag$2(AnchoredDraggableState$draggableState$1 anchoredDraggableState$draggableState$1, my myVar, hm hmVar) {
        super(3, hmVar);
        this.this$0 = anchoredDraggableState$draggableState$1;
        this.$block = myVar;
    }

    @Override // defpackage.ny
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, hm hmVar) {
        return new AnchoredDraggableState$draggableState$1$drag$2(this.this$0, this.$block, hmVar).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        AnchoredDraggableState$draggableState$1$dragScope$1 anchoredDraggableState$draggableState$1$dragScope$1;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            anchoredDraggableState$draggableState$1$dragScope$1 = this.this$0.dragScope;
            my myVar = this.$block;
            this.label = 1;
            Object invoke = myVar.invoke(anchoredDraggableState$draggableState$1$dragScope$1, this);
            vn vnVar = vn.d;
            if (invoke == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
