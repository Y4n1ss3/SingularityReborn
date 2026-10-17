package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2", f = "TransformableState.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TransformableStateKt$stopTransformation$2 extends us0 implements my {
    int label;

    public TransformableStateKt$stopTransformation$2(hm hmVar) {
        super(2, hmVar);
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TransformableStateKt$stopTransformation$2(hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(TransformScope transformScope, hm hmVar) {
        return ((TransformableStateKt$stopTransformation$2) create(transformScope, hmVar)).invokeSuspend(w01.a);
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
