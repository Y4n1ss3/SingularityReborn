package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.ui.graphics.Fields;
import defpackage.ky;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BitVector {
    public static final int $stable = 8;
    private long first;
    private long[] others;
    private long second;

    public BitVector() {
        long[] jArr;
        jArr = SlotTableKt.EmptyLongArray;
        this.others = jArr;
    }

    private final int nextBit(int i, ky kyVar) {
        int numberOfTrailingZeros;
        if (i < 64 && (numberOfTrailingZeros = Long.numberOfTrailingZeros((((Number) kyVar.invoke(Long.valueOf(this.first))).longValue() >>> i) << i)) < 64) {
            return numberOfTrailingZeros;
        }
        if (i < 128) {
            int i2 = i - 64;
            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros((((Number) kyVar.invoke(Long.valueOf(this.second))).longValue() >>> i2) << i2);
            if (numberOfTrailingZeros2 < 64) {
                return numberOfTrailingZeros2 + 64;
            }
        }
        int max = Math.max(i, Fields.SpotShadowColor);
        int i3 = (max / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i4 = i3; i4 < length; i4++) {
            long longValue = ((Number) kyVar.invoke(Long.valueOf(jArr[i4]))).longValue();
            if (i4 == i3) {
                int i5 = max % 64;
                longValue = (longValue >>> i5) << i5;
            }
            int numberOfTrailingZeros3 = Long.numberOfTrailingZeros(longValue);
            if (numberOfTrailingZeros3 < 64) {
                return (i4 * 64) + Fields.SpotShadowColor + numberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final boolean get(int i) {
        int i2;
        if (i < 64) {
            return ((1 << i) & this.first) != 0;
        }
        if (i < 128) {
            return ((1 << (i - 64)) & this.second) != 0;
        }
        long[] jArr = this.others;
        int length = jArr.length;
        if (length != 0 && (i / 64) - 2 < length) {
            return ((1 << (i % 64)) & jArr[i2]) != 0;
        }
        return false;
    }

    public final int getSize() {
        return (this.others.length + 2) * 64;
    }

    public final int nextClear(int i) {
        int numberOfTrailingZeros;
        if (i < 64 && (numberOfTrailingZeros = Long.numberOfTrailingZeros(((~this.first) >>> i) << i)) < 64) {
            return numberOfTrailingZeros;
        }
        if (i < 128) {
            int i2 = i - 64;
            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~this.second) >>> i2) << i2);
            if (numberOfTrailingZeros2 < 64) {
                return numberOfTrailingZeros2 + 64;
            }
        }
        int max = Math.max(i, Fields.SpotShadowColor);
        int i3 = (max / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i4 = i3; i4 < length; i4++) {
            long j = ~jArr[i4];
            if (i4 == i3) {
                int i5 = max % 64;
                j = (j >>> i5) << i5;
            }
            int numberOfTrailingZeros3 = Long.numberOfTrailingZeros(j);
            if (numberOfTrailingZeros3 < 64) {
                return (i4 * 64) + Fields.SpotShadowColor + numberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final int nextSet(int i) {
        int numberOfTrailingZeros;
        if (i < 64 && (numberOfTrailingZeros = Long.numberOfTrailingZeros((this.first >>> i) << i)) < 64) {
            return numberOfTrailingZeros;
        }
        if (i < 128) {
            int i2 = i - 64;
            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros((this.second >>> i2) << i2);
            if (numberOfTrailingZeros2 < 64) {
                return numberOfTrailingZeros2 + 64;
            }
        }
        int max = Math.max(i, Fields.SpotShadowColor);
        int i3 = (max / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i4 = i3; i4 < length; i4++) {
            long j = jArr[i4];
            if (i4 == i3) {
                int i5 = max % 64;
                j = (j >>> i5) << i5;
            }
            int numberOfTrailingZeros3 = Long.numberOfTrailingZeros(j);
            if (numberOfTrailingZeros3 < 64) {
                return (i4 * 64) + Fields.SpotShadowColor + numberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final void set(int i, boolean z) {
        if (i < 64) {
            this.first = ((z ? 1L : 0L) << i) | ((~(1 << i)) & this.first);
            return;
        }
        if (i < 128) {
            this.second = ((z ? 1L : 0L) << i) | ((~(1 << (i - 64))) & this.second);
            return;
        }
        int i2 = i / 64;
        int i3 = i2 - 2;
        int i4 = i % 64;
        long j = 1 << i4;
        long[] jArr = this.others;
        if (i3 >= jArr.length) {
            jArr = Arrays.copyOf(jArr, i2 - 1);
            this.others = jArr;
        }
        jArr[i3] = ((z ? 1L : 0L) << i4) | ((~j) & jArr[i3]);
    }

    public final void setRange(int i, int i2) {
        long j = i < i2 ? -1L : 0L;
        this.first = ((((i < 64 ? 1 : 0) * j) >>> (64 - (Math.min(64, i2) - i))) << i) | this.first;
        if (i2 > 64) {
            int max = Math.max(i, 64);
            this.second = (((j * (max < 128 ? 1 : 0)) >>> (128 - (Math.min(Fields.SpotShadowColor, i2) - max))) << max) | this.second;
            if (i2 > 128) {
                for (int max2 = Math.max(max, Fields.SpotShadowColor); max2 < i2; max2++) {
                    set(max2, true);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BitVector [");
        int size = getSize();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            if (get(i)) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i);
                z = false;
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
