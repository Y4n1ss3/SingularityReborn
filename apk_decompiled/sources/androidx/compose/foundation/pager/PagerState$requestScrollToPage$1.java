package androidx.compose.foundation.pager;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
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
@bq(c = "androidx.compose.foundation.pager.PagerState$requestScrollToPage$1", f = "PagerState.kt", l = {634}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class PagerState$requestScrollToPage$1 extends us0 implements my {
    int label;
    final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$requestScrollToPage$1(PagerState pagerState, hm hmVar) {
        super(2, hmVar);
        this.this$0 = pagerState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new PagerState$requestScrollToPage$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((PagerState$requestScrollToPage$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            PagerState pagerState = this.this$0;
            this.label = 1;
            Object stopScroll$default = ScrollExtensionsKt.stopScroll$default(pagerState, (MutatePriority) null, this, 1, (Object) null);
            vn vnVar = vn.d;
            if (stopScroll$default == vnVar) {
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
