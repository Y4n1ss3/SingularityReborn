package androidx.compose.animation.core;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {354, 357}, m = "runAnimations", v = 1)
/* loaded from: classes.dex */
public final class SeekableTransitionState$runAnimations$1 extends im {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SeekableTransitionState<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$runAnimations$1(SeekableTransitionState<S> seekableTransitionState, hm hmVar) {
        super(hmVar);
        this.this$0 = seekableTransitionState;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object runAnimations;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        runAnimations = this.this$0.runAnimations(this);
        return runAnimations;
    }
}
