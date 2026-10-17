package defpackage;

import java.math.BigInteger;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class j11 implements Comparable {
    public static final j11 i;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final ys0 h = new ys0(new hm0(this, 20));

    static {
        new j11(0, 0, 0, "");
        i = new j11(0, 1, 0, "");
        new j11(1, 0, 0, "");
    }

    public j11(int i2, int i3, int i4, String str) {
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j11 j11Var = (j11) obj;
        j11Var.getClass();
        Object value = this.h.getValue();
        value.getClass();
        Object value2 = j11Var.h.getValue();
        value2.getClass();
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j11)) {
            return false;
        }
        j11 j11Var = (j11) obj;
        return this.d == j11Var.d && this.e == j11Var.e && this.f == j11Var.f;
    }

    public final int hashCode() {
        return ((((527 + this.d) * 31) + this.e) * 31) + this.f;
    }

    public final String toString() {
        String str = this.g;
        return this.d + '.' + this.e + '.' + this.f + (!ds0.n0(str) ? "-".concat(str) : "");
    }
}
