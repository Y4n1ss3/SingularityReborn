package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface LazyGridLayoutInfo {
    int getAfterContentPadding();

    int getBeforeContentPadding();

    int getMainAxisItemSpacing();

    int getMaxSpan();

    Orientation getOrientation();

    boolean getReverseLayout();

    int getTotalItemsCount();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    long mo894getViewportSizeYbymL2g();

    int getViewportStartOffset();

    List<LazyGridItemInfo> getVisibleItemsInfo();
}
