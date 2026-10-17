package androidx.compose.material3;

import androidx.compose.material3.ListItemType;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import defpackage.my;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ListItemMeasurePolicy implements MultiContentMeasurePolicy {
    private final int calculateIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i, my myVar) {
        int i2;
        int i3;
        boolean isSupportingMultilineHeuristic;
        float m2115verticalPaddingyh95HIg;
        int m2113calculateHeightN4Jib3Y;
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        int subtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(i, intrinsicMeasureScope.mo361roundToPx0680j_4(Dp.m7611constructorimpl(ListItemKt.getListItemEndPadding() + ListItemKt.getListItemStartPadding())));
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) yi.q0(list5);
        if (intrinsicMeasurable != null) {
            i2 = ((Number) myVar.invoke(intrinsicMeasurable, Integer.valueOf(subtractConstraintSafely))).intValue();
            subtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(subtractConstraintSafely, intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            i2 = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) yi.q0(list6);
        if (intrinsicMeasurable2 != null) {
            i3 = ((Number) myVar.invoke(intrinsicMeasurable2, Integer.valueOf(subtractConstraintSafely))).intValue();
            subtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(subtractConstraintSafely, intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            i3 = 0;
        }
        Object obj = (IntrinsicMeasurable) yi.q0(list3);
        int intValue = obj != null ? ((Number) myVar.invoke(obj, Integer.valueOf(subtractConstraintSafely))).intValue() : 0;
        Object obj2 = (IntrinsicMeasurable) yi.q0(list2);
        int intValue2 = obj2 != null ? ((Number) myVar.invoke(obj2, Integer.valueOf(subtractConstraintSafely))).intValue() : 0;
        Object obj3 = (IntrinsicMeasurable) yi.q0(list4);
        int intValue3 = obj3 != null ? ((Number) myVar.invoke(obj3, Integer.valueOf(subtractConstraintSafely))).intValue() : 0;
        isSupportingMultilineHeuristic = ListItemKt.isSupportingMultilineHeuristic(intrinsicMeasureScope, intValue3);
        int m2128invokeZLSjz4$material3 = ListItemType.Companion.m2128invokeZLSjz4$material3(intValue > 0, intValue3 > 0, isSupportingMultilineHeuristic);
        m2115verticalPaddingyh95HIg = ListItemKt.m2115verticalPaddingyh95HIg(m2128invokeZLSjz4$material3);
        int i4 = intValue2;
        int i5 = intValue;
        m2113calculateHeightN4Jib3Y = ListItemKt.m2113calculateHeightN4Jib3Y(intrinsicMeasureScope, i2, i3, i4, i5, intValue3, m2128invokeZLSjz4$material3, intrinsicMeasureScope.mo361roundToPx0680j_4(Dp.m7611constructorimpl(m2115verticalPaddingyh95HIg * 2.0f)), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
        return m2113calculateHeightN4Jib3Y;
    }

    private final int calculateIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i, my myVar) {
        int m2114calculateWidthyeHjK3Y;
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) yi.q0(list5);
        int intValue = intrinsicMeasurable != null ? ((Number) myVar.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) yi.q0(list6);
        int intValue2 = intrinsicMeasurable2 != null ? ((Number) myVar.invoke(intrinsicMeasurable2, Integer.valueOf(i))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) yi.q0(list2);
        int intValue3 = intrinsicMeasurable3 != null ? ((Number) myVar.invoke(intrinsicMeasurable3, Integer.valueOf(i))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) yi.q0(list3);
        int intValue4 = intrinsicMeasurable4 != null ? ((Number) myVar.invoke(intrinsicMeasurable4, Integer.valueOf(i))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) yi.q0(list4);
        m2114calculateWidthyeHjK3Y = ListItemKt.m2114calculateWidthyeHjK3Y(intrinsicMeasureScope, intValue, intValue2, intValue3, intValue4, intrinsicMeasurable5 != null ? ((Number) myVar.invoke(intrinsicMeasurable5, Integer.valueOf(i))).intValue() : 0, intrinsicMeasureScope.mo361roundToPx0680j_4(Dp.m7611constructorimpl(ListItemKt.getListItemEndPadding() + ListItemKt.getListItemStartPadding())), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
        return m2114calculateWidthyeHjK3Y;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        return calculateIntrinsicHeight(intrinsicMeasureScope, list, i, ListItemMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        return calculateIntrinsicWidth(intrinsicMeasureScope, list, i, ListItemMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo709measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j) {
        boolean isSupportingMultilineHeuristic;
        float m2115verticalPaddingyh95HIg;
        long j2;
        Placeable placeable;
        int i;
        long j3;
        Placeable placeable2;
        float f;
        Placeable placeable3;
        Placeable placeable4;
        float m2115verticalPaddingyh95HIg2;
        int m2114calculateWidthyeHjK3Y;
        int m2113calculateHeightN4Jib3Y;
        MeasureResult place;
        List<? extends Measurable> list2 = list.get(0);
        List<? extends Measurable> list3 = list.get(1);
        List<? extends Measurable> list4 = list.get(2);
        List<? extends Measurable> list5 = list.get(3);
        List<? extends Measurable> list6 = list.get(4);
        long m7554copyZbe2FdA$default = Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        float listItemStartPadding = ListItemKt.getListItemStartPadding();
        float listItemEndPadding = ListItemKt.getListItemEndPadding();
        int mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4(Dp.m7611constructorimpl(listItemStartPadding + listItemEndPadding));
        Measurable measurable = (Measurable) yi.q0(list5);
        int minIntrinsicWidth = measurable != null ? measurable.minIntrinsicWidth(Constraints.m7563getMaxHeightimpl(j)) : 0;
        Measurable measurable2 = (Measurable) yi.q0(list6);
        int subtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(Constraints.m7564getMaxWidthimpl(m7554copyZbe2FdA$default), minIntrinsicWidth + (measurable2 != null ? measurable2.minIntrinsicWidth(Constraints.m7563getMaxHeightimpl(j)) : 0) + mo361roundToPx0680j_4);
        Measurable measurable3 = (Measurable) yi.q0(list4);
        isSupportingMultilineHeuristic = ListItemKt.isSupportingMultilineHeuristic(measureScope, measurable3 != null ? measurable3.minIntrinsicHeight(subtractConstraintSafely) : 0);
        ListItemType.Companion companion = ListItemType.Companion;
        m2115verticalPaddingyh95HIg = ListItemKt.m2115verticalPaddingyh95HIg(companion.m2128invokeZLSjz4$material3(yi.q0(list3) != null, yi.q0(list4) != null, isSupportingMultilineHeuristic));
        long m7583offsetNN6EwU = ConstraintsKt.m7583offsetNN6EwU(m7554copyZbe2FdA$default, -mo361roundToPx0680j_4, -measureScope.mo361roundToPx0680j_4(Dp.m7611constructorimpl(m2115verticalPaddingyh95HIg * 2.0f)));
        Measurable measurable4 = (Measurable) yi.q0(list5);
        Placeable mo6234measureBRTryo0 = measurable4 != null ? measurable4.mo6234measureBRTryo0(m7583offsetNN6EwU) : null;
        int widthOrZero = LayoutUtilKt.getWidthOrZero(mo6234measureBRTryo0);
        Measurable measurable5 = (Measurable) yi.q0(list6);
        if (measurable5 != null) {
            j2 = m7583offsetNN6EwU;
            placeable = measurable5.mo6234measureBRTryo0(ConstraintsKt.m7584offsetNN6EwU$default(j2, -widthOrZero, 0, 2, null));
        } else {
            j2 = m7583offsetNN6EwU;
            placeable = null;
        }
        int widthOrZero2 = LayoutUtilKt.getWidthOrZero(placeable) + widthOrZero;
        Measurable measurable6 = (Measurable) yi.q0(list2);
        if (measurable6 != null) {
            i = mo361roundToPx0680j_4;
            j3 = j2;
            placeable2 = measurable6.mo6234measureBRTryo0(ConstraintsKt.m7584offsetNN6EwU$default(j2, -widthOrZero2, 0, 2, null));
        } else {
            i = mo361roundToPx0680j_4;
            j3 = j2;
            placeable2 = null;
        }
        int heightOrZero = LayoutUtilKt.getHeightOrZero(placeable2);
        Measurable measurable7 = (Measurable) yi.q0(list4);
        if (measurable7 != null) {
            f = 2.0f;
            placeable3 = placeable;
            placeable4 = measurable7.mo6234measureBRTryo0(ConstraintsKt.m7583offsetNN6EwU(j3, -widthOrZero2, -heightOrZero));
        } else {
            f = 2.0f;
            placeable3 = placeable;
            placeable4 = null;
        }
        int heightOrZero2 = LayoutUtilKt.getHeightOrZero(placeable4) + heightOrZero;
        boolean z = (placeable4 == null || placeable4.get(AlignmentLineKt.getFirstBaseline()) == placeable4.get(AlignmentLineKt.getLastBaseline())) ? false : true;
        Measurable measurable8 = (Measurable) yi.q0(list3);
        Placeable mo6234measureBRTryo02 = measurable8 != null ? measurable8.mo6234measureBRTryo0(ConstraintsKt.m7583offsetNN6EwU(j3, -widthOrZero2, -heightOrZero2)) : null;
        int m2128invokeZLSjz4$material3 = companion.m2128invokeZLSjz4$material3(mo6234measureBRTryo02 != null, placeable4 != null, z);
        m2115verticalPaddingyh95HIg2 = ListItemKt.m2115verticalPaddingyh95HIg(m2128invokeZLSjz4$material3);
        float m7611constructorimpl = Dp.m7611constructorimpl(m2115verticalPaddingyh95HIg2 * f);
        Placeable placeable5 = placeable4;
        m2114calculateWidthyeHjK3Y = ListItemKt.m2114calculateWidthyeHjK3Y(measureScope, LayoutUtilKt.getWidthOrZero(mo6234measureBRTryo0), LayoutUtilKt.getWidthOrZero(placeable3), LayoutUtilKt.getWidthOrZero(placeable2), LayoutUtilKt.getWidthOrZero(mo6234measureBRTryo02), LayoutUtilKt.getWidthOrZero(placeable4), i, j);
        m2113calculateHeightN4Jib3Y = ListItemKt.m2113calculateHeightN4Jib3Y(measureScope, LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo0), LayoutUtilKt.getHeightOrZero(placeable3), LayoutUtilKt.getHeightOrZero(placeable2), LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo02), LayoutUtilKt.getHeightOrZero(placeable5), m2128invokeZLSjz4$material3, measureScope.mo361roundToPx0680j_4(m7611constructorimpl), j);
        place = ListItemKt.place(measureScope, m2114calculateWidthyeHjK3Y, m2113calculateHeightN4Jib3Y, mo6234measureBRTryo0, placeable3, placeable2, mo6234measureBRTryo02, placeable5, ListItemType.m2120equalsimpl0(m2128invokeZLSjz4$material3, companion.m2126getThreeLineAlXitO8()), measureScope.mo361roundToPx0680j_4(listItemStartPadding), measureScope.mo361roundToPx0680j_4(listItemEndPadding), measureScope.mo361roundToPx0680j_4(m2115verticalPaddingyh95HIg2));
        return place;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        return calculateIntrinsicHeight(intrinsicMeasureScope, list, i, ListItemMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        return calculateIntrinsicWidth(intrinsicMeasureScope, list, i, ListItemMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }
}
