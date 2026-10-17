package androidx.compose.material3.pulltorefresh;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {384}, m = "animateToHidden")
/* loaded from: classes.dex */
public final class PullToRefreshModifierNode$animateToHidden$1 extends im {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PullToRefreshModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$animateToHidden$1(PullToRefreshModifierNode pullToRefreshModifierNode, hm hmVar) {
        super(hmVar);
        this.this$0 = pullToRefreshModifierNode;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object animateToHidden;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        animateToHidden = this.this$0.animateToHidden(this);
        return animateToHidden;
    }
}
