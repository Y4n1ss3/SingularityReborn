package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.unit.IntOffset;
import defpackage.cj;
import defpackage.q10;
import defpackage.ut;
import defpackage.y5;
import defpackage.yi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutMeasuredItemKt {
    private static final Comparator<LazyLayoutMeasuredItem> LazyLayoutMeasuredItemIndexComparator = new y5(4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LazyLayoutMeasuredItemIndexComparator$lambda$0(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, LazyLayoutMeasuredItem lazyLayoutMeasuredItem2) {
        return q10.h(lazyLayoutMeasuredItem.getIndex(), lazyLayoutMeasuredItem2.getIndex());
    }

    private static final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long mo871getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo871getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.isVertical() ? IntOffset.m7740getYimpl(mo871getOffsetBjo55l4) : IntOffset.m7739getXimpl(mo871getOffsetBjo55l4);
    }

    public static final <T extends LazyLayoutMeasuredItem> List<T> updatedVisibleItems(int i, int i2, List<? extends T> list, List<? extends T> list2) {
        if (list.isEmpty()) {
            return ut.d;
        }
        ArrayList J0 = yi.J0(list2);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            int index = t.getIndex();
            if (i <= index && index <= i2) {
                J0.add(t);
            }
        }
        cj.b0(J0, LazyLayoutMeasuredItemIndexComparator);
        return J0;
    }
}
