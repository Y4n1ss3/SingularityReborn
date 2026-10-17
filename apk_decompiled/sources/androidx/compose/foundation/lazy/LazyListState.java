package androidx.compose.foundation.lazy;

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
import androidx.compose.ui.util.AndroidTrace_androidKt;
import defpackage.dq;
import defpackage.h;
import defpackage.hm;
import defpackage.hz;
import defpackage.k10;
import defpackage.ky;
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
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<LazyListState, ?> Saver = ListSaverKt.listSaver(new n30(4), new hz(15));
    private final LazyLayoutScrollDeltaBetweenPasses _lazyLayoutScrollDeltaBetweenPasses;
    private final LazyListState$_scrollIndicatorState$1 _scrollIndicatorState;
    private LazyListMeasureResult approachLayoutInfo;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private boolean executeRequestsInHighPriorityMode;
    private boolean hasLookaheadOccurred;
    private final MutableInteractionSource internalInteractionSource;
    private final LazyLayoutItemAnimator<LazyListMeasuredItem> itemAnimator;
    private final MutableState<LazyListMeasureResult> layoutInfoState;
    private final MutableState<w01> measurementScopeInvalidator;
    private int numMeasurePasses;
    private final LazyLayoutPinnedItemList pinnedItems;
    private final MutableState<w01> placementScopeInvalidator;
    private final LazyListPrefetchScope prefetchScope;
    private final LazyLayoutPrefetchState prefetchState;
    private final LazyListPrefetchStrategy prefetchStrategy;
    private boolean prefetchingEnabled;
    private Remeasurement remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyListScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;

    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.foundation.lazy.LazyListState$_scrollIndicatorState$1] */
    public LazyListState(int i, int i2, LazyListPrefetchStrategy lazyListPrefetchStrategy) {
        LazyListMeasureResult lazyListMeasureResult;
        this.prefetchStrategy = lazyListPrefetchStrategy;
        LazyListScrollPosition lazyListScrollPosition = new LazyListScrollPosition(i, i2);
        this.scrollPosition = lazyListScrollPosition;
        lazyListMeasureResult = LazyListStateKt.EmptyLazyListMeasureResult;
        this.layoutInfoState = SnapshotStateKt.mutableStateOf(lazyListMeasureResult, SnapshotStateKt.neverEqualPolicy());
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.scrollableState = ScrollableStateKt.ScrollableState(new h(this, 25));
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.LazyListState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                LazyListState.this.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.itemAnimator = new LazyLayoutItemAnimator<>();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchState = new LazyLayoutPrefetchState(lazyListPrefetchStrategy.getPrefetchScheduler(), new l00(this, i, 2));
        this.prefetchScope = new LazyListState$prefetchScope$1(this);
        this._scrollIndicatorState = new ScrollIndicatorState() { // from class: androidx.compose.foundation.lazy.LazyListState$_scrollIndicatorState$1
            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getContentSize() {
                return LazyListLayoutInfoKt.calculateContentSize(LazyListState.this.getLayoutInfo());
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getScrollOffset() {
                int calculateScrollOffset;
                calculateScrollOffset = LazyListState.this.calculateScrollOffset();
                return calculateScrollOffset;
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getViewportSize() {
                return LazyListLayoutInfoKt.getSingleAxisViewportSize(LazyListState.this.getLayoutInfo());
            }
        };
        this.pinnedItems = new LazyLayoutPinnedItemList();
        lazyListScrollPosition.getNearestRangeState();
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m942constructorimpl$default(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.placementScopeInvalidator = ObservableScopeInvalidator.m942constructorimpl$default(null, 1, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new LazyLayoutScrollDeltaBetweenPasses();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Saver$lambda$0(SaverScope saverScope, LazyListState lazyListState) {
        return y80.E(Integer.valueOf(lazyListState.getFirstVisibleItemIndex()), Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyListState Saver$lambda$1(List list) {
        return new LazyListState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyListState lazyListState, int i, int i2, hm hmVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyListState.animateScrollToItem(i, i2, hmVar);
    }

    public static /* synthetic */ void applyMeasureResult$foundation$default(LazyListState lazyListState, LazyListMeasureResult lazyListMeasureResult, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        lazyListState.applyMeasureResult$foundation(lazyListMeasureResult, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int calculateScrollOffset() {
        return getFirstVisibleItemScrollOffset() + (getFirstVisibleItemIndex() * LazyListLayoutInfoKt.visibleItemsAverageSize(getLayoutInfo()));
    }

    private final void notifyPrefetchOnScroll(float f, LazyListLayoutInfo lazyListLayoutInfo) {
        if (this.prefetchingEnabled) {
            this.prefetchStrategy.onScroll(this.prefetchScope, f, lazyListLayoutInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 prefetchState$lambda$0(LazyListState lazyListState, int i, NestedPrefetchScope nestedPrefetchScope) {
        LazyListPrefetchStrategy lazyListPrefetchStrategy = lazyListState.prefetchStrategy;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        companion.restoreNonObservable(currentThreadSnapshot, companion.makeCurrentNonObservable(currentThreadSnapshot), currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null);
        lazyListPrefetchStrategy.onNestedPrefetch(nestedPrefetchScope, i);
        return w01.a;
    }

    public static /* synthetic */ void requestScrollToItem$default(LazyListState lazyListState, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        lazyListState.requestScrollToItem(i, i2);
    }

    public static /* synthetic */ Object scrollToItem$default(LazyListState lazyListState, int i, int i2, hm hmVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyListState.scrollToItem(i, i2, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scrollableState$lambda$0(LazyListState lazyListState, float f) {
        return -lazyListState.onScroll$foundation(-f);
    }

    private void setCanScrollBackward(boolean z) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z));
    }

    private void setCanScrollForward(boolean z) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z));
    }

    private final void traceVisibleItems(LazyListMeasureResult lazyListMeasureResult) {
        LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) yi.q0(lazyListMeasureResult.getVisibleItemsInfo());
        LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) yi.w0(lazyListMeasureResult.getVisibleItemsInfo());
        AndroidTrace_androidKt.traceValue("firstVisibleItem:index", lazyListMeasuredItem != null ? lazyListMeasuredItem.getIndex() : -1L);
        AndroidTrace_androidKt.traceValue("lastVisibleItem:index", lazyListMeasuredItem2 != null ? lazyListMeasuredItem2.getIndex() : -1L);
    }

    public final Object animateScrollToItem(int i, int i2, hm hmVar) {
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyListState$animateScrollToItem$2(this, i, i2, null), hmVar, 1, null);
        return scroll$default == vn.d ? scroll$default : w01.a;
    }

    public final void applyMeasureResult$foundation(LazyListMeasureResult lazyListMeasureResult, boolean z, boolean z2) {
        LazyListMeasuredItem firstVisibleItem;
        this.prefetchState.setIdealNestedPrefetchCount$foundation(lazyListMeasureResult.getVisibleItemsInfo().size());
        if (!z && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = lazyListMeasureResult;
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                if (this._lazyLayoutScrollDeltaBetweenPasses.isActive$foundation() && (firstVisibleItem = lazyListMeasureResult.getFirstVisibleItem()) != null && firstVisibleItem.getIndex() == this.scrollPosition.getIndex() && lazyListMeasureResult.getFirstVisibleItemScrollOffset() == this.scrollPosition.getScrollOffset()) {
                    this._lazyLayoutScrollDeltaBetweenPasses.stop$foundation();
                }
                return;
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            }
        }
        if (z) {
            this.hasLookaheadOccurred = true;
        }
        setCanScrollBackward(lazyListMeasureResult.getCanScrollBackward());
        setCanScrollForward(lazyListMeasureResult.getCanScrollForward());
        this.scrollToBeConsumed -= lazyListMeasureResult.getConsumedScroll();
        this.layoutInfoState.setValue(lazyListMeasureResult);
        if (z2) {
            this.scrollPosition.updateScrollOffset(lazyListMeasureResult.getFirstVisibleItemScrollOffset());
        } else {
            traceVisibleItems(lazyListMeasureResult);
            this.scrollPosition.updateFromMeasureResult(lazyListMeasureResult);
            if (this.prefetchingEnabled) {
                this.prefetchStrategy.onVisibleItemsUpdated(this.prefetchScope, lazyListMeasureResult);
            }
        }
        if (z) {
            this._lazyLayoutScrollDeltaBetweenPasses.updateScrollDeltaForApproach$foundation(lazyListMeasureResult.getScrollBackAmount(), lazyListMeasureResult.getDensity(), lazyListMeasureResult.getCoroutineScope());
        }
        this.numMeasurePasses++;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.scrollableState.dispatchRawDelta(f);
    }

    public final LazyListMeasureResult getApproachLayoutInfo$foundation() {
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

    public final LazyLayoutItemAnimator<LazyListMeasuredItem> getItemAnimator$foundation() {
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

    public final LazyListLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final MutableState<w01> m876getMeasurementScopeInvalidatorzYiylxw$foundation() {
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
    public final MutableState<w01> m877getPlacementScopeInvalidatorzYiylxw$foundation() {
        return this.placementScopeInvalidator;
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation() {
        return this.prefetchState;
    }

    public final LazyListPrefetchStrategy getPrefetchStrategy$foundation() {
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

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final float onScroll$foundation(float f) {
        LazyListMeasureResult lazyListMeasureResult;
        if ((f < 0.0f && !getCanScrollForward()) || (f > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (!(Math.abs(this.scrollToBeConsumed) <= 0.5f)) {
            InlineClassHelperKt.throwIllegalStateException("entered drag with non-zero pending scroll");
        }
        this.executeRequestsInHighPriorityMode = true;
        float f2 = this.scrollToBeConsumed + f;
        this.scrollToBeConsumed = f2;
        if (Math.abs(f2) > 0.5f) {
            float f3 = this.scrollToBeConsumed;
            int round = Math.round(f3);
            LazyListMeasureResult copyWithScrollDeltaWithoutRemeasure = this.layoutInfoState.getValue().copyWithScrollDeltaWithoutRemeasure(round, !this.hasLookaheadOccurred);
            if (copyWithScrollDeltaWithoutRemeasure != null && (lazyListMeasureResult = this.approachLayoutInfo) != null) {
                LazyListMeasureResult copyWithScrollDeltaWithoutRemeasure2 = lazyListMeasureResult != null ? lazyListMeasureResult.copyWithScrollDeltaWithoutRemeasure(round, true) : null;
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
            p01.t(this.layoutInfoState.getValue().getCoroutineScope(), null, null, new LazyListState$requestScrollToItem$1(this, null), 3);
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
        LazyListState$scroll$1 lazyListState$scroll$1;
        int i;
        LazyListMeasureResult lazyListMeasureResult;
        if (hmVar instanceof LazyListState$scroll$1) {
            lazyListState$scroll$1 = (LazyListState$scroll$1) hmVar;
            int i2 = lazyListState$scroll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyListState$scroll$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lazyListState$scroll$1.result;
                i = lazyListState$scroll$1.label;
                vn vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    LazyListMeasureResult value = this.layoutInfoState.getValue();
                    lazyListMeasureResult = LazyListStateKt.EmptyLazyListMeasureResult;
                    if (value == lazyListMeasureResult) {
                        AwaitFirstLayoutModifier awaitFirstLayoutModifier = this.awaitLayoutModifier;
                        lazyListState$scroll$1.L$0 = mutatePriority;
                        lazyListState$scroll$1.L$1 = myVar;
                        lazyListState$scroll$1.label = 1;
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
                    myVar = (my) lazyListState$scroll$1.L$1;
                    mutatePriority = (MutatePriority) lazyListState$scroll$1.L$0;
                    p10.Q(obj);
                }
                ScrollableState scrollableState = this.scrollableState;
                lazyListState$scroll$1.L$0 = null;
                lazyListState$scroll$1.L$1 = null;
                lazyListState$scroll$1.label = 2;
            }
        }
        lazyListState$scroll$1 = new LazyListState$scroll$1(this, hmVar);
        Object obj2 = lazyListState$scroll$1.result;
        i = lazyListState$scroll$1.label;
        vn vnVar2 = vn.d;
        if (i != 0) {
        }
        ScrollableState scrollableState2 = this.scrollableState;
        lazyListState$scroll$1.L$0 = null;
        lazyListState$scroll$1.L$1 = null;
        lazyListState$scroll$1.label = 2;
    }

    public final Object scrollToItem(int i, int i2, hm hmVar) {
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyListState$scrollToItem$2(this, i, i2, null), hmVar, 1, null);
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

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation(LazyListItemProvider lazyListItemProvider, int i) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(lazyListItemProvider, i);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List saver$lambda$0(SaverScope saverScope, LazyListState lazyListState) {
            return y80.E(Integer.valueOf(lazyListState.getFirstVisibleItemIndex()), Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LazyListState saver$lambda$1(LazyListPrefetchStrategy lazyListPrefetchStrategy, List list) {
            return new LazyListState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), lazyListPrefetchStrategy);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List saver$lambda$2(SaverScope saverScope, LazyListState lazyListState) {
            return y80.E(Integer.valueOf(lazyListState.getFirstVisibleItemIndex()), Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LazyListState saver$lambda$3(LazyLayoutCacheWindow lazyLayoutCacheWindow, List list) {
            return new LazyListState(lazyLayoutCacheWindow, ((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }

        public final Saver<LazyListState, ?> getSaver() {
            return LazyListState.Saver;
        }

        public final Saver<LazyListState, ?> saver$foundation(LazyListPrefetchStrategy lazyListPrefetchStrategy) {
            return ListSaverKt.listSaver(new n30(5), new h(lazyListPrefetchStrategy, 26));
        }

        private Companion() {
        }

        public final Saver<LazyListState, ?> saver$foundation(LazyLayoutCacheWindow lazyLayoutCacheWindow) {
            return ListSaverKt.listSaver(new n30(6), new r30(lazyLayoutCacheWindow, 1));
        }
    }

    public static /* synthetic */ void getPrefetchState$foundation$annotations() {
    }

    public LazyListState() {
        this(0, 0, (LazyListPrefetchStrategy) null, 7, (dq) null);
    }

    public /* synthetic */ LazyListState(int i, int i2, LazyListPrefetchStrategy lazyListPrefetchStrategy, int i3, dq dqVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? LazyListPrefetchStrategyKt.LazyListPrefetchStrategy$default(0, 1, null) : lazyListPrefetchStrategy);
    }

    public /* synthetic */ LazyListState(LazyLayoutCacheWindow lazyLayoutCacheWindow, int i, int i2, int i3, dq dqVar) {
        this(lazyLayoutCacheWindow, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }

    public LazyListState(LazyLayoutCacheWindow lazyLayoutCacheWindow, int i, int i2) {
        this(i, i2, new LazyListCacheWindowStrategy(lazyLayoutCacheWindow));
    }

    public /* synthetic */ LazyListState(int i, int i2, int i3, dq dqVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public LazyListState(int i, int i2) {
        this(i, i2, LazyListPrefetchStrategyKt.LazyListPrefetchStrategy$default(0, 1, null));
    }
}
