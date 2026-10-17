package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface LazyStaggeredGridLayoutInfo {
    int getAfterContentPadding();

    int getBeforeContentPadding();

    int getMainAxisItemSpacing();

    Orientation getOrientation();

    int getTotalItemsCount();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    long mo967getViewportSizeYbymL2g();

    int getViewportStartOffset();

    List<LazyStaggeredGridItemInfo> getVisibleItemsInfo();
}
