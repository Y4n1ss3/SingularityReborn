package androidx.compose.foundation.pager;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "LazyLayoutPager.kt", l = {384}, m = "performFling", v = 1)
/* loaded from: classes.dex */
public final class PagerWrapperFlingBehavior$performFling$1 extends im {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PagerWrapperFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerWrapperFlingBehavior$performFling$1(PagerWrapperFlingBehavior pagerWrapperFlingBehavior, hm hmVar) {
        super(hmVar);
        this.this$0 = pagerWrapperFlingBehavior;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.performFling(null, 0.0f, this);
    }
}
