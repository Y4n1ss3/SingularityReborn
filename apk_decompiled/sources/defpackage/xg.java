package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.carousel.CarouselStateKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class xg implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ gi0 e;
    public final /* synthetic */ LazyLayoutScrollScope f;

    public /* synthetic */ xg(gi0 gi0Var, LazyLayoutScrollScope lazyLayoutScrollScope, int i) {
        this.d = i;
        this.e = gi0Var;
        this.f = lazyLayoutScrollScope;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 animateScrollToPage$lambda$3;
        w01 animateScrollToPage$lambda$2;
        int i = this.d;
        LazyLayoutScrollScope lazyLayoutScrollScope = this.f;
        gi0 gi0Var = this.e;
        float floatValue = ((Float) obj).floatValue();
        float floatValue2 = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                animateScrollToPage$lambda$3 = CarouselStateKt.animateScrollToPage$lambda$3(gi0Var, lazyLayoutScrollScope, floatValue, floatValue2);
                return animateScrollToPage$lambda$3;
            default:
                animateScrollToPage$lambda$2 = PagerStateKt.animateScrollToPage$lambda$2(gi0Var, lazyLayoutScrollScope, floatValue, floatValue2);
                return animateScrollToPage$lambda$2;
        }
    }
}
