package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import defpackage.ac;
import defpackage.f1;
import defpackage.hz;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.qb;
import defpackage.un;
import defpackage.ut;
import defpackage.w01;
import defpackage.yi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    private static final List<LazyStaggeredGridMeasuredItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ky kyVar, ky kyVar2, boolean z) {
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        ArrayList arrayList = null;
        if (z) {
            int size = pinnedItems.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    int intValue = pinnedItems.get(size).intValue();
                    if (((Boolean) kyVar2.invoke(Integer.valueOf(intValue))).booleanValue()) {
                        long m971getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m971getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        LazyStaggeredGridMeasuredItem m979getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m979getAndMeasurejy6DScQ(intValue, m971getSpanRangelOCCd4c);
                        kyVar.invoke(m979getAndMeasurejy6DScQ);
                        arrayList.add(m979getAndMeasurejy6DScQ);
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
        } else {
            int size2 = pinnedItems.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int intValue2 = pinnedItems.get(i2).intValue();
                if (((Boolean) kyVar2.invoke(Integer.valueOf(intValue2))).booleanValue()) {
                    long m971getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m971getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem m979getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m979getAndMeasurejy6DScQ(intValue2, m971getSpanRangelOCCd4c2);
                    kyVar.invoke(m979getAndMeasurejy6DScQ2);
                    arrayList.add(m979getAndMeasurejy6DScQ2);
                }
            }
        }
        return arrayList == null ? ut.d : arrayList;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, qb[] qbVarArr, int[] iArr, int i, int i2, int i3) {
        int i4 = 0;
        for (qb qbVar : qbVarArr) {
            i4 += qbVar.size();
        }
        ArrayList arrayList = new ArrayList(i4);
        while (true) {
            for (qb qbVar2 : qbVarArr) {
                if (!qbVar2.isEmpty()) {
                    int length = qbVarArr.length;
                    int i5 = -1;
                    int i6 = Integer.MAX_VALUE;
                    for (int i7 = 0; i7 < length; i7++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) qbVarArr[i7].c();
                        int index = lazyStaggeredGridMeasuredItem != null ? lazyStaggeredGridMeasuredItem.getIndex() : Integer.MAX_VALUE;
                        if (i6 > index) {
                            i5 = i7;
                            i6 = index;
                        }
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) qbVarArr[i5].removeFirst();
                    if (lazyStaggeredGridMeasuredItem2.getLane() == i5) {
                        long m985constructorimpl = SpanRange.m985constructorimpl(lazyStaggeredGridMeasuredItem2.getLane(), lazyStaggeredGridMeasuredItem2.getSpan());
                        int m975maxInRangejy6DScQ = m975maxInRangejy6DScQ(iArr, m985constructorimpl);
                        int i8 = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i5];
                        if (lazyStaggeredGridMeasuredItem2.getMainAxisSize() + m975maxInRangejy6DScQ >= i2 && m975maxInRangejy6DScQ <= i3) {
                            lazyStaggeredGridMeasuredItem2.position(m975maxInRangejy6DScQ, i8, i);
                            arrayList.add(lazyStaggeredGridMeasuredItem2);
                        }
                        int i9 = (int) (m985constructorimpl & 4294967295L);
                        for (int i10 = (int) (m985constructorimpl >> 32); i10 < i9; i10++) {
                            iArr[i10] = lazyStaggeredGridMeasuredItem2.getMainAxisSizeWithSpacings() + m975maxInRangejy6DScQ;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final String debugRender(qb[] qbVarArr) {
        return "";
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            while (true) {
                if (iArr[length] < i && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            int i3 = iArr[length];
            if (i3 >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), i3)) {
                if (lazyStaggeredGridMeasureContext.getLaneInfo().getLane(i3) == -2) {
                    int length2 = iArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i4 = -1;
                            break;
                        } else if (iArr[i4] == i3) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    int i5 = i4 + 1;
                    if (i5 <= length) {
                        while (true) {
                            if (iArr[i5] == i3) {
                                iArr[i5] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, i3, i5);
                            }
                            if (i5 == length) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    length = i4;
                }
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(i3, length);
            }
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    private static final <T> void fastForEach(List<? extends T> list, boolean z, ky kyVar) {
        if (!z) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                kyVar.invoke(list.get(i));
            }
            return;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i2 = size2 - 1;
            kyVar.invoke(list.get(size2));
            if (i2 < 0) {
                return;
            } else {
                size2 = i2;
            }
        }
    }

    public static /* synthetic */ void fastForEach$default(List list, boolean z, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if (!z) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                kyVar.invoke(list.get(i2));
            }
            return;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i3 = size2 - 1;
            kyVar.invoke(list.get(size2));
            if (i3 < 0) {
                return;
            } else {
                size2 = i3;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int i2) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i, i2);
    }

    /* renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m974forEachnIS5qE8(long j, ky kyVar) {
        int i = (int) (j & 4294967295L);
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            kyVar.invoke(Integer.valueOf(i2));
        }
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    private static final <T> int indexOfMinBy(T[] tArr, ky kyVar) {
        int length = tArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int intValue = ((Number) kyVar.invoke(tArr[i3])).intValue();
            if (i2 > intValue) {
                i = i3;
                i2 = intValue;
            }
        }
        return i;
    }

    public static final int indexOfMinValue(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i + 1;
            int i6 = iArr[i4];
            if (i5 <= i6 && i6 < i3) {
                i2 = i4;
                i3 = i6;
            }
        }
        return i2;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r8 = r10.get(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final List<LazyStaggeredGridMeasuredItem> itemsRetainedForLookahead(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int i2, boolean z, my myVar) {
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo;
        int index;
        int min;
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo2;
        if (z && lazyStaggeredGridMeasureContext.getApproachLayoutInfo() != null && !lazyStaggeredGridMeasureContext.getApproachLayoutInfo().getVisibleItemsInfo().isEmpty()) {
            List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridMeasureContext.getApproachLayoutInfo().getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    lazyStaggeredGridItemInfo = null;
                    break;
                }
                if (visibleItemsInfo.get(size).getIndex() <= i || (size != 0 && visibleItemsInfo.get(size - 1).getIndex() > i)) {
                }
            }
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo3 = (LazyStaggeredGridItemInfo) yi.v0(lazyStaggeredGridMeasureContext.getApproachLayoutInfo().getVisibleItemsInfo());
            if (lazyStaggeredGridItemInfo != null && (index = lazyStaggeredGridItemInfo.getIndex()) <= (min = Math.min(lazyStaggeredGridItemInfo3.getIndex(), i2 - 1))) {
                ArrayList arrayList = null;
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            if (arrayList.get(i3).getIndex() == index) {
                                break;
                            }
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<LazyStaggeredGridItemInfo> visibleItemsInfo2 = lazyStaggeredGridMeasureContext.getApproachLayoutInfo().getVisibleItemsInfo();
                    int size3 = visibleItemsInfo2.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size3) {
                            lazyStaggeredGridItemInfo2 = null;
                            break;
                        }
                        lazyStaggeredGridItemInfo2 = visibleItemsInfo2.get(i4);
                        if (lazyStaggeredGridItemInfo2.getIndex() == index) {
                            break;
                        }
                        i4++;
                    }
                    LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo4 = lazyStaggeredGridItemInfo2;
                    int lane = lazyStaggeredGridItemInfo4 != null ? lazyStaggeredGridItemInfo4.getLane() : 0;
                    LazyStaggeredGridMeasuredItem m979getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m979getAndMeasurejy6DScQ(index, lazyStaggeredGridMeasureContext.m971getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), index, lane));
                    arrayList.add(m979getAndMeasurejy6DScQ);
                    int[] positions = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions();
                    myVar.invoke(m979getAndMeasurejy6DScQ, Integer.valueOf(positions.length > lane ? positions[lane] : 0));
                    if (index == min) {
                        return arrayList;
                    }
                    index++;
                }
            }
        }
        return null;
    }

    /* renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m975maxInRangejy6DScQ(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int i2 = Integer.MIN_VALUE;
        for (int i3 = (int) (j >> 32); i3 < i; i3++) {
            i2 = Math.max(i2, iArr[i3]);
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0238, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x024e, code lost:
    
        r7 = indexOfMinValue$default(r10, 0, 1, null);
        r1 = defpackage.ac.j0(r29) + 1;
        r12 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0259, code lost:
    
        if (r1 < r12) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0914, code lost:
    
        r11 = r0;
        r25 = r3;
        r8 = r29;
        r29 = r10;
        r2 = r11.m971getSpanRangelOCCd4c(r11.getItemProvider(), r1, r7);
        r0 = r11.getLaneInfo();
        r6 = (int) (r2 & r18);
        r10 = r4;
        r7 = r5;
        r5 = (int) (r2 >> 32);
        r4 = r6 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0934, code lost:
    
        if (r4 == 1) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0936, code lost:
    
        r13 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0939, code lost:
    
        r0.setLane(r1, r13);
        r0 = r11.getMeasuredItemProvider().m979getAndMeasurejy6DScQ(r1, r2);
        r2 = m975maxInRangejy6DScQ(r29, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x094b, code lost:
    
        if (r4 == 1) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x094d, code lost:
    
        r4 = r11.getLaneInfo().getGaps(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0955, code lost:
    
        if (r4 != null) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0957, code lost:
    
        r4 = new int[r11.getLaneCount()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0960, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0961, code lost:
    
        if (r3 >= r6) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0963, code lost:
    
        if (r4 == null) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0965, code lost:
    
        r4[r3] = r2 - r29[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x096b, code lost:
    
        r8[r3] = r1;
        r29[r3] = r0.getMainAxisSizeWithSpacings() + r2;
        r29 = r3;
        r22[r29].addLast(r0);
        r3 = r29 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x097f, code lost:
    
        r11.getLaneInfo().setGaps(r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0986, code lost:
    
        if (r2 >= r14) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x098a, code lost:
    
        if (r29[r5] > r14) goto L484;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x098c, code lost:
    
        r0.setVisible(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x095e, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0938, code lost:
    
        r13 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x055a, code lost:
    
        if ((r2 != null ? r2.getIndex() : -1) > r1) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0757, code lost:
    
        if (r8[r4] < r14) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x08a9, code lost:
    
        r21 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0301, code lost:
    
        r49 = r1;
        r11 = indexOfMinValue$default(r7, 0, 1, null);
        r1 = indexOfMaxValue(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x030e, code lost:
    
        if (r11 == r1) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0314, code lost:
    
        if (r7[r11] != r7[r1]) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0316, code lost:
    
        r11 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x031a, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x031b, code lost:
    
        r13 = r15[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x031e, code lost:
    
        if (r13 != (-1)) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0320, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0321, code lost:
    
        r13 = findPreviousItemIndex(r0, r13, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0325, code lost:
    
        if (r13 >= 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x035e, code lost:
    
        r28 = r7;
        r6 = r0.m971getSpanRangelOCCd4c(r0.getItemProvider(), r13, r11);
        r11 = r0.getLaneInfo();
        r49 = r1;
        r51 = r2;
        r1 = (int) (r6 & r18);
        r25 = r3;
        r2 = (int) (r6 >> 32);
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x037b, code lost:
    
        if (r3 == 1) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x037d, code lost:
    
        r14 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0380, code lost:
    
        r11.setLane(r13, r14);
        r11 = r0.getMeasuredItemProvider().m979getAndMeasurejy6DScQ(r13, r6);
        r7 = m975maxInRangejy6DScQ(r28, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0392, code lost:
    
        if (r3 == 1) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0394, code lost:
    
        r3 = r0.getLaneInfo().getGaps(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x039e, code lost:
    
        r6 = r2;
        r2 = r49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x03a1, code lost:
    
        if (r6 >= r1) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x03a3, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x03a7, code lost:
    
        if (r28[r6] == r7) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x03a9, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x03aa, code lost:
    
        r22[r6].addFirst(r11);
        r15[r6] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x03b1, code lost:
    
        if (r3 != null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x03b3, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x03b7, code lost:
    
        r28[r6] = (r11.getMainAxisSizeWithSpacings() + r7) + r1;
        r6 = r6 + 1;
        r1 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x03b5, code lost:
    
        r1 = r3[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x039d, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x037f, code lost:
    
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0327, code lost:
    
        if (r1 != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x032d, code lost:
    
        if (measure$lambda$0$misalignedStart(r15, r0, r7, r11) == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x032f, code lost:
    
        if (r52 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0331, code lost:
    
        r0.getLaneInfo().reset();
        r1 = r15.length;
        r2 = new int[r1];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x033c, code lost:
    
        if (r3 >= r1) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x033e, code lost:
    
        r2[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0344, code lost:
    
        r1 = r7.length;
        r3 = new int[r1];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0348, code lost:
    
        if (r4 >= r1) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x034a, code lost:
    
        r3[r4] = r7[r11];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0356, code lost:
    
        return measure(r0, r5, r2, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0317, code lost:
    
        r1 = r49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0899 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x07a8  */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r27v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v89, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final LazyStaggeredGridMeasureResult measure(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int[] iArr, int[] iArr2, boolean z) {
        int i2;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr3;
        int i8;
        int[] iArr4;
        int i9;
        int i10;
        boolean z2;
        int[] iArr5;
        int[] iArr6;
        float f;
        boolean z3;
        ut utVar;
        int i11;
        int[] iArr7;
        int[] iArr8;
        ArrayList arrayList;
        int size;
        int i12;
        int[] iArr9;
        int i13;
        float f2;
        int i14;
        int i15;
        int i16;
        boolean z4;
        List<Integer> list;
        int i17;
        int i18;
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo;
        int index;
        int min;
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo2;
        int i19;
        ut utVar2;
        int i20;
        int i21;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2;
        int i22;
        int[] iArr10;
        int[] iArr11;
        int i23;
        int i24;
        int i25;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext;
        LazyLayoutMeasureScope measureScope = lazyStaggeredGridMeasureContext3.getMeasureScope();
        int itemCount = lazyStaggeredGridMeasureContext3.getItemProvider().getItemCount();
        ut utVar3 = ut.d;
        if (itemCount <= 0 || lazyStaggeredGridMeasureContext3.getLaneCount() == 0) {
            int m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(lazyStaggeredGridMeasureContext3.m968getConstraintsmsEJaDk());
            int m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(lazyStaggeredGridMeasureContext3.m968getConstraintsmsEJaDk());
            lazyStaggeredGridMeasureContext3.getState().getItemAnimator$foundation().onMeasured(0, m7566getMinWidthimpl, m7565getMinHeightimpl, new ArrayList(), lazyStaggeredGridMeasureContext3.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasureContext3.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext3.isVertical(), measureScope.isLookingAhead(), lazyStaggeredGridMeasureContext3.getLaneCount(), lazyStaggeredGridMeasureContext3.isInLookaheadScope(), 0, 0, lazyStaggeredGridMeasureContext3.getCoroutineScope(), lazyStaggeredGridMeasureContext3.getGraphicsContext());
            if (!measureScope.isLookingAhead()) {
                long m923getMinSizeToFitDisappearingItemsYbymL2g = lazyStaggeredGridMeasureContext3.getState().getItemAnimator$foundation().m923getMinSizeToFitDisappearingItemsYbymL2g();
                if (!IntSize.m7780equalsimpl0(m923getMinSizeToFitDisappearingItemsYbymL2g, IntSize.Companion.m7787getZeroYbymL2g())) {
                    m7566getMinWidthimpl = ConstraintsKt.m7581constrainWidthK40F9xA(lazyStaggeredGridMeasureContext3.m968getConstraintsmsEJaDk(), (int) (m923getMinSizeToFitDisappearingItemsYbymL2g >> 32));
                    m7565getMinHeightimpl = ConstraintsKt.m7580constrainHeightK40F9xA(lazyStaggeredGridMeasureContext3.m968getConstraintsmsEJaDk(), (int) (m923getMinSizeToFitDisappearingItemsYbymL2g & 4294967295L));
                }
            }
            return new LazyStaggeredGridMeasureResult(iArr, iArr2, 0.0f, MeasureScope.layout$default(measureScope, m7566getMinWidthimpl, m7565getMinHeightimpl, null, new hz(16), 4, null), 0.0f, false, lazyStaggeredGridMeasureContext3.isVertical(), false, lazyStaggeredGridMeasureContext3.getResolvedSlots(), lazyStaggeredGridMeasureContext3.getItemProvider().getSpanProvider(), measureScope, itemCount, utVar3, IntSize.m7777constructorimpl((Constraints.m7566getMinWidthimpl(lazyStaggeredGridMeasureContext3.m968getConstraintsmsEJaDk()) << 32) | (Constraints.m7565getMinHeightimpl(lazyStaggeredGridMeasureContext3.m968getConstraintsmsEJaDk()) & 4294967295L)), -lazyStaggeredGridMeasureContext3.getBeforeContentPadding(), lazyStaggeredGridMeasureContext3.getAfterContentPadding() + lazyStaggeredGridMeasureContext3.getMainAxisAvailableSize(), lazyStaggeredGridMeasureContext3.getBeforeContentPadding(), lazyStaggeredGridMeasureContext3.getAfterContentPadding(), lazyStaggeredGridMeasureContext3.getMainAxisSpacing(), lazyStaggeredGridMeasureContext3.getCoroutineScope(), null);
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        int[] copyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        ensureIndicesInRange(lazyStaggeredGridMeasureContext3, copyOf, itemCount);
        offsetBy(copyOf2, -i);
        int laneCount = lazyStaggeredGridMeasureContext3.getLaneCount();
        qb[] qbVarArr = new qb[laneCount];
        int i26 = 0;
        for (int i27 = 0; i27 < laneCount; i27++) {
            qbVarArr[i27] = new qb(0);
        }
        offsetBy(copyOf2, -lazyStaggeredGridMeasureContext3.getBeforeContentPadding());
        boolean z5 = false;
        while (true) {
            if (!measure$lambda$0$hasSpaceBeforeFirst(copyOf, copyOf2, lazyStaggeredGridMeasureContext3)) {
                i2 = i26;
                j = 4294967295L;
                i3 = -1;
                break;
            }
            i3 = indexOfMaxValue(copyOf);
            j = 4294967295L;
            int i28 = copyOf[i3];
            int length = copyOf2.length;
            int i29 = i26;
            while (i29 < length) {
                int i30 = i26;
                if (copyOf[i29] != copyOf[i3]) {
                    int i31 = copyOf2[i29];
                    int i32 = copyOf2[i3];
                    if (i31 < i32) {
                        copyOf2[i29] = i32;
                    }
                }
                i29++;
                i26 = i30;
            }
            i2 = i26;
            int findPreviousItemIndex = findPreviousItemIndex(lazyStaggeredGridMeasureContext3, i28, i3);
            if (findPreviousItemIndex < 0) {
                break;
            }
            long m971getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext3.m971getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext3.getItemProvider(), findPreviousItemIndex, i3);
            int i33 = (int) (m971getSpanRangelOCCd4c & 4294967295L);
            int[] iArr12 = copyOf;
            int i34 = (int) (m971getSpanRangelOCCd4c >> 32);
            int i35 = i33 - i34;
            qb[] qbVarArr2 = qbVarArr;
            lazyStaggeredGridMeasureContext3.getLaneInfo().setLane(findPreviousItemIndex, i35 != 1 ? -2 : i34);
            LazyStaggeredGridMeasuredItem m979getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext3.getMeasuredItemProvider().m979getAndMeasurejy6DScQ(findPreviousItemIndex, m971getSpanRangelOCCd4c);
            int m975maxInRangejy6DScQ = m975maxInRangejy6DScQ(copyOf2, m971getSpanRangelOCCd4c);
            int[] gaps = i35 != 1 ? lazyStaggeredGridMeasureContext3.getLaneInfo().getGaps(findPreviousItemIndex) : null;
            while (i34 < i33) {
                iArr12[i34] = findPreviousItemIndex;
                int mainAxisSizeWithSpacings = m979getAndMeasurejy6DScQ.getMainAxisSizeWithSpacings() + m975maxInRangejy6DScQ + (gaps == null ? i2 : gaps[i34]);
                copyOf2[i34] = mainAxisSizeWithSpacings;
                if (lazyStaggeredGridMeasureContext3.getMainAxisAvailableSize() + mainAxisSizeWithSpacings <= 0) {
                    z5 = true;
                }
                i34++;
            }
            copyOf = iArr12;
            i26 = i2;
            qbVarArr = qbVarArr2;
        }
        qb[] qbVarArr3 = qbVarArr;
        int[] iArr13 = copyOf;
        int i36 = -lazyStaggeredGridMeasureContext3.getBeforeContentPadding();
        int i37 = copyOf2[i2];
        if (i37 < i36) {
            int i38 = i36 - i37;
            offsetBy(copyOf2, i38);
            i4 = i - i38;
        } else {
            i4 = i;
        }
        offsetBy(copyOf2, lazyStaggeredGridMeasureContext3.getBeforeContentPadding());
        int i39 = -1;
        if (i3 == -1) {
            int length2 = iArr13.length;
            int i40 = i2;
            while (true) {
                if (i40 >= length2) {
                    i40 = -1;
                    break;
                }
                if (iArr13[i40] == 0) {
                    break;
                }
                i40++;
            }
            i3 = i40;
            i39 = -1;
        }
        if (i3 != i39 && measure$lambda$0$misalignedStart(iArr13, lazyStaggeredGridMeasureContext3, copyOf2, i3) && z) {
            lazyStaggeredGridMeasureContext3.getLaneInfo().reset();
            int length3 = iArr13.length;
            int[] iArr14 = new int[length3];
            int i41 = i2;
            while (i41 < length3) {
                iArr14[i41] = i39;
                i41++;
                i39 = -1;
            }
            int length4 = copyOf2.length;
            int[] iArr15 = new int[length4];
            for (int i42 = i2; i42 < length4; i42++) {
                iArr15[i42] = copyOf2[i3];
            }
            return measure(lazyStaggeredGridMeasureContext3, i4, iArr14, iArr15, i2);
        }
        int[] copyOf3 = Arrays.copyOf(iArr13, iArr13.length);
        int length5 = copyOf2.length;
        int[] iArr16 = new int[length5];
        for (int i43 = 0; i43 < length5; i43++) {
            iArr16[i43] = -copyOf2[i43];
        }
        int mainAxisSpacing = lazyStaggeredGridMeasureContext3.getMainAxisSpacing() + i36;
        int afterContentPadding = lazyStaggeredGridMeasureContext3.getAfterContentPadding() + lazyStaggeredGridMeasureContext3.getMainAxisAvailableSize();
        if (afterContentPadding < 0) {
            afterContentPadding = 0;
        }
        boolean z6 = z5;
        int indexOfMinValue$default = indexOfMinValue$default(copyOf3, 0, 1, null);
        int i44 = 0;
        boolean z7 = z6;
        for (int i45 = -1; indexOfMinValue$default != i45 && i44 < lazyStaggeredGridMeasureContext3.getLaneCount(); i45 = -1) {
            int i46 = copyOf3[indexOfMinValue$default];
            int indexOfMinValue = indexOfMinValue(copyOf3, i46);
            i44++;
            if (i46 >= 0) {
                long m971getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext3.m971getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext3.getItemProvider(), i46, indexOfMinValue$default);
                ut utVar4 = utVar3;
                LazyStaggeredGridMeasuredItem m979getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext3.getMeasuredItemProvider().m979getAndMeasurejy6DScQ(i46, m971getSpanRangelOCCd4c2);
                LazyStaggeredGridLaneInfo laneInfo = lazyStaggeredGridMeasureContext3.getLaneInfo();
                int[] iArr17 = copyOf3;
                int[] iArr18 = copyOf2;
                int i47 = (int) (m971getSpanRangelOCCd4c2 & j);
                LazyLayoutMeasureScope lazyLayoutMeasureScope = measureScope;
                int i48 = itemCount;
                int i49 = (int) (m971getSpanRangelOCCd4c2 >> 32);
                int i50 = i47 - i49;
                if (i50 != 1) {
                    i25 = i49;
                    i49 = -2;
                } else {
                    i25 = i49;
                }
                laneInfo.setLane(i46, i49);
                int m975maxInRangejy6DScQ2 = m975maxInRangejy6DScQ(iArr16, m971getSpanRangelOCCd4c2);
                for (int i51 = i25; i51 < i47; i51++) {
                    iArr16[i51] = m979getAndMeasurejy6DScQ2.getMainAxisSizeWithSpacings() + m975maxInRangejy6DScQ2;
                    iArr17[i51] = i46;
                    qbVarArr3[i51].addLast(m979getAndMeasurejy6DScQ2);
                }
                if (m975maxInRangejy6DScQ2 < mainAxisSpacing && iArr16[i25] <= mainAxisSpacing) {
                    m979getAndMeasurejy6DScQ2.setVisible(false);
                    z7 = true;
                }
                i44 = i50 != 1 ? lazyStaggeredGridMeasureContext3.getLaneCount() : i44;
                indexOfMinValue$default = indexOfMinValue;
                utVar3 = utVar4;
                copyOf2 = iArr18;
                copyOf3 = iArr17;
                itemCount = i48;
                measureScope = lazyLayoutMeasureScope;
            } else {
                indexOfMinValue$default = indexOfMinValue;
            }
        }
        int[] iArr19 = copyOf3;
        int[] iArr20 = copyOf2;
        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = measureScope;
        int i52 = itemCount;
        ut utVar5 = utVar3;
        loop10: while (true) {
            int i53 = 0;
            while (true) {
                if (i53 < length5) {
                    int i54 = iArr16[i53];
                    if (i54 < afterContentPadding || i54 <= 0) {
                        break;
                    }
                    i53++;
                } else {
                    for (int i55 = 0; i55 < laneCount; i55++) {
                        if (!qbVarArr3[i55].isEmpty()) {
                            i5 = i52;
                            i6 = 1;
                            break loop10;
                        }
                    }
                }
            }
            i4 = i24;
            iArr19 = iArr10;
            laneCount = i23;
            lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext2;
            i52 = i5;
            iArr16 = iArr11;
            afterContentPadding = i22;
        }
        int i56 = 0;
        while (i56 < laneCount) {
            qb qbVar = qbVarArr3[i56];
            while (qbVar.size() > i6 && !((LazyStaggeredGridMeasuredItem) qbVar.first()).isVisible()) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) qbVar.removeFirst();
                int[] gaps2 = lazyStaggeredGridMeasuredItem.getSpan() != i6 ? lazyStaggeredGridMeasureContext3.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem.getIndex()) : null;
                iArr20[i56] = iArr20[i56] - (lazyStaggeredGridMeasuredItem.getMainAxisSizeWithSpacings() + (gaps2 == null ? 0 : gaps2[i56]));
                i6 = 1;
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) qbVar.c();
            iArr13[i56] = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getIndex() : -1;
            i56++;
            i6 = 1;
        }
        int[] iArr21 = iArr19;
        int length6 = iArr21.length;
        int i57 = 0;
        while (true) {
            if (i57 >= length6) {
                break;
            }
            if (iArr21[i57] == i5 - 1) {
                offsetBy(iArr16, -lazyStaggeredGridMeasureContext3.getMainAxisSpacing());
                break;
            }
            i57++;
        }
        int i58 = 0;
        while (true) {
            if (i58 >= length5) {
                int mainAxisAvailableSize = lazyStaggeredGridMeasureContext3.getMainAxisAvailableSize() - iArr16[indexOfMaxValue(iArr16)];
                int[] iArr22 = iArr20;
                offsetBy(iArr22, -mainAxisAvailableSize);
                offsetBy(iArr16, mainAxisAvailableSize);
                boolean z8 = false;
                loop33: while (true) {
                    int length7 = iArr22.length;
                    int i59 = 0;
                    while (true) {
                        if (i59 >= length7) {
                            break loop33;
                        }
                        if (iArr22[i59] < lazyStaggeredGridMeasureContext3.getBeforeContentPadding()) {
                            break;
                        }
                        i59++;
                    }
                    z8 = z2;
                    iArr22 = iArr4;
                    afterContentPadding = i10;
                    mainAxisAvailableSize = i9;
                }
                int i60 = mainAxisAvailableSize;
                i7 = afterContentPadding;
                iArr3 = iArr22;
                if (z8 && z) {
                    lazyStaggeredGridMeasureContext3.getLaneInfo().reset();
                    return measure(lazyStaggeredGridMeasureContext3, i4, iArr13, iArr3, false);
                }
                i8 = i4 + i60;
                int i61 = iArr3[indexOfMinValue$default(iArr3, 0, 1, null)];
                if (i61 < 0) {
                    i8 += i61;
                    offsetBy(iArr16, i61);
                    offsetBy(iArr3, -i61);
                }
            } else {
                if (iArr16[i58] >= lazyStaggeredGridMeasureContext3.getMainAxisAvailableSize()) {
                    i7 = afterContentPadding;
                    i8 = i4;
                    iArr3 = iArr20;
                    break;
                }
                i58++;
            }
        }
        float scrollToBeConsumed$foundation = lazyStaggeredGridMeasureContext3.getState().scrollToBeConsumed$foundation(lazyLayoutMeasureScope2.isLookingAhead());
        float f3 = (Integer.signum(Math.round(scrollToBeConsumed$foundation)) != Integer.signum(i8) || Math.abs(Math.round(scrollToBeConsumed$foundation)) < Math.abs(i8)) ? scrollToBeConsumed$foundation : i8;
        float f4 = scrollToBeConsumed$foundation - f3;
        float f5 = 0.0f;
        if (lazyLayoutMeasureScope2.isLookingAhead() && i8 > i4 && f4 <= 0.0f) {
            f5 = (i8 - i4) + f4;
        }
        int[] copyOf4 = Arrays.copyOf(iArr3, iArr3.length);
        int length8 = copyOf4.length;
        for (int i62 = 0; i62 < length8; i62++) {
            copyOf4[i62] = -copyOf4[i62];
        }
        if (lazyStaggeredGridMeasureContext3.getBeforeContentPadding() > lazyStaggeredGridMeasureContext3.getMainAxisSpacing()) {
            int i63 = 0;
            while (i63 < laneCount) {
                qb qbVar2 = qbVarArr3[i63];
                int size2 = qbVar2.size();
                int i64 = 0;
                while (true) {
                    if (i64 >= size2) {
                        i20 = i63;
                        break;
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = (LazyStaggeredGridMeasuredItem) qbVar2.get(i64);
                    i20 = i63;
                    int[] gaps3 = lazyStaggeredGridMeasureContext3.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem3.getIndex());
                    int mainAxisSizeWithSpacings2 = (gaps3 == null ? 0 : gaps3[i20]) + lazyStaggeredGridMeasuredItem3.getMainAxisSizeWithSpacings();
                    if (i64 != qbVar2.size() - 1 && (i21 = iArr3[i20]) != 0 && i21 >= mainAxisSizeWithSpacings2) {
                        iArr3[i20] = i21 - mainAxisSizeWithSpacings2;
                        i64++;
                        iArr13[i20] = ((LazyStaggeredGridMeasuredItem) qbVar2.get(i64)).getIndex();
                        i63 = i20;
                    }
                }
                i63 = i20 + 1;
            }
        }
        int afterContentPadding2 = lazyStaggeredGridMeasureContext3.getAfterContentPadding() + lazyStaggeredGridMeasureContext3.getBeforeContentPadding();
        int m7564getMaxWidthimpl = lazyStaggeredGridMeasureContext3.isVertical() ? Constraints.m7564getMaxWidthimpl(lazyStaggeredGridMeasureContext3.m968getConstraintsmsEJaDk()) : ConstraintsKt.m7581constrainWidthK40F9xA(lazyStaggeredGridMeasureContext3.m968getConstraintsmsEJaDk(), ac.j0(iArr16) + afterContentPadding2);
        int m7580constrainHeightK40F9xA = lazyStaggeredGridMeasureContext3.isVertical() ? ConstraintsKt.m7580constrainHeightK40F9xA(lazyStaggeredGridMeasureContext3.m968getConstraintsmsEJaDk(), ac.j0(iArr16) + afterContentPadding2) : Constraints.m7563getMaxHeightimpl(lazyStaggeredGridMeasureContext3.m968getConstraintsmsEJaDk());
        int afterContentPadding3 = lazyStaggeredGridMeasureContext3.getAfterContentPadding() + (Math.min(lazyStaggeredGridMeasureContext3.isVertical() ? m7580constrainHeightK40F9xA : m7564getMaxWidthimpl, lazyStaggeredGridMeasureContext3.getMainAxisAvailableSize()) - lazyStaggeredGridMeasureContext3.getBeforeContentPadding());
        int i65 = copyOf4[0];
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext3.getPinnedItems();
        int size3 = pinnedItems.size() - 1;
        if (size3 >= 0) {
            int i66 = size3;
            ut utVar6 = null;
            int i67 = i65;
            while (true) {
                int i68 = i66 - 1;
                int intValue = pinnedItems.get(i66).intValue();
                iArr5 = copyOf4;
                int lane = lazyStaggeredGridMeasureContext3.getLaneInfo().getLane(intValue);
                List<Integer> list2 = pinnedItems;
                if (lane != -2) {
                    i19 = -1;
                    if (lane != -1) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem4 = (LazyStaggeredGridMeasuredItem) qbVarArr3[lane].c();
                    }
                } else {
                    i19 = -1;
                }
                int i69 = 0;
                while (i69 < laneCount) {
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem5 = (LazyStaggeredGridMeasuredItem) qbVarArr3[i69].c();
                    if (lazyStaggeredGridMeasuredItem5 != null) {
                        i19 = lazyStaggeredGridMeasuredItem5.getIndex();
                    }
                    if (i19 <= intValue) {
                        iArr6 = iArr16;
                        f = f5;
                        z3 = false;
                        utVar2 = utVar6;
                        break;
                    }
                    i69++;
                    i19 = -1;
                }
                iArr6 = iArr16;
                f = f5;
                long m971getSpanRangelOCCd4c3 = lazyStaggeredGridMeasureContext3.m971getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext3.getItemProvider(), intValue, 0);
                ut utVar7 = utVar6;
                if (utVar6 == null) {
                    utVar7 = new ArrayList();
                }
                ut utVar8 = utVar7;
                LazyStaggeredGridMeasuredItem m979getAndMeasurejy6DScQ3 = lazyStaggeredGridMeasureContext3.getMeasuredItemProvider().m979getAndMeasurejy6DScQ(intValue, m971getSpanRangelOCCd4c3);
                i67 -= m979getAndMeasurejy6DScQ3.getMainAxisSizeWithSpacings();
                z3 = false;
                m979getAndMeasurejy6DScQ3.position(i67, 0, afterContentPadding3);
                utVar8.add(m979getAndMeasurejy6DScQ3);
                utVar2 = utVar8;
                if (i68 < 0) {
                    break;
                }
                copyOf4 = iArr5;
                pinnedItems = list2;
                i66 = i68;
                iArr16 = iArr6;
                f5 = f;
                utVar6 = utVar2;
            }
            utVar = utVar2;
        } else {
            iArr5 = copyOf4;
            iArr6 = iArr16;
            f = f5;
            z3 = false;
            utVar = null;
        }
        ut utVar9 = utVar == null ? utVar5 : utVar;
        int[] iArr23 = iArr5;
        boolean z9 = z3;
        int i70 = i7;
        List<LazyStaggeredGridMeasuredItem> calculateVisibleItems = calculateVisibleItems(lazyStaggeredGridMeasureContext3, qbVarArr3, iArr23, afterContentPadding3, i36, i70);
        int i71 = iArr23[z9 ? 1 : 0];
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem6 = (LazyStaggeredGridMeasuredItem) yi.w0(calculateVisibleItems);
        int index2 = lazyStaggeredGridMeasuredItem6 != null ? lazyStaggeredGridMeasuredItem6.getIndex() : -1;
        if (lazyLayoutMeasureScope2.isLookingAhead() && lazyStaggeredGridMeasureContext3.getApproachLayoutInfo() != null && !lazyStaggeredGridMeasureContext3.getApproachLayoutInfo().getVisibleItemsInfo().isEmpty()) {
            List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridMeasureContext3.getApproachLayoutInfo().getVisibleItemsInfo();
            int size4 = visibleItemsInfo.size() - 1;
            for (int i72 = -1; i72 < size4; i72 = -1) {
                if (visibleItemsInfo.get(size4).getIndex() > index2 && (size4 == 0 || visibleItemsInfo.get(size4 - 1).getIndex() <= index2)) {
                    lazyStaggeredGridItemInfo = visibleItemsInfo.get(size4);
                    break;
                }
                size4--;
            }
            lazyStaggeredGridItemInfo = null;
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo3 = (LazyStaggeredGridItemInfo) yi.v0(lazyStaggeredGridMeasureContext3.getApproachLayoutInfo().getVisibleItemsInfo());
            if (lazyStaggeredGridItemInfo != null && (index = lazyStaggeredGridItemInfo.getIndex()) <= (min = Math.min(lazyStaggeredGridItemInfo3.getIndex(), i5 - 1))) {
                arrayList = null;
                while (true) {
                    if (arrayList != null) {
                        int size5 = arrayList.size();
                        i11 = afterContentPadding2;
                        int i73 = 0;
                        while (i73 < size5) {
                            ArrayList arrayList2 = arrayList;
                            if (((LazyStaggeredGridMeasuredItem) arrayList.get(i73)).getIndex() == index) {
                                arrayList = arrayList2;
                                iArr7 = iArr3;
                                iArr8 = iArr13;
                                break;
                            }
                            i73++;
                            arrayList = arrayList2;
                        }
                    } else {
                        i11 = afterContentPadding2;
                    }
                    ArrayList arrayList3 = arrayList;
                    arrayList = arrayList3 == null ? new ArrayList() : arrayList3;
                    List<LazyStaggeredGridItemInfo> visibleItemsInfo2 = lazyStaggeredGridMeasureContext3.getApproachLayoutInfo().getVisibleItemsInfo();
                    int size6 = visibleItemsInfo2.size();
                    iArr8 = iArr13;
                    int i74 = 0;
                    while (true) {
                        if (i74 >= size6) {
                            lazyStaggeredGridItemInfo2 = null;
                            break;
                        }
                        lazyStaggeredGridItemInfo2 = visibleItemsInfo2.get(i74);
                        List<LazyStaggeredGridItemInfo> list3 = visibleItemsInfo2;
                        if (lazyStaggeredGridItemInfo2.getIndex() == index) {
                            break;
                        }
                        i74++;
                        visibleItemsInfo2 = list3;
                    }
                    LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo4 = lazyStaggeredGridItemInfo2;
                    int lane2 = lazyStaggeredGridItemInfo4 != null ? lazyStaggeredGridItemInfo4.getLane() : 0;
                    iArr7 = iArr3;
                    LazyStaggeredGridMeasuredItem m979getAndMeasurejy6DScQ4 = lazyStaggeredGridMeasureContext3.getMeasuredItemProvider().m979getAndMeasurejy6DScQ(index, lazyStaggeredGridMeasureContext3.m971getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext3.getItemProvider(), index, lane2));
                    arrayList.add(m979getAndMeasurejy6DScQ4);
                    int[] positions = lazyStaggeredGridMeasureContext3.getResolvedSlots().getPositions();
                    m979getAndMeasurejy6DScQ4.position(i71, positions.length > lane2 ? positions[lane2] : 0, afterContentPadding3);
                    i71 = m979getAndMeasurejy6DScQ4.getMainAxisSizeWithSpacings() + i71;
                    if (index == min) {
                        break;
                    }
                    index++;
                    afterContentPadding2 = i11;
                    iArr13 = iArr8;
                    iArr3 = iArr7;
                }
                List<Integer> pinnedItems2 = lazyStaggeredGridMeasureContext3.getPinnedItems();
                size = pinnedItems2.size();
                ut utVar10 = null;
                i12 = 0;
                while (i12 < size) {
                    int intValue2 = pinnedItems2.get(i12).intValue();
                    if (intValue2 >= i5) {
                        list = pinnedItems2;
                    } else {
                        if (arrayList != null) {
                            int size7 = arrayList.size();
                            list = pinnedItems2;
                            int i75 = 0;
                            while (i75 < size7) {
                                int i76 = i75;
                                if (((LazyStaggeredGridMeasuredItem) arrayList.get(i75)).getIndex() == intValue2) {
                                    break;
                                }
                                i75 = i76 + 1;
                            }
                        } else {
                            list = pinnedItems2;
                        }
                        int lane3 = lazyStaggeredGridMeasureContext3.getLaneInfo().getLane(intValue2);
                        if (lane3 != -2 && lane3 != -1) {
                        }
                        int length9 = iArr21.length;
                        int i77 = 0;
                        while (i77 < length9) {
                            int i78 = length9;
                            if (iArr21[i77] < intValue2) {
                                i77++;
                                length9 = i78;
                            }
                        }
                        i17 = size;
                        long m971getSpanRangelOCCd4c4 = lazyStaggeredGridMeasureContext3.m971getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext3.getItemProvider(), intValue2, 0);
                        utVar10 = utVar10;
                        if (utVar10 == null) {
                            utVar10 = new ArrayList();
                        }
                        i18 = i5;
                        LazyStaggeredGridMeasuredItem m979getAndMeasurejy6DScQ5 = lazyStaggeredGridMeasureContext3.getMeasuredItemProvider().m979getAndMeasurejy6DScQ(intValue2, m971getSpanRangelOCCd4c4);
                        m979getAndMeasurejy6DScQ5.position(i71, 0, afterContentPadding3);
                        int mainAxisSizeWithSpacings3 = m979getAndMeasurejy6DScQ5.getMainAxisSizeWithSpacings() + i71;
                        utVar10.add(m979getAndMeasurejy6DScQ5);
                        i71 = mainAxisSizeWithSpacings3;
                        i12++;
                        pinnedItems2 = list;
                        size = i17;
                        i5 = i18;
                        utVar10 = utVar10;
                    }
                    i17 = size;
                    i18 = i5;
                    i12++;
                    pinnedItems2 = list;
                    size = i17;
                    i5 = i18;
                    utVar10 = utVar10;
                }
                int i79 = i5;
                ut utVar11 = utVar10 != null ? utVar5 : utVar10;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(utVar9);
                arrayList4.addAll(calculateVisibleItems);
                if (arrayList != null) {
                    arrayList4.addAll(arrayList);
                }
                arrayList4.addAll(utVar11);
                LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> itemAnimator$foundation = lazyStaggeredGridMeasureContext3.getState().getItemAnimator$foundation();
                int i80 = (int) f3;
                LazyLayoutKeyIndexMap keyIndexMap = lazyStaggeredGridMeasureContext3.getMeasuredItemProvider().getKeyIndexMap();
                LazyStaggeredGridMeasureProvider measuredItemProvider = lazyStaggeredGridMeasureContext3.getMeasuredItemProvider();
                boolean isVertical = lazyStaggeredGridMeasureContext3.isVertical();
                int laneCount2 = lazyStaggeredGridMeasureContext3.getLaneCount();
                boolean isLookingAhead = lazyLayoutMeasureScope2.isLookingAhead();
                boolean isInLookaheadScope = lazyStaggeredGridMeasureContext3.isInLookaheadScope();
                iArr9 = iArr7;
                if (iArr9.length != 0) {
                    o.q();
                    return null;
                }
                int i81 = iArr9[0];
                int length10 = iArr9.length - 1;
                if (1 <= length10) {
                    int i82 = i81;
                    int i83 = 1;
                    while (true) {
                        int i84 = iArr9[i83];
                        if (i82 > i84) {
                            i82 = i84;
                        }
                        if (i83 == length10) {
                            break;
                        }
                        i83++;
                    }
                    i13 = i82;
                } else {
                    i13 = i81;
                }
                itemAnimator$foundation.onMeasured(i80, m7564getMaxWidthimpl, m7580constrainHeightK40F9xA, arrayList4, keyIndexMap, measuredItemProvider, isVertical, isLookingAhead, laneCount2, isInLookaheadScope, i13, ac.j0(iArr6) + i11, lazyStaggeredGridMeasureContext3.getCoroutineScope(), lazyStaggeredGridMeasureContext3.getGraphicsContext());
                if (!lazyLayoutMeasureScope2.isLookingAhead()) {
                    long m923getMinSizeToFitDisappearingItemsYbymL2g2 = lazyStaggeredGridMeasureContext3.getState().getItemAnimator$foundation().m923getMinSizeToFitDisappearingItemsYbymL2g();
                    if (!IntSize.m7780equalsimpl0(m923getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.Companion.m7787getZeroYbymL2g())) {
                        int i85 = lazyStaggeredGridMeasureContext3.isVertical() ? m7580constrainHeightK40F9xA : m7564getMaxWidthimpl;
                        f2 = f3;
                        i14 = ConstraintsKt.m7581constrainWidthK40F9xA(lazyStaggeredGridMeasureContext3.m968getConstraintsmsEJaDk(), Math.max(m7564getMaxWidthimpl, (int) (m923getMinSizeToFitDisappearingItemsYbymL2g2 >> 32)));
                        int m7580constrainHeightK40F9xA2 = ConstraintsKt.m7580constrainHeightK40F9xA(lazyStaggeredGridMeasureContext3.m968getConstraintsmsEJaDk(), Math.max(m7580constrainHeightK40F9xA, (int) (m923getMinSizeToFitDisappearingItemsYbymL2g2 & j)));
                        int i86 = lazyStaggeredGridMeasureContext3.isVertical() ? m7580constrainHeightK40F9xA2 : i14;
                        if (i86 != i85) {
                            int size8 = arrayList4.size();
                            for (int i87 = 0; i87 < size8; i87++) {
                                ((LazyStaggeredGridMeasuredItem) arrayList4.get(i87)).updateMainAxisLayoutSize(i86);
                            }
                        }
                        i15 = m7580constrainHeightK40F9xA2;
                        i16 = 0;
                        while (true) {
                            if (i16 < length5) {
                                for (int i88 : iArr21) {
                                    if (i88 >= i79 - 1) {
                                        z4 = false;
                                        break;
                                    }
                                }
                            } else {
                                if (iArr6[i16] > lazyStaggeredGridMeasureContext3.getMainAxisAvailableSize()) {
                                    break;
                                }
                                i16++;
                            }
                        }
                        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext4 = lazyStaggeredGridMeasureContext3;
                        int i89 = i14;
                        return new LazyStaggeredGridMeasureResult(iArr8, iArr9, f2, MeasureScope.layout$default(lazyLayoutMeasureScope2, i89, i15, null, new f1(lazyStaggeredGridMeasureContext3, arrayList4, lazyLayoutMeasureScope2, 12), 4, null), f, z4, lazyStaggeredGridMeasureContext4.isVertical(), z7, lazyStaggeredGridMeasureContext4.getResolvedSlots(), lazyStaggeredGridMeasureContext4.getItemProvider().getSpanProvider(), lazyLayoutMeasureScope2, i79, calculateVisibleItems, IntSize.m7777constructorimpl((i89 << 32) | (i15 & j)), i36, i70, lazyStaggeredGridMeasureContext4.getBeforeContentPadding(), lazyStaggeredGridMeasureContext4.getAfterContentPadding(), lazyStaggeredGridMeasureContext4.getMainAxisSpacing(), lazyStaggeredGridMeasureContext4.getCoroutineScope(), null);
                    }
                }
                f2 = f3;
                i14 = m7564getMaxWidthimpl;
                i15 = m7580constrainHeightK40F9xA;
                i16 = 0;
                while (true) {
                    if (i16 < length5) {
                    }
                    i16++;
                }
                LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext42 = lazyStaggeredGridMeasureContext3;
                int i892 = i14;
                return new LazyStaggeredGridMeasureResult(iArr8, iArr9, f2, MeasureScope.layout$default(lazyLayoutMeasureScope2, i892, i15, null, new f1(lazyStaggeredGridMeasureContext3, arrayList4, lazyLayoutMeasureScope2, 12), 4, null), f, z4, lazyStaggeredGridMeasureContext42.isVertical(), z7, lazyStaggeredGridMeasureContext42.getResolvedSlots(), lazyStaggeredGridMeasureContext42.getItemProvider().getSpanProvider(), lazyLayoutMeasureScope2, i79, calculateVisibleItems, IntSize.m7777constructorimpl((i892 << 32) | (i15 & j)), i36, i70, lazyStaggeredGridMeasureContext42.getBeforeContentPadding(), lazyStaggeredGridMeasureContext42.getAfterContentPadding(), lazyStaggeredGridMeasureContext42.getMainAxisSpacing(), lazyStaggeredGridMeasureContext42.getCoroutineScope(), null);
            }
        }
        i11 = afterContentPadding2;
        iArr7 = iArr3;
        iArr8 = iArr13;
        arrayList = null;
        List<Integer> pinnedItems22 = lazyStaggeredGridMeasureContext3.getPinnedItems();
        size = pinnedItems22.size();
        ut utVar102 = null;
        i12 = 0;
        while (i12 < size) {
        }
        int i792 = i5;
        if (utVar102 != null) {
        }
        ArrayList arrayList42 = new ArrayList();
        arrayList42.addAll(utVar9);
        arrayList42.addAll(calculateVisibleItems);
        if (arrayList != null) {
        }
        arrayList42.addAll(utVar11);
        LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> itemAnimator$foundation2 = lazyStaggeredGridMeasureContext3.getState().getItemAnimator$foundation();
        int i802 = (int) f3;
        LazyLayoutKeyIndexMap keyIndexMap2 = lazyStaggeredGridMeasureContext3.getMeasuredItemProvider().getKeyIndexMap();
        LazyStaggeredGridMeasureProvider measuredItemProvider2 = lazyStaggeredGridMeasureContext3.getMeasuredItemProvider();
        boolean isVertical2 = lazyStaggeredGridMeasureContext3.isVertical();
        int laneCount22 = lazyStaggeredGridMeasureContext3.getLaneCount();
        boolean isLookingAhead2 = lazyLayoutMeasureScope2.isLookingAhead();
        boolean isInLookaheadScope2 = lazyStaggeredGridMeasureContext3.isInLookaheadScope();
        iArr9 = iArr7;
        if (iArr9.length != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure$lambda$0$0(Placeable.PlacementScope placementScope) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure$lambda$0$37(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, List list, LazyLayoutMeasureScope lazyLayoutMeasureScope, Placeable.PlacementScope placementScope) {
        placementScope.withMotionFrameOfReferencePlacement(new f1(list, lazyStaggeredGridMeasureContext, lazyLayoutMeasureScope, 11));
        ObservableScopeInvalidator.m939attachToScopeimpl(lazyStaggeredGridMeasureContext.getState().m983getPlacementScopeInvalidatorzYiylxw$foundation());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure$lambda$0$37$0(List list, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, LazyLayoutMeasureScope lazyLayoutMeasureScope, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((LazyStaggeredGridMeasuredItem) list.get(i)).place(placementScope, lazyStaggeredGridMeasureContext, lazyLayoutMeasureScope.isLookingAhead());
        }
        return w01.a;
    }

    private static final boolean measure$lambda$0$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$0$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    /* renamed from: measureStaggeredGrid-C6celF4, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m976measureStaggeredGridC6celF4(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j, boolean z, boolean z2, long j2, int i, int i2, int i3, int i4, un unVar, boolean z3, boolean z4, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext) {
        int m975maxInRangejy6DScQ;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j, z, lazyLayoutMeasureScope, i, j2, i3, i4, z2, i2, unVar, z3, z4, lazyStaggeredGridLayoutInfo, graphicsContext, null);
        int[] updateScrollPositionIfTheFirstItemWasMoved$foundation = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition$foundation().getIndices());
        int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition$foundation().getScrollOffsets();
        if (updateScrollPositionIfTheFirstItemWasMoved$foundation.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr = new int[laneCount];
            int i5 = 0;
            while (i5 < laneCount) {
                if (i5 >= updateScrollPositionIfTheFirstItemWasMoved$foundation.length || (m975maxInRangejy6DScQ = updateScrollPositionIfTheFirstItemWasMoved$foundation[i5]) == -1) {
                    m975maxInRangejy6DScQ = i5 == 0 ? 0 : m975maxInRangejy6DScQ(iArr, SpanRange.m985constructorimpl(0, i5)) + 1;
                }
                iArr[i5] = m975maxInRangejy6DScQ;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i5], i5);
                i5++;
            }
            updateScrollPositionIfTheFirstItemWasMoved$foundation = iArr;
        }
        if (scrollOffsets.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr2 = new int[laneCount2];
            int i6 = 0;
            while (i6 < laneCount2) {
                iArr2[i6] = i6 < scrollOffsets.length ? scrollOffsets[i6] : i6 == 0 ? 0 : iArr2[i6 - 1];
                i6++;
            }
            scrollOffsets = iArr2;
        }
        return measure(lazyStaggeredGridMeasureContext, Math.round(lazyStaggeredGridState.scrollToBeConsumed$foundation(z4)), updateScrollPositionIfTheFirstItemWasMoved$foundation, scrollOffsets, true);
    }

    private static final void offsetBy(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    private static final int[] transform(int[] iArr, ky kyVar) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) kyVar.invoke(Integer.valueOf(iArr[i]))).intValue();
        }
        return iArr;
    }

    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, ky kyVar) {
        return (T) kyVar.invoke(lazyLayoutMeasureScope);
    }

    private static final void debugLog(iy iyVar) {
    }
}
