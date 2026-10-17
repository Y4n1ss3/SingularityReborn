package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ScrollState;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.ScrollableTabData$onLaidOut$1$1", f = "TabRow.kt", l = {1156}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollableTabData$onLaidOut$1$1 extends us0 implements my {
    final /* synthetic */ int $calculatedOffset;
    int label;
    final /* synthetic */ ScrollableTabData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableTabData$onLaidOut$1$1(ScrollableTabData scrollableTabData, int i, hm hmVar) {
        super(2, hmVar);
        this.this$0 = scrollableTabData;
        this.$calculatedOffset = i;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ScrollableTabData$onLaidOut$1$1(this.this$0, this.$calculatedOffset, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((ScrollableTabData$onLaidOut$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        ScrollState scrollState;
        FiniteAnimationSpec finiteAnimationSpec;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            scrollState = this.this$0.scrollState;
            int i2 = this.$calculatedOffset;
            finiteAnimationSpec = this.this$0.animationSpec;
            this.label = 1;
            Object animateScrollTo = scrollState.animateScrollTo(i2, finiteAnimationSpec, this);
            vn vnVar = vn.d;
            if (animateScrollTo == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
