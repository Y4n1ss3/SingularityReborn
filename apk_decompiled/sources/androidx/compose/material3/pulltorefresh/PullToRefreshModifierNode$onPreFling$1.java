package androidx.compose.material3.pulltorefresh;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {298}, m = "onPreFling-QWom1Mo")
/* loaded from: classes.dex */
public final class PullToRefreshModifierNode$onPreFling$1 extends im {
    float F$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PullToRefreshModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$onPreFling$1(PullToRefreshModifierNode pullToRefreshModifierNode, hm hmVar) {
        super(hmVar);
        this.this$0 = pullToRefreshModifierNode;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo837onPreFlingQWom1Mo(0L, this);
    }
}
