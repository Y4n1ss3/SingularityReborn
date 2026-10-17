package androidx.compose.foundation.lazy.layout;

import defpackage.iy;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CacheWindowLogicKt {
    private static final boolean DebugEnabled = false;
    public static final int InvalidIndex = -1;
    private static final int InvalidItemSize = -1;
    private static final int UnsetItemCount = -1;

    public static final void forEachVisibleItem(CacheWindowScope cacheWindowScope, ny nyVar) {
        int visibleLineCount = cacheWindowScope.getVisibleLineCount();
        for (int i = 0; i < visibleLineCount; i++) {
            nyVar.invoke(Integer.valueOf(cacheWindowScope.getVisibleItemLine(i)), cacheWindowScope.getVisibleLineKey(i), Integer.valueOf(cacheWindowScope.getVisibleItemSize(i)));
        }
    }

    private static final void debugLog(iy iyVar) {
    }
}
