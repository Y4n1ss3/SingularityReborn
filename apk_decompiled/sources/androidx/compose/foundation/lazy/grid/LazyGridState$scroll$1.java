package androidx.compose.foundation.lazy.grid;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", l = {496, 498}, m = "scroll", v = 1)
/* loaded from: classes.dex */
public final class LazyGridState$scroll$1 extends im {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LazyGridState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridState$scroll$1(LazyGridState lazyGridState, hm hmVar) {
        super(hmVar);
        this.this$0 = lazyGridState;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.scroll(null, null, this);
    }
}
