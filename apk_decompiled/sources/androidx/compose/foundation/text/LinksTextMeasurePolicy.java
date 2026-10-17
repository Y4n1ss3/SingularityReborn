package androidx.compose.foundation.text;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import defpackage.iy;
import defpackage.w01;
import defpackage.xe0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class LinksTextMeasurePolicy implements MeasurePolicy {
    private final iy shouldMeasureLinks;

    public LinksTextMeasurePolicy(iy iyVar) {
        this.shouldMeasureLinks = iyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(List list, LinksTextMeasurePolicy linksTextMeasurePolicy, Placeable.PlacementScope placementScope) {
        List measureWithTextRangeMeasureConstraints;
        measureWithTextRangeMeasureConstraints = BasicTextKt.measureWithTextRangeMeasureConstraints(list, linksTextMeasurePolicy.shouldMeasureLinks);
        if (measureWithTextRangeMeasureConstraints != null) {
            int size = measureWithTextRangeMeasureConstraints.size();
            for (int i = 0; i < size; i++) {
                xe0 xe0Var = (xe0) measureWithTextRangeMeasureConstraints.get(i);
                Placeable placeable = (Placeable) xe0Var.d;
                iy iyVar = (iy) xe0Var.e;
                Placeable.PlacementScope.m6303place70tqf50$default(placementScope, placeable, iyVar != null ? ((IntOffset) iyVar.invoke()).m7748unboximpl() : IntOffset.Companion.m7750getZeronOccac(), 0.0f, 2, null);
            }
        }
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        return MeasureScope.layout$default(measureScope, Constraints.m7564getMaxWidthimpl(j), Constraints.m7563getMaxHeightimpl(j), null, new c(1, list, this), 4, null);
    }
}
