package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutStickyItemsKt;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.StickyItemsPlacement;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ac;
import defpackage.g;
import defpackage.hz;
import defpackage.i10;
import defpackage.k10;
import defpackage.ky;
import defpackage.ny;
import defpackage.o;
import defpackage.p30;
import defpackage.q30;
import defpackage.qb;
import defpackage.un;
import defpackage.ut;
import defpackage.w01;
import defpackage.yi;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridMeasureKt {
    private static final <T> void addAllFromArray(List<T> list, T[] tArr) {
        for (T t : tArr) {
            list.add(t);
        }
    }

    private static final List<LazyGridMeasuredItem> calculateExtraItems(List<Integer> list, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, ky kyVar) {
        LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider2;
        int size = list.size();
        ArrayList arrayList = null;
        int i = 0;
        while (i < size) {
            int intValue = list.get(i).intValue();
            if (((Boolean) kyVar.invoke(Integer.valueOf(intValue))).booleanValue()) {
                int spanOf = lazyGridMeasuredLineProvider.spanOf(intValue);
                lazyGridMeasuredItemProvider2 = lazyGridMeasuredItemProvider;
                LazyGridMeasuredItem mo873getAndMeasurehBUhpc = lazyGridMeasuredItemProvider2.mo873getAndMeasurehBUhpc(intValue, 0, spanOf, lazyGridMeasuredLineProvider.m899childConstraintsJhjzzOo$foundation(0, spanOf));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(mo873getAndMeasurehBUhpc);
            } else {
                lazyGridMeasuredItemProvider2 = lazyGridMeasuredItemProvider;
            }
            i++;
            lazyGridMeasuredItemProvider = lazyGridMeasuredItemProvider2;
        }
        return arrayList == null ? ut.d : arrayList;
    }

    private static final List<LazyGridMeasuredItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        i10 d0;
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            InlineClassHelperKt.throwIllegalStateException("non-zero firstLineScrollOffset");
        }
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += list.get(i8).getItems().length;
        }
        ArrayList arrayList = new ArrayList(i7);
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                InlineClassHelperKt.throwIllegalArgumentException("no items");
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i9 = 0; i9 < size2; i9++) {
                iArr[i9] = list.get(calculateItemsOffsets$reverseAware(i9, z2, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            if (z) {
                if (vertical == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement");
                    o.j();
                    return null;
                }
                vertical.arrange(density, i6, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement");
                    o.j();
                    return null;
                }
                horizontal.arrange(density, i6, iArr, LayoutDirection.Ltr, iArr2);
            }
            if (z2) {
                k10 d02 = ac.d0(iArr2);
                d0 = new i10(d02.e, d02.d, -d02.f);
            } else {
                d0 = ac.d0(iArr2);
            }
            int i10 = d0.d;
            int i11 = d0.e;
            int i12 = d0.f;
            if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                while (true) {
                    int i13 = iArr2[i10];
                    LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(i10, z2, size2));
                    if (z2) {
                        i13 = (i6 - i13) - lazyGridMeasuredLine.getMainAxisSize();
                    }
                    addAllFromArray(arrayList, lazyGridMeasuredLine.position(i13, i, i2));
                    if (i10 == i11) {
                        break;
                    }
                    i10 += i12;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int i14 = i5;
                while (true) {
                    int i15 = size3 - 1;
                    LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(size3);
                    i14 -= lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                    lazyGridMeasuredItem.position(i14, 0, i, i2);
                    arrayList.add(lazyGridMeasuredItem);
                    if (i15 < 0) {
                        break;
                    }
                    size3 = i15;
                }
            }
            int size4 = list.size();
            int i16 = i5;
            for (int i17 = 0; i17 < size4; i17++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i17);
                addAllFromArray(arrayList, lazyGridMeasuredLine2.position(i16, i, i2));
                i16 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i18 = 0; i18 < size5; i18++) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i18);
                lazyGridMeasuredItem2.position(i16, 0, i, i2);
                arrayList.add(lazyGridMeasuredItem2);
                i16 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        r6 = r9.get(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final List<LazyGridMeasuredLine> linesRetainedForLookahead(int i, int i2, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, boolean z, List<LazyGridMeasuredLine> list, LazyGridLayoutInfo lazyGridLayoutInfo) {
        LazyGridItemInfo lazyGridItemInfo;
        int index;
        int min;
        ArrayList arrayList = null;
        if (z && lazyGridLayoutInfo != null && !lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            List<LazyGridItemInfo> visibleItemsInfo = lazyGridLayoutInfo.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    lazyGridItemInfo = null;
                    break;
                }
                if (visibleItemsInfo.get(size).getIndex() <= i || (size != 0 && visibleItemsInfo.get(size - 1).getIndex() > i)) {
                }
            }
            LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) yi.v0(lazyGridLayoutInfo.getVisibleItemsInfo());
            LazyGridMeasuredLine lazyGridMeasuredLine = (LazyGridMeasuredLine) yi.w0(list);
            int index2 = lazyGridMeasuredLine != null ? lazyGridMeasuredLine.getIndex() + 1 : 0;
            if (lazyGridItemInfo != null && (index = lazyGridItemInfo.getIndex()) <= (min = Math.min(lazyGridItemInfo2.getIndex(), i2 - 1))) {
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            for (LazyGridMeasuredItem lazyGridMeasuredItem : arrayList.get(i3).getItems()) {
                                if (lazyGridMeasuredItem.getIndex() == index) {
                                    break;
                                }
                            }
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyGridMeasuredLine andMeasure = lazyGridMeasuredLineProvider.getAndMeasure(index2);
                    index2++;
                    arrayList.add(andMeasure);
                    if (index == min) {
                        break;
                    }
                    index++;
                }
            }
        }
        return arrayList == null ? ut.d : arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x032d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x043f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0332 A[EDGE_INSN: B:205:0x0332->B:149:0x0332 BREAK  A[LOOP:9: B:194:0x033b->B:201:0x0355], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0227  */
    /* renamed from: measureLazyGrid-t1x4au0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LazyGridMeasureResult m895measureLazyGridt1x4au0(int i, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density, LazyLayoutItemAnimator<LazyGridMeasuredItem> lazyLayoutItemAnimator, int i8, List<Integer> list, boolean z3, boolean z4, LazyGridLayoutInfo lazyGridLayoutInfo, un unVar, MutableState<w01> mutableState, GraphicsContext graphicsContext, ky kyVar, ky kyVar2, StickyItemsPlacement stickyItemsPlacement, ny nyVar) {
        int i9;
        int i10;
        float f2;
        float f3;
        LazyGridMeasuredLine lazyGridMeasuredLine;
        List list2;
        int i11;
        LazyGridMeasuredLine lazyGridMeasuredLine2;
        int i12;
        int size;
        List list3;
        int i13;
        int size2;
        int i14;
        qb qbVar;
        List<LazyGridMeasuredLine> list4;
        int size3;
        int i15;
        qb qbVar2;
        int mainAxisSizeWithSpacings;
        int i16;
        qb qbVar3;
        List<LazyGridMeasuredLine> list5;
        int i17;
        int i18;
        int i19;
        LazyGridMeasuredItem[] items;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        LazyGridMeasuredItem[] items2;
        LazyGridMeasuredItem lazyGridMeasuredItem2;
        int i20;
        int i21 = i;
        if (i3 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("negative beforeContentPadding");
        }
        if (i4 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("negative afterContentPadding");
        }
        List list6 = ut.d;
        if (i21 <= 0) {
            int m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j);
            int m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(j);
            lazyLayoutItemAnimator.onMeasured(0, m7566getMinWidthimpl, m7565getMinHeightimpl, new ArrayList(), lazyGridMeasuredItemProvider.getKeyIndexMap(), lazyGridMeasuredItemProvider, z, z4, i8, z3, 0, 0, unVar, graphicsContext);
            if (!z4) {
                long m923getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m923getMinSizeToFitDisappearingItemsYbymL2g();
                if (!IntSize.m7780equalsimpl0(m923getMinSizeToFitDisappearingItemsYbymL2g, IntSize.Companion.m7787getZeroYbymL2g())) {
                    m7566getMinWidthimpl = ConstraintsKt.m7581constrainWidthK40F9xA(j, (int) (m923getMinSizeToFitDisappearingItemsYbymL2g >> 32));
                    m7565getMinHeightimpl = ConstraintsKt.m7580constrainHeightK40F9xA(j, (int) (m923getMinSizeToFitDisappearingItemsYbymL2g & 4294967295L));
                }
            }
            return new LazyGridMeasureResult(null, 0, false, 0.0f, (MeasureResult) nyVar.invoke(Integer.valueOf(m7566getMinWidthimpl), Integer.valueOf(m7565getMinHeightimpl), new hz(9)), 0.0f, false, unVar, density, i8, kyVar, kyVar2, list6, -i3, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
        }
        int round = Math.round(f);
        int i22 = i7 - round;
        if (i6 == 0 && i22 < 0) {
            round += i22;
            i22 = 0;
        }
        qb qbVar4 = new qb();
        int i23 = -i3;
        int i24 = (i5 < 0 ? i5 : 0) + i23;
        int i25 = i22 + i24;
        int i26 = i6;
        while (i25 < 0 && i26 > 0) {
            i26--;
            LazyGridMeasuredLine andMeasure = lazyGridMeasuredLineProvider.getAndMeasure(i26);
            qbVar4.add(0, andMeasure);
            i25 += andMeasure.getMainAxisSizeWithSpacings();
        }
        if (i25 < i24) {
            round -= i24 - i25;
            i25 = i24;
        }
        int i27 = i25 - i24;
        int i28 = i2 + i4;
        int i29 = i28 < 0 ? 0 : i28;
        int i30 = i26;
        int i31 = i30;
        int i32 = -i27;
        int i33 = 0;
        boolean z5 = false;
        while (i33 < qbVar4.size()) {
            if (i32 >= i29) {
                qbVar4.remove(i33);
                z5 = true;
            } else {
                i31++;
                int mainAxisSizeWithSpacings2 = ((LazyGridMeasuredLine) qbVar4.get(i33)).getMainAxisSizeWithSpacings() + i32;
                i33++;
                i32 = mainAxisSizeWithSpacings2;
            }
        }
        int i34 = i30;
        boolean z6 = z5;
        int i35 = i31;
        while (i35 < i21 && (i32 < i29 || i32 <= 0 || qbVar4.isEmpty())) {
            LazyGridMeasuredLine andMeasure2 = lazyGridMeasuredLineProvider.getAndMeasure(i35);
            if (andMeasure2.isEmpty()) {
                break;
            }
            int mainAxisSizeWithSpacings3 = andMeasure2.getMainAxisSizeWithSpacings() + i32;
            if (mainAxisSizeWithSpacings3 <= i24) {
                LazyGridMeasuredItem[] items3 = andMeasure2.getItems();
                items3.getClass();
                i20 = i24;
                if (items3.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                if (items3[items3.length - 1].getIndex() != i - 1) {
                    i27 -= andMeasure2.getMainAxisSizeWithSpacings();
                    i34 = i35 + 1;
                    z6 = true;
                    i35++;
                    i21 = i;
                    i32 = mainAxisSizeWithSpacings3;
                    i24 = i20;
                }
            } else {
                i20 = i24;
            }
            qbVar4.addLast(andMeasure2);
            i35++;
            i21 = i;
            i32 = mainAxisSizeWithSpacings3;
            i24 = i20;
        }
        if (i32 < i2) {
            int i36 = i2 - i32;
            i27 -= i36;
            i32 += i36;
            while (i27 < i3 && i34 > 0) {
                i34--;
                LazyGridMeasuredLine andMeasure3 = lazyGridMeasuredLineProvider.getAndMeasure(i34);
                qbVar4.add(0, andMeasure3);
                i27 += andMeasure3.getMainAxisSizeWithSpacings();
            }
            i9 = i36 + round;
            if (i27 < 0) {
                i9 += i27;
                i10 = i32 + i27;
                i27 = 0;
                float f4 = (Integer.signum(Math.round(f)) == Integer.signum(i9) || Math.abs(Math.round(f)) < Math.abs(i9)) ? f : i9;
                f2 = f - f4;
                f3 = 0.0f;
                if (z4 && i9 > round && f2 <= 0.0f) {
                    f3 = (i9 - round) + f2;
                }
                float f5 = f3;
                if (i27 < 0) {
                    InlineClassHelperKt.throwIllegalArgumentException("negative initial offset");
                }
                int i37 = -i27;
                lazyGridMeasuredLine = (LazyGridMeasuredLine) qbVar4.c();
                list2 = null;
                if (lazyGridMeasuredLine != null && (items2 = lazyGridMeasuredLine.getItems()) != null) {
                    lazyGridMeasuredItem2 = items2.length != 0 ? null : items2[0];
                    if (lazyGridMeasuredItem2 != null) {
                        i11 = lazyGridMeasuredItem2.getIndex();
                        lazyGridMeasuredLine2 = (LazyGridMeasuredLine) qbVar4.e();
                        if (lazyGridMeasuredLine2 != null && (items = lazyGridMeasuredLine2.getItems()) != null) {
                            lazyGridMeasuredItem = items.length != 0 ? null : items[items.length - 1];
                            if (lazyGridMeasuredItem != null) {
                                i12 = lazyGridMeasuredItem.getIndex();
                                size = list.size();
                                list3 = null;
                                i13 = 0;
                                while (i13 < size) {
                                    int i38 = i12;
                                    int intValue = list.get(i13).intValue();
                                    if (intValue < 0 || intValue >= i11) {
                                        i19 = i11;
                                    } else {
                                        i19 = i11;
                                        int spanOf = lazyGridMeasuredLineProvider.spanOf(intValue);
                                        LazyGridMeasuredItem mo873getAndMeasurehBUhpc = lazyGridMeasuredItemProvider.mo873getAndMeasurehBUhpc(intValue, 0, spanOf, lazyGridMeasuredLineProvider.m899childConstraintsJhjzzOo$foundation(0, spanOf));
                                        List arrayList = list3 == null ? new ArrayList() : list3;
                                        arrayList.add(mo873getAndMeasurehBUhpc);
                                        list3 = arrayList;
                                    }
                                    i13++;
                                    i12 = i38;
                                    i11 = i19;
                                }
                                int i39 = i11;
                                int i40 = i12;
                                if (list3 == null) {
                                    list3 = list6;
                                }
                                List<LazyGridMeasuredLine> linesRetainedForLookahead = linesRetainedForLookahead(i40, i, lazyGridMeasuredLineProvider, z4, qbVar4, lazyGridLayoutInfo);
                                int i41 = i;
                                LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider2 = lazyGridMeasuredLineProvider;
                                size2 = list.size();
                                i14 = 0;
                                while (i14 < size2) {
                                    int i42 = size2;
                                    int intValue2 = list.get(i14).intValue();
                                    int i43 = i14;
                                    if (i40 + 1 <= intValue2 && intValue2 < i41) {
                                        if (z4) {
                                            int size4 = linesRetainedForLookahead.size();
                                            int i44 = 0;
                                            while (i44 < size4) {
                                                int i45 = i44;
                                                LazyGridMeasuredItem[] items4 = linesRetainedForLookahead.get(i44).getItems();
                                                int i46 = size4;
                                                int length = items4.length;
                                                int i47 = 0;
                                                while (i47 < length) {
                                                    int i48 = i47;
                                                    if (items4[i47].getIndex() != intValue2) {
                                                        i47 = i48 + 1;
                                                    }
                                                }
                                                i44 = i45 + 1;
                                                size4 = i46;
                                            }
                                        }
                                        int spanOf2 = lazyGridMeasuredLineProvider2.spanOf(intValue2);
                                        qbVar3 = qbVar4;
                                        list5 = linesRetainedForLookahead;
                                        i17 = i43;
                                        i18 = i42;
                                        LazyGridMeasuredItem mo873getAndMeasurehBUhpc2 = lazyGridMeasuredItemProvider.mo873getAndMeasurehBUhpc(intValue2, 0, spanOf2, lazyGridMeasuredLineProvider2.m899childConstraintsJhjzzOo$foundation(0, spanOf2));
                                        List arrayList2 = list2 == null ? new ArrayList() : list2;
                                        arrayList2.add(mo873getAndMeasurehBUhpc2);
                                        list2 = arrayList2;
                                        i14 = i17 + 1;
                                        i41 = i;
                                        lazyGridMeasuredLineProvider2 = lazyGridMeasuredLineProvider;
                                        size2 = i18;
                                        qbVar4 = qbVar3;
                                        linesRetainedForLookahead = list5;
                                    }
                                    qbVar3 = qbVar4;
                                    list5 = linesRetainedForLookahead;
                                    i17 = i43;
                                    i18 = i42;
                                    i14 = i17 + 1;
                                    i41 = i;
                                    lazyGridMeasuredLineProvider2 = lazyGridMeasuredLineProvider;
                                    size2 = i18;
                                    qbVar4 = qbVar3;
                                    linesRetainedForLookahead = list5;
                                }
                                qbVar = qbVar4;
                                list4 = linesRetainedForLookahead;
                                List list7 = list2 != null ? list6 : list2;
                                if (i3 <= 0 || i5 < 0) {
                                    size3 = qbVar.size();
                                    i15 = 0;
                                    while (true) {
                                        qbVar2 = qbVar;
                                        if (i15 < size3) {
                                            break;
                                        }
                                        mainAxisSizeWithSpacings = ((LazyGridMeasuredLine) qbVar2.get(i15)).getMainAxisSizeWithSpacings();
                                        if (i27 == 0 || mainAxisSizeWithSpacings > i27 || i15 == qbVar2.size() - 1) {
                                            break;
                                        }
                                        i27 -= mainAxisSizeWithSpacings;
                                        i15++;
                                        lazyGridMeasuredLine = (LazyGridMeasuredLine) qbVar2.get(i15);
                                        qbVar = qbVar2;
                                    }
                                } else {
                                    qbVar2 = qbVar;
                                }
                                int i49 = i27;
                                int m7564getMaxWidthimpl = !z ? Constraints.m7564getMaxWidthimpl(j) : ConstraintsKt.m7581constrainWidthK40F9xA(j, i10);
                                int m7580constrainHeightK40F9xA = !z ? ConstraintsKt.m7580constrainHeightK40F9xA(j, i10) : Constraints.m7563getMaxHeightimpl(j);
                                List list8 = qbVar2;
                                if (!list4.isEmpty()) {
                                    list8 = yi.A0(qbVar2, list4);
                                }
                                int i50 = i10;
                                float f6 = f4;
                                List<LazyGridMeasuredItem> calculateItemsOffsets = calculateItemsOffsets(list8, list3, list7, m7564getMaxWidthimpl, m7580constrainHeightK40F9xA, i50, i2, i37, z, vertical, horizontal, z2, density);
                                lazyLayoutItemAnimator.onMeasured((int) f6, m7564getMaxWidthimpl, m7580constrainHeightK40F9xA, calculateItemsOffsets, lazyGridMeasuredItemProvider.getKeyIndexMap(), lazyGridMeasuredItemProvider, z, z4, i8, z3, i49, i50, unVar, graphicsContext);
                                if (!z4) {
                                    long m923getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m923getMinSizeToFitDisappearingItemsYbymL2g();
                                    if (!IntSize.m7780equalsimpl0(m923getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.Companion.m7787getZeroYbymL2g())) {
                                        int i51 = z ? m7580constrainHeightK40F9xA : m7564getMaxWidthimpl;
                                        m7564getMaxWidthimpl = ConstraintsKt.m7581constrainWidthK40F9xA(j, Math.max(m7564getMaxWidthimpl, (int) (m923getMinSizeToFitDisappearingItemsYbymL2g2 >> 32)));
                                        int m7580constrainHeightK40F9xA2 = ConstraintsKt.m7580constrainHeightK40F9xA(j, Math.max(m7580constrainHeightK40F9xA, (int) (m923getMinSizeToFitDisappearingItemsYbymL2g2 & 4294967295L)));
                                        int i52 = z ? m7580constrainHeightK40F9xA2 : m7564getMaxWidthimpl;
                                        if (i52 != i51) {
                                            int size5 = calculateItemsOffsets.size();
                                            for (int i53 = 0; i53 < size5; i53++) {
                                                calculateItemsOffsets.get(i53).updateMainAxisLayoutSize(i52);
                                            }
                                        }
                                        i16 = m7580constrainHeightK40F9xA2;
                                        int i54 = m7564getMaxWidthimpl;
                                        List applyStickyItems = LazyLayoutStickyItemsKt.applyStickyItems(stickyItemsPlacement, i39, i40, calculateItemsOffsets, lazyGridMeasuredItemProvider.getHeaderIndices(), i3, i4, i54, i16, new g(24, lazyGridMeasuredLineProvider, lazyGridMeasuredItemProvider));
                                        return new LazyGridMeasureResult(lazyGridMeasuredLine, i49, i40 == i + (-1) || i50 > i2, f6, (MeasureResult) nyVar.invoke(Integer.valueOf(i54), Integer.valueOf(i16), new q30(mutableState, calculateItemsOffsets, applyStickyItems, z4, 0)), f5, z6, unVar, density, i8, kyVar, kyVar2, LazyLayoutMeasuredItemKt.updatedVisibleItems(i39, i40, calculateItemsOffsets, applyStickyItems), i23, i28, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
                                    }
                                }
                                i16 = m7580constrainHeightK40F9xA;
                                int i542 = m7564getMaxWidthimpl;
                                List applyStickyItems2 = LazyLayoutStickyItemsKt.applyStickyItems(stickyItemsPlacement, i39, i40, calculateItemsOffsets, lazyGridMeasuredItemProvider.getHeaderIndices(), i3, i4, i542, i16, new g(24, lazyGridMeasuredLineProvider, lazyGridMeasuredItemProvider));
                                return new LazyGridMeasureResult(lazyGridMeasuredLine, i49, i40 == i + (-1) || i50 > i2, f6, (MeasureResult) nyVar.invoke(Integer.valueOf(i542), Integer.valueOf(i16), new q30(mutableState, calculateItemsOffsets, applyStickyItems2, z4, 0)), f5, z6, unVar, density, i8, kyVar, kyVar2, LazyLayoutMeasuredItemKt.updatedVisibleItems(i39, i40, calculateItemsOffsets, applyStickyItems2), i23, i28, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
                            }
                        }
                        i12 = 0;
                        size = list.size();
                        list3 = null;
                        i13 = 0;
                        while (i13 < size) {
                        }
                        int i392 = i11;
                        int i402 = i12;
                        if (list3 == null) {
                        }
                        List<LazyGridMeasuredLine> linesRetainedForLookahead2 = linesRetainedForLookahead(i402, i, lazyGridMeasuredLineProvider, z4, qbVar4, lazyGridLayoutInfo);
                        int i412 = i;
                        LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider22 = lazyGridMeasuredLineProvider;
                        size2 = list.size();
                        i14 = 0;
                        while (i14 < size2) {
                        }
                        qbVar = qbVar4;
                        list4 = linesRetainedForLookahead2;
                        if (list2 != null) {
                        }
                        if (i3 <= 0) {
                        }
                        size3 = qbVar.size();
                        i15 = 0;
                        while (true) {
                            qbVar2 = qbVar;
                            if (i15 < size3) {
                            }
                            i27 -= mainAxisSizeWithSpacings;
                            i15++;
                            lazyGridMeasuredLine = (LazyGridMeasuredLine) qbVar2.get(i15);
                            qbVar = qbVar2;
                        }
                        int i492 = i27;
                        int m7564getMaxWidthimpl2 = !z ? Constraints.m7564getMaxWidthimpl(j) : ConstraintsKt.m7581constrainWidthK40F9xA(j, i10);
                        int m7580constrainHeightK40F9xA3 = !z ? ConstraintsKt.m7580constrainHeightK40F9xA(j, i10) : Constraints.m7563getMaxHeightimpl(j);
                        List list82 = qbVar2;
                        if (!list4.isEmpty()) {
                        }
                        int i502 = i10;
                        float f62 = f4;
                        List<LazyGridMeasuredItem> calculateItemsOffsets2 = calculateItemsOffsets(list82, list3, list7, m7564getMaxWidthimpl2, m7580constrainHeightK40F9xA3, i502, i2, i37, z, vertical, horizontal, z2, density);
                        lazyLayoutItemAnimator.onMeasured((int) f62, m7564getMaxWidthimpl2, m7580constrainHeightK40F9xA3, calculateItemsOffsets2, lazyGridMeasuredItemProvider.getKeyIndexMap(), lazyGridMeasuredItemProvider, z, z4, i8, z3, i492, i502, unVar, graphicsContext);
                        if (!z4) {
                        }
                        i16 = m7580constrainHeightK40F9xA3;
                        int i5422 = m7564getMaxWidthimpl2;
                        List applyStickyItems22 = LazyLayoutStickyItemsKt.applyStickyItems(stickyItemsPlacement, i392, i402, calculateItemsOffsets2, lazyGridMeasuredItemProvider.getHeaderIndices(), i3, i4, i5422, i16, new g(24, lazyGridMeasuredLineProvider, lazyGridMeasuredItemProvider));
                        return new LazyGridMeasureResult(lazyGridMeasuredLine, i492, i402 == i + (-1) || i502 > i2, f62, (MeasureResult) nyVar.invoke(Integer.valueOf(i5422), Integer.valueOf(i16), new q30(mutableState, calculateItemsOffsets2, applyStickyItems22, z4, 0)), f5, z6, unVar, density, i8, kyVar, kyVar2, LazyLayoutMeasuredItemKt.updatedVisibleItems(i392, i402, calculateItemsOffsets2, applyStickyItems22), i23, i28, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
                    }
                }
                i11 = 0;
                lazyGridMeasuredLine2 = (LazyGridMeasuredLine) qbVar4.e();
                if (lazyGridMeasuredLine2 != null) {
                    if (items.length != 0) {
                    }
                    if (lazyGridMeasuredItem != null) {
                    }
                }
                i12 = 0;
                size = list.size();
                list3 = null;
                i13 = 0;
                while (i13 < size) {
                }
                int i3922 = i11;
                int i4022 = i12;
                if (list3 == null) {
                }
                List<LazyGridMeasuredLine> linesRetainedForLookahead22 = linesRetainedForLookahead(i4022, i, lazyGridMeasuredLineProvider, z4, qbVar4, lazyGridLayoutInfo);
                int i4122 = i;
                LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider222 = lazyGridMeasuredLineProvider;
                size2 = list.size();
                i14 = 0;
                while (i14 < size2) {
                }
                qbVar = qbVar4;
                list4 = linesRetainedForLookahead22;
                if (list2 != null) {
                }
                if (i3 <= 0) {
                }
                size3 = qbVar.size();
                i15 = 0;
                while (true) {
                    qbVar2 = qbVar;
                    if (i15 < size3) {
                    }
                    i27 -= mainAxisSizeWithSpacings;
                    i15++;
                    lazyGridMeasuredLine = (LazyGridMeasuredLine) qbVar2.get(i15);
                    qbVar = qbVar2;
                }
                int i4922 = i27;
                int m7564getMaxWidthimpl22 = !z ? Constraints.m7564getMaxWidthimpl(j) : ConstraintsKt.m7581constrainWidthK40F9xA(j, i10);
                int m7580constrainHeightK40F9xA32 = !z ? ConstraintsKt.m7580constrainHeightK40F9xA(j, i10) : Constraints.m7563getMaxHeightimpl(j);
                List list822 = qbVar2;
                if (!list4.isEmpty()) {
                }
                int i5022 = i10;
                float f622 = f4;
                List<LazyGridMeasuredItem> calculateItemsOffsets22 = calculateItemsOffsets(list822, list3, list7, m7564getMaxWidthimpl22, m7580constrainHeightK40F9xA32, i5022, i2, i37, z, vertical, horizontal, z2, density);
                lazyLayoutItemAnimator.onMeasured((int) f622, m7564getMaxWidthimpl22, m7580constrainHeightK40F9xA32, calculateItemsOffsets22, lazyGridMeasuredItemProvider.getKeyIndexMap(), lazyGridMeasuredItemProvider, z, z4, i8, z3, i4922, i5022, unVar, graphicsContext);
                if (!z4) {
                }
                i16 = m7580constrainHeightK40F9xA32;
                int i54222 = m7564getMaxWidthimpl22;
                List applyStickyItems222 = LazyLayoutStickyItemsKt.applyStickyItems(stickyItemsPlacement, i3922, i4022, calculateItemsOffsets22, lazyGridMeasuredItemProvider.getHeaderIndices(), i3, i4, i54222, i16, new g(24, lazyGridMeasuredLineProvider, lazyGridMeasuredItemProvider));
                return new LazyGridMeasureResult(lazyGridMeasuredLine, i4922, i4022 == i + (-1) || i5022 > i2, f622, (MeasureResult) nyVar.invoke(Integer.valueOf(i54222), Integer.valueOf(i16), new q30(mutableState, calculateItemsOffsets22, applyStickyItems222, z4, 0)), f5, z6, unVar, density, i8, kyVar, kyVar2, LazyLayoutMeasuredItemKt.updatedVisibleItems(i3922, i4022, calculateItemsOffsets22, applyStickyItems222), i23, i28, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
            }
        } else {
            i9 = round;
        }
        i10 = i32;
        if (Integer.signum(Math.round(f)) == Integer.signum(i9)) {
        }
        f2 = f - f4;
        f3 = 0.0f;
        if (z4) {
            f3 = (i9 - round) + f2;
        }
        float f52 = f3;
        if (i27 < 0) {
        }
        int i372 = -i27;
        lazyGridMeasuredLine = (LazyGridMeasuredLine) qbVar4.c();
        list2 = null;
        if (lazyGridMeasuredLine != null) {
            if (items2.length != 0) {
            }
            if (lazyGridMeasuredItem2 != null) {
            }
        }
        i11 = 0;
        lazyGridMeasuredLine2 = (LazyGridMeasuredLine) qbVar4.e();
        if (lazyGridMeasuredLine2 != null) {
        }
        i12 = 0;
        size = list.size();
        list3 = null;
        i13 = 0;
        while (i13 < size) {
        }
        int i39222 = i11;
        int i40222 = i12;
        if (list3 == null) {
        }
        List<LazyGridMeasuredLine> linesRetainedForLookahead222 = linesRetainedForLookahead(i40222, i, lazyGridMeasuredLineProvider, z4, qbVar4, lazyGridLayoutInfo);
        int i41222 = i;
        LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider2222 = lazyGridMeasuredLineProvider;
        size2 = list.size();
        i14 = 0;
        while (i14 < size2) {
        }
        qbVar = qbVar4;
        list4 = linesRetainedForLookahead222;
        if (list2 != null) {
        }
        if (i3 <= 0) {
        }
        size3 = qbVar.size();
        i15 = 0;
        while (true) {
            qbVar2 = qbVar;
            if (i15 < size3) {
            }
            i27 -= mainAxisSizeWithSpacings;
            i15++;
            lazyGridMeasuredLine = (LazyGridMeasuredLine) qbVar2.get(i15);
            qbVar = qbVar2;
        }
        int i49222 = i27;
        int m7564getMaxWidthimpl222 = !z ? Constraints.m7564getMaxWidthimpl(j) : ConstraintsKt.m7581constrainWidthK40F9xA(j, i10);
        int m7580constrainHeightK40F9xA322 = !z ? ConstraintsKt.m7580constrainHeightK40F9xA(j, i10) : Constraints.m7563getMaxHeightimpl(j);
        List list8222 = qbVar2;
        if (!list4.isEmpty()) {
        }
        int i50222 = i10;
        float f6222 = f4;
        List<LazyGridMeasuredItem> calculateItemsOffsets222 = calculateItemsOffsets(list8222, list3, list7, m7564getMaxWidthimpl222, m7580constrainHeightK40F9xA322, i50222, i2, i372, z, vertical, horizontal, z2, density);
        lazyLayoutItemAnimator.onMeasured((int) f6222, m7564getMaxWidthimpl222, m7580constrainHeightK40F9xA322, calculateItemsOffsets222, lazyGridMeasuredItemProvider.getKeyIndexMap(), lazyGridMeasuredItemProvider, z, z4, i8, z3, i49222, i50222, unVar, graphicsContext);
        if (!z4) {
        }
        i16 = m7580constrainHeightK40F9xA322;
        int i542222 = m7564getMaxWidthimpl222;
        List applyStickyItems2222 = LazyLayoutStickyItemsKt.applyStickyItems(stickyItemsPlacement, i39222, i40222, calculateItemsOffsets222, lazyGridMeasuredItemProvider.getHeaderIndices(), i3, i4, i542222, i16, new g(24, lazyGridMeasuredLineProvider, lazyGridMeasuredItemProvider));
        return new LazyGridMeasureResult(lazyGridMeasuredLine, i49222, i40222 == i + (-1) || i50222 > i2, f6222, (MeasureResult) nyVar.invoke(Integer.valueOf(i542222), Integer.valueOf(i16), new q30(mutableState, calculateItemsOffsets222, applyStickyItems2222, z4, 0)), f52, z6, unVar, density, i8, kyVar, kyVar2, LazyLayoutMeasuredItemKt.updatedVisibleItems(i39222, i40222, calculateItemsOffsets222, applyStickyItems2222), i23, i28, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measureLazyGrid_t1x4au0$lambda$2(Placeable.PlacementScope placementScope) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridMeasuredItem measureLazyGrid_t1x4au0$lambda$7(LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, int i) {
        int spanOf = lazyGridMeasuredLineProvider.spanOf(i);
        return lazyGridMeasuredItemProvider.mo873getAndMeasurehBUhpc(i, 0, spanOf, lazyGridMeasuredLineProvider.m899childConstraintsJhjzzOo$foundation(0, spanOf));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measureLazyGrid_t1x4au0$lambda$8(MutableState mutableState, List list, List list2, boolean z, Placeable.PlacementScope placementScope) {
        placementScope.withMotionFrameOfReferencePlacement(new p30(list, list2, z, 0));
        ObservableScopeInvalidator.m939attachToScopeimpl(mutableState);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measureLazyGrid_t1x4au0$lambda$8$0(List list, List list2, boolean z, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((LazyGridMeasuredItem) list.get(i)).place(placementScope, z);
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((LazyGridMeasuredItem) list2.get(i2)).place(placementScope, z);
        }
        return w01.a;
    }
}
