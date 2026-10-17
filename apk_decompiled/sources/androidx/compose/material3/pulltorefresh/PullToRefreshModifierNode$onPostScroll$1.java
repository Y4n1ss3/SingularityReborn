package androidx.compose.material3.pulltorefresh;

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
@bq(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPostScroll$1", f = "PullToRefresh.kt", l = {288}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PullToRefreshModifierNode$onPostScroll$1 extends us0 implements my {
    int label;
    final /* synthetic */ PullToRefreshModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$onPostScroll$1(PullToRefreshModifierNode pullToRefreshModifierNode, hm hmVar) {
        super(2, hmVar);
        this.this$0 = pullToRefreshModifierNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new PullToRefreshModifierNode$onPostScroll$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((PullToRefreshModifierNode$onPostScroll$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        float verticalOffset;
        int thresholdPx;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            if (!this.this$0.getState().isAnimating()) {
                PullToRefreshState state = this.this$0.getState();
                verticalOffset = this.this$0.getVerticalOffset();
                thresholdPx = this.this$0.getThresholdPx();
                this.label = 1;
                Object snapTo = state.snapTo(verticalOffset / thresholdPx, this);
                vn vnVar = vn.d;
                if (snapTo == vnVar) {
                    return vnVar;
                }
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
