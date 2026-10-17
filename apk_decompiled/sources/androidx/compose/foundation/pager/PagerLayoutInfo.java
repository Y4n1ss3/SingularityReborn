package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface PagerLayoutInfo {
    int getAfterContentPadding();

    int getBeforeContentPadding();

    int getBeyondViewportPageCount();

    Orientation getOrientation();

    int getPageSize();

    int getPageSpacing();

    boolean getReverseLayout();

    SnapPosition getSnapPosition();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    long mo1006getViewportSizeYbymL2g();

    int getViewportStartOffset();

    List<PageInfo> getVisiblePagesInfo();

    static /* synthetic */ void getReverseLayout$annotations() {
    }
}
