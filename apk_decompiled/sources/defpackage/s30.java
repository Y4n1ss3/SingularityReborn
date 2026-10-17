package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureResult;
import androidx.compose.foundation.lazy.grid.LazyGridState$prefetchScope$1;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.material3.WideNavigationRailKt$WideNavigationRailLayout$1;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class s30 implements ky {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ int e;
    public final /* synthetic */ List f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ s30(int i, MeasureScope measureScope, ji0 ji0Var, ArrayList arrayList, Arrangement.Vertical vertical, State state) {
        this.e = i;
        this.g = measureScope;
        this.h = ji0Var;
        this.f = arrayList;
        this.i = vertical;
        this.j = state;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 scheduleLinePrefetch$lambda$0$0$0$0;
        w01 measure_3p2s80s$lambda$6;
        int i = this.d;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Serializable serializable = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                scheduleLinePrefetch$lambda$0$0$0$0 = LazyGridState$prefetchScope$1.scheduleLinePrefetch$lambda$0$0$0$0(this.f, (hi0) serializable, (List) obj4, (ky) obj3, this.e, (LazyGridMeasureResult) obj2, (LazyLayoutPrefetchState.PrefetchResultScope) obj);
                return scheduleLinePrefetch$lambda$0$0$0$0;
            default:
                measure_3p2s80s$lambda$6 = WideNavigationRailKt$WideNavigationRailLayout$1.AnonymousClass2.measure_3p2s80s$lambda$6(this.e, (MeasureScope) obj4, (ji0) serializable, this.f, (Arrangement.Vertical) obj3, (State) obj2, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$6;
        }
    }

    public /* synthetic */ s30(ArrayList arrayList, hi0 hi0Var, List list, ky kyVar, int i, LazyGridMeasureResult lazyGridMeasureResult) {
        this.f = arrayList;
        this.h = hi0Var;
        this.g = list;
        this.i = kyVar;
        this.e = i;
        this.j = lazyGridMeasureResult;
    }
}
