package androidx.compose.ui.input.pointer;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1", f = "SuspendingPointerInputFilter.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1 extends us0 implements my {
    int label;

    public SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1(hm hmVar) {
        super(2, hmVar);
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1(hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
        return ((SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1) create(pointerInputScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            p10.Q(obj);
            return w01.a;
        }
        o.f("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
