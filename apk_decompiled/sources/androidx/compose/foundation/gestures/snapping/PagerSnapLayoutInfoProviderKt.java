package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.FinalSnappingItem;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.pager.PageInfo;
import androidx.compose.foundation.pager.PagerLayoutInfo;
import androidx.compose.foundation.pager.PagerLayoutInfoKt;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.iy;
import defpackage.ny;
import defpackage.xe0;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PagerSnapLayoutInfoProviderKt {
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final PagerState pagerState, final PagerSnapDistance pagerSnapDistance, final ny nyVar) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
            private final xe0 searchForSnappingBounds(SnapPosition snapPosition, float f) {
                float f2;
                boolean isScrollingForward;
                boolean isScrollingForward2;
                List<PageInfo> visiblePagesInfo = getLayoutInfo().getVisiblePagesInfo();
                PagerState pagerState2 = PagerState.this;
                int size = visiblePagesInfo.size();
                int i = 0;
                float f3 = Float.NEGATIVE_INFINITY;
                float f4 = Float.POSITIVE_INFINITY;
                while (true) {
                    f2 = 0.0f;
                    if (i >= size) {
                        break;
                    }
                    PageInfo pageInfo = visiblePagesInfo.get(i);
                    float calculateDistanceToDesiredSnapPosition = SnapPositionKt.calculateDistanceToDesiredSnapPosition(PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), getLayoutInfo().getPageSize(), pageInfo.getOffset(), pageInfo.getIndex(), snapPosition, pagerState2.getPageCount());
                    if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f3) {
                        f3 = calculateDistanceToDesiredSnapPosition;
                    }
                    if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f4) {
                        f4 = calculateDistanceToDesiredSnapPosition;
                    }
                    i++;
                }
                if (f3 == Float.NEGATIVE_INFINITY) {
                    f3 = f4;
                }
                if (f4 == Float.POSITIVE_INFINITY) {
                    f4 = f3;
                }
                if (!PagerState.this.getCanScrollForward()) {
                    isScrollingForward2 = PagerSnapLayoutInfoProviderKt.isScrollingForward(PagerState.this, f);
                    if (isScrollingForward2) {
                        f3 = 0.0f;
                        f4 = 0.0f;
                    } else {
                        f4 = 0.0f;
                    }
                }
                if (PagerState.this.getCanScrollBackward()) {
                    f2 = f3;
                } else {
                    isScrollingForward = PagerSnapLayoutInfoProviderKt.isScrollingForward(PagerState.this, f);
                    if (!isScrollingForward) {
                        f4 = 0.0f;
                    }
                }
                return new xe0(Float.valueOf(f2), Float.valueOf(f4));
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f, float f2) {
                int pageSpacing$foundation = PagerState.this.getPageSpacing$foundation() + PagerState.this.getPageSize$foundation();
                if (pageSpacing$foundation == 0) {
                    return 0.0f;
                }
                PagerState pagerState2 = PagerState.this;
                int firstVisiblePage$foundation = f < 0.0f ? pagerState2.getFirstVisiblePage$foundation() + 1 : pagerState2.getFirstVisiblePage$foundation();
                int abs = Math.abs((y80.h(pagerSnapDistance.calculateTargetPage(firstVisiblePage$foundation, y80.h(((int) (f2 / pageSpacing$foundation)) + firstVisiblePage$foundation, 0, PagerState.this.getPageCount()), f, PagerState.this.getPageSize$foundation(), PagerState.this.getPageSpacing$foundation()), 0, PagerState.this.getPageCount()) - firstVisiblePage$foundation) * pageSpacing$foundation) - pageSpacing$foundation;
                int i = abs >= 0 ? abs : 0;
                return i == 0 ? i : i * Math.signum(f);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f) {
                xe0 searchForSnappingBounds = searchForSnappingBounds(PagerState.this.getLayoutInfo().getSnapPosition(), f);
                float floatValue = ((Number) searchForSnappingBounds.d).floatValue();
                float floatValue2 = ((Number) searchForSnappingBounds.e).floatValue();
                float floatValue3 = ((Number) nyVar.invoke(Float.valueOf(f), Float.valueOf(floatValue), Float.valueOf(floatValue2))).floatValue();
                if (!(floatValue3 == floatValue || floatValue3 == floatValue2 || floatValue3 == 0.0f)) {
                    InlineClassHelperKt.throwIllegalStateException("Final Snapping Offset Should Be one of " + floatValue + ", " + floatValue2 + " or 0.0");
                }
                if (isValidDistance(floatValue3)) {
                    return floatValue3;
                }
                return 0.0f;
            }

            public final PagerLayoutInfo getLayoutInfo() {
                return PagerState.this.getLayoutInfo();
            }

            public final boolean isValidDistance(float f) {
                return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0086 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float calculateFinalSnappingBound(PagerState pagerState, LayoutDirection layoutDirection, float f, float f2, float f3, float f4) {
        boolean isScrollingForward = isScrollingForward(pagerState, f2);
        if (pagerState.getLayoutInfo().getOrientation() != Orientation.Vertical && layoutDirection != LayoutDirection.Ltr) {
            isScrollingForward = !isScrollingForward;
        }
        int pageSize = pagerState.getLayoutInfo().getPageSize();
        float dragGestureDelta = pageSize == 0 ? 0.0f : dragGestureDelta(pagerState) / pageSize;
        float f5 = dragGestureDelta - ((int) dragGestureDelta);
        int calculateFinalSnappingItem = LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(pagerState.getDensity$foundation(), f2);
        FinalSnappingItem.Companion companion = FinalSnappingItem.Companion;
        if (FinalSnappingItem.m580equalsimpl0(calculateFinalSnappingItem, companion.m584getClosestItembbeMdSM())) {
            return (Math.abs(f5) <= f ? Math.abs(dragGestureDelta) < Math.abs(pagerState.getPositionThresholdFraction$foundation()) ? Math.abs(f3) >= Math.abs(f4) : !isScrollingForward : isScrollingForward) ? f4 : f3;
        }
        if (!FinalSnappingItem.m580equalsimpl0(calculateFinalSnappingItem, companion.m585getNextItembbeMdSM())) {
            if (!FinalSnappingItem.m580equalsimpl0(calculateFinalSnappingItem, companion.m586getPreviousItembbeMdSM())) {
                return 0.0f;
            }
        }
    }

    private static final float dragGestureDelta(PagerState pagerState) {
        return pagerState.getLayoutInfo().getOrientation() == Orientation.Horizontal ? Float.intBitsToFloat((int) (pagerState.m1014getUpDownDifferenceF1C5BW0$foundation() >> 32)) : Float.intBitsToFloat((int) (pagerState.m1014getUpDownDifferenceF1C5BW0$foundation() & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScrollingForward(PagerState pagerState, float f) {
        boolean reverseLayout = pagerState.getLayoutInfo().getReverseLayout();
        boolean z = (pagerState.isNotGestureAction$foundation() ? -f : dragGestureDelta(pagerState)) > 0.0f;
        return (z && reverseLayout) || !(z || reverseLayout);
    }

    private static final void debugLog(iy iyVar) {
    }
}
