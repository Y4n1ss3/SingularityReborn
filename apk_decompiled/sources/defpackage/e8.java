package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class e8 {
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final String e;

    public /* synthetic */ e8(int i, String str, String str2) {
        this(str, false, (i & 4) != 0 ? null : str2, false, null);
    }

    public static e8 a(e8 e8Var, String str, boolean z, String str2, boolean z2, String str3, int i) {
        if ((i & 2) != 0) {
            z = e8Var.b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            str2 = e8Var.c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            z2 = e8Var.d;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            str3 = e8Var.e;
        }
        str.getClass();
        return new e8(str, z3, str4, z4, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8)) {
            return false;
        }
        e8 e8Var = (e8) obj;
        return q10.b(this.a, e8Var.a) && this.b == e8Var.b && q10.b(this.c, e8Var.c) && this.d == e8Var.d && q10.b(this.e, e8Var.e);
    }

    public final int hashCode() {
        int c = kp0.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int c2 = kp0.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return c2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "AppItemState(status=" + this.a + ", isProcessing=" + this.b + ", currentVersion=" + this.c + ", hasUpdate=" + this.d + ", latestVersion=" + this.e + ")";
    }

    public e8(String str, boolean z, String str2, boolean z2, String str3) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
        this.e = str3;
    }
}
