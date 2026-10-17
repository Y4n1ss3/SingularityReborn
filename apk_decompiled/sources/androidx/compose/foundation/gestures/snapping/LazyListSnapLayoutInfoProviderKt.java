package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Density;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListSnapLayoutInfoProviderKt {
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final LazyListState lazyListState, final SnapPosition snapPosition) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
            private final int getAverageItemSize() {
                LazyListLayoutInfo layoutInfo = getLayoutInfo();
                int i = 0;
                if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                    return 0;
                }
                int size = layoutInfo.getVisibleItemsInfo().size();
                Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
                while (it.hasNext()) {
                    i += ((LazyListItemInfo) it.next()).getSize();
                }
                return i / size;
            }

            private final LazyListLayoutInfo getLayoutInfo() {
                return LazyListState.this.getLayoutInfo();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f, float f2) {
                float abs = Math.abs(f2) - getAverageItemSize();
                if (abs < 0.0f) {
                    abs = 0.0f;
                }
                return Math.signum(f2) * abs;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f) {
                List<LazyListItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                SnapPosition snapPosition2 = snapPosition;
                int size = visibleItemsInfo.size();
                float f2 = Float.NEGATIVE_INFINITY;
                float f3 = Float.POSITIVE_INFINITY;
                for (int i = 0; i < size; i++) {
                    LazyListItemInfo lazyListItemInfo = visibleItemsInfo.get(i);
                    LazyLayoutMeasuredItem lazyLayoutMeasuredItem = lazyListItemInfo instanceof LazyLayoutMeasuredItem ? (LazyLayoutMeasuredItem) lazyListItemInfo : null;
                    if (lazyLayoutMeasuredItem == null || !lazyLayoutMeasuredItem.getNonScrollableItem()) {
                        float calculateDistanceToDesiredSnapPosition = SnapPositionKt.calculateDistanceToDesiredSnapPosition(LazyListSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), lazyListItemInfo.getSize(), lazyListItemInfo.getOffset(), lazyListItemInfo.getIndex(), snapPosition2, getLayoutInfo().getTotalItemsCount());
                        if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f2) {
                            f2 = calculateDistanceToDesiredSnapPosition;
                        }
                        if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f3) {
                            f3 = calculateDistanceToDesiredSnapPosition;
                        }
                    }
                }
                return SnapFlingBehaviorKt.m587calculateFinalOffsetFhqu1e0(LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(LazyListState.this.getDensity$foundation(), f), f2, f3);
            }
        };
    }

    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyListState lazyListState, SnapPosition snapPosition, int i, Object obj) {
        if ((i & 2) != 0) {
            snapPosition = SnapPosition.Center.INSTANCE;
        }
        return SnapLayoutInfoProvider(lazyListState, snapPosition);
    }

    public static final int calculateFinalSnappingItem(Density density, float f) {
        return Math.abs(f) < density.mo367toPx0680j_4(SnapFlingBehaviorKt.getMinFlingVelocityDp()) ? FinalSnappingItem.Companion.m584getClosestItembbeMdSM() : f > 0.0f ? FinalSnappingItem.Companion.m585getNextItembbeMdSM() : FinalSnappingItem.Companion.m586getPreviousItembbeMdSM();
    }

    public static final int getSingleAxisViewportSize(LazyListLayoutInfo lazyListLayoutInfo) {
        return (int) (lazyListLayoutInfo.getOrientation() == Orientation.Vertical ? lazyListLayoutInfo.mo864getViewportSizeYbymL2g() & 4294967295L : lazyListLayoutInfo.mo864getViewportSizeYbymL2g() >> 32);
    }

    public static final FlingBehavior rememberSnapFlingBehavior(LazyListState lazyListState, SnapPosition snapPosition, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            snapPosition = SnapPosition.Center.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-338621290, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:115)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapLayoutInfoProvider(lazyListState, snapPosition);
            composer.updateRememberedValue(rememberedValue);
        }
        TargetedFlingBehavior rememberSnapFlingBehavior = SnapFlingBehaviorKt.rememberSnapFlingBehavior((SnapLayoutInfoProvider) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberSnapFlingBehavior;
    }
}
