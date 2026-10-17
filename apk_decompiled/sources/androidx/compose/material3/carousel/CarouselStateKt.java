package androidx.compose.material3.carousel;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import defpackage.gi0;
import defpackage.hm;
import defpackage.iy;
import defpackage.my;
import defpackage.vn;
import defpackage.w01;
import defpackage.wg;
import defpackage.xg;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CarouselStateKt {
    public static final float MaxPageOffset = 0.5f;
    private static final int MaxPagesForAnimateScroll = 3;
    public static final float MinPageOffset = -0.5f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateScrollToPage(LazyLayoutScrollScope lazyLayoutScrollScope, PagerState pagerState, int i, float f, AnimationSpec<Float> animationSpec, my myVar, hm hmVar) {
        int firstVisibleItemIndex;
        myVar.invoke(lazyLayoutScrollScope, new Integer(i));
        int i2 = 0;
        boolean z = i > lazyLayoutScrollScope.getFirstVisibleItemIndex();
        int lastVisibleItemIndex = (lazyLayoutScrollScope.getLastVisibleItemIndex() - lazyLayoutScrollScope.getFirstVisibleItemIndex()) + 1;
        if (((z && i > lazyLayoutScrollScope.getLastVisibleItemIndex()) || (!z && i < lazyLayoutScrollScope.getFirstVisibleItemIndex())) && Math.abs(i - lazyLayoutScrollScope.getFirstVisibleItemIndex()) >= 3) {
            if (z) {
                firstVisibleItemIndex = i - lastVisibleItemIndex;
                int firstVisibleItemIndex2 = lazyLayoutScrollScope.getFirstVisibleItemIndex();
                if (firstVisibleItemIndex < firstVisibleItemIndex2) {
                    firstVisibleItemIndex = firstVisibleItemIndex2;
                }
            } else {
                int i3 = lastVisibleItemIndex + i;
                firstVisibleItemIndex = lazyLayoutScrollScope.getFirstVisibleItemIndex();
                if (i3 <= firstVisibleItemIndex) {
                    firstVisibleItemIndex = i3;
                }
            }
            lazyLayoutScrollScope.snapToItem(firstVisibleItemIndex, 0);
        }
        Object animate$default = SuspendAnimationKt.animate$default(0.0f, calculateScrollDistanceTo(pagerState, pagerState.getCurrentPage(), i) + f, 0.0f, animationSpec, new xg(new gi0(), lazyLayoutScrollScope, i2), hmVar, 4, null);
        return animate$default == vn.d ? animate$default : w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animateScrollToPage$lambda$3(gi0 gi0Var, LazyLayoutScrollScope lazyLayoutScrollScope, float f, float f2) {
        gi0Var.d += lazyLayoutScrollScope.scrollBy(f - gi0Var.d);
        return w01.a;
    }

    private static final float calculateScrollDistanceTo(PagerState pagerState, int i, int i2) {
        int mo1006getViewportSizeYbymL2g = (int) (pagerState.getLayoutInfo().getOrientation() == Orientation.Horizontal ? pagerState.getLayoutInfo().mo1006getViewportSizeYbymL2g() >> 32 : pagerState.getLayoutInfo().mo1006getViewportSizeYbymL2g() & 4294967295L);
        return ((i2 - i) * (pagerState.getLayoutInfo().getPageSize() + pagerState.getLayoutInfo().getPageSpacing())) + (pagerState.getLayoutInfo().getSnapPosition().position(mo1006getViewportSizeYbymL2g, pagerState.getLayoutInfo().getPageSize(), pagerState.getLayoutInfo().getBeforeContentPadding(), pagerState.getLayoutInfo().getAfterContentPadding(), i, pagerState.getPageCount()) - pagerState.getLayoutInfo().getSnapPosition().position(mo1006getViewportSizeYbymL2g, pagerState.getLayoutInfo().getPageSize(), pagerState.getLayoutInfo().getBeforeContentPadding(), pagerState.getLayoutInfo().getAfterContentPadding(), i2, pagerState.getPageCount()));
    }

    public static final CarouselState rememberCarouselState(int i, iy iyVar, Composer composer, int i2, int i3) {
        boolean z = true;
        int i4 = 0;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-217285684, i2, -1, "androidx.compose.material3.carousel.rememberCarouselState (CarouselState.kt:151)");
        }
        Object[] objArr = new Object[0];
        Saver<CarouselState, ?> saver = CarouselState.Companion.getSaver();
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composer.changed(i)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) <= 32 || !composer.changed(iyVar)) && (i2 & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new wg(i, iyVar, i4);
            composer.updateRememberedValue(rememberedValue);
        }
        CarouselState carouselState = (CarouselState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) saver, (iy) rememberedValue, composer, 0);
        carouselState.getPagerState$material3().getPageCountState().setValue(iyVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return carouselState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CarouselState rememberCarouselState$lambda$1$lambda$0(int i, iy iyVar) {
        return new CarouselState(i, 0.0f, iyVar);
    }
}
