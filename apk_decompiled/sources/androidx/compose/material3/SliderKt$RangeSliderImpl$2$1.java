package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import defpackage.ac;
import defpackage.j50;
import defpackage.k4;
import defpackage.ky;
import defpackage.q10;
import defpackage.w01;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SliderKt$RangeSliderImpl$2$1 implements MeasurePolicy {
    final /* synthetic */ RangeSliderState $state;

    public SliderKt$RangeSliderImpl$2$1(RangeSliderState rangeSliderState) {
        this.$state = rangeSliderState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$4(Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i, i2, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3, i4, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i5, i6, 0.0f, 4, null);
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        long j2 = j;
        int size = list.size();
        int i = 0;
        while (i < size) {
            Measurable measurable = list.get(i);
            if (LayoutIdKt.getLayoutId(measurable) == RangeSliderComponents.STARTTHUMB) {
                final Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j2);
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    Measurable measurable2 = list.get(i2);
                    if (LayoutIdKt.getLayoutId(measurable2) == RangeSliderComponents.ENDTHUMB) {
                        final Placeable mo6234measureBRTryo02 = measurable2.mo6234measureBRTryo0(j2);
                        int size3 = list.size();
                        int i3 = 0;
                        while (i3 < size3) {
                            Measurable measurable3 = list.get(i3);
                            if (LayoutIdKt.getLayoutId(measurable3) == RangeSliderComponents.TRACK) {
                                final Placeable mo6234measureBRTryo03 = measurable3.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(ConstraintsKt.m7584offsetNN6EwU$default(j2, (-(mo6234measureBRTryo02.getWidth() + mo6234measureBRTryo0.getWidth())) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                int width = ((mo6234measureBRTryo02.getWidth() + mo6234measureBRTryo0.getWidth()) / 2) + mo6234measureBRTryo03.getWidth();
                                int max = Math.max(mo6234measureBRTryo03.getHeight(), Math.max(mo6234measureBRTryo0.getHeight(), mo6234measureBRTryo02.getHeight()));
                                this.$state.setTotalWidth$material3(width);
                                this.$state.updateMinMaxPx$material3();
                                float coercedActiveRangeStartAsFraction$material3 = this.$state.getCoercedActiveRangeStartAsFraction$material3();
                                boolean z = true;
                                boolean z2 = q10.a(ac.b0(this.$state.getTickFractions$material3()), coercedActiveRangeStartAsFraction$material3) || q10.a(ac.i0(this.$state.getTickFractions$material3()), coercedActiveRangeStartAsFraction$material3);
                                float coercedActiveRangeEndAsFraction$material3 = this.$state.getCoercedActiveRangeEndAsFraction$material3();
                                if (!q10.a(ac.b0(this.$state.getTickFractions$material3()), coercedActiveRangeEndAsFraction$material3) && !q10.a(ac.i0(this.$state.getTickFractions$material3()), coercedActiveRangeEndAsFraction$material3)) {
                                    z = false;
                                }
                                final int width2 = mo6234measureBRTryo0.getWidth() / 2;
                                int i4 = mo6234measureBRTryo03.get(SliderKt.getCornerSizeAlignmentLine());
                                int i5 = i4 != Integer.MIN_VALUE ? i4 : 0;
                                final int P = (this.$state.getSteps() <= 0 || z2) ? y80.P(mo6234measureBRTryo03.getWidth() * coercedActiveRangeStartAsFraction$material3) : y80.P((mo6234measureBRTryo03.getWidth() - (i5 * 2)) * coercedActiveRangeStartAsFraction$material3) + i5;
                                int p = j50.p(mo6234measureBRTryo0.getWidth(), 2, mo6234measureBRTryo02);
                                final int P2 = (this.$state.getSteps() <= 0 || z) ? y80.P((mo6234measureBRTryo03.getWidth() * coercedActiveRangeEndAsFraction$material3) + p) : y80.P(((mo6234measureBRTryo03.getWidth() - (i5 * 2)) * coercedActiveRangeEndAsFraction$material3) + p) + i5;
                                final int c = j50.c(max, 2, mo6234measureBRTryo03);
                                final int c2 = j50.c(max, 2, mo6234measureBRTryo0);
                                final int c3 = j50.c(max, 2, mo6234measureBRTryo02);
                                return MeasureScope.layout$default(measureScope, width, max, null, new ky() { // from class: androidx.compose.material3.a1
                                    @Override // defpackage.ky
                                    public final Object invoke(Object obj) {
                                        w01 measure_3p2s80s$lambda$4;
                                        measure_3p2s80s$lambda$4 = SliderKt$RangeSliderImpl$2$1.measure_3p2s80s$lambda$4(Placeable.this, width2, c, mo6234measureBRTryo0, P, c2, mo6234measureBRTryo02, P2, c3, (Placeable.PlacementScope) obj);
                                        return measure_3p2s80s$lambda$4;
                                    }
                                }, 4, null);
                            }
                            i3++;
                            j2 = j;
                        }
                        throw k4.m("Collection contains no element matching the predicate.");
                    }
                    i2++;
                    j2 = j;
                }
                throw k4.m("Collection contains no element matching the predicate.");
            }
            i++;
            j2 = j;
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }
}
