package androidx.compose.material3.carousel;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.pager.PagerScrollScopeKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.carousel.CarouselState$animateScrollToItem$2$1", f = "CarouselState.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CarouselState$animateScrollToItem$2$1 extends us0 implements my {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ int $targetPage;
    final /* synthetic */ CarouselPagerState $this_with;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselState$animateScrollToItem$2$1(CarouselPagerState carouselPagerState, int i, AnimationSpec<Float> animationSpec, hm hmVar) {
        super(2, hmVar);
        this.$this_with = carouselPagerState;
        this.$targetPage = i;
        this.$animationSpec = animationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(CarouselPagerState carouselPagerState, ScrollScope scrollScope, int i) {
        carouselPagerState.updateTargetPage(scrollScope, i);
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        CarouselState$animateScrollToItem$2$1 carouselState$animateScrollToItem$2$1 = new CarouselState$animateScrollToItem$2$1(this.$this_with, this.$targetPage, this.$animationSpec, hmVar);
        carouselState$animateScrollToItem$2$1.L$0 = obj;
        return carouselState$animateScrollToItem$2$1;
    }

    @Override // defpackage.my
    public final Object invoke(ScrollScope scrollScope, hm hmVar) {
        return ((CarouselState$animateScrollToItem$2$1) create(scrollScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object animateScrollToPage;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            LazyLayoutScrollScope LazyLayoutScrollScope = PagerScrollScopeKt.LazyLayoutScrollScope(this.$this_with, (ScrollScope) this.L$0);
            final CarouselPagerState carouselPagerState = this.$this_with;
            int i2 = this.$targetPage;
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            my myVar = new my() { // from class: androidx.compose.material3.carousel.b
                @Override // defpackage.my
                public final Object invoke(Object obj2, Object obj3) {
                    w01 invokeSuspend$lambda$0;
                    int intValue = ((Integer) obj3).intValue();
                    invokeSuspend$lambda$0 = CarouselState$animateScrollToItem$2$1.invokeSuspend$lambda$0(CarouselPagerState.this, (ScrollScope) obj2, intValue);
                    return invokeSuspend$lambda$0;
                }
            };
            this.label = 1;
            animateScrollToPage = CarouselStateKt.animateScrollToPage(LazyLayoutScrollScope, carouselPagerState, i2, 0.0f, animationSpec, myVar, this);
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
