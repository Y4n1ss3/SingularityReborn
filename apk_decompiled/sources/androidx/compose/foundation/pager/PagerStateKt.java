package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.gi0;
import defpackage.hm;
import defpackage.iy;
import defpackage.my;
import defpackage.p10;
import defpackage.st;
import defpackage.ut;
import defpackage.vn;
import defpackage.vt;
import defpackage.w01;
import defpackage.xg;
import defpackage.y80;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PagerStateKt {
    private static final float DefaultPositionThreshold = Dp.m7611constructorimpl(56.0f);
    private static final PagerMeasureResult EmptyLayoutInfo;
    private static final int MaxPagesForAnimateScroll = 3;
    public static final int PagesToPrefetch = 1;
    private static final PagerStateKt$UnitDensity$1 UnitDensity;

    /* JADX WARN: Type inference failed for: r22v0, types: [androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1, androidx.compose.ui.unit.Density] */
    static {
        ?? r22 = new Density() { // from class: androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1
            private final float density = 1.0f;
            private final float fontScale = 1.0f;

            @Override // androidx.compose.ui.unit.Density
            public float getDensity() {
                return this.density;
            }

            @Override // androidx.compose.ui.unit.FontScaling
            public float getFontScale() {
                return this.fontScale;
            }
        };
        UnitDensity = r22;
        EmptyLayoutInfo = new PagerMeasureResult(ut.d, 0, 0, 0, Orientation.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, SnapPosition.Start.INSTANCE, new MeasureResult() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1
            private final Map<AlignmentLine, Integer> alignmentLines = vt.d;
            private final int height;
            private final int width;

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
            }
        }, false, null, null, p10.a(st.d), r22, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), 393216, null);
    }

    public static final PagerState PagerState(int i, float f, iy iyVar) {
        return new DefaultPagerState(i, f, iyVar);
    }

    public static /* synthetic */ PagerState PagerState$default(int i, float f, iy iyVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return PagerState(i, f, iyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateScrollToPage(LazyLayoutScrollScope lazyLayoutScrollScope, int i, float f, AnimationSpec<Float> animationSpec, my myVar, hm hmVar) {
        int i2;
        myVar.invoke(lazyLayoutScrollScope, new Integer(i));
        int i3 = 1;
        boolean z = i > lazyLayoutScrollScope.getFirstVisibleItemIndex();
        int lastVisibleItemIndex = (lazyLayoutScrollScope.getLastVisibleItemIndex() - lazyLayoutScrollScope.getFirstVisibleItemIndex()) + 1;
        if (((z && i > lazyLayoutScrollScope.getLastVisibleItemIndex()) || (!z && i < lazyLayoutScrollScope.getFirstVisibleItemIndex())) && Math.abs(i - lazyLayoutScrollScope.getFirstVisibleItemIndex()) >= 3) {
            if (z) {
                int firstVisibleItemIndex = i2;
                lazyLayoutScrollScope.snapToItem(firstVisibleItemIndex, 0);
            } else {
                int firstVisibleItemIndex2 = i2;
                lazyLayoutScrollScope.snapToItem(firstVisibleItemIndex2, 0);
            }
        }
        Object animate$default = SuspendAnimationKt.animate$default(0.0f, LazyLayoutScrollScope.calculateDistanceTo$default(lazyLayoutScrollScope, i, 0, 2, null) + f, 0.0f, animationSpec, new xg(new gi0(), lazyLayoutScrollScope, i3), hmVar, 4, null);
        return animate$default == vn.d ? animate$default : w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animateScrollToPage$lambda$2(gi0 gi0Var, LazyLayoutScrollScope lazyLayoutScrollScope, float f, float f2) {
        gi0Var.d += lazyLayoutScrollScope.scrollBy(f - gi0Var.d);
        return w01.a;
    }

    public static final Object animateToNextPage(PagerState pagerState, hm hmVar) {
        Object animateScrollToPage$default;
        return (pagerState.getCurrentPage() + 1 >= pagerState.getPageCount() || (animateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + 1, 0.0f, null, hmVar, 6, null)) != vn.d) ? w01.a : animateScrollToPage$default;
    }

    public static final Object animateToPreviousPage(PagerState pagerState, hm hmVar) {
        Object animateScrollToPage$default;
        return (pagerState.getCurrentPage() + (-1) < 0 || (animateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + (-1), 0.0f, null, hmVar, 6, null)) != vn.d) ? w01.a : animateScrollToPage$default;
    }

    public static final long calculateNewMaxScrollOffset(PagerLayoutInfo pagerLayoutInfo, int i) {
        long pageSize = (((i * (pagerLayoutInfo.getPageSize() + pagerLayoutInfo.getPageSpacing())) + pagerLayoutInfo.getBeforeContentPadding()) + pagerLayoutInfo.getAfterContentPadding()) - pagerLayoutInfo.getPageSpacing();
        int mo1006getViewportSizeYbymL2g = (int) (pagerLayoutInfo.getOrientation() == Orientation.Horizontal ? pagerLayoutInfo.mo1006getViewportSizeYbymL2g() >> 32 : pagerLayoutInfo.mo1006getViewportSizeYbymL2g() & 4294967295L);
        long h = pageSize - (mo1006getViewportSizeYbymL2g - y80.h(pagerLayoutInfo.getSnapPosition().position(mo1006getViewportSizeYbymL2g, pagerLayoutInfo.getPageSize(), pagerLayoutInfo.getBeforeContentPadding(), pagerLayoutInfo.getAfterContentPadding(), i - 1, i), 0, mo1006getViewportSizeYbymL2g));
        if (h < 0) {
            return 0L;
        }
        return h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long calculateNewMinScrollOffset(PagerMeasureResult pagerMeasureResult, int i) {
        int mo1006getViewportSizeYbymL2g = (int) (pagerMeasureResult.getOrientation() == Orientation.Horizontal ? pagerMeasureResult.mo1006getViewportSizeYbymL2g() >> 32 : pagerMeasureResult.mo1006getViewportSizeYbymL2g() & 4294967295L);
        return y80.h(pagerMeasureResult.getSnapPosition().position(mo1006getViewportSizeYbymL2g, pagerMeasureResult.getPageSize(), pagerMeasureResult.getBeforeContentPadding(), pagerMeasureResult.getAfterContentPadding(), 0, i), 0, mo1006getViewportSizeYbymL2g);
    }

    public static final float getDefaultPositionThreshold() {
        return DefaultPositionThreshold;
    }

    public static final PagerMeasureResult getEmptyLayoutInfo() {
        return EmptyLayoutInfo;
    }

    public static final PagerState rememberPagerState(final int i, final float f, final iy iyVar, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            f = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1210768637, i2, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:93)");
        }
        Object[] objArr = new Object[0];
        Saver<DefaultPagerState, ?> saver = DefaultPagerState.Companion.getSaver();
        boolean z = true;
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && composer.changed(i)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(f)) || (i2 & 48) == 32);
        if ((((i2 & 896) ^ 384) <= 256 || !composer.changed(iyVar)) && (i2 & 384) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new iy() { // from class: ve0
                @Override // defpackage.iy
                public final Object invoke() {
                    DefaultPagerState rememberPagerState$lambda$0$0;
                    rememberPagerState$lambda$0$0 = PagerStateKt.rememberPagerState$lambda$0$0(i, f, iyVar);
                    return rememberPagerState$lambda$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        DefaultPagerState defaultPagerState = (DefaultPagerState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) saver, (iy) rememberedValue, composer, 0);
        defaultPagerState.getPageCountState().setValue(iyVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultPagerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultPagerState rememberPagerState$lambda$0$0(int i, float f, iy iyVar) {
        return new DefaultPagerState(i, f, iyVar);
    }

    private static final void debugLog(iy iyVar) {
    }
}
