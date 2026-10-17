package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import defpackage.ad0;
import defpackage.k10;
import defpackage.ky;
import defpackage.nc0;
import defpackage.ta0;
import defpackage.w01;
import defpackage.zc0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NearestRangeKeyIndexMap implements LazyLayoutKeyIndexMap {
    public static final int $stable = 8;
    private final Object[] keys;
    private final int keysStartIndex;
    private final zc0 map;

    public NearestRangeKeyIndexMap(k10 k10Var, LazyLayoutIntervalContent<?> lazyLayoutIntervalContent) {
        IntervalList<?> intervals = lazyLayoutIntervalContent.getIntervals();
        int i = k10Var.d;
        if (i < 0) {
            InlineClassHelperKt.throwIllegalStateException("negative nearestRange.first");
        }
        int min = Math.min(k10Var.e, intervals.getSize() - 1);
        if (min < i) {
            ta0 ta0Var = ad0.a;
            ta0Var.getClass();
            this.map = ta0Var;
            this.keys = new Object[0];
            this.keysStartIndex = 0;
            return;
        }
        int i2 = (min - i) + 1;
        this.keys = new Object[i2];
        this.keysStartIndex = i;
        ta0 ta0Var2 = new ta0(i2);
        intervals.forEach(i, min, new nc0(i, min, ta0Var2, this));
        this.map = ta0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        if (r1 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final w01 lambda$1$0(int i, int i2, ta0 ta0Var, NearestRangeKeyIndexMap nearestRangeKeyIndexMap, IntervalList.Interval interval) {
        Object defaultLazyLayoutKey;
        ky key = ((LazyLayoutIntervalContent.Interval) interval.getValue()).getKey();
        int max = Math.max(i, interval.getStartIndex());
        int min = Math.min(i2, (interval.getSize() + interval.getStartIndex()) - 1);
        if (max <= min) {
            while (true) {
                if (key != null) {
                    defaultLazyLayoutKey = key.invoke(Integer.valueOf(max - interval.getStartIndex()));
                }
                defaultLazyLayoutKey = Lazy_androidKt.getDefaultLazyLayoutKey(max);
                ta0Var.h(max, defaultLazyLayoutKey);
                nearestRangeKeyIndexMap.keys[max - nearestRangeKeyIndexMap.keysStartIndex] = defaultLazyLayoutKey;
                if (max == min) {
                    break;
                }
                max++;
            }
        }
        return w01.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public int getIndex(Object obj) {
        zc0 zc0Var = this.map;
        int a = zc0Var.a(obj);
        if (a >= 0) {
            return zc0Var.c[a];
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public Object getKey(int i) {
        Object[] objArr = this.keys;
        int i2 = i - this.keysStartIndex;
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }
}
