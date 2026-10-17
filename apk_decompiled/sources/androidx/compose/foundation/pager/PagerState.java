package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ScrollIndicatorState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import defpackage.dq;
import defpackage.hm;
import defpackage.k10;
import defpackage.kp0;
import defpackage.ky;
import defpackage.lu0;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import defpackage.w30;
import defpackage.y80;
import defpackage.yi;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class PagerState implements ScrollableState {
    public static final int $stable = 0;
    private final PagerState$_scrollIndicatorState$1 _scrollIndicatorState;
    private float accumulator;
    private PagerMeasureResult approachLayoutInfo;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final PagerCacheWindowLogic cacheWindowLogic;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private Density density;
    private int firstVisiblePage;
    private int firstVisiblePageOffset;
    private boolean hasLookaheadOccurred;
    private int indexToPrefetch;
    private final MutableInteractionSource internalInteractionSource;
    private final MutableState<Boolean> isLastScrollBackwardState;
    private final MutableState<Boolean> isLastScrollForwardState;
    private int latestPageSizeWithSpacing;
    private int layoutWithMeasurement;
    private int layoutWithoutMeasurement;
    private long maxScrollOffset;
    private final MutableState<w01> measurementScopeInvalidator;
    private long minScrollOffset;
    private final PagerState$pagerCacheWindow$1 pagerCacheWindow;
    private MutableState<PagerMeasureResult> pagerLayoutInfoState;
    private final LazyLayoutPinnedItemList pinnedPages;
    private final MutableState<w01> placementScopeInvalidator;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private long premeasureConstraints;
    private float previousPassDelta;
    private final MutableIntState programmaticScrollTargetPage$delegate;
    private final MutableState remeasurement$delegate;
    private final RemeasurementModifier remeasurementModifier;
    private final PagerScrollPosition scrollPosition;
    private final ScrollableState scrollableState;
    private final State settledPage$delegate;
    private final MutableIntState settledPageState$delegate;
    private final State targetPage$delegate;
    private final MutableState upDownDifference$delegate;
    private boolean wasPrefetchingForward;

    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow, androidx.compose.foundation.pager.PagerState$pagerCacheWindow$1] */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.foundation.pager.PagerState$_scrollIndicatorState$1] */
    public PagerState(int i, float f, PrefetchScheduler prefetchScheduler) {
        PagerStateKt$UnitDensity$1 pagerStateKt$UnitDensity$1;
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            InlineClassHelperKt.throwIllegalArgumentException("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.upDownDifference$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4505boximpl(Offset.Companion.m4532getZeroF1C5BW0()), null, 2, null);
        PagerScrollPosition pagerScrollPosition = new PagerScrollPosition(i, f, this);
        this.scrollPosition = pagerScrollPosition;
        this.firstVisiblePage = i;
        this.maxScrollOffset = SnapshotId_jvmKt.SnapshotIdMax;
        final int i2 = 0;
        this.scrollableState = ScrollableStateKt.ScrollableState(new ky(this) { // from class: ue0
            public final /* synthetic */ PagerState e;

            {
                this.e = this;
            }

            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                float performScroll;
                w01 prefetchState$lambda$0;
                int i3 = i2;
                PagerState pagerState = this.e;
                switch (i3) {
                    case 0:
                        performScroll = pagerState.performScroll(((Float) obj).floatValue());
                        return Float.valueOf(performScroll);
                    default:
                        prefetchState$lambda$0 = PagerState.prefetchState$lambda$0(pagerState, (NestedPrefetchScope) obj);
                        return prefetchState$lambda$0;
                }
            }
        });
        final int i3 = 1;
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.pagerLayoutInfoState = SnapshotStateKt.mutableStateOf(PagerStateKt.getEmptyLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
        pagerStateKt$UnitDensity$1 = PagerStateKt.UnitDensity;
        this.density = pagerStateKt$UnitDensity$1;
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.programmaticScrollTargetPage$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.settledPageState$delegate = SnapshotIntStateKt.mutableIntStateOf(i);
        this.settledPage$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new w30(this, 2));
        this.targetPage$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new w30(this, 3));
        LazyLayoutPrefetchState lazyLayoutPrefetchState = new LazyLayoutPrefetchState(prefetchScheduler, new ky(this) { // from class: ue0
            public final /* synthetic */ PagerState e;

            {
                this.e = this;
            }

            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                float performScroll;
                w01 prefetchState$lambda$0;
                int i32 = i3;
                PagerState pagerState = this.e;
                switch (i32) {
                    case 0:
                        performScroll = pagerState.performScroll(((Float) obj).floatValue());
                        return Float.valueOf(performScroll);
                    default:
                        prefetchState$lambda$0 = PagerState.prefetchState$lambda$0(pagerState, (NestedPrefetchScope) obj);
                        return prefetchState$lambda$0;
                }
            }
        });
        this.prefetchState = lazyLayoutPrefetchState;
        ?? r12 = new LazyLayoutCacheWindow() { // from class: androidx.compose.foundation.pager.PagerState$pagerCacheWindow$1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
            public int calculateAheadWindow(Density density, int i4) {
                return PagerState.this.getLatestPageSizeWithSpacing$foundation();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
            public int calculateBehindWindow(Density density, int i4) {
                return 0;
            }
        };
        this.pagerCacheWindow = r12;
        this._scrollIndicatorState = new ScrollIndicatorState() { // from class: androidx.compose.foundation.pager.PagerState$_scrollIndicatorState$1
            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getContentSize() {
                return PagerLayoutInfoKt.calculateContentSize(PagerState.this.getLayoutInfo(), PagerState.this.getPageCount());
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getScrollOffset() {
                int calculateScrollOffset;
                calculateScrollOffset = PagerState.this.calculateScrollOffset();
                return calculateScrollOffset;
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getViewportSize() {
                return PagerLayoutInfoKt.getMainAxisViewportSize(PagerState.this.getLayoutInfo());
            }
        };
        this.cacheWindowLogic = new PagerCacheWindowLogic(r12, lazyLayoutPrefetchState, new w30(this, 4));
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.remeasurement$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                PagerState.this.setRemeasurement(remeasurement);
            }
        };
        this.premeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.pinnedPages = new LazyLayoutPinnedItemList();
        pagerScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m942constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m942constructorimpl$default(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLastScrollForwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLastScrollBackwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i, float f, AnimationSpec animationSpec, hm hmVar, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: animateScrollToPage");
            return null;
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return pagerState.animateScrollToPage(i, f, animationSpec, hmVar);
    }

    public static /* synthetic */ void applyMeasureResult$foundation$default(PagerState pagerState, PagerMeasureResult pagerMeasureResult, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: applyMeasureResult");
            return;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        pagerState.applyMeasureResult$foundation(pagerMeasureResult, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitScrollDependencies(hm hmVar) {
        Object waitForFirstLayout;
        return (this.pagerLayoutInfoState.getValue() == PagerStateKt.getEmptyLayoutInfo() && (waitForFirstLayout = this.awaitLayoutModifier.waitForFirstLayout(hmVar)) == vn.d) ? waitForFirstLayout : w01.a;
    }

    private final int calculatePrefetchIndex(boolean z, PagerLayoutInfo pagerLayoutInfo) {
        if (!z) {
            return (((PageInfo) yi.p0(pagerLayoutInfo.getVisiblePagesInfo())).getIndex() - pagerLayoutInfo.getBeyondViewportPageCount()) - 1;
        }
        int beyondViewportPageCount = pagerLayoutInfo.getBeyondViewportPageCount() + 1;
        if (beyondViewportPageCount < 0) {
            return Integer.MAX_VALUE;
        }
        return ((PageInfo) yi.v0(pagerLayoutInfo.getVisiblePagesInfo())).getIndex() + beyondViewportPageCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int calculateScrollOffset() {
        long pageSizeWithSpacing$foundation = (getPageSizeWithSpacing$foundation() * this.firstVisiblePage) + this.firstVisiblePageOffset;
        if (pageSizeWithSpacing$foundation > 2147483647L) {
            pageSizeWithSpacing$foundation = 2147483647L;
        }
        return (int) pageSizeWithSpacing$foundation;
    }

    private final void cancelPrefetchIfVisibleItemsChanged(PagerLayoutInfo pagerLayoutInfo) {
        if (this.indexToPrefetch == -1 || pagerLayoutInfo.getVisiblePagesInfo().isEmpty()) {
            return;
        }
        if (this.indexToPrefetch != calculatePrefetchIndex(this.wasPrefetchingForward, pagerLayoutInfo)) {
            this.indexToPrefetch = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceInPageRange(int i) {
        if (getPageCount() > 0) {
            return y80.h(i, 0, getPageCount() - 1);
        }
        return 0;
    }

    private final int getProgrammaticScrollTargetPage() {
        return this.programmaticScrollTargetPage$delegate.getIntValue();
    }

    private final int getSettledPageState() {
        return this.settledPageState$delegate.getIntValue();
    }

    private final boolean isGestureActionMatchesScroll(float f) {
        if (getLayoutInfo().getOrientation() == Orientation.Vertical) {
            if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (m1014getUpDownDifferenceF1C5BW0$foundation() & 4294967295L)))) {
                return true;
            }
        } else if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (m1014getUpDownDifferenceF1C5BW0$foundation() >> 32)))) {
            return true;
        }
        return isNotGestureAction$foundation();
    }

    public static /* synthetic */ int matchScrollPositionWithKey$foundation$default(PagerState pagerState, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: matchScrollPositionWithKey");
            return 0;
        }
        if ((i2 & 2) != 0) {
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int currentPage = pagerState.scrollPosition.getCurrentPage();
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                i = currentPage;
            } catch (Throwable th) {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                throw th;
            }
        }
        return pagerState.matchScrollPositionWithKey$foundation(pagerLazyLayoutItemProvider, i);
    }

    private final void notifyPrefetch(float f, PagerLayoutInfo pagerLayoutInfo) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (this.prefetchingEnabled && !pagerLayoutInfo.getVisiblePagesInfo().isEmpty()) {
            boolean z = f > 0.0f;
            int calculatePrefetchIndex = calculatePrefetchIndex(z, pagerLayoutInfo);
            if (calculatePrefetchIndex < 0 || calculatePrefetchIndex >= getPageCount()) {
                return;
            }
            if (calculatePrefetchIndex != this.indexToPrefetch) {
                if (this.wasPrefetchingForward != z && (prefetchHandle3 = this.currentPrefetchHandle) != null) {
                    prefetchHandle3.cancel();
                }
                this.wasPrefetchingForward = z;
                this.indexToPrefetch = calculatePrefetchIndex;
                this.currentPrefetchHandle = LazyLayoutPrefetchState.m932schedulePrecompositionAndPremeasureVKLhPVY$default(this.prefetchState, calculatePrefetchIndex, this.premeasureConstraints, null, 4, null);
            }
            if (z) {
                if ((((PageInfo) yi.v0(pagerLayoutInfo.getVisiblePagesInfo())).getOffset() + (pagerLayoutInfo.getPageSpacing() + pagerLayoutInfo.getPageSize())) - pagerLayoutInfo.getViewportEndOffset() >= f || (prefetchHandle2 = this.currentPrefetchHandle) == null) {
                    return;
                }
                prefetchHandle2.markAsUrgent();
                return;
            }
            if (pagerLayoutInfo.getViewportStartOffset() - ((PageInfo) yi.p0(pagerLayoutInfo.getVisiblePagesInfo())).getOffset() >= (-f) || (prefetchHandle = this.currentPrefetchHandle) == null) {
                return;
            }
            prefetchHandle.markAsUrgent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float performScroll(float f) {
        PagerMeasureResult pagerMeasureResult;
        long currentAbsoluteScrollOffset = PagerScrollPositionKt.currentAbsoluteScrollOffset(this);
        float f2 = this.accumulator + f;
        long Q = y80.Q(f2);
        this.accumulator = f2 - Q;
        if (Math.abs(f) < 1.0E-4f) {
            return f;
        }
        long j = currentAbsoluteScrollOffset + Q;
        long i = y80.i(j, this.minScrollOffset, this.maxScrollOffset);
        boolean z = j != i;
        long j2 = i - currentAbsoluteScrollOffset;
        float f3 = j2;
        this.previousPassDelta = f3;
        if (Math.abs(j2) != 0) {
            this.isLastScrollForwardState.setValue(Boolean.valueOf(f3 > 0.0f));
            this.isLastScrollBackwardState.setValue(Boolean.valueOf(f3 < 0.0f));
        }
        int i2 = (int) j2;
        int i3 = -i2;
        PagerMeasureResult copyWithScrollDeltaWithoutRemeasure = this.pagerLayoutInfoState.getValue().copyWithScrollDeltaWithoutRemeasure(i3);
        if (copyWithScrollDeltaWithoutRemeasure != null && (pagerMeasureResult = this.approachLayoutInfo) != null) {
            PagerMeasureResult copyWithScrollDeltaWithoutRemeasure2 = pagerMeasureResult != null ? pagerMeasureResult.copyWithScrollDeltaWithoutRemeasure(i3) : null;
            if (copyWithScrollDeltaWithoutRemeasure2 != null) {
                this.approachLayoutInfo = copyWithScrollDeltaWithoutRemeasure2;
            } else {
                copyWithScrollDeltaWithoutRemeasure = null;
            }
        }
        if (copyWithScrollDeltaWithoutRemeasure != null) {
            applyMeasureResult$foundation(copyWithScrollDeltaWithoutRemeasure, this.hasLookaheadOccurred, true);
            ObservableScopeInvalidator.m946invalidateScopeimpl(this.placementScopeInvalidator);
            this.layoutWithoutMeasurement++;
        } else {
            this.scrollPosition.applyScrollDelta(i2);
            Remeasurement remeasurement$foundation = getRemeasurement$foundation();
            if (remeasurement$foundation != null) {
                remeasurement$foundation.forceRemeasure();
            }
            this.layoutWithMeasurement++;
        }
        return (z ? Long.valueOf(j2) : Float.valueOf(f)).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 prefetchState$lambda$0(PagerState pagerState, NestedPrefetchScope nestedPrefetchScope) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            nestedPrefetchScope.schedulePrecomposition(pagerState.firstVisiblePage);
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            return w01.a;
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    public static /* synthetic */ void requestScrollToPage$default(PagerState pagerState, int i, float f, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: requestScrollToPage");
            return;
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        pagerState.requestScrollToPage(i, f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r9.scroll(r7, r8, r0) != r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r6.awaitScrollDependencies(r0) == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object scroll$suspendImpl(PagerState pagerState, MutatePriority mutatePriority, my myVar, hm hmVar) {
        PagerState$scroll$1 pagerState$scroll$1;
        int i;
        if (hmVar instanceof PagerState$scroll$1) {
            pagerState$scroll$1 = (PagerState$scroll$1) hmVar;
            int i2 = pagerState$scroll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pagerState$scroll$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pagerState$scroll$1.result;
                i = pagerState$scroll$1.label;
                vn vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    pagerState$scroll$1.L$0 = pagerState;
                    pagerState$scroll$1.L$1 = mutatePriority;
                    pagerState$scroll$1.L$2 = myVar;
                    pagerState$scroll$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pagerState = (PagerState) pagerState$scroll$1.L$0;
                        p10.Q(obj);
                        pagerState.setProgrammaticScrollTargetPage(-1);
                        return w01.a;
                    }
                    myVar = (my) pagerState$scroll$1.L$2;
                    mutatePriority = (MutatePriority) pagerState$scroll$1.L$1;
                    pagerState = (PagerState) pagerState$scroll$1.L$0;
                    p10.Q(obj);
                }
                if (!pagerState.isScrollInProgress()) {
                    pagerState.setSettledPageState(pagerState.getCurrentPage());
                }
                ScrollableState scrollableState = pagerState.scrollableState;
                pagerState$scroll$1.L$0 = pagerState;
                pagerState$scroll$1.L$1 = null;
                pagerState$scroll$1.L$2 = null;
                pagerState$scroll$1.label = 2;
            }
        }
        pagerState$scroll$1 = new PagerState$scroll$1(pagerState, hmVar);
        Object obj2 = pagerState$scroll$1.result;
        i = pagerState$scroll$1.label;
        vn vnVar2 = vn.d;
        if (i != 0) {
        }
        if (!pagerState.isScrollInProgress()) {
        }
        ScrollableState scrollableState2 = pagerState.scrollableState;
        pagerState$scroll$1.L$0 = pagerState;
        pagerState$scroll$1.L$1 = null;
        pagerState$scroll$1.L$2 = null;
        pagerState$scroll$1.label = 2;
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i, float f, hm hmVar, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: scrollToPage");
            return null;
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.scrollToPage(i, f, hmVar);
    }

    private final void setCanScrollBackward(boolean z) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setCanScrollForward(boolean z) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setProgrammaticScrollTargetPage(int i) {
        this.programmaticScrollTargetPage$delegate.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(Remeasurement remeasurement) {
        this.remeasurement$delegate.setValue(remeasurement);
    }

    private final void setSettledPageState(int i) {
        this.settledPageState$delegate.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int settledPage_delegate$lambda$0(PagerState pagerState) {
        return pagerState.isScrollInProgress() ? pagerState.getSettledPageState() : pagerState.getCurrentPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int targetPage_delegate$lambda$0(PagerState pagerState) {
        int currentPage;
        if (!pagerState.isScrollInProgress()) {
            currentPage = pagerState.getCurrentPage();
        } else if (pagerState.getProgrammaticScrollTargetPage() != -1) {
            currentPage = pagerState.getProgrammaticScrollTargetPage();
        } else if (Math.abs(pagerState.getCurrentPageOffsetFraction()) >= Math.abs(pagerState.getPositionThresholdFraction$foundation())) {
            boolean lastScrolledForward = pagerState.getLastScrolledForward();
            int i = pagerState.firstVisiblePage;
            currentPage = lastScrolledForward ? i + 1 : i;
        } else {
            currentPage = pagerState.getCurrentPage();
        }
        return pagerState.coerceInPageRange(currentPage);
    }

    private final void tryRunPrefetch(PagerMeasureResult pagerMeasureResult) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (!this.prefetchingEnabled) {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                return;
            }
            if (pagerMeasureResult.getBeyondViewportPageCount() >= getPageCount()) {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                return;
            }
            if (Math.abs(this.previousPassDelta) <= 0.5f) {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                return;
            }
            if (!isGestureActionMatchesScroll(this.previousPassDelta)) {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                return;
            }
            if (ComposeFoundationFlags.isCacheWindowForPagerEnabled) {
                this.cacheWindowLogic.onScroll(this.previousPassDelta, pagerMeasureResult);
            } else {
                notifyPrefetch(this.previousPassDelta, pagerMeasureResult);
            }
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    public static /* synthetic */ void updateCurrentPage$default(PagerState pagerState, ScrollScope scrollScope, int i, float f, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: updateCurrentPage");
            return;
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        pagerState.updateCurrentPage(scrollScope, i, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateScrollToPage(int i, float f, AnimationSpec<Float> animationSpec, hm hmVar) {
        PagerState$animateScrollToPage$1 pagerState$animateScrollToPage$1;
        int i2;
        AnimationSpec<Float> animationSpec2;
        double d;
        int i3 = i;
        float f2 = f;
        if (hmVar instanceof PagerState$animateScrollToPage$1) {
            pagerState$animateScrollToPage$1 = (PagerState$animateScrollToPage$1) hmVar;
            int i4 = pagerState$animateScrollToPage$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pagerState$animateScrollToPage$1.label = i4 - Integer.MIN_VALUE;
                PagerState$animateScrollToPage$1 pagerState$animateScrollToPage$12 = pagerState$animateScrollToPage$1;
                Object obj = pagerState$animateScrollToPage$12.result;
                i2 = pagerState$animateScrollToPage$12.label;
                w01 w01Var = w01.a;
                Object obj2 = vn.d;
                if (i2 != 0) {
                    p10.Q(obj);
                    if ((i3 == getCurrentPage() && getCurrentPageOffsetFraction() == f2) || getPageCount() == 0) {
                        return w01Var;
                    }
                    pagerState$animateScrollToPage$12.L$0 = animationSpec;
                    pagerState$animateScrollToPage$12.I$0 = i3;
                    pagerState$animateScrollToPage$12.F$0 = f2;
                    pagerState$animateScrollToPage$12.label = 1;
                    if (awaitScrollDependencies(pagerState$animateScrollToPage$12) != obj2) {
                        animationSpec2 = animationSpec;
                    }
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        p10.Q(obj);
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                float f3 = pagerState$animateScrollToPage$12.F$0;
                int i5 = pagerState$animateScrollToPage$12.I$0;
                animationSpec2 = (AnimationSpec) pagerState$animateScrollToPage$12.L$0;
                p10.Q(obj);
                f2 = f3;
                i3 = i5;
                d = f2;
                if (!(-0.5d > d && d <= 0.5d)) {
                    InlineClassHelperKt.throwIllegalArgumentException("pageOffsetFraction " + f2 + " is not within the range -0.5 to 0.5");
                }
                PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(this, coerceInPageRange(i3), getPageSizeWithSpacing$foundation() * f2, animationSpec2, null);
                pagerState$animateScrollToPage$12.L$0 = null;
                pagerState$animateScrollToPage$12.label = 2;
                return ScrollableState.scroll$default(this, null, pagerState$animateScrollToPage$3, pagerState$animateScrollToPage$12, 1, null) != obj2 ? obj2 : w01Var;
            }
        }
        pagerState$animateScrollToPage$1 = new PagerState$animateScrollToPage$1(this, hmVar);
        PagerState$animateScrollToPage$1 pagerState$animateScrollToPage$122 = pagerState$animateScrollToPage$1;
        Object obj3 = pagerState$animateScrollToPage$122.result;
        i2 = pagerState$animateScrollToPage$122.label;
        w01 w01Var2 = w01.a;
        Object obj22 = vn.d;
        if (i2 != 0) {
        }
        d = f2;
        if (!(-0.5d > d && d <= 0.5d)) {
        }
        PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$32 = new PagerState$animateScrollToPage$3(this, coerceInPageRange(i3), getPageSizeWithSpacing$foundation() * f2, animationSpec2, null);
        pagerState$animateScrollToPage$122.L$0 = null;
        pagerState$animateScrollToPage$122.label = 2;
        if (ScrollableState.scroll$default(this, null, pagerState$animateScrollToPage$32, pagerState$animateScrollToPage$122, 1, null) != obj22) {
        }
    }

    public final void applyMeasureResult$foundation(PagerMeasureResult pagerMeasureResult, boolean z, boolean z2) {
        long calculateNewMinScrollOffset;
        this.prefetchState.setIdealNestedPrefetchCount$foundation(pagerMeasureResult.getVisiblePagesInfo().size());
        this.latestPageSizeWithSpacing = pagerMeasureResult.getPageSpacing() + pagerMeasureResult.getPageSize();
        if (!z && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = pagerMeasureResult;
            return;
        }
        if (z) {
            this.hasLookaheadOccurred = true;
        }
        PagerScrollPosition pagerScrollPosition = this.scrollPosition;
        if (z2) {
            pagerScrollPosition.updateCurrentPageOffsetFraction(pagerMeasureResult.getCurrentPageOffsetFraction());
        } else {
            pagerScrollPosition.updateFromMeasureResult(pagerMeasureResult);
            if (!ComposeFoundationFlags.isCacheWindowForPagerEnabled) {
                cancelPrefetchIfVisibleItemsChanged(pagerMeasureResult);
            } else if (this.prefetchingEnabled) {
                this.cacheWindowLogic.onVisibleItemsChanged(pagerMeasureResult);
            }
        }
        this.pagerLayoutInfoState.setValue(pagerMeasureResult);
        setCanScrollForward(pagerMeasureResult.getCanScrollForward());
        setCanScrollBackward(pagerMeasureResult.getCanScrollBackward());
        MeasuredPage firstVisiblePage = pagerMeasureResult.getFirstVisiblePage();
        if (firstVisiblePage != null) {
            this.firstVisiblePage = firstVisiblePage.getIndex();
        }
        this.firstVisiblePageOffset = pagerMeasureResult.getFirstVisiblePageScrollOffset();
        tryRunPrefetch(pagerMeasureResult);
        this.maxScrollOffset = PagerStateKt.calculateNewMaxScrollOffset(pagerMeasureResult, getPageCount());
        calculateNewMinScrollOffset = PagerStateKt.calculateNewMinScrollOffset(pagerMeasureResult, getPageCount());
        long j = this.maxScrollOffset;
        if (calculateNewMinScrollOffset > j) {
            calculateNewMinScrollOffset = j;
        }
        this.minScrollOffset = calculateNewMinScrollOffset;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.scrollableState.dispatchRawDelta(f);
    }

    public final PagerMeasureResult getApproachLayoutInfo$foundation() {
        return this.approachLayoutInfo;
    }

    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation() {
        return this.awaitLayoutModifier;
    }

    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation() {
        return this.beyondBoundsInfo;
    }

    public final PagerCacheWindowLogic getCacheWindowLogic$foundation() {
        return this.cacheWindowLogic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final int getCurrentPage() {
        return this.scrollPosition.getCurrentPage();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.scrollPosition.getCurrentPageOffsetFraction();
    }

    public final Density getDensity$foundation() {
        return this.density;
    }

    public final int getFirstVisiblePage$foundation() {
        return this.firstVisiblePage;
    }

    public final int getFirstVisiblePageOffset$foundation() {
        return this.firstVisiblePageOffset;
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

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.isLastScrollBackwardState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.isLastScrollForwardState.getValue().booleanValue();
    }

    public final int getLatestPageSizeWithSpacing$foundation() {
        return this.latestPageSizeWithSpacing;
    }

    public final PagerLayoutInfo getLayoutInfo() {
        return this.pagerLayoutInfoState.getValue();
    }

    public final int getLayoutWithMeasurement$foundation() {
        return this.layoutWithMeasurement;
    }

    public final long getMaxScrollOffset$foundation() {
        return this.maxScrollOffset;
    }

    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final MutableState<w01> m1011getMeasurementScopeInvalidatorzYiylxw$foundation() {
        return this.measurementScopeInvalidator;
    }

    public final long getMinScrollOffset$foundation() {
        return this.minScrollOffset;
    }

    public final k10 getNearestRange$foundation() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation() {
        return this.layoutWithMeasurement + this.layoutWithoutMeasurement;
    }

    public final float getOffsetDistanceInPages(int i) {
        boolean z = false;
        if (i >= 0 && i <= getPageCount()) {
            z = true;
        }
        if (!z) {
            StringBuilder f = kp0.f(i, "page ", " is not within the range 0 to ");
            f.append(getPageCount());
            InlineClassHelperKt.throwIllegalArgumentException(f.toString());
        }
        return (i - getCurrentPage()) - getCurrentPageOffsetFraction();
    }

    public abstract int getPageCount();

    public final int getPageSize$foundation() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    public final int getPageSizeWithSpacing$foundation() {
        return getPageSpacing$foundation() + getPageSize$foundation();
    }

    public final int getPageSpacing$foundation() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    public final LazyLayoutPinnedItemList getPinnedPages$foundation() {
        return this.pinnedPages;
    }

    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final MutableState<w01> m1012getPlacementScopeInvalidatorzYiylxw$foundation() {
        return this.placementScopeInvalidator;
    }

    public final float getPositionThresholdFraction$foundation() {
        return Math.min(this.density.mo367toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation() / 2.0f) / getPageSize$foundation();
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation() {
        return this.prefetchState;
    }

    public final boolean getPrefetchingEnabled$foundation() {
        return this.prefetchingEnabled;
    }

    /* renamed from: getPremeasureConstraints-msEJaDk$foundation, reason: not valid java name */
    public final long m1013getPremeasureConstraintsmsEJaDk$foundation() {
        return this.premeasureConstraints;
    }

    public final Remeasurement getRemeasurement$foundation() {
        return (Remeasurement) this.remeasurement$delegate.getValue();
    }

    public final RemeasurementModifier getRemeasurementModifier$foundation() {
        return this.remeasurementModifier;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public ScrollIndicatorState getScrollIndicatorState() {
        return this._scrollIndicatorState;
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage$delegate.getValue()).intValue();
    }

    public final int getTargetPage() {
        return ((Number) this.targetPage$delegate.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getUpDownDifference-F1C5BW0$foundation, reason: not valid java name */
    public final long m1014getUpDownDifferenceF1C5BW0$foundation() {
        return ((Offset) this.upDownDifference$delegate.getValue()).m4526unboximpl();
    }

    public final boolean isNotGestureAction$foundation() {
        return ((int) Float.intBitsToFloat((int) (m1014getUpDownDifferenceF1C5BW0$foundation() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (m1014getUpDownDifferenceF1C5BW0$foundation() & 4294967295L))) == 0;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final int matchScrollPositionWithKey$foundation(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i) {
        return this.scrollPosition.matchPageWithKey(pagerLazyLayoutItemProvider, i);
    }

    public final void requestScrollToPage(int i, float f) {
        if (isScrollInProgress()) {
            p01.t(this.pagerLayoutInfoState.getValue().getCoroutineScope(), null, null, new PagerState$requestScrollToPage$1(this, null), 3);
        }
        snapToItem$foundation(i, f, false);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, my myVar, hm hmVar) {
        return scroll$suspendImpl(this, mutatePriority, myVar, hmVar);
    }

    public final Object scrollToPage(int i, float f, hm hmVar) {
        Object scroll$default = ScrollableState.scroll$default(this, null, new PagerState$scrollToPage$2(this, f, i, null), hmVar, 1, null);
        return scroll$default == vn.d ? scroll$default : w01.a;
    }

    public final void setDensity$foundation(Density density) {
        this.density = density;
    }

    public final void setLatestPageSizeWithSpacing$foundation(int i) {
        this.latestPageSizeWithSpacing = i;
    }

    public final void setMaxScrollOffset$foundation(long j) {
        this.maxScrollOffset = j;
    }

    public final void setMinScrollOffset$foundation(long j) {
        this.minScrollOffset = j;
    }

    public final void setPrefetchingEnabled$foundation(boolean z) {
        this.prefetchingEnabled = z;
    }

    /* renamed from: setPremeasureConstraints-BRTryo0$foundation, reason: not valid java name */
    public final void m1015setPremeasureConstraintsBRTryo0$foundation(long j) {
        this.premeasureConstraints = j;
    }

    /* renamed from: setUpDownDifference-k-4lQ0M$foundation, reason: not valid java name */
    public final void m1016setUpDownDifferencek4lQ0M$foundation(long j) {
        this.upDownDifference$delegate.setValue(Offset.m4505boximpl(j));
    }

    public final void snapToItem$foundation(int i, float f, boolean z) {
        if (this.scrollPosition.getCurrentPage() != i || this.scrollPosition.getCurrentPageOffsetFraction() != f) {
            this.cacheWindowLogic.resetStrategy();
        }
        this.scrollPosition.requestPositionAndForgetLastKnownKey(i, f);
        if (!z) {
            ObservableScopeInvalidator.m946invalidateScopeimpl(this.measurementScopeInvalidator);
            return;
        }
        Remeasurement remeasurement$foundation = getRemeasurement$foundation();
        if (remeasurement$foundation != null) {
            remeasurement$foundation.forceRemeasure();
        }
    }

    public final void updateCurrentPage(ScrollScope scrollScope, int i, float f) {
        snapToItem$foundation(i, f, true);
    }

    public final void updateTargetPage(ScrollScope scrollScope, int i) {
        setProgrammaticScrollTargetPage(coerceInPageRange(i));
    }

    public PagerState() {
        this(0, 0.0f, null, 7, null);
    }

    public /* synthetic */ PagerState(int i, float f, PrefetchScheduler prefetchScheduler, int i2, dq dqVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f, (i2 & 4) != 0 ? null : prefetchScheduler);
    }

    public /* synthetic */ PagerState(int i, float f, int i2, dq dqVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f);
    }

    public PagerState(int i, float f) {
        this(i, f, null);
    }
}
