package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1", f = "TapGestureDetector.kt", l = {249}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1 extends us0 implements my {
    final /* synthetic */ PressGestureScopeImpl $pressScope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1(PressGestureScopeImpl pressGestureScopeImpl, hm hmVar) {
        super(2, hmVar);
        this.$pressScope = pressGestureScopeImpl;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1(this.$pressScope, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
            this.label = 1;
            Object reset = pressGestureScopeImpl.reset(this);
            vn vnVar = vn.d;
            if (reset == vnVar) {
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
