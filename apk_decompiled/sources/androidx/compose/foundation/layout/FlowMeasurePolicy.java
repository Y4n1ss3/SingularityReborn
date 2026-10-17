package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.ui.graphics.Fields;
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
import defpackage.c10;
import defpackage.dq;
import defpackage.fc;
import defpackage.j50;
import defpackage.o;
import defpackage.q10;
import defpackage.ut;
import defpackage.w01;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FlowMeasurePolicy implements MultiContentMeasurePolicy, FlowLineMeasurePolicy {
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;
    private final Arrangement.Horizontal horizontalArrangement;
    private final boolean isHorizontal;
    private final float mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;
    private final Arrangement.Vertical verticalArrangement;

    private FlowMeasurePolicy(boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f2, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState) {
        this.isHorizontal = z;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisSpacing = f;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f2;
        this.maxItemsInMainAxis = i;
        this.maxLines = i2;
        this.overflow = flowLayoutOverflowState;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    private final float m705component4D9Ej5fM() {
        return this.mainAxisSpacing;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m706component6D9Ej5fM() {
        return this.crossAxisArrangementSpacing;
    }

    private final int component7() {
        return this.maxItemsInMainAxis;
    }

    private final int component8() {
        return this.maxLines;
    }

    private final FlowLayoutOverflowState component9() {
        return this.overflow;
    }

    /* renamed from: copy-QuyCDyQ$default, reason: not valid java name */
    public static /* synthetic */ FlowMeasurePolicy m707copyQuyCDyQ$default(FlowMeasurePolicy flowMeasurePolicy, boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f2, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = flowMeasurePolicy.isHorizontal;
        }
        if ((i3 & 2) != 0) {
            horizontal = flowMeasurePolicy.horizontalArrangement;
        }
        if ((i3 & 4) != 0) {
            vertical = flowMeasurePolicy.verticalArrangement;
        }
        if ((i3 & 8) != 0) {
            f = flowMeasurePolicy.mainAxisSpacing;
        }
        if ((i3 & 16) != 0) {
            crossAxisAlignment = flowMeasurePolicy.crossAxisAlignment;
        }
        if ((i3 & 32) != 0) {
            f2 = flowMeasurePolicy.crossAxisArrangementSpacing;
        }
        if ((i3 & 64) != 0) {
            i = flowMeasurePolicy.maxItemsInMainAxis;
        }
        if ((i3 & Fields.SpotShadowColor) != 0) {
            i2 = flowMeasurePolicy.maxLines;
        }
        if ((i3 & Fields.RotationX) != 0) {
            flowLayoutOverflowState = flowMeasurePolicy.overflow;
        }
        int i4 = i2;
        FlowLayoutOverflowState flowLayoutOverflowState2 = flowLayoutOverflowState;
        float f3 = f2;
        int i5 = i;
        CrossAxisAlignment crossAxisAlignment2 = crossAxisAlignment;
        Arrangement.Vertical vertical2 = vertical;
        return flowMeasurePolicy.m708copyQuyCDyQ(z, horizontal, vertical2, f, crossAxisAlignment2, f3, i5, i4, flowLayoutOverflowState2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(Placeable.PlacementScope placementScope) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$1(Placeable.PlacementScope placementScope) {
        return w01.a;
    }

    public final boolean component1() {
        return this.isHorizontal;
    }

    public final Arrangement.Horizontal component2() {
        return this.horizontalArrangement;
    }

    public final Arrangement.Vertical component3() {
        return this.verticalArrangement;
    }

    public final CrossAxisAlignment component5() {
        return this.crossAxisAlignment;
    }

    /* renamed from: copy-QuyCDyQ, reason: not valid java name */
    public final FlowMeasurePolicy m708copyQuyCDyQ(boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f2, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState) {
        return new FlowMeasurePolicy(z, horizontal, vertical, f, crossAxisAlignment, f2, i, i2, flowLayoutOverflowState, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) obj;
        return this.isHorizontal == flowMeasurePolicy.isHorizontal && q10.b(this.horizontalArrangement, flowMeasurePolicy.horizontalArrangement) && q10.b(this.verticalArrangement, flowMeasurePolicy.verticalArrangement) && Dp.m7616equalsimpl0(this.mainAxisSpacing, flowMeasurePolicy.mainAxisSpacing) && q10.b(this.crossAxisAlignment, flowMeasurePolicy.crossAxisAlignment) && Dp.m7616equalsimpl0(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == flowMeasurePolicy.maxItemsInMainAxis && this.maxLines == flowMeasurePolicy.maxLines && q10.b(this.overflow, flowMeasurePolicy.overflow);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public int hashCode() {
        return this.overflow.hashCode() + j50.b(this.maxLines, j50.b(this.maxItemsInMainAxis, j50.a(this.crossAxisArrangementSpacing, (this.crossAxisAlignment.hashCode() + j50.a(this.mainAxisSpacing, (this.verticalArrangement.hashCode() + ((this.horizontalArrangement.hashCode() + (Boolean.hashCode(this.isHorizontal) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int i, int i2, int i3, int i4, int i5, FlowLayoutOverflowState flowLayoutOverflowState) {
        long a;
        boolean z;
        FlowMeasurePolicy flowMeasurePolicy = this;
        int i6 = 0;
        if (list.isEmpty()) {
            a = c10.a(0, 0);
        } else {
            int i7 = Integer.MAX_VALUE;
            FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i4, flowLayoutOverflowState, OrientationIndependentConstraints.m729constructorimpl(0, i, 0, Integer.MAX_VALUE), i5, i2, i3, null);
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) yi.r0(list, 0);
            int minCrossAxisIntrinsicItemSize = intrinsicMeasurable != null ? flowMeasurePolicy.minCrossAxisIntrinsicItemSize(intrinsicMeasurable, i) : 0;
            int minMainAxisIntrinsicItemSize = intrinsicMeasurable != null ? flowMeasurePolicy.minMainAxisIntrinsicItemSize(intrinsicMeasurable, minCrossAxisIntrinsicItemSize) : 0;
            int i8 = 0;
            int i9 = 0;
            if (flowLayoutBuildingBlocks.m686getWrapInfoOpUlnko(list.size() > 1, 0, c10.a(i, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : new c10(c10.a(minMainAxisIntrinsicItemSize, minCrossAxisIntrinsicItemSize)), 0, 0, 0, false, false).isLastItemInContainer()) {
                c10 m691ellipsisSizeF35zmw$foundation_layout = flowLayoutOverflowState.m691ellipsisSizeF35zmw$foundation_layout(intrinsicMeasurable != null, 0, 0);
                a = c10.a(m691ellipsisSizeF35zmw$foundation_layout != null ? (int) (m691ellipsisSizeF35zmw$foundation_layout.a & 4294967295L) : 0, 0);
            } else {
                int size = list.size();
                int i10 = i;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int i15 = i9;
                    if (i11 >= size) {
                        break;
                    }
                    int i16 = i10 - minMainAxisIntrinsicItemSize;
                    int i17 = i11 + 1;
                    i9 = Math.max(i15, minCrossAxisIntrinsicItemSize);
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) yi.r0(list, i17);
                    int minCrossAxisIntrinsicItemSize2 = intrinsicMeasurable2 != null ? flowMeasurePolicy.minCrossAxisIntrinsicItemSize(intrinsicMeasurable2, i) : i6;
                    int minMainAxisIntrinsicItemSize2 = intrinsicMeasurable2 != null ? flowMeasurePolicy.minMainAxisIntrinsicItemSize(intrinsicMeasurable2, minCrossAxisIntrinsicItemSize2) + i2 : i6;
                    if (i11 + 2 < list.size()) {
                        i11 = i17;
                        z = 1;
                    } else {
                        i11 = i17;
                        z = i6;
                    }
                    int i18 = i11 - i13;
                    int i19 = i14;
                    int i20 = minMainAxisIntrinsicItemSize2;
                    FlowLayoutBuildingBlocks.WrapInfo m686getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m686getWrapInfoOpUlnko(z, i18, c10.a(i16, i7), intrinsicMeasurable2 == null ? null : new c10(c10.a(minMainAxisIntrinsicItemSize2, minCrossAxisIntrinsicItemSize2)), i19, i8, i9, false, false);
                    if (m686getWrapInfoOpUlnko.isLastItemInLine()) {
                        int i21 = i9 + i3 + i8;
                        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m686getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i19, i21, i16, i18);
                        int i22 = i20 - i2;
                        i14 = i19 + 1;
                        if (m686getWrapInfoOpUlnko.isLastItemInContainer()) {
                            if (wrapEllipsisInfo != null) {
                                long m687getEllipsisSizeOO21N7I = wrapEllipsisInfo.m687getEllipsisSizeOO21N7I();
                                if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                                    i21 += ((int) (m687getEllipsisSizeOO21N7I & 4294967295L)) + i3;
                                }
                            }
                            i8 = i21;
                            i12 = i11;
                        } else {
                            i10 = i;
                            i13 = i11;
                            minMainAxisIntrinsicItemSize = i22;
                            i8 = i21;
                            i9 = 0;
                        }
                    } else {
                        minMainAxisIntrinsicItemSize = i20;
                        i10 = i16;
                        i14 = i19;
                    }
                    flowMeasurePolicy = this;
                    minCrossAxisIntrinsicItemSize = minCrossAxisIntrinsicItemSize2;
                    i12 = i11;
                    i7 = Integer.MAX_VALUE;
                    i6 = 0;
                }
                a = c10.a(i8 - i3, i12);
            }
        }
        return (int) (a >> 32);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public boolean isHorizontal() {
        return this.isHorizontal;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) yi.r0(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) yi.q0(list2) : null;
        List list3 = (List) yi.r0(list, 2);
        flowLayoutOverflowState.m693setOverflowMeasurableshBUhpc$foundation_layout(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) yi.q0(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
        boolean isHorizontal = isHorizontal();
        List<? extends IntrinsicMeasurable> list4 = ut.d;
        if (isHorizontal) {
            List<? extends IntrinsicMeasurable> list5 = (List) yi.q0(list);
            if (list5 != null) {
                list4 = list5;
            }
            return intrinsicCrossAxisSize(list4, i, intrinsicMeasureScope.mo361roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo361roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> list6 = (List) yi.q0(list);
        if (list6 != null) {
            list4 = list6;
        }
        return maxIntrinsicMainAxisSize(list4, i, intrinsicMeasureScope.mo361roundToPx0680j_4(this.mainAxisSpacing));
    }

    public final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, int i, int i2) {
        int i3 = this.maxItemsInMainAxis;
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < size) {
            int maxMainAxisIntrinsicItemSize = maxMainAxisIntrinsicItemSize(list.get(i4), i) + i2;
            int i8 = i4 + 1;
            if (i8 - i6 == i3 || i8 == list.size()) {
                i5 = Math.max(i5, (i7 + maxMainAxisIntrinsicItemSize) - i2);
                i7 = 0;
                i6 = i4;
            } else {
                i7 += maxMainAxisIntrinsicItemSize;
            }
            i4 = i8;
        }
        return i5;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) yi.r0(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) yi.q0(list2) : null;
        List list3 = (List) yi.r0(list, 2);
        flowLayoutOverflowState.m693setOverflowMeasurableshBUhpc$foundation_layout(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) yi.q0(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
        boolean isHorizontal = isHorizontal();
        List<? extends IntrinsicMeasurable> list4 = ut.d;
        if (isHorizontal) {
            List<? extends IntrinsicMeasurable> list5 = (List) yi.q0(list);
            if (list5 != null) {
                list4 = list5;
            }
            return maxIntrinsicMainAxisSize(list4, i, intrinsicMeasureScope.mo361roundToPx0680j_4(this.mainAxisSpacing));
        }
        List<? extends IntrinsicMeasurable> list6 = (List) yi.q0(list);
        if (list6 != null) {
            list4 = list6;
        }
        return intrinsicCrossAxisSize(list4, i, intrinsicMeasureScope.mo361roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo361roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int maxMainAxisIntrinsicItemSize(IntrinsicMeasurable intrinsicMeasurable, int i) {
        return isHorizontal() ? intrinsicMeasurable.maxIntrinsicWidth(i) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo709measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j) {
        if (this.maxLines == 0 || this.maxItemsInMainAxis == 0 || list.isEmpty() || (Constraints.m7563getMaxHeightimpl(j) == 0 && this.overflow.getType$foundation_layout() != FlowLayoutOverflow.OverflowType.Visible)) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new b(5), 4, null);
        }
        List list2 = (List) yi.p0(list);
        if (list2.isEmpty()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new b(6), 4, null);
        }
        List list3 = (List) yi.r0(list, 1);
        Measurable measurable = list3 != null ? (Measurable) yi.q0(list3) : null;
        List list4 = (List) yi.r0(list, 2);
        Measurable measurable2 = list4 != null ? (Measurable) yi.q0(list4) : null;
        this.overflow.setItemCount$foundation_layout(list2.size());
        this.overflow.m692setOverflowMeasurableshBUhpc$foundation_layout(this, measurable, measurable2, j);
        return FlowLayoutKt.m688breakDownItemsdi9J0FM(measureScope, this, list2.iterator(), this.mainAxisSpacing, this.crossAxisArrangementSpacing, OrientationIndependentConstraints.m731constructorimpl(j, isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int minCrossAxisIntrinsicItemSize(IntrinsicMeasurable intrinsicMeasurable, int i) {
        return isHorizontal() ? intrinsicMeasurable.minIntrinsicHeight(i) : intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) yi.r0(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) yi.q0(list2) : null;
        List list3 = (List) yi.r0(list, 2);
        flowLayoutOverflowState.m693setOverflowMeasurableshBUhpc$foundation_layout(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) yi.q0(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
        boolean isHorizontal = isHorizontal();
        List<? extends IntrinsicMeasurable> list4 = ut.d;
        if (isHorizontal) {
            List<? extends IntrinsicMeasurable> list5 = (List) yi.q0(list);
            if (list5 != null) {
                list4 = list5;
            }
            return intrinsicCrossAxisSize(list4, i, intrinsicMeasureScope.mo361roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo361roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> list6 = (List) yi.q0(list);
        if (list6 != null) {
            list4 = list6;
        }
        return minIntrinsicMainAxisSize(list4, i, intrinsicMeasureScope.mo361roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo361roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, int i, int i2, int i3, int i4, int i5, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i6 = i4;
        int i7 = i5;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        int size3 = list.size();
        for (int i8 = 0; i8 < size3; i8++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i8);
            int minMainAxisIntrinsicItemSize = minMainAxisIntrinsicItemSize(intrinsicMeasurable, i);
            iArr[i8] = minMainAxisIntrinsicItemSize;
            iArr2[i8] = minCrossAxisIntrinsicItemSize(intrinsicMeasurable, minMainAxisIntrinsicItemSize);
        }
        List<? extends IntrinsicMeasurable> list2 = list;
        int i9 = Integer.MAX_VALUE;
        if (i7 != Integer.MAX_VALUE && i6 != Integer.MAX_VALUE) {
            i9 = i6 * i7;
        }
        int i10 = 1;
        int min = Math.min(i9 - (((i9 >= list2.size() || !(flowLayoutOverflowState.getType$foundation_layout() == FlowLayoutOverflow.OverflowType.ExpandIndicator || flowLayoutOverflowState.getType$foundation_layout() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i9 < list2.size() || i7 < flowLayoutOverflowState.getMinLinesToShowCollapse$foundation_layout() || flowLayoutOverflowState.getType$foundation_layout() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list2.size());
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += iArr[i12];
        }
        int size4 = ((list2.size() - 1) * i2) + i11;
        if (size2 == 0) {
            o.q();
            return 0;
        }
        int i13 = iArr2[0];
        int i14 = size2 - 1;
        if (1 <= i14) {
            int i15 = 1;
            while (true) {
                int i16 = iArr2[i15];
                if (i13 < i16) {
                    i13 = i16;
                }
                if (i15 == i14) {
                    break;
                }
                i15++;
            }
        }
        if (size == 0) {
            o.q();
            return 0;
        }
        int i17 = iArr[0];
        int i18 = size - 1;
        if (1 <= i18) {
            while (true) {
                int i19 = iArr[i10];
                if (i17 < i19) {
                    i17 = i19;
                }
                if (i10 == i18) {
                    break;
                }
                i10++;
            }
        }
        int i20 = size4;
        int i21 = i13;
        int i22 = i17;
        while (i22 <= i20 && i21 != i) {
            int i23 = (i22 + i20) / 2;
            long intrinsicCrossAxisSize = FlowLayoutKt.intrinsicCrossAxisSize(list2, iArr, iArr2, i23, i2, i3, i6, i7, flowLayoutOverflowState);
            i21 = (int) (intrinsicCrossAxisSize >> 32);
            int i24 = (int) (4294967295L & intrinsicCrossAxisSize);
            if (i21 > i || i24 < min) {
                i22 = i23 + 1;
                if (i22 > i20) {
                    return i22;
                }
            } else {
                if (i21 >= i) {
                    return i23;
                }
                i20 = i23 - 1;
            }
            list2 = list;
            i6 = i4;
            i7 = i5;
            size4 = i23;
        }
        return size4;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) yi.r0(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) yi.q0(list2) : null;
        List list3 = (List) yi.r0(list, 2);
        flowLayoutOverflowState.m693setOverflowMeasurableshBUhpc$foundation_layout(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) yi.q0(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
        boolean isHorizontal = isHorizontal();
        List<? extends IntrinsicMeasurable> list4 = ut.d;
        if (isHorizontal) {
            List<? extends IntrinsicMeasurable> list5 = (List) yi.q0(list);
            if (list5 != null) {
                list4 = list5;
            }
            return minIntrinsicMainAxisSize(list4, i, intrinsicMeasureScope.mo361roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo361roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> list6 = (List) yi.q0(list);
        if (list6 != null) {
            list4 = list6;
        }
        return intrinsicCrossAxisSize(list4, i, intrinsicMeasureScope.mo361roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo361roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int minMainAxisIntrinsicItemSize(IntrinsicMeasurable intrinsicMeasurable, int i) {
        return isHorizontal() ? intrinsicMeasurable.minIntrinsicWidth(i) : intrinsicMeasurable.minIntrinsicHeight(i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FlowMeasurePolicy(isHorizontal=");
        sb.append(this.isHorizontal);
        sb.append(", horizontalArrangement=");
        sb.append(this.horizontalArrangement);
        sb.append(", verticalArrangement=");
        sb.append(this.verticalArrangement);
        sb.append(", mainAxisSpacing=");
        fc.i(this.mainAxisSpacing, sb, ", crossAxisAlignment=");
        sb.append(this.crossAxisAlignment);
        sb.append(", crossAxisArrangementSpacing=");
        fc.i(this.crossAxisArrangementSpacing, sb, ", maxItemsInMainAxis=");
        sb.append(this.maxItemsInMainAxis);
        sb.append(", maxLines=");
        sb.append(this.maxLines);
        sb.append(", overflow=");
        sb.append(this.overflow);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ FlowMeasurePolicy(boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f2, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState, dq dqVar) {
        this(z, horizontal, vertical, f, crossAxisAlignment, f2, i, i2, flowLayoutOverflowState);
    }
}
