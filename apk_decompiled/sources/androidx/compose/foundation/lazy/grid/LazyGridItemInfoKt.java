package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridItemInfoKt {
    public static final int lineIndex(LazyGridItemInfo lazyGridItemInfo, Orientation orientation) {
        return orientation == Orientation.Vertical ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn();
    }
}
