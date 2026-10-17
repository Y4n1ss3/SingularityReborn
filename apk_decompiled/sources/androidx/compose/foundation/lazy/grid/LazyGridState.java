package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ScrollIndicatorState;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Density;
import defpackage.dq;
import defpackage.h;
import defpackage.hm;
import defpackage.hz;
import defpackage.k10;
import defpackage.l00;
import defpackage.my;
import defpackage.n30;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.r30;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<LazyGridState, ?> Saver = ListSaverKt.listSaver(new n30(1), new hz(10));
    private final LazyLayoutScrollDeltaBetweenPasses _lazyLayoutScrollDeltaBetweenPasses;
    private final LazyGridState$_scrollIndicatorState$1 _scrollIndicatorState;
    private LazyGridMeasureResult approachLayoutInfo;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private boolean executeRequestsInHighPriorityMode;
    private boolean hasLookaheadOccurred;
    private final MutableInteractionSource internalInteractionSource;
    private final LazyLayoutItemAnimator<LazyGridMeasuredItem> itemAnimator;
    private final MutableState<LazyGridMeasureResult> layoutInfoState;
    private final MutableState<w01> measurementScopeInvalidator;
    private int numMeasurePasses;
    private final LazyLayoutPinnedItemList pinnedItems;
    private final MutableState<w01> placementScopeInvalidator;
    private final LazyGridPrefetchScope prefetchScope;
    private final LazyLayoutPrefetchState prefetchState;
    private final LazyGridPrefetchStrategy prefetchStrategy;
    private boolean prefetchingEnabled;
    private Remeasurement remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.foundation.lazy.grid.LazyGridState$_scrollIndicatorState$1] */
    public LazyGridState(int i, int i2, LazyGridPrefetchStrategy lazyGridPrefetchStrategy) {
        LazyGridMeasureResult lazyGridMeasureResult;
        this.prefetchStrategy = lazyGridPrefetchStrategy;
        LazyGridScrollPosition lazyGridScrollPosition = new LazyGridScrollPosition(i, i2);
        this.scrollPosition = lazyGridScrollPosition;
        lazyGridMeasureResult = LazyGridStateKt.EmptyLazyGridLayoutInfo;
        this.layoutInfoState = SnapshotStateKt.mutableStateOf(lazyGridMeasureResult, SnapshotStateKt.neverEqualPolicy());
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.scrollableState = ScrollableStateKt.ScrollableState(new h(this, 22));
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                LazyGridState.this.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.itemAnimator = new LazyLayoutItemAnimator<>();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchState = new LazyLayoutPrefetchState(lazyGridPrefetchStrategy.getPrefetchScheduler(), new l00(this, i, 1));
        this.prefetchScope = new LazyGridState$prefetchScope$1(this);
        this._scrollIndicatorState = new ScrollIndicatorState() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$_scrollIndicatorState$1
            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getContentSize() {
                return LazyGridLayoutInfoKt.calculateContentSize(LazyGridState.this.getLayoutInfo());
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getScrollOffset() {
                int calculateScrollOffset;
                calculateScrollOffset = LazyGridState.this.calculateScrollOffset();
                return calculateScrollOffset;
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getViewportSize() {
                return LazyGridLayoutInfoKt.getSingleAxisViewportSize(LazyGridState.this.getLayoutInfo());
            }
        };
        this.pinnedItems = new LazyLayoutPinnedItemList();
        lazyGridScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m942constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m942constructorimpl$default(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new LazyLayoutScrollDeltaBetweenPasses();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Saver$lambda$0(SaverScope saverScope, LazyGridState lazyGridState) {
        return y80.E(Integer.valueOf(lazyGridState.getFirstVisibleItemIndex()), Integer.valueOf(lazyGridState.getFirstVisibleItemScrollOffset()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridState Saver$lambda$1(List list) {
        return new LazyGridState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyGridState lazyGridState, int i, int i2, hm hmVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyGridState.animateScrollToItem(i, i2, hmVar);
    }

    public static /* synthetic */ void applyMeasureResult$foundation$default(LazyGridState lazyGridState, LazyGridMeasureResult lazyGridMeasureResult, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        lazyGridState.applyMeasureResult$foundation(lazyGridMeasureResult, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int calculateScrollOffset() {
        LazyGridLayoutInfo layoutInfo = getLayoutInfo();
        return getFirstVisibleItemScrollOffset() + (LazyGridLayoutInfoKt.getFirstVisibleItemLineIndex(layoutInfo) * LazyGridLayoutInfoKt.visibleLinesAverageMainAxisSize(layoutInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getNumOfItemsToTeleport() {
        return getSlotsPerLine$foundation() * 100;
    }

    private final void notifyPrefetchOnScroll(float f, LazyGridLayoutInfo lazyGridLayoutInfo) {
        if (this.prefetchingEnabled) {
            this.prefetchStrategy.onScroll(this.prefetchScope, f, lazyGridLayoutInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 prefetchState$lambda$0(LazyGridState lazyGridState, int i, NestedPrefetchScope nestedPrefetchScope) {
        LazyGridPrefetchStrategy lazyGridPrefetchStrategy = lazyGridState.prefetchStrategy;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        companion.restoreNonObservable(currentThreadSnapshot, companion.makeCurrentNonObservable(currentThreadSnapshot), currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null);
        lazyGridPrefetchStrategy.onNestedPrefetch(nestedPrefetchScope, i);
        return w01.a;
    }

    public static /* synthetic */ void requestScrollToItem$default(LazyGridState lazyGridState, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        lazyGridState.requestScrollToItem(i, i2);
    }

    public static /* synthetic */ Object scrollToItem$default(LazyGridState lazyGridState, int i, int i2, hm hmVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyGridState.scrollToItem(i, i2, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scrollableState$lambda$0(LazyGridState lazyGridState, float f) {
        return -lazyGridState.onScroll$foundation(-f);
    }

    private void setCanScrollBackward(boolean z) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z));
    }

    private void setCanScrollForward(boolean z) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z));
    }

    public final Object animateScrollToItem(int i, int i2, hm hmVar) {
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyGridState$animateScrollToItem$2(this, i, i2, null), hmVar, 1, null);
        return scroll$default == vn.d ? scroll$default : w01.a;
    }

    public final void applyMeasureResult$foundation(LazyGridMeasureResult lazyGridMeasureResult, boolean z, boolean z2) {
        this.prefetchState.setIdealNestedPrefetchCount$foundation(lazyGridMeasureResult.getVisibleItemsInfo().size());
        if (!z && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = lazyGridMeasureResult;
            return;
        }
        if (z) {
            this.hasLookaheadOccurred = true;
        }
        this.scrollToBeConsumed -= lazyGridMeasureResult.getConsumedScroll();
        this.layoutInfoState.setValue(lazyGridMeasureResult);
        setCanScrollBackward(lazyGridMeasureResult.getCanScrollBackward());
        setCanScrollForward(lazyGridMeasureResult.getCanScrollForward());
        LazyGridScrollPosition lazyGridScrollPosition = this.scrollPosition;
        if (z2) {
            lazyGridScrollPosition.updateScrollOffset(lazyGridMeasureResult.getFirstVisibleLineScrollOffset());
        } else {
            lazyGridScrollPosition.updateFromMeasureResult(lazyGridMeasureResult);
            if (this.prefetchingEnabled) {
                this.prefetchStrategy.onVisibleItemsUpdated(this.prefetchScope, lazyGridMeasureResult);
            }
        }
        if (z) {
            this._lazyLayoutScrollDeltaBetweenPasses.updateScrollDeltaForApproach$foundation(lazyGridMeasureResult.getScrollBackAmount(), lazyGridMeasureResult.getDensity(), lazyGridMeasureResult.getCoroutineScope());
        }
        this.numMeasurePasses++;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.scrollableState.dispatchRawDelta(f);
    }

    public final LazyGridMeasureResult getApproachLayoutInfo$foundation() {
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

    public final Density getDensity$foundation() {
        return this.layoutInfoState.getValue().getDensity();
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
        return this.internalInteractionSource;
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation() {
        return this.internalInteractionSource;
    }

    public final LazyLayoutItemAnimator<LazyGridMeasuredItem> getItemAnimator$foundation() {
        return this.itemAnimator;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.scrollableState.getLastScrolledBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.scrollableState.getLastScrolledForward();
    }

    public final LazyGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final MutableState<w01> m900getMeasurementScopeInvalidatorzYiylxw$foundation() {
        return this.measurementScopeInvalidator;
    }

    public final k10 getNearestRange$foundation() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation() {
        return this.numMeasurePasses;
    }

    public final LazyLayoutPinnedItemList getPinnedItems$foundation() {
        return this.pinnedItems;
    }

    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final MutableState<w01> m901getPlacementScopeInvalidatorzYiylxw$foundation() {
        return this.placementScopeInvalidator;
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation() {
        return this.prefetchState;
    }

    public final LazyGridPrefetchStrategy getPrefetchStrategy$foundation() {
        return this.prefetchStrategy;
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

    public final float getScrollToBeConsumed$foundation() {
        return this.scrollToBeConsumed;
    }

    public final int getSlotsPerLine$foundation() {
        return this.layoutInfoState.getValue().getSlotsPerLine();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final float onScroll$foundation(float f) {
        LazyGridMeasureResult lazyGridMeasureResult;
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
            LazyGridMeasureResult copyWithScrollDeltaWithoutRemeasure = this.layoutInfoState.getValue().copyWithScrollDeltaWithoutRemeasure(P, !this.hasLookaheadOccurred);
            if (copyWithScrollDeltaWithoutRemeasure != null && (lazyGridMeasureResult = this.approachLayoutInfo) != null) {
                LazyGridMeasureResult copyWithScrollDeltaWithoutRemeasure2 = lazyGridMeasureResult != null ? lazyGridMeasureResult.copyWithScrollDeltaWithoutRemeasure(P, true) : null;
                if (copyWithScrollDeltaWithoutRemeasure2 != null) {
                    this.approachLayoutInfo = copyWithScrollDeltaWithoutRemeasure2;
                } else {
                    copyWithScrollDeltaWithoutRemeasure = null;
                }
            }
            if (copyWithScrollDeltaWithoutRemeasure != null) {
                applyMeasureResult$foundation(copyWithScrollDeltaWithoutRemeasure, this.hasLookaheadOccurred, true);
                ObservableScopeInvalidator.m946invalidateScopeimpl(this.placementScopeInvalidator);
                notifyPrefetchOnScroll(f3 - this.scrollToBeConsumed, copyWithScrollDeltaWithoutRemeasure);
            } else {
                Remeasurement remeasurement = this.remeasurement;
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
                }
                notifyPrefetchOnScroll(f3 - this.scrollToBeConsumed, getLayoutInfo());
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return f;
        }
        float f4 = f - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f4;
    }

    public final void requestScrollToItem(int i, int i2) {
        if (isScrollInProgress()) {
            p01.t(this.layoutInfoState.getValue().getCoroutineScope(), null, null, new LazyGridState$requestScrollToItem$1(this, null), 3);
        }
        snapToItemIndexInternal$foundation(i, i2, false);
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
        LazyGridState$scroll$1 lazyGridState$scroll$1;
        int i;
        LazyGridMeasureResult lazyGridMeasureResult;
        if (hmVar instanceof LazyGridState$scroll$1) {
            lazyGridState$scroll$1 = (LazyGridState$scroll$1) hmVar;
            int i2 = lazyGridState$scroll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyGridState$scroll$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lazyGridState$scroll$1.result;
                i = lazyGridState$scroll$1.label;
                vn vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    LazyGridMeasureResult value = this.layoutInfoState.getValue();
                    lazyGridMeasureResult = LazyGridStateKt.EmptyLazyGridLayoutInfo;
                    if (value == lazyGridMeasureResult) {
                        AwaitFirstLayoutModifier awaitFirstLayoutModifier = this.awaitLayoutModifier;
                        lazyGridState$scroll$1.L$0 = mutatePriority;
                        lazyGridState$scroll$1.L$1 = myVar;
                        lazyGridState$scroll$1.label = 1;
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
                    myVar = (my) lazyGridState$scroll$1.L$1;
                    mutatePriority = (MutatePriority) lazyGridState$scroll$1.L$0;
                    p10.Q(obj);
                }
                ScrollableState scrollableState = this.scrollableState;
                lazyGridState$scroll$1.L$0 = null;
                lazyGridState$scroll$1.L$1 = null;
                lazyGridState$scroll$1.label = 2;
            }
        }
        lazyGridState$scroll$1 = new LazyGridState$scroll$1(this, hmVar);
        Object obj2 = lazyGridState$scroll$1.result;
        i = lazyGridState$scroll$1.label;
        vn vnVar2 = vn.d;
        if (i != 0) {
        }
        ScrollableState scrollableState2 = this.scrollableState;
        lazyGridState$scroll$1.L$0 = null;
        lazyGridState$scroll$1.L$1 = null;
        lazyGridState$scroll$1.label = 2;
    }

    public final Object scrollToItem(int i, int i2, hm hmVar) {
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyGridState$scrollToItem$2(this, i, i2, null), hmVar, 1, null);
        return scroll$default == vn.d ? scroll$default : w01.a;
    }

    public final void setPrefetchingEnabled$foundation(boolean z) {
        this.prefetchingEnabled = z;
    }

    public final void snapToItemIndexInternal$foundation(int i, int i2, boolean z) {
        if (this.scrollPosition.getIndex() != i || this.scrollPosition.getScrollOffset() != i2) {
            this.itemAnimator.reset();
            Object obj = this.prefetchStrategy;
            CacheWindowLogic cacheWindowLogic = obj instanceof CacheWindowLogic ? (CacheWindowLogic) obj : null;
            if (cacheWindowLogic != null) {
                cacheWindowLogic.resetStrategy();
            }
        }
        this.scrollPosition.requestPositionAndForgetLastKnownKey(i, i2);
        if (!z) {
            ObservableScopeInvalidator.m946invalidateScopeimpl(this.measurementScopeInvalidator);
            return;
        }
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation(LazyGridItemProvider lazyGridItemProvider, int i) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(lazyGridItemProvider, i);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List saver$lambda$0(SaverScope saverScope, LazyGridState lazyGridState) {
            return y80.E(Integer.valueOf(lazyGridState.getFirstVisibleItemIndex()), Integer.valueOf(lazyGridState.getFirstVisibleItemScrollOffset()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LazyGridState saver$lambda$1(LazyGridPrefetchStrategy lazyGridPrefetchStrategy, List list) {
            return new LazyGridState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), lazyGridPrefetchStrategy);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List saver$lambda$2(SaverScope saverScope, LazyGridState lazyGridState) {
            return y80.E(Integer.valueOf(lazyGridState.getFirstVisibleItemIndex()), Integer.valueOf(lazyGridState.getFirstVisibleItemScrollOffset()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LazyGridState saver$lambda$3(LazyLayoutCacheWindow lazyLayoutCacheWindow, List list) {
            return new LazyGridState(lazyLayoutCacheWindow, ((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }

        public final Saver<LazyGridState, ?> getSaver() {
            return LazyGridState.Saver;
        }

        public final Saver<LazyGridState, ?> saver$foundation(LazyGridPrefetchStrategy lazyGridPrefetchStrategy) {
            return ListSaverKt.listSaver(new n30(3), new h(lazyGridPrefetchStrategy, 23));
        }

        private Companion() {
        }

        public final Saver<LazyGridState, ?> saver$foundation(LazyLayoutCacheWindow lazyLayoutCacheWindow) {
            return ListSaverKt.listSaver(new n30(2), new r30(lazyLayoutCacheWindow, 0));
        }
    }

    public static /* synthetic */ void getPrefetchState$foundation$annotations() {
    }

    public LazyGridState() {
        this(0, 0, (LazyGridPrefetchStrategy) null, 7, (dq) null);
    }

    public /* synthetic */ LazyGridState(int i, int i2, LazyGridPrefetchStrategy lazyGridPrefetchStrategy, int i3, dq dqVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? LazyGridPrefetchStrategyKt.LazyGridPrefetchStrategy$default(0, 1, null) : lazyGridPrefetchStrategy);
    }

    public /* synthetic */ LazyGridState(LazyLayoutCacheWindow lazyLayoutCacheWindow, int i, int i2, int i3, dq dqVar) {
        this(lazyLayoutCacheWindow, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }

    public LazyGridState(LazyLayoutCacheWindow lazyLayoutCacheWindow, int i, int i2) {
        this(i, i2, new LazyGridCacheWindowPrefetchStrategy(lazyLayoutCacheWindow));
    }

    public /* synthetic */ LazyGridState(int i, int i2, int i3, dq dqVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public LazyGridState(int i, int i2) {
        this(i, i2, LazyGridPrefetchStrategyKt.LazyGridPrefetchStrategy$default(0, 1, null));
    }
}
