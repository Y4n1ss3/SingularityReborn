package androidx.compose.runtime.snapshots;

import defpackage.ac;
import defpackage.qa0;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapshotIdArrayBuilder {
    public static final int $stable = 8;
    private final qa0 list;

    public SnapshotIdArrayBuilder(long[] jArr) {
        qa0 qa0Var;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            qa0Var = new qa0(copyOf.length);
            int i = qa0Var.b;
            if (i < 0) {
                throw new IndexOutOfBoundsException("");
            }
            if (copyOf.length != 0) {
                int length = copyOf.length + i;
                long[] jArr2 = qa0Var.a;
                if (jArr2.length < length) {
                    jArr2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    qa0Var.a = jArr2;
                }
                int i2 = qa0Var.b;
                if (i != i2) {
                    ac.P(jArr2, jArr2, copyOf.length + i, i, i2);
                }
                ac.P(copyOf, jArr2, i, 0, copyOf.length);
                qa0Var.b += copyOf.length;
            }
        } else {
            qa0Var = new qa0(16);
        }
        this.list = qa0Var;
    }

    public final void add(long j) {
        this.list.a(j);
    }

    public final long[] toArray() {
        qa0 qa0Var = this.list;
        int i = qa0Var.b;
        if (i == 0) {
            return null;
        }
        long[] jArr = new long[i];
        long[] jArr2 = qa0Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = jArr2[i2];
        }
        return jArr;
    }
}
