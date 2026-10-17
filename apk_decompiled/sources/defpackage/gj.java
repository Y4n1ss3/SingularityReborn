package defpackage;

import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.material3.SegmentedButtonContentMeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class gj implements ky {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ MeasureScope e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ gj(ArrayList arrayList, MeasureScope measureScope, SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy, int i, ArrayList arrayList2, int i2) {
        this.h = arrayList;
        this.e = measureScope;
        this.i = segmentedButtonContentMeasurePolicy;
        this.f = i;
        this.j = arrayList2;
        this.g = i2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 placeHelper$lambda$0$0;
        w01 measure_3p2s80s$lambda$8;
        int i = this.d;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                placeHelper$lambda$0$0 = ColumnMeasurePolicy.placeHelper$lambda$0$0((Placeable[]) obj4, (ColumnMeasurePolicy) obj3, this.f, this.g, this.e, (int[]) obj2, (Placeable.PlacementScope) obj);
                return placeHelper$lambda$0$0;
            default:
                measure_3p2s80s$lambda$8 = SegmentedButtonContentMeasurePolicy.measure_3p2s80s$lambda$8((ArrayList) obj4, this.e, (SegmentedButtonContentMeasurePolicy) obj3, this.f, (ArrayList) obj2, this.g, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$8;
        }
    }

    public /* synthetic */ gj(Placeable[] placeableArr, ColumnMeasurePolicy columnMeasurePolicy, int i, int i2, MeasureScope measureScope, int[] iArr) {
        this.h = placeableArr;
        this.i = columnMeasurePolicy;
        this.f = i;
        this.g = i2;
        this.e = measureScope;
        this.j = iArr;
    }
}
