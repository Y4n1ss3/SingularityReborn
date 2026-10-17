package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.ii0;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$4", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ScrollExtensionsKt$scrollBy$4 extends us0 implements my {

    /* renamed from: $$v$c$androidx-compose-ui-geometry-Offset$-value$0, reason: not valid java name */
    final /* synthetic */ long f12$$v$c$androidxcomposeuigeometryOffset$value$0;
    final /* synthetic */ ii0 $consumed;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$scrollBy$4(ii0 ii0Var, long j, hm hmVar) {
        super(2, hmVar);
        this.$consumed = ii0Var;
        this.f12$$v$c$androidxcomposeuigeometryOffset$value$0 = j;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        ScrollExtensionsKt$scrollBy$4 scrollExtensionsKt$scrollBy$4 = new ScrollExtensionsKt$scrollBy$4(this.$consumed, this.f12$$v$c$androidxcomposeuigeometryOffset$value$0, hmVar);
        scrollExtensionsKt$scrollBy$4.L$0 = obj;
        return scrollExtensionsKt$scrollBy$4;
    }

    @Override // defpackage.my
    public final Object invoke(Scroll2DScope scroll2DScope, hm hmVar) {
        return ((ScrollExtensionsKt$scrollBy$4) create(scroll2DScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        Scroll2DScope scroll2DScope = (Scroll2DScope) this.L$0;
        this.$consumed.d = scroll2DScope.mo407scrollByMKHz9U(this.f12$$v$c$androidxcomposeuigeometryOffset$value$0);
        return w01.a;
    }
}
