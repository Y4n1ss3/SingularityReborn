package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import defpackage.ky;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface LazyGridPrefetchScope {
    List<LazyLayoutPrefetchState.PrefetchHandle> scheduleLinePrefetch(int i);

    default List<LazyLayoutPrefetchState.PrefetchHandle> scheduleLinePrefetch(int i, ky kyVar) {
        return scheduleLinePrefetch(i);
    }
}
