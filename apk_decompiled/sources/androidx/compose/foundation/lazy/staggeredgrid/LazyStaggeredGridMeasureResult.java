package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import defpackage.dq;
import defpackage.ky;
import defpackage.un;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureResult implements LazyStaggeredGridLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final boolean canScrollForward;
    private final float consumedScroll;
    private final un coroutineScope;
    private final Density density;
    private final int[] firstVisibleItemIndices;
    private final int[] firstVisibleItemScrollOffsets;
    private final boolean isVertical;
    private final int mainAxisItemSpacing;
    private final MeasureResult measureResult;
    private final Orientation orientation;
    private final boolean remeasureNeeded;
    private final float scrollBackAmount;
    private final LazyStaggeredGridSlots slots;
    private final LazyStaggeredGridSpanProvider spanProvider;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final long viewportSize;
    private final int viewportStartOffset;
    private final List<LazyStaggeredGridMeasuredItem> visibleItemsInfo;

    private LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f, MeasureResult measureResult, float f2, boolean z, boolean z2, boolean z3, LazyStaggeredGridSlots lazyStaggeredGridSlots, LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider, Density density, int i, List<LazyStaggeredGridMeasuredItem> list, long j, int i2, int i3, int i4, int i5, int i6, un unVar) {
        this.firstVisibleItemIndices = iArr;
        this.firstVisibleItemScrollOffsets = iArr2;
        this.consumedScroll = f;
        this.measureResult = measureResult;
        this.scrollBackAmount = f2;
        this.canScrollForward = z;
        this.isVertical = z2;
        this.remeasureNeeded = z3;
        this.slots = lazyStaggeredGridSlots;
        this.spanProvider = lazyStaggeredGridSpanProvider;
        this.density = density;
        this.totalItemsCount = i;
        this.visibleItemsInfo = list;
        this.viewportSize = j;
        this.viewportStartOffset = i2;
        this.viewportEndOffset = i3;
        this.beforeContentPadding = i4;
        this.afterContentPadding = i5;
        this.mainAxisItemSpacing = i6;
        this.coroutineScope = unVar;
        this.orientation = z2 ? Orientation.Vertical : Orientation.Horizontal;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LazyStaggeredGridMeasureResult copyWithScrollDeltaWithoutRemeasure(int i, boolean z) {
        if (this.remeasureNeeded || getVisibleItemsInfo().isEmpty() || this.firstVisibleItemIndices.length == 0 || this.firstVisibleItemScrollOffsets.length == 0) {
            return null;
        }
        int viewportEndOffset = getViewportEndOffset() - getAfterContentPadding();
        List<LazyStaggeredGridMeasuredItem> visibleItemsInfo = getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                List<LazyStaggeredGridMeasuredItem> visibleItemsInfo2 = getVisibleItemsInfo();
                int size2 = visibleItemsInfo2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    visibleItemsInfo2.get(i3).applyScrollDelta(i, z);
                }
                int[] iArr = this.firstVisibleItemIndices;
                int length = this.firstVisibleItemScrollOffsets.length;
                int[] iArr2 = new int[length];
                for (int i4 = 0; i4 < length; i4++) {
                    iArr2[i4] = this.firstVisibleItemScrollOffsets[i4] - i;
                }
                return new LazyStaggeredGridMeasureResult(iArr, iArr2, i, this.measureResult, this.scrollBackAmount, this.canScrollForward || i > 0, this.isVertical, this.remeasureNeeded, this.slots, this.spanProvider, this.density, getTotalItemsCount(), getVisibleItemsInfo(), mo967getViewportSizeYbymL2g(), getViewportStartOffset(), getViewportEndOffset(), getBeforeContentPadding(), getAfterContentPadding(), getMainAxisItemSpacing(), this.coroutineScope, null);
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = visibleItemsInfo.get(i2);
            if (lazyStaggeredGridMeasuredItem.getNonScrollableItem()) {
                break;
            }
            if ((lazyStaggeredGridMeasuredItem.getMainAxisOffset() <= 0) != (lazyStaggeredGridMeasuredItem.getMainAxisOffset() + i <= 0)) {
                break;
            }
            if (lazyStaggeredGridMeasuredItem.getMainAxisOffset() <= getViewportStartOffset()) {
                if (i < 0) {
                    if ((lazyStaggeredGridMeasuredItem.getMainAxisSizeWithSpacings() + lazyStaggeredGridMeasuredItem.getMainAxisOffset()) - getViewportStartOffset() <= (-i)) {
                        break;
                    }
                } else if (getViewportStartOffset() - lazyStaggeredGridMeasuredItem.getMainAxisOffset() <= i) {
                    break;
                }
            }
            if (lazyStaggeredGridMeasuredItem.getMainAxisSizeWithSpacings() + lazyStaggeredGridMeasuredItem.getMainAxisOffset() >= viewportEndOffset) {
                if (i < 0) {
                    if ((lazyStaggeredGridMeasuredItem.getMainAxisSizeWithSpacings() + lazyStaggeredGridMeasuredItem.getMainAxisOffset()) - getViewportEndOffset() <= (-i)) {
                        break;
                    }
                } else {
                    if (getViewportEndOffset() - lazyStaggeredGridMeasuredItem.getMainAxisOffset() <= i) {
                        break;
                    }
                }
            }
            i2++;
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    public final boolean getCanScrollBackward() {
        return this.firstVisibleItemIndices[0] != 0 || this.firstVisibleItemScrollOffsets[0] > 0;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    public final un getCoroutineScope() {
        return this.coroutineScope;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final int[] getFirstVisibleItemIndices() {
        return this.firstVisibleItemIndices;
    }

    public final int[] getFirstVisibleItemScrollOffsets() {
        return this.firstVisibleItemScrollOffsets;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    public final MeasureResult getMeasureResult() {
        return this.measureResult;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public Orientation getOrientation() {
        return this.orientation;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public ky getRulers() {
        return this.measureResult.getRulers();
    }

    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    public final LazyStaggeredGridSlots getSlots() {
        return this.slots;
    }

    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo967getViewportSizeYbymL2g() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public List<LazyStaggeredGridMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.measureResult.placeChildren();
    }

    public /* synthetic */ LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f, MeasureResult measureResult, float f2, boolean z, boolean z2, boolean z3, LazyStaggeredGridSlots lazyStaggeredGridSlots, LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider, Density density, int i, List list, long j, int i2, int i3, int i4, int i5, int i6, un unVar, dq dqVar) {
        this(iArr, iArr2, f, measureResult, f2, z, z2, z3, lazyStaggeredGridSlots, lazyStaggeredGridSpanProvider, density, i, list, j, i2, i3, i4, i5, i6, unVar);
    }
}
