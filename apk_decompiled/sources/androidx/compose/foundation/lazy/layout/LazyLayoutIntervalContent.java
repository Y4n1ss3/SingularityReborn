package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class LazyLayoutIntervalContent<Interval extends Interval> {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface Interval {
        default ky getKey() {
            return null;
        }

        default ky getType() {
            return new ky() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval$type$1
                @Override // defpackage.ky
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Void invoke(int i) {
                    return null;
                }
            };
        }
    }

    public final Object getContentType(int i) {
        IntervalList.Interval<Interval> interval = getIntervals().get(i);
        return interval.getValue().getType().invoke(Integer.valueOf(i - interval.getStartIndex()));
    }

    public abstract IntervalList<Interval> getIntervals();

    public final int getItemCount() {
        return getIntervals().getSize();
    }

    public final Object getKey(int i) {
        Object invoke;
        IntervalList.Interval<Interval> interval = getIntervals().get(i);
        int startIndex = i - interval.getStartIndex();
        ky key = interval.getValue().getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(startIndex))) == null) ? Lazy_androidKt.getDefaultLazyLayoutKey(i) : invoke;
    }

    public final <T> T withInterval(int i, my myVar) {
        IntervalList.Interval<Interval> interval = getIntervals().get(i);
        return (T) myVar.invoke(Integer.valueOf(i - interval.getStartIndex()), interval.getValue());
    }
}
