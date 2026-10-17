package androidx.compose.foundation.lazy.grid;

import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridMeasuredLine {
    public static final int $stable = 8;
    private final int index;
    private final boolean isVertical;
    private final LazyGridMeasuredItem[] items;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;
    private final LazyGridSlots slots;
    private final List<GridItemSpan> spans;

    public LazyGridMeasuredLine(int i, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, LazyGridSlots lazyGridSlots, List<GridItemSpan> list, boolean z, int i2) {
        this.index = i;
        this.items = lazyGridMeasuredItemArr;
        this.slots = lazyGridSlots;
        this.spans = list;
        this.isVertical = z;
        this.mainAxisSpacing = i2;
        int i3 = 0;
        for (LazyGridMeasuredItem lazyGridMeasuredItem : lazyGridMeasuredItemArr) {
            i3 = Math.max(i3, lazyGridMeasuredItem.getMainAxisSize());
        }
        this.mainAxisSize = i3;
        int i4 = i3 + this.mainAxisSpacing;
        this.mainAxisSizeWithSpacings = i4 >= 0 ? i4 : 0;
    }

    public final int getIndex() {
        return this.index;
    }

    public final LazyGridMeasuredItem[] getItems() {
        return this.items;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean isEmpty() {
        return this.items.length == 0;
    }

    public final LazyGridMeasuredItem[] position(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = this.items;
        int length = lazyGridMeasuredItemArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < length) {
            LazyGridMeasuredItem lazyGridMeasuredItem = lazyGridMeasuredItemArr[i8];
            int i11 = i9 + 1;
            int m882getCurrentLineSpanimpl = GridItemSpan.m882getCurrentLineSpanimpl(this.spans.get(i9).m885unboximpl());
            int i12 = this.slots.getPositions()[i10];
            boolean z = this.isVertical;
            int i13 = z ? this.index : i10;
            if (z) {
                i4 = i10;
                i7 = i;
                i5 = i2;
                i6 = i3;
            } else {
                i4 = this.index;
                i5 = i2;
                i6 = i3;
                i7 = i;
            }
            lazyGridMeasuredItem.position(i7, i12, i5, i6, i13, i4);
            i10 += m882getCurrentLineSpanimpl;
            i8++;
            i9 = i11;
        }
        return this.items;
    }
}
