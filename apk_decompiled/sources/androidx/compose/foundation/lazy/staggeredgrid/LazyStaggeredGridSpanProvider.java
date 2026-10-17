package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridSpanProvider {
    public static final int $stable = 8;
    private final IntervalList<LazyStaggeredGridInterval> intervals;

    public LazyStaggeredGridSpanProvider(IntervalList<LazyStaggeredGridInterval> intervalList) {
        this.intervals = intervalList;
    }

    public final IntervalList<LazyStaggeredGridInterval> getIntervals() {
        return this.intervals;
    }

    public final boolean isFullSpan(int i) {
        if (i >= 0 && i < this.intervals.getSize()) {
            IntervalList.Interval<LazyStaggeredGridInterval> interval = this.intervals.get(i);
            ky span = interval.getValue().getSpan();
            int startIndex = i - interval.getStartIndex();
            if (span != null && span.invoke(Integer.valueOf(startIndex)) == StaggeredGridItemSpan.Companion.getFullLine()) {
                return true;
            }
        }
        return false;
    }
}
