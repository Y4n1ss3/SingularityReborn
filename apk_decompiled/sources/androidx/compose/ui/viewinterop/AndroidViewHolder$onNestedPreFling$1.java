package androidx.compose.ui.viewinterop;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
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
@bq(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {645}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class AndroidViewHolder$onNestedPreFling$1 extends us0 implements my {
    final /* synthetic */ long $toBeConsumed;
    int label;
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onNestedPreFling$1(AndroidViewHolder androidViewHolder, long j, hm hmVar) {
        super(2, hmVar);
        this.this$0 = androidViewHolder;
        this.$toBeConsumed = j;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new AndroidViewHolder$onNestedPreFling$1(this.this$0, this.$toBeConsumed, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AndroidViewHolder$onNestedPreFling$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        NestedScrollDispatcher nestedScrollDispatcher;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            nestedScrollDispatcher = this.this$0.dispatcher;
            long j = this.$toBeConsumed;
            this.label = 1;
            Object m5952dispatchPreFlingQWom1Mo = nestedScrollDispatcher.m5952dispatchPreFlingQWom1Mo(j, this);
            vn vnVar = vn.d;
            if (m5952dispatchPreFlingQWom1Mo == vnVar) {
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
