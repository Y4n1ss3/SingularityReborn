package androidx.compose.foundation;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1", f = "BasicMarquee.kt", l = {390, 391}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class MarqueeModifierNode$restartAnimation$1 extends us0 implements my {
    final /* synthetic */ z10 $oldJob;
    int label;
    final /* synthetic */ MarqueeModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$restartAnimation$1(z10 z10Var, MarqueeModifierNode marqueeModifierNode, hm hmVar) {
        super(2, hmVar);
        this.$oldJob = z10Var;
        this.this$0 = marqueeModifierNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new MarqueeModifierNode$restartAnimation$1(this.$oldJob, this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((MarqueeModifierNode$restartAnimation$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r4 == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r5.n(r4) == r3) goto L17;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object runAnimation;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            z10 z10Var = this.$oldJob;
            if (z10Var != null) {
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    p10.Q(obj);
                    return w01.a;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        MarqueeModifierNode marqueeModifierNode = this.this$0;
        this.label = 2;
        runAnimation = marqueeModifierNode.runAnimation(this);
    }
}
