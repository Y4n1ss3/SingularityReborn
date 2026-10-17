package androidx.compose.foundation.gestures;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {100, 151}, m = "animateToZero", v = 1)
/* loaded from: classes.dex */
public final class UpdatableAnimationState$animateToZero$1 extends im {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$1(UpdatableAnimationState updatableAnimationState, hm hmVar) {
        super(hmVar);
        this.this$0 = updatableAnimationState;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.animateToZero(null, null, this);
    }
}
