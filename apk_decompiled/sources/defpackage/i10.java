package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class i10 implements Iterable, n20 {
    public final int d;
    public final int e;
    public final int f;

    public i10(int i, int i2, int i3) {
        if (i3 == 0) {
            o.m("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            o.m("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.d = i;
        this.e = q10.s(i, i2, i3);
        this.f = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i10)) {
            return false;
        }
        if (isEmpty() && ((i10) obj).isEmpty()) {
            return true;
        }
        i10 i10Var = (i10) obj;
        return this.d == i10Var.d && this.e == i10Var.e && this.f == i10Var.f;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.d * 31) + this.e) * 31) + this.f;
    }

    public boolean isEmpty() {
        int i = this.e;
        int i2 = this.f;
        int i3 = this.d;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j10(this.d, this.e, this.f);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.e;
        int i2 = this.f;
        int i3 = this.d;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
