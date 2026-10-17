package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.ny;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", f = "Draggable.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DraggableKt$NoOpOnDragStopped$1 extends us0 implements ny {
    int label;

    public DraggableKt$NoOpOnDragStopped$1(hm hmVar) {
        super(3, hmVar);
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((un) obj, ((Number) obj2).floatValue(), (hm) obj3);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            p10.Q(obj);
            return w01.a;
        }
        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public final Object invoke(un unVar, float f, hm hmVar) {
        return new DraggableKt$NoOpOnDragStopped$1(hmVar).invokeSuspend(w01.a);
    }
}
