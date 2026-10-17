package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
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
@bq(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1", f = "LazyLayoutScrollDeltaBetweenPasses.kt", l = {79}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1 extends us0 implements my {
    int label;
    final /* synthetic */ LazyLayoutScrollDeltaBetweenPasses this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(LazyLayoutScrollDeltaBetweenPasses lazyLayoutScrollDeltaBetweenPasses, hm hmVar) {
        super(2, hmVar);
        this.this$0 = lazyLayoutScrollDeltaBetweenPasses;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        AnimationState animationState;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            animationState = this.this$0._scrollDeltaBetweenPasses;
            Float f = new Float(0.0f);
            SpringSpec spring$default = AnimationSpecKt.spring$default(0.0f, 400.0f, new Float(0.5f), 1, null);
            this.label = 1;
            Object animateTo$default = SuspendAnimationKt.animateTo$default(animationState, f, spring$default, true, null, this, 8, null);
            vn vnVar = vn.d;
            if (animateTo$default == vnVar) {
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
