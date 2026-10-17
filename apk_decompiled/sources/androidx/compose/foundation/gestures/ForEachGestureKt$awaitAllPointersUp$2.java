package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import defpackage.bq;
import defpackage.hm;
import defpackage.ij0;
import defpackage.my;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", l = {75}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ForEachGestureKt$awaitAllPointersUp$2 extends ij0 implements my {
    private /* synthetic */ Object L$0;
    int label;

    public ForEachGestureKt$awaitAllPointersUp$2(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        ForEachGestureKt$awaitAllPointersUp$2 forEachGestureKt$awaitAllPointersUp$2 = new ForEachGestureKt$awaitAllPointersUp$2(hmVar);
        forEachGestureKt$awaitAllPointersUp$2.L$0 = obj;
        return forEachGestureKt$awaitAllPointersUp$2;
    }

    @Override // defpackage.my
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
        return ((ForEachGestureKt$awaitAllPointersUp$2) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            this.label = 1;
            Object awaitAllPointersUp$default = ForEachGestureKt.awaitAllPointersUp$default(awaitPointerEventScope, null, this, 1, null);
            vn vnVar = vn.d;
            if (awaitAllPointersUp$default == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
