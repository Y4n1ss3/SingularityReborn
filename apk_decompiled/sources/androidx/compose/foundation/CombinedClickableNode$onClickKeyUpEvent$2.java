package androidx.compose.foundation;

import androidx.compose.foundation.CombinedClickableNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.ra0;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", f = "Clickable.kt", l = {1194, 1198}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class CombinedClickableNode$onClickKeyUpEvent$2 extends us0 implements my {
    final /* synthetic */ long $keyCode;
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ CombinedClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$onClickKeyUpEvent$2(CombinedClickableNode combinedClickableNode, long j, hm hmVar) {
        super(2, hmVar);
        this.this$0 = combinedClickableNode;
        this.$keyCode = j;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new CombinedClickableNode$onClickKeyUpEvent$2(this.this$0, this.$keyCode, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((CombinedClickableNode$onClickKeyUpEvent$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (defpackage.y80.p(r4 - r6, r10) == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (defpackage.y80.p(r6, r10) == r3) goto L18;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long doubleTapMinTimeMillis;
        long doubleTapTimeoutMillis;
        ra0 ra0Var;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            ViewConfiguration viewConfiguration = (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, CompositionLocalsKt.getLocalViewConfiguration());
            doubleTapMinTimeMillis = viewConfiguration.getDoubleTapMinTimeMillis();
            doubleTapTimeoutMillis = viewConfiguration.getDoubleTapTimeoutMillis();
            this.J$0 = doubleTapMinTimeMillis;
            this.J$1 = doubleTapTimeoutMillis;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                this.this$0.getOnClick().invoke();
                return w01.a;
            }
            doubleTapTimeoutMillis = this.J$1;
            doubleTapMinTimeMillis = this.J$0;
            p10.Q(obj);
        }
        ra0Var = this.this$0.doubleKeyClickStates;
        CombinedClickableNode.DoubleKeyClickState doubleKeyClickState = (CombinedClickableNode.DoubleKeyClickState) ra0Var.b(this.$keyCode);
        if (doubleKeyClickState != null) {
            doubleKeyClickState.setDoubleTapMinTimeMillisElapsed(true);
        }
        this.label = 2;
    }
}
