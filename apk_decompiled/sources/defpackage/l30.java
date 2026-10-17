package defpackage;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.runtime.Updater;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class l30 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ ky e;

    public /* synthetic */ l30(ky kyVar, int i) {
        this.d = i;
        this.e = kyVar;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        GridItemSpan item$lambda$1$0;
        w01 init_impl$lambda$0;
        w01 reconcile_impl$lambda$0;
        int i = this.d;
        ky kyVar = this.e;
        switch (i) {
            case 0:
                item$lambda$1$0 = LazyGridIntervalContent.item$lambda$1$0(kyVar, (LazyGridItemSpanScope) obj, ((Integer) obj2).intValue());
                return item$lambda$1$0;
            case 1:
                init_impl$lambda$0 = Updater.init_impl$lambda$0(kyVar, obj, (w01) obj2);
                return init_impl$lambda$0;
            default:
                reconcile_impl$lambda$0 = Updater.reconcile_impl$lambda$0(kyVar, obj, (w01) obj2);
                return reconcile_impl$lambda$0;
        }
    }
}
