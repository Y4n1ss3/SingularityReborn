package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface LazyListLayoutInfo {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static int getAfterContentPadding(LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getAfterContentPadding();
        }

        @Deprecated
        public static int getBeforeContentPadding(LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getBeforeContentPadding();
        }

        @Deprecated
        public static int getMainAxisItemSpacing(LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getMainAxisItemSpacing();
        }

        @Deprecated
        public static Orientation getOrientation(LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getOrientation();
        }

        @Deprecated
        public static boolean getReverseLayout(LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getReverseLayout();
        }

        @Deprecated
        /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
        public static long m865getViewportSizeYbymL2g(LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.mo864getViewportSizeYbymL2g();
        }
    }

    default int getAfterContentPadding() {
        return 0;
    }

    default int getBeforeContentPadding() {
        return 0;
    }

    default int getMainAxisItemSpacing() {
        return 0;
    }

    default Orientation getOrientation() {
        return Orientation.Vertical;
    }

    default boolean getReverseLayout() {
        return false;
    }

    int getTotalItemsCount();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    default long mo864getViewportSizeYbymL2g() {
        return IntSize.Companion.m7787getZeroYbymL2g();
    }

    int getViewportStartOffset();

    List<LazyListItemInfo> getVisibleItemsInfo();
}
