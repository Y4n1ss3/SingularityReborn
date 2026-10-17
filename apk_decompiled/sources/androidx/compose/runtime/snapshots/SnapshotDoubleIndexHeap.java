package androidx.compose.runtime.snapshots;

import defpackage.ac;
import defpackage.kp0;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapshotDoubleIndexHeap {
    public static final int $stable = 8;
    private int firstFreeHandle;
    private int[] handles;
    private int size;
    private long[] values = SnapshotId_jvmKt.snapshotIdArrayWithCapacity(16);
    private int[] index = new int[16];

    public SnapshotDoubleIndexHeap() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.handles = iArr;
    }

    private final int allocateHandle() {
        int[] iArr = this.handles;
        int length = iArr.length;
        if (this.firstFreeHandle >= length) {
            int i = length * 2;
            iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                iArr[i2] = i3;
                i2 = i3;
            }
            ac.S(this.handles, iArr, 0, 0, 14);
            this.handles = iArr;
        }
        int i4 = this.firstFreeHandle;
        this.firstFreeHandle = iArr[i4];
        return i4;
    }

    private final void ensure(int i) {
        int length = this.values.length;
        if (i <= length) {
            return;
        }
        int i2 = length * 2;
        long[] snapshotIdArrayWithCapacity = SnapshotId_jvmKt.snapshotIdArrayWithCapacity(i2);
        int[] iArr = new int[i2];
        ac.P(r1, snapshotIdArrayWithCapacity, 0, 0, this.values.length);
        ac.S(this.index, iArr, 0, 0, 14);
        this.values = snapshotIdArrayWithCapacity;
        this.index = iArr;
    }

    private final void freeHandle(int i) {
        this.handles[i] = this.firstFreeHandle;
        this.firstFreeHandle = i;
    }

    public static /* synthetic */ long lowestOrDefault$default(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return snapshotDoubleIndexHeap.lowestOrDefault(j);
    }

    private final void shiftDown(int i) {
        long[] jArr = this.values;
        int i2 = this.size >> 1;
        while (i < i2) {
            int i3 = (i + 1) << 1;
            int i4 = i3 - 1;
            if (i3 >= this.size || q10.i(jArr[i3], jArr[i4]) >= 0) {
                if (q10.i(jArr[i4], jArr[i]) >= 0) {
                    return;
                }
                swap(i4, i);
                i = i4;
            } else {
                if (q10.i(jArr[i3], jArr[i]) >= 0) {
                    return;
                }
                swap(i3, i);
                i = i3;
            }
        }
    }

    private final void shiftUp(int i) {
        long[] jArr = this.values;
        long j = jArr[i];
        while (i > 0) {
            int i2 = ((i + 1) >> 1) - 1;
            if (q10.i(jArr[i2], j) <= 0) {
                return;
            }
            swap(i2, i);
            i = i2;
        }
    }

    private final void swap(int i, int i2) {
        long[] jArr = this.values;
        int[] iArr = this.index;
        int[] iArr2 = this.handles;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public final int add(long j) {
        ensure(this.size + 1);
        int i = this.size;
        this.size = i + 1;
        int allocateHandle = allocateHandle();
        this.values[i] = j;
        this.index[i] = allocateHandle;
        this.handles[allocateHandle] = i;
        shiftUp(i);
        return allocateHandle;
    }

    public final int getSize() {
        return this.size;
    }

    public final long lowestOrDefault(long j) {
        return this.size > 0 ? this.values[0] : j;
    }

    public final void remove(int i) {
        int i2 = this.handles[i];
        swap(i2, this.size - 1);
        this.size--;
        shiftUp(i2);
        shiftDown(i2);
        freeHandle(i);
    }

    public final void validate() {
        int i = this.size;
        int i2 = 1;
        while (i2 < i) {
            int i3 = i2 + 1;
            long[] jArr = this.values;
            if (q10.i(jArr[(i3 >> 1) - 1], jArr[i2]) > 0) {
                o.g("Index ", i2, " is out of place");
                return;
            }
            i2 = i3;
        }
    }

    public final void validateHandle(int i, long j) {
        int i2 = this.handles[i];
        if (this.index[i2] != i) {
            o.g("Index for handle ", i, " is corrupted");
        } else {
            if (this.values[i2] == j) {
                return;
            }
            StringBuilder f = kp0.f(i, "Value for handle ", " was ");
            f.append(this.values[i2]);
            f.append(" but was supposed to be ");
            f.append(j);
            throw new IllegalStateException(f.toString().toString());
        }
    }
}
