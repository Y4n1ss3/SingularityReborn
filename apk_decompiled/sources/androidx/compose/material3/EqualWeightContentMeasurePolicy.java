package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import defpackage.gy;
import defpackage.w01;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class EqualWeightContentMeasurePolicy implements MeasurePolicy {
    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(Placeable.PlacementScope placementScope) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$5(List list, Placeable.PlacementScope placementScope) {
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Placeable placeable = (Placeable) list.get(i);
            Placeable.PlacementScope placementScope2 = placementScope;
            Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, i2, 0, 0.0f, 4, null);
            i2 += placeable.getWidth();
            i++;
            placementScope = placementScope2;
        }
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        ArrayList arrayList;
        int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
        int m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(j);
        int size = list.size();
        if (size < 1) {
            return MeasureScope.layout$default(measureScope, m7564getMaxWidthimpl, m7565getMinHeightimpl, null, new d(10), 4, null);
        }
        if (Constraints.m7560getHasBoundedWidthimpl(j)) {
            int i = m7564getMaxWidthimpl / size;
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int maxIntrinsicHeight = list.get(i2).maxIntrinsicHeight(i);
                if (m7565getMinHeightimpl < maxIntrinsicHeight) {
                    int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j);
                    if (maxIntrinsicHeight > m7563getMaxHeightimpl) {
                        maxIntrinsicHeight = m7563getMaxHeightimpl;
                    }
                    m7565getMinHeightimpl = maxIntrinsicHeight;
                }
            }
            ArrayList arrayList2 = new ArrayList(list.size());
            int size3 = list.size();
            int i3 = 0;
            while (i3 < size3) {
                i3 = gy.a(list.get(i3), ConstraintsKt.m7579constrainN9IONVI(j, Constraints.Companion.m7574fixedJhjzzOo(i, m7565getMinHeightimpl)), arrayList2, i3, 1);
            }
            arrayList = arrayList2;
        } else {
            arrayList = new ArrayList(list.size());
            int size4 = list.size();
            for (int i4 = 0; i4 < size4; i4++) {
                arrayList.add(list.get(i4).mo6234measureBRTryo0(ConstraintsKt.m7579constrainN9IONVI(j, Constraints.Companion.m7575fixedHeightOenEA2s(m7565getMinHeightimpl))));
            }
        }
        return MeasureScope.layout$default(measureScope, m7564getMaxWidthimpl, m7565getMinHeightimpl, null, new o(arrayList, 2), 4, null);
    }
}
