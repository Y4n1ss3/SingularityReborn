package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.gi0;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ScrollExtensionsKt$scrollBy$2 extends us0 implements my {
    final /* synthetic */ gi0 $consumed;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$scrollBy$2(gi0 gi0Var, float f, hm hmVar) {
        super(2, hmVar);
        this.$consumed = gi0Var;
        this.$value = f;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(this.$consumed, this.$value, hmVar);
        scrollExtensionsKt$scrollBy$2.L$0 = obj;
        return scrollExtensionsKt$scrollBy$2;
    }

    @Override // defpackage.my
    public final Object invoke(ScrollScope scrollScope, hm hmVar) {
        return ((ScrollExtensionsKt$scrollBy$2) create(scrollScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        ScrollScope scrollScope = (ScrollScope) this.L$0;
        this.$consumed.d = scrollScope.scrollBy(this.$value);
        return w01.a;
    }
}
