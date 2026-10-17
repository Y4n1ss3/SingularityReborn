package androidx.compose.material.ripple;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", l = {77, 79, 80}, m = "animate", v = 1)
/* loaded from: classes.dex */
public final class RippleAnimation$animate$1 extends im {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RippleAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleAnimation$animate$1(RippleAnimation rippleAnimation, hm hmVar) {
        super(hmVar);
        this.this$0 = rippleAnimation;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.animate(this);
    }
}
