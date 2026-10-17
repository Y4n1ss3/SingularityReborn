package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class t70 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final ky e;

    public t70(String str, String str2, boolean z, boolean z2, ky kyVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = kyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t70)) {
            return false;
        }
        t70 t70Var = (t70) obj;
        return q10.b(this.a, t70Var.a) && q10.b(this.b, t70Var.b) && this.c == t70Var.c && this.d == t70Var.d && q10.b(this.e, t70Var.e);
    }

    public final int hashCode() {
        int c = kp0.c(kp0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        ky kyVar = this.e;
        return c + (kyVar == null ? 0 : kyVar.hashCode());
    }

    public final String toString() {
        StringBuilder k = j50.k("PayloadEntry(label=", this.a, ", description=", this.b, ", checked=");
        k.append(this.c);
        k.append(", enabled=");
        k.append(this.d);
        k.append(", onCheckedChange=");
        k.append(this.e);
        k.append(")");
        return k.toString();
    }
}
