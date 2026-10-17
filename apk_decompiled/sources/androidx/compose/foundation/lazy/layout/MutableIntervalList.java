package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import defpackage.kp0;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MutableIntervalList<T> implements IntervalList<T> {
    public static final int $stable = 8;
    private final MutableVector<IntervalList.Interval<T>> intervals = new MutableVector<>(new IntervalList.Interval[16], 0);
    private IntervalList.Interval<? extends T> lastInterval;
    private int size;

    private final void checkIndexBounds(int i) {
        if (i < 0 || i >= getSize()) {
            StringBuilder f = kp0.f(i, "Index ", ", size ");
            f.append(getSize());
            InlineClassHelperKt.throwIndexOutOfBoundsException(f.toString());
        }
    }

    private final boolean contains(IntervalList.Interval<? extends T> interval, int i) {
        return i < interval.getSize() + interval.getStartIndex() && interval.getStartIndex() <= i;
    }

    private final IntervalList.Interval<T> getIntervalForIndex(int i) {
        int binarySearch;
        IntervalList.Interval<? extends T> interval = this.lastInterval;
        if (interval != null && contains(interval, i)) {
            return interval;
        }
        MutableVector<IntervalList.Interval<T>> mutableVector = this.intervals;
        binarySearch = IntervalListKt.binarySearch(mutableVector, i);
        IntervalList.Interval interval2 = (IntervalList.Interval<? extends T>) mutableVector.content[binarySearch];
        this.lastInterval = interval2;
        return interval2;
    }

    public final void addInterval(int i, T t) {
        if (i < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        IntervalList.Interval<T> interval = new IntervalList.Interval<>(getSize(), i, t);
        this.size = getSize() + i;
        this.intervals.add(interval);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public void forEach(int i, int i2, ky kyVar) {
        int binarySearch;
        if (i < 0 || i >= getSize()) {
            StringBuilder f = kp0.f(i, "Index ", ", size ");
            f.append(getSize());
            InlineClassHelperKt.throwIndexOutOfBoundsException(f.toString());
        }
        if (i2 < 0 || i2 >= getSize()) {
            StringBuilder f2 = kp0.f(i2, "Index ", ", size ");
            f2.append(getSize());
            InlineClassHelperKt.throwIndexOutOfBoundsException(f2.toString());
        }
        if (!(i2 >= i)) {
            InlineClassHelperKt.throwIllegalArgumentException("toIndex (" + i2 + ") should be not smaller than fromIndex (" + i + ')');
        }
        binarySearch = IntervalListKt.binarySearch(this.intervals, i);
        int startIndex = this.intervals.content[binarySearch].getStartIndex();
        while (startIndex <= i2) {
            IntervalList.Interval<T> interval = this.intervals.content[binarySearch];
            kyVar.invoke(interval);
            startIndex += interval.getSize();
            binarySearch++;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public IntervalList.Interval<T> get(int i) {
        if (i < 0 || i >= getSize()) {
            StringBuilder f = kp0.f(i, "Index ", ", size ");
            f.append(getSize());
            InlineClassHelperKt.throwIndexOutOfBoundsException(f.toString());
        }
        return getIntervalForIndex(i);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public int getSize() {
        return this.size;
    }
}
