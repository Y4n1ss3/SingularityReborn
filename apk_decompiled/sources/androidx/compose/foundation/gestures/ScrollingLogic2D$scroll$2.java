package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ScrollingLogic2D$scroll$2", f = "Scrollable2D.kt", l = {479}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ScrollingLogic2D$scroll$2 extends us0 implements my {
    final /* synthetic */ my $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScrollingLogic2D this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic2D$scroll$2(ScrollingLogic2D scrollingLogic2D, my myVar, hm hmVar) {
        super(2, hmVar);
        this.this$0 = scrollingLogic2D;
        this.$block = myVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        ScrollingLogic2D$scroll$2 scrollingLogic2D$scroll$2 = new ScrollingLogic2D$scroll$2(this.this$0, this.$block, hmVar);
        scrollingLogic2D$scroll$2.L$0 = obj;
        return scrollingLogic2D$scroll$2;
    }

    @Override // defpackage.my
    public final Object invoke(Scroll2DScope scroll2DScope, hm hmVar) {
        return ((ScrollingLogic2D$scroll$2) create(scroll2DScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic2D$nestedScrollScope$1 scrollingLogic2D$nestedScrollScope$1;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            this.this$0.outerStateScope = (Scroll2DScope) this.L$0;
            my myVar = this.$block;
            scrollingLogic2D$nestedScrollScope$1 = this.this$0.nestedScrollScope;
            this.label = 1;
            Object invoke = myVar.invoke(scrollingLogic2D$nestedScrollScope$1, this);
            vn vnVar = vn.d;
            if (invoke == vnVar) {
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
