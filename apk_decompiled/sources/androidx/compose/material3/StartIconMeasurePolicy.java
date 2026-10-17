package androidx.compose.material3;

import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.iy;
import defpackage.k4;
import defpackage.q10;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class StartIconMeasurePolicy implements MeasurePolicy {
    private final iy indicatorAnimationProgress;
    private final float indicatorHorizontalPadding;
    private final float indicatorVerticalPadding;
    private final float startIconToLabelHorizontalPadding;

    private StartIconMeasurePolicy(iy iyVar, float f, float f2, float f3) {
        this.indicatorAnimationProgress = iyVar;
        this.indicatorHorizontalPadding = f;
        this.indicatorVerticalPadding = f2;
        this.startIconToLabelHorizontalPadding = f3;
    }

    public final iy getIndicatorAnimationProgress() {
        return this.indicatorAnimationProgress;
    }

    /* renamed from: getIndicatorHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2453getIndicatorHorizontalPaddingD9Ej5fM() {
        return this.indicatorHorizontalPadding;
    }

    /* renamed from: getIndicatorVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2454getIndicatorVerticalPaddingD9Ej5fM() {
        return this.indicatorVerticalPadding;
    }

    /* renamed from: getStartIconToLabelHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2455getStartIconToLabelHorizontalPaddingD9Ej5fM() {
        return this.startIconToLabelHorizontalPadding;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i2);
            if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable), "icon")) {
                int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i);
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = list.get(i3);
                    if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), "label")) {
                        return Math.max(maxIntrinsicHeight, intrinsicMeasurable2.maxIntrinsicHeight(i)) + intrinsicMeasureScope.mo361roundToPx0680j_4(Dp.m7611constructorimpl(this.indicatorVerticalPadding * 2.0f));
                    }
                }
                throw k4.m("Collection contains no element matching the predicate.");
            }
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i2);
            if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable), "icon")) {
                int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i);
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = list.get(i3);
                    if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), "label")) {
                        return maxIntrinsicWidth + intrinsicMeasurable2.maxIntrinsicWidth(i) + intrinsicMeasureScope.mo361roundToPx0680j_4(Dp.m7611constructorimpl(Dp.m7611constructorimpl(this.indicatorHorizontalPadding * 2.0f) + this.startIconToLabelHorizontalPadding));
                    }
                }
                throw k4.m("Collection contains no element matching the predicate.");
            }
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        MeasureResult m2217placeLabelAndStartIconnru01g4;
        MeasureScope measureScope2 = measureScope;
        float floatValue = ((Number) this.indicatorAnimationProgress.invoke()).floatValue();
        long m7554copyZbe2FdA$default = Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i = 0;
        while (i < size) {
            Measurable measurable = list.get(i);
            if (q10.b(LayoutIdKt.getLayoutId(measurable), "icon")) {
                Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(m7554copyZbe2FdA$default);
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    Measurable measurable2 = list.get(i2);
                    if (q10.b(LayoutIdKt.getLayoutId(measurable2), "label")) {
                        Placeable mo6234measureBRTryo02 = measurable2.mo6234measureBRTryo0(ConstraintsKt.m7584offsetNN6EwU$default(m7554copyZbe2FdA$default, -(measureScope2.mo361roundToPx0680j_4(this.startIconToLabelHorizontalPadding) + mo6234measureBRTryo0.getWidth()), 0, 2, null));
                        int mo361roundToPx0680j_4 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(Dp.m7611constructorimpl(this.indicatorHorizontalPadding * 2.0f) + this.startIconToLabelHorizontalPadding)) + mo6234measureBRTryo02.getWidth() + mo6234measureBRTryo0.getWidth();
                        int mo361roundToPx0680j_42 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(this.indicatorVerticalPadding * 2.0f)) + Math.max(mo6234measureBRTryo0.getHeight(), mo6234measureBRTryo02.getHeight());
                        int P = y80.P(mo361roundToPx0680j_4 * floatValue);
                        int size3 = list.size();
                        int i3 = 0;
                        while (i3 < size3) {
                            Measurable measurable3 = list.get(i3);
                            if (q10.b(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                Placeable mo6234measureBRTryo03 = measurable3.mo6234measureBRTryo0(ConstraintsKt.m7579constrainN9IONVI(m7554copyZbe2FdA$default, Constraints.Companion.m7574fixedJhjzzOo(mo361roundToPx0680j_4, mo361roundToPx0680j_42)));
                                int size4 = list.size();
                                int i4 = 0;
                                while (i4 < size4) {
                                    Measurable measurable4 = list.get(i4);
                                    if (q10.b(LayoutIdKt.getLayoutId(measurable4), "indicator")) {
                                        m2217placeLabelAndStartIconnru01g4 = NavigationItemKt.m2217placeLabelAndStartIconnru01g4(measureScope2, mo6234measureBRTryo02, mo6234measureBRTryo0, mo6234measureBRTryo03, measurable4.mo6234measureBRTryo0(ConstraintsKt.m7579constrainN9IONVI(m7554copyZbe2FdA$default, Constraints.Companion.m7574fixedJhjzzOo(P, mo361roundToPx0680j_42))), j, this.startIconToLabelHorizontalPadding);
                                        return m2217placeLabelAndStartIconnru01g4;
                                    }
                                    i4++;
                                    mo6234measureBRTryo0 = mo6234measureBRTryo0;
                                    measureScope2 = measureScope;
                                }
                                throw k4.m("Collection contains no element matching the predicate.");
                            }
                            i3++;
                            mo6234measureBRTryo0 = mo6234measureBRTryo0;
                            measureScope2 = measureScope;
                        }
                        throw k4.m("Collection contains no element matching the predicate.");
                    }
                    i2++;
                    measureScope2 = measureScope;
                }
                throw k4.m("Collection contains no element matching the predicate.");
            }
            i++;
            measureScope2 = measureScope;
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }

    public /* synthetic */ StartIconMeasurePolicy(iy iyVar, float f, float f2, float f3, dq dqVar) {
        this(iyVar, f, f2, f3);
    }
}
