package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.gestures.snapping.SnapPositionKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.pager.MeasuredPage;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ac;
import defpackage.gy;
import defpackage.i10;
import defpackage.iy;
import defpackage.je0;
import defpackage.k10;
import defpackage.ky;
import defpackage.mb0;
import defpackage.na0;
import defpackage.ny;
import defpackage.q10;
import defpackage.qb;
import defpackage.te0;
import defpackage.un;
import defpackage.ut;
import defpackage.w01;
import defpackage.y80;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PagerMeasureKt {
    public static final float MaxPageOffset = 0.5f;
    public static final float MinPageOffset = -0.5f;

    private static final MeasuredPage calculateNewCurrentPage(int i, List<MeasuredPage> list, int i2, int i3, int i4, SnapPosition snapPosition, int i5) {
        MeasuredPage measuredPage;
        if (list.isEmpty()) {
            measuredPage = null;
        } else {
            MeasuredPage measuredPage2 = list.get(0);
            MeasuredPage measuredPage3 = measuredPage2;
            float f = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i, i2, i3, i4, measuredPage3.getOffset(), measuredPage3.getIndex(), snapPosition, i5));
            int size = list.size() - 1;
            if (1 <= size) {
                int i6 = 1;
                while (true) {
                    MeasuredPage measuredPage4 = list.get(i6);
                    MeasuredPage measuredPage5 = measuredPage4;
                    float f2 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i, i2, i3, i4, measuredPage5.getOffset(), measuredPage5.getIndex(), snapPosition, i5));
                    if (Float.compare(f, f2) < 0) {
                        f = f2;
                        measuredPage2 = measuredPage4;
                    }
                    if (i6 == size) {
                        break;
                    }
                    i6++;
                }
            }
            measuredPage = measuredPage2;
        }
        return measuredPage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [i10] */
    private static final List<MeasuredPage> calculatePagesOffsets(LazyLayoutMeasureScope lazyLayoutMeasureScope, List<MeasuredPage> list, List<MeasuredPage> list2, List<MeasuredPage> list3, int i, int i2, int i3, int i4, int i5, Orientation orientation, boolean z, Density density, int i6, int i7) {
        int i8 = i5;
        int i9 = i7 + i6;
        int i10 = orientation == Orientation.Vertical ? i2 : i;
        int i11 = 0;
        boolean z2 = i3 < Math.min(i10, i4);
        if (z2 && i8 != 0) {
            InlineClassHelperKt.throwIllegalStateException("non-zero pagesScrollOffset=" + i8);
        }
        ArrayList arrayList = new ArrayList(list3.size() + list2.size() + list.size());
        if (z2) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                InlineClassHelperKt.throwIllegalArgumentException("No extra pages");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i11 < size) {
                iArr[i11] = i7;
                i11++;
            }
            int[] iArr2 = new int[size];
            Arrangement.HorizontalOrVertical m650spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m650spacedBy0680j_4(lazyLayoutMeasureScope.mo364toDpu2uoSUM(i6));
            if (orientation == Orientation.Vertical) {
                m650spacedBy0680j_4.arrange(density, i10, iArr, iArr2);
            } else {
                m650spacedBy0680j_4.arrange(density, i10, iArr, LayoutDirection.Ltr, iArr2);
            }
            k10 d0 = ac.d0(iArr2);
            if (z) {
                d0 = new i10(d0.e, d0.d, -d0.f);
            }
            int i12 = d0.d;
            int i13 = d0.e;
            int i14 = d0.f;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    int i15 = iArr2[i12];
                    MeasuredPage measuredPage = list.get(calculatePagesOffsets$reverseAware(i12, z, size));
                    if (z) {
                        i15 = (i10 - i15) - measuredPage.getSize();
                    }
                    measuredPage.position(i15, i, i2);
                    arrayList.add(measuredPage);
                    if (i12 == i13) {
                        break;
                    }
                    i12 += i14;
                }
            }
        } else {
            int size2 = list2.size();
            int i16 = i8;
            for (int i17 = 0; i17 < size2; i17++) {
                MeasuredPage measuredPage2 = list2.get(i17);
                i16 -= i9;
                measuredPage2.position(i16, i, i2);
                arrayList.add(measuredPage2);
            }
            int size3 = list.size();
            for (int i18 = 0; i18 < size3; i18++) {
                MeasuredPage measuredPage3 = list.get(i18);
                measuredPage3.position(i8, i, i2);
                arrayList.add(measuredPage3);
                i8 += i9;
            }
            int size4 = list3.size();
            while (i11 < size4) {
                MeasuredPage measuredPage4 = list3.get(i11);
                measuredPage4.position(i8, i, i2);
                arrayList.add(measuredPage4);
                i8 += i9;
                i11++;
            }
        }
        return arrayList;
    }

    private static final int calculatePagesOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    private static final List<MeasuredPage> createPagesAfterList(int i, int i2, int i3, List<Integer> list, ky kyVar) {
        int min = Math.min(i3, (i2 - i) - 1) + i;
        int i4 = i + 1;
        ArrayList arrayList = null;
        if (i4 <= min) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kyVar.invoke(Integer.valueOf(i4)));
                if (i4 == min) {
                    break;
                }
                i4++;
            }
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int intValue = list.get(i5).intValue();
            if (min + 1 <= intValue && intValue < i2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kyVar.invoke(Integer.valueOf(intValue)));
            }
        }
        return arrayList == null ? ut.d : arrayList;
    }

    private static final List<MeasuredPage> createPagesBeforeList(int i, int i2, List<Integer> list, ky kyVar) {
        int max = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (max <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kyVar.invoke(Integer.valueOf(i3)));
                if (i3 == max) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int intValue = list.get(i4).intValue();
            if (intValue < max) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kyVar.invoke(Integer.valueOf(intValue)));
            }
        }
        return arrayList == null ? ut.d : arrayList;
    }

    /* renamed from: getAndMeasure-G5IdpRk, reason: not valid java name */
    private static final MeasuredPage m1007getAndMeasureG5IdpRk(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j2, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z, int i2, na0 na0Var) {
        List list;
        Object key = pagerLazyLayoutItemProvider.getKey(i);
        List list2 = (List) na0Var.b(i);
        if (list2 != null) {
            list = list2;
        } else {
            List<Measurable> compose = lazyLayoutMeasureScope.compose(i);
            int size = compose.size();
            ArrayList arrayList = new ArrayList(size);
            int i3 = 0;
            while (i3 < size) {
                i3 = gy.a(compose.get(i3), j, arrayList, i3, 1);
            }
            na0Var.i(i, arrayList);
            list = arrayList;
        }
        return new MeasuredPage(i, i2, list, j2, key, orientation, horizontal, vertical, layoutDirection, z, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* renamed from: measurePager-7L1iB3k, reason: not valid java name */
    public static final PagerMeasureResult m1008measurePager7L1iB3k(final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, final PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, long j, final Orientation orientation, final Alignment.Vertical vertical, final Alignment.Horizontal horizontal, final boolean z, final long j2, final int i8, int i9, List<Integer> list, SnapPosition snapPosition, MutableState<w01> mutableState, un unVar, Density density, ny nyVar, final na0 na0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        List arrayList;
        ut utVar;
        ut utVar2;
        if (i3 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("negative beforeContentPadding");
        }
        if (i4 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("negative afterContentPadding");
        }
        int i14 = i8 + i5;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = i9;
        if (i15 > i) {
            i15 = i;
        }
        Orientation orientation2 = Orientation.Vertical;
        final long Constraints$default = ConstraintsKt.Constraints$default(0, orientation == orientation2 ? Constraints.m7564getMaxWidthimpl(j) : i8, 0, orientation != orientation2 ? Constraints.m7563getMaxHeightimpl(j) : i8, 5, null);
        ut utVar3 = ut.d;
        int i16 = 1;
        if (i <= 0) {
            return new PagerMeasureResult(utVar3, i8, i5, i4, orientation, -i3, i2 + i4, false, i15, null, null, 0.0f, 0, false, snapPosition, (MeasureResult) nyVar.invoke(Integer.valueOf(Constraints.m7566getMinWidthimpl(j)), Integer.valueOf(Constraints.m7565getMinHeightimpl(j)), new je0(i16)), false, null, null, unVar, density, Constraints$default, 393216, null);
        }
        int i17 = i15;
        int i18 = i6;
        int i19 = i7;
        while (i18 > 0 && i19 > 0) {
            i18--;
            i19 -= i14;
        }
        int i20 = i19 * (-1);
        if (i18 >= i) {
            i18 = i - 1;
            i20 = 0;
        }
        qb qbVar = new qb();
        int i21 = -i3;
        int i22 = i21 + (i5 < 0 ? i5 : 0);
        int i23 = i20 + i22;
        int i24 = 0;
        while (i23 < 0 && i18 > 0) {
            int i25 = i18 - 1;
            MeasuredPage m1007getAndMeasureG5IdpRk = m1007getAndMeasureG5IdpRk(lazyLayoutMeasureScope, i25, Constraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i8, na0Var);
            qbVar.add(0, m1007getAndMeasureG5IdpRk);
            i24 = Math.max(i24, m1007getAndMeasureG5IdpRk.getCrossAxisSize());
            i23 += i14;
            i18 = i25;
            i21 = i21;
        }
        int i26 = i21;
        int i27 = i24;
        if (i23 < i22) {
            i23 = i22;
        }
        int i28 = i23 - i22;
        int i29 = i2 + i4;
        int i30 = i29 >= 0 ? i29 : 0;
        int i31 = -i28;
        int i32 = i18;
        int i33 = i32;
        int i34 = 0;
        boolean z2 = false;
        while (i34 < qbVar.size()) {
            if (i31 >= i30) {
                qbVar.remove(i34);
                z2 = true;
            } else {
                i33++;
                i31 += i14;
                i34++;
            }
        }
        int i35 = i32;
        int i36 = i33;
        boolean z3 = z2;
        while (i36 < i && (i31 < i30 || i31 <= 0 || qbVar.isEmpty())) {
            int i37 = i36;
            int i38 = i30;
            int i39 = i27;
            MeasuredPage m1007getAndMeasureG5IdpRk2 = m1007getAndMeasureG5IdpRk(lazyLayoutMeasureScope, i37, Constraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i8, na0Var);
            int i40 = i35;
            int i41 = i - 1;
            i31 += i37 == i41 ? i8 : i14;
            if (i31 > i22 || i37 == i41) {
                i39 = Math.max(i39, m1007getAndMeasureG5IdpRk2.getCrossAxisSize());
                qbVar.addLast(m1007getAndMeasureG5IdpRk2);
                i35 = i40;
            } else {
                i28 -= i14;
                z3 = true;
                i35 = i37 + 1;
            }
            i27 = i39;
            i36 = i37 + 1;
            i30 = i38;
        }
        int i42 = i27;
        int i43 = i36;
        int i44 = i42;
        int i45 = i35;
        if (i31 < i2) {
            int i46 = i2 - i31;
            i28 -= i46;
            i31 += i46;
            i11 = i45;
            while (i28 < i3 && i11 > 0) {
                int i47 = i11 - 1;
                MeasuredPage m1007getAndMeasureG5IdpRk3 = m1007getAndMeasureG5IdpRk(lazyLayoutMeasureScope, i47, Constraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i8, na0Var);
                qbVar.add(0, m1007getAndMeasureG5IdpRk3);
                i44 = Math.max(i44, m1007getAndMeasureG5IdpRk3.getCrossAxisSize());
                i28 += i14;
                i43 = i43;
                i11 = i47;
            }
            i10 = i43;
            if (i28 < 0) {
                i31 += i28;
                i28 = 0;
            }
        } else {
            i10 = i43;
            i11 = i45;
        }
        if (i28 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid currentFirstPageScrollOffset");
        }
        int i48 = -i28;
        MeasuredPage measuredPage = (MeasuredPage) qbVar.first();
        if (i3 > 0 || i5 < 0) {
            int size = qbVar.size();
            i12 = i10;
            int i49 = 0;
            while (i49 < size && i28 != 0 && i14 <= i28) {
                i13 = i31;
                if (i49 == qbVar.size() - 1) {
                    break;
                }
                i28 -= i14;
                i49++;
                measuredPage = (MeasuredPage) qbVar.get(i49);
                i31 = i13;
            }
        } else {
            i12 = i10;
        }
        i13 = i31;
        int i50 = i28;
        MeasuredPage measuredPage2 = measuredPage;
        final int i51 = 0;
        int i52 = 0;
        List<MeasuredPage> createPagesBeforeList = createPagesBeforeList(i11, i17, list, new ky() { // from class: se0
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                MeasuredPage measurePager_7L1iB3k$lambda$10;
                MeasuredPage measurePager_7L1iB3k$lambda$12;
                int i53 = i51;
                int intValue = ((Integer) obj).intValue();
                switch (i53) {
                    case 0:
                        measurePager_7L1iB3k$lambda$10 = PagerMeasureKt.measurePager_7L1iB3k$lambda$10(lazyLayoutMeasureScope, Constraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, z, i8, na0Var, intValue);
                        return measurePager_7L1iB3k$lambda$10;
                    default:
                        measurePager_7L1iB3k$lambda$12 = PagerMeasureKt.measurePager_7L1iB3k$lambda$12(lazyLayoutMeasureScope, Constraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, z, i8, na0Var, intValue);
                        return measurePager_7L1iB3k$lambda$12;
                }
            }
        });
        int size2 = createPagesBeforeList.size();
        for (int i53 = 0; i53 < size2; i53++) {
            i44 = Math.max(i44, createPagesBeforeList.get(i53).getCrossAxisSize());
        }
        final int i54 = 1;
        List<MeasuredPage> createPagesAfterList = createPagesAfterList(((MeasuredPage) qbVar.last()).getIndex(), i, i17, list, new ky() { // from class: se0
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                MeasuredPage measurePager_7L1iB3k$lambda$10;
                MeasuredPage measurePager_7L1iB3k$lambda$12;
                int i532 = i54;
                int intValue = ((Integer) obj).intValue();
                switch (i532) {
                    case 0:
                        measurePager_7L1iB3k$lambda$10 = PagerMeasureKt.measurePager_7L1iB3k$lambda$10(lazyLayoutMeasureScope, Constraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, z, i8, na0Var, intValue);
                        return measurePager_7L1iB3k$lambda$10;
                    default:
                        measurePager_7L1iB3k$lambda$12 = PagerMeasureKt.measurePager_7L1iB3k$lambda$12(lazyLayoutMeasureScope, Constraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, z, i8, na0Var, intValue);
                        return measurePager_7L1iB3k$lambda$12;
                }
            }
        });
        int size3 = createPagesAfterList.size();
        int i55 = 0;
        while (i55 < size3) {
            i44 = Math.max(i44, createPagesAfterList.get(i55).getCrossAxisSize());
            i55++;
            createPagesAfterList = createPagesAfterList;
        }
        List<MeasuredPage> list2 = createPagesAfterList;
        boolean z4 = q10.b(measuredPage2, qbVar.first()) && createPagesBeforeList.isEmpty() && list2.isEmpty();
        Orientation orientation3 = Orientation.Vertical;
        int m7581constrainWidthK40F9xA = ConstraintsKt.m7581constrainWidthK40F9xA(j, orientation == orientation3 ? i44 : i13);
        if (orientation == orientation3) {
            i44 = i13;
        }
        int m7580constrainHeightK40F9xA = ConstraintsKt.m7580constrainHeightK40F9xA(j, i44);
        int i56 = i14;
        int i57 = i13;
        List<MeasuredPage> calculatePagesOffsets = calculatePagesOffsets(lazyLayoutMeasureScope, qbVar, createPagesBeforeList, list2, m7581constrainWidthK40F9xA, m7580constrainHeightK40F9xA, i57, i2, i48, orientation, z, lazyLayoutMeasureScope, i5, i8);
        if (z4) {
            arrayList = calculatePagesOffsets;
        } else {
            arrayList = new ArrayList(calculatePagesOffsets.size());
            int size4 = calculatePagesOffsets.size();
            int i58 = 0;
            while (i58 < size4) {
                MeasuredPage measuredPage3 = measuredPage2;
                MeasuredPage measuredPage4 = calculatePagesOffsets.get(i58);
                MeasuredPage measuredPage5 = measuredPage4;
                int i59 = i56;
                if (measuredPage5.getIndex() >= ((MeasuredPage) qbVar.first()).getIndex() && measuredPage5.getIndex() <= ((MeasuredPage) qbVar.last()).getIndex()) {
                    arrayList.add(measuredPage4);
                }
                i58++;
                i56 = i59;
                measuredPage2 = measuredPage3;
            }
        }
        MeasuredPage measuredPage6 = measuredPage2;
        int i60 = i56;
        if (createPagesBeforeList.isEmpty()) {
            utVar = utVar3;
        } else {
            ?? arrayList2 = new ArrayList(calculatePagesOffsets.size());
            int size5 = calculatePagesOffsets.size();
            for (int i61 = 0; i61 < size5; i61++) {
                MeasuredPage measuredPage7 = calculatePagesOffsets.get(i61);
                if (measuredPage7.getIndex() < ((MeasuredPage) qbVar.first()).getIndex()) {
                    arrayList2.add(measuredPage7);
                }
            }
            utVar = arrayList2;
        }
        if (list2.isEmpty()) {
            utVar2 = utVar3;
        } else {
            ?? arrayList3 = new ArrayList(calculatePagesOffsets.size());
            int size6 = calculatePagesOffsets.size();
            for (int i62 = 0; i62 < size6; i62++) {
                MeasuredPage measuredPage8 = calculatePagesOffsets.get(i62);
                if (measuredPage8.getIndex() > ((MeasuredPage) qbVar.last()).getIndex()) {
                    arrayList3.add(measuredPage8);
                }
            }
            utVar2 = arrayList3;
        }
        int i63 = i12;
        MeasuredPage calculateNewCurrentPage = calculateNewCurrentPage(i2 + i3 + i4, arrayList, i3, i4, i8, snapPosition, i);
        return new PagerMeasureResult(arrayList, i8, i5, i4, orientation, i26, i29, z, i17, measuredPage6, calculateNewCurrentPage, i60 == 0 ? 0.0f : y80.g((snapPosition.position(r0, i8, i3, i4, calculateNewCurrentPage != null ? calculateNewCurrentPage.getIndex() : 0, i) - (calculateNewCurrentPage != null ? calculateNewCurrentPage.getOffset() : 0)) / i60, -0.5f, 0.5f), i50, i63 < i || i57 > i2, snapPosition, (MeasureResult) nyVar.invoke(Integer.valueOf(m7581constrainWidthK40F9xA), Integer.valueOf(m7580constrainHeightK40F9xA), new te0(i52, mutableState, calculatePagesOffsets)), z3, utVar, utVar2, unVar, density, Constraints$default, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasuredPage measurePager_7L1iB3k$lambda$10(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j2, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, boolean z, int i, na0 na0Var, int i2) {
        return m1007getAndMeasureG5IdpRk(lazyLayoutMeasureScope, i2, j, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i, na0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasuredPage measurePager_7L1iB3k$lambda$12(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j2, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, boolean z, int i, na0 na0Var, int i2) {
        return m1007getAndMeasureG5IdpRk(lazyLayoutMeasureScope, i2, j, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i, na0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measurePager_7L1iB3k$lambda$18(MutableState mutableState, List list, Placeable.PlacementScope placementScope) {
        placementScope.withMotionFrameOfReferencePlacement(new mb0(list, 3));
        ObservableScopeInvalidator.m939attachToScopeimpl(mutableState);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measurePager_7L1iB3k$lambda$18$0(List list, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((MeasuredPage) list.get(i)).place(placementScope);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measurePager_7L1iB3k$lambda$3(Placeable.PlacementScope placementScope) {
        return w01.a;
    }

    private static final void debugLog(iy iyVar) {
    }
}
