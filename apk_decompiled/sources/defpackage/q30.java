package defpackage;

import androidx.compose.foundation.lazy.LazyListMeasureKt;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class q30 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ List f;
    public final /* synthetic */ List g;
    public final /* synthetic */ boolean h;

    public /* synthetic */ q30(MutableState mutableState, List list, List list2, boolean z, int i) {
        this.d = i;
        this.e = mutableState;
        this.f = list;
        this.g = list2;
        this.h = z;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 measureLazyGrid_t1x4au0$lambda$8;
        w01 measureLazyList__s_dbAc$lambda$8;
        switch (this.d) {
            case 0:
                measureLazyGrid_t1x4au0$lambda$8 = LazyGridMeasureKt.measureLazyGrid_t1x4au0$lambda$8(this.e, this.f, this.g, this.h, (Placeable.PlacementScope) obj);
                return measureLazyGrid_t1x4au0$lambda$8;
            default:
                measureLazyList__s_dbAc$lambda$8 = LazyListMeasureKt.measureLazyList__s_dbAc$lambda$8(this.e, this.f, this.g, this.h, (Placeable.PlacementScope) obj);
                return measureLazyList__s_dbAc$lambda$8;
        }
    }
}
