package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.StickyItemsPlacement;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import defpackage.iy;
import defpackage.ky;
import defpackage.ny;
import defpackage.o;
import defpackage.un;
import defpackage.vt;
import defpackage.xe0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1 implements LazyLayoutMeasurePolicy {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ un $coroutineScope;
    final /* synthetic */ GraphicsContext $graphicsContext;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ iy $itemProviderLambda;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyGridSlotsProvider $slots;
    final /* synthetic */ LazyGridState $state;
    final /* synthetic */ StickyItemsPlacement $stickyItemsScrollBehavior;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    public LazyGridKt$rememberLazyGridMeasurePolicy$1$1(LazyGridState lazyGridState, boolean z, PaddingValues paddingValues, boolean z2, iy iyVar, LazyGridSlotsProvider lazyGridSlotsProvider, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, un unVar, GraphicsContext graphicsContext, StickyItemsPlacement stickyItemsPlacement) {
        this.$state = lazyGridState;
        this.$isVertical = z;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z2;
        this.$itemProviderLambda = iyVar;
        this.$slots = lazyGridSlotsProvider;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
        this.$coroutineScope = unVar;
        this.$graphicsContext = graphicsContext;
        this.$stickyItemsScrollBehavior = stickyItemsPlacement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList measure_0kLqBqw$lambda$2(LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1, int i) {
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = lazyGridSpanLayoutProvider.getLineConfiguration(i);
        int firstItemIndex = lineConfiguration.getFirstItemIndex();
        ArrayList arrayList = new ArrayList(lineConfiguration.getSpans().size());
        List<GridItemSpan> spans = lineConfiguration.getSpans();
        int size = spans.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int m882getCurrentLineSpanimpl = GridItemSpan.m882getCurrentLineSpanimpl(spans.get(i3).m885unboximpl());
            arrayList.add(new xe0(Integer.valueOf(firstItemIndex), Constraints.m7551boximpl(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.m899childConstraintsJhjzzOo$foundation(i2, m882getCurrentLineSpanimpl))));
            firstItemIndex++;
            i2 += m882getCurrentLineSpanimpl;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult measure_0kLqBqw$lambda$5(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j, int i, int i2, int i3, int i4, ky kyVar) {
        return lazyLayoutMeasureScope.layout(ConstraintsKt.m7581constrainWidthK40F9xA(j, i3 + i), ConstraintsKt.m7580constrainHeightK40F9xA(j, i4 + i2), vt.d, kyVar);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0268  */
    /* JADX WARN: Type inference failed for: r28v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider] */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1] */
    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
    /* renamed from: measure-0kLqBqw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MeasureResult mo861measure0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
        float mo653getSpacingD9Ej5fM;
        long m7733constructorimpl;
        ky kyVar;
        ky kyVar2;
        int lineIndexOfItem;
        LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider;
        int firstVisibleItemScrollOffset;
        CacheWindowLogic cacheWindowLogic;
        ObservableScopeInvalidator.m939attachToScopeimpl(this.$state.m900getMeasurementScopeInvalidatorzYiylxw$foundation());
        boolean z = this.$state.getHasLookaheadOccurred$foundation() || lazyLayoutMeasureScope.isLookingAhead();
        CheckScrollableContainerConstraintsKt.m254checkScrollableContainerConstraintsK40F9xA(j, this.$isVertical ? Orientation.Vertical : Orientation.Horizontal);
        boolean z2 = this.$isVertical;
        PaddingValues paddingValues = this.$contentPadding;
        int mo361roundToPx0680j_4 = z2 ? lazyLayoutMeasureScope.mo361roundToPx0680j_4(paddingValues.mo712calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo361roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
        boolean z3 = this.$isVertical;
        PaddingValues paddingValues2 = this.$contentPadding;
        int mo361roundToPx0680j_42 = z3 ? lazyLayoutMeasureScope.mo361roundToPx0680j_4(paddingValues2.mo713calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo361roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
        int mo361roundToPx0680j_43 = lazyLayoutMeasureScope.mo361roundToPx0680j_4(this.$contentPadding.mo714calculateTopPaddingD9Ej5fM());
        int mo361roundToPx0680j_44 = lazyLayoutMeasureScope.mo361roundToPx0680j_4(this.$contentPadding.mo711calculateBottomPaddingD9Ej5fM());
        final int i = mo361roundToPx0680j_43 + mo361roundToPx0680j_44;
        final int i2 = mo361roundToPx0680j_4 + mo361roundToPx0680j_42;
        boolean z4 = this.$isVertical;
        int i3 = z4 ? i : i2;
        if (z4 && !this.$reverseLayout) {
            mo361roundToPx0680j_42 = mo361roundToPx0680j_43;
        } else if (z4 && this.$reverseLayout) {
            mo361roundToPx0680j_42 = mo361roundToPx0680j_44;
        } else if (!z4 && !this.$reverseLayout) {
            mo361roundToPx0680j_42 = mo361roundToPx0680j_4;
        }
        final int i4 = i3 - mo361roundToPx0680j_42;
        long m7583offsetNN6EwU = ConstraintsKt.m7583offsetNN6EwU(j, -i2, -i);
        final LazyGridItemProvider lazyGridItemProvider = (LazyGridItemProvider) this.$itemProviderLambda.invoke();
        final LazyGridSpanLayoutProvider spanLayoutProvider = lazyGridItemProvider.getSpanLayoutProvider();
        final LazyGridSlots mo886invoke0kLqBqw = this.$slots.mo886invoke0kLqBqw(lazyLayoutMeasureScope, m7583offsetNN6EwU);
        int length = mo886invoke0kLqBqw.getSizes().length;
        spanLayoutProvider.setSlotsPerLine(length);
        if (this.$isVertical) {
            Arrangement.Vertical vertical = this.$verticalArrangement;
            if (vertical == null) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement when isVertical == true");
                o.j();
                return null;
            }
            mo653getSpacingD9Ej5fM = vertical.mo653getSpacingD9Ej5fM();
        } else {
            Arrangement.Horizontal horizontal = this.$horizontalArrangement;
            if (horizontal == null) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement when isVertical == false");
                o.j();
                return null;
            }
            mo653getSpacingD9Ej5fM = horizontal.mo653getSpacingD9Ej5fM();
        }
        final int mo361roundToPx0680j_45 = lazyLayoutMeasureScope.mo361roundToPx0680j_4(mo653getSpacingD9Ej5fM);
        final int itemCount = lazyGridItemProvider.getItemCount();
        int m7563getMaxHeightimpl = this.$isVertical ? Constraints.m7563getMaxHeightimpl(j) - i : Constraints.m7564getMaxWidthimpl(j) - i2;
        if (!this.$reverseLayout || m7563getMaxHeightimpl > 0) {
            m7733constructorimpl = IntOffset.m7733constructorimpl((mo361roundToPx0680j_4 << 32) | (mo361roundToPx0680j_43 & 4294967295L));
        } else {
            boolean z5 = this.$isVertical;
            if (!z5) {
                mo361roundToPx0680j_4 += m7563getMaxHeightimpl;
            }
            if (z5) {
                mo361roundToPx0680j_43 += m7563getMaxHeightimpl;
            }
            m7733constructorimpl = IntOffset.m7733constructorimpl((mo361roundToPx0680j_4 << 32) | (mo361roundToPx0680j_43 & 4294967295L));
        }
        final long j2 = m7733constructorimpl;
        final LazyGridState lazyGridState = this.$state;
        final boolean z6 = this.$isVertical;
        final boolean z7 = this.$reverseLayout;
        final int i5 = mo361roundToPx0680j_42;
        final ?? r28 = new LazyGridMeasuredItemProvider(lazyGridItemProvider, lazyLayoutMeasureScope, mo361roundToPx0680j_45, lazyGridState, z6, z7, i5, i4, j2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
            final /* synthetic */ int $afterContentPadding;
            final /* synthetic */ int $beforeContentPadding;
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ boolean $reverseLayout;
            final /* synthetic */ LazyGridState $state;
            final /* synthetic */ LazyLayoutMeasureScope $this_LazyLayoutMeasurePolicy;
            final /* synthetic */ long $visualItemOffset;

            {
                this.$this_LazyLayoutMeasurePolicy = lazyLayoutMeasureScope;
                this.$state = lazyGridState;
                this.$isVertical = z6;
                this.$reverseLayout = z7;
                this.$beforeContentPadding = i5;
                this.$afterContentPadding = i4;
                this.$visualItemOffset = j2;
            }

            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
            /* renamed from: createItem-O3s9Psw, reason: not valid java name */
            public LazyGridMeasuredItem mo893createItemO3s9Psw(int i6, Object obj, Object obj2, int i7, int i8, List<? extends Placeable> list, long j3, int i9, int i10) {
                return new LazyGridMeasuredItem(i6, obj, this.$isVertical, i7, i8, this.$reverseLayout, this.$this_LazyLayoutMeasurePolicy.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, list, this.$visualItemOffset, obj2, this.$state.getItemAnimator$foundation(), j3, i9, i10, null);
            }
        };
        final boolean z8 = this.$isVertical;
        final ?? r3 = new LazyGridMeasuredLineProvider(z8, mo886invoke0kLqBqw, itemCount, mo361roundToPx0680j_45, r28, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ LazyGridSlots $resolvedSlots;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(z8, mo886invoke0kLqBqw, itemCount, mo361roundToPx0680j_45, r28, spanLayoutProvider);
                this.$isVertical = z8;
                this.$resolvedSlots = mo886invoke0kLqBqw;
            }

            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
            public LazyGridMeasuredLine createLine(int i6, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List<GridItemSpan> list, int i7) {
                return new LazyGridMeasuredLine(i6, lazyGridMeasuredItemArr, this.$resolvedSlots, list, this.$isVertical, i7);
            }
        };
        ky kyVar3 = new ky() { // from class: androidx.compose.foundation.lazy.grid.d
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                ArrayList measure_0kLqBqw$lambda$2;
                measure_0kLqBqw$lambda$2 = LazyGridKt$rememberLazyGridMeasurePolicy$1$1.measure_0kLqBqw$lambda$2(LazyGridSpanLayoutProvider.this, r3, ((Integer) obj).intValue());
                return measure_0kLqBqw$lambda$2;
            }
        };
        ky kyVar4 = new ky() { // from class: androidx.compose.foundation.lazy.grid.e
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                int lineIndexOfItem2;
                lineIndexOfItem2 = LazyGridSpanLayoutProvider.this.getLineIndexOfItem(((Integer) obj).intValue());
                return Integer.valueOf(lineIndexOfItem2);
            }
        };
        Snapshot.Companion companion = Snapshot.Companion;
        LazyGridState lazyGridState2 = this.$state;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        if (currentThreadSnapshot != null) {
            kyVar = kyVar4;
            kyVar2 = currentThreadSnapshot.getReadObserver();
        } else {
            kyVar = kyVar4;
            kyVar2 = null;
        }
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            int updateScrollPositionIfTheFirstItemWasMoved$foundation = lazyGridState2.updateScrollPositionIfTheFirstItemWasMoved$foundation(lazyGridItemProvider, lazyGridState2.getFirstVisibleItemIndex());
            if (updateScrollPositionIfTheFirstItemWasMoved$foundation >= itemCount && itemCount > 0) {
                lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                lazyGridMeasuredLineProvider = r3;
                firstVisibleItemScrollOffset = 0;
                int i6 = lineIndexOfItem;
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, kyVar2);
                LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider2 = lazyGridMeasuredLineProvider;
                LazyGridMeasureResult m895measureLazyGridt1x4au0 = LazyGridMeasureKt.m895measureLazyGridt1x4au0(itemCount, lazyGridMeasuredLineProvider2, r28, m7563getMaxHeightimpl, i5, i4, mo361roundToPx0680j_45, i6, firstVisibleItemScrollOffset, (lazyLayoutMeasureScope.isLookingAhead() && z) ? this.$state.getScrollDeltaBetweenPasses$foundation() : this.$state.getScrollToBeConsumed$foundation(), m7583offsetNN6EwU, this.$isVertical, this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, lazyLayoutMeasureScope, this.$state.getItemAnimator$foundation(), length, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyGridItemProvider, this.$state.getPinnedItems$foundation(), this.$state.getBeyondBoundsInfo$foundation()), z, lazyLayoutMeasureScope.isLookingAhead(), this.$state.getApproachLayoutInfo$foundation(), this.$coroutineScope, this.$state.m901getPlacementScopeInvalidatorzYiylxw$foundation(), this.$graphicsContext, kyVar3, kyVar, this.$stickyItemsScrollBehavior, new ny() { // from class: androidx.compose.foundation.lazy.grid.f
                    @Override // defpackage.ny
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        MeasureResult measure_0kLqBqw$lambda$5;
                        measure_0kLqBqw$lambda$5 = LazyGridKt$rememberLazyGridMeasurePolicy$1$1.measure_0kLqBqw$lambda$5(LazyLayoutMeasureScope.this, j, i2, i, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (ky) obj3);
                        return measure_0kLqBqw$lambda$5;
                    }
                });
                LazyGridState.applyMeasureResult$foundation$default(this.$state, m895measureLazyGridt1x4au0, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                Object prefetchStrategy$foundation = this.$state.getPrefetchStrategy$foundation();
                cacheWindowLogic = prefetchStrategy$foundation instanceof CacheWindowLogic ? (CacheWindowLogic) prefetchStrategy$foundation : null;
                if (cacheWindowLogic != null) {
                    LazyGridKt.keepAroundItems(cacheWindowLogic, m895measureLazyGridt1x4au0.getOrientation(), m895measureLazyGridt1x4au0.getVisibleItemsInfo(), lazyGridMeasuredLineProvider2);
                }
                return m895measureLazyGridt1x4au0;
            }
            lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(updateScrollPositionIfTheFirstItemWasMoved$foundation);
            lazyGridMeasuredLineProvider = r3;
            firstVisibleItemScrollOffset = lazyGridState2.getFirstVisibleItemScrollOffset();
            int i62 = lineIndexOfItem;
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, kyVar2);
            LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider22 = lazyGridMeasuredLineProvider;
            LazyGridMeasureResult m895measureLazyGridt1x4au02 = LazyGridMeasureKt.m895measureLazyGridt1x4au0(itemCount, lazyGridMeasuredLineProvider22, r28, m7563getMaxHeightimpl, i5, i4, mo361roundToPx0680j_45, i62, firstVisibleItemScrollOffset, (lazyLayoutMeasureScope.isLookingAhead() && z) ? this.$state.getScrollDeltaBetweenPasses$foundation() : this.$state.getScrollToBeConsumed$foundation(), m7583offsetNN6EwU, this.$isVertical, this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, lazyLayoutMeasureScope, this.$state.getItemAnimator$foundation(), length, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyGridItemProvider, this.$state.getPinnedItems$foundation(), this.$state.getBeyondBoundsInfo$foundation()), z, lazyLayoutMeasureScope.isLookingAhead(), this.$state.getApproachLayoutInfo$foundation(), this.$coroutineScope, this.$state.m901getPlacementScopeInvalidatorzYiylxw$foundation(), this.$graphicsContext, kyVar3, kyVar, this.$stickyItemsScrollBehavior, new ny() { // from class: androidx.compose.foundation.lazy.grid.f
                @Override // defpackage.ny
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    MeasureResult measure_0kLqBqw$lambda$5;
                    measure_0kLqBqw$lambda$5 = LazyGridKt$rememberLazyGridMeasurePolicy$1$1.measure_0kLqBqw$lambda$5(LazyLayoutMeasureScope.this, j, i2, i, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (ky) obj3);
                    return measure_0kLqBqw$lambda$5;
                }
            });
            LazyGridState.applyMeasureResult$foundation$default(this.$state, m895measureLazyGridt1x4au02, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
            Object prefetchStrategy$foundation2 = this.$state.getPrefetchStrategy$foundation();
            cacheWindowLogic = prefetchStrategy$foundation2 instanceof CacheWindowLogic ? (CacheWindowLogic) prefetchStrategy$foundation2 : null;
            if (cacheWindowLogic != null) {
            }
            return m895measureLazyGridt1x4au02;
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, kyVar2);
            throw th;
        }
    }
}
