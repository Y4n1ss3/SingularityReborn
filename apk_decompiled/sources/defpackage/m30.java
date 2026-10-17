package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class m30 implements oy {
    public final /* synthetic */ int d;
    public final /* synthetic */ ny e;

    public /* synthetic */ m30(ny nyVar, int i) {
        this.d = i;
        this.e = nyVar;
    }

    @Override // defpackage.oy
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        w01 item$lambda$3;
        w01 item$lambda$2;
        w01 stickyHeader$lambda$0;
        w01 item$lambda$32;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj4).intValue();
                item$lambda$3 = LazyGridIntervalContent.item$lambda$3(this.e, (LazyGridItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, intValue);
                return item$lambda$3;
            case 1:
                int intValue2 = ((Integer) obj4).intValue();
                item$lambda$2 = LazyListIntervalContent.item$lambda$2(this.e, (LazyItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, intValue2);
                return item$lambda$2;
            case 2:
                int intValue3 = ((Integer) obj4).intValue();
                stickyHeader$lambda$0 = LazyListScope.stickyHeader$lambda$0(this.e, (LazyItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, intValue3);
                return stickyHeader$lambda$0;
            default:
                int intValue4 = ((Integer) obj4).intValue();
                item$lambda$32 = LazyStaggeredGridIntervalContent.item$lambda$3(this.e, (LazyStaggeredGridItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, intValue4);
                return item$lambda$32;
        }
    }
}
