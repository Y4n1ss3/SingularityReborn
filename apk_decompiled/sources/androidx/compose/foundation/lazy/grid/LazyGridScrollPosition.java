package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import defpackage.ac;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridScrollPosition {
    public static final int $stable = 8;
    private boolean hadFirstNotEmptyLayout;
    private final MutableIntState index$delegate;
    private Object lastKnownFirstItemKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final MutableIntState scrollOffset$delegate;

    public LazyGridScrollPosition(int i, int i2) {
        this.index$delegate = SnapshotIntStateKt.mutableIntStateOf(i);
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(i2);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i, 90, ComposerKt.invocationKey);
    }

    private final void setIndex(int i) {
        this.index$delegate.setIntValue(i);
    }

    private final void setScrollOffset(int i) {
        this.scrollOffset$delegate.setIntValue(i);
    }

    private final void update(int i, int i2) {
        if (!(((float) i) >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Index should be non-negative");
        }
        setIndex(i);
        this.nearestRangeState.update(i);
        setScrollOffset(i2);
    }

    public final int getIndex() {
        return this.index$delegate.getIntValue();
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int getScrollOffset() {
        return this.scrollOffset$delegate.getIntValue();
    }

    public final void requestPositionAndForgetLastKnownKey(int i, int i2) {
        update(i, i2);
        this.lastKnownFirstItemKey = null;
    }

    public final void updateFromMeasureResult(LazyGridMeasureResult lazyGridMeasureResult) {
        LazyGridMeasuredItem[] items;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        LazyGridMeasuredItem[] items2;
        LazyGridMeasuredItem lazyGridMeasuredItem2;
        LazyGridMeasuredLine firstVisibleLine = lazyGridMeasureResult.getFirstVisibleLine();
        this.lastKnownFirstItemKey = (firstVisibleLine == null || (items2 = firstVisibleLine.getItems()) == null || (lazyGridMeasuredItem2 = (LazyGridMeasuredItem) ac.c0(items2)) == null) ? null : lazyGridMeasuredItem2.getKey();
        if (this.hadFirstNotEmptyLayout || lazyGridMeasureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleLineScrollOffset = lazyGridMeasureResult.getFirstVisibleLineScrollOffset();
            int i = 0;
            if (!(((float) firstVisibleLineScrollOffset) >= 0.0f)) {
                InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative (" + firstVisibleLineScrollOffset + ')');
            }
            LazyGridMeasuredLine firstVisibleLine2 = lazyGridMeasureResult.getFirstVisibleLine();
            if (firstVisibleLine2 != null && (items = firstVisibleLine2.getItems()) != null && (lazyGridMeasuredItem = (LazyGridMeasuredItem) ac.c0(items)) != null) {
                i = lazyGridMeasuredItem.getIndex();
            }
            update(i, firstVisibleLineScrollOffset);
        }
    }

    public final void updateScrollOffset(int i) {
        if (!(((float) i) >= 0.0f)) {
            InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative");
        }
        setScrollOffset(i);
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved(LazyGridItemProvider lazyGridItemProvider, int i) {
        int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyGridItemProvider, this.lastKnownFirstItemKey, i);
        if (i != findIndexByKey) {
            setIndex(findIndexByKey);
            this.nearestRangeState.update(i);
        }
        return findIndexByKey;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LazyGridScrollPosition() {
        this(r2, r2, 3, null);
        int i = 0;
    }

    public /* synthetic */ LazyGridScrollPosition(int i, int i2, int i3, dq dqVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
