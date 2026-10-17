package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import defpackage.ky;
import defpackage.un;
import defpackage.yi;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridMeasureResult implements LazyGridLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final boolean canScrollForward;
    private final float consumedScroll;
    private final un coroutineScope;
    private final Density density;
    private final LazyGridMeasuredLine firstVisibleLine;
    private final int firstVisibleLineScrollOffset;
    private final ky lineIndexProvider;
    private final int mainAxisItemSpacing;
    private final MeasureResult measureResult;
    private final Orientation orientation;
    private final ky prefetchInfoRetriever;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final float scrollBackAmount;
    private final int slotsPerLine;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final List<LazyGridMeasuredItem> visibleItemsInfo;

    public LazyGridMeasureResult(LazyGridMeasuredLine lazyGridMeasuredLine, int i, boolean z, float f, MeasureResult measureResult, float f2, boolean z2, un unVar, Density density, int i2, ky kyVar, ky kyVar2, List<LazyGridMeasuredItem> list, int i3, int i4, int i5, boolean z3, Orientation orientation, int i6, int i7) {
        this.firstVisibleLine = lazyGridMeasuredLine;
        this.firstVisibleLineScrollOffset = i;
        this.canScrollForward = z;
        this.consumedScroll = f;
        this.measureResult = measureResult;
        this.scrollBackAmount = f2;
        this.remeasureNeeded = z2;
        this.coroutineScope = unVar;
        this.density = density;
        this.slotsPerLine = i2;
        this.prefetchInfoRetriever = kyVar;
        this.lineIndexProvider = kyVar2;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i3;
        this.viewportEndOffset = i4;
        this.totalItemsCount = i5;
        this.reverseLayout = z3;
        this.orientation = orientation;
        this.afterContentPadding = i6;
        this.mainAxisItemSpacing = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        if (java.lang.Math.min((r2.getMainAxisSizeWithSpacings() + androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r2, getOrientation())) - getViewportStartOffset(), (r4.getMainAxisSizeWithSpacings() + androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r4, getOrientation())) - getViewportEndOffset()) > (-r28)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0092, code lost:
    
        r2 = getVisibleItemsInfo();
        r3 = r2.size();
        r4 = false;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009c, code lost:
    
        if (r5 >= r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        r2.get(r5).applyScrollDelta(r28, r29);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        r7 = r27.firstVisibleLine;
        r8 = r27.firstVisibleLineScrollOffset - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b4, code lost:
    
        if (r27.canScrollForward != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b6, code lost:
    
        if (r28 <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f9, code lost:
    
        return new androidx.compose.foundation.lazy.grid.LazyGridMeasureResult(r7, r8, r4, r28, r27.measureResult, r27.scrollBackAmount, r27.remeasureNeeded, r27.coroutineScope, r27.density, r27.slotsPerLine, r27.prefetchInfoRetriever, r27.lineIndexProvider, getVisibleItemsInfo(), getViewportStartOffset(), getViewportEndOffset(), getTotalItemsCount(), getReverseLayout(), getOrientation(), getAfterContentPadding(), getMainAxisItemSpacing());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if (java.lang.Math.min(getViewportStartOffset() - androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r2, getOrientation()), getViewportEndOffset() - androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r4, getOrientation())) > r28) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LazyGridMeasureResult copyWithScrollDeltaWithoutRemeasure(int i, boolean z) {
        LazyGridMeasuredLine lazyGridMeasuredLine;
        if (!this.remeasureNeeded && !getVisibleItemsInfo().isEmpty() && (lazyGridMeasuredLine = this.firstVisibleLine) != null) {
            int mainAxisSizeWithSpacings = lazyGridMeasuredLine.getMainAxisSizeWithSpacings();
            int i2 = this.firstVisibleLineScrollOffset - i;
            if (i2 >= 0 && i2 < mainAxisSizeWithSpacings) {
                LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) yi.p0(getVisibleItemsInfo());
                LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) yi.v0(getVisibleItemsInfo());
                if (!lazyGridMeasuredItem.getNonScrollableItem() && !lazyGridMeasuredItem2.getNonScrollableItem()) {
                    if (i < 0) {
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollBackward() {
        LazyGridMeasuredLine lazyGridMeasuredLine = this.firstVisibleLine;
        return ((lazyGridMeasuredLine != null ? lazyGridMeasuredLine.getIndex() : 0) == 0 && this.firstVisibleLineScrollOffset == 0) ? false : true;
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

    public final LazyGridMeasuredLine getFirstVisibleLine() {
        return this.firstVisibleLine;
    }

    public final int getFirstVisibleLineScrollOffset() {
        return this.firstVisibleLineScrollOffset;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    public final ky getLineIndexProvider() {
        return this.lineIndexProvider;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getMaxSpan() {
        return this.slotsPerLine;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public Orientation getOrientation() {
        return this.orientation;
    }

    public final ky getPrefetchInfoRetriever() {
        return this.prefetchInfoRetriever;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public ky getRulers() {
        return this.measureResult.getRulers();
    }

    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo894getViewportSizeYbymL2g() {
        return IntSize.m7777constructorimpl((getWidth() << 32) | (getHeight() & 4294967295L));
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public List<LazyGridMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.measureResult.placeChildren();
    }
}
