package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.gy;
import defpackage.j50;
import defpackage.ky;
import defpackage.w01;
import defpackage.y80;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimePickerKt$CircularLayout$1$1 implements MeasurePolicy {
    final /* synthetic */ float $radiusToSizeRatio;

    public TimePickerKt$CircularLayout$1$1(float f) {
        this.$radiusToSizeRatio = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$5(Placeable placeable, List list, Placeable placeable2, long j, float f, float f2, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Placeable placeable3 = (Placeable) list.get(i);
            double d = f;
            double d2 = (i * f2) - 1.5707963267948966d;
            Placeable.PlacementScope.place$default(placementScope, placeable3, y80.O((Math.cos(d2) * d) + ((Constraints.m7564getMaxWidthimpl(j) / 2) - (placeable3.getWidth() / 2))), y80.O((Math.sin(d2) * d) + ((Constraints.m7563getMaxHeightimpl(j) / 2) - (placeable3.getHeight() / 2))), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.place$default(placementScope, placeable2, j50.p(Constraints.m7566getMinWidthimpl(j), 2, placeable2), j50.c(Constraints.m7565getMinHeightimpl(j), 2, placeable2), 0.0f, 4, null);
        }
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, final long j) {
        Measurable measurable;
        Measurable measurable2;
        final float m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j) * this.$radiusToSizeRatio;
        int i = 0;
        long m7554copyZbe2FdA$default = Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable3 = list.get(i2);
            Measurable measurable4 = measurable3;
            if (LayoutIdKt.getLayoutId(measurable4) != LayoutId.Selector && LayoutIdKt.getLayoutId(measurable4) != LayoutId.InnerCircle) {
                arrayList.add(measurable3);
            }
        }
        final ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3 = gy.a((Measurable) arrayList.get(i3), m7554copyZbe2FdA$default, arrayList2, i3, 1)) {
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                measurable = null;
                break;
            }
            measurable = list.get(i4);
            if (LayoutIdKt.getLayoutId(measurable) == LayoutId.Selector) {
                break;
            }
            i4++;
        }
        Measurable measurable5 = measurable;
        int size4 = list.size();
        while (true) {
            if (i >= size4) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i);
            if (LayoutIdKt.getLayoutId(measurable2) == LayoutId.InnerCircle) {
                break;
            }
            i++;
        }
        Measurable measurable6 = measurable2;
        final float size5 = 6.2831855f / arrayList2.size();
        Placeable mo6234measureBRTryo0 = measurable5 != null ? measurable5.mo6234measureBRTryo0(m7554copyZbe2FdA$default) : null;
        final Placeable mo6234measureBRTryo02 = measurable6 != null ? measurable6.mo6234measureBRTryo0(m7554copyZbe2FdA$default) : null;
        final Placeable placeable = mo6234measureBRTryo0;
        return MeasureScope.layout$default(measureScope, Constraints.m7566getMinWidthimpl(j), Constraints.m7565getMinHeightimpl(j), null, new ky() { // from class: androidx.compose.material3.o1
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 measure_3p2s80s$lambda$5;
                measure_3p2s80s$lambda$5 = TimePickerKt$CircularLayout$1$1.measure_3p2s80s$lambda$5(Placeable.this, arrayList2, mo6234measureBRTryo02, j, m7563getMaxHeightimpl, size5, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$5;
            }
        }, 4, null);
    }
}
