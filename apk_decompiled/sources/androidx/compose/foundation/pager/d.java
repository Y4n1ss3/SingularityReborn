package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 schedulePrefetch$lambda$0;
        w01 performFling$lambda$0$0;
        int i = this.d;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                schedulePrefetch$lambda$0 = PagerCacheWindowScope.schedulePrefetch$lambda$0((my) obj3, (PagerCacheWindowScope) obj2, (LazyLayoutPrefetchState.PrefetchResultScope) obj);
                return schedulePrefetch$lambda$0;
            default:
                performFling$lambda$0$0 = PagerWrapperFlingBehavior.performFling$lambda$0$0((PagerWrapperFlingBehavior) obj3, (ScrollScope) obj2, ((Float) obj).floatValue());
                return performFling$lambda$0$0;
        }
    }
}
