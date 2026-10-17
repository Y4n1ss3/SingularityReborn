package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import defpackage.ac;
import defpackage.dq;
import defpackage.qb;
import defpackage.y80;
import defpackage.yi;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridLaneInfo {
    public static final int LaneFullSpan = -2;
    public static final int LaneUnset = -1;
    private static final int MaxCapacity = 131072;
    private int anchor;
    private int[] lanes = new int[16];
    private final qb spannedItems = new qb();
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SpannedItem {
        private int[] gaps;
        private final int index;

        public SpannedItem(int i, int[] iArr) {
            this.index = i;
            this.gaps = iArr;
        }

        public final int[] getGaps() {
            return this.gaps;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setGaps(int[] iArr) {
            this.gaps = iArr;
        }
    }

    private final void ensureCapacity(int i, int i2) {
        if (i > 131072) {
            InlineClassHelperKt.throwIllegalArgumentException("Requested item capacity " + i + " is larger than max supported: 131072!");
        }
        int[] iArr = this.lanes;
        if (iArr.length < i) {
            int length = iArr.length;
            while (length < i) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            ac.S(this.lanes, iArr2, i2, 0, 12);
            this.lanes = iArr2;
        }
    }

    public static /* synthetic */ void ensureCapacity$default(LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        lazyStaggeredGridLaneInfo.ensureCapacity(i, i2);
    }

    public final boolean assignedToLane(int i, int i2) {
        int lane = getLane(i);
        return lane == i2 || lane == -1 || lane == -2;
    }

    public final void ensureValidIndex(int i) {
        int i2 = this.anchor;
        int i3 = i - i2;
        if (i3 < 0 || i3 >= 131072) {
            int max = Math.max(i - (this.lanes.length / 2), 0);
            this.anchor = max;
            int i4 = max - i2;
            int[] iArr = this.lanes;
            if (i4 >= 0) {
                if (i4 < iArr.length) {
                    ac.O(iArr, iArr, 0, i4, iArr.length);
                }
                int[] iArr2 = this.lanes;
                Arrays.fill(iArr2, Math.max(0, iArr2.length - i4), this.lanes.length, 0);
            } else {
                int i5 = -i4;
                if (iArr.length + i5 < 131072) {
                    ensureCapacity(iArr.length + i5 + 1, i5);
                } else {
                    if (i5 < iArr.length) {
                        ac.O(iArr, iArr, i5, 0, iArr.length - i5);
                    }
                    int[] iArr3 = this.lanes;
                    Arrays.fill(iArr3, 0, Math.min(iArr3.length, i5), 0);
                }
            }
        } else {
            ensureCapacity$default(this, i3 + 1, 0, 2, null);
        }
        while (!this.spannedItems.isEmpty() && ((SpannedItem) this.spannedItems.first()).getIndex() < lowerBound()) {
            this.spannedItems.removeFirst();
        }
        while (!this.spannedItems.isEmpty() && ((SpannedItem) this.spannedItems.last()).getIndex() > upperBound()) {
            this.spannedItems.removeLast();
        }
    }

    public final int findNextItemIndex(int i, int i2) {
        int upperBound = upperBound();
        for (int i3 = i + 1; i3 < upperBound; i3++) {
            if (assignedToLane(i3, i2)) {
                return i3;
            }
        }
        return upperBound();
    }

    public final int findPreviousItemIndex(int i, int i2) {
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!assignedToLane(i, i2));
        return i;
    }

    public final int[] getGaps(int i) {
        qb qbVar = this.spannedItems;
        SpannedItem spannedItem = (SpannedItem) yi.r0(this.spannedItems, y80.c(qbVar.size(), new LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1(Integer.valueOf(i)), qbVar));
        if (spannedItem != null) {
            return spannedItem.getGaps();
        }
        return null;
    }

    public final int getLane(int i) {
        if (i < lowerBound() || i >= upperBound()) {
            return -1;
        }
        return this.lanes[i - this.anchor] - 1;
    }

    public final int lowerBound() {
        return this.anchor;
    }

    public final void reset() {
        ac.Y(this.lanes, 0, 0, 6);
        this.spannedItems.clear();
    }

    public final void setGaps(int i, int[] iArr) {
        qb qbVar = this.spannedItems;
        int c = y80.c(qbVar.size(), new LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1(Integer.valueOf(i)), qbVar);
        if (c < 0) {
            if (iArr == null) {
                return;
            }
            this.spannedItems.add(-(c + 1), new SpannedItem(i, iArr));
            return;
        }
        qb qbVar2 = this.spannedItems;
        if (iArr == null) {
            qbVar2.remove(c);
        } else {
            ((SpannedItem) qbVar2.get(c)).setGaps(iArr);
        }
    }

    public final void setLane(int i, int i2) {
        if (!(i >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Negative lanes are not supported");
        }
        ensureValidIndex(i);
        this.lanes[i - this.anchor] = i2 + 1;
    }

    public final int upperBound() {
        return this.anchor + this.lanes.length;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }
}
