package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.ui.unit.Density;
import defpackage.my;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface CacheWindowScope {
    Density getDensity();

    int getFirstVisibleLineIndex();

    boolean getHasVisibleItems();

    int getLastIndexInLine(int i);

    int getLastLineIndex();

    int getLastVisibleLineIndex();

    int getMainAxisExtraSpaceEnd();

    int getMainAxisExtraSpaceStart();

    int getMainAxisViewportSize();

    int getTotalItemsCount();

    int getVisibleItemLine(int i);

    int getVisibleItemSize(int i);

    int getVisibleLineCount();

    Object getVisibleLineKey(int i);

    List<LazyLayoutPrefetchState.PrefetchHandle> schedulePrefetch(int i, my myVar);
}
