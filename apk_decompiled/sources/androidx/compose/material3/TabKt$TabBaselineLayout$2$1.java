package androidx.compose.material3;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.k4;
import defpackage.my;
import defpackage.q10;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TabKt$TabBaselineLayout$2$1 implements MeasurePolicy {
    final /* synthetic */ my $icon;
    final /* synthetic */ my $text;

    public TabKt$TabBaselineLayout$2$1(my myVar, my myVar2) {
        this.$text = myVar;
        this.$icon = myVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$4(Placeable placeable, Placeable placeable2, MeasureScope measureScope, int i, int i2, Integer num, Integer num2, Placeable.PlacementScope placementScope) {
        if (placeable != null && placeable2 != null) {
            num.getClass();
            int intValue = num.intValue();
            num2.getClass();
            TabKt.placeTextAndIcon(placementScope, measureScope, placeable, placeable2, i, i2, intValue, num2.intValue());
        } else if (placeable != null) {
            TabKt.placeTextOrIcon(placementScope, placeable, i2);
        } else if (placeable2 != null) {
            TabKt.placeTextOrIcon(placementScope, placeable2, i2);
        }
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Placeable placeable;
        Placeable placeable2;
        long j2;
        if (this.$text != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Measurable measurable = list.get(i);
                if (q10.b(LayoutIdKt.getLayoutId(measurable), "text")) {
                    placeable = measurable.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                }
            }
            throw k4.m("Collection contains no element matching the predicate.");
        }
        placeable = null;
        if (this.$icon != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Measurable measurable2 = list.get(i2);
                if (q10.b(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                    placeable2 = measurable2.mo6234measureBRTryo0(j);
                }
            }
            throw k4.m("Collection contains no element matching the predicate.");
        }
        placeable2 = null;
        int max = Math.max(placeable != null ? placeable.getWidth() : 0, placeable2 != null ? placeable2.getWidth() : 0);
        int mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4((placeable == null || placeable2 == null) ? TabKt.SmallTabHeight : TabKt.LargeTabHeight);
        int height = (placeable2 != null ? placeable2.getHeight() : 0) + (placeable != null ? placeable.getHeight() : 0);
        j2 = TabKt.IconDistanceFromBaseline;
        int max2 = Math.max(mo361roundToPx0680j_4, measureScope.mo360roundToPxR2X_6o(j2) + height);
        return MeasureScope.layout$default(measureScope, max, max2, null, new x(placeable, placeable2, measureScope, max, max2, placeable != null ? Integer.valueOf(placeable.get(AlignmentLineKt.getFirstBaseline())) : null, placeable != null ? Integer.valueOf(placeable.get(AlignmentLineKt.getLastBaseline())) : null), 4, null);
    }
}
