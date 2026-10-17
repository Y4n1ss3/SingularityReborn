package androidx.compose.runtime;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.runtime.ProduceStateScopeImpl", f = "ProduceState.kt", l = {208}, m = "awaitDispose", v = 1)
/* loaded from: classes.dex */
public final class ProduceStateScopeImpl$awaitDispose$1 extends im {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProduceStateScopeImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProduceStateScopeImpl$awaitDispose$1(ProduceStateScopeImpl<T> produceStateScopeImpl, hm hmVar) {
        super(hmVar);
        this.this$0 = produceStateScopeImpl;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitDispose(null, this);
    }
}
