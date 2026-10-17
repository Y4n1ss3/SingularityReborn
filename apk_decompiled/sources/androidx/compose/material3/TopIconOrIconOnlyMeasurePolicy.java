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
final class TopIconOrIconOnlyMeasurePolicy implements MeasurePolicy {
    private final boolean hasLabel;
    private final iy indicatorAnimationProgress;
    private final float indicatorHorizontalPadding;
    private final float indicatorToLabelVerticalPadding;
    private final float indicatorVerticalPadding;
    private final float topIconItemVerticalPadding;

    private TopIconOrIconOnlyMeasurePolicy(boolean z, iy iyVar, float f, float f2, float f3, float f4) {
        this.hasLabel = z;
        this.indicatorAnimationProgress = iyVar;
        this.indicatorHorizontalPadding = f;
        this.indicatorVerticalPadding = f2;
        this.indicatorToLabelVerticalPadding = f3;
        this.topIconItemVerticalPadding = f4;
    }

    public final boolean getHasLabel() {
        return this.hasLabel;
    }

    public final iy getIndicatorAnimationProgress() {
        return this.indicatorAnimationProgress;
    }

    /* renamed from: getIndicatorHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2826getIndicatorHorizontalPaddingD9Ej5fM() {
        return this.indicatorHorizontalPadding;
    }

    /* renamed from: getIndicatorToLabelVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2827getIndicatorToLabelVerticalPaddingD9Ej5fM() {
        return this.indicatorToLabelVerticalPadding;
    }

    /* renamed from: getIndicatorVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2828getIndicatorVerticalPaddingD9Ej5fM() {
        return this.indicatorVerticalPadding;
    }

    /* renamed from: getTopIconItemVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2829getTopIconItemVerticalPaddingD9Ej5fM() {
        return this.topIconItemVerticalPadding;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        IntrinsicMeasurable intrinsicMeasurable;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i2);
            if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), "icon")) {
                int maxIntrinsicHeight = intrinsicMeasurable2.maxIntrinsicHeight(i);
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        intrinsicMeasurable = null;
                        break;
                    }
                    intrinsicMeasurable = list.get(i3);
                    if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable), "label")) {
                        break;
                    }
                    i3++;
                }
                IntrinsicMeasurable intrinsicMeasurable3 = intrinsicMeasurable;
                return maxIntrinsicHeight + (intrinsicMeasurable3 != null ? intrinsicMeasurable3.maxIntrinsicHeight(i) : 0) + intrinsicMeasureScope.mo361roundToPx0680j_4(Dp.m7611constructorimpl(Dp.m7611constructorimpl(Dp.m7611constructorimpl(this.indicatorVerticalPadding * 2.0f) + Dp.m7611constructorimpl(this.topIconItemVerticalPadding * 2.0f)) + this.indicatorToLabelVerticalPadding));
            }
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        MeasureResult m2216placeIconX9ElhV4;
        MeasureResult m2218placeLabelAndTopIconqoqLrGI;
        MeasureScope measureScope2 = measureScope;
        float floatValue = ((Number) this.indicatorAnimationProgress.invoke()).floatValue();
        long m7554copyZbe2FdA$default = Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Measurable measurable = list.get(i2);
            if (q10.b(LayoutIdKt.getLayoutId(measurable), "icon")) {
                Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(ConstraintsKt.m7583offsetNN6EwU(m7554copyZbe2FdA$default, -measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(this.indicatorHorizontalPadding * 2.0f)), -measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(this.indicatorVerticalPadding * 2.0f))));
                int mo361roundToPx0680j_4 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(this.indicatorHorizontalPadding * 2.0f)) + mo6234measureBRTryo0.getWidth();
                int mo361roundToPx0680j_42 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(this.indicatorVerticalPadding * 2.0f)) + mo6234measureBRTryo0.getHeight();
                int P = y80.P(mo361roundToPx0680j_4 * floatValue);
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    Measurable measurable2 = list.get(i3);
                    if (q10.b(LayoutIdKt.getLayoutId(measurable2), "indicatorRipple")) {
                        Placeable mo6234measureBRTryo02 = measurable2.mo6234measureBRTryo0(ConstraintsKt.m7579constrainN9IONVI(m7554copyZbe2FdA$default, Constraints.Companion.m7574fixedJhjzzOo(mo361roundToPx0680j_4, mo361roundToPx0680j_42)));
                        int size3 = list.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            Measurable measurable3 = list.get(i4);
                            if (q10.b(LayoutIdKt.getLayoutId(measurable3), "indicator")) {
                                Placeable mo6234measureBRTryo03 = measurable3.mo6234measureBRTryo0(ConstraintsKt.m7579constrainN9IONVI(m7554copyZbe2FdA$default, Constraints.Companion.m7574fixedJhjzzOo(P, mo361roundToPx0680j_42)));
                                if (!this.hasLabel) {
                                    m2216placeIconX9ElhV4 = NavigationItemKt.m2216placeIconX9ElhV4(measureScope2, mo6234measureBRTryo0, mo6234measureBRTryo02, mo6234measureBRTryo03, j);
                                    return m2216placeIconX9ElhV4;
                                }
                                int size4 = list.size();
                                while (i < size4) {
                                    Measurable measurable4 = list.get(i);
                                    if (q10.b(LayoutIdKt.getLayoutId(measurable4), "label")) {
                                        m2218placeLabelAndTopIconqoqLrGI = NavigationItemKt.m2218placeLabelAndTopIconqoqLrGI(measureScope, measurable4.mo6234measureBRTryo0(ConstraintsKt.m7584offsetNN6EwU$default(m7554copyZbe2FdA$default, 0, -(measureScope2.mo361roundToPx0680j_4(this.indicatorToLabelVerticalPadding) + mo6234measureBRTryo03.getHeight()), 1, null)), mo6234measureBRTryo0, mo6234measureBRTryo02, mo6234measureBRTryo03, j, this.indicatorToLabelVerticalPadding, this.indicatorVerticalPadding, this.topIconItemVerticalPadding);
                                        return m2218placeLabelAndTopIconqoqLrGI;
                                    }
                                    i++;
                                    mo6234measureBRTryo03 = mo6234measureBRTryo03;
                                    mo6234measureBRTryo0 = mo6234measureBRTryo0;
                                    measureScope2 = measureScope;
                                }
                                throw k4.m("Collection contains no element matching the predicate.");
                            }
                            i4++;
                            mo6234measureBRTryo0 = mo6234measureBRTryo0;
                            measureScope2 = measureScope;
                        }
                        throw k4.m("Collection contains no element matching the predicate.");
                    }
                    i3++;
                    measureScope2 = measureScope;
                }
                throw k4.m("Collection contains no element matching the predicate.");
            }
            i2++;
            measureScope2 = measureScope;
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }

    public /* synthetic */ TopIconOrIconOnlyMeasurePolicy(boolean z, iy iyVar, float f, float f2, float f3, float f4, dq dqVar) {
        this(z, iyVar, f, f2, f3, f4);
    }
}
