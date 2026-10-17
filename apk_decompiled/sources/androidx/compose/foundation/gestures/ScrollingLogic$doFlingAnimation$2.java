package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import defpackage.bq;
import defpackage.hm;
import defpackage.ii0;
import defpackage.iy;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {890}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ScrollingLogic$doFlingAnimation$2 extends us0 implements my {

    /* renamed from: $$v$c$androidx-compose-ui-unit-Velocity$-available$0, reason: not valid java name */
    final /* synthetic */ long f16$$v$c$androidxcomposeuiunitVelocity$available$0;
    final /* synthetic */ ii0 $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, ii0 ii0Var, long j, hm hmVar) {
        super(2, hmVar);
        this.this$0 = scrollingLogic;
        this.$result = ii0Var;
        this.f16$$v$c$androidxcomposeuiunitVelocity$available$0 = j;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.f16$$v$c$androidxcomposeuiunitVelocity$available$0, hmVar);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // defpackage.my
    public final Object invoke(NestedScrollScope nestedScrollScope, hm hmVar) {
        return ((ScrollingLogic$doFlingAnimation$2) create(nestedScrollScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        ii0 ii0Var;
        FlingBehavior flingBehavior;
        float m544toFloatTH1AsA0;
        ScrollingLogic scrollingLogic2;
        long j;
        long m545updateQWom1Mo;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            final ScrollingLogic scrollingLogic3 = this.this$0;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float f) {
                    iy iyVar;
                    if (Math.abs(f) != 0.0f) {
                        iyVar = ScrollingLogic.this.isScrollableNodeAttached;
                        if (!((Boolean) iyVar.invoke()).booleanValue()) {
                            throw new FlingCancellationException();
                        }
                    }
                    ScrollingLogic scrollingLogic4 = ScrollingLogic.this;
                    return scrollingLogic4.reverseIfNeeded(scrollingLogic4.m549toFloatk4lQ0M(nestedScrollScope.mo492scrollByWithOverscrollOzD1aCk(scrollingLogic4.m547reverseIfNeededMKHz9U(scrollingLogic4.m550toOffsettuRUvjQ(f)), NestedScrollSource.Companion.m5968getSideEffectWNlRxjI())));
                }
            };
            scrollingLogic = this.this$0;
            ii0Var = this.$result;
            long j2 = this.f16$$v$c$androidxcomposeuiunitVelocity$available$0;
            flingBehavior = scrollingLogic.flingBehavior;
            long j3 = ii0Var.d;
            m544toFloatTH1AsA0 = scrollingLogic.m544toFloatTH1AsA0(j2);
            float reverseIfNeeded = scrollingLogic.reverseIfNeeded(m544toFloatTH1AsA0);
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = ii0Var;
            this.J$0 = j3;
            this.label = 1;
            obj = flingBehavior.performFling(scrollScope, reverseIfNeeded, this);
            vn vnVar = vn.d;
            if (obj == vnVar) {
                return vnVar;
            }
            scrollingLogic2 = scrollingLogic;
            j = j3;
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            ii0Var = (ii0) this.L$2;
            scrollingLogic = (ScrollingLogic) this.L$1;
            scrollingLogic2 = (ScrollingLogic) this.L$0;
            p10.Q(obj);
        }
        m545updateQWom1Mo = scrollingLogic.m545updateQWom1Mo(j, scrollingLogic2.reverseIfNeeded(((Number) obj).floatValue()));
        ii0Var.d = m545updateQWom1Mo;
        return w01.a;
    }
}
