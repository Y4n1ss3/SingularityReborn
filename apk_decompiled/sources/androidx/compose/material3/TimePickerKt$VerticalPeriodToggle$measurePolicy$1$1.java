package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.gy;
import defpackage.k4;
import defpackage.q10;
import defpackage.w01;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1 implements MeasurePolicy {
    public static final TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1 INSTANCE = new TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$3(List list, Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, (Placeable) list.get(0), 0, 0, 0.0f, 4, null);
        Placeable.PlacementScope.place$default(placementScope, (Placeable) list.get(1), 0, ((Placeable) list.get(0)).getHeight(), 0.0f, 4, null);
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, ((Placeable) list.get(0)).getHeight() - (placeable.getHeight() / 2), 0.0f, 4, null);
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = list.get(i2);
            if (q10.b(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, measureScope.mo361roundToPx0680j_4(TimePickerTokens.INSTANCE.m3714getPeriodSelectorOutlineWidthD9Ej5fM()), 3, null));
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Measurable measurable2 = list.get(i3);
                    if (!q10.b(LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                        arrayList.add(measurable2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                while (i < size3) {
                    i = gy.a((Measurable) arrayList.get(i), Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, Constraints.m7563getMaxHeightimpl(j) / 2, 3, null), arrayList2, i, 1);
                }
                return MeasureScope.layout$default(measureScope, Constraints.m7564getMaxWidthimpl(j), Constraints.m7563getMaxHeightimpl(j), null, new q1(arrayList2, mo6234measureBRTryo0, 1), 4, null);
            }
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }
}
