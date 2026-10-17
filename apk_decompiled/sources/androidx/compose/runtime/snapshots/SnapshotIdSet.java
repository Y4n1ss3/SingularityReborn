package androidx.compose.runtime.snapshots;

import defpackage.c21;
import defpackage.dq;
import defpackage.ky;
import defpackage.my;
import defpackage.n20;
import defpackage.p10;
import defpackage.q10;
import defpackage.zi;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable<Long>, n20 {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);
    private final long[] belowBound;
    private final long lowerBound;
    private final long lowerSet;
    private final long upperSet;

    private SnapshotIdSet(long j, long j2, long j3, long[] jArr) {
        this.upperSet = j;
        this.lowerSet = j2;
        this.lowerBound = j3;
        this.belowBound = jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [androidx.compose.runtime.snapshots.SnapshotIdSet] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [my] */
    private final SnapshotIdSet fastFold(SnapshotIdSet snapshotIdSet, my myVar) {
        long[] jArr = this.belowBound;
        int i = 0;
        if (jArr != null) {
            int length = jArr.length;
            int i2 = 0;
            snapshotIdSet = snapshotIdSet;
            while (i2 < length) {
                Object invoke = myVar.invoke(snapshotIdSet, Long.valueOf(jArr[i2]));
                i2++;
                snapshotIdSet = invoke;
            }
        }
        if (this.lowerSet != 0) {
            int i3 = 0;
            snapshotIdSet = snapshotIdSet;
            while (i3 < 64) {
                if ((this.lowerSet & (1 << i3)) != 0) {
                    snapshotIdSet = myVar.invoke(snapshotIdSet, Long.valueOf(this.lowerBound + i3));
                }
                i3++;
                snapshotIdSet = snapshotIdSet;
            }
        }
        snapshotIdSet = snapshotIdSet;
        if (this.upperSet != 0) {
            while (i < 64) {
                if ((this.upperSet & (1 << i)) != 0) {
                    snapshotIdSet = myVar.invoke(snapshotIdSet, Long.valueOf(this.lowerBound + i + 64));
                }
                i++;
                snapshotIdSet = snapshotIdSet;
            }
        }
        return (SnapshotIdSet) snapshotIdSet;
    }

    public final SnapshotIdSet and(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (!q10.b(snapshotIdSet, snapshotIdSet2)) {
            if (this != snapshotIdSet2) {
                long j = snapshotIdSet.lowerBound;
                long j2 = this.lowerBound;
                if (j == j2) {
                    long[] jArr = snapshotIdSet.belowBound;
                    long[] jArr2 = this.belowBound;
                    if (jArr == jArr2) {
                        long j3 = this.upperSet;
                        long j4 = snapshotIdSet.upperSet;
                        long j5 = j3 & j4;
                        long j6 = this.lowerSet;
                        long j7 = snapshotIdSet.lowerSet;
                        long j8 = j6 & j7;
                        if (j5 != 0 || j8 != 0 || jArr2 != null) {
                            return new SnapshotIdSet(j3 & j4, j6 & j7, j2, jArr2);
                        }
                    }
                }
                int i = 0;
                if (this.belowBound == null) {
                    long[] jArr3 = this.belowBound;
                    if (jArr3 != null) {
                        for (long j9 : jArr3) {
                            if (snapshotIdSet.get(j9)) {
                                snapshotIdSet2 = snapshotIdSet2.set(j9);
                            }
                        }
                    }
                    if (this.lowerSet != 0) {
                        for (int i2 = 0; i2 < 64; i2++) {
                            if ((this.lowerSet & (1 << i2)) != 0) {
                                long j10 = this.lowerBound + i2;
                                if (snapshotIdSet.get(j10)) {
                                    snapshotIdSet2 = snapshotIdSet2.set(j10);
                                }
                            }
                        }
                    }
                    if (this.upperSet != 0) {
                        while (i < 64) {
                            if ((this.upperSet & (1 << i)) != 0) {
                                long j11 = this.lowerBound + i + 64;
                                if (snapshotIdSet.get(j11)) {
                                    snapshotIdSet2 = snapshotIdSet2.set(j11);
                                }
                            }
                            i++;
                        }
                    }
                    return snapshotIdSet2;
                }
                long[] jArr4 = snapshotIdSet.belowBound;
                if (jArr4 != null) {
                    for (long j12 : jArr4) {
                        if (get(j12)) {
                            snapshotIdSet2 = snapshotIdSet2.set(j12);
                        }
                    }
                }
                if (snapshotIdSet.lowerSet != 0) {
                    for (int i3 = 0; i3 < 64; i3++) {
                        if ((snapshotIdSet.lowerSet & (1 << i3)) != 0) {
                            long j13 = snapshotIdSet.lowerBound + i3;
                            if (get(j13)) {
                                snapshotIdSet2 = snapshotIdSet2.set(j13);
                            }
                        }
                    }
                }
                if (snapshotIdSet.upperSet != 0) {
                    while (i < 64) {
                        if ((snapshotIdSet.upperSet & (1 << i)) != 0) {
                            long j14 = snapshotIdSet.lowerBound + i + 64;
                            if (get(j14)) {
                                snapshotIdSet2 = snapshotIdSet2.set(j14);
                            }
                        }
                        i++;
                    }
                }
            }
            return snapshotIdSet2;
        }
        return snapshotIdSet2;
    }

    public final SnapshotIdSet andNot(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        long j = snapshotIdSet.lowerBound;
        long j2 = this.lowerBound;
        if (j == j2) {
            long[] jArr = snapshotIdSet.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet((~snapshotIdSet.upperSet) & this.upperSet, this.lowerSet & (~snapshotIdSet.lowerSet), j2, jArr2);
            }
        }
        long[] jArr3 = snapshotIdSet.belowBound;
        if (jArr3 != null) {
            for (long j3 : jArr3) {
                this = this.clear(j3);
            }
        }
        if (snapshotIdSet.lowerSet != 0) {
            for (int i = 0; i < 64; i++) {
                if ((snapshotIdSet.lowerSet & (1 << i)) != 0) {
                    this = this.clear(snapshotIdSet.lowerBound + i);
                }
            }
        }
        if (snapshotIdSet.upperSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((snapshotIdSet.upperSet & (1 << i2)) != 0) {
                    this = this.clear(snapshotIdSet.lowerBound + i2 + 64);
                }
            }
        }
        return this;
    }

    public final SnapshotIdSet clear(long j) {
        long[] jArr;
        int binarySearch;
        long j2 = j - this.lowerBound;
        if (q10.i(j2, 0L) >= 0 && q10.i(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.lowerSet;
            if ((j4 & j3) != 0) {
                return new SnapshotIdSet(this.upperSet, j4 & (~j3), this.lowerBound, this.belowBound);
            }
        } else if (q10.i(j2, 64L) >= 0 && q10.i(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.upperSet;
            if ((j6 & j5) != 0) {
                return new SnapshotIdSet(j6 & (~j5), this.lowerSet, this.lowerBound, this.belowBound);
            }
        } else if (q10.i(j2, 0L) < 0 && (jArr = this.belowBound) != null && (binarySearch = SnapshotId_jvmKt.binarySearch(jArr, j)) >= 0) {
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdRemovedAt(jArr, binarySearch));
        }
        return this;
    }

    public final void fastForEach(ky kyVar) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            for (long j : jArr) {
                kyVar.invoke(Long.valueOf(j));
            }
        }
        if (this.lowerSet != 0) {
            for (int i = 0; i < 64; i++) {
                if ((this.lowerSet & (1 << i)) != 0) {
                    kyVar.invoke(Long.valueOf(this.lowerBound + i));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((this.upperSet & (1 << i2)) != 0) {
                    kyVar.invoke(Long.valueOf(this.lowerBound + i2 + 64));
                }
            }
        }
    }

    public final boolean get(long j) {
        long[] jArr;
        long j2 = j - this.lowerBound;
        return (q10.i(j2, 0L) < 0 || q10.i(j2, 64L) >= 0) ? (q10.i(j2, 64L) < 0 || q10.i(j2, 128L) >= 0) ? q10.i(j2, 0L) <= 0 && (jArr = this.belowBound) != null && SnapshotId_jvmKt.binarySearch(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.upperSet) != 0 : ((1 << ((int) j2)) & this.lowerSet) != 0;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return p10.y(new SnapshotIdSet$iterator$1(this, null));
    }

    public final long lowest(long j) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            return jArr[0];
        }
        if (this.lowerSet != 0) {
            return this.lowerBound + Long.numberOfTrailingZeros(r0);
        }
        return this.upperSet != 0 ? this.lowerBound + 64 + Long.numberOfTrailingZeros(r0) : j;
    }

    public final SnapshotIdSet or(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet;
        }
        long j = snapshotIdSet.lowerBound;
        long j2 = this.lowerBound;
        if (j == j2) {
            long[] jArr = snapshotIdSet.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet(snapshotIdSet.upperSet | this.upperSet, this.lowerSet | snapshotIdSet.lowerSet, j2, jArr2);
            }
        }
        int i = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j3 : jArr3) {
                    snapshotIdSet = snapshotIdSet.set(j3);
                }
            }
            if (this.lowerSet != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if ((this.lowerSet & (1 << i2)) != 0) {
                        snapshotIdSet = snapshotIdSet.set(this.lowerBound + i2);
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i < 64) {
                    if ((this.upperSet & (1 << i)) != 0) {
                        snapshotIdSet = snapshotIdSet.set(this.lowerBound + i + 64);
                    }
                    i++;
                }
            }
            return snapshotIdSet;
        }
        long[] jArr4 = snapshotIdSet.belowBound;
        if (jArr4 != null) {
            for (long j4 : jArr4) {
                this = this.set(j4);
            }
        }
        if (snapshotIdSet.lowerSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((snapshotIdSet.lowerSet & (1 << i3)) != 0) {
                    this = this.set(snapshotIdSet.lowerBound + i3);
                }
            }
        }
        if (snapshotIdSet.upperSet != 0) {
            while (i < 64) {
                if ((snapshotIdSet.upperSet & (1 << i)) != 0) {
                    this = this.set(snapshotIdSet.lowerBound + i + 64);
                }
                i++;
            }
        }
        return this;
    }

    public final SnapshotIdSet set(long j) {
        long j2;
        long j3;
        long[] jArr;
        long j4 = j - this.lowerBound;
        long j5 = 0;
        if (q10.i(j4, 0L) >= 0 && q10.i(j4, 64L) < 0) {
            long j6 = 1 << ((int) j4);
            long j7 = this.lowerSet;
            if ((j7 & j6) == 0) {
                return new SnapshotIdSet(this.upperSet, j7 | j6, this.lowerBound, this.belowBound);
            }
        } else if (q10.i(j4, 64L) >= 0 && q10.i(j4, 128L) < 0) {
            long j8 = 1 << (((int) j4) - 64);
            long j9 = this.upperSet;
            if ((j9 & j8) == 0) {
                return new SnapshotIdSet(j9 | j8, this.lowerSet, this.lowerBound, this.belowBound);
            }
        } else if (q10.i(j4, 128L) < 0) {
            long[] jArr2 = this.belowBound;
            if (jArr2 == null) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, new long[]{j});
            }
            int binarySearch = SnapshotId_jvmKt.binarySearch(jArr2, j);
            if (binarySearch < 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdInsertedAt(jArr2, -(binarySearch + 1), j));
            }
        } else if (!get(j)) {
            long j10 = this.upperSet;
            long j11 = this.lowerSet;
            long j12 = this.lowerBound;
            long j13 = ((j + 1) / 64) * 64;
            if (q10.i(j13, 0L) < 0) {
                j13 = 9223372036854775680L;
            }
            SnapshotIdArrayBuilder snapshotIdArrayBuilder = null;
            long j14 = j10;
            while (true) {
                if (q10.i(j12, j13) >= 0) {
                    j2 = j11;
                    j3 = j12;
                    break;
                }
                if (j11 != j5) {
                    if (snapshotIdArrayBuilder == null) {
                        snapshotIdArrayBuilder = new SnapshotIdArrayBuilder(this.belowBound);
                    }
                    int i = 0;
                    while (i < 64) {
                        long j15 = j5;
                        if ((j11 & (1 << i)) != j5) {
                            snapshotIdArrayBuilder.add(i + j12);
                        }
                        i++;
                        j5 = j15;
                    }
                }
                j2 = j5;
                if (j14 == j2) {
                    j3 = j13;
                    break;
                }
                j12 += 64;
                j11 = j14;
                j5 = j2;
                j14 = j5;
            }
            if (snapshotIdArrayBuilder == null || (jArr = snapshotIdArrayBuilder.toArray()) == null) {
                jArr = this.belowBound;
            }
            return new SnapshotIdSet(j14, j2, j3, jArr).set(j);
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(zi.a0(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        return c21.a(sb, ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null), ']');
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }

        private Companion() {
        }
    }
}
