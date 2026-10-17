package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import defpackage.ky;
import defpackage.my;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridScrollPosition {
    public static final int $stable = 8;
    private final my fillIndices;
    private boolean hadFirstNotEmptyLayout;
    private final MutableIntState index$delegate;
    private int[] indices;
    private Object lastKnownFirstItemKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final MutableIntState scrollOffset$delegate;
    private int[] scrollOffsets;

    public LazyStaggeredGridScrollPosition(int[] iArr, int[] iArr2, my myVar) {
        Integer valueOf;
        this.fillIndices = myVar;
        this.indices = iArr;
        this.index$delegate = SnapshotIntStateKt.mutableIntStateOf(calculateFirstVisibleIndex(iArr));
        this.scrollOffsets = iArr2;
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(calculateFirstVisibleScrollOffset(iArr, iArr2));
        iArr.getClass();
        if (iArr.length == 0) {
            valueOf = null;
        } else {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    i = i > i3 ? i3 : i;
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            valueOf = Integer.valueOf(i);
        }
        this.nearestRangeState = new LazyLayoutNearestRangeState(valueOf != null ? valueOf.intValue() : 0, 90, ComposerKt.invocationKey);
    }

    private final int calculateFirstVisibleIndex(int[] iArr) {
        int i = Integer.MAX_VALUE;
        for (int i2 : iArr) {
            if (i2 <= 0) {
                return 0;
            }
            if (i > i2) {
                i = i2;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    private final int calculateFirstVisibleScrollOffset(int[] iArr, int[] iArr2) {
        int calculateFirstVisibleIndex = calculateFirstVisibleIndex(iArr);
        int length = iArr2.length;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < length; i2++) {
            if (iArr[i2] == calculateFirstVisibleIndex) {
                i = Math.min(i, iArr2[i2]);
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    private final void setIndex(int i) {
        this.index$delegate.setIntValue(i);
    }

    private final void setScrollOffset(int i) {
        this.scrollOffset$delegate.setIntValue(i);
    }

    private final void update(int[] iArr, int[] iArr2) {
        this.indices = iArr;
        setIndex(calculateFirstVisibleIndex(iArr));
        this.scrollOffsets = iArr2;
        setScrollOffset(calculateFirstVisibleScrollOffset(iArr, iArr2));
    }

    public final int getIndex() {
        return this.index$delegate.getIntValue();
    }

    public final int[] getIndices() {
        return this.indices;
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int getScrollOffset() {
        return this.scrollOffset$delegate.getIntValue();
    }

    public final int[] getScrollOffsets() {
        return this.scrollOffsets;
    }

    public final void requestPositionAndForgetLastKnownKey(int i, int i2) {
        int[] iArr = (int[]) this.fillIndices.invoke(Integer.valueOf(i), Integer.valueOf(this.indices.length));
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr2[i3] = i2;
        }
        update(iArr, iArr2);
        this.nearestRangeState.update(i);
        this.lastKnownFirstItemKey = null;
    }

    public final void updateFromMeasureResult(LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult) {
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem;
        int calculateFirstVisibleIndex = calculateFirstVisibleIndex(lazyStaggeredGridMeasureResult.getFirstVisibleItemIndices());
        List<LazyStaggeredGridMeasuredItem> visibleItemsInfo = lazyStaggeredGridMeasureResult.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                lazyStaggeredGridMeasuredItem = null;
                break;
            }
            lazyStaggeredGridMeasuredItem = visibleItemsInfo.get(i);
            if (lazyStaggeredGridMeasuredItem.getIndex() == calculateFirstVisibleIndex) {
                break;
            } else {
                i++;
            }
        }
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = lazyStaggeredGridMeasuredItem;
        this.lastKnownFirstItemKey = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getKey() : null;
        this.nearestRangeState.update(calculateFirstVisibleIndex);
        if (this.hadFirstNotEmptyLayout || lazyStaggeredGridMeasureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                update(lazyStaggeredGridMeasureResult.getFirstVisibleItemIndices(), lazyStaggeredGridMeasureResult.getFirstVisibleItemScrollOffsets());
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            }
        }
    }

    public final void updateScrollOffset(int[] iArr) {
        this.scrollOffsets = iArr;
        setScrollOffset(calculateFirstVisibleScrollOffset(this.indices, iArr));
    }

    public final int[] updateScrollPositionIfTheFirstItemWasMoved(LazyLayoutItemProvider lazyLayoutItemProvider, int[] iArr) {
        Object obj = this.lastKnownFirstItemKey;
        iArr.getClass();
        int i = 0;
        Integer valueOf = iArr.length > 0 ? Integer.valueOf(iArr[0]) : null;
        int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider, obj, valueOf != null ? valueOf.intValue() : 0);
        int length = iArr.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (findIndexByKey == iArr[i]) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return iArr;
        }
        this.nearestRangeState.update(findIndexByKey);
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            int[] iArr2 = (int[]) this.fillIndices.invoke(Integer.valueOf(findIndexByKey), Integer.valueOf(iArr.length));
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            this.indices = iArr2;
            setIndex(calculateFirstVisibleIndex(iArr2));
            return iArr2;
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }
}
