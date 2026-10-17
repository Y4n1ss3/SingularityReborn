package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.unit.IntOffset;
import defpackage.e10;
import defpackage.iy;
import defpackage.ky;
import defpackage.ut;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutStickyItemsKt {
    private static final boolean Debug = false;

    public static final <T extends LazyLayoutMeasuredItem> List<T> applyStickyItems(StickyItemsPlacement stickyItemsPlacement, int i, int i2, List<T> list, e10 e10Var, int i3, int i4, int i5, int i6, ky kyVar) {
        StickyItemsPlacement stickyItemsPlacement2 = stickyItemsPlacement;
        if (stickyItemsPlacement2 == null || list.isEmpty() || e10Var.b == 0) {
            return ut.d;
        }
        e10 stickingIndices = stickyItemsPlacement2.getStickingIndices(i, i2, e10Var);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            T t = list.get(i7);
            int index = t.getIndex();
            int[] iArr = e10Var.a;
            int i8 = e10Var.b;
            int i9 = 0;
            while (true) {
                if (i9 >= i8) {
                    break;
                }
                if (iArr[i9] == index) {
                    arrayList2.add(t);
                    break;
                }
                i9++;
            }
        }
        int[] iArr2 = stickingIndices.a;
        int i10 = stickingIndices.b;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = iArr2[i11];
            Iterator<T> it = list.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                if (it.next().getIndex() == i12) {
                    break;
                }
                i13++;
            }
            T remove = i13 == -1 ? (LazyLayoutMeasuredItem) kyVar.invoke(Integer.valueOf(i12)) : list.remove(i13);
            ArrayList arrayList3 = arrayList2;
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem = remove;
            int calculateStickingItemOffset = stickyItemsPlacement2.calculateStickingItemOffset(arrayList3, i12, remove.getMainAxisSizeWithSpacings(), i13 == -1 ? Integer.MIN_VALUE : getMainAxisOffset(remove), i3, i4, i5, i6);
            lazyLayoutMeasuredItem.setNonScrollableItem(true);
            lazyLayoutMeasuredItem.position(calculateStickingItemOffset, 0, i5, i6);
            arrayList.add(lazyLayoutMeasuredItem);
            i11++;
            stickyItemsPlacement2 = stickyItemsPlacement;
            arrayList2 = arrayList3;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long mo871getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo871getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.isVertical() ? IntOffset.m7740getYimpl(mo871getOffsetBjo55l4) : IntOffset.m7739getXimpl(mo871getOffsetBjo55l4);
    }

    private static final void debugLog(iy iyVar) {
    }
}
