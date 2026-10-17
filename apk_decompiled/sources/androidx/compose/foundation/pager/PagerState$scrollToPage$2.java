package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", l = {551}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class PagerState$scrollToPage$2 extends us0 implements my {
    final /* synthetic */ int $page;
    final /* synthetic */ float $pageOffsetFraction;
    int label;
    final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$scrollToPage$2(PagerState pagerState, float f, int i, hm hmVar) {
        super(2, hmVar);
        this.this$0 = pagerState;
        this.$pageOffsetFraction = f;
        this.$page = i;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new PagerState$scrollToPage$2(this.this$0, this.$pageOffsetFraction, this.$page, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(ScrollScope scrollScope, hm hmVar) {
        return ((PagerState$scrollToPage$2) create(scrollScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object awaitScrollDependencies;
        int coerceInPageRange;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            PagerState pagerState = this.this$0;
            this.label = 1;
            awaitScrollDependencies = pagerState.awaitScrollDependencies(this);
            vn vnVar = vn.d;
            if (awaitScrollDependencies == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        float f = this.$pageOffsetFraction;
        double d = f;
        boolean z = false;
        if (-0.5d <= d && d <= 0.5d) {
            z = true;
        }
        if (!z) {
            InlineClassHelperKt.throwIllegalArgumentException("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        coerceInPageRange = this.this$0.coerceInPageRange(this.$page);
        this.this$0.snapToItem$foundation(coerceInPageRange, this.$pageOffsetFraction, true);
        return w01.a;
    }
}
