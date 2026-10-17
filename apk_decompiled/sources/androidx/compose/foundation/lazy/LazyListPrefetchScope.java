package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import defpackage.ky;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface LazyListPrefetchScope {
    static /* synthetic */ LazyLayoutPrefetchState.PrefetchHandle schedulePrefetch$default(LazyListPrefetchScope lazyListPrefetchScope, int i, ky kyVar, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: schedulePrefetch");
            return null;
        }
        if ((i2 & 2) != 0) {
            kyVar = null;
        }
        return lazyListPrefetchScope.schedulePrefetch(i, kyVar);
    }

    LazyLayoutPrefetchState.PrefetchHandle schedulePrefetch(int i, ky kyVar);
}
