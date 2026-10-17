package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import defpackage.ac;
import defpackage.hi0;
import defpackage.j50;
import defpackage.k4;
import defpackage.ky;
import defpackage.q10;
import defpackage.w01;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SliderKt$SliderImpl$2$1 implements MeasurePolicy {
    final /* synthetic */ SliderState $state;

    public SliderKt$SliderImpl$2$1(SliderState sliderState) {
        this.$state = sliderState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$3(Placeable placeable, int i, int i2, Placeable placeable2, int i3, hi0 hi0Var, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i, i2, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3, hi0Var.d, 0.0f, 4, null);
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int width;
        int max;
        int width2;
        final int c;
        final int i;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = list.get(i2);
            if (LayoutIdKt.getLayoutId(measurable) == SliderComponents.THUMB) {
                long j2 = j;
                final Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j2);
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    Measurable measurable2 = list.get(i3);
                    if (LayoutIdKt.getLayoutId(measurable2) == SliderComponents.TRACK) {
                        Orientation orientation$material3 = this.$state.getOrientation$material3();
                        Orientation orientation = Orientation.Vertical;
                        final Placeable mo6234measureBRTryo02 = orientation$material3 == orientation ? measurable2.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(ConstraintsKt.m7584offsetNN6EwU$default(j2, 0, -mo6234measureBRTryo0.getHeight(), 1, null), 0, 0, 0, 0, 14, null)) : measurable2.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(ConstraintsKt.m7584offsetNN6EwU$default(j, -mo6234measureBRTryo0.getWidth(), 0, 2, null), 0, 0, 0, 0, 11, null));
                        final hi0 hi0Var = new hi0();
                        float coercedValueAsFraction = this.$state.getCoercedValueAsFraction();
                        boolean z = q10.a(ac.b0(this.$state.getTickFractions$material3()), coercedValueAsFraction) || q10.a(ac.i0(this.$state.getTickFractions$material3()), coercedValueAsFraction);
                        int i4 = mo6234measureBRTryo02.get(SliderKt.getCornerSizeAlignmentLine());
                        int i5 = i4 != Integer.MIN_VALUE ? i4 : 0;
                        if (this.$state.getOrientation$material3() == orientation) {
                            width = Math.max(mo6234measureBRTryo02.getWidth(), mo6234measureBRTryo0.getWidth());
                            max = mo6234measureBRTryo02.getHeight() + mo6234measureBRTryo0.getHeight();
                            width2 = j50.p(width, 2, mo6234measureBRTryo02);
                            c = mo6234measureBRTryo0.getHeight() / 2;
                            int p = j50.p(width, 2, mo6234measureBRTryo0);
                            hi0Var.d = (this.$state.getSteps() <= 0 || z) ? y80.P(mo6234measureBRTryo02.getHeight() * coercedValueAsFraction) : y80.P((mo6234measureBRTryo02.getHeight() - (i5 * 2)) * coercedValueAsFraction) + i5;
                            if (this.$state.getReverseVerticalDirection$material3()) {
                                hi0Var.d = mo6234measureBRTryo02.getHeight() - hi0Var.d;
                            }
                            i = p;
                        } else {
                            width = mo6234measureBRTryo0.getWidth() + mo6234measureBRTryo02.getWidth();
                            max = Math.max(mo6234measureBRTryo02.getHeight(), mo6234measureBRTryo0.getHeight());
                            width2 = mo6234measureBRTryo0.getWidth() / 2;
                            c = j50.c(max, 2, mo6234measureBRTryo02);
                            int P = (this.$state.getSteps() <= 0 || z) ? y80.P(mo6234measureBRTryo02.getWidth() * coercedValueAsFraction) : y80.P((mo6234measureBRTryo02.getWidth() - (i5 * 2)) * coercedValueAsFraction) + i5;
                            hi0Var.d = j50.c(max, 2, mo6234measureBRTryo0);
                            i = P;
                        }
                        int i6 = width;
                        int i7 = max;
                        final int i8 = width2;
                        this.$state.updateDimensions$material3(i6, i7);
                        return MeasureScope.layout$default(measureScope, i6, i7, null, new ky() { // from class: androidx.compose.material3.b1
                            @Override // defpackage.ky
                            public final Object invoke(Object obj) {
                                w01 measure_3p2s80s$lambda$3;
                                measure_3p2s80s$lambda$3 = SliderKt$SliderImpl$2$1.measure_3p2s80s$lambda$3(Placeable.this, i8, c, mo6234measureBRTryo0, i, hi0Var, (Placeable.PlacementScope) obj);
                                return measure_3p2s80s$lambda$3;
                            }
                        }, 4, null);
                    }
                    i3++;
                    j2 = j;
                }
                throw k4.m("Collection contains no element matching the predicate.");
            }
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }
}
