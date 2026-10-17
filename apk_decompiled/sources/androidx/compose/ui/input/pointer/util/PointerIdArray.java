package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.input.pointer.PointerId;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerIdArray {
    public static final int $stable = 8;
    private long[] internalArray = new long[2];
    private int size;

    private final long[] resizeStorage(int i) {
        long[] jArr = this.internalArray;
        long[] copyOf = Arrays.copyOf(jArr, Math.max(i, jArr.length * 2));
        this.internalArray = copyOf;
        return copyOf;
    }

    public final boolean add(long j) {
        if (contains(j)) {
            return false;
        }
        set(this.size, j);
        return true;
    }

    /* renamed from: add-0FcD4WY, reason: not valid java name */
    public final boolean m6202add0FcD4WY(long j) {
        return add(j);
    }

    public final void clear() {
        this.size = 0;
    }

    public final boolean contains(long j) {
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.internalArray[i2] == j) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: contains-0FcD4WY, reason: not valid java name */
    public final boolean m6203contains0FcD4WY(long j) {
        return contains(j);
    }

    /* renamed from: get-_I2yYro, reason: not valid java name */
    public final long m6204get_I2yYro(int i) {
        return PointerId.m6078constructorimpl(this.internalArray[i]);
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean remove(long j) {
        int i = this.size;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.internalArray[i2]) {
                int i3 = this.size - 1;
                while (i2 < i3) {
                    long[] jArr = this.internalArray;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.size--;
                return true;
            }
            i2++;
        }
        return false;
    }

    /* renamed from: remove-0FcD4WY, reason: not valid java name */
    public final boolean m6205remove0FcD4WY(long j) {
        return remove(j);
    }

    public final boolean removeAt(int i) {
        int i2 = this.size;
        if (i >= i2) {
            return false;
        }
        int i3 = i2 - 1;
        while (i < i3) {
            long[] jArr = this.internalArray;
            int i4 = i + 1;
            jArr[i] = jArr[i4];
            i = i4;
        }
        this.size--;
        return true;
    }

    public final void set(int i, long j) {
        long[] jArr = this.internalArray;
        if (i >= jArr.length) {
            jArr = resizeStorage(i + 1);
        }
        jArr[i] = j;
        if (i >= this.size) {
            this.size = i + 1;
        }
    }

    /* renamed from: set-DmW0f2w, reason: not valid java name */
    public final void m6206setDmW0f2w(int i, long j) {
        set(i, j);
    }
}
