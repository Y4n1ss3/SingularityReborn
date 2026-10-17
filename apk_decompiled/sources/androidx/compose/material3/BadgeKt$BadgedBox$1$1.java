package androidx.compose.material3;

import androidx.compose.material3.tokens.BadgeTokens;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.k4;
import defpackage.p80;
import defpackage.q10;
import defpackage.w01;
import defpackage.xe0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BadgeKt$BadgedBox$1$1 implements MeasurePolicy {
    public static final BadgeKt$BadgedBox$1$1 INSTANCE = new BadgeKt$BadgedBox$1$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$2(Placeable placeable, MeasureScope measureScope, Placeable placeable2, Placeable.PlacementScope placementScope) {
        boolean z = placeable.getWidth() > measureScope.mo361roundToPx0680j_4(BadgeTokens.INSTANCE.m3032getSizeD9Ej5fM());
        float badgeWithContentHorizontalOffset = z ? BadgeKt.getBadgeWithContentHorizontalOffset() : BadgeKt.getBadgeOffset();
        float badgeWithContentVerticalOffset = z ? BadgeKt.getBadgeWithContentVerticalOffset() : BadgeKt.getBadgeOffset();
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, 0, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, Math.min(placeable2.getWidth() - measureScope.mo361roundToPx0680j_4(badgeWithContentHorizontalOffset), ((int) placementScope.current(BadgeKt.getBadgeEndRuler(), Float.POSITIVE_INFINITY)) - placeable.getWidth()), Math.max(measureScope.mo361roundToPx0680j_4(badgeWithContentVerticalOffset) + (-placeable.getHeight()), (int) placementScope.current(BadgeKt.getBadgeTopRuler(), Float.NEGATIVE_INFINITY)), 0.0f, 4, null);
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = list.get(i);
            if (q10.b(LayoutIdKt.getLayoutId(measurable), "badge")) {
                Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Measurable measurable2 = list.get(i2);
                    if (q10.b(LayoutIdKt.getLayoutId(measurable2), "anchor")) {
                        Placeable mo6234measureBRTryo02 = measurable2.mo6234measureBRTryo0(j);
                        return measureScope.layout(mo6234measureBRTryo02.getWidth(), mo6234measureBRTryo02.getHeight(), p80.M(new xe0(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(mo6234measureBRTryo02.get(AlignmentLineKt.getFirstBaseline()))), new xe0(AlignmentLineKt.getLastBaseline(), Integer.valueOf(mo6234measureBRTryo02.get(AlignmentLineKt.getLastBaseline())))), new e(mo6234measureBRTryo0, measureScope, mo6234measureBRTryo02));
                    }
                }
                throw k4.m("Collection contains no element matching the predicate.");
            }
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }
}
