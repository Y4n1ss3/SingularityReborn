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
@bq(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1", f = "PullToRefresh.kt", l = {304, 306}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PullToRefreshModifierNode$update$1 extends us0 implements my {
    int label;
    final /* synthetic */ PullToRefreshModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$update$1(PullToRefreshModifierNode pullToRefreshModifierNode, hm hmVar) {
        super(2, hmVar);
        this.this$0 = pullToRefreshModifierNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new PullToRefreshModifierNode$update$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((PullToRefreshModifierNode$update$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r4 == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r4 == r3) goto L17;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object animateToThreshold;
        Object animateToHidden;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            boolean isRefreshing = this.this$0.isRefreshing();
            PullToRefreshModifierNode pullToRefreshModifierNode = this.this$0;
            vn vnVar = vn.d;
            if (isRefreshing) {
                this.label = 2;
                animateToThreshold = pullToRefreshModifierNode.animateToThreshold(this);
            } else {
                this.label = 1;
                animateToHidden = pullToRefreshModifierNode.animateToHidden(this);
            }
        } else {
            if (i != 1 && i != 2) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
