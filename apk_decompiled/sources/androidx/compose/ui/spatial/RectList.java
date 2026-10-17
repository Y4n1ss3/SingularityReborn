package androidx.compose.ui.spatial;

import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.graphics.Fields;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.oy;
import defpackage.py;
import defpackage.qy;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RectList {
    public static final int $stable = 8;
    public int itemsSize;
    public long[] items = new long[192];
    public long[] stack = new long[192];

    private final int allocateItemsIndex() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        int i2 = i + 3;
        this.itemsSize = i2;
        int length = jArr.length;
        if (length <= i2) {
            resizeStorage(length, i, jArr);
        }
        return i;
    }

    public static /* synthetic */ void insert$default(RectList rectList, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7, int i8, Object obj) {
        if ((i8 & 32) != 0) {
            i6 = -1;
        }
        if ((i8 & 64) != 0) {
            z = false;
        }
        if ((i8 & Fields.SpotShadowColor) != 0) {
            z2 = false;
        }
        if ((i8 & Fields.RotationX) != 0) {
            z3 = false;
        }
        if ((i8 & Fields.RotationY) != 0) {
            i7 = -1;
        }
        rectList.insert(i, i2, i3, i4, i5, i6, z, z2, z3, i7);
    }

    private final void resizeStorage(int i, int i2, long[] jArr) {
        int max = Math.max(i * 2, i2 + 3);
        this.items = Arrays.copyOf(jArr, max);
        this.stack = Arrays.copyOf(this.stack, max);
    }

    private final void updateSubhierarchy(long j, int i, int i2) {
        int i3;
        char c;
        char c2;
        long[] jArr = this.items;
        long[] jArr2 = this.stack;
        getSize();
        jArr2[0] = j;
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            long j2 = jArr2[i4];
            int i5 = 33554431;
            int i6 = ((int) j2) & 33554431;
            char c3 = 25;
            int i7 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i8 = ((int) (j2 >> 50)) & 1023;
            int i9 = i8 == 1023 ? this.itemsSize : (i8 * 3) + i7;
            if (i7 < 0) {
                return;
            }
            while (i7 < jArr.length - 2 && i7 < i9) {
                int i10 = i7 + 2;
                long j3 = jArr[i10];
                if ((((int) (j3 >> c3)) & i5) == i6) {
                    long j4 = jArr[i7];
                    int i11 = i7 + 1;
                    i3 = i5;
                    c = c3;
                    long j5 = jArr[i11];
                    c2 = c4;
                    jArr[i7] = ((((int) j4) + i2) & 4294967295L) | ((((int) (j4 >> 32)) + i) << 32);
                    jArr[i11] = ((((int) j5) + i2) & 4294967295L) | ((((int) (j5 >> 32)) + i) << 32);
                    jArr[i10] = (((j3 >> 63) & 1) << 60) | j3;
                    if ((((int) (j3 >> c2)) & 1023) > 0) {
                        jArr2[i4] = (RectListKt.getEverythingButParentId() & j3) | (((i7 + 3) & i3) << c);
                        i4++;
                    }
                } else {
                    i3 = i5;
                    c = c3;
                    c2 = c4;
                }
                i7 += 3;
                i5 = i3;
                c3 = c;
                c4 = c2;
            }
        }
    }

    public final void clearUpdated() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            jArr[i3] = jArr[i3] & (-1152921504606846977L);
        }
    }

    public final boolean contains(int i) {
        int i2 = i & 33554431;
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                return true;
            }
        }
        return false;
    }

    public final String debugString() {
        StringBuilder sb = new StringBuilder();
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2];
            long j2 = jArr[i2 + 1];
            long j3 = jArr[i2 + 2];
            sb.append("id=" + (((int) j3) & 33554431) + ", rect=[" + ((int) (j >> 32)) + ',' + ((int) j) + ',' + ((int) (j2 >> 32)) + ',' + ((int) j2) + "], parent=" + (33554431 & ((int) (j3 >> 25))) + ", lastChildOffset=" + (((int) (j3 >> 50)) & 1023) + ", updated=" + (((int) (j3 >> 60)) & 1) + ", focusable=" + (((int) (j3 >> 61)) & 1) + ", gesturable=" + (((int) (j3 >> 62)) & 1));
            sb.append('\n');
        }
        return sb.toString();
    }

    public final void defragment() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        long[] jArr2 = this.stack;
        int i2 = 0;
        for (int i3 = 0; i3 < jArr.length - 2 && i2 < jArr2.length - 2 && i3 < i; i3 += 3) {
            int i4 = i3 + 2;
            if (jArr[i4] != RectListKt.getTombStone()) {
                jArr2[i2] = jArr[i3];
                jArr2[i2 + 1] = jArr[i3 + 1];
                jArr2[i2 + 2] = jArr[i4];
                i2 += 3;
            }
        }
        this.itemsSize = i2;
        this.items = jArr2;
        this.stack = jArr;
    }

    public final void findKNearestNeighbors(int i, int i2, int i3, int i4, int i5, int i6, qy qyVar) {
        int i7;
        int[] neighborsScoredByDistance$ui = neighborsScoredByDistance$ui(i, i3, i4, i5, i6);
        long[] jArr = this.items;
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        while (i9 <= i2) {
            int i11 = Integer.MAX_VALUE;
            int i12 = 0;
            while (i12 < neighborsScoredByDistance$ui.length) {
                int i13 = neighborsScoredByDistance$ui[i12];
                if (i13 > i8) {
                    i11 = Math.min(i11, i13);
                }
                if (i13 == i8) {
                    int i14 = i12 * 3;
                    long j = jArr[i14];
                    long j2 = jArr[i14 + 1];
                    i7 = i8;
                    qyVar.invoke(Integer.valueOf(i13), Integer.valueOf(((int) jArr[i14 + 2]) & 33554431), Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                    i10++;
                    if (i10 == i2) {
                        return;
                    }
                } else {
                    i7 = i8;
                }
                i12++;
                i8 = i7;
            }
            i9++;
            i8 = i11;
        }
    }

    public final int findNearestNeighbor(int i, int i2, int i3, int i4, int i5) {
        long[] jArr = this.items;
        int i6 = this.itemsSize;
        int i7 = Integer.MAX_VALUE;
        int i8 = -1;
        for (int i9 = 0; i9 < jArr.length - 2 && i9 < i6; i9 += 3) {
            long j = jArr[i9];
            int i10 = i9 + 1;
            long j2 = jArr[i10];
            int distanceScore = RectListKt.distanceScore(i, i2, i3, i4, i5, (int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
            boolean z = (distanceScore < i7) & (distanceScore > 0);
            if (z) {
                i7 = distanceScore;
            }
            if (z) {
                i8 = i10;
            }
        }
        if (i8 < 0 || i8 >= jArr.length) {
            return -1;
        }
        return ((int) jArr[i8]) & 33554431;
    }

    public final void forEachFocusableIntersection(int i, int i2, int i3, int i4, ky kyVar) {
        long j = (i << 32) | (i2 & 4294967295L);
        long j2 = (i3 << 32) | (i4 & 4294967295L);
        long[] jArr = this.items;
        int i5 = this.itemsSize;
        for (int i6 = 0; i6 < jArr.length - 2 && i6 < i5; i6 += 3) {
            long j3 = jArr[i6 + 2];
            if ((((int) (j3 >> 61)) & 1) != 0) {
                if (((((j2 - jArr[i6]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i6 + 1] - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    kyVar.invoke(Integer.valueOf(((int) j3) & 33554431));
                }
            }
        }
    }

    public final void forEachGesturableIntersection(int i, int i2, int i3, int i4, ky kyVar) {
        long j = (i << 32) | (i2 & 4294967295L);
        long j2 = (i3 << 32) | (i4 & 4294967295L);
        long[] jArr = this.items;
        int i5 = this.itemsSize;
        for (int i6 = 0; i6 < jArr.length - 2 && i6 < i5; i6 += 3) {
            long j3 = jArr[i6 + 2];
            if ((((int) (j3 >> 62)) & 1) != 0) {
                if (((((j2 - jArr[i6]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i6 + 1] - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    kyVar.invoke(Integer.valueOf(((int) j3) & 33554431));
                }
            }
        }
    }

    public final void forEachIntersectingRectWithValueAt(int i, py pyVar) {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        long j = jArr[i];
        long j2 = jArr[i + 1];
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if (i3 != i) {
                long j3 = jArr[i3];
                long j4 = jArr[i3 + 1];
                if (((((j2 - j3) - InlineClassHelperKt.Uint64Low32) | ((j4 - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    pyVar.invoke(Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) j3), Integer.valueOf((int) (j4 >> 32)), Integer.valueOf((int) j4), Integer.valueOf(((int) jArr[i3 + 2]) & 33554431));
                }
            }
        }
    }

    public final void forEachIntersection(int i, int i2, int i3, int i4, ky kyVar) {
        long j = (i << 32) | (i2 & 4294967295L);
        long j2 = (i3 << 32) | (i4 & 4294967295L);
        long[] jArr = this.items;
        int i5 = this.itemsSize;
        for (int i6 = 0; i6 < jArr.length - 2 && i6 < i5; i6 += 3) {
            if (((((j2 - jArr[i6]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i6 + 1] - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                kyVar.invoke(Integer.valueOf(((int) jArr[i6 + 2]) & 33554431));
            }
        }
    }

    public final void forEachRect(py pyVar) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2];
            long j2 = jArr[i2 + 1];
            pyVar.invoke(Integer.valueOf(((int) jArr[i2 + 2]) & 33554431), Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
        }
    }

    public final void forEachUpdatedRect(ny nyVar) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2 + 2];
            if ((((int) (j >> 60)) & 1) != 0) {
                nyVar.invoke(Integer.valueOf(((int) j) & 33554431), Long.valueOf(jArr[i2]), Long.valueOf(jArr[i2 + 1]));
            }
        }
    }

    public final int getSize() {
        return this.itemsSize / 3;
    }

    public final long getTopLeft(int i) {
        int i2 = i & 33554431;
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                return jArr[i4];
            }
        }
        return SnapshotId_jvmKt.SnapshotIdMax;
    }

    public final int indexOf(int i) {
        int i2 = i & 33554431;
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                return i4;
            }
        }
        return -1;
    }

    public final void insert(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = this.items;
        int i8 = this.itemsSize;
        int i9 = i8 + 3;
        this.itemsSize = i9;
        int length = jArr.length;
        if (length <= i9) {
            resizeStorage(length, i8, jArr);
        }
        long[] jArr2 = this.items;
        jArr2[i8] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i8 + 1] = (i4 << 32) | (i5 & 4294967295L);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (Math.min(0, 1023) << 50) | (i10 << 25) | (i & 33554431);
        if (i6 < 0) {
            return;
        }
        for (int i11 = i7 != -1 ? i7 : i8 - 3; i11 >= 0; i11 -= 3) {
            int i12 = i11 + 2;
            long j = jArr2[i12];
            if ((((int) j) & 33554431) == i10) {
                jArr2[i12] = (Math.min((i8 - i11) / 3, 1023) << 50) | (j & RectListKt.getEverythingButLastChildOffset());
                return;
            }
        }
    }

    public final void insertBasedOnParentOffset(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3) {
        int i7 = i & 33554431;
        long[] jArr = this.items;
        for (int i8 = this.itemsSize - 3; i8 >= 0; i8 -= 3) {
            if ((((int) jArr[i8 + 2]) & 33554431) == i2) {
                long j = jArr[i8];
                int i9 = ((int) (j >> 32)) + i3;
                int i10 = ((int) j) + i4;
                insert(i7, i9, i10, i9 + i5, i10 + i6, i2, z, z2, z3, i8);
                return;
            }
        }
    }

    public final void markUpdated(int i) {
        int i2 = i & 33554431;
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                jArr[i5] = (((j >> 63) & 1) << 60) | j;
                return;
            }
        }
    }

    public final long metaFor(int i) {
        int i2 = i & 33554431;
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            long j = jArr[i4 + 2];
            if ((((int) j) & 33554431) == i2) {
                return j;
            }
        }
        return RectListKt.getTombStone();
    }

    public final void move(int i, int i2, int i3, int i4, int i5) {
        int i6 = i & 33554431;
        long[] jArr = this.items;
        int i7 = this.itemsSize;
        for (int i8 = 0; i8 < jArr.length - 2 && i8 < i7; i8 += 3) {
            int i9 = i8 + 2;
            long j = jArr[i9];
            if ((((int) j) & 33554431) == i6) {
                long j2 = jArr[i8];
                jArr[i8] = (i3 & 4294967295L) | (i2 << 32);
                int i10 = i8;
                jArr[i8 + 1] = (i5 & 4294967295L) | (i4 << 32);
                jArr[i9] = (((j >> 63) & 1) << 60) | j;
                int i11 = i2 - ((int) (j2 >> 32));
                int i12 = i3 - ((int) j2);
                if ((i11 != 0) || (i12 != 0)) {
                    updateSubhierarchy((RectListKt.getEverythingButParentId() & j) | (((i10 + 3) & 33554431) << 25), i11, i12);
                    return;
                }
                return;
            }
        }
    }

    public final void moveBasedOnParentOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        long j;
        int i8 = 33554431;
        int i9 = i & 33554431;
        int i10 = this.itemsSize;
        int i11 = 0;
        for (long[] jArr = this.items; i11 < jArr.length - 2 && i11 < i10; jArr = jArr) {
            if ((((int) jArr[i11 + 2]) & i8) == i2) {
                long j2 = jArr[i11];
                int i12 = ((int) (j2 >> 32)) + i3;
                int i13 = ((int) j2) + i4;
                int i14 = i12 + i5;
                int i15 = i13 + i6;
                do {
                    i11 += 3;
                    if (i11 < jArr.length - 2 && i11 < i10) {
                        i7 = i11 + 2;
                        j = jArr[i7];
                    }
                } while ((((int) j) & i8) != i9);
                int i16 = i8;
                long j3 = jArr[i11];
                int i17 = i12 - ((int) (j3 >> 32));
                int i18 = i13 - ((int) j3);
                long[] jArr2 = jArr;
                jArr2[i11] = (i13 & 4294967295L) | (i12 << 32);
                jArr2[i11 + 1] = (i14 << 32) | (i15 & 4294967295L);
                jArr2[i7] = (((j >> 63) & 1) << 60) | j;
                if (i17 == 0 && i18 == 0) {
                    return;
                }
                updateSubhierarchy((RectListKt.getEverythingButParentId() & j) | (((i11 + 3) & i16) << 25), i17, i18);
                return;
            }
            i11 += 3;
            i8 = i8;
        }
    }

    public final int[] neighborsScoredByDistance$ui(int i, int i2, int i3, int i4, int i5) {
        long[] jArr = this.items;
        int i6 = this.itemsSize / 3;
        int[] iArr = new int[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = i7 * 3;
            if (i8 < 0 || i8 >= jArr.length - 1) {
                break;
            }
            long j = jArr[i8];
            long j2 = jArr[i8 + 1];
            iArr[i7] = RectListKt.distanceScore(i, i2, i3, i4, i5, (int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
        }
        return iArr;
    }

    public final boolean remove(int i) {
        int i2 = i & 33554431;
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            if ((((int) jArr[i5]) & 33554431) == i2) {
                jArr[i4] = -1;
                jArr[i4 + 1] = -1;
                jArr[i5] = RectListKt.getTombStone();
                return true;
            }
        }
        return false;
    }

    public final boolean update(int i, int i2, int i3, int i4, int i5) {
        int i6 = i & 33554431;
        long[] jArr = this.items;
        int i7 = this.itemsSize;
        for (int i8 = 0; i8 < jArr.length - 2 && i8 < i7; i8 += 3) {
            int i9 = i8 + 2;
            long j = jArr[i9];
            if ((((int) j) & 33554431) == i6) {
                jArr[i8] = (i2 << 32) | (i3 & 4294967295L);
                jArr[i8 + 1] = (i4 << 32) | (4294967295L & i5);
                jArr[i9] = (((j >> 63) & 1) << 60) | j;
                return true;
            }
        }
        return false;
    }

    public final boolean updateFlagsFor(int i, boolean z, boolean z2) {
        int i2 = i & 33554431;
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                jArr[i5] = ((-6917529027641081857L) & j) | ((z ? 1L : 0L) * 2305843009213693952L) | ((z2 ? 1L : 0L) * 4611686018427387904L);
                return true;
            }
        }
        return false;
    }

    public final boolean updateHasCallbacks(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                jArr[i5] = (8070450532247928831L & j) | ((z ? 1L : 0L) * 1152921504606846976L) | ((z ? 1L : 0L) * Long.MIN_VALUE);
                return true;
            }
        }
        return false;
    }

    public final boolean withRect(int i, oy oyVar) {
        int i2 = i & 33554431;
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                oyVar.invoke(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return true;
            }
        }
        return false;
    }

    public final boolean withTopLeftBottomRight(int i, my myVar) {
        int i2 = i & 33554431;
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                myVar.invoke(Long.valueOf(jArr[i4]), Long.valueOf(jArr[i4 + 1]));
                return true;
            }
        }
        return false;
    }

    public final void forEachIntersection(int i, int i2, ky kyVar) {
        long j = (i2 & 4294967295L) | (i << 32);
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if (((((j - jArr[i4]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i4 + 1] - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                kyVar.invoke(Integer.valueOf(((int) jArr[i4 + 2]) & 33554431));
            }
        }
    }

    public final void updateSubhierarchy(int i, int i2, int i3) {
        updateSubhierarchy((Math.min(this.itemsSize / 3, 1023) << 50) | (i & 33554431), i2, i3);
    }
}
