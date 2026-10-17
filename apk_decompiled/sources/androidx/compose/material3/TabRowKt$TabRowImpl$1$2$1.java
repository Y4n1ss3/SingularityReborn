package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.hi0;
import defpackage.ky;
import defpackage.p01;
import defpackage.w01;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TabRowKt$TabRowImpl$1$2$1 implements MultiContentMeasurePolicy {
    final /* synthetic */ TabRowKt$TabRowImpl$1$scope$1$1 $scope;

    public TabRowKt$TabRowImpl$1$2$1(TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1) {
        this.$scope = tabRowKt$TabRowImpl$1$scope$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$8(List list, List list2, List list3, hi0 hi0Var, int i, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list.get(i2), i2 * hi0Var.d, 0, 0.0f, 4, null);
        }
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Placeable placeable = (Placeable) list2.get(i3);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i - placeable.getHeight(), 0.0f, 4, null);
        }
        int size3 = list3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Placeable placeable2 = (Placeable) list3.get(i4);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, i - placeable2.getHeight(), 0.0f, 4, null);
        }
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo709measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j) {
        List<? extends Measurable> list2 = list.get(0);
        List<? extends Measurable> list3 = list.get(1);
        List<? extends Measurable> list4 = list.get(2);
        int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
        int size = list2.size();
        final hi0 hi0Var = new hi0();
        if (size > 0) {
            hi0Var.d = m7564getMaxWidthimpl / size;
        }
        Integer num = 0;
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            num = Integer.valueOf(Math.max(list2.get(i).maxIntrinsicHeight(hi0Var.d), num.intValue()));
        }
        int intValue = num.intValue();
        TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1 = this.$scope;
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new TabPosition(Dp.m7611constructorimpl(measureScope.mo364toDpu2uoSUM(hi0Var.d) * i2), measureScope.mo364toDpu2uoSUM(hi0Var.d), ((Dp) p01.v(Dp.m7609boximpl(Dp.m7611constructorimpl(measureScope.mo364toDpu2uoSUM(Math.min(list2.get(i2).maxIntrinsicWidth(intValue), hi0Var.d)) - Dp.m7611constructorimpl(TabKt.getHorizontalTextPadding() * 2.0f))), Dp.m7609boximpl(Dp.m7611constructorimpl(24.0f)))).m7625unboximpl(), null));
        }
        tabRowKt$TabRowImpl$1$scope$1$1.setTabPositions(arrayList);
        final ArrayList arrayList2 = new ArrayList(list2.size());
        int size3 = list2.size();
        int i3 = 0;
        while (i3 < size3) {
            Measurable measurable = list2.get(i3);
            int i4 = hi0Var.d;
            int i5 = intValue;
            i3 = gy.a(measurable, Constraints.m7553copyZbe2FdA(j, i4, i4, i5, intValue), arrayList2, i3, 1);
            intValue = i5;
        }
        final int i6 = intValue;
        final ArrayList arrayList3 = new ArrayList(list3.size());
        int size4 = list3.size();
        int i7 = 0;
        while (i7 < size4) {
            i7 = gy.a(list3.get(i7), Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null), arrayList3, i7, 1);
        }
        final ArrayList arrayList4 = new ArrayList(list4.size());
        int size5 = list4.size();
        int i8 = 0;
        while (i8 < size5) {
            Measurable measurable2 = list4.get(i8);
            int i9 = hi0Var.d;
            int i10 = i6;
            i6 = i10;
            i8 = gy.a(measurable2, Constraints.m7553copyZbe2FdA(j, i9, i9, 0, i10), arrayList4, i8, 1);
        }
        return MeasureScope.layout$default(measureScope, m7564getMaxWidthimpl, i6, null, new ky() { // from class: androidx.compose.material3.i1
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 measure_3p2s80s$lambda$8;
                measure_3p2s80s$lambda$8 = TabRowKt$TabRowImpl$1$2$1.measure_3p2s80s$lambda$8(arrayList2, arrayList3, arrayList4, hi0Var, i6, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$8;
            }
        }, 4, null);
    }
}
