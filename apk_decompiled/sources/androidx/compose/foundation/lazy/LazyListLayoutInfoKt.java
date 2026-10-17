package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListLayoutInfoKt {
    public static final int calculateContentSize(LazyListLayoutInfo lazyListLayoutInfo) {
        int afterContentPadding = lazyListLayoutInfo.getAfterContentPadding() + lazyListLayoutInfo.getBeforeContentPadding();
        if (lazyListLayoutInfo.getTotalItemsCount() == 0) {
            return afterContentPadding;
        }
        return (lazyListLayoutInfo.getMainAxisItemSpacing() * (lazyListLayoutInfo.getTotalItemsCount() - 1)) + (lazyListLayoutInfo.getTotalItemsCount() * (visibleItemsAverageSize(lazyListLayoutInfo) - lazyListLayoutInfo.getMainAxisItemSpacing())) + afterContentPadding;
    }

    public static final int getSingleAxisViewportSize(LazyListLayoutInfo lazyListLayoutInfo) {
        return (int) (lazyListLayoutInfo.getOrientation() == Orientation.Vertical ? lazyListLayoutInfo.mo864getViewportSizeYbymL2g() & 4294967295L : lazyListLayoutInfo.mo864getViewportSizeYbymL2g() >> 32);
    }

    public static final int visibleItemsAverageSize(LazyListLayoutInfo lazyListLayoutInfo) {
        List<LazyListItemInfo> visibleItemsInfo = lazyListLayoutInfo.getVisibleItemsInfo();
        if (visibleItemsInfo.isEmpty()) {
            return 0;
        }
        int size = visibleItemsInfo.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += visibleItemsInfo.get(i2).getSize();
        }
        return lazyListLayoutInfo.getMainAxisItemSpacing() + (i / visibleItemsInfo.size());
    }
}
