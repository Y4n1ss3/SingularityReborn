package defpackage;

import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class re0 implements my {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ re0(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i, Object obj, int i2) {
        this.g = pagerLazyLayoutItemProvider;
        this.e = i;
        this.h = obj;
        this.f = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 Item$lambda$1;
        int i = this.d;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                Item$lambda$1 = PagerLazyLayoutItemProvider.Item$lambda$1((PagerLazyLayoutItemProvider) obj3, this.e, this.h, this.f, (Composer) obj, intValue);
                return Item$lambda$1;
            default:
                ((Integer) obj2).getClass();
                st0.a((String) obj3, (my) this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1), this.f);
                return w01.a;
        }
    }

    public /* synthetic */ re0(String str, my myVar, int i, int i2) {
        this.g = str;
        this.h = myVar;
        this.e = i;
        this.f = i2;
    }
}
