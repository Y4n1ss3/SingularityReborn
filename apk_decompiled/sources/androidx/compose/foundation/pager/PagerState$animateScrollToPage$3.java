package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {672}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class PagerState$animateScrollToPage$3 extends us0 implements my {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ int $targetPage;
    final /* synthetic */ float $targetPageOffsetToSnappedPosition;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$3(PagerState pagerState, int i, float f, AnimationSpec<Float> animationSpec, hm hmVar) {
        super(2, hmVar);
        this.this$0 = pagerState;
        this.$targetPage = i;
        this.$targetPageOffsetToSnappedPosition = f;
        this.$animationSpec = animationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(PagerState pagerState, ScrollScope scrollScope, int i) {
        pagerState.updateTargetPage(scrollScope, i);
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(this.this$0, this.$targetPage, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, hmVar);
        pagerState$animateScrollToPage$3.L$0 = obj;
        return pagerState$animateScrollToPage$3;
    }

    @Override // defpackage.my
    public final Object invoke(ScrollScope scrollScope, hm hmVar) {
        return ((PagerState$animateScrollToPage$3) create(scrollScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object animateScrollToPage;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            LazyLayoutScrollScope LazyLayoutScrollScope = PagerScrollScopeKt.LazyLayoutScrollScope(this.this$0, (ScrollScope) this.L$0);
            int i2 = this.$targetPage;
            float f = this.$targetPageOffsetToSnappedPosition;
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            final PagerState pagerState = this.this$0;
            my myVar = new my() { // from class: androidx.compose.foundation.pager.f
                @Override // defpackage.my
                public final Object invoke(Object obj2, Object obj3) {
                    w01 invokeSuspend$lambda$0;
                    int intValue = ((Integer) obj3).intValue();
                    invokeSuspend$lambda$0 = PagerState$animateScrollToPage$3.invokeSuspend$lambda$0(PagerState.this, (ScrollScope) obj2, intValue);
                    return invokeSuspend$lambda$0;
                }
            };
            this.label = 1;
            animateScrollToPage = PagerStateKt.animateScrollToPage(LazyLayoutScrollScope, i2, f, animationSpec, myVar, this);
            vn vnVar = vn.d;
            if (animateScrollToPage == vnVar) {
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
