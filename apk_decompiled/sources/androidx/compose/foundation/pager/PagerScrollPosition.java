package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PagerScrollPosition {
    public static final int $stable = 8;
    private final MutableIntState currentPage$delegate;
    private final MutableFloatState currentPageOffsetFraction$delegate;
    private boolean hadFirstNotEmptyLayout;
    private Object lastKnownCurrentPageKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final PagerState state;

    public PagerScrollPosition(int i, float f, PagerState pagerState) {
        this.state = pagerState;
        this.currentPage$delegate = SnapshotIntStateKt.mutableIntStateOf(i);
        this.currentPageOffsetFraction$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i, 30, 100);
    }

    private final void setCurrentPage(int i) {
        this.currentPage$delegate.setIntValue(i);
    }

    private final void setCurrentPageOffsetFraction(float f) {
        this.currentPageOffsetFraction$delegate.setFloatValue(f);
    }

    private final void update(int i, float f) {
        setCurrentPage(i);
        this.nearestRangeState.update(i);
        setCurrentPageOffsetFraction(f);
    }

    public final void applyScrollDelta(int i) {
        setCurrentPageOffsetFraction(getCurrentPageOffsetFraction() + (this.state.getPageSizeWithSpacing$foundation() == 0 ? 0.0f : i / this.state.getPageSizeWithSpacing$foundation()));
    }

    public final int getCurrentPage() {
        return this.currentPage$delegate.getIntValue();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction$delegate.getFloatValue();
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final PagerState getState() {
        return this.state;
    }

    public final int matchPageWithKey(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i) {
        int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(pagerLazyLayoutItemProvider, this.lastKnownCurrentPageKey, i);
        if (i != findIndexByKey) {
            setCurrentPage(findIndexByKey);
            this.nearestRangeState.update(i);
        }
        return findIndexByKey;
    }

    public final void requestPositionAndForgetLastKnownKey(int i, float f) {
        update(i, f);
        this.lastKnownCurrentPageKey = null;
    }

    public final void updateCurrentPageOffsetFraction(float f) {
        setCurrentPageOffsetFraction(f);
    }

    public final void updateFromMeasureResult(PagerMeasureResult pagerMeasureResult) {
        MeasuredPage currentPage = pagerMeasureResult.getCurrentPage();
        this.lastKnownCurrentPageKey = currentPage != null ? currentPage.getKey() : null;
        if (this.hadFirstNotEmptyLayout || !pagerMeasureResult.getVisiblePagesInfo().isEmpty()) {
            this.hadFirstNotEmptyLayout = true;
            MeasuredPage currentPage2 = pagerMeasureResult.getCurrentPage();
            update(currentPage2 != null ? currentPage2.getIndex() : 0, pagerMeasureResult.getCurrentPageOffsetFraction());
        }
    }

    public /* synthetic */ PagerScrollPosition(int i, float f, PagerState pagerState, int i2, dq dqVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f, pagerState);
    }
}
