package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class e10 {
    public int[] a;
    public int b;

    public static int a(e10 e10Var, int i) {
        int i2 = e10Var.b;
        e10Var.getClass();
        if (i2 <= 0 || i2 > e10Var.b) {
            throw new IndexOutOfBoundsException("");
        }
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = e10Var.a[i5];
            if (i6 < i) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public final int b(int i) {
        if (i < 0 || i >= this.b) {
            throw new IndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.a[i];
    }

    public final int c() {
        int i = this.b;
        if (i != 0) {
            return this.a[i - 1];
        }
        throw new NoSuchElementException("IntList is empty.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e10) {
            e10 e10Var = (e10) obj;
            int i = e10Var.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = e10Var.a;
                k10 W = y80.W(0, i2);
                int i3 = W.d;
                int i4 = W.e;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
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
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }
}
