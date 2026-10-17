package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.StickyItemsPlacement;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
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
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListKt$rememberLazyListMeasurePolicy$1$1 implements LazyLayoutMeasurePolicy {
    final /* synthetic */ int $beyondBoundsItemCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ un $coroutineScope;
    final /* synthetic */ GraphicsContext $graphicsContext;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ iy $itemProviderLambda;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyListState $state;
    final /* synthetic */ StickyItemsPlacement $stickyItemsPlacement;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    public LazyListKt$rememberLazyListMeasurePolicy$1$1(LazyListState lazyListState, boolean z, PaddingValues paddingValues, boolean z2, iy iyVar, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i, un unVar, GraphicsContext graphicsContext, StickyItemsPlacement stickyItemsPlacement, Alignment.Horizontal horizontal2, Alignment.Vertical vertical2) {
        this.$state = lazyListState;
        this.$isVertical = z;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z2;
        this.$itemProviderLambda = iyVar;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
        this.$beyondBoundsItemCount = i;
        this.$coroutineScope = unVar;
        this.$graphicsContext = graphicsContext;
        this.$stickyItemsPlacement = stickyItemsPlacement;
        this.$horizontalAlignment = horizontal2;
        this.$verticalAlignment = vertical2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult measure_0kLqBqw$lambda$3(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j, int i, int i2, int i3, int i4, ky kyVar) {
        return lazyLayoutMeasureScope.layout(ConstraintsKt.m7581constrainWidthK40F9xA(j, i3 + i), ConstraintsKt.m7580constrainHeightK40F9xA(j, i4 + i2), vt.d, kyVar);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    public final MeasureResult mo861measure0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
        float mo653getSpacingD9Ej5fM;
        long m7733constructorimpl;
        ObservableScopeInvalidator.m939attachToScopeimpl(this.$state.m876getMeasurementScopeInvalidatorzYiylxw$foundation());
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
        final int i4 = (!z4 || this.$reverseLayout) ? (z4 && this.$reverseLayout) ? mo361roundToPx0680j_44 : (z4 || this.$reverseLayout) ? mo361roundToPx0680j_42 : mo361roundToPx0680j_4 : mo361roundToPx0680j_43;
        final int i5 = i3 - i4;
        final long m7583offsetNN6EwU = ConstraintsKt.m7583offsetNN6EwU(j, -i2, -i);
        final LazyListItemProvider lazyListItemProvider = (LazyListItemProvider) this.$itemProviderLambda.invoke();
        lazyListItemProvider.getItemScope().setMaxSize(Constraints.m7564getMaxWidthimpl(m7583offsetNN6EwU), Constraints.m7563getMaxHeightimpl(m7583offsetNN6EwU));
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
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalAlignment when isVertical == false");
                o.j();
                return null;
            }
            mo653getSpacingD9Ej5fM = horizontal.mo653getSpacingD9Ej5fM();
        }
        final int mo361roundToPx0680j_45 = lazyLayoutMeasureScope.mo361roundToPx0680j_4(mo653getSpacingD9Ej5fM);
        final int itemCount = lazyListItemProvider.getItemCount();
        int m7563getMaxHeightimpl = this.$isVertical ? Constraints.m7563getMaxHeightimpl(j) - i : Constraints.m7564getMaxWidthimpl(j) - i2;
        if (!this.$reverseLayout || m7563getMaxHeightimpl > 0) {
            m7733constructorimpl = IntOffset.m7733constructorimpl((mo361roundToPx0680j_43 & 4294967295L) | (mo361roundToPx0680j_4 << 32));
        } else {
            boolean z5 = this.$isVertical;
            if (!z5) {
                mo361roundToPx0680j_4 += m7563getMaxHeightimpl;
            }
            if (z5) {
                mo361roundToPx0680j_43 += m7563getMaxHeightimpl;
            }
            m7733constructorimpl = IntOffset.m7733constructorimpl((mo361roundToPx0680j_43 & 4294967295L) | (mo361roundToPx0680j_4 << 32));
        }
        final boolean z6 = this.$isVertical;
        final Alignment.Horizontal horizontal2 = this.$horizontalAlignment;
        final long j2 = m7733constructorimpl;
        final Alignment.Vertical vertical2 = this.$verticalAlignment;
        final boolean z7 = this.$reverseLayout;
        final LazyListState lazyListState = this.$state;
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(m7583offsetNN6EwU, z6, lazyListItemProvider, lazyLayoutMeasureScope, itemCount, mo361roundToPx0680j_45, horizontal2, vertical2, z7, i4, i5, j2, lazyListState) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
            final /* synthetic */ int $afterContentPadding;
            final /* synthetic */ int $beforeContentPadding;
            final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ int $itemsCount;
            final /* synthetic */ boolean $reverseLayout;
            final /* synthetic */ int $spaceBetweenItems;
            final /* synthetic */ LazyListState $state;
            final /* synthetic */ LazyLayoutMeasureScope $this_LazyLayoutMeasurePolicy;
            final /* synthetic */ Alignment.Vertical $verticalAlignment;
            final /* synthetic */ long $visualItemOffset;

            {
                this.$isVertical = z6;
                this.$this_LazyLayoutMeasurePolicy = lazyLayoutMeasureScope;
                this.$itemsCount = itemCount;
                this.$spaceBetweenItems = mo361roundToPx0680j_45;
                this.$horizontalAlignment = horizontal2;
                this.$verticalAlignment = vertical2;
                this.$reverseLayout = z7;
                this.$beforeContentPadding = i4;
                this.$afterContentPadding = i5;
                this.$visualItemOffset = j2;
                this.$state = lazyListState;
            }

            @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
            /* renamed from: createItem-X9ElhV4, reason: not valid java name */
            public LazyListMeasuredItem mo862createItemX9ElhV4(int i6, Object obj, Object obj2, List<? extends Placeable> list, long j3) {
                return new LazyListMeasuredItem(i6, list, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_LazyLayoutMeasurePolicy.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, i6 == this.$itemsCount + (-1) ? 0 : this.$spaceBetweenItems, this.$visualItemOffset, obj, obj2, this.$state.getItemAnimator$foundation(), j3, null);
            }
        };
        Snapshot.Companion companion = Snapshot.Companion;
        LazyListState lazyListState2 = this.$state;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            int updateScrollPositionIfTheFirstItemWasMoved$foundation = lazyListState2.updateScrollPositionIfTheFirstItemWasMoved$foundation(lazyListItemProvider, lazyListState2.getFirstVisibleItemIndex());
            int firstVisibleItemScrollOffset = lazyListState2.getFirstVisibleItemScrollOffset();
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            LazyListMeasureResult m866measureLazyList_s_dbAc = LazyListMeasureKt.m866measureLazyList_s_dbAc(itemCount, lazyListMeasuredItemProvider, m7563getMaxHeightimpl, i4, i5, mo361roundToPx0680j_45, updateScrollPositionIfTheFirstItemWasMoved$foundation, firstVisibleItemScrollOffset, (lazyLayoutMeasureScope.isLookingAhead() || !z) ? this.$state.getScrollToBeConsumed$foundation() : this.$state.getScrollDeltaBetweenPasses$foundation(), m7583offsetNN6EwU, this.$isVertical, this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, lazyLayoutMeasureScope, this.$state.getItemAnimator$foundation(), this.$beyondBoundsItemCount, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyListItemProvider, this.$state.getPinnedItems$foundation(), this.$state.getBeyondBoundsInfo$foundation()), z, lazyLayoutMeasureScope.isLookingAhead(), this.$coroutineScope, this.$state.m877getPlacementScopeInvalidatorzYiylxw$foundation(), this.$graphicsContext, this.$stickyItemsPlacement, new ny() { // from class: androidx.compose.foundation.lazy.c
                @Override // defpackage.ny
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    MeasureResult measure_0kLqBqw$lambda$3;
                    measure_0kLqBqw$lambda$3 = LazyListKt$rememberLazyListMeasurePolicy$1$1.measure_0kLqBqw$lambda$3(LazyLayoutMeasureScope.this, j, i2, i, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (ky) obj3);
                    return measure_0kLqBqw$lambda$3;
                }
            });
            LazyListState.applyMeasureResult$foundation$default(this.$state, m866measureLazyList_s_dbAc, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
            Object prefetchStrategy$foundation = this.$state.getPrefetchStrategy$foundation();
            CacheWindowLogic cacheWindowLogic = prefetchStrategy$foundation instanceof CacheWindowLogic ? (CacheWindowLogic) prefetchStrategy$foundation : null;
            if (cacheWindowLogic != null) {
                LazyListKt.keepAroundItems(cacheWindowLogic, m866measureLazyList_s_dbAc.getVisibleItemsInfo(), lazyListMeasuredItemProvider);
            }
            return m866measureLazyList_s_dbAc;
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }
}
