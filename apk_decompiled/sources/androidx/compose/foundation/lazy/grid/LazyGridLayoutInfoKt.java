package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridLayoutInfoKt {
    public static final int calculateContentSize(LazyGridLayoutInfo lazyGridLayoutInfo) {
        int afterContentPadding = lazyGridLayoutInfo.getAfterContentPadding() + lazyGridLayoutInfo.getBeforeContentPadding();
        if (lazyGridLayoutInfo.getTotalItemsCount() == 0) {
            return afterContentPadding;
        }
        int ceil = (int) Math.ceil(lazyGridLayoutInfo.getTotalItemsCount() / lazyGridLayoutInfo.getMaxSpan());
        return (lazyGridLayoutInfo.getMainAxisItemSpacing() * (ceil - 1)) + ((visibleLinesAverageMainAxisSize(lazyGridLayoutInfo) - lazyGridLayoutInfo.getMainAxisItemSpacing()) * ceil) + afterContentPadding;
    }

    public static final int getFirstVisibleItemLineIndex(LazyGridLayoutInfo lazyGridLayoutInfo) {
        List<LazyGridItemInfo> visibleItemsInfo = lazyGridLayoutInfo.getVisibleItemsInfo();
        if (visibleItemsInfo.isEmpty()) {
            return 0;
        }
        return lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? ((LazyGridItemInfo) yi.p0(visibleItemsInfo)).getRow() : ((LazyGridItemInfo) yi.p0(visibleItemsInfo)).getColumn();
    }

    public static final int getSingleAxisViewportSize(LazyGridLayoutInfo lazyGridLayoutInfo) {
        return (int) (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyGridLayoutInfo.mo894getViewportSizeYbymL2g() & 4294967295L : lazyGridLayoutInfo.mo894getViewportSizeYbymL2g() >> 32);
    }

    public static final int visibleLinesAverageMainAxisSize(LazyGridLayoutInfo lazyGridLayoutInfo) {
        boolean z = lazyGridLayoutInfo.getOrientation() == Orientation.Vertical;
        List<LazyGridItemInfo> visibleItemsInfo = lazyGridLayoutInfo.getVisibleItemsInfo();
        if (visibleItemsInfo.isEmpty()) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < visibleItemsInfo.size()) {
            int visibleLinesAverageMainAxisSize$lineOf = visibleLinesAverageMainAxisSize$lineOf(z, lazyGridLayoutInfo, i);
            if (visibleLinesAverageMainAxisSize$lineOf == -1) {
                i++;
            } else {
                int i4 = 0;
                while (i < visibleItemsInfo.size() && visibleLinesAverageMainAxisSize$lineOf(z, lazyGridLayoutInfo, i) == visibleLinesAverageMainAxisSize$lineOf) {
                    i4 = Math.max(i4, (int) (z ? visibleItemsInfo.get(i).mo892getSizeYbymL2g() & 4294967295L : visibleItemsInfo.get(i).mo892getSizeYbymL2g() >> 32));
                    i++;
                }
                i2 += i4;
                i3++;
            }
        }
        return lazyGridLayoutInfo.getMainAxisItemSpacing() + (i2 / i3);
    }

    private static final int visibleLinesAverageMainAxisSize$lineOf(boolean z, LazyGridLayoutInfo lazyGridLayoutInfo, int i) {
        return z ? lazyGridLayoutInfo.getVisibleItemsInfo().get(i).getRow() : lazyGridLayoutInfo.getVisibleItemsInfo().get(i).getColumn();
    }
}
