package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ScrollIndicatorState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import defpackage.ac;
import defpackage.dq;
import defpackage.h;
import defpackage.hm;
import defpackage.hz;
import defpackage.k10;
import defpackage.my;
import defpackage.n30;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;
import defpackage.yi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<LazyStaggeredGridState, Object> Saver = ListSaverKt.listSaver(new n30(7), new hz(17));
    private final LazyLayoutScrollDeltaBetweenPasses _lazyLayoutScrollDeltaBetweenPasses;
    private final LazyStaggeredGridState$_scrollIndicatorState$1 _scrollIndicatorState;
    private LazyStaggeredGridMeasureResult approachLayoutInfo;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private final Map<Integer, LazyLayoutPrefetchState.PrefetchHandle> currentItemPrefetchHandles;
    private boolean hasLookaheadOccurred;
    private final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> itemAnimator;
    private final LazyStaggeredGridLaneInfo laneInfo;
    private final MutableState<LazyStaggeredGridMeasureResult> layoutInfoState;
    private int measurePassCount;
    private final MutableState<w01> measurementScopeInvalidator;
    private final MutableInteractionSource mutableInteractionSource;
    private final LazyLayoutPinnedItemList pinnedItems;
    private final MutableState<w01> placementScopeInvalidator;
    private int prefetchBaseIndex;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private Remeasurement remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyStaggeredGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$_scrollIndicatorState$1] */
    public LazyStaggeredGridState(int[] iArr, int[] iArr2, PrefetchScheduler prefetchScheduler) {
        LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = new LazyStaggeredGridScrollPosition(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        this.scrollPosition = lazyStaggeredGridScrollPosition;
        this.layoutInfoState = SnapshotStateKt.mutableStateOf(LazyStaggeredGridMeasureResultKt.getEmptyLazyStaggeredGridLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
        this._scrollIndicatorState = new ScrollIndicatorState() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$_scrollIndicatorState$1
            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getContentSize() {
                return LazyStaggeredGridMeasureResultKt.calculateContentSize(LazyStaggeredGridState.this.getLayoutInfo(), LazyStaggeredGridState.this.getLaneCount$foundation());
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getScrollOffset() {
                int calculateScrollOffset;
                calculateScrollOffset = LazyStaggeredGridState.this.calculateScrollOffset();
                return calculateScrollOffset;
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getViewportSize() {
                return LazyStaggeredGridMeasureResultKt.getSingleAxisViewportSize(LazyStaggeredGridState.this.getLayoutInfo());
            }
        };
        this.laneInfo = new LazyStaggeredGridLaneInfo();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                LazyStaggeredGridState.this.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchingEnabled = true;
        this.prefetchState = new LazyLayoutPrefetchState(prefetchScheduler, null, 2, 0 == true ? 1 : 0);
        this.scrollableState = ScrollableStateKt.ScrollableState(new h(this, 28));
        this.prefetchBaseIndex = -1;
        this.currentItemPrefetchHandles = new LinkedHashMap();
        this.mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.pinnedItems = new LazyLayoutPinnedItemList();
        this.itemAnimator = new LazyLayoutItemAnimator<>();
        lazyStaggeredGridScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m942constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m942constructorimpl$default(null, 1, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new LazyLayoutScrollDeltaBetweenPasses();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Saver$lambda$0(SaverScope saverScope, LazyStaggeredGridState lazyStaggeredGridState) {
        return y80.E(lazyStaggeredGridState.scrollPosition.getIndices(), lazyStaggeredGridState.scrollPosition.getScrollOffsets());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyStaggeredGridState Saver$lambda$1(List list) {
        return new LazyStaggeredGridState((int[]) list.get(0), (int[]) list.get(1), null);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i, int i2, hm hmVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyStaggeredGridState.animateScrollToItem(i, i2, hmVar);
    }

    public static /* synthetic */ void applyMeasureResult$foundation$default(LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        lazyStaggeredGridState.applyMeasureResult$foundation(lazyStaggeredGridMeasureResult, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int calculateScrollOffset() {
        LazyStaggeredGridLayoutInfo layoutInfo = getLayoutInfo();
        if (layoutInfo.getTotalItemsCount() == 0) {
            return 0;
        }
        return getFirstVisibleItemScrollOffset() + ((getFirstVisibleItemIndex() * LazyStaggeredGridMeasureResultKt.visibleItemsAverageSize(layoutInfo)) / getLaneCount$foundation());
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        if (this.prefetchBaseIndex == -1 || visibleItemsInfo.isEmpty()) {
            return;
        }
        int index = ((LazyStaggeredGridItemInfo) yi.p0(visibleItemsInfo)).getIndex();
        int index2 = ((LazyStaggeredGridItemInfo) yi.v0(visibleItemsInfo)).getIndex();
        int i = this.prefetchBaseIndex;
        if (index > i || i > index2) {
            this.prefetchBaseIndex = -1;
            Iterator<T> it = this.currentItemPrefetchHandles.values().iterator();
            while (it.hasNext()) {
                ((LazyLayoutPrefetchState.PrefetchHandle) it.next()).cancel();
            }
            this.currentItemPrefetchHandles.clear();
        }
    }

    private final void clearLeftoverPrefetchHandles(Set<Integer> set) {
        Iterator<Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle>> it = this.currentItemPrefetchHandles.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle> next = it.next();
            if (!set.contains(next.getKey())) {
                next.getValue().cancel();
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] fillNearestIndices(int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        if (this.layoutInfoState.getValue().getSpanProvider().isFullSpan(i)) {
            ac.Y(iArr, i, 0, 6);
            return iArr;
        }
        this.laneInfo.ensureValidIndex(i + i2);
        int lane = this.laneInfo.getLane(i);
        if (lane != -2 && lane != -1) {
            if (lane < 0) {
                InlineClassHelperKt.throwIllegalArgumentException("Expected positive lane number, got " + lane + " instead.");
            }
            i3 = Math.min(lane, i2);
        }
        int i4 = i3 - 1;
        int i5 = i;
        while (true) {
            if (-1 >= i4) {
                break;
            }
            i5 = this.laneInfo.findPreviousItemIndex(i5, i4);
            iArr[i4] = i5;
            if (i5 == -1) {
                ac.Y(iArr, -1, i4, 2);
                break;
            }
            i4--;
        }
        iArr[i3] = i;
        while (true) {
            i3++;
            if (i3 >= i2) {
                return iArr;
            }
            i = this.laneInfo.findNextItemIndex(i, i3);
            iArr[i3] = i;
        }
    }

    private final void notifyPrefetch(float f, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult) {
        int i;
        if (!this.prefetchingEnabled || lazyStaggeredGridMeasureResult.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        boolean z = f < 0.0f;
        int index = z ? ((LazyStaggeredGridMeasuredItem) yi.v0(lazyStaggeredGridMeasureResult.getVisibleItemsInfo())).getIndex() : ((LazyStaggeredGridMeasuredItem) yi.p0(lazyStaggeredGridMeasureResult.getVisibleItemsInfo())).getIndex();
        if (index == this.prefetchBaseIndex) {
            return;
        }
        this.prefetchBaseIndex = index;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LazyStaggeredGridSlots slots = lazyStaggeredGridMeasureResult.getSlots();
        int length = slots.getSizes().length;
        int i2 = 0;
        while (i2 < length) {
            LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = this.laneInfo;
            int findNextItemIndex = z ? lazyStaggeredGridLaneInfo.findNextItemIndex(index, i2) : lazyStaggeredGridLaneInfo.findPreviousItemIndex(index, i2);
            if (findNextItemIndex < 0 || findNextItemIndex >= lazyStaggeredGridMeasureResult.getTotalItemsCount() || linkedHashSet.contains(Integer.valueOf(findNextItemIndex))) {
                break;
            }
            linkedHashSet.add(Integer.valueOf(findNextItemIndex));
            if (!this.currentItemPrefetchHandles.containsKey(Integer.valueOf(findNextItemIndex))) {
                boolean isFullSpan = lazyStaggeredGridMeasureResult.getSpanProvider().isFullSpan(findNextItemIndex);
                int i3 = isFullSpan ? 0 : i2;
                int i4 = isFullSpan ? length : 1;
                if (i4 == 1) {
                    i = slots.getSizes()[i3];
                } else {
                    int i5 = slots.getPositions()[i3];
                    int i6 = (i3 + i4) - 1;
                    i = (slots.getPositions()[i6] + slots.getSizes()[i6]) - i5;
                }
                this.currentItemPrefetchHandles.put(Integer.valueOf(findNextItemIndex), LazyLayoutPrefetchState.m932schedulePrecompositionAndPremeasureVKLhPVY$default(this.prefetchState, findNextItemIndex, lazyStaggeredGridMeasureResult.getOrientation() == Orientation.Vertical ? Constraints.Companion.m7576fixedWidthOenEA2s(i) : Constraints.Companion.m7575fixedHeightOenEA2s(i), null, 4, null));
            }
            i2++;
            index = findNextItemIndex;
        }
        clearLeftoverPrefetchHandles(linkedHashSet);
    }

    public static /* synthetic */ void notifyPrefetch$default(LazyStaggeredGridState lazyStaggeredGridState, float f, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, int i, Object obj) {
        if ((i & 2) != 0) {
            lazyStaggeredGridMeasureResult = lazyStaggeredGridState.layoutInfoState.getValue();
        }
        lazyStaggeredGridState.notifyPrefetch(f, lazyStaggeredGridMeasureResult);
    }

    private final float onScroll(float f) {
        LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult;
        if ((f < 0.0f && !getCanScrollForward()) || (f > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (!(Math.abs(this.scrollToBeConsumed) <= 0.5f)) {
            InlineClassHelperKt.throwIllegalStateException("entered drag with non-zero pending scroll");
        }
        float f2 = this.scrollToBeConsumed + f;
        this.scrollToBeConsumed = f2;
        if (Math.abs(f2) > 0.5f) {
            float f3 = this.scrollToBeConsumed;
            int P = y80.P(f3);
            LazyStaggeredGridMeasureResult copyWithScrollDeltaWithoutRemeasure = this.layoutInfoState.getValue().copyWithScrollDeltaWithoutRemeasure(P, !this.hasLookaheadOccurred);
            if (copyWithScrollDeltaWithoutRemeasure != null && (lazyStaggeredGridMeasureResult = this.approachLayoutInfo) != null) {
                LazyStaggeredGridMeasureResult copyWithScrollDeltaWithoutRemeasure2 = lazyStaggeredGridMeasureResult != null ? lazyStaggeredGridMeasureResult.copyWithScrollDeltaWithoutRemeasure(P, true) : null;
                if (copyWithScrollDeltaWithoutRemeasure2 != null) {
                    this.approachLayoutInfo = copyWithScrollDeltaWithoutRemeasure2;
                } else {
                    copyWithScrollDeltaWithoutRemeasure = null;
                }
            }
            if (copyWithScrollDeltaWithoutRemeasure != null) {
                applyMeasureResult$foundation(copyWithScrollDeltaWithoutRemeasure, this.hasLookaheadOccurred, true);
                ObservableScopeInvalidator.m946invalidateScopeimpl(this.placementScopeInvalidator);
                notifyPrefetch(f3 - this.scrollToBeConsumed, copyWithScrollDeltaWithoutRemeasure);
            } else {
                Remeasurement remeasurement = this.remeasurement;
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
                }
                notifyPrefetch$default(this, f3 - this.scrollToBeConsumed, null, 2, null);
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return f;
        }
        float f4 = f - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f4;
    }

    public static /* synthetic */ void requestScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        lazyStaggeredGridState.requestScrollToItem(i, i2);
    }

    public static /* synthetic */ Object scrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i, int i2, hm hmVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyStaggeredGridState.scrollToItem(i, i2, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scrollableState$lambda$0(LazyStaggeredGridState lazyStaggeredGridState, float f) {
        return -lazyStaggeredGridState.onScroll(-f);
    }

    private void setCanScrollBackward(boolean z) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z));
    }

    private void setCanScrollForward(boolean z) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z));
    }

    public final Object animateScrollToItem(int i, int i2, hm hmVar) {
        LazyStaggeredGridMeasureResult value = this.layoutInfoState.getValue();
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyStaggeredGridState$animateScrollToItem$2(this, i, i2, value.getSlots().getSizes().length * 100, value, null), hmVar, 1, null);
        return scroll$default == vn.d ? scroll$default : w01.a;
    }

    public final void applyMeasureResult$foundation(LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, boolean z, boolean z2) {
        if (!z && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = lazyStaggeredGridMeasureResult;
            return;
        }
        if (z) {
            this.hasLookaheadOccurred = true;
        }
        this.scrollToBeConsumed -= lazyStaggeredGridMeasureResult.getConsumedScroll();
        this.layoutInfoState.setValue(lazyStaggeredGridMeasureResult);
        LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = this.scrollPosition;
        if (z2) {
            lazyStaggeredGridScrollPosition.updateScrollOffset(lazyStaggeredGridMeasureResult.getFirstVisibleItemScrollOffsets());
        } else {
            lazyStaggeredGridScrollPosition.updateFromMeasureResult(lazyStaggeredGridMeasureResult);
            cancelPrefetchIfVisibleItemsChanged(lazyStaggeredGridMeasureResult);
        }
        setCanScrollBackward(lazyStaggeredGridMeasureResult.getCanScrollBackward());
        setCanScrollForward(lazyStaggeredGridMeasureResult.getCanScrollForward());
        if (z) {
            this._lazyLayoutScrollDeltaBetweenPasses.updateScrollDeltaForApproach$foundation(lazyStaggeredGridMeasureResult.getScrollBackAmount(), lazyStaggeredGridMeasureResult.getDensity(), lazyStaggeredGridMeasureResult.getCoroutineScope());
        }
        this.measurePassCount++;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.scrollableState.dispatchRawDelta(f);
    }

    public final LazyStaggeredGridMeasureResult getApproachLayoutInfo$foundation() {
        return this.approachLayoutInfo;
    }

    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation() {
        return this.awaitLayoutModifier;
    }

    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation() {
        return this.beyondBoundsInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    public final boolean getHasLookaheadOccurred$foundation() {
        return this.hasLookaheadOccurred;
    }

    public final InteractionSource getInteractionSource() {
        return this.mutableInteractionSource;
    }

    public final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> getItemAnimator$foundation() {
        return this.itemAnimator;
    }

    public final int getLaneCount$foundation() {
        return this.layoutInfoState.getValue().getSlots().getSizes().length;
    }

    public final LazyStaggeredGridLaneInfo getLaneInfo$foundation() {
        return this.laneInfo;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.scrollableState.getLastScrolledBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.scrollableState.getLastScrolledForward();
    }

    public final LazyStaggeredGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    public final int getMeasurePassCount$foundation() {
        return this.measurePassCount;
    }

    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final MutableState<w01> m982getMeasurementScopeInvalidatorzYiylxw$foundation() {
        return this.measurementScopeInvalidator;
    }

    public final MutableInteractionSource getMutableInteractionSource$foundation() {
        return this.mutableInteractionSource;
    }

    public final k10 getNearestRange$foundation() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public final LazyLayoutPinnedItemList getPinnedItems$foundation() {
        return this.pinnedItems;
    }

    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final MutableState<w01> m983getPlacementScopeInvalidatorzYiylxw$foundation() {
        return this.placementScopeInvalidator;
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation() {
        return this.prefetchState;
    }

    public final boolean getPrefetchingEnabled$foundation() {
        return this.prefetchingEnabled;
    }

    public final Remeasurement getRemeasurement$foundation() {
        return this.remeasurement;
    }

    public final RemeasurementModifier getRemeasurementModifier$foundation() {
        return this.remeasurementModifier;
    }

    public final float getScrollDeltaBetweenPasses$foundation() {
        return this._lazyLayoutScrollDeltaBetweenPasses.getScrollDeltaBetweenPasses$foundation();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public ScrollIndicatorState getScrollIndicatorState() {
        return this._scrollIndicatorState;
    }

    public final LazyStaggeredGridScrollPosition getScrollPosition$foundation() {
        return this.scrollPosition;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final void requestScrollToItem(int i, int i2) {
        if (isScrollInProgress()) {
            p01.t(this.layoutInfoState.getValue().getCoroutineScope(), null, null, new LazyStaggeredGridState$requestScrollToItem$1(this, null), 3);
        }
        snapToItemInternal$foundation(i, i2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r6.scroll(r7, r8, r0) != r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r9.waitForFirstLayout(r0) == r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object scroll(MutatePriority mutatePriority, my myVar, hm hmVar) {
        LazyStaggeredGridState$scroll$1 lazyStaggeredGridState$scroll$1;
        int i;
        if (hmVar instanceof LazyStaggeredGridState$scroll$1) {
            lazyStaggeredGridState$scroll$1 = (LazyStaggeredGridState$scroll$1) hmVar;
            int i2 = lazyStaggeredGridState$scroll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyStaggeredGridState$scroll$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lazyStaggeredGridState$scroll$1.result;
                i = lazyStaggeredGridState$scroll$1.label;
                vn vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    if (this.layoutInfoState.getValue() == LazyStaggeredGridMeasureResultKt.getEmptyLazyStaggeredGridLayoutInfo()) {
                        AwaitFirstLayoutModifier awaitFirstLayoutModifier = this.awaitLayoutModifier;
                        lazyStaggeredGridState$scroll$1.L$0 = mutatePriority;
                        lazyStaggeredGridState$scroll$1.L$1 = myVar;
                        lazyStaggeredGridState$scroll$1.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            p10.Q(obj);
                            return w01.a;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    myVar = (my) lazyStaggeredGridState$scroll$1.L$1;
                    mutatePriority = (MutatePriority) lazyStaggeredGridState$scroll$1.L$0;
                    p10.Q(obj);
                }
                ScrollableState scrollableState = this.scrollableState;
                lazyStaggeredGridState$scroll$1.L$0 = null;
                lazyStaggeredGridState$scroll$1.L$1 = null;
                lazyStaggeredGridState$scroll$1.label = 2;
            }
        }
        lazyStaggeredGridState$scroll$1 = new LazyStaggeredGridState$scroll$1(this, hmVar);
        Object obj2 = lazyStaggeredGridState$scroll$1.result;
        i = lazyStaggeredGridState$scroll$1.label;
        vn vnVar2 = vn.d;
        if (i != 0) {
        }
        ScrollableState scrollableState2 = this.scrollableState;
        lazyStaggeredGridState$scroll$1.L$0 = null;
        lazyStaggeredGridState$scroll$1.L$1 = null;
        lazyStaggeredGridState$scroll$1.label = 2;
    }

    public final float scrollToBeConsumed$foundation(boolean z) {
        return (z || !this.hasLookaheadOccurred) ? this.scrollToBeConsumed : getScrollDeltaBetweenPasses$foundation();
    }

    public final Object scrollToItem(int i, int i2, hm hmVar) {
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyStaggeredGridState$scrollToItem$2(this, i, i2, null), hmVar, 1, null);
        return scroll$default == vn.d ? scroll$default : w01.a;
    }

    public final void setMeasurePassCount$foundation(int i) {
        this.measurePassCount = i;
    }

    public final void setPrefetchingEnabled$foundation(boolean z) {
        this.prefetchingEnabled = z;
    }

    public final void snapToItemInternal$foundation(int i, int i2, boolean z) {
        boolean z2 = (this.scrollPosition.getIndex() == i && this.scrollPosition.getScrollOffset() == i2) ? false : true;
        if (z2) {
            this.itemAnimator.reset();
        }
        LazyStaggeredGridMeasureResult value = this.layoutInfoState.getValue();
        LazyStaggeredGridItemInfo findVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(value, i);
        if (findVisibleItem == null || !z2) {
            this.scrollPosition.requestPositionAndForgetLastKnownKey(i, i2);
        } else {
            int m7740getYimpl = (value.getOrientation() == Orientation.Vertical ? IntOffset.m7740getYimpl(findVisibleItem.mo964getOffsetnOccac()) : IntOffset.m7739getXimpl(findVisibleItem.mo964getOffsetnOccac())) + i2;
            int length = value.getFirstVisibleItemScrollOffsets().length;
            int[] iArr = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = value.getFirstVisibleItemScrollOffsets()[i3] + m7740getYimpl;
            }
            this.scrollPosition.updateScrollOffset(iArr);
        }
        if (!z) {
            ObservableScopeInvalidator.m946invalidateScopeimpl(this.measurementScopeInvalidator);
            return;
        }
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    public final int[] updateScrollPositionIfTheFirstItemWasMoved$foundation(LazyLayoutItemProvider lazyLayoutItemProvider, int[] iArr) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(lazyLayoutItemProvider, iArr);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Saver<LazyStaggeredGridState, Object> getSaver() {
            return LazyStaggeredGridState.Saver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LazyStaggeredGridState(int i, int i2, int i3, dq dqVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public LazyStaggeredGridState(int i, int i2) {
        this(new int[]{i}, new int[]{i2}, null);
    }
}
