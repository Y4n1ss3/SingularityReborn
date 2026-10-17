package androidx.compose.foundation.lazy.staggeredgrid;

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
@bq(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$animateScrollToItem$2", f = "LazyStaggeredGridState.kt", l = {392}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class LazyStaggeredGridState$animateScrollToItem$2 extends us0 implements my {
    final /* synthetic */ int $index;
    final /* synthetic */ LazyStaggeredGridMeasureResult $layoutInfo;
    final /* synthetic */ int $numOfItemsToTeleport;
    final /* synthetic */ int $scrollOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LazyStaggeredGridState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$animateScrollToItem$2(LazyStaggeredGridState lazyStaggeredGridState, int i, int i2, int i3, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, hm hmVar) {
        super(2, hmVar);
        this.this$0 = lazyStaggeredGridState;
        this.$index = i;
        this.$scrollOffset = i2;
        this.$numOfItemsToTeleport = i3;
        this.$layoutInfo = lazyStaggeredGridMeasureResult;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        LazyStaggeredGridState$animateScrollToItem$2 lazyStaggeredGridState$animateScrollToItem$2 = new LazyStaggeredGridState$animateScrollToItem$2(this.this$0, this.$index, this.$scrollOffset, this.$numOfItemsToTeleport, this.$layoutInfo, hmVar);
        lazyStaggeredGridState$animateScrollToItem$2.L$0 = obj;
        return lazyStaggeredGridState$animateScrollToItem$2;
    }

    @Override // defpackage.my
    public final Object invoke(ScrollScope scrollScope, hm hmVar) {
        return ((LazyStaggeredGridState$animateScrollToItem$2) create(scrollScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            LazyLayoutScrollScope LazyLayoutScrollScope = LazyStaggeredGridScrollScopeKt.LazyLayoutScrollScope(this.this$0, (ScrollScope) this.L$0);
            int i2 = this.$index;
            int i3 = this.$scrollOffset;
            int i4 = this.$numOfItemsToTeleport;
            Density density = this.$layoutInfo.getDensity();
            this.label = 1;
            Object animateScrollToItem = LazyLayoutScrollScopeKt.animateScrollToItem(LazyLayoutScrollScope, i2, i3, i4, density, this);
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
