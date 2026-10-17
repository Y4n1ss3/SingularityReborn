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
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.dq;
import defpackage.iy;
import defpackage.k4;
import defpackage.q10;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AnimatedMeasurePolicy implements MeasurePolicy {
    private final int iconPosition;
    private final iy iconPositionProgress;
    private final iy indicatorAnimationProgress;
    private final float itemHorizontalPadding;
    private final float startIconIndicatorHorizontalPadding;
    private final float startIconIndicatorVerticalPadding;
    private final float startIconToLabelHorizontalPadding;
    private final float topIconIndicatorHorizontalPadding;
    private final float topIconIndicatorToLabelVerticalPadding;
    private final float topIconIndicatorVerticalPadding;

    private AnimatedMeasurePolicy(int i, iy iyVar, iy iyVar2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.iconPosition = i;
        this.iconPositionProgress = iyVar;
        this.indicatorAnimationProgress = iyVar2;
        this.topIconIndicatorHorizontalPadding = f;
        this.topIconIndicatorVerticalPadding = f2;
        this.topIconIndicatorToLabelVerticalPadding = f3;
        this.startIconIndicatorHorizontalPadding = f4;
        this.startIconIndicatorVerticalPadding = f5;
        this.startIconToLabelHorizontalPadding = f6;
        this.itemHorizontalPadding = f7;
    }

    /* renamed from: getIconPosition--xw1Ddg, reason: not valid java name */
    public final int m1604getIconPositionxw1Ddg() {
        return this.iconPosition;
    }

    public final iy getIconPositionProgress() {
        return this.iconPositionProgress;
    }

    public final iy getIndicatorAnimationProgress() {
        return this.indicatorAnimationProgress;
    }

    /* renamed from: getItemHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m1605getItemHorizontalPaddingD9Ej5fM() {
        return this.itemHorizontalPadding;
    }

    /* renamed from: getStartIconIndicatorHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m1606getStartIconIndicatorHorizontalPaddingD9Ej5fM() {
        return this.startIconIndicatorHorizontalPadding;
    }

    /* renamed from: getStartIconIndicatorVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m1607getStartIconIndicatorVerticalPaddingD9Ej5fM() {
        return this.startIconIndicatorVerticalPadding;
    }

    /* renamed from: getStartIconToLabelHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m1608getStartIconToLabelHorizontalPaddingD9Ej5fM() {
        return this.startIconToLabelHorizontalPadding;
    }

    /* renamed from: getTopIconIndicatorHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m1609getTopIconIndicatorHorizontalPaddingD9Ej5fM() {
        return this.topIconIndicatorHorizontalPadding;
    }

    /* renamed from: getTopIconIndicatorToLabelVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m1610getTopIconIndicatorToLabelVerticalPaddingD9Ej5fM() {
        return this.topIconIndicatorToLabelVerticalPadding;
    }

    /* renamed from: getTopIconIndicatorVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m1611getTopIconIndicatorVerticalPaddingD9Ej5fM() {
        return this.topIconIndicatorVerticalPadding;
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
                        int maxIntrinsicWidth2 = intrinsicMeasurable2.maxIntrinsicWidth(i);
                        if (NavigationItemIconPosition.m2200equalsimpl0(this.iconPosition, NavigationItemIconPosition.Companion.m2205getTopxw1Ddg())) {
                            return Math.max(maxIntrinsicWidth2, intrinsicMeasureScope.mo361roundToPx0680j_4(Dp.m7611constructorimpl(Dp.m7611constructorimpl(this.itemHorizontalPadding * 2.0f) + Dp.m7611constructorimpl(this.topIconIndicatorHorizontalPadding * 2.0f))) + maxIntrinsicWidth);
                        }
                        return maxIntrinsicWidth + maxIntrinsicWidth2 + intrinsicMeasureScope.mo361roundToPx0680j_4(Dp.m7611constructorimpl(Dp.m7611constructorimpl(Dp.m7611constructorimpl(this.startIconIndicatorHorizontalPadding * 2.0f) + this.startIconToLabelHorizontalPadding) + this.itemHorizontalPadding));
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
        MeasureResult m2215placeAnimatedLabelAndIcon2QYhCQ8;
        MeasureScope measureScope2 = measureScope;
        float floatValue = ((Number) this.indicatorAnimationProgress.invoke()).floatValue();
        float floatValue2 = ((Number) this.iconPositionProgress.invoke()).floatValue();
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
                        Placeable mo6234measureBRTryo02 = measurable2.mo6234measureBRTryo0(m7554copyZbe2FdA$default);
                        int mo361roundToPx0680j_4 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(this.topIconIndicatorHorizontalPadding * 2.0f)) + mo6234measureBRTryo0.getWidth();
                        int mo361roundToPx0680j_42 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(this.topIconIndicatorVerticalPadding * 2.0f)) + mo6234measureBRTryo0.getHeight();
                        int mo361roundToPx0680j_43 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(Dp.m7611constructorimpl(this.startIconIndicatorHorizontalPadding * 2.0f) + this.startIconToLabelHorizontalPadding)) + mo6234measureBRTryo02.getWidth() + mo6234measureBRTryo0.getWidth();
                        int mo361roundToPx0680j_44 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(this.startIconIndicatorVerticalPadding * 2.0f)) + Math.max(mo6234measureBRTryo0.getHeight(), mo6234measureBRTryo02.getHeight());
                        int lerp = MathHelpersKt.lerp(mo361roundToPx0680j_4, mo361roundToPx0680j_43, floatValue2);
                        int P = y80.P(lerp * floatValue);
                        int lerp2 = MathHelpersKt.lerp(mo361roundToPx0680j_42, mo361roundToPx0680j_44, floatValue2);
                        int size3 = list.size();
                        int i3 = 0;
                        while (i3 < size3) {
                            Measurable measurable3 = list.get(i3);
                            if (q10.b(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                Placeable mo6234measureBRTryo03 = measurable3.mo6234measureBRTryo0(ConstraintsKt.m7579constrainN9IONVI(m7554copyZbe2FdA$default, Constraints.Companion.m7574fixedJhjzzOo(lerp, lerp2)));
                                int size4 = list.size();
                                int i4 = 0;
                                while (i4 < size4) {
                                    Measurable measurable4 = list.get(i4);
                                    if (q10.b(LayoutIdKt.getLayoutId(measurable4), "indicator")) {
                                        m2215placeAnimatedLabelAndIcon2QYhCQ8 = NavigationItemKt.m2215placeAnimatedLabelAndIcon2QYhCQ8(measureScope, this.iconPosition, this.iconPositionProgress, mo6234measureBRTryo02, mo6234measureBRTryo0, mo6234measureBRTryo03, measurable4.mo6234measureBRTryo0(ConstraintsKt.m7579constrainN9IONVI(m7554copyZbe2FdA$default, Constraints.Companion.m7574fixedJhjzzOo(P, lerp2))), mo361roundToPx0680j_4, m7554copyZbe2FdA$default, this.topIconIndicatorToLabelVerticalPadding, this.topIconIndicatorVerticalPadding, this.topIconIndicatorHorizontalPadding, this.startIconIndicatorHorizontalPadding, this.startIconIndicatorVerticalPadding, this.startIconToLabelHorizontalPadding, this.itemHorizontalPadding);
                                        return m2215placeAnimatedLabelAndIcon2QYhCQ8;
                                    }
                                    i4++;
                                    mo361roundToPx0680j_4 = mo361roundToPx0680j_4;
                                }
                                throw k4.m("Collection contains no element matching the predicate.");
                            }
                            i3++;
                            mo361roundToPx0680j_4 = mo361roundToPx0680j_4;
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

    public /* synthetic */ AnimatedMeasurePolicy(int i, iy iyVar, iy iyVar2, float f, float f2, float f3, float f4, float f5, float f6, float f7, dq dqVar) {
        this(i, iyVar, iyVar2, f, f2, f3, f4, f5, f6, f7);
    }
}
