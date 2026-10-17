package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ScrollingLogic2D", f = "Scrollable2D.kt", l = {434}, m = "doFlingAnimation-QWom1Mo", v = 1)
/* loaded from: classes.dex */
public final class ScrollingLogic2D$doFlingAnimation$1 extends im {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollingLogic2D this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic2D$doFlingAnimation$1(ScrollingLogic2D scrollingLogic2D, hm hmVar) {
        super(hmVar);
        this.this$0 = scrollingLogic2D;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo522doFlingAnimationQWom1Mo(0L, this);
    }
}
