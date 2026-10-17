package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
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
@bq(c = "androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$2", f = "Scrollable2D.kt", l = {456}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ScrollingLogic2D$doFlingAnimation$2 extends us0 implements my {

    /* renamed from: $$v$c$androidx-compose-ui-unit-Velocity$-available$0, reason: not valid java name */
    final /* synthetic */ long f17$$v$c$androidxcomposeuiunitVelocity$available$0;
    final /* synthetic */ ii0 $result;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScrollingLogic2D this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic2D$doFlingAnimation$2(ScrollingLogic2D scrollingLogic2D, long j, ii0 ii0Var, hm hmVar) {
        super(2, hmVar);
        this.this$0 = scrollingLogic2D;
        this.f17$$v$c$androidxcomposeuiunitVelocity$available$0 = j;
        this.$result = ii0Var;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        ScrollingLogic2D$doFlingAnimation$2 scrollingLogic2D$doFlingAnimation$2 = new ScrollingLogic2D$doFlingAnimation$2(this.this$0, this.f17$$v$c$androidxcomposeuiunitVelocity$available$0, this.$result, hmVar);
        scrollingLogic2D$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic2D$doFlingAnimation$2;
    }

    @Override // defpackage.my
    public final Object invoke(NestedScrollScope nestedScrollScope, hm hmVar) {
        return ((ScrollingLogic2D$doFlingAnimation$2) create(nestedScrollScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        FlingBehavior flingBehavior;
        float m528getMagnitudeTH1AsA0;
        long j;
        ii0 ii0Var;
        long doFlingAnimation_QWom1Mo$toDecomposedVelocity;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            final ScrollingLogic2D scrollingLogic2D = this.this$0;
            final long j2 = this.f17$$v$c$androidxcomposeuiunitVelocity$available$0;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$2$flingScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float f) {
                    long doFlingAnimation_QWom1Mo$toDecomposedOffset;
                    float doFlingAnimation_QWom1Mo$toMagnitudeFloat;
                    iy iyVar;
                    doFlingAnimation_QWom1Mo$toDecomposedOffset = ScrollingLogic2D.doFlingAnimation_QWom1Mo$toDecomposedOffset(f, j2);
                    if (!Offset.m4513equalsimpl0(doFlingAnimation_QWom1Mo$toDecomposedOffset, Offset.Companion.m4532getZeroF1C5BW0())) {
                        iyVar = ScrollingLogic2D.this.isScrollableNodeAttached;
                        if (!((Boolean) iyVar.invoke()).booleanValue()) {
                            throw new FlingCancellationException();
                        }
                    }
                    doFlingAnimation_QWom1Mo$toMagnitudeFloat = ScrollingLogic2D.doFlingAnimation_QWom1Mo$toMagnitudeFloat(nestedScrollScope.mo492scrollByWithOverscrollOzD1aCk(doFlingAnimation_QWom1Mo$toDecomposedOffset, NestedScrollSource.Companion.m5968getSideEffectWNlRxjI()));
                    return doFlingAnimation_QWom1Mo$toMagnitudeFloat;
                }
            };
            ScrollingLogic2D scrollingLogic2D2 = this.this$0;
            long j3 = this.f17$$v$c$androidxcomposeuiunitVelocity$available$0;
            ii0 ii0Var2 = this.$result;
            flingBehavior = scrollingLogic2D2.flingBehavior;
            m528getMagnitudeTH1AsA0 = Scrollable2DKt.m528getMagnitudeTH1AsA0(j3);
            this.L$0 = ii0Var2;
            this.J$0 = j3;
            this.label = 1;
            obj = flingBehavior.performFling(scrollScope, m528getMagnitudeTH1AsA0, this);
            vn vnVar = vn.d;
            if (obj == vnVar) {
                return vnVar;
            }
            j = j3;
            ii0Var = ii0Var2;
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            ii0Var = (ii0) this.L$0;
            p10.Q(obj);
        }
        doFlingAnimation_QWom1Mo$toDecomposedVelocity = ScrollingLogic2D.doFlingAnimation_QWom1Mo$toDecomposedVelocity(((Number) obj).floatValue(), j);
        ii0Var.d = doFlingAnimation_QWom1Mo$toDecomposedVelocity;
        return w01.a;
    }
}
