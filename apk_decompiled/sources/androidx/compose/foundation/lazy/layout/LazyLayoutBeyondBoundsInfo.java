package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.collection.MutableVector;
import defpackage.fc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsInfo {
    public static final int $stable = MutableVector.$stable;
    private final MutableVector<Interval> beyondBoundsItems = new MutableVector<>(new Interval[16], 0);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Interval {
        public static final int $stable = 0;
        private final int end;
        private final int start;

        public Interval(int i, int i2) {
            this.start = i;
            this.end = i2;
            if (!(i >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("negative start index");
            }
            if (i2 >= i) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("end index greater than start");
        }

        public static /* synthetic */ Interval copy$default(Interval interval, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = interval.start;
            }
            if ((i3 & 2) != 0) {
                i2 = interval.end;
            }
            return interval.copy(i, i2);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final Interval copy(int i, int i2) {
            return new Interval(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.start == interval.start && this.end == interval.end;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return Integer.hashCode(this.end) + (Integer.hashCode(this.start) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Interval(start=");
            sb.append(this.start);
            sb.append(", end=");
            return fc.e(sb, this.end, ')');
        }
    }

    public final Interval addInterval(int i, int i2) {
        Interval interval = new Interval(i, i2);
        this.beyondBoundsItems.add(interval);
        return interval;
    }

    public final int getEnd() {
        int end = this.beyondBoundsItems.first().getEnd();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        Interval[] intervalArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            Interval interval = intervalArr[i];
            if (interval.getEnd() > end) {
                end = interval.getEnd();
            }
        }
        return end;
    }

    public final int getStart() {
        int start = this.beyondBoundsItems.first().getStart();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        Interval[] intervalArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            Interval interval = intervalArr[i];
            if (interval.getStart() < start) {
                start = interval.getStart();
            }
        }
        if (!(start >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("negative minIndex");
        }
        return start;
    }

    public final boolean hasIntervals() {
        return this.beyondBoundsItems.getSize() != 0;
    }

    public final void removeInterval(Interval interval) {
        this.beyondBoundsItems.remove(interval);
    }
}
