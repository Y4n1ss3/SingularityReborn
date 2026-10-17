package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import defpackage.k10;
import defpackage.ut;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsStateKt {
    public static final List<Integer> calculateLazyLayoutPinnedIndices(LazyLayoutItemProvider lazyLayoutItemProvider, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo) {
        k10 k10Var;
        if (!lazyLayoutBeyondBoundsInfo.hasIntervals() && lazyLayoutPinnedItemList.isEmpty()) {
            return ut.d;
        }
        ArrayList arrayList = new ArrayList();
        if (lazyLayoutBeyondBoundsInfo.hasIntervals()) {
            k10Var = new k10(lazyLayoutBeyondBoundsInfo.getStart(), Math.min(lazyLayoutBeyondBoundsInfo.getEnd(), lazyLayoutItemProvider.getItemCount() - 1), 1);
        } else {
            k10 k10Var2 = k10.g;
            k10Var = k10.g;
        }
        int size = lazyLayoutPinnedItemList.size();
        for (int i = 0; i < size; i++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = lazyLayoutPinnedItemList.get(i);
            int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            int i2 = k10Var.d;
            if ((findIndexByKey > k10Var.e || i2 > findIndexByKey) && findIndexByKey >= 0 && findIndexByKey < lazyLayoutItemProvider.getItemCount()) {
                arrayList.add(Integer.valueOf(findIndexByKey));
            }
        }
        int i3 = k10Var.d;
        int i4 = k10Var.e;
        if (i3 <= i4) {
            while (true) {
                arrayList.add(Integer.valueOf(i3));
                if (i3 == i4) {
                    break;
                }
                i3++;
            }
        }
        return arrayList;
    }
}
