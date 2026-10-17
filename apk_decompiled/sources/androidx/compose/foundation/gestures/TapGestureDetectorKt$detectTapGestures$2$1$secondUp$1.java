package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1 extends us0 implements my {
    final /* synthetic */ PressGestureScopeImpl $pressScope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(PressGestureScopeImpl pressGestureScopeImpl, hm hmVar) {
        super(2, hmVar);
        this.$pressScope = pressGestureScopeImpl;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.$pressScope, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        this.$pressScope.release();
        return w01.a;
    }
}
