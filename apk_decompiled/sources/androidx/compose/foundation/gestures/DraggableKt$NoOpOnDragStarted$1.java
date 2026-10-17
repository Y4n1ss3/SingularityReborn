package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import defpackage.bq;
import defpackage.hm;
import defpackage.ny;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", f = "Draggable.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DraggableKt$NoOpOnDragStarted$1 extends us0 implements ny {
    int label;

    public DraggableKt$NoOpOnDragStarted$1(hm hmVar) {
        super(3, hmVar);
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m450invoked4ec7I((un) obj, ((Offset) obj2).m4526unboximpl(), (hm) obj3);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m450invoked4ec7I(un unVar, long j, hm hmVar) {
        return new DraggableKt$NoOpOnDragStarted$1(hmVar).invokeSuspend(w01.a);
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
}
