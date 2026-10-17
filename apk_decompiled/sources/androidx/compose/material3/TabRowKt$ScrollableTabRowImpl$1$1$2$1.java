package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import defpackage.gi0;
import defpackage.gy;
import defpackage.ky;
import defpackage.p01;
import defpackage.w01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TabRowKt$ScrollableTabRowImpl$1$1$2$1 implements MultiContentMeasurePolicy {
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ float $minTabWidth;
    final /* synthetic */ TabRowKt$ScrollableTabRowImpl$1$scope$1$1 $scope;
    final /* synthetic */ ScrollableTabData $scrollableTabData;
    final /* synthetic */ int $selectedTabIndex;

    public TabRowKt$ScrollableTabRowImpl$1$1$2$1(float f, float f2, TabRowKt$ScrollableTabRowImpl$1$scope$1$1 tabRowKt$ScrollableTabRowImpl$1$scope$1$1, int i, ScrollableTabData scrollableTabData) {
        this.$edgePadding = f;
        this.$minTabWidth = f2;
        this.$scope = tabRowKt$ScrollableTabRowImpl$1$scope$1$1;
        this.$selectedTabIndex = i;
        this.$scrollableTabData = scrollableTabData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$7(gi0 gi0Var, float f, List list, List list2, ScrollableTabData scrollableTabData, MeasureScope measureScope, int i, List list3, int i2, int i3, Placeable.PlacementScope placementScope) {
        gi0Var.d = f;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list.get(i4), measureScope.mo361roundToPx0680j_4(gi0Var.d), 0, 0.0f, 4, null);
            gi0Var.d = Dp.m7611constructorimpl(((TabPosition) list3.get(i4)).m2503getWidthD9Ej5fM() + gi0Var.d);
        }
        int size2 = list2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Placeable placeable = (Placeable) list2.get(i5);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, Math.max(0, (measureScope.mo361roundToPx0680j_4(((TabPosition) list3.get(i2)).m2503getWidthD9Ej5fM()) - placeable.getWidth()) / 2), i3 - placeable.getHeight(), 0.0f, 4, null);
        }
        scrollableTabData.onLaidOut(measureScope, i, list3, i2);
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo709measure3p2s80s(final MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j) {
        List<? extends Measurable> list2 = list.get(0);
        List<? extends Measurable> list3 = list.get(1);
        final int mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4(this.$edgePadding);
        int size = list2.size();
        Integer num = 0;
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            num = Integer.valueOf(Math.max(num.intValue(), list2.get(i).maxIntrinsicHeight(Integer.MAX_VALUE)));
        }
        final int intValue = num.intValue();
        int i2 = mo361roundToPx0680j_4 * 2;
        long m7554copyZbe2FdA$default = Constraints.m7554copyZbe2FdA$default(j, measureScope.mo361roundToPx0680j_4(this.$minTabWidth), 0, intValue, intValue, 2, null);
        gi0 gi0Var = new gi0();
        gi0Var.d = this.$edgePadding;
        ArrayList arrayList = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3 = gy.a(list2.get(i3), m7554copyZbe2FdA$default, arrayList, i3, 1)) {
        }
        ArrayList arrayList2 = arrayList;
        int[] iArr = new int[16];
        int size4 = list2.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size4) {
            int maxIntrinsicWidth = list2.get(i4).maxIntrinsicWidth(Integer.MAX_VALUE);
            int i6 = i5 + 1;
            if (iArr.length < i6) {
                iArr = Arrays.copyOf(iArr, Math.max(i6, (iArr.length * 3) / 2));
            }
            iArr[i5] = maxIntrinsicWidth;
            i4++;
            i5 = i6;
        }
        float f = this.$minTabWidth;
        ArrayList arrayList3 = new ArrayList(size);
        int i7 = 0;
        while (i7 < size) {
            float m7625unboximpl = ((Dp) p01.v(Dp.m7609boximpl(f), Dp.m7609boximpl(measureScope.mo364toDpu2uoSUM(((Placeable) arrayList2.get(i7)).getWidth())))).m7625unboximpl();
            i2 = measureScope.mo361roundToPx0680j_4(m7625unboximpl) + i2;
            if (i7 < 0 || i7 >= i5) {
                throw new IndexOutOfBoundsException("Index must be between 0 and size");
            }
            TabPosition tabPosition = new TabPosition(gi0Var.d, m7625unboximpl, ((Dp) p01.v(Dp.m7609boximpl(Dp.m7611constructorimpl(measureScope.mo364toDpu2uoSUM(iArr[i7]) - Dp.m7611constructorimpl(TabKt.getHorizontalTextPadding() * 2.0f))), Dp.m7609boximpl(Dp.m7611constructorimpl(24.0f)))).m7625unboximpl(), null);
            gi0Var.d = Dp.m7611constructorimpl(gi0Var.d + m7625unboximpl);
            arrayList3.add(tabPosition);
            i7++;
            f = f;
        }
        this.$scope.setTabPositions(arrayList3);
        int i8 = this.$selectedTabIndex;
        final ArrayList arrayList4 = new ArrayList(list3.size());
        int size5 = list3.size();
        int i9 = 0;
        while (i9 < size5) {
            i9 = gy.a(list3.get(i9), Constraints.m7553copyZbe2FdA(j, 0, measureScope.mo361roundToPx0680j_4(((TabPosition) arrayList3.get(i8)).m2500getContentWidthD9Ej5fM()), 0, intValue), arrayList4, i9, 1);
            arrayList2 = arrayList2;
            arrayList3 = arrayList3;
            gi0Var = gi0Var;
        }
        final ArrayList arrayList5 = arrayList3;
        final ArrayList arrayList6 = arrayList2;
        final gi0 gi0Var2 = gi0Var;
        final float f2 = this.$edgePadding;
        final ScrollableTabData scrollableTabData = this.$scrollableTabData;
        final int i10 = this.$selectedTabIndex;
        return MeasureScope.layout$default(measureScope, i2, intValue, null, new ky() { // from class: androidx.compose.material3.f1
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 measure_3p2s80s$lambda$7;
                measure_3p2s80s$lambda$7 = TabRowKt$ScrollableTabRowImpl$1$1$2$1.measure_3p2s80s$lambda$7(gi0.this, f2, arrayList6, arrayList4, scrollableTabData, measureScope, mo361roundToPx0680j_4, arrayList5, i10, intValue, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$7;
            }
        }, 4, null);
    }
}
