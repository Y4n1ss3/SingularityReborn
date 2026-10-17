package androidx.compose.material3.carousel;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import defpackage.dq;
import defpackage.ed;
import defpackage.hm;
import defpackage.iy;
import defpackage.my;
import defpackage.o8;
import defpackage.vn;
import defpackage.w01;
import defpackage.w4;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CarouselState implements ScrollableState {
    private CarouselPagerState pagerState;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Saver<CarouselState, ?> Saver = ListSaverKt.listSaver(new w4(7), new ed(15));

    public /* synthetic */ CarouselState(int i, float f, iy iyVar, int i2, dq dqVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f, iyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Saver$lambda$1(SaverScope saverScope, CarouselState carouselState) {
        return y80.E(Integer.valueOf(carouselState.pagerState.getCurrentPage()), Float.valueOf(carouselState.pagerState.getCurrentPageOffsetFraction()), Integer.valueOf(carouselState.pagerState.getPageCount()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CarouselState Saver$lambda$3(List list) {
        Object obj = list.get(0);
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        obj2.getClass();
        return new CarouselState(intValue, ((Float) obj2).floatValue(), new o8(list, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Saver$lambda$3$lambda$2(List list) {
        Object obj = list.get(2);
        obj.getClass();
        return ((Integer) obj).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToItem$default(CarouselState carouselState, int i, AnimationSpec animationSpec, hm hmVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return carouselState.animateScrollToItem(i, animationSpec, hmVar);
    }

    public final Object animateScrollToItem(int i, AnimationSpec<Float> animationSpec, hm hmVar) {
        CarouselPagerState carouselPagerState = this.pagerState;
        int currentPage = carouselPagerState.getCurrentPage();
        w01 w01Var = w01.a;
        if ((i == currentPage && carouselPagerState.getCurrentPageOffsetFraction() == 0.0f) || carouselPagerState.getPageCount() == 0) {
            return w01Var;
        }
        Object scroll$default = ScrollableState.scroll$default(carouselPagerState, null, new CarouselState$animateScrollToItem$2$1(carouselPagerState, carouselPagerState.getPageCount() > 0 ? y80.h(i, 0, carouselPagerState.getPageCount() - 1) : 0, animationSpec, null), hmVar, 1, null);
        return scroll$default == vn.d ? scroll$default : w01Var;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.pagerState.dispatchRawDelta(f);
    }

    public final int getCurrentItem() {
        return this.pagerState.getCurrentPage();
    }

    public final CarouselPagerState getPagerState$material3() {
        return this.pagerState;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.pagerState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, my myVar, hm hmVar) {
        Object scroll = this.pagerState.scroll(mutatePriority, myVar, hmVar);
        return scroll == vn.d ? scroll : w01.a;
    }

    public final Object scrollToItem(int i, hm hmVar) {
        Object scrollToPage = this.pagerState.scrollToPage(i, 0.0f, hmVar);
        return scrollToPage == vn.d ? scrollToPage : w01.a;
    }

    public final void setPagerState$material3(CarouselPagerState carouselPagerState) {
        this.pagerState = carouselPagerState;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Saver<CarouselState, ?> getSaver() {
            return CarouselState.Saver;
        }

        private Companion() {
        }
    }

    public CarouselState(int i, float f, iy iyVar) {
        this.pagerState = new CarouselPagerState(i, f, iyVar);
    }
}
