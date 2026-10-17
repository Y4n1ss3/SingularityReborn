package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composer;
import defpackage.my;
import defpackage.ny;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 createContentLambda$lambda$0;
        w01 LazySaveableStateHolderProvider$lambda$1;
        int i = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                createContentLambda$lambda$0 = LazyLayoutItemContentFactory.CachedItemContent.createContentLambda$lambda$0((LazyLayoutItemContentFactory) obj4, (LazyLayoutItemContentFactory.CachedItemContent) obj3, (Composer) obj, ((Integer) obj2).intValue());
                return createContentLambda$lambda$0;
            default:
                LazySaveableStateHolderProvider$lambda$1 = LazySaveableStateHolderKt.LazySaveableStateHolderProvider$lambda$1((ny) obj4, (LazySaveableStateHolder) obj3, (Composer) obj, ((Integer) obj2).intValue());
                return LazySaveableStateHolderProvider$lambda$1;
        }
    }
}
