package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface LazyListPrefetchStrategy {
    default PrefetchScheduler getPrefetchScheduler() {
        return null;
    }

    void onNestedPrefetch(NestedPrefetchScope nestedPrefetchScope, int i);

    void onScroll(LazyListPrefetchScope lazyListPrefetchScope, float f, LazyListLayoutInfo lazyListLayoutInfo);

    void onVisibleItemsUpdated(LazyListPrefetchScope lazyListPrefetchScope, LazyListLayoutInfo lazyListLayoutInfo);

    @er
    static /* synthetic */ void getPrefetchScheduler$annotations() {
    }
}
