package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollScope;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class LazyListState$scrollToItem$2 extends us0 implements my {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    int label;
    final /* synthetic */ LazyListState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$scrollToItem$2(LazyListState lazyListState, int i, int i2, hm hmVar) {
        super(2, hmVar);
        this.this$0 = lazyListState;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new LazyListState$scrollToItem$2(this.this$0, this.$index, this.$scrollOffset, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(ScrollScope scrollScope, hm hmVar) {
        return ((LazyListState$scrollToItem$2) create(scrollScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        this.this$0.snapToItemIndexInternal$foundation(this.$index, this.$scrollOffset, true);
        return w01.a;
    }
}
