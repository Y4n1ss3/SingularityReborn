package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PagerLayoutInfoKt {
    public static final int calculateContentSize(PagerLayoutInfo pagerLayoutInfo, int i) {
        int afterContentPadding = pagerLayoutInfo.getAfterContentPadding() + pagerLayoutInfo.getBeforeContentPadding();
        if (i == 0) {
            return afterContentPadding;
        }
        long j = i;
        long pageSpacing = ((j - 1) * pagerLayoutInfo.getPageSpacing()) + (pagerLayoutInfo.getPageSize() * j) + afterContentPadding;
        if (pageSpacing > 2147483647L) {
            pageSpacing = 2147483647L;
        }
        return (int) pageSpacing;
    }

    public static final int getMainAxisViewportSize(PagerLayoutInfo pagerLayoutInfo) {
        return (int) (pagerLayoutInfo.getOrientation() == Orientation.Vertical ? pagerLayoutInfo.mo1006getViewportSizeYbymL2g() & 4294967295L : pagerLayoutInfo.mo1006getViewportSizeYbymL2g() >> 32);
    }
}
