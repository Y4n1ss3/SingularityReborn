package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class b8 {
    public final String a;
    public final String b;
    public final String c;
    public final oy d;
    public final d8 e;
    public final String f;
    public final String g;

    public b8(String str, String str2, String str3, oy oyVar, String str4, String str5, int i) {
        d8 d8Var = (i & 16) != 0 ? d8.d : d8.f;
        str4 = (i & 32) != 0 ? null : str4;
        str5 = (i & 64) != 0 ? null : str5;
        str3.getClass();
        oyVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = oyVar;
        this.e = d8Var;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        return this.a.equals(b8Var.a) && this.b.equals(b8Var.b) && q10.b(this.c, b8Var.c) && q10.b(this.d, b8Var.d) && this.e == b8Var.e && q10.b(this.f, b8Var.f) && q10.b(this.g, b8Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder k = j50.k("AppInfo(title=", this.a, ", description=", this.b, ", packageName=");
        k.append(this.c);
        k.append(", installAction=");
        k.append(this.d);
        k.append(", type=");
        k.append(this.e);
        k.append(", githubOwner=");
        k.append(this.f);
        k.append(", githubRepo=");
        k.append(this.g);
        k.append(")");
        return k.toString();
    }
}
