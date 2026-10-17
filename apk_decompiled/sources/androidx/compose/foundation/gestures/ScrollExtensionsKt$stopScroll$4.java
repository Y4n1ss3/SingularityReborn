package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$4", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ScrollExtensionsKt$stopScroll$4 extends us0 implements my {
    int label;

    public ScrollExtensionsKt$stopScroll$4(hm hmVar) {
        super(2, hmVar);
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ScrollExtensionsKt$stopScroll$4(hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Scroll2DScope scroll2DScope, hm hmVar) {
        return ((ScrollExtensionsKt$stopScroll$4) create(scroll2DScope, hmVar)).invokeSuspend(w01.a);
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
