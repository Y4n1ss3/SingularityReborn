package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.gc;
import defpackage.k4;
import defpackage.ky;
import defpackage.q10;
import defpackage.w01;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SearchBarKt$SearchBarLayout$2$1 implements MeasurePolicy {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
    final /* synthetic */ MutableState<gc> $currentBackEvent;
    final /* synthetic */ MutableFloatState $finalBackProgress;
    final /* synthetic */ MutableState<gc> $firstBackEvent;
    final /* synthetic */ MutableWindowInsets $unconsumedInsets;

    public SearchBarKt$SearchBarLayout$2$1(Animatable<Float, AnimationVector1D> animatable, MutableWindowInsets mutableWindowInsets, MutableState<gc> mutableState, MutableFloatState mutableFloatState, MutableState<gc> mutableState2) {
        this.$animationProgress = animatable;
        this.$unconsumedInsets = mutableWindowInsets;
        this.$currentBackEvent = mutableState;
        this.$finalBackProgress = mutableFloatState;
        this.$firstBackEvent = mutableState2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$3(MeasureScope measureScope, long j, MutableState mutableState, float f, float f2, MutableState mutableState2, int i, Placeable placeable, int i2, Placeable placeable2, int i3, Placeable placeable3, int i4, Placeable.PlacementScope placementScope) {
        float f3;
        int m2331calculatePredictiveBackOffsetXrOvwMX4;
        float f4;
        int m2332calculatePredictiveBackOffsetYdzo92Q0;
        f3 = SearchBarKt.SearchBarPredictiveBackMinMargin;
        int mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4(f3);
        m2331calculatePredictiveBackOffsetXrOvwMX4 = SearchBarKt.m2331calculatePredictiveBackOffsetXrOvwMX4(j, mo361roundToPx0680j_4, (gc) mutableState.getValue(), measureScope.getLayoutDirection(), f, f2);
        gc gcVar = (gc) mutableState.getValue();
        gc gcVar2 = (gc) mutableState2.getValue();
        f4 = SearchBarKt.SearchBarPredictiveBackMaxOffsetY;
        m2332calculatePredictiveBackOffsetYdzo92Q0 = SearchBarKt.m2332calculatePredictiveBackOffsetYdzo92Q0(j, mo361roundToPx0680j_4, gcVar, gcVar2, i, measureScope.mo361roundToPx0680j_4(f4), f2);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, m2331calculatePredictiveBackOffsetXrOvwMX4, m2332calculatePredictiveBackOffsetYdzo92Q0 + i2, 0.0f, 4, null);
        int i5 = m2332calculatePredictiveBackOffsetYdzo92Q0 + i3;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, m2331calculatePredictiveBackOffsetXrOvwMX4, i5, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, m2331calculatePredictiveBackOffsetXrOvwMX4, placeable2.getHeight() + i5 + i4, 0.0f, 4, null);
        }
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo5measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, final long j) {
        Measurable measurable;
        final float calculatePredictiveBackMultiplier;
        final Placeable placeable;
        int m7563getMaxHeightimpl;
        MeasureScope measureScope2 = measureScope;
        long j2 = j;
        final float floatValue = this.$animationProgress.getValue().floatValue();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Measurable measurable2 = list.get(i);
            if (q10.b(LayoutIdKt.getLayoutId(measurable2), "InputField")) {
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    Measurable measurable3 = list.get(i2);
                    if (q10.b(LayoutIdKt.getLayoutId(measurable3), "Surface")) {
                        int size3 = list.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size3) {
                                measurable = null;
                                break;
                            }
                            measurable = list.get(i3);
                            if (q10.b(LayoutIdKt.getLayoutId(measurable), "Content")) {
                                break;
                            }
                            i3++;
                        }
                        Measurable measurable4 = measurable;
                        final int mo361roundToPx0680j_4 = measureScope2.mo361roundToPx0680j_4(SearchBarKt.getSearchBarVerticalPadding()) + this.$unconsumedInsets.getTop(measureScope2);
                        int mo361roundToPx0680j_42 = measureScope2.mo361roundToPx0680j_4(SearchBarKt.getSearchBarVerticalPadding());
                        int m7581constrainWidthK40F9xA = ConstraintsKt.m7581constrainWidthK40F9xA(j2, measurable2.maxIntrinsicWidth(Constraints.m7563getMaxHeightimpl(j2)));
                        int m7580constrainHeightK40F9xA = ConstraintsKt.m7580constrainHeightK40F9xA(j2, measurable2.minIntrinsicHeight(Constraints.m7564getMaxWidthimpl(j2)));
                        int P = y80.P(Constraints.m7564getMaxWidthimpl(j2) * 0.9f);
                        int P2 = y80.P(Constraints.m7563getMaxHeightimpl(j2) * 0.9f);
                        calculatePredictiveBackMultiplier = SearchBarKt.calculatePredictiveBackMultiplier(this.$currentBackEvent.getValue(), floatValue, this.$finalBackProgress.getFloatValue());
                        int lerp = MathHelpersKt.lerp(m7581constrainWidthK40F9xA, P, calculatePredictiveBackMultiplier);
                        int i4 = mo361roundToPx0680j_4 + m7580constrainHeightK40F9xA;
                        int lerp2 = MathHelpersKt.lerp(i4, P2, calculatePredictiveBackMultiplier);
                        int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j2);
                        int m7563getMaxHeightimpl2 = Constraints.m7563getMaxHeightimpl(j2);
                        int lerp3 = MathHelpersKt.lerp(lerp, m7564getMaxWidthimpl, floatValue);
                        final int lerp4 = MathHelpersKt.lerp(lerp2, m7563getMaxHeightimpl2, floatValue);
                        final int lerp5 = MathHelpersKt.lerp(mo361roundToPx0680j_4, 0, floatValue);
                        final int lerp6 = MathHelpersKt.lerp(0, mo361roundToPx0680j_42, floatValue);
                        final Placeable mo6234measureBRTryo0 = measurable2.mo6234measureBRTryo0(ConstraintsKt.Constraints(lerp3, m7564getMaxWidthimpl, m7580constrainHeightK40F9xA, m7580constrainHeightK40F9xA));
                        int width = mo6234measureBRTryo0.getWidth();
                        final Placeable mo6234measureBRTryo02 = measurable3.mo6234measureBRTryo0(Constraints.Companion.m7574fixedJhjzzOo(width, lerp4 - lerp5));
                        if (measurable4 != null) {
                            if (Constraints.m7559getHasBoundedHeightimpl(j2)) {
                                m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j2) - (i4 + mo361roundToPx0680j_42);
                                if (m7563getMaxHeightimpl < 0) {
                                    m7563getMaxHeightimpl = 0;
                                }
                            } else {
                                m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j2);
                            }
                            placeable = measurable4.mo6234measureBRTryo0(ConstraintsKt.Constraints(width, width, 0, m7563getMaxHeightimpl));
                        } else {
                            placeable = null;
                        }
                        final MutableState<gc> mutableState = this.$currentBackEvent;
                        final MutableState<gc> mutableState2 = this.$firstBackEvent;
                        return MeasureScope.layout$default(measureScope, width, lerp4, null, new ky() { // from class: androidx.compose.material3.z0
                            @Override // defpackage.ky
                            public final Object invoke(Object obj) {
                                w01 measure_3p2s80s$lambda$3;
                                measure_3p2s80s$lambda$3 = SearchBarKt$SearchBarLayout$2$1.measure_3p2s80s$lambda$3(MeasureScope.this, j, mutableState, floatValue, calculatePredictiveBackMultiplier, mutableState2, lerp4, mo6234measureBRTryo02, lerp5, mo6234measureBRTryo0, mo361roundToPx0680j_4, placeable, lerp6, (Placeable.PlacementScope) obj);
                                return measure_3p2s80s$lambda$3;
                            }
                        }, 4, null);
                    }
                    i2++;
                    measureScope2 = measureScope;
                    j2 = j;
                }
                throw k4.m("Collection contains no element matching the predicate.");
            }
            i++;
            measureScope2 = measureScope;
            j2 = j;
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }
}
