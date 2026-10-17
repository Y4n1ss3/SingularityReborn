package androidx.compose.foundation.pager;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import defpackage.h10;
import defpackage.iy;
import defpackage.ky;
import defpackage.na0;
import defpackage.ny;
import defpackage.un;
import defpackage.vt;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 implements LazyLayoutMeasurePolicy {

    /* renamed from: $$v$c$androidx-compose-ui-unit-Dp$-pageSpacing$0, reason: not valid java name */
    final /* synthetic */ float f53$$v$c$androidxcomposeuiunitDp$pageSpacing$0;
    final /* synthetic */ int $beyondViewportPageCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ un $coroutineScope;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ iy $itemProviderLambda;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ iy $pageCount;
    final /* synthetic */ PageSize $pageSize;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ SnapPosition $snapPosition;
    final /* synthetic */ PagerState $state;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;

    public PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(PagerState pagerState, Orientation orientation, PaddingValues paddingValues, boolean z, float f, PageSize pageSize, iy iyVar, iy iyVar2, Alignment.Vertical vertical, Alignment.Horizontal horizontal, int i, SnapPosition snapPosition, un unVar) {
        this.$state = pagerState;
        this.$orientation = orientation;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z;
        this.f53$$v$c$androidxcomposeuiunitDp$pageSpacing$0 = f;
        this.$pageSize = pageSize;
        this.$itemProviderLambda = iyVar;
        this.$pageCount = iyVar2;
        this.$verticalAlignment = vertical;
        this.$horizontalAlignment = horizontal;
        this.$beyondViewportPageCount = i;
        this.$snapPosition = snapPosition;
        this.$coroutineScope = unVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult measure_0kLqBqw$lambda$2(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j, int i, int i2, int i3, int i4, ky kyVar) {
        return lazyLayoutMeasureScope.layout(ConstraintsKt.m7581constrainWidthK40F9xA(j, i3 + i), ConstraintsKt.m7580constrainHeightK40F9xA(j, i4 + i2), vt.d, kyVar);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
    /* renamed from: measure-0kLqBqw */
    public final MeasureResult mo861measure0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
        int i;
        long m7733constructorimpl;
        ObservableScopeInvalidator.m939attachToScopeimpl(this.$state.m1011getMeasurementScopeInvalidatorzYiylxw$foundation());
        Orientation orientation = this.$orientation;
        Orientation orientation2 = Orientation.Vertical;
        boolean z = orientation == orientation2;
        CheckScrollableContainerConstraintsKt.m254checkScrollableContainerConstraintsK40F9xA(j, z ? orientation2 : Orientation.Horizontal);
        PaddingValues paddingValues = this.$contentPadding;
        int mo361roundToPx0680j_4 = z ? lazyLayoutMeasureScope.mo361roundToPx0680j_4(paddingValues.mo712calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo361roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
        PaddingValues paddingValues2 = this.$contentPadding;
        int mo361roundToPx0680j_42 = z ? lazyLayoutMeasureScope.mo361roundToPx0680j_4(paddingValues2.mo713calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo361roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
        int mo361roundToPx0680j_43 = lazyLayoutMeasureScope.mo361roundToPx0680j_4(this.$contentPadding.mo714calculateTopPaddingD9Ej5fM());
        int mo361roundToPx0680j_44 = lazyLayoutMeasureScope.mo361roundToPx0680j_4(this.$contentPadding.mo711calculateBottomPaddingD9Ej5fM());
        final int i2 = mo361roundToPx0680j_43 + mo361roundToPx0680j_44;
        int i3 = mo361roundToPx0680j_4 + mo361roundToPx0680j_42;
        int i4 = z ? i2 : i3;
        int i5 = (!z || this.$reverseLayout) ? (z && this.$reverseLayout) ? mo361roundToPx0680j_44 : (z || this.$reverseLayout) ? mo361roundToPx0680j_42 : mo361roundToPx0680j_4 : mo361roundToPx0680j_43;
        int i6 = i4 - i5;
        long m7583offsetNN6EwU = ConstraintsKt.m7583offsetNN6EwU(j, -i3, -i2);
        this.$state.setDensity$foundation(lazyLayoutMeasureScope);
        int mo361roundToPx0680j_45 = lazyLayoutMeasureScope.mo361roundToPx0680j_4(this.f53$$v$c$androidxcomposeuiunitDp$pageSpacing$0);
        int m7563getMaxHeightimpl = z ? Constraints.m7563getMaxHeightimpl(j) - i2 : Constraints.m7564getMaxWidthimpl(j) - i3;
        if (!this.$reverseLayout || m7563getMaxHeightimpl > 0) {
            i = i3;
            m7733constructorimpl = IntOffset.m7733constructorimpl((mo361roundToPx0680j_4 << 32) | (mo361roundToPx0680j_43 & 4294967295L));
        } else {
            if (!z) {
                mo361roundToPx0680j_4 += m7563getMaxHeightimpl;
            }
            if (z) {
                mo361roundToPx0680j_43 += m7563getMaxHeightimpl;
            }
            i = i3;
            m7733constructorimpl = IntOffset.m7733constructorimpl((mo361roundToPx0680j_4 << 32) | (mo361roundToPx0680j_43 & 4294967295L));
        }
        int calculateMainAxisPageSize = this.$pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScope, m7563getMaxHeightimpl, mo361roundToPx0680j_45);
        int i7 = calculateMainAxisPageSize < 0 ? 0 : calculateMainAxisPageSize;
        this.$state.m1015setPremeasureConstraintsBRTryo0$foundation(ConstraintsKt.Constraints$default(0, this.$orientation == orientation2 ? Constraints.m7564getMaxWidthimpl(m7583offsetNN6EwU) : i7, 0, this.$orientation != orientation2 ? Constraints.m7563getMaxHeightimpl(m7583offsetNN6EwU) : i7, 5, null));
        PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = (PagerLazyLayoutItemProvider) this.$itemProviderLambda.invoke();
        int i8 = m7563getMaxHeightimpl + i5 + i6;
        Snapshot.Companion companion = Snapshot.Companion;
        PagerState pagerState = this.$state;
        SnapPosition snapPosition = this.$snapPosition;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            int matchScrollPositionWithKey$foundation = pagerState.matchScrollPositionWithKey$foundation(pagerLazyLayoutItemProvider, pagerState.getCurrentPage());
            int currentPageOffset = PagerKt.currentPageOffset(snapPosition, i8, i7, mo361roundToPx0680j_45, i5, i6, pagerState.getCurrentPage(), pagerState.getCurrentPageOffsetFraction(), pagerState.getPageCount());
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            List<Integer> calculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(pagerLazyLayoutItemProvider, this.$state.getPinnedPages$foundation(), this.$state.getBeyondBoundsInfo$foundation());
            na0 na0Var = h10.a;
            final int i9 = i;
            PagerMeasureResult m1008measurePager7L1iB3k = PagerMeasureKt.m1008measurePager7L1iB3k(lazyLayoutMeasureScope, ((Number) this.$pageCount.invoke()).intValue(), pagerLazyLayoutItemProvider, m7563getMaxHeightimpl, i5, i6, mo361roundToPx0680j_45, matchScrollPositionWithKey$foundation, currentPageOffset, m7583offsetNN6EwU, this.$orientation, this.$verticalAlignment, this.$horizontalAlignment, this.$reverseLayout, m7733constructorimpl, i7, this.$beyondViewportPageCount, calculateLazyLayoutPinnedIndices, this.$snapPosition, this.$state.m1012getPlacementScopeInvalidatorzYiylxw$foundation(), this.$coroutineScope, lazyLayoutMeasureScope, new ny() { // from class: androidx.compose.foundation.pager.e
                @Override // defpackage.ny
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    MeasureResult measure_0kLqBqw$lambda$2;
                    measure_0kLqBqw$lambda$2 = PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1.measure_0kLqBqw$lambda$2(LazyLayoutMeasureScope.this, j, i9, i2, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (ky) obj3);
                    return measure_0kLqBqw$lambda$2;
                }
            }, new na0());
            PagerState.applyMeasureResult$foundation$default(this.$state, m1008measurePager7L1iB3k, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
            PagerMeasurePolicyKt.keepAroundItems(lazyLayoutMeasureScope, this.$state.getCacheWindowLogic$foundation(), m1008measurePager7L1iB3k.getVisiblePagesInfo());
            return m1008measurePager7L1iB3k;
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }
}
