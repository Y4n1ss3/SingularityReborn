package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3", f = "LazyLayoutItemAnimation.kt", l = {226}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimation$release$3 extends us0 implements my {
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$release$3(LazyLayoutItemAnimation lazyLayoutItemAnimation, hm hmVar) {
        super(2, hmVar);
        this.this$0 = lazyLayoutItemAnimation;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new LazyLayoutItemAnimation$release$3(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((LazyLayoutItemAnimation$release$3) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            animatable = this.this$0.visibilityAnimation;
            this.label = 1;
            Object stop = animatable.stop(this);
            vn vnVar = vn.d;
            if (stop == vnVar) {
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
