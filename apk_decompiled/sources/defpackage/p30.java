package defpackage;

import androidx.compose.foundation.lazy.LazyListMeasureKt;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureKt;
import androidx.compose.ui.layout.Placeable;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class p30 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;
    public final /* synthetic */ List f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ p30(List list, List list2, boolean z, int i) {
        this.d = i;
        this.e = list;
        this.f = list2;
        this.g = z;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 measureLazyGrid_t1x4au0$lambda$8$0;
        w01 measureLazyList__s_dbAc$lambda$8$0;
        switch (this.d) {
            case 0:
                measureLazyGrid_t1x4au0$lambda$8$0 = LazyGridMeasureKt.measureLazyGrid_t1x4au0$lambda$8$0(this.e, this.f, this.g, (Placeable.PlacementScope) obj);
                return measureLazyGrid_t1x4au0$lambda$8$0;
            default:
                measureLazyList__s_dbAc$lambda$8$0 = LazyListMeasureKt.measureLazyList__s_dbAc$lambda$8$0(this.e, this.f, this.g, (Placeable.PlacementScope) obj);
                return measureLazyList__s_dbAc$lambda$8$0;
        }
    }
}
