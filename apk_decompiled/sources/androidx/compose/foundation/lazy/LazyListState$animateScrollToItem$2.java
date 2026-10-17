package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt;
import androidx.compose.ui.unit.Density;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2", f = "LazyListState.kt", l = {583}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class LazyListState$animateScrollToItem$2 extends us0 implements my {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LazyListState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$animateScrollToItem$2(LazyListState lazyListState, int i, int i2, hm hmVar) {
        super(2, hmVar);
        this.this$0 = lazyListState;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        LazyListState$animateScrollToItem$2 lazyListState$animateScrollToItem$2 = new LazyListState$animateScrollToItem$2(this.this$0, this.$index, this.$scrollOffset, hmVar);
        lazyListState$animateScrollToItem$2.L$0 = obj;
        return lazyListState$animateScrollToItem$2;
    }

    @Override // defpackage.my
    public final Object invoke(ScrollScope scrollScope, hm hmVar) {
        return ((LazyListState$animateScrollToItem$2) create(scrollScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            LazyLayoutScrollScope LazyLayoutScrollScope = LazyListScrollScopeKt.LazyLayoutScrollScope(this.this$0, (ScrollScope) this.L$0);
            int i2 = this.$index;
            int i3 = this.$scrollOffset;
            Density density$foundation = this.this$0.getDensity$foundation();
            this.label = 1;
            Object animateScrollToItem = LazyLayoutScrollScopeKt.animateScrollToItem(LazyLayoutScrollScope, i2, i3, 100, density$foundation, this);
            vn vnVar = vn.d;
            if (animateScrollToItem == vnVar) {
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
