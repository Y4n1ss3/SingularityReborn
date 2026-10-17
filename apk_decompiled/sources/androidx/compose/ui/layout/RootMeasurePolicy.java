package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {
    public static final int $stable = 0;
    public static final RootMeasurePolicy INSTANCE = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int size = list.size();
        if (size == 0) {
            return MeasureScope.layout$default(measureScope, Constraints.m7566getMinWidthimpl(j), Constraints.m7565getMinHeightimpl(j), null, RootMeasurePolicy$measure$1.INSTANCE, 4, null);
        }
        if (size == 1) {
            Placeable mo6234measureBRTryo0 = list.get(0).mo6234measureBRTryo0(j);
            return MeasureScope.layout$default(measureScope, ConstraintsKt.m7581constrainWidthK40F9xA(j, mo6234measureBRTryo0.getWidth()), ConstraintsKt.m7580constrainHeightK40F9xA(j, mo6234measureBRTryo0.getHeight()), null, new RootMeasurePolicy$measure$2(mo6234measureBRTryo0), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            Placeable mo6234measureBRTryo02 = list.get(i3).mo6234measureBRTryo0(j);
            i = Math.max(mo6234measureBRTryo02.getWidth(), i);
            i2 = Math.max(mo6234measureBRTryo02.getHeight(), i2);
            arrayList.add(mo6234measureBRTryo02);
        }
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m7581constrainWidthK40F9xA(j, i), ConstraintsKt.m7580constrainHeightK40F9xA(j, i2), null, new RootMeasurePolicy$measure$3(arrayList), 4, null);
    }
}
