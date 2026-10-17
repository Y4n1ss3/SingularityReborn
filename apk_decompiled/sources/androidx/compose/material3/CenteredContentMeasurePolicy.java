package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import defpackage.gy;
import defpackage.hi0;
import defpackage.w01;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class CenteredContentMeasurePolicy implements MeasurePolicy {
    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(Placeable.PlacementScope placementScope) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$5(hi0 hi0Var, List list, Placeable.PlacementScope placementScope) {
        int i = hi0Var.d;
        int size = list.size();
        int i2 = i;
        for (int i3 = 0; i3 < size; i3++) {
            Placeable placeable = (Placeable) list.get(i3);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i2, 0, 0.0f, 4, null);
            i2 += placeable.getWidth();
        }
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int calculateCenteredContentHorizontalPadding;
        ArrayList arrayList;
        int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
        int m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(j);
        int size = list.size();
        if (size < 1) {
            return MeasureScope.layout$default(measureScope, m7564getMaxWidthimpl, m7565getMinHeightimpl, null, new d(1), 4, null);
        }
        hi0 hi0Var = new hi0();
        int i = 0;
        if (Constraints.m7560getHasBoundedWidthimpl(j)) {
            int i2 = m7564getMaxWidthimpl / size;
            calculateCenteredContentHorizontalPadding = ShortNavigationBarKt.calculateCenteredContentHorizontalPadding(size, m7564getMaxWidthimpl);
            hi0Var.d = calculateCenteredContentHorizontalPadding;
            int i3 = (m7564getMaxWidthimpl - (calculateCenteredContentHorizontalPadding * 2)) / size;
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                int maxIntrinsicHeight = list.get(i4).maxIntrinsicHeight(i3);
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
            int i5 = 0;
            while (i5 < size3) {
                Measurable measurable = list.get(i5);
                int maxIntrinsicWidth = measurable.maxIntrinsicWidth(Constraints.m7565getMinHeightimpl(j));
                if (i3 < maxIntrinsicWidth) {
                    if (maxIntrinsicWidth > i2) {
                        maxIntrinsicWidth = i2;
                    }
                    hi0Var.d -= (maxIntrinsicWidth - i3) / 2;
                } else {
                    maxIntrinsicWidth = i3;
                }
                i5 = gy.a(measurable, ConstraintsKt.m7579constrainN9IONVI(j, Constraints.Companion.m7574fixedJhjzzOo(maxIntrinsicWidth, m7565getMinHeightimpl)), arrayList2, i5, 1);
            }
            arrayList = arrayList2;
        } else {
            arrayList = new ArrayList(list.size());
            int size4 = list.size();
            for (int i6 = 0; i6 < size4; i6++) {
                arrayList.add(list.get(i6).mo6234measureBRTryo0(ConstraintsKt.m7579constrainN9IONVI(j, Constraints.Companion.m7575fixedHeightOenEA2s(m7565getMinHeightimpl))));
            }
        }
        return MeasureScope.layout$default(measureScope, m7564getMaxWidthimpl, m7565getMinHeightimpl, null, new j(i, arrayList, hi0Var), 4, null);
    }
}
