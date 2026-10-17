package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import defpackage.hi0;
import defpackage.ky;
import defpackage.q10;
import defpackage.uf;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class BoxMeasurePolicy implements MeasurePolicy {
    private final Alignment alignment;
    private final boolean propagateMinConstraints;

    public BoxMeasurePolicy(Alignment alignment, boolean z) {
        this.alignment = alignment;
        this.propagateMinConstraints = z;
    }

    private final Alignment component1() {
        return this.alignment;
    }

    private final boolean component2() {
        return this.propagateMinConstraints;
    }

    public static /* synthetic */ BoxMeasurePolicy copy$default(BoxMeasurePolicy boxMeasurePolicy, Alignment alignment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            alignment = boxMeasurePolicy.alignment;
        }
        if ((i & 2) != 0) {
            z = boxMeasurePolicy.propagateMinConstraints;
        }
        return boxMeasurePolicy.copy(alignment, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(Placeable.PlacementScope placementScope) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$1(Placeable placeable, Measurable measurable, MeasureScope measureScope, int i, int i2, BoxMeasurePolicy boxMeasurePolicy, Placeable.PlacementScope placementScope) {
        BoxKt.placeInBox(placementScope, placeable, measurable, measureScope.getLayoutDirection(), i, i2, boxMeasurePolicy.alignment);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$4(Placeable[] placeableArr, List list, MeasureScope measureScope, hi0 hi0Var, hi0 hi0Var2, BoxMeasurePolicy boxMeasurePolicy, Placeable.PlacementScope placementScope) {
        int length = placeableArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Placeable placeable = placeableArr[i];
            placeable.getClass();
            BoxKt.placeInBox(placementScope, placeable, (Measurable) list.get(i2), measureScope.getLayoutDirection(), hi0Var.d, hi0Var2.d, boxMeasurePolicy.alignment);
            i++;
            i2++;
        }
        return w01.a;
    }

    public final BoxMeasurePolicy copy(Alignment alignment, boolean z) {
        return new BoxMeasurePolicy(alignment, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) obj;
        return q10.b(this.alignment, boxMeasurePolicy.alignment) && this.propagateMinConstraints == boxMeasurePolicy.propagateMinConstraints;
    }

    public int hashCode() {
        return Boolean.hashCode(this.propagateMinConstraints) + (this.alignment.hashCode() * 31);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo5measure3p2s80s(final MeasureScope measureScope, final List<? extends Measurable> list, long j) {
        boolean matchesParentSize;
        boolean matchesParentSize2;
        boolean matchesParentSize3;
        int m7565getMinHeightimpl;
        final int i;
        final Placeable mo6234measureBRTryo0;
        int i2 = 1;
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, Constraints.m7566getMinWidthimpl(j), Constraints.m7565getMinHeightimpl(j), null, new b(i2), 4, null);
        }
        long m7552constructorimpl = this.propagateMinConstraints ? j : Constraints.m7552constructorimpl(ConstraintsKt.MaxDimensionsAndFocusMask & j);
        if (list.size() == 1) {
            final Measurable measurable = list.get(0);
            matchesParentSize3 = BoxKt.getMatchesParentSize(measurable);
            if (matchesParentSize3) {
                int m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j);
                m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(j);
                i = m7566getMinWidthimpl;
                mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.Companion.m7574fixedJhjzzOo(Constraints.m7566getMinWidthimpl(j), Constraints.m7565getMinHeightimpl(j)));
            } else {
                Placeable mo6234measureBRTryo02 = measurable.mo6234measureBRTryo0(m7552constructorimpl);
                int max = Math.max(Constraints.m7566getMinWidthimpl(j), mo6234measureBRTryo02.getWidth());
                m7565getMinHeightimpl = Math.max(Constraints.m7565getMinHeightimpl(j), mo6234measureBRTryo02.getHeight());
                i = max;
                mo6234measureBRTryo0 = mo6234measureBRTryo02;
            }
            final int i3 = m7565getMinHeightimpl;
            return MeasureScope.layout$default(measureScope, i, i3, null, new ky() { // from class: androidx.compose.foundation.layout.c
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    w01 measure_3p2s80s$lambda$1;
                    measure_3p2s80s$lambda$1 = BoxMeasurePolicy.measure_3p2s80s$lambda$1(Placeable.this, measurable, measureScope, i, i3, this, (Placeable.PlacementScope) obj);
                    return measure_3p2s80s$lambda$1;
                }
            }, 4, null);
        }
        final Placeable[] placeableArr = new Placeable[list.size()];
        final hi0 hi0Var = new hi0();
        hi0Var.d = Constraints.m7566getMinWidthimpl(j);
        final hi0 hi0Var2 = new hi0();
        hi0Var2.d = Constraints.m7565getMinHeightimpl(j);
        int size = list.size();
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            Measurable measurable2 = list.get(i4);
            matchesParentSize2 = BoxKt.getMatchesParentSize(measurable2);
            if (matchesParentSize2) {
                z = true;
            } else {
                Placeable mo6234measureBRTryo03 = measurable2.mo6234measureBRTryo0(m7552constructorimpl);
                placeableArr[i4] = mo6234measureBRTryo03;
                hi0Var.d = Math.max(hi0Var.d, mo6234measureBRTryo03.getWidth());
                hi0Var2.d = Math.max(hi0Var2.d, mo6234measureBRTryo03.getHeight());
            }
        }
        if (z) {
            int i5 = hi0Var.d;
            int i6 = i5 != Integer.MAX_VALUE ? i5 : 0;
            int i7 = hi0Var2.d;
            long Constraints = ConstraintsKt.Constraints(i6, i5, i7 != Integer.MAX_VALUE ? i7 : 0, i7);
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                Measurable measurable3 = list.get(i8);
                matchesParentSize = BoxKt.getMatchesParentSize(measurable3);
                if (matchesParentSize) {
                    placeableArr[i8] = measurable3.mo6234measureBRTryo0(Constraints);
                }
            }
        }
        return MeasureScope.layout$default(measureScope, hi0Var.d, hi0Var2.d, null, new ky() { // from class: androidx.compose.foundation.layout.d
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 measure_3p2s80s$lambda$4;
                measure_3p2s80s$lambda$4 = BoxMeasurePolicy.measure_3p2s80s$lambda$4(placeableArr, list, measureScope, hi0Var, hi0Var2, this, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$4;
            }
        }, 4, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.alignment);
        sb.append(", propagateMinConstraints=");
        return uf.e(sb, this.propagateMinConstraints, ')');
    }
}
