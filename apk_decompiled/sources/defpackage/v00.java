package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class v00 {
    public static final v00 e = new v00(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public v00(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static v00 a(v00 v00Var, v00 v00Var2) {
        return b(Math.max(v00Var.a, v00Var2.a), Math.max(v00Var.b, v00Var2.b), Math.max(v00Var.c, v00Var2.c), Math.max(v00Var.d, v00Var2.d));
    }

    public static v00 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new v00(i, i2, i3, i4);
    }

    public static v00 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return Insets.of(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v00.class != obj.getClass()) {
            return false;
        }
        v00 v00Var = (v00) obj;
        return this.d == v00Var.d && this.a == v00Var.a && this.c == v00Var.c && this.b == v00Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return fc.e(sb, this.d, '}');
    }
}
