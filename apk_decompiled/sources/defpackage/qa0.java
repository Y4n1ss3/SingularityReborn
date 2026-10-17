package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class qa0 {
    public long[] a;
    public int b;

    public qa0(int i) {
        this.a = i == 0 ? q60.a : new long[i];
    }

    public final void a(long j) {
        int i = this.b + 1;
        long[] jArr = this.a;
        if (jArr.length < i) {
            jArr = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
            this.a = jArr;
        }
        int i2 = this.b;
        jArr[i2] = j;
        this.b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qa0) {
            qa0 qa0Var = (qa0) obj;
            int i = qa0Var.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = qa0Var.a;
                k10 W = y80.W(0, i2);
                int i3 = W.d;
                int i4 = W.e;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }
}
