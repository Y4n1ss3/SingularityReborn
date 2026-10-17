package androidx.compose.ui.spatial;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class EmptyFillMeasurePolicy implements MeasurePolicy {
    public static final EmptyFillMeasurePolicy INSTANCE = new EmptyFillMeasurePolicy();

    private EmptyFillMeasurePolicy() {
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        return MeasureScope.layout$default(measureScope, Constraints.m7564getMaxWidthimpl(j), Constraints.m7563getMaxHeightimpl(j), null, EmptyFillMeasurePolicy$measure$1.INSTANCE, 4, null);
    }
}
