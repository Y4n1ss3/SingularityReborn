package androidx.compose.material3.internal;

import defpackage.bq;
import defpackage.hm;
import defpackage.o;
import defpackage.oy;
import defpackage.p10;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$snapTo$2 extends us0 implements oy {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    public AnchoredDraggableKt$snapTo$2(hm hmVar) {
        super(4, hmVar);
    }

    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t, hm hmVar) {
        AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$2 = new AnchoredDraggableKt$snapTo$2(hmVar);
        anchoredDraggableKt$snapTo$2.L$0 = anchoredDragScope;
        anchoredDraggableKt$snapTo$2.L$1 = draggableAnchors;
        anchoredDraggableKt$snapTo$2.L$2 = t;
        return anchoredDraggableKt$snapTo$2.invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
        float positionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
        if (!Float.isNaN(positionOf)) {
            AnchoredDragScope.dragTo$default(anchoredDragScope, positionOf, 0.0f, 2, null);
        }
        return w01.a;
    }

    @Override // defpackage.oy
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (hm) obj4);
    }
}
