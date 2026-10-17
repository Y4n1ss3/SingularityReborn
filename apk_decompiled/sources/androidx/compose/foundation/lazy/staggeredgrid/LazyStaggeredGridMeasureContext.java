package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.Placeable;
import defpackage.dq;
import defpackage.un;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureContext {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyStaggeredGridLayoutInfo approachLayoutInfo;
    private final int beforeContentPadding;
    private final long constraints;
    private final long contentOffset;
    private final un coroutineScope;
    private final GraphicsContext graphicsContext;
    private final boolean isInLookaheadScope;
    private final boolean isLookingAhead;
    private final boolean isVertical;
    private final LazyStaggeredGridItemProvider itemProvider;
    private final int laneCount;
    private final LazyStaggeredGridLaneInfo laneInfo;
    private final int mainAxisAvailableSize;
    private final int mainAxisSpacing;
    private final LazyLayoutMeasureScope measureScope;
    private final LazyStaggeredGridMeasureProvider measuredItemProvider;
    private final List<Integer> pinnedItems;
    private final LazyStaggeredGridSlots resolvedSlots;
    private final boolean reverseLayout;
    private final LazyStaggeredGridState state;

    private LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, final LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, final LazyStaggeredGridSlots lazyStaggeredGridSlots, long j, final boolean z, final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j2, int i2, int i3, boolean z2, int i4, un unVar, boolean z3, boolean z4, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext) {
        this.state = lazyStaggeredGridState;
        this.pinnedItems = list;
        this.itemProvider = lazyStaggeredGridItemProvider;
        this.resolvedSlots = lazyStaggeredGridSlots;
        this.constraints = j;
        this.isVertical = z;
        this.measureScope = lazyLayoutMeasureScope;
        this.mainAxisAvailableSize = i;
        this.contentOffset = j2;
        this.beforeContentPadding = i2;
        this.afterContentPadding = i3;
        this.reverseLayout = z2;
        this.mainAxisSpacing = i4;
        this.coroutineScope = unVar;
        this.isInLookaheadScope = z3;
        this.isLookingAhead = z4;
        this.approachLayoutInfo = lazyStaggeredGridLayoutInfo;
        this.graphicsContext = graphicsContext;
        this.measuredItemProvider = new LazyStaggeredGridMeasureProvider(z, lazyStaggeredGridItemProvider, lazyLayoutMeasureScope, lazyStaggeredGridSlots) { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext$measuredItemProvider$1
            @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider
            /* renamed from: createItem-pitSLOA, reason: not valid java name */
            public LazyStaggeredGridMeasuredItem mo973createItempitSLOA(int i5, int i6, int i7, Object obj, Object obj2, List<? extends Placeable> list2, long j3) {
                return new LazyStaggeredGridMeasuredItem(i5, obj, list2, LazyStaggeredGridMeasureContext.this.isVertical(), LazyStaggeredGridMeasureContext.this.getMainAxisSpacing(), i6, i7, LazyStaggeredGridMeasureContext.this.getBeforeContentPadding(), LazyStaggeredGridMeasureContext.this.getAfterContentPadding(), obj2, LazyStaggeredGridMeasureContext.this.getState().getItemAnimator$foundation(), j3, null);
            }
        };
        this.laneInfo = lazyStaggeredGridState.getLaneInfo$foundation();
        this.laneCount = lazyStaggeredGridSlots.getSizes().length;
    }

    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public final LazyStaggeredGridLayoutInfo getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    public final int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m968getConstraintsmsEJaDk() {
        return this.constraints;
    }

    /* renamed from: getContentOffset-nOcc-ac, reason: not valid java name */
    public final long m969getContentOffsetnOccac() {
        return this.contentOffset;
    }

    public final un getCoroutineScope() {
        return this.coroutineScope;
    }

    public final GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    public final LazyStaggeredGridItemProvider getItemProvider() {
        return this.itemProvider;
    }

    public final int getLaneCount() {
        return this.laneCount;
    }

    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    /* renamed from: getLaneInfo-SZVOQXA, reason: not valid java name */
    public final int m970getLaneInfoSZVOQXA(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (i - i2 != 1) {
            return -2;
        }
        return i2;
    }

    public final int getMainAxisAvailableSize() {
        return this.mainAxisAvailableSize;
    }

    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    public final LazyLayoutMeasureScope getMeasureScope() {
        return this.measureScope;
    }

    public final LazyStaggeredGridMeasureProvider getMeasuredItemProvider() {
        return this.measuredItemProvider;
    }

    public final List<Integer> getPinnedItems() {
        return this.pinnedItems;
    }

    public final LazyStaggeredGridSlots getResolvedSlots() {
        return this.resolvedSlots;
    }

    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    /* renamed from: getSpanRange-lOCCd4c, reason: not valid java name */
    public final long m971getSpanRangelOCCd4c(LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i, int i2) {
        boolean isFullSpan = lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i);
        int i3 = isFullSpan ? this.laneCount : 1;
        if (isFullSpan) {
            i2 = 0;
        }
        return SpanRange.m985constructorimpl(i2, i3);
    }

    public final LazyStaggeredGridState getState() {
        return this.state;
    }

    public final boolean isFullSpan(LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i) {
        return lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i);
    }

    /* renamed from: isFullSpan-SZVOQXA, reason: not valid java name */
    public final boolean m972isFullSpanSZVOQXA(long j) {
        return ((int) (4294967295L & j)) - ((int) (j >> 32)) != 1;
    }

    public final boolean isInLookaheadScope() {
        return this.isInLookaheadScope;
    }

    public final boolean isLookingAhead() {
        return this.isLookingAhead;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public /* synthetic */ LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j, boolean z, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j2, int i2, int i3, boolean z2, int i4, un unVar, boolean z3, boolean z4, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext, dq dqVar) {
        this(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j, z, lazyLayoutMeasureScope, i, j2, i2, i3, z2, i4, unVar, z3, z4, lazyStaggeredGridLayoutInfo, graphicsContext);
    }
}
