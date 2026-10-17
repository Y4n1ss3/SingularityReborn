package androidx.compose.foundation.lazy;

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
import defpackage.h;
import defpackage.hz;
import defpackage.i10;
import defpackage.k10;
import defpackage.ny;
import defpackage.o;
import defpackage.p30;
import defpackage.q10;
import defpackage.q30;
import defpackage.qb;
import defpackage.un;
import defpackage.ut;
import defpackage.w01;
import defpackage.yi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListMeasureKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [i10] */
    private static final List<LazyListMeasuredItem> calculateItemsOffsets(List<LazyListMeasuredItem> list, List<LazyListMeasuredItem> list2, List<LazyListMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i6 = z ? i2 : i;
        int i7 = 0;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            InlineClassHelperKt.throwIllegalStateException("non-zero itemsScrollOffset");
        }
        ArrayList arrayList = new ArrayList(list3.size() + list2.size() + list.size());
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                InlineClassHelperKt.throwIllegalArgumentException("no extra items");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i7 < size) {
                iArr[i7] = list.get(calculateItemsOffsets$reverseAware(i7, z2, size)).getSize();
                i7++;
            }
            int[] iArr2 = new int[size];
            if (z) {
                if (vertical == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement when isVertical == true");
                    o.j();
                    return null;
                }
                vertical.arrange(density, i6, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement when isVertical == false");
                    o.j();
                    return null;
                }
                horizontal.arrange(density, i6, iArr, LayoutDirection.Ltr, iArr2);
            }
            k10 d0 = ac.d0(iArr2);
            if (z2) {
                d0 = new i10(d0.e, d0.d, -d0.f);
            }
            int i8 = d0.d;
            int i9 = d0.e;
            int i10 = d0.f;
            if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                while (true) {
                    int i11 = iArr2[i8];
                    LazyListMeasuredItem lazyListMeasuredItem = list.get(calculateItemsOffsets$reverseAware(i8, z2, size));
                    if (z2) {
                        i11 = (i6 - i11) - lazyListMeasuredItem.getSize();
                    }
                    lazyListMeasuredItem.position(i11, i, i2);
                    arrayList.add(lazyListMeasuredItem);
                    if (i8 == i9) {
                        break;
                    }
                    i8 += i10;
                }
            }
        } else {
            int size2 = list2.size();
            int i12 = i5;
            for (int i13 = 0; i13 < size2; i13++) {
                LazyListMeasuredItem lazyListMeasuredItem2 = list2.get(i13);
                i12 -= lazyListMeasuredItem2.getMainAxisSizeWithSpacings();
                lazyListMeasuredItem2.position(i12, i, i2);
                arrayList.add(lazyListMeasuredItem2);
            }
            int size3 = list.size();
            int i14 = i5;
            for (int i15 = 0; i15 < size3; i15++) {
                LazyListMeasuredItem lazyListMeasuredItem3 = list.get(i15);
                lazyListMeasuredItem3.position(i14, i, i2);
                arrayList.add(lazyListMeasuredItem3);
                i14 += lazyListMeasuredItem3.getMainAxisSizeWithSpacings();
            }
            int size4 = list3.size();
            while (i7 < size4) {
                LazyListMeasuredItem lazyListMeasuredItem4 = list3.get(i7);
                lazyListMeasuredItem4.position(i14, i, i2);
                arrayList.add(lazyListMeasuredItem4);
                i14 += lazyListMeasuredItem4.getMainAxisSizeWithSpacings();
                i7++;
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    private static final List<LazyListMeasuredItem> createItemsAfterList(List<LazyListMeasuredItem> list, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i, int i2, List<Integer> list2) {
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider2;
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider3;
        int min = Math.min(((LazyListMeasuredItem) yi.v0(list)).getIndex() + i2, i - 1);
        int index = ((LazyListMeasuredItem) yi.v0(list)).getIndex() + 1;
        ArrayList arrayList = null;
        if (index <= min) {
            int i3 = index;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
                arrayList.add(LazyListMeasuredItemProvider.m872getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider2, i3, 0L, 2, null));
                if (i3 == min) {
                    break;
                }
                i3++;
                lazyListMeasuredItemProvider = lazyListMeasuredItemProvider2;
            }
        } else {
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
        }
        if (arrayList != null && ((LazyListMeasuredItem) yi.v0(arrayList)).getIndex() > min) {
            min = ((LazyListMeasuredItem) yi.v0(arrayList)).getIndex();
        }
        int size = list2.size();
        int i4 = 0;
        while (i4 < size) {
            int intValue = list2.get(i4).intValue();
            if (intValue > min) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                lazyListMeasuredItemProvider3 = lazyListMeasuredItemProvider2;
                arrayList.add(LazyListMeasuredItemProvider.m872getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider3, intValue, 0L, 2, null));
            } else {
                lazyListMeasuredItemProvider3 = lazyListMeasuredItemProvider2;
            }
            i4++;
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider3;
        }
        return arrayList == null ? ut.d : arrayList;
    }

    private static final List<LazyListMeasuredItem> createItemsBeforeList(int i, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, List<Integer> list) {
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider2;
        int max = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (max <= i3) {
            int i4 = i3;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
                arrayList.add(LazyListMeasuredItemProvider.m872getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider2, i4, 0L, 2, null));
                if (i4 == max) {
                    break;
                }
                i4--;
                lazyListMeasuredItemProvider = lazyListMeasuredItemProvider2;
            }
        } else {
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i5 = size - 1;
                int intValue = list.get(size).intValue();
                if (intValue < max) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(LazyListMeasuredItemProvider.m872getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider2, intValue, 0L, 2, null));
                }
                if (i5 < 0) {
                    break;
                }
                size = i5;
            }
        }
        return arrayList == null ? ut.d : arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0297 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a9 A[LOOP:4: B:90:0x02a7->B:91:0x02a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c5 A[LOOP:5: B:94:0x02c3->B:95:0x02c5, LOOP_END] */
    /* renamed from: measureLazyList-_s_dbAc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LazyListMeasureResult m866measureLazyList_s_dbAc(int i, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density, LazyLayoutItemAnimator<LazyListMeasuredItem> lazyLayoutItemAnimator, int i8, List<Integer> list, boolean z3, boolean z4, un unVar, MutableState<w01> mutableState, GraphicsContext graphicsContext, StickyItemsPlacement stickyItemsPlacement, ny nyVar) {
        int i9;
        int i10;
        int i11;
        boolean z5;
        int i12;
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider2;
        int i13;
        int i14;
        int i15;
        int i16;
        float f2;
        float f3;
        float f4;
        int i17;
        LazyListMeasuredItem lazyListMeasuredItem;
        int size;
        int i18;
        int i19;
        int i20;
        float f5;
        int i21;
        int mainAxisSizeWithSpacings;
        int size2;
        int i22;
        int size3;
        int i23;
        boolean z6;
        int i24;
        Integer valueOf;
        int i25;
        if (i3 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid beforeContentPadding");
        }
        if (i4 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid afterContentPadding");
        }
        if (i <= 0) {
            int m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j);
            int m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(j);
            lazyLayoutItemAnimator.onMeasured(0, m7566getMinWidthimpl, m7565getMinHeightimpl, new ArrayList(), lazyListMeasuredItemProvider.getKeyIndexMap(), lazyListMeasuredItemProvider, z, z4, 1, z3, 0, 0, unVar, graphicsContext);
            if (!z4) {
                long m923getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m923getMinSizeToFitDisappearingItemsYbymL2g();
                if (!IntSize.m7780equalsimpl0(m923getMinSizeToFitDisappearingItemsYbymL2g, IntSize.Companion.m7787getZeroYbymL2g())) {
                    m7566getMinWidthimpl = ConstraintsKt.m7581constrainWidthK40F9xA(j, (int) (m923getMinSizeToFitDisappearingItemsYbymL2g >> 32));
                    m7565getMinHeightimpl = ConstraintsKt.m7580constrainHeightK40F9xA(j, (int) (m923getMinSizeToFitDisappearingItemsYbymL2g & 4294967295L));
                }
            }
            return new LazyListMeasureResult(null, 0, false, 0.0f, (MeasureResult) nyVar.invoke(Integer.valueOf(m7566getMinWidthimpl), Integer.valueOf(m7565getMinHeightimpl), new hz(13)), 0.0f, false, unVar, density, lazyListMeasuredItemProvider.m875getChildConstraintsmsEJaDk(), ut.d, -i3, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5, null);
        }
        int i26 = i6;
        if (i26 >= i) {
            i26 = i - 1;
            i9 = 0;
        } else {
            i9 = i7;
        }
        int round = Math.round(f);
        int i27 = i9 - round;
        if (i26 == 0 && i27 < 0) {
            round += i27;
            i27 = 0;
        }
        int i28 = round;
        qb qbVar = new qb();
        int i29 = -i3;
        int i30 = (i5 < 0 ? i5 : 0) + i29;
        int i31 = i27 + i30;
        int i32 = 0;
        while (i31 < 0 && i26 > 0) {
            int i33 = i26 - 1;
            qb qbVar2 = qbVar;
            LazyListMeasuredItem m872getAndMeasure0kLqBqw$default = LazyListMeasuredItemProvider.m872getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i33, 0L, 2, null);
            qbVar2.add(0, m872getAndMeasure0kLqBqw$default);
            i32 = Math.max(i32, m872getAndMeasure0kLqBqw$default.getCrossAxisSize());
            i31 = m872getAndMeasure0kLqBqw$default.getMainAxisSizeWithSpacings() + i31;
            i26 = i33;
            i30 = i30;
            qbVar = qbVar2;
            i29 = i29;
            i28 = i28;
        }
        int i34 = i31;
        qb qbVar3 = qbVar;
        int i35 = i29;
        int i36 = i32;
        int i37 = i28;
        int i38 = i30;
        if (i34 < i38) {
            i11 = i37 - (i38 - i34);
            i10 = i38;
        } else {
            i10 = i34;
            i11 = i37;
        }
        int i39 = i10 - i38;
        int i40 = i2 + i4;
        int i41 = i40 < 0 ? 0 : i40;
        int i42 = -i39;
        int i43 = i26;
        int i44 = 0;
        boolean z7 = false;
        while (true) {
            z5 = true;
            if (i44 >= qbVar3.size()) {
                break;
            }
            if (i42 >= i41) {
                qbVar3.remove(i44);
                z7 = true;
            } else {
                i43++;
                int mainAxisSizeWithSpacings2 = ((LazyListMeasuredItem) qbVar3.get(i44)).getMainAxisSizeWithSpacings() + i42;
                i44++;
                i42 = mainAxisSizeWithSpacings2;
            }
        }
        int i45 = i26;
        int i46 = i36;
        boolean z8 = z7;
        int i47 = i42;
        int i48 = i39;
        while (i43 < i && (i47 < i41 || i47 <= 0 || qbVar3.isEmpty())) {
            int i49 = i41;
            int i50 = i43;
            int i51 = i45;
            int i52 = i46;
            LazyListMeasuredItem m872getAndMeasure0kLqBqw$default2 = LazyListMeasuredItemProvider.m872getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i50, 0L, 2, null);
            i47 += m872getAndMeasure0kLqBqw$default2.getMainAxisSizeWithSpacings();
            if (i47 > i38 || i50 == i - 1) {
                int max = Math.max(i52, m872getAndMeasure0kLqBqw$default2.getCrossAxisSize());
                qbVar3.addLast(m872getAndMeasure0kLqBqw$default2);
                i25 = i51;
                i52 = max;
            } else {
                i25 = i50 + 1;
                i48 -= m872getAndMeasure0kLqBqw$default2.getMainAxisSizeWithSpacings();
                z8 = true;
            }
            int i53 = i50 + 1;
            int i54 = i25;
            i43 = i53;
            i46 = i52;
            i45 = i54;
            i41 = i49;
        }
        int i55 = i45;
        int i56 = i46;
        int i57 = i43;
        if (i47 < i2) {
            int i58 = i2 - i47;
            int i59 = i47 + i58;
            i13 = i55;
            int i60 = i48 - i58;
            while (i60 < i3 && i13 > 0) {
                i13--;
                int i61 = i60;
                LazyListMeasuredItem m872getAndMeasure0kLqBqw$default3 = LazyListMeasuredItemProvider.m872getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i13, 0L, 2, null);
                qbVar3.add(0, m872getAndMeasure0kLqBqw$default3);
                i56 = Math.max(i56, m872getAndMeasure0kLqBqw$default3.getCrossAxisSize());
                i60 = m872getAndMeasure0kLqBqw$default3.getMainAxisSizeWithSpacings() + i61;
                i57 = i57;
                i59 = i59;
            }
            i48 = i60;
            int i62 = i59;
            i12 = i57;
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
            i15 = i58 + i11;
            if (i48 < 0) {
                i15 += i48;
                i14 = i62 + i48;
                i16 = 0;
                f2 = (Integer.signum(Math.round(f)) == Integer.signum(i15) || Math.abs(Math.round(f)) < Math.abs(i15)) ? f : i15;
                f3 = f - f2;
                f4 = 0.0f;
                if (z4 && i15 > i11 && f3 <= 0.0f) {
                    f4 = (i15 - i11) + f3;
                }
                if (i16 < 0) {
                    InlineClassHelperKt.throwIllegalArgumentException("negative currentFirstItemScrollOffset");
                }
                i17 = -i16;
                lazyListMeasuredItem = (LazyListMeasuredItem) qbVar3.first();
                if (i3 <= 0 || i5 < 0) {
                    size = qbVar3.size();
                    i18 = i17;
                    i19 = 0;
                    while (true) {
                        if (i19 < size) {
                            i20 = i16;
                            f5 = f2;
                            break;
                        }
                        f5 = f2;
                        mainAxisSizeWithSpacings = ((LazyListMeasuredItem) qbVar3.get(i19)).getMainAxisSizeWithSpacings();
                        if (i16 == 0 || mainAxisSizeWithSpacings > i16) {
                            break;
                        }
                        i20 = i16;
                        if (i19 == qbVar3.size() - 1) {
                            break;
                        }
                        i16 = i20 - mainAxisSizeWithSpacings;
                        i19++;
                        lazyListMeasuredItem = (LazyListMeasuredItem) qbVar3.get(i19);
                        f2 = f5;
                    }
                    i20 = i16;
                    i21 = i20;
                } else {
                    i21 = i16;
                    i18 = i17;
                    f5 = f2;
                }
                LazyListMeasuredItem lazyListMeasuredItem2 = lazyListMeasuredItem;
                List<LazyListMeasuredItem> createItemsBeforeList = createItemsBeforeList(i13, lazyListMeasuredItemProvider2, i8, list);
                size2 = createItemsBeforeList.size();
                for (i22 = 0; i22 < size2; i22++) {
                    i56 = Math.max(i56, createItemsBeforeList.get(i22).getCrossAxisSize());
                }
                List<LazyListMeasuredItem> createItemsAfterList = createItemsAfterList(qbVar3, lazyListMeasuredItemProvider2, i, i8, list);
                size3 = createItemsAfterList.size();
                for (i23 = 0; i23 < size3; i23++) {
                    i56 = Math.max(i56, createItemsAfterList.get(i23).getCrossAxisSize());
                }
                z6 = !q10.b(lazyListMeasuredItem2, qbVar3.first()) && createItemsBeforeList.isEmpty() && createItemsAfterList.isEmpty();
                int m7581constrainWidthK40F9xA = ConstraintsKt.m7581constrainWidthK40F9xA(j, !z ? i56 : i14);
                if (z) {
                    i56 = i14;
                }
                int m7580constrainHeightK40F9xA = ConstraintsKt.m7580constrainHeightK40F9xA(j, i56);
                float f6 = f5;
                List<LazyListMeasuredItem> calculateItemsOffsets = calculateItemsOffsets(qbVar3, createItemsBeforeList, createItemsAfterList, m7581constrainWidthK40F9xA, m7580constrainHeightK40F9xA, i14, i2, i18, z, vertical, horizontal, z2, density);
                int i63 = m7581constrainWidthK40F9xA;
                int i64 = i14;
                int i65 = i21;
                lazyLayoutItemAnimator.onMeasured((int) f6, i63, m7580constrainHeightK40F9xA, calculateItemsOffsets, lazyListMeasuredItemProvider.getKeyIndexMap(), lazyListMeasuredItemProvider, z, z4, 1, z3, i65, i64, unVar, graphicsContext);
                if (!z4) {
                    long m923getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m923getMinSizeToFitDisappearingItemsYbymL2g();
                    if (!IntSize.m7780equalsimpl0(m923getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.Companion.m7787getZeroYbymL2g())) {
                        int i66 = z ? m7580constrainHeightK40F9xA : i63;
                        i63 = ConstraintsKt.m7581constrainWidthK40F9xA(j, Math.max(i63, (int) (m923getMinSizeToFitDisappearingItemsYbymL2g2 >> 32)));
                        int m7580constrainHeightK40F9xA2 = ConstraintsKt.m7580constrainHeightK40F9xA(j, Math.max(m7580constrainHeightK40F9xA, (int) (m923getMinSizeToFitDisappearingItemsYbymL2g2 & 4294967295L)));
                        int i67 = z ? m7580constrainHeightK40F9xA2 : i63;
                        if (i67 != i66) {
                            int size4 = calculateItemsOffsets.size();
                            for (int i68 = 0; i68 < size4; i68++) {
                                calculateItemsOffsets.get(i68).updateMainAxisLayoutSize(i67);
                            }
                        }
                        i24 = m7580constrainHeightK40F9xA2;
                        int i69 = i63;
                        LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) qbVar3.c();
                        int index = lazyListMeasuredItem3 != null ? lazyListMeasuredItem3.getIndex() : 0;
                        LazyListMeasuredItem lazyListMeasuredItem4 = (LazyListMeasuredItem) qbVar3.e();
                        List applyStickyItems = LazyLayoutStickyItemsKt.applyStickyItems(stickyItemsPlacement, index, lazyListMeasuredItem4 != null ? lazyListMeasuredItem4.getIndex() : 0, calculateItemsOffsets, lazyListMeasuredItemProvider.getHeaderIndexes(), i3, i4, i69, i24, new h(lazyListMeasuredItemProvider, 24));
                        Integer num = null;
                        if (z6) {
                            LazyListMeasuredItem lazyListMeasuredItem5 = (LazyListMeasuredItem) yi.q0(calculateItemsOffsets);
                            if (lazyListMeasuredItem5 != null) {
                                valueOf = Integer.valueOf(lazyListMeasuredItem5.getIndex());
                            }
                            valueOf = null;
                        } else {
                            LazyListMeasuredItem lazyListMeasuredItem6 = (LazyListMeasuredItem) qbVar3.c();
                            if (lazyListMeasuredItem6 != null) {
                                valueOf = Integer.valueOf(lazyListMeasuredItem6.getIndex());
                            }
                            valueOf = null;
                        }
                        if (z6) {
                            LazyListMeasuredItem lazyListMeasuredItem7 = (LazyListMeasuredItem) yi.w0(calculateItemsOffsets);
                            if (lazyListMeasuredItem7 != null) {
                                num = Integer.valueOf(lazyListMeasuredItem7.getIndex());
                            }
                        } else {
                            LazyListMeasuredItem lazyListMeasuredItem8 = (LazyListMeasuredItem) qbVar3.e();
                            if (lazyListMeasuredItem8 != null) {
                                num = Integer.valueOf(lazyListMeasuredItem8.getIndex());
                            }
                        }
                        if (i12 >= i && i64 <= i2) {
                            z5 = false;
                        }
                        return new LazyListMeasureResult(lazyListMeasuredItem2, i65, z5, f6, (MeasureResult) nyVar.invoke(Integer.valueOf(i69), Integer.valueOf(i24), new q30(mutableState, calculateItemsOffsets, applyStickyItems, z4, 1)), f4, z8, unVar, density, lazyListMeasuredItemProvider.m875getChildConstraintsmsEJaDk(), LazyLayoutMeasuredItemKt.updatedVisibleItems(valueOf != null ? valueOf.intValue() : 0, num != null ? num.intValue() : 0, calculateItemsOffsets, applyStickyItems), i35, i40, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5, null);
                    }
                }
                i24 = m7580constrainHeightK40F9xA;
                int i692 = i63;
                LazyListMeasuredItem lazyListMeasuredItem32 = (LazyListMeasuredItem) qbVar3.c();
                if (lazyListMeasuredItem32 != null) {
                }
                LazyListMeasuredItem lazyListMeasuredItem42 = (LazyListMeasuredItem) qbVar3.e();
                List applyStickyItems2 = LazyLayoutStickyItemsKt.applyStickyItems(stickyItemsPlacement, index, lazyListMeasuredItem42 != null ? lazyListMeasuredItem42.getIndex() : 0, calculateItemsOffsets, lazyListMeasuredItemProvider.getHeaderIndexes(), i3, i4, i692, i24, new h(lazyListMeasuredItemProvider, 24));
                Integer num2 = null;
                if (z6) {
                }
                if (z6) {
                }
                if (i12 >= i) {
                    z5 = false;
                }
                return new LazyListMeasureResult(lazyListMeasuredItem2, i65, z5, f6, (MeasureResult) nyVar.invoke(Integer.valueOf(i692), Integer.valueOf(i24), new q30(mutableState, calculateItemsOffsets, applyStickyItems2, z4, 1)), f4, z8, unVar, density, lazyListMeasuredItemProvider.m875getChildConstraintsmsEJaDk(), LazyLayoutMeasuredItemKt.updatedVisibleItems(valueOf != null ? valueOf.intValue() : 0, num2 != null ? num2.intValue() : 0, calculateItemsOffsets, applyStickyItems2), i35, i40, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5, null);
            }
            i14 = i62;
        } else {
            int i70 = i47;
            i12 = i57;
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
            i13 = i55;
            i14 = i70;
            i15 = i11;
        }
        i16 = i48;
        if (Integer.signum(Math.round(f)) == Integer.signum(i15)) {
        }
        f3 = f - f2;
        f4 = 0.0f;
        if (z4) {
            f4 = (i15 - i11) + f3;
        }
        if (i16 < 0) {
        }
        i17 = -i16;
        lazyListMeasuredItem = (LazyListMeasuredItem) qbVar3.first();
        if (i3 <= 0) {
        }
        size = qbVar3.size();
        i18 = i17;
        i19 = 0;
        while (true) {
            if (i19 < size) {
            }
            i16 = i20 - mainAxisSizeWithSpacings;
            i19++;
            lazyListMeasuredItem = (LazyListMeasuredItem) qbVar3.get(i19);
            f2 = f5;
        }
        i20 = i16;
        i21 = i20;
        LazyListMeasuredItem lazyListMeasuredItem22 = lazyListMeasuredItem;
        List<LazyListMeasuredItem> createItemsBeforeList2 = createItemsBeforeList(i13, lazyListMeasuredItemProvider2, i8, list);
        size2 = createItemsBeforeList2.size();
        while (i22 < size2) {
        }
        List<LazyListMeasuredItem> createItemsAfterList2 = createItemsAfterList(qbVar3, lazyListMeasuredItemProvider2, i, i8, list);
        size3 = createItemsAfterList2.size();
        while (i23 < size3) {
        }
        if (q10.b(lazyListMeasuredItem22, qbVar3.first())) {
        }
        int m7581constrainWidthK40F9xA2 = ConstraintsKt.m7581constrainWidthK40F9xA(j, !z ? i56 : i14);
        if (z) {
        }
        int m7580constrainHeightK40F9xA3 = ConstraintsKt.m7580constrainHeightK40F9xA(j, i56);
        float f62 = f5;
        List<LazyListMeasuredItem> calculateItemsOffsets2 = calculateItemsOffsets(qbVar3, createItemsBeforeList2, createItemsAfterList2, m7581constrainWidthK40F9xA2, m7580constrainHeightK40F9xA3, i14, i2, i18, z, vertical, horizontal, z2, density);
        int i632 = m7581constrainWidthK40F9xA2;
        int i642 = i14;
        int i652 = i21;
        lazyLayoutItemAnimator.onMeasured((int) f62, i632, m7580constrainHeightK40F9xA3, calculateItemsOffsets2, lazyListMeasuredItemProvider.getKeyIndexMap(), lazyListMeasuredItemProvider, z, z4, 1, z3, i652, i642, unVar, graphicsContext);
        if (!z4) {
        }
        i24 = m7580constrainHeightK40F9xA3;
        int i6922 = i632;
        LazyListMeasuredItem lazyListMeasuredItem322 = (LazyListMeasuredItem) qbVar3.c();
        if (lazyListMeasuredItem322 != null) {
        }
        LazyListMeasuredItem lazyListMeasuredItem422 = (LazyListMeasuredItem) qbVar3.e();
        List applyStickyItems22 = LazyLayoutStickyItemsKt.applyStickyItems(stickyItemsPlacement, index, lazyListMeasuredItem422 != null ? lazyListMeasuredItem422.getIndex() : 0, calculateItemsOffsets2, lazyListMeasuredItemProvider.getHeaderIndexes(), i3, i4, i6922, i24, new h(lazyListMeasuredItemProvider, 24));
        Integer num22 = null;
        if (z6) {
        }
        if (z6) {
        }
        if (i12 >= i) {
        }
        return new LazyListMeasureResult(lazyListMeasuredItem22, i652, z5, f62, (MeasureResult) nyVar.invoke(Integer.valueOf(i6922), Integer.valueOf(i24), new q30(mutableState, calculateItemsOffsets2, applyStickyItems22, z4, 1)), f4, z8, unVar, density, lazyListMeasuredItemProvider.m875getChildConstraintsmsEJaDk(), LazyLayoutMeasuredItemKt.updatedVisibleItems(valueOf != null ? valueOf.intValue() : 0, num22 != null ? num22.intValue() : 0, calculateItemsOffsets2, applyStickyItems22), i35, i40, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measureLazyList__s_dbAc$lambda$2(Placeable.PlacementScope placementScope) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyListMeasuredItem measureLazyList__s_dbAc$lambda$7(LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i) {
        return LazyListMeasuredItemProvider.m872getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measureLazyList__s_dbAc$lambda$8(MutableState mutableState, List list, List list2, boolean z, Placeable.PlacementScope placementScope) {
        placementScope.withMotionFrameOfReferencePlacement(new p30(list, list2, z, 1));
        ObservableScopeInvalidator.m939attachToScopeimpl(mutableState);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measureLazyList__s_dbAc$lambda$8$0(List list, List list2, boolean z, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((LazyListMeasuredItem) list.get(i)).place(placementScope, z);
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((LazyListMeasuredItem) list2.get(i2)).place(placementScope, z);
        }
        return w01.a;
    }
}
