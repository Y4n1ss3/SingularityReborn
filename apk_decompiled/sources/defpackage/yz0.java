package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class yz0 {
    public final String a;
    public final String b;
    public final String c;

    public yz0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz0)) {
            return false;
        }
        yz0 yz0Var = (yz0) obj;
        return this.a.equals(yz0Var.a) && this.b.equals(yz0Var.b) && this.c.equals(yz0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder k = j50.k("LoftEnv(label=", this.a, ", pkg=", this.b, ", apkUrl=");
        k.append(this.c);
        k.append(")");
        return k.toString();
    }
}
