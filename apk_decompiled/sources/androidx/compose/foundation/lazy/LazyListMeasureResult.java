package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import defpackage.dq;
import defpackage.ky;
import defpackage.un;
import defpackage.yi;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListMeasureResult implements LazyListLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final boolean canScrollForward;
    private final long childConstraints;
    private final float consumedScroll;
    private final un coroutineScope;
    private final Density density;
    private final LazyListMeasuredItem firstVisibleItem;
    private final int firstVisibleItemScrollOffset;
    private final int mainAxisItemSpacing;
    private final MeasureResult measureResult;
    private final Orientation orientation;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final float scrollBackAmount;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final List<LazyListMeasuredItem> visibleItemsInfo;

    private LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i, boolean z, float f, MeasureResult measureResult, float f2, boolean z2, un unVar, Density density, long j, List<LazyListMeasuredItem> list, int i2, int i3, int i4, boolean z3, Orientation orientation, int i5, int i6) {
        this.firstVisibleItem = lazyListMeasuredItem;
        this.firstVisibleItemScrollOffset = i;
        this.canScrollForward = z;
        this.consumedScroll = f;
        this.measureResult = measureResult;
        this.scrollBackAmount = f2;
        this.remeasureNeeded = z2;
        this.coroutineScope = unVar;
        this.density = density;
        this.childConstraints = j;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i2;
        this.viewportEndOffset = i3;
        this.totalItemsCount = i4;
        this.reverseLayout = z3;
        this.orientation = orientation;
        this.afterContentPadding = i5;
        this.mainAxisItemSpacing = i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (java.lang.Math.min((r2.getMainAxisSizeWithSpacings() + r2.getOffset()) - getViewportStartOffset(), (r4.getMainAxisSizeWithSpacings() + r4.getOffset()) - getViewportEndOffset()) > (-r28)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        r2 = getVisibleItemsInfo();
        r3 = r2.size();
        r4 = false;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (r5 >= r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        r2.get(r5).applyScrollDelta(r28, r29);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
    
        r7 = r27.firstVisibleItem;
        r8 = r27.firstVisibleItemScrollOffset - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        if (r27.canScrollForward != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        if (r28 <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e3, code lost:
    
        return new androidx.compose.foundation.lazy.LazyListMeasureResult(r7, r8, r4, r28, r27.measureResult, r27.scrollBackAmount, r27.remeasureNeeded, r27.coroutineScope, r27.density, r27.childConstraints, getVisibleItemsInfo(), getViewportStartOffset(), getViewportEndOffset(), getTotalItemsCount(), getReverseLayout(), getOrientation(), getAfterContentPadding(), getMainAxisItemSpacing(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (java.lang.Math.min(getViewportStartOffset() - r2.getOffset(), getViewportEndOffset() - r4.getOffset()) > r28) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LazyListMeasureResult copyWithScrollDeltaWithoutRemeasure(int i, boolean z) {
        LazyListMeasuredItem lazyListMeasuredItem;
        if (!this.remeasureNeeded && !getVisibleItemsInfo().isEmpty() && (lazyListMeasuredItem = this.firstVisibleItem) != null) {
            int mainAxisSizeWithSpacings = lazyListMeasuredItem.getMainAxisSizeWithSpacings();
            int i2 = this.firstVisibleItemScrollOffset - i;
            if (i2 >= 0 && i2 < mainAxisSizeWithSpacings) {
                LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) yi.p0(getVisibleItemsInfo());
                LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) yi.v0(getVisibleItemsInfo());
                if (!lazyListMeasuredItem2.getNonScrollableItem() && !lazyListMeasuredItem3.getNonScrollableItem()) {
                    if (i < 0) {
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollBackward() {
        LazyListMeasuredItem lazyListMeasuredItem = this.firstVisibleItem;
        return ((lazyListMeasuredItem != null ? lazyListMeasuredItem.getIndex() : 0) == 0 && this.firstVisibleItemScrollOffset == 0) ? false : true;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* renamed from: getChildConstraints-msEJaDk, reason: not valid java name */
    public final long m867getChildConstraintsmsEJaDk() {
        return this.childConstraints;
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

    public final LazyListMeasuredItem getFirstVisibleItem() {
        return this.firstVisibleItem;
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public Orientation getOrientation() {
        return this.orientation;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
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

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo864getViewportSizeYbymL2g() {
        return IntSize.m7777constructorimpl((getWidth() << 32) | (getHeight() & 4294967295L));
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public List<LazyListMeasuredItem> getVisibleItemsInfo() {
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

    public /* synthetic */ LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i, boolean z, float f, MeasureResult measureResult, float f2, boolean z2, un unVar, Density density, long j, List list, int i2, int i3, int i4, boolean z3, Orientation orientation, int i5, int i6, dq dqVar) {
        this(lazyListMeasuredItem, i, z, f, measureResult, f2, z2, unVar, density, j, list, i2, i3, i4, z3, orientation, i5, i6);
    }
}
