package defpackage;

import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.CacheWindowScope;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class sf implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ CacheWindowLogic e;
    public final /* synthetic */ CacheWindowScope f;

    public /* synthetic */ sf(CacheWindowLogic cacheWindowLogic, CacheWindowScope cacheWindowScope, int i) {
        this.d = i;
        this.e = cacheWindowLogic;
        this.f = cacheWindowScope;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 itemSizeOrPrefetch$lambda$4;
        w01 scheduleNextItemIfNeeded$lambda$1;
        int i = this.d;
        CacheWindowScope cacheWindowScope = this.f;
        CacheWindowLogic cacheWindowLogic = this.e;
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                itemSizeOrPrefetch$lambda$4 = CacheWindowLogic.getItemSizeOrPrefetch$lambda$4(cacheWindowLogic, cacheWindowScope, intValue, intValue2);
                return itemSizeOrPrefetch$lambda$4;
            default:
                scheduleNextItemIfNeeded$lambda$1 = CacheWindowLogic.scheduleNextItemIfNeeded$lambda$1(cacheWindowLogic, cacheWindowScope, intValue, intValue2);
                return scheduleNextItemIfNeeded$lambda$1;
        }
    }
}
